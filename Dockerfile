FROM alpine/java:21-jdk
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
#docker  build -t  persona .
#docker run -p 8080:8080 persona
#docker login
#docker tag micro  persona/micro:latest
#docker push allamchz/pesona:latest