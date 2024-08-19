## Como executar
Compile usando docker buildx e depois execute com docker run, seguindo os exemplos a diante.

### Compilando com docker e gerando imagem
```
renatoexpert@ranger:~/dio/trilha_java_basico$ docker buildx build . -t dio
[+] Building 1.3s (9/9) FINISHED                                                                                      docker:default
 => [internal] load build definition from Dockerfile                                                                            0.0s
 => => transferring dockerfile: 147B                                                                                            0.0s
 => [internal] load metadata for docker.io/library/openjdk:24-slim-bullseye                                                     1.0s
 => [internal] load .dockerignore                                                                                               0.1s
 => => transferring context: 84B                                                                                                0.0s
 => [1/4] FROM docker.io/library/openjdk:24-slim-bullseye@sha256:b0099422f9b0bf96af22ea16f3bb6d7852a83611ed65f82d26027d59ae2a6  0.0s
 => [internal] load build context                                                                                               0.0s
 => => transferring context: 37B                                                                                                0.0s
 => CACHED [2/4] WORKDIR /src                                                                                                   0.0s
 => CACHED [3/4] COPY . .                                                                                                       0.0s
 => CACHED [4/4] RUN javac ContaBanco.java                                                                                      0.0s
 => exporting to image                                                                                                          0.0s
 => => exporting layers                                                                                                         0.0s
 => => writing image sha256:658d756003983d325384836a39c19c005ef0cfc3625e055a5cbf97c5552f1155                                    0.0s
 => => naming to docker.io/library/dio                                                                                          0.0s
```

### Executando com docker
```
renatoexpert@ranger:~/dio/trilha_java_basico$ docker container run -i dio
Bem vindo ao Shogun Bank!
Inserir número da conta: 7564734
Inserir agência: 123
Nome do cliente: Tanaka Silva
Saldo: 4052.20
Olá Sr Tanaka Silva, obrigado por criar uma conta em nosso banco!
Sua conta é 7564734, sua agência é 123 e seu saldo atual é 4052.200000
```

