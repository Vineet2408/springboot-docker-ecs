FROM openjdk:11
EXPOSE 8080
ADD target/sample-codebuild.jar sample-codebuild.jar
ENTRYPOINT ["java","-jar","/sample-codebuild.jar"]