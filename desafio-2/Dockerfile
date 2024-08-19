FROM openjdk:24-slim-bullseye as compile
WORKDIR /src
COPY *.java .
RUN javac ParametrosInvalidosException.java Contador.java -d /build
WORKDIR /build
COPY manifest.mf .
RUN jar cvfm desafio.jar manifest.mf *

FROM openjdk:24-slim-bullseye as run
WORKDIR /run
COPY --from=compile /build/desafio.jar .
CMD java -jar desafio.jar

