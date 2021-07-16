FROM alpine:3.7
RUN apk update \
&& apk upgrade \
&& apk add --no-cache bash \
&& apk add --no-cache --virtual=build-dependencies unzip \
&& apk add --no-cache curl \
&& apk add --no-cache openjdk8-jre
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} MyprojectAssert.jar
ENTRYPOINT ["java","-jar","/MyprojectAssert.jar"]
