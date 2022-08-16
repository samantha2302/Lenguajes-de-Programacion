package main

import (
	"fmt"
	"strings"
)

/*
	Lenguajes de Programacion
	Samantha Acunna Montero - 2021055077

	Haga programa que cuente e indique el número de caracteres, el número de palabras y el número de líneas
	de un texto cualquiera (obtenido de cualquier forma que considere). Considere hacer el cálculo de las
	tres variables en el mismo proceso.
*/

func Conteo(texto string) {
	lenghtTexto := len(texto)                  // Cuenta los caracteres de una palabra o parrafo
	palabras := strings.Split(texto, " ")      // Cuenta las palabras de un parrafo
	saltoDeLinea := strings.Count(texto, "\n") // Cuenta las lineas de un parrafo

	fmt.Println("Numero de caracteres: ", lenghtTexto)
	fmt.Println("Numero de palabras: ", len(palabras))
	fmt.Println("Numero de lineas: ", saltoDeLinea)
}

func main() {
	texto := "Los textos expositivos son conocidos como informativos en el ambito escolar.\n" +
		"La funcion primordial es la de transmitir informacion pero no se limita simplemente aproporcionar\n" +
		"datos sino que ademas agrega explicaciones, describe con ejemplos y analogias \n"
	print(texto)
	Conteo(texto)
}

/*
Los textos expositivos son conocidos como informativos en el ambito escolar.
La funcion primordial es la de transmitir informacion pero no se limita simplemente aproporcionar
datos sino que ademas agrega explicaciones, describe con ejemplos y analogias
Numero de caracteres:  254
Numero de palabras:  35
Numero de lineas:  3
*/
