# DCAE Universal VES Adapter

DCAE Universal VES Adapter is a micro-service consume snmp trap from dmaap topic and reads uploaded mapper file of the specific vendor, using SNMP mapper. After reading mapper file, converts snmp trap (JSON format) to VES format and publish on dmaap topic.


### Build Docker image

The following Maven command will build the mapper JAR, build the Docker image to the local machine registry and then push the same image to the specified remote registry.

```
mvn clean package docker:build -DpushImageTag
```

The image will be tagged with the project version found in the `pom.xml`.

### Run via Docker

Execute this to run.

```
docker run -p 8082:8080 <image_name>

```
 
 ### Access
 <host>:<expose port>/start