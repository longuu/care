#!/bin/bash
mvn clean package -DskipTests
mv ./target/care-1.0.jar /devop