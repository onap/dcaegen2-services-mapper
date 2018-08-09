#!/bin/sh
java -jar /opt/UniversalVesAdapter.jar &
echo "Sleeping for 30 seconds to get application ready"
sleep 30s
echo"invoking curl"
curl -X GET http://localhost:8085/start
