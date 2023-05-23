FROM openjdk:17-alpine
WORKDIR /app
COPY . .
RUN ./mvnw package -DskipTests
CMD ./mvnw spring-boot:run
