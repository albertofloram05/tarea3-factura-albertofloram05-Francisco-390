# Tarea 3 · La factura bajo el microscopio
Pareja: (Alberto Florido) y (Francisco Martinez) · GitHub: (albertofloram05), (Francisco-390)

## Reto 1 · Compilar desde la terminal
- Comando usado y resultado (captura: capturas/reto1.png)
- ¿Qué es Factura.java? ¿Y Factura.class? ¿Quién ejecuta el .class?
- ¿Por qué no se ha generado Factura.class la primera vez?

Factura.java es el archivo de código fuente del programa. Contiene las instrucciones que he escrito en lenguaje Java y que todavía deben compilarse para que el ordenador pueda ejecutarlas.

Factura.class es el archivo que se genera al compilar el código Java. Contiene el bytecode, unas instrucciones intermedias que la máquina virtual de Java puede interpretar o ejecutar.

El .class lo ejecuta la JVM (Java Virtual Machine), también llamada máquina virtual de Java. Se encarga de ejecutar el bytecode para que el programa funcione en el ordenador.

El archivo Factua.class no se ha generado porque el código contiene varios errores que impiden compilarlo correctamente.

## Reto 2 · Errores de compilación
| Nº | Línea | Mensaje de javac                               | Tipo (léxico / sintaxis / semántica) | Corrección                              |
|----|-------|------------------------------------------------|--------------------------------------|-----------------------------------------|
| 1  | 15    | Factura.java:15: error: illegal character: '#' | Léxico                               | double precio = sc.nextDouble();        |
| 2  | 17    | Factura.java:17: error: ';' expected           | Sintactico                           | int cantidad = sc.nextInt();            |
| 3  | 29    | Factura.java:29: error: incompatible types:    | Semántico                            | double total = (base - descuento)       |    
|    |       | possible lossy conversion from double to int   |                                      | * (1 + IVA);                            |

Captura del programa funcionando: capturas/reto2.png

## Reto 3 · Depuración del error lógico
| Variable | Valor esperado | Valor real |
|----------|----------------|------------|
| descuento |      18       |     12     |
| total     |    123,42     |   137,94   |
- Línea del error y explicación: La línea del error es la 27, esto es debido a que, en vez de acumularse el descuento, sustituye directamente el valor del descuento anterior con el actual.
- Corrección: descuento += base * 0.05;
- Mi propia prueba (producto, precio, cantidad, socio → total): producto = "Sartén", precio = 25,99, cantidad = 2, socio = "s" --> total = 57,75
Captura del depurador: capturas/reto3.png

## Reto 4 · Reutilización
- Métodos creados y para qué sirve cada uno:
- ¿Qué ventaja tiene frente al código anterior?

## Reto 5 · ¿Qué lenguaje elegirías?
- Caso A (web de la tienda):
- Caso B (propuesta en ensamblador):