package main

import "fmt"

/*
	Lenguajes de Programacion
	Samantha Acunna Montero - 2021055077

Escriba una función que permita rotar una secuencia de elementos N posiciones a la izquierda o a la derecha según
sea el caso en función al parámetro que se reciba. Los parámetros deben ser un puntero a un arreglo previamente
creado, la cantidad de movimiento de rotación y la dirección (0 = izq y 1 = der)
A partir de esta función, escriba un programa que haga varias rotaciones cualesquiera de una secuencia de
elementos previamente creada que sea inmutable. Al final debe imprimirse el resultado de cada rotación además de
la secuencia original.
Un ejemplo de rotación puede ser el siguiente:

	=>Secuencia Original = [a, b, c, d, e, f, g, h,]
	=>Cantidad de rotaciones = 3
	=>Dirección = izq
	=>Secuencia final rotada = [d, e, f, g, h, a, b, c]

Nótese que cada iteración, el elemento más a la izquierda pasó a formar parte del final de la secuencia, si la
rotación fuera a la derecha, sería lo contrario
*/

func rotarIzquierda(slice *[10]string, cantidadRotaciones int) {
	for rotaciones := 0; rotaciones < cantidadRotaciones; rotaciones++ {
		sliceDato := slice[0]
		for i := 0; i < len(slice); i++ {
			if i != 9 {
				slice[i] = slice[i+1]
			} else {
				slice[9] = sliceDato
			}
		}
	}
	fmt.Println(*slice)
}

func rotarDerecha(slice *[10]string, cantidadRotaciones int) {
	for rotaciones := 9; rotaciones > cantidadRotaciones; rotaciones-- {
		sliceDato := slice[9]
		for i := (len(slice)) - 1; i > -1; i-- {
			if i != 0 {
				slice[i] = slice[i-1]
			} else {
				slice[i] = sliceDato
			}
		}
	}
	fmt.Println(*slice)
}

func main() {
	cantidadRotaciones := 3
	direccionIzquierda := 0
	direccionDerecha := 1
	arreglo := [10]string{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}

	fmt.Println("Arreglo Original: ", arreglo)
	fmt.Println("Cantidad de rotaciones: ", cantidadRotaciones)
	fmt.Println("Direccion izquierda: ", direccionIzquierda)
	fmt.Println("Direccion derecha: ", direccionDerecha)

	println("------------------------------------------------------")
	fmt.Println("Arreglo Original: ", arreglo)
	fmt.Println("Direccion izquierda: ", direccionIzquierda) // 0
	rotarIzquierda(&arreglo, cantidadRotaciones)
	println("------------------------------------------------------")
	fmt.Println("Arreglo Original: ", arreglo)
	fmt.Println("Direccion derecha: ", direccionDerecha) // 1
	rotarDerecha(&arreglo, cantidadRotaciones)
}

/*
Arreglo Original:  [a b c d e f g h i j]
Cantidad de rotaciones:  3
Direccion izquierda:  0
Direccion derecha:  1
------------------------------------------------------
Arreglo Original:  [a b c d e f g h i j]
Direccion izquierda:  0
[d e f g h i j a b c]
------------------------------------------------------
Arreglo Original:  [d e f g h i j a b c]
Direccion derecha:  1
[h i j a b c d e f g]

*/
