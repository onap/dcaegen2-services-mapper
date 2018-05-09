FROM java:8

MAINTAINER AS00500801@techmahindra.com

VOLUME /tmp

RUN rm -rf /tmp/*

#RUN cp -r public/dist/* www/

COPY maven/ /tmp

WORKDIR "/tmp"

RUN bash -c 'touch snmpmapper-0.0.1.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","snmpmapper-0.0.1.jar"]

