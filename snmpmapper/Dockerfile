FROM ubuntu:16.04

WORKDIR /opt/app/SnmpMapper

ENV HOME /opt/app/SnmpMapper

ENV JAVA_HOME /usr

RUN apt-get update && apt-get install -y \
        curl \
        vim \
        openjdk-8-jdk


COPY snmpmapper.jar /opt/snmpmapper.jar

RUN bash -c 'touch /opt/snmpmapper.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/snmpmapper.jar"]

