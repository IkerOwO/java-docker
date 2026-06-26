# Imagen base
FROM openjdk:17-ea-17-jdk-slim

# Directorio de trabajo dentro del container
WORKDIR /app

# Copiamos todo
COPY /src .

# Corremos el comando 'javac' para que compile a un .class
RUN javac App.java

# Ejecutamos el archivo App con el comando "java"
CMD [ "java", "App" ]
