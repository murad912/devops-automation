FROM openjdk:17
EXPOSE 8082
AND target/devops-integration.jar devops-integration.jar
ENTRYPOINT ["java","-jar","/devops-integration.jar"]
