<!--HEAD-->
# isa2024 - healtcalc

<details>
<summary>Práctica 1</summary>


## Objetivos
Se desea desarrollar una calculadora que permita estimar varios parámetros de salud de una persona, como su peso ideal o su tasa metabólica basal (TMB).
## Introducción
Se ha creado este repositorio para realizar la práctica 1, que consiste en realizar la ya nombrada calculadora para ello hemos hecho uso de git, github, de los entornos Maven y JUnits5.
### Contenidos a tener en cuenta
* idealWeight: Necesita los vaores de altura y género y su salida será el peso considerado Ideal
* basalMetabolicRate: Se necesita peso, altura, género y la edad del individuo, para así poder obtener el metabolismo ideal.

## Test utilizados en idealWeight():
* Test de altura negativa testAlturaNegativaIW() &rarr; comprobamos que cuando una altura es muy pequeña o incluso o negativa. Se lanza la excepción correctamente.

* Test de altura excesivamente pequeña testAlturaMenor() &rarr; comprobamos que cuando la altura es inferior a la altura promedio establecida que en este caso es de 110 para los hombre y 100 para las mujeres, se lanza la excepción correctamente.

* Test de Error a la hora de introducir el género testGenderProblemIW() &rarr; comprobamos que cuando añadimos un dato en el género distinto de W o M , sin tener en cuenta mayúsculas y minúsculas, se lanza la excepción con normalidad.

* Test para comprobar que la calculadora funciona con todos los casos de géneros disponibles CorrectGender() &rarr; comprobamos todas las posibles combinaciones de géneros para comprobar que ninguna de ellas lanza la excepción.

* Test para cuando la altura es superior a lo esperado testAlturaMayor()  &rarr; comprobamos que cuando la altura supera la altura máxima establecida por el programa (260 , puesto que el individuo más alto hasta la fecha que sigue con vida mide 251).

* Test de cálculo promedio de hombres HombrePromedioIW()  &rarr; usando los valores inferior y superior máximos que se pueden introducir y el valor promedio, comprobamos que los resultados obtenidos sean los esperados tanto en los límites inferior/superior como en el valor promedio.

* Test de cálculo promedio de mujeres testMujerPromedio() &rarr; usando los valores superiores e inferiores al igual que el valor medio comprobamos que los resultados de la calculadora sean los esperados.

## Test utilizados en basalMetabolicRate():
* Test para los pesos que no sean correctos PesoIncorrecto() &rarr; Se hacen 3 distintas comprobaciones, la primera es para cuando el valor del peso se da en negativo y se tienque lanzar excepción, la segunda es para cuando el valor del peso es inferior a lo delimitado en el rango, se lanza la excepción y la tercera es para cuando se excede el rango superior de peso y también se lanza la excepción.

* Test pra la altura incorrecta alturaIncorrecta() &rarr; Se hacen también 3 distintas comprobaciones, la primera de ellas es para cuando el valor dado sea en negativo, la segunda es para cuando el valor dado sea inferior al rango permitido, y la tercera  es para cuando el valor sea superior a lo permitido, en cualquira de los casos se comprueba que se lanza la excepción.

* Test para comprobar el Sexo IncorrectoSexo() &rarr; Se comprueba que cuando se introduzca un sexo que sea distinto de "M" o "W" sin tener en cuenta las máyusculas y minúsculas salte la excepción.

* Test de comprobación de sexos ComprobacionSexo() &rarr; Se comprueba que cuando se introducen de manera correcta las posibilidades de los sexos, no se lance ninguna excepción.

* Test para comprobar los valores promedios de la mujer testWomanBRM() &rarr; Se comprueba que tanto para el límite superior, como para el inferior, como para el el promedio de las mujeres se realicen bien los cálculos.

* Test para comprobar los valores promedios de los hombres testMenBMR()&rarr; Se comprueba tanto para el límite superior, como para el inferior, como para el valor promedio del hombre se obtiene el resultado esperado.

## Ejcución de los Test:
Para realizar la ejecución de maven en Visual Studio Code, tendremos que abrir la terminal y escribir el siguiente comando:
![Código usado](https://github.com/Rvbenrch/isa2024-healthcalc/blob/main/Captura%20de%20pantalla%202024-03-12%20181210.png)

Y hemos obtenido todos los test ejecutados de manera correcta:
![Obtención de los test](https://github.com/Rvbenrch/isa2024-healthcalc/blob/main/image.png)

## Repositorio desarrollado
Durante esta práctica hemos desarrollado un repositorio que, al principio de la misma no le realice las modificaciones y actalizaciones pertinentes, es por ello que tuve que repetir el proceso creandolo de nuevo para poder adjuntar los distintos commits cuando se desarrollaba cada una de las partes del proyecto. Este es el motivo por el cual las horas en repositorio son tan cercanas, puesto que ya contenía la información y la práctica realizada en otro proyecto de Visual Studio pero me vi obligado a repetirla.

---
Hemos usado esta metodología para ir registrando cada uno de los pasos realizados a lo largo del desarrollo de la práctica aunque considero que en estos casos, dónde la práctica es relativamente corta no sería preciso hacer demasiados commits.

---
![gitk](https://github.com/Rvbenrch/isa2024-healthcalc/blob/main/captura3.png)

Como podemos apreciar no ha habido ninguna necesidad de creación de ramas. Además como el proyecto se ha realizado de manera individual, debería de haberme servido para marcarme rumbo por el trabajo, sin embargo y debido a los problemas que he presentado. Las modificaciones de git las realicé en último lugar.

#### Trabajo realizado por RUBÉN M. RODRÍGUEZ CHAMORRO

</details>

<details>
<summary>Práctica 2</summary>


Para el desarrollo de esta práctica, hemos clonado el repostorio de nuevo en nuestro dispositivo de manera local. Hemos añadido los distintos branchs que expecificaban en el trabajo, de tal forma que el "anterior" main se ha convertido en tarea1 y hemos creado otra rama tarea2 dónde hemos desarrollado esta práctica.

### *Objetivos* 

El objetivo de la práctica era desarrollar un diagrama de casos de uso, para ello hemos hecho uso de la aplicación que usamos en la anterior asignatra de Softwarer Visual Paradigm. Pero en este caso y debido a que quería evitar fallos a la hora de licencias, he decidido usar la aplicación de manera online. Cabe destacar que no me ha dejado guardar el documento como tal y por ello sólo tengo las capturas de las imágenes.

### Primer Diagrama de Casos de Uso, básico.
En este diagrama hemos desarollado la cálculadora de manera básica contando con la información que se nos proporcionó en la práctica 1.

![](https://github.com/Rvbenrch/isa2024-healthcalc/blob/main/doc/CasosdeUso.png)

### Segundo Diagrama de Casos de Uso, dos casos de uso añadidos.
En este segundo diagrama he añadido los casos de uso del cálculo de IMC (Ìndice de Masa Corporal) y he añadido uno de necesidades calóricas.

![](https://github.com/Rvbenrch/isa2024-healthcalc/blob/main/doc/casosUsoAnadidos.png)

*- El índice de masa Corporal* 
Es una herramienta simple y utilizada para evaluar el estado de peso de una persona en relación con su altura. Se calcula dividiendo el peso peso en kilograos por el cuadrado de la altura en metros kg/m^2 . Los resultados pueden indicar el porcentaje de peso de la persona, o bien sobre peso o bien peso normal o peso bajo

*- Necesidades calóricas diarias*
Una vez que conocemos la TMB, podemos estimar las necesidades calóricas añadiendole un factor (que es desiganado por la edad) que estima cuánto de ejercicio en porcentaje a tu edad debes de realizar.

</details>

<details>
<summary>Práctica 3</summary>
# Práctica 3
## 🗒️ Descripción 

Para el desarrollo de la práctica 3, vamos a crearhistorias de usuario junto a sus distintos escenarios, además de realizar los criterios de aceptación utilizando BDD ( behavior-DrivenDevelopment) que nos ayuda a garantizar que se cumplen los requisitos de nuestro sistema.

## 📱 Historias de Usuario 

**- Historia de usuario: `IDEAL-WEIGHT`**
```
COMO    Usuario de health-Calculator, 
QUIERO  poder introducir los datos de género y altura a la calculadora 
PARA    calcular mi peso ideal.
```
**- Criterio de aceptación `IDEAL-WEIGHT`**
<details>
<summary>Introducción de datos de manera incorrecta ❌ </summary>

* Escenario: Introducción de altura incorrecta. 
```
DADO que tengo la Health-calc y soy usuario
CUANDO calculo el peso ideal con una altura negativa o igual a 0
ENTONCES el sistema genera una excepción guiándome para ingresar de manera correcta la altura.
```
* Escenario: Introducción de altura incorrecta. 
```
DADO que tengo la Health-calc y soy usuario
CUANDO introduzco un valor para la altura que excede el límite superior permitido
ENTONCES se genera un error de desbordamiento.
```
* Escenario: Introdución de género incorrecto. 

```
DADO que tengo la Helth-calc y soy usuario
CUANDO calculo el peso ideal con un género que es incorrecto
ENTONCES el sistema genera una excepción.
```
</details>

<details>
<summary>Peso ideal difiere de la realidad ❗</summary>

* Escenario: mostrar error cuando el peso ideal difiera de la realidad.
```
DADO que soy usuario y tengo la Health-calc
CUANDO ingreso mi género y altura en la calculadora y el peso ideal calculado es menor o igual a 0
ENTONCES la calculadora debería mostrar un mensaje de que el resultado es poco realista.
```
</details>
<details>
<summary> Parámetros válidos✅</summary>

* Escenario: Parámetros válidos 
```
DADO que tengo una Health-calc y soy usuario
CUANDO calculo el peso ideal para los parámetros válidos dados
ENTONCES el sistema devuelve un resultado válido.
```
</details>

---


**- Historia de usuario: `basalMetabolicRate`**
```
COMO    Usuario de health-Calculator, 
QUIERO  poder calcular la tasa metabólica basal según los parámetros ingresados 
PARA    poder conocer en que estado se encuentra la salud del usuario.
```

**- Criterio de aceptación `basalMetabolicRate`**
<details>
<summary>Introducción de datos de manera NO válidos ❌ </summary>

* Escenario: Intoducción de una altura no válida
```
DADO que tengo una Helth-calc y soy usuario
CUANDO calculo la tasa metabólica con altura negativa o inferior a los niveles mínimos
ENTONCES entonces el sistema lanzará una excepción.
```

* Escenario: Introducción de Género no válido.
```
DADO que tengo una Helth-calc y soy usuario
CUANDO calculo la tasa metabólica para un género que no es válido
ENTONCES entonces el sistema lanzará una excepción.
```

* Escenario: Introducción de Edad no válido.
```
DADO que tengo una Health-calc y soy usuario
CUANDO calculo la tasa metabólica para un usuario con edad negativa
ENTONCES entonces el sistema lanzará una excepción.
```
* Escenario: Introducción de Peso no válido.
```
DADO que tengo una Health-calc y soy usuario
CUANDO calculo la tasa metabólica para un usuario con peso negativo o igual a 0
ENTONCES entonces el sistema lanzará una excepción.
```
* Escenario: Introducción de resultado negativo para el Peso(solo para  mujeres)
```
DADO que tengo una Health-calc y soy usuario
CUANDO calculo la tasa metabólica para una mujer con una combinación de altura peso y edad que resulta en un peso negativo.
ENTONCES entonces el sistema lanzará una excepción.
```
</details>

<details>
<summary> Dando parámetros adecuados ✅ </summary>

* Escenario: Se dan parámetros aadecuados
```
DADO que tengo una Health-calc
CUANDO calculo la tasa basal metabólica para los parámetros válidos dados
ENTONCES el sistema devuelve un resultado válido.
```
</details>
</details>

<details>
<summary> Práctica 4 </summary>
Para el desarrollo de esta parte primero hemos diseñado un prototipo de cómo queríamos que se viese nuestra aplicación.

## Prototipo 🧐
![Prototipo](https://github.com/Rvbenrch/isa2024-healthcalc/blob/practica4/im_prototipo.jpg)

## Resultado Final 💯
![Prototipo](https://github.com/Rvbenrch/isa2024-healthcalc/blob/practica4/imfinal.jpg)

Y así quedaría el desarrollo final del diseño visual de la calculadora.

</details>

--- 
# Práctica 6

<details>
<summary> Singleton </summary>
Una vez hemos creado el nuevo branch de la práctica 6, vamos a implementar el método Singleton:
**Pasos para implementar el patrón Singleton:**
* Modificar HealthCalcImpl para implementar Singleton:
    - Crear una instancia estática privada de HealthCalcImpl.
    - Hacer el constructor privado.
    - Proveer un método público estático para obtener la instancia única.

* Actualizamos el método `Main` para poder usar la instancia Singleton
    - Actualizamos `HealthCalcImpl` con el patrón Singleton implementado.
    - Actualizamos el `Main` en la clase `HealthCalc` para poder usar esta instancia.

* Diagrama UML:
    - Para el desarrollo de este apartado he decidido utilizar la herramienta `draw.io`. 
    - En este diagrama:
        * HealthCalc es una interfaz con los métodos idealWeight y basalMetabolicRate.
        * HealthCalcImpl es una clase que implementa HealthCalc.
        * HealthCalcImpl tiene un constructor privado, una instancia estática privada y un método estático público getInstance para obtener la instancia única.

* **Conclusión Singleton** 

Hemos implementado el patrón Singleton en HealthCalcImpl, actualizado el Main para utilizar la instancia Singleton y proporcionado un esbozo del diagrama de clases UML.
</details>

![Texto alternativo](design_patterns/foto1_Singleton.png)


 ### **Patrones de diseño**
<details>
<summary> Apartado A / Hospital Costa del Sol </summary>

Para integrar la calculadora de salud en el sistema informático del Hospital Costa del Sol de Marbella y proporcionarles el servicio sin tener que volver a implementar los métodos, podemos aplicar el patrón de diseño `Adapter`.

El patrón Adapter permite que interfaces incompatibles trabajen juntas. En este caso, la interfaz HealthHospital proporcionada por el hospital y la interfaz HealthCalc que utilizamos en nuestra calculadora de salud son incompatibles en cuanto a los nombres y tipos de parámetros de los métodos.

El Adapter nos permite crear un adaptador que convierte las llamadas de la interfaz HealthHospital a llamadas de la interfaz HealthCalc y viceversa.

En este diagrama, HealthAdapter es la clase adaptadora que implementa la interfaz HealthHospital y utiliza una instancia de HealthCalc internamente para realizar los cálculos. Las llamadas a los métodos bmr y pesoIdeal de HealthHospital se convierten en llamadas a los métodos correspondientes de HealthCalc. La implementación de HealthAdapter se encarga de la conversión de parámetros según sea necesario.
</details>

![Texto alternativo](design_patterns/HospitalCostaSol.png)

<details>
<summary> Apartado B / HealthStats </summary>

Aplicaremos el patrón de diseño `Proxi`. Este patrón es adecuado porque nos permite añadir responsabilidades adicionales (como llevar un registro y calcular estadísticas) a un objeto (en este caso, nuestra calculadora de salud) de manera flexible y dinámica, sin modificar su estructura.

Para llevar a cabo este proceso, seguiremos los siguientes pasos:
* Definir la interfaz HealthStats.
* Crear una clase concreta que implemente HealthStats y que realice el proxy a nuestra calculadora.
* Actualizar el Main o cualquier cliente de la calculadora para utilizar esta nueva clase Proxy
</details>

![Texto alternativo](design_patterns/apartadoB.png)


<details>
    <summary> Apartado C / Idiomas</summary>

    
### Tareas Específicas
- Crear dos versiones de la calculadora BMR:

* Una que acepte altura en metros y peso en kilogramos.
* Otra que acepte altura en pies y peso en libras.
    
- Mostrar mensajes precisos en ambos idiomas:

El mensaje debe incluir detalles específicos de la persona (altura, peso, BMR).
Debe ser traducido correctamente al español y al inglés.
Asegurar la exactitud en las conversiones:

Para realizar la conversión del idioma se realizará desde la propia clase DecoratorCalc, para evitar crear clases en exceso y hacer demasiada compleja la calculadora.


</details>


![Texto alternativo](design_patterns/apartadoB.png)
