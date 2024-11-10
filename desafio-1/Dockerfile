FROM openjdk:24-slim-bullseye as compile
WORKDIR /src
COPY . .
RUN javac VerificacaoServico.java
CMD java VerificacaoServico

