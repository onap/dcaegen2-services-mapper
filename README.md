# DCAE VES Adapter (Mapper)

# Summary
Different VNF vendors generates event and telemetry data in different formats. Out of the box all VNF vendors may not support ONAP VES format. This solution provides generic adapter(mapper) which can convert different formats of event and telemetry data to VES format which is needed by ONAP 	
 
This release supports only SNMP format. DCAE existing SNMP traps receiver are pushing SNMP traps (converted to json format) to DMaaP. DCAE Universal VES Adapter (mapper) micro-service consumes snmp trap from dmaap topic and reads uploaded mapper file (for the specific vendor). After reading mapper file, converts snmp trap (JSON format) to VES format and publish on dmaap topic.

ONAP DCAE VES Adapter (Mapper) is delivered with **2 Docker container** having spring boot mocroservices

## Compiling and Building Mapper

mapper (structured as a Maven project) uses the Maven tool to help compile, build, and deploy mapper Artifacts into a Maven Repository. In order to compile and build, a `mvn clean install` is executed, which checks for any errors and Java exceptions during compilation process.

## Getting the containers

ONAP DCAE Mapper containers are stored on [here] for the releases, and [here] for the snapshots

## Docker Containers 

ONAP DCAE VES Adapter (Mapper) is delivered with **2 Docker containers**,  both are spring boot mocroservices

The following Docker images are the actual deployment images used for running mapper:
**UniversalVesAdapter** and **snmpmapper**  

# Starting mapper

'mapper' solution is based on smokes framework which tranforms object model to another objet model. Here we transformed SNMP trap JSON format to VES JSON format

## snmpmapper  
For this release it accepts the mapper XML file and stores it locally. 
*** Aims to develop the functionality that creates mapping files for SNMP traps in SDC during VNF on-boarding process.
To be completed on next release ***

## UniversalVesAdapter
	Based on the sample mapper file <<snmpTrapToVes.xml>>, data tranformation will be done.
	sample file location: /UniversalVesAdapter/SampleofMappingFile/snmpTrapToVes.xml

Ther following steps are needed to deploy and start ONAP dcae mapper:

##  UniversalVesAdapter and snmpmapper containers can run together.
	- Start snmpmapper 
		- docker run -p 8081:8888 snmpmapper
		- <host>:<port>
	- Start UniversalVesAdapter
		- docker run -p 8082:8080 UniversalVesAdapter
		- <host>:<port>/start
	- Running mapper
		- UniversalVesAdapter service will listen to DMAAP <<topic>> to consume SNMP trap object
		- UniversalVesAdapter service will publish the tranformed VES object to DMAAP <<topic>> for other ONAP components to consume.
 
		
