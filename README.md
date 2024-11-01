# Parcial 2 

## Instalación y Ejecución
Las siguientes instrucciones son para ejecutar el proyecto de forma local. El primer paso es instalar java, git y maven en su equipo con las siguientes versiones:

* Apache Maven 3.9.6

* Java 17
 
después de esto clonar el repositorio desde la terminal de la siguiente manera:

```
git clone https://github.com/Knight072/AREP-Parcial2.git
```

* Para ejecutar la aplicación nos dirigimos a cada carpeta para compilar el proyecto y ejecutarlo
  
* * Para ejecutar el proxy nos dirigimos a la carpeta AREP-Parcial2Proxy, primero compilamos y luego ejecutamos, la cual correra por el puerto 8080: http://localhost:8080
 ```
mvn clean install
```

```
java -jar target/AREP-Parcial2-1.0.jar
```
* * Para ejecutar los servicios nos dirigimos a la carpeta AREP-Parcial2Search, primero compilamos y luego ejecutamos, la cual correra por el puerto 8081 o 8082 según como se especifique el puerto, los dos servicios de busqueda se encuentran funcionando:
```
mvn clean install
```

```
java -jar target/AREP-Parcial2LinearSearch-1.0-SNAPSHOT.jar --server.port=8082

```
![image](https://github.com/user-attachments/assets/13769bd5-a283-440c-aeee-e5b887f5f22d)

Por último, se ingresa desde un Browser a la dirección http://localhost:8080 para interactuar con la aplicación web.

## Alcance de la entrega

- El proxy hace petición al servicio de busqueda linear.
- El proyecto esta estructurado por carpetas. Hay una para el proxy y otra para el servicio de busqueda linear.
- El servicio de busqueda linear corre por el puerto 8081 y el proxy por el 8080
  ![image](https://github.com/user-attachments/assets/6c2e10d8-8c64-442d-80bb-7705ccf16ffe)

  ![image](https://github.com/user-attachments/assets/80ac3752-e33e-44a4-b87e-53df67bc7a14)

## Modificación

### Cliente Funcionando
![image](https://github.com/user-attachments/assets/0012ac50-fda0-47cc-b4ad-ca298f9ab3f0)

### BinarySearch Funcionando
![image](https://github.com/user-attachments/assets/ff1a5670-c30e-455c-91bb-65fe6741af16)

### LinearSearch Funcionando
![image](https://github.com/user-attachments/assets/e1d338cf-1987-4ab8-b540-388613236643)

### RoundRobin Implementado
![image](https://github.com/user-attachments/assets/ea7242bc-4338-47e2-b366-03ee4861a0a3)

### Despliegue Proxy
![image](https://github.com/user-attachments/assets/d29d1ffe-5618-4d76-9205-e21da8f6d3b7)

### Despliegue MathService puerto 8081
![image](https://github.com/user-attachments/assets/dd146ee1-a363-44bd-9423-f28db1249529)

### Despliegue MathService puerto 8082
![image](https://github.com/user-attachments/assets/c46209e8-52e7-4cbe-b663-897195c34f98)

### Video Demostrativo de Despliegue y Funcionamiento
https://youtu.be/3S-XArPS9jY


