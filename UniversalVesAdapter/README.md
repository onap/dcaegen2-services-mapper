# DCAE VES Adapter (Mapper)

# Summary
Different VNF vendors generates event and telemetry data in different formats. Out of the box all VNF vendors may not support ONAP VES format. The aim of this solution is to provide generic adapter(mapper) to VES which can convert different formats of event and telemetry data to VES format which is needed by ONAP. Currently supporting SNMP events JSON to VES	
 
This release supports only SNMP format. DCAE existing SNMP traps receiver are pushing SNMP traps (converted to json format) to DMaaP. DCAE Universal VES Adapter (mapper) micro-service consumes snmp trap from dmaap topic and reads uploaded mapper file (for the specific vendor). After reading mapper file, converts snmp trap (JSON format) to VES format and publish on dmaap topic.

ONAP DCAE VES Adapter (Mapper) is delivered with **2 Docker container** having spring boot mocroservices, UniversalVesAdapter and snmpmapper. UniversalVesAdapter converts SNMP trap JSON to VES and snmpmapper is just helper application for uploading the mapping file to DB. 

### Build Instructions

This project is organized as a mvn project and has "org.onap.dcaegen2" as parent project. The build generate a jar and package into docker container. 

```
git clone https://gerrit.onap.org/r/p/dcaegen2/services/mapper.git
mvn clean install
```

### Build Docker image

The following Maven command will build the JAR, build the Docker image to the local machine registry and then push the same image to the specified remote registry.

```
mvn clean package docker:build -DpushImageTag
```


### Run via Docker

Execute this to run.

####UniversalVesAdapter

```
 sudo docker run -d -p 8085:8085/tcp -e URL_JDBC=jdbc:postgresql://10.53.172.138:5432/postgres -e JDBC_USERNAME=postgres -e JDBC_PASSWORD=root -e DMAAPHOST=10.53.172.156 -e CONSUL_HOST=10.53.172.109 -e HOSTNAME=static-dcaegen2-services-mua -e MR_DEFAULT_PORT_NUMBER=3904 -e CONFIG_BINDING_SERVICE=config_binding_service nexus3.onap.org:10003/onap/org.onap.dcaegen2.services.mapper.vesadapter.universalvesadaptor:latest
```

### Environment variables in Docker Container
Most of the configuration of how UniversalVesAdapter should be started and managed is done through environment variables.
Some of them are set during the image build process and some of them are defined manually or by
a particular deployment system.

Variables set manually / coming from deployment system:
- DMAAPHOST-should contain an address to DMaaP, so that event publishing can work
- MR_PORT - DMaaP Exposed Port
- URL_JDBC- JDBC URL
- JDBC_USERNAME- Username for DB user
- JDBC_PASSWORD-Password for DB user
- CONSUL_HOST - 
- CONFIG_BINDING_SERVICE - 
- HOSTNAME - 



### Docker file system layout
The main directory where all code resides in docker container
looks like this and is located in /opt/app/VESAdapter
```
<host>:/opt/app/VESAdapter# ls
Dockerfile  bin  conf  lib  logs
```
- bin contains startup script for running the application
- conf contains default mapping file inserted to DB (defaultSnmpMappingFile.xml) 
- lib contains all libraries that are pulled into the app during maven build
- logs contains application logs, DroppedEvents.log file contains invalid events which are drop during publishing events.


## How the application starts inside container
General flow goes like this
- Docker image is build, and it points run.sh as the entrypoint.
- run.sh calls the spring boot starter class which in turns calls VESAdapterInitializer 
- Here entry point will be depending on the deployment type, Getting configuration from docker env var or from CBS
  configures a bunch of things and starts the application in a separate process


```
nexus3.onap.org:10003/snapshots/onap/org.onap.dcaegen2.services.mapper.vesadapter.universalvesadaptor latest
```


### Deployment
For testing purpose, the docker image includes preset configuration which can be ran without DCAEGEN2 platform.


### Testing

 
```
STEPS FOR SETUP/TEST
1)	Get the VESAdapter image from Nexus
		docker pull nexus3.onap.org:10003/snapshots/onap/org.onap.dcaegen2.services.mapper.vesadapter.universalvesadaptor:latest
2)	Start the container (change the DMAAPHOST and MR_DEFAULT_PORT_NUMBER environment value to running DMAAP instance host as well DB Details as mention in Running locally part)
		
 sudo docker run -d -p 8085:8085/tcp -e URL_JDBC=jdbc:postgresql://10.53.172.138:5432/postgres -e JDBC_USERNAME=postgres -e JDBC_PASSWORD=root -e DMAAPHOST=10.53.172.156 -e CONSUL_HOST=10.53.172.109 -e HOSTNAME=static-dcaegen2-services-mua -e MR_DEFAULT_PORT_NUMBER=3904 -e CONFIG_BINDING_SERVICE=config_binding_service nexus3.onap.org:10003/onap/org.onap.dcaegen2.services.mapper.vesadapter.universalvesadaptor:latest

3)	Go inside container and tail /opt/app/VESAdapter/logs/vesadaper.log
4)	Post SNMP event JSON to DMaaP Topic ONAP-COLLECTOR-SNMPTRAP  
5) Subscribe to DMaaP topic unauthenticated.SEC_FAULT_OUTPUT you will get process VES JSON to this topic.		 
```
