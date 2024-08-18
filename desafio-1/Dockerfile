FROM openjdk:24-slim-bullseye as compile
WORKDIR /src
COPY . .
RUN javac ContaBanco.java
CMD java ContaBanco

