FROM eclipse-temurin:17-jre-alpine

RUN apk upgrade -U --ignore alpine-baselayout --no-cache
RUN apk add --no-cache tzdata
RUN echo America/Sao_Paulo > /etc/timezone
RUN cp /usr/share/zoneinfo/America/Sao_Paulo /etc/localtime
RUN apk del tzdata

ADD /target/*.jar  /app.jar


EXPOSE 3021
EXPOSE 3022

CMD echo "The application will starting now..." && \
      java \
      -Djava.security.egd=file:/dev/./urandom \
      ${JAVA_OPTS} \
      -jar /app.jar
