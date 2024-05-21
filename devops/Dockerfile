# Busco una imagen que me sirva como plantilla 
FROM openjdk:23-slim-bullseye
# Copio el nombre del archivo jar generado en la carpta build
COPY product.demo-0.0.1-SNAPSHOT.jar ./product.jar
# Permite ejecutar archivos específicos
CMD ["java", "-jar", "/product.jar"]