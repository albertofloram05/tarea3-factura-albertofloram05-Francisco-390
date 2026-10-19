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
· calcularDescuento(double base, boolean socio): calcula el descuento segun el importe de la factura y si el cliente es socio.

· aplicarIVA(double importe): calcula el importe final aplicando el IVA del 21 %.
- ¿Qué ventaja tiene frente al código anterior?
El codigo está mejor organizado y los metodos se pueden reutilizar en otras partes del programa.

## Reto 5 · ¿Qué lenguaje elegirías?
- Caso A (web de la tienda): Elegiría un lenguaje interpretado, como JavaScript, porque permite realizar los cálculos directamente en el navegador, sin necesidad de instalar un programa adicional en el ordenador del cliente. Los dos criterios serían

    - Coste de desarrollo: es fácil integrarlo en una página web y actualizar la calculadora sin tener que distribuir un programa nuevo. 
    - Portabilidad: los clientes pueden utilizarlos desde distintos dispositivos.

- Caso B (propuesta en ensamblador): No elegiría ensamblador, sino un lenguaje compilado, como C, porque ofrece un buen rendimiento sin aumentar innecesariamente la dificultad del desarrollo. 

    - Rendimiento: el código compilado puede ejecutarse muy rápido.
    - Coste de desarrollo: el ensamblador es más difícil de escribir, por lo que aumentaría el tiempo de desarrollo sin aportar una ventaja importante para este proyecto.

// Palabra del día: ________