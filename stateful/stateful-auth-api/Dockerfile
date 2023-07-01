FROM openjdk:17-alpine
COPY target/stateful-auth-api-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]

# FROM - Ele vai utilizar a imagem que eu passar aqui, no caso a openjdk:17-alpine
# COPY - Ele vai pegar o meu jar onde passei o caminho e colocar pra ser o app.jar lá dentro do container
# EXPOSE - Ele vai expor o meu container na porta que eu específicar aqui, no caso a 8080
# ENTRYPOINT - Ele vai executar cada elemento do array como uma palavra no terminal, nesse caso ele vai
    # executar o comando java -jar app.jar

# Comando pra construir a imagem que colocamos aqui no Dockerfile
# docker image build -t stateful-auth-api .

# Comando pra construir o container da imagem que criamos.
# docker container run --name stateful-auth-api -p 8082:8082 --network auth-types_auth -e "DB_HOST=stateful-auth-db"
    # -e "DB_PORT=5432" -e "DB_NAME=auth-db" -e "PORT=8082" stateful-auth-api