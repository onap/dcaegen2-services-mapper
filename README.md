# DCAE VES Adapter (Mapper)

## Summary
Different VNF vendors generates event and telemetry data in different formats. Out of the box all VNF vendors may not support ONAP VES format. This solution provides generic adapter(mapper) which can convert different formats of event and telemetry data to VES format which is needed by ONAP 	
 
This release supports only SNMP format. DCAE existing SNMP traps receiver are pushing SNMP traps (converted to json format) to DMaaP. DCAE Universal VES Adapter (mapper) micro-service consumes snmp trap from dmaap topic and reads uploaded mapper file (for the specific vendor). After reading mapper file, converts snmp trap (JSON format) to VES format and publish on dmaap topic.


### Build Docker image

ONAP DCAE VES Adapter (Mapper) is delivered with **2 Docker containers**,  both are spring boot mocroservices

To build Docker images please refer readme.md from UniversalVesAdapter and snmpmapper projects

