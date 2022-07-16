# reto-tecnico
com.training.reto-tecnico

ESTACIÓN ESPACIAL SOFKA

Articulo:

https://moaramore.com/2016/05/14/clasificacion-de-las-naves-espaciales

## CONFIGURACION LOCAL

VERSION DE JDK               : Java JDK 11
IDE                          : IntelliJ IDEA Community Edition
SISTEMA CONTROL DE VERSIONES : GITHUB 

##bases de datos

NOMBRE: sofka_db_naves_clas
USER: root
SIN CONTRASEÑA DE BASES DE DATOS

##RUTAS

#LISTA TODAS LAS NAVES REGISTRADAS -> GET

	http://localhost:9090/reto/v1/api/spercraft/all

#BUSCA UN REGISTRO DE ACUERDO A SU ID -> GET

	http://localhost:9090/reto/v1/api/spercraft/{ID}
#EJEMPLO:
	http://localhost:9090/reto/v1/api/spercraft/1

#GUARDA UNA NAVE, RECIBE DATOS TIPO JSON ->POST

	http://localhost:9090/reto/v1/api/spercraft/save

#FORMATO JSON EJEMPLO:

{
    "name": "Saturno v",
    "activity": "1993-Act",
    "country": "EEUU",
    "fuel": "solido + Queroceno",
    "power": "45000"
}

#ELIMINA UN REGISTRO PASANDO EL ID DEL REGISTRO COMO PARAMETRO  ->DELETE

	http://localhost:9090/reto/v1/api/spercraft/delete/{ID}
#EJEMPLO:
	http://localhost:9090/reto/v1/api/spercraft/delete/1

#RETORNA STATUS 200 OK SI ELIMINA CORRECTAMENTE