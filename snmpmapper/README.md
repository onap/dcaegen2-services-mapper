# SNMP Mapper

# Summary
snmpmapper is just helper application for uploading the mapping file to DB. Here simple web page is given to upload file in DB 

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

####snmpmapper

```
 sudo docker run -d -p 8084:8080/tcp -e URL_JDBC=jdbc:postgresql://10.53.172.138:5432/postgres -e JDBC_USERNAME=postgres -e JDBC_PASSWORD=root -e DMAAPHOST=10.53.172.156 -e CONSUL_HOST=10.53.172.109 -e HOSTNAME=static-dcaegen2-services-msnmp -e MR_DEFAULT_PORT_NUMBER=3904 -e CONFIG_BINDING_SERVICE=config_binding_service nexus3.onap.org:10003/onap/org.onap.dcaegen2.services.mapper.snmpmapper:latest
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
- CBS_PROTOCOL - Config Binding Service protocol by default set to **http**, if it is need to change it then that can be set to different value
- CONFIG_BINDING_SERVICE - 
- HOSTNAME -



### Docker file system layout
The main directory where all code resides in docker container
looks like this and is located in /opt/app/VESAdapter
```
<host>:/opt/app/SnmpMapper# ls
Dockerfile  bin  lib  logs
```
- bin contains startup script for running the application
- lib contains all libraries that are pulled into the app during maven build
- logs contains application logs

```nexus3.onap.org:10003/snapshots/onap/org.onap.dcaegen2.services.mapper.vesadapter.snmpmapper:latest
```
