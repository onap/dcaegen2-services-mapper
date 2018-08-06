FROM ubuntu:16.04

MAINTAINER as00500801@techmahindra.com

WORKDIR /opt/app/VESAdapter

ENV HOME /opt/app/VESAdapter

ENV JAVA_HOME /usr

RUN apt-get update && apt-get install -y \
        curl \
        vim \
        openjdk-8-jdk

COPY UniversalVesAdapter.jar /opt
COPY run.sh /opt

# EXPOSE 8080

#RUN ["chmod", "+x", "/opt/run.sh"]
CMD [ "/opt/run.sh" ]

