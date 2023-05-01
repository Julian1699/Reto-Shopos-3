# Reto-3-Shopos
El presente proyecto es el desarrollo del reto número 3 de Sophos. Se realizó siguiendo el patrón de arquitectura de software Modelo-Vista-Controlador.

Para que el proyecto funcione sin problemas, se deben cambiar las credenciales de conexión a la base de datos en el archivo application.properties.

La base de datos con la que se trabajó es Oracle SQL:

![image](https://user-images.githubusercontent.com/132238891/235387041-e62a8c50-cd7f-4ac4-8987-c52fe2c59f7f.png)

NOTA: Después de configurada la base de datos, es necesario poner a correr el proyecto desde el método principal main():

![image](https://user-images.githubusercontent.com/114323630/235480259-7dc34060-47a5-44fe-8376-fa5b2cabbc9b.png)

NOTA: Cuando el proyecto haya iniciado sin ningún problema, las tablas deberían ser creadas automáticamente en la base de datos a la que se conectó, y estarán listas para introducir los scripts dentro del proyecto en el archivo .txt que está denominado con el nombre de "Inputs para poblar DB.txt".

![image](https://user-images.githubusercontent.com/114323630/235481920-811996e4-07f1-446d-87e4-3d426f1f0ed9.png)

Después de agregar los scripts en la base de datos, es necesario seleccionarlos todos para poder introducirlos en las tablas y luego escribir el comando "commit;" para que los datos se vean reflejados inmediatamente en el aplicativo.

Cuando la aplicación esté en ejecución y se desee inicializarla con algún botón, se redirigirá al usuario a la pantalla de inicio de sesión.

![Captura de pantalla 2023-05-01 100145](https://user-images.githubusercontent.com/114323630/235472961-1c7436c9-0da3-4bbf-928a-7dd8dff339de.jpg)

Entonces se muestra el siguiente login:

![image](https://user-images.githubusercontent.com/114323630/235472474-d66f26f8-f0a2-4b62-8752-1f52a461d8fb.png)

En el cual se puede acceder con dos roles: el rol de "admin", cuya clave es 123, y el rol de "usuario", cuya contraseña es 123.

Cuando se logea como admin se direcciona a la siguiente vista:

![Captura de pantalla 2023-05-01 101104](https://user-images.githubusercontent.com/114323630/235474448-586206cc-937d-44bf-a390-89ff27f0fcfa.jpg)

-Esta vista cuenta con los siguientes botones:

![Nomenclatura botones](https://user-images.githubusercontent.com/114323630/235476417-5260c1a5-709d-4477-9a3d-93294fceec68.jpg)

1) Con el botón 1 nos dirigimos al índice.
2) El botón 2 no tiene una función como tal, ya que indica el rol que ha accedido al aplicativo al hacer login.
3) Con el botón 3 podemos cerrar sesión e iniciar sesión con otro rol.
4) Con el botón 4 podemos agregar alumnos, cursos y profesores según los requerimientos.
5) Con el botón 5 podemos listar los alumnos, cursos y profesores.
6) La barra de búsqueda 6 sirve para realizar búsquedas de cualquier tipo en las listas de alumnos, cursos y profesores.
7) Con el botón 7 se da la orden de buscar los caracteres ingresados en la barra de búsqueda 6.
8) Con el botón 8 podemos regresar la lista a su estado original después de realizar una búsqueda.

-La siguiente vista se carga cuando se presiona el botón "Listar" y despliega una lista dependiendo de lo que se haya indicado listar (alumnos, profesores o cursos).

![Botones despues de listar](https://user-images.githubusercontent.com/114323630/235477868-78bf705f-4b5e-4732-a7cc-bd8c6f7007da.jpg)

9) Con el botón 9, ubicado en la parte superior derecha, se puede editar el alumno, curso o profesor seleccionado.
10) Con el botón 10 podemos ver detalles adicionales del alumno, curso o profesor.
11) Con el botón 11 podemos eliminar un alumno, curso o profesor.

