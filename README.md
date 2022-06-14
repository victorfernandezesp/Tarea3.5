# TEMA 3: DEPURACION Y PRUEBAS
## Tareas 3.5: Dapuracion y Pruebas
Tarea 3.5. Pruebas unitarias con jUnit. Tiempo
Mediante jUnit, realiza y entrega las pruebas unitarias sobre los métodos de la clase adjunta Tiempo. Entrega el resultado en el repositorio del módulo.

Recuerda enlazar correctamente en el repositorio dentro de la unidad didáctica y subcarpetas.

En las comprobaciones debes tener en cuenta (si detectas errores modificarás el código):

En nuestro sistema no se admiten periodos de tiempo negativo
Todos los periodos de tiempo han de estar normalizados: 
segundos y minutos <60
horas<24
para el desbordamiento de las horas debes crear el campo días
Con respecto a JUnit:

Antes de realizar cualquier prueba (@test) crea al menos dos objetos tiempo de Clase Tiempo
Recuerda comprobar: 
Cuando saltan excepciones (NullPointerException, CantidadNegativaException...) y cuándo no
Cuando se devuelve o no un null
Envía un pantallazo de la vista de pruebas todas pasadas correctamente
Documenta brevemente los cambios que has tenido que realizar en el código


Tarea 3.5 Pruebas_unitarias_con_JUnit_Tiempo CLASE
[Tarea 3.5 Pruebas_unitarias_con_JUnit_Tiempo](Tiempo.java/)

Tarea 3.5 Pruebas_unitarias_con_JUnit_Tiempo EXCEPCION
[Tarea 3.5 Pruebas_unitarias_con_JUnit_Tiempo](CantidadNegativaException.java/)

Tarea 3.5 Pruebas_unitarias_con_JUnit_Tiempo TEST
[Tarea 3.5 Pruebas_unitarias_con_JUnit_Tiempo](TiempoTest.java/)