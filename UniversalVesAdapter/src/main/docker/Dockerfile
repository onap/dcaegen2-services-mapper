FROM nexus3.onap.org:10001/onap/integration-java11:9.0.0

ENV HOSTALIASES /etc/host.aliases

ARG user=VESAdapter
ARG group=VESAdapter

USER root
WORKDIR /opt/app/VESAdapter

RUN apk --no-cache update && apk --no-cache upgrade && apk add --upgrade procps && apk add --no-cache vim && apk --no-cache add curl && \
    addgroup $group && adduser --system --disabled-password --no-create-home --ingroup $group $user && \
    chown -R $user:$group /opt/app/VESAdapter && \
    chmod -R u+rw /opt/app/VESAdapter/

USER  $user

COPY --chown=$user:$group /. /opt/app/VESAdapter/

RUN chmod +x bin/run.sh

EXPOSE 8080 8443

ENTRYPOINT ["bin/run.sh"]
