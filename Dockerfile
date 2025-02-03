# Build stage
FROM gradle:8-jdk21 AS builder
WORKDIR /app
COPY . .
RUN gradle bootWar

#Run state
FROM tomcat:10-jdk21
LABEL authors="Kevin"

COPY --from=builder /app/build/libs/ROOT.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]

