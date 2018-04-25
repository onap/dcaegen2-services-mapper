# DCAE SNMP Mapper

DCAE SNMP mapper is a micro-service to upload the vendor specific mapper file into the database


### Build Docker image

The following Maven command will build the mapper JAR, build the Docker image to the local machine registry and then push the same image to the specified remote registry.

```
mvn clean package docker:build -DpushImageTag
```

The image will be tagged with the project version found in the `pom.xml`.

### Run via Docker

Execute this to run.


```
docker run -p 8081:8888 <image_name>

```
 
 ### Access
 <host>:<expose port>
 