FROM openjdk:15
LABEL maintainer="Vinay_Harke"
ADD target/springbootcourse-0.0.1-SNAPSHOT.jar springbootcourse.jar
ENTRYPOINT ["java","-jar","springbootcourse.jar"]