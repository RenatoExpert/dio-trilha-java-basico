## Como executar
Compile usando docker buildx e depois execute com docker run, seguindo os exemplos a diante.

### Compilando com docker e gerando imagem
```
renatoexpert@ranger:~/dio/trilha_java_basico/desafio-2$ docker buildx build . -t dio
[+] Building 1.4s (14/14) FINISHED                                                                                    docker:default
 => [internal] load build definition from Dockerfile                                                                            0.1s
 => => transferring dockerfile: 367B                                                                                            0.0s
 => [internal] load metadata for docker.io/library/openjdk:24-slim-bullseye                                                     1.1s
 => [internal] load .dockerignore                                                                                               0.0s
 => => transferring context: 84B                                                                                                0.0s
 => [compile 1/7] FROM docker.io/library/openjdk:24-slim-bullseye@sha256:b0099422f9b0bf96af22ea16f3bb6d7852a83611ed65f82d26027  0.0s
 => [internal] load build context                                                                                               0.1s
 => => transferring context: 118B                                                                                               0.0s
 => CACHED [run 2/3] WORKDIR /run                                                                                               0.0s
 => CACHED [compile 2/7] WORKDIR /src                                                                                           0.0s
 => CACHED [compile 3/7] COPY *.java .                                                                                          0.0s
 => CACHED [compile 4/7] RUN javac ParametrosInvalidosException.java Contador.java -d /build                                    0.0s
 => CACHED [compile 5/7] WORKDIR /build                                                                                         0.0s
 => CACHED [compile 6/7] COPY manifest.mf .                                                                                     0.0s
 => CACHED [compile 7/7] RUN jar cvfm desafio.jar manifest.mf *                                                                 0.0s
 => CACHED [run 3/3] COPY --from=compile /build/desafio.jar .                                                                   0.0s
 => exporting to image                                                                                                          0.0s
 => => exporting layers                                                                                                         0.0s
 => => writing image sha256:32c1310410a9b69774ef2b92e8f1a8c6050d6a99619072d6d7896729ae15f2f7                                    0.0s
 => => naming to docker.io/library/dio                                                                                          0.0s
```

### Executando com docker
```
renatoexpert@ranger:~/dio/trilha_java_basico/desafio-2$ docker container run -i dio
Digite o primeiro parâmetro
20
Digite o segundo parâmetro
23
Imprimindo o numero 1
Imprimindo o numero 2
Imprimindo o numero 3
```

