# PRÁCTICA DE LABORATORIO 

**NOMBRE:** José Quinde

**CARRERA:** Computación

**ASIGNATURA:** Programación Aplicada

**NRO. PRÁCTICA:** 06	

**TÍTULO PRÁCTICA:** Manejo de Directorios y Archivos

## OBJETIVO ALCANZADO:
El objetivo de esta práctica es poder aprender a utilizar los archivos en jaca a través de la clase file, en este caso se ha creado un explorador de archivos en netbeans, en donde podemos manipular los archivos, y obtener la información de los mismos.
Cabe recalcar que solo se hecho el manejo de Directorios y el cómo crear archivos, aun no se puede manipular la información dentro de un archivo de texto.

## ACTIVIDADES DESARROLLADAS

**1.Crear un repositorio en GitHub**

**Perfil:** JoseQ1996

**URL del proyecto:** https://github.com/JoseQ1996/Manejo-de-Archivos-con-Rutas.git

-Se procedió a crear un repositorio con el nombre de Manejo de Archivos con Rutas

 ![image](https://user-images.githubusercontent.com/49071271/59163758-c4207880-8aca-11e9-9cd2-07542629b504.png)


**2. Sincronizar el repositorio creado con un proyecto en NetBeans. Realizar un commit y push por cada requerimiento de los puntos a continuación descritos (incluir un mensaje que identifique claramente los commits realizados a GitHub).**

-Se realizaron 7 commits en el proyecto

-Aquí se puede revisar los commits realizados y que hizo cada uno en específico.

![image](https://user-images.githubusercontent.com/49071271/59163770-ddc1c000-8aca-11e9-970a-1c536b5da5a6.png)

 
**3. Crear un paquete para las clases**

-Se procedió a crear solo un paquete de vista

![image](https://user-images.githubusercontent.com/49071271/59163785-119ce580-8acb-11e9-9a14-01009b3e417d.png)
 
**4. Crear clase en el paquete**

- Se proceido a crear una clase para la excepcion y un jFrame para la interfaz Gráfica.


![image](https://user-images.githubusercontent.com/49071271/59163788-1a8db700-8acb-11e9-9860-bdd06bd74736.png)

 
**5. Excepción De la Ruta No Existente.**

La excepción creada en este proyecto es la siguiente.
 
Esta excepción nos sirve para poder controlar la ruta ingresada, en el caso de que no exista nos dará un error con el mensaje “la ruta ingresada no existe”. 

![image](https://user-images.githubusercontent.com/49071271/59163790-20839800-8acb-11e9-81b1-f351ab9a0638.png)

**6. Ventana Principal**

-A continuación, se procederá a explicar el código de la Ventana Principal
 
 ![image](https://user-images.githubusercontent.com/49071271/59163815-6e989b80-8acb-11e9-989e-9c263126ca6d.png)

Esa es la Interfaz Grafica del programa.

A continuación se mostrara los componentes creados

![image](https://user-images.githubusercontent.com/49071271/59163826-7d7f4e00-8acb-11e9-92b0-3d1f5f9e43f7.png)
 
El programa también posee métodos creados, que se llamaran en diferentes acciones.

![image](https://user-images.githubusercontent.com/49071271/59163834-8cfe9700-8acb-11e9-9ccf-d59bfc97f513.png)
 
El método de Ingreso de listas lo que hace es leer la ruta ingresada en el TextField en este caso se llama txtRuta y luego lista los Directorios, Archivos y Ocultos para mostrarlos en las jList.

![image](https://user-images.githubusercontent.com/49071271/59163838-9982ef80-8acb-11e9-9b1b-d7dd0ce46d14.png)

Este método de tamaño de Directorio nos devuelve un leght con el tamaño total de todos los elementos que se encuentran dentro del directorio, es un método recursivo.

![image](https://user-images.githubusercontent.com/49071271/59163839-9d167680-8acb-11e9-809f-1873c05a77eb.png)

Este método nos elimina todos los archivos, carpetas dentro del directorio seleccionado, también es un método recursivo.

-Ahora veremos las acciones que hacen cada elemento

Por ejemplo, el botón Listar lo único que hace es llamar al evento ingresar Listas, este método es controlado con la excepción de ruta existente.

![image](https://user-images.githubusercontent.com/49071271/59163843-a30c5780-8acb-11e9-8c48-6400b4468578.png) 
 
El botón regresar lo que hace es regresar una carpeta atrás, para  poder desarrollar esto lo que hice es seleccionar la ruta actual y de ahí le fue recorriendo al String desde el final hasta el principio y cuando vea un “\\” que elimine toda esa selección y de ahí que reingrese la Lista así podemos listar por ejemplo:


La ubicación actual seria: C:\Users\Usuario\Documents\Universidad\UPS- Sistemas

Lo que hace el método es guardar en otro String auxiliar el texto que se encuentra antes del “\\”, en este caso lo que guardaría seria: \UPS- Sistemas

Y ahí elimina en la ruta Actual ese texto y quedaría así: C:\Users\Usuario\Documents\Universidad

Luego se settea eso en el txtRuta y ahí se manda de nuevo a llamar el Ingreso de Listas.
 

![image](https://user-images.githubusercontent.com/49071271/59163860-c59e7080-8acb-11e9-9192-2d9378929b02.png)

Para saber la información de los archivos, directorios y Ocultos es igual para los tres al interactuar con el jList, seleccionando uno se sabe el tamaño, ruta y la fecha de modificación, el único que tiene diferente es el jlist de los directorios ya que tiene un evento de mouseClicked para poder ingresar a las carpetas.
 
![image](https://user-images.githubusercontent.com/49071271/59163864-d5b65000-8acb-11e9-940b-8d1eae4f986f.png)

La Interfaz También posee un menú Ítem donde nos permitirá. 

Crear un archivo

Cambiar el nombre.

Crear un Directorio.

Eliminar un Archivo o Directorio.

![image](https://user-images.githubusercontent.com/49071271/59163871-e4046c00-8acb-11e9-9010-dbf3d97cca93.png)
 
Para crear un Archivo se utiliza el createNewFile ().

![image](https://user-images.githubusercontent.com/49071271/59163876-ea92e380-8acb-11e9-993a-8a37f3d6de3b.png)

Para renombrar se utiliza el renameTo ().

![image](https://user-images.githubusercontent.com/49071271/59163877-ed8dd400-8acb-11e9-9fba-a8a53ce78429.png)

Para crear un directorio se utiliza el mkdir ().
 
![image](https://user-images.githubusercontent.com/49071271/59163878-f1b9f180-8acb-11e9-9eac-a9e3df5fd0c1.png)

Para eliminar un archivo o directorio se utiliza el delete () en este caso se manda a llamar al método anteriormente creado para eliminar directorios con contenido.

## RESULTADO(S) OBTENIDO(S):

A continuación, se mostrarán capturas 
 
![image](https://user-images.githubusercontent.com/49071271/59163880-f67ea580-8acb-11e9-9b3b-94deb458af5c.png)
 
Al clickear en Juegos

![image](https://user-images.githubusercontent.com/49071271/59163889-19a95500-8acc-11e9-892b-19edd5ba4863.png)

Ahora creamos un directorio con nombre HOLA
 
![image](https://user-images.githubusercontent.com/49071271/59163891-20d06300-8acc-11e9-99ea-9473fbccc881.png)
![image](https://user-images.githubusercontent.com/49071271/59163892-262dad80-8acc-11e9-8c47-0e55e3a69394.png)

Luego ingresamos a esa carpeta y creamos tres archivos con el nombre 1, 2,3

![image](https://user-images.githubusercontent.com/49071271/59163895-2cbc2500-8acc-11e9-9e8c-a99a8f79f85d.png)
![image](https://user-images.githubusercontent.com/49071271/59163899-30e84280-8acc-11e9-8743-676eda24ab25.png)
 
Renombramos el archivo 1 en letras uno.

![image](https://user-images.githubusercontent.com/49071271/59163902-36de2380-8acc-11e9-9146-21ea54e9a004.png)

Eliminamos el archivo 2

![image](https://user-images.githubusercontent.com/49071271/59163908-3c3b6e00-8acc-11e9-8bcf-1a52aad1d603.png)
 
Ahora regresamos hasta JUEGOS
 
![image](https://user-images.githubusercontent.com/49071271/59163916-42314f00-8acc-11e9-89fa-e1c8e0d21a4c.png)

Y eliminamos la carpeta HOLA con contenido

![image](https://user-images.githubusercontent.com/49071271/59163927-6ee56680-8acc-11e9-9cbe-a5f06d2f35e1.png)

Así funciona el programa completo.

## CONCLUSIONES:

Se puede decir que el manejo de Directorios nos sirve para controlar las rutas absolutas y relativas, también nos enseñó el cómo utilizar la clase File () en java, y todos los métodos que posee tanto para crear archivos, como renombrarlos y eliminarlos.
También aprendimos a obtener la información de un archivo.

## RECOMENDACIONES:

Implementar la clase File para poder realizar el manejo de Directorios y Archivos.

**Nombre de estudiante:** José Quinde

**Firma de estudiante:** 

![image](https://user-images.githubusercontent.com/49071271/59163938-8fadbc00-8acc-11e9-8e8a-0d0eebb7fcf9.png)

