# Lenguajes de Programación
Ejercicios de la semana 2 de Lenguajes de Programación

## Ejercicio 1
  Haga un programa que cuente e indique el número de caracteres, el número de palabras y el número de líneas de un texto cualquiera (obtenido de cualquier forma que considere). Considere hacer el cálculo de las tres variables en el mismo proceso
``` .go
  func Conteo(texto string)
```

<p align='center'>
<img src="https://res.cloudinary.com/dgm059qwp/image/upload/v1660436296/Lenguajes%20de%20Programacion/Semana%201/Ejercicio1_qcjskb.png" width="1200"
</p>

## Ejercicio 3
  Escriba una función que permita rotar una secuencia de elementos N posiciones a la izquierda o a la derecha según sea el caso en función al parámetro que se reciba. Los parámetros deben ser un puntero a un arreglo previamente creado, la cantidad de movimiento de rotación y la dirección (0 = izq y 1 = der) <br>
  A partir de esta función, escriba un programa que haga varias rotaciones cualesquiera de una secuencia de elementos previamente creada que sea inmutable. Al final debe imprimirse el resultado de cada rotación además de la secuencia original. <br>
Un ejemplo de rotación puede ser el siguiente:
* Secuencia Original = [a, b, c, d, e, f, g, h,]
* Cantidad de rotaciones = 3
* Dirección = izq
* Secuencia final rotada = [d, e, f, g, h, a, b, c]
Nótese que cada iteración, el elemento más a la izquierda pasó a formar parte del final de la secuencia, si la rotación fuera a la derecha, sería lo contrario
``` .go
func rotarIzquierda(slice *[10]string, cantidadRotaciones int)
```
``` .go
func rotarDerecha(slice *[10]string, cantidadRotaciones int)
```
<p align='center'>
<img src="https://res.cloudinary.com/dgm059qwp/image/upload/v1660614644/Lenguajes%20de%20Programacion/Semana%201/Ejercicio3_mccx0w.png" width="1300"
</p>

## Ejercicio 4 
  Escriba un programa que utilice una estructura y un arreglo/slice para almacenar en memoria un inventario de una tienda que vende zapatos. Cada zapato debe contar con la información de su modelo (marca), su precio y la talla de este que debe ir únicamente del 34 al 44. La estructura debe llamarse "calzado". El programa debe poder almacenar la información “quemada” para 10+ zapatos del inventario y un stock de N cantidad de unidades de dicho zapato (quiere decir por ejemplo que puede existir en inventario el zapato marca Nike, talla 42 y que cuesta 50000 colones, pero además que puede existir no solo un par de esos, si no N pares del mismo zapato).

Haga una función que venda zapatos (eliminando del stock cada vez que haya venta e indicando que no se puede vender porque ya o hay stock) y pruébela dentro del main haciendo las ventas que usted considere para demostrar su funcionamiento.

<p align='center'>
<img src="https://res.cloudinary.com/dgm059qwp/image/upload/v1660522942/Lenguajes%20de%20Programacion/Semana%201/Ejercicio4_fmdd01.png" width="1200"
</p>
