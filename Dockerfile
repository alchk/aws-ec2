FROM maven:3.8.3-openjdk-17 as STAGE_1
COPY . .
RUN mvn -T 4C clean package --batch-mode

FROM openjdk:17.0.1-jdk-slim

COPY --from=STAGE_1 target/aws-ec2-0.0.1-SNAPSHOT.jar aws-ec2-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "${APP_NAME}-${APP_VERSION}-SNAPSHOT.jar"]