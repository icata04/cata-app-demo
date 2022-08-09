FROM openjdk:17
ADD target/cata-app-demo-0.0.1-SNAPSHOT.jar cata-app-demo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","cata-app-demo-0.0.1-SNAPSHOT.jar"]