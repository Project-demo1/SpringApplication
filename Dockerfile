FROM maven:latest
RUN mkdir app
COPY . /app
WORKDIR /app
RUN mvn clean package -Dmaven.test.skip=true
CMD mvn spring-boot:run
