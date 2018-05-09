FROM java:8

MAINTAINER AS00500801@techmahindra.com

VOLUME /tmp

RUN rm -rf /tmp/*

COPY UniversalVesAdapter-0.0.1.jar /tmp/UniversalVesAdapter-0.0.1.jar

WORKDIR "/tmp"

RUN bash -c 'touch UniversalVesAdapter-0.0.1.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","UniversalVesAdapter-0.0.1.jar"]

