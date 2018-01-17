#!/bin/bash

mvn clean spring-boot:run -Drun.profiles=dev -DskipTests $*
