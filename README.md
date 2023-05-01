# Reto-3-Shopos
El presente proyecto es el desarrollo del reto número 3 de sophos, se realizo siguiendo el patrón de arquitectura de software -> Modelo-Vista-Controlador.

Para que el proyecto funcione sin problemas se deben cambiar las credenciales de conexión a la base de datos, en el archivo application.properties.

La base de datos conn la que se trabajo es ORACLE SQL

![image](https://user-images.githubusercontent.com/132238891/235387041-e62a8c50-cd7f-4ac4-8987-c52fe2c59f7f.png)

NOTA!!!!: Depues de configurada la base de datos es necesario podener a correr el proyecto desde el metodo main principal:

![image](https://user-images.githubusercontent.com/114323630/235480259-7dc34060-47a5-44fe-8376-fa5b2cabbc9b.png)

NOTA!!!: Cuando el proyecto haya iniciado sin ningún problema las tablas debieron ser creadas en la basde de datos automaticamente en la base de datos que fue conectada y estara lista para introducir los scripts puesto dentro del proyectos, el archivo .txt que esta denominado con el nombre de (Inputs para poblar DB.txt).

![image](https://user-images.githubusercontent.com/114323630/235481920-811996e4-07f1-446d-87e4-3d426f1f0ed9.png)

Depues de agregar los scripts en la base de datos es necesario seleccionarlos todos para poder introducirlos en las tablas, y depues escribir el comando "commit;" para que los datos se vean reflejados inmenditamente en el aplicativo.

Cuando la aplicación esté en ejecución y se desee inicializarla con algún botón, se redirigirá al usuario a la pantalla de inicio de sesión.

![Captura de pantalla 2023-05-01 100145](https://user-images.githubusercontent.com/114323630/235472961-1c7436c9-0da3-4bbf-928a-7dd8dff339de.jpg)

Entonces se muestra el siguiente login:

![image](https://user-images.githubusercontent.com/114323630/235472474-d66f26f8-f0a2-4b62-8752-1f52a461d8fb.png)

En el cual se puede acceder con dos roles, el rol de "admin" cuya clave es: 123 y el rol de "usuario" cuya contraseña es: 123

-Cuando se logea como admin se direcciona a la siguiente vista:

![Captura de pantalla 2023-05-01 101104](https://user-images.githubusercontent.com/114323630/235474448-586206cc-937d-44bf-a390-89ff27f0fcfa.jpg)

-Esta vista con los siguientes botones:

![Nomenclatura botones](https://user-images.githubusercontent.com/114323630/235476417-5260c1a5-709d-4477-9a3d-93294fceec68.jpg)

1) Con el botón 1 nos direccionamos al index
2) Con el botón 2 no tiene una funció como tal, pues indica cual rol que haya accedido al aplicativao haciendo el login.
3) Con el botón 3 podemos cerrar sesión e iniciar con otro rol.
4) Con el botón 4 podemos agregar alumnos, cursos y profesores, dependiendo de los requerimientos.
5) Con el botón 5 podemos listar los alumnos, cursos y profesores.
6) Con el botón barra de busqueda 6 sirve para realizar busquedas de cualquier tipo en las listas de alumnos, cursos y profesores.
7) Con el boton 7 se le da la orden de buscar los caracteres ingresados en el botón 6.
8) Con el botón 8 podemos regresar la lista como estaba antes, cuando hayamos terminado de buscar.

-La siguiente vista se carga cuando el boton "Listar" es presionado y despliega una lista dependiendo de lo que se le haya indicado listar (alumnos, profesores o cursos)

![Botones despues de listar](https://user-images.githubusercontent.com/114323630/235477868-78bf705f-4b5e-4732-a7cc-bd8c6f7007da.jpg)

9) Con el botón 9 el parte superior derecha podemos editar el alumno, curso o profesor.
10) Con el botón 10 podemos ver detalles (más información del alumno, curso o profesor).
11) Con el botón 11 podemos eliminar un alumno, curso o profesor.


