package main

import "fmt"

/*
	Lenguajes de Programacion
	Samantha Acunna Montero

	Escriba un programa que utilice una estructura y un arreglo/slice para almacenar en memoria un inventario de una tienda que vende zapatos. Cada
	zapato debe contar con la información de su modelo (marca), su precio y la talla de este que debe ir únicamente del 34 al 44. La estructura debe llamarse
	"calzado". El programa debe poder almacenar la información “quemada” para 10+ zapatos del inventario y un stock de N cantidad de unidades de dicho zapato
	(quiere decir por ejemplo que puede existir en inventario el zapato marca Nike, talla 42 y que cuesta 50000 colones, pero además que puede existir no solo un par de esos,
	si no N pares del mismo zapato).

	Haga una función que venda zapatos (eliminando del stock cada vez que haya venta e indicando que no se puede vender porque ya o hay stock) y pruébela dentro
	del main haciendo las ventas que usted considere para demostrar su funcionamiento.

*/
type Calzado struct { // Estructura para zapatos
	marca    string
	talla    int
	precio   int
	cantidad int
}

type listaCalzado []Calzado // Lista de calzados

var lCalzado listaCalzado

// Agrega los calzados a la lista
func (calzado *listaCalzado) agregarCalzadomarca(marca string, talla int, precio int, cantidad int) {
	if talla >= 34 && talla <= 42 {
		lCalzado = append(lCalzado, Calzado{marca, talla, precio, cantidad})
	} else {
		fmt.Println("Las tallas tiene que ir de 34 a 44")
	}
}

// Busca en la lista un calzado cualquiera, de forma que retorna -1 si no encuentra la marca del calzado que desea
func (calzado *listaCalzado) buscarCalzado(marca string) int {
	var result = -1
	var i int
	for i = 0; i < len(*calzado); i++ {
		if (*calzado)[i].marca == marca {
			result = i // Guarda cuantos calzados de la marca deseada hay.
		}
	}
	return result
}

// Vende los calzados a deseasr
func (calzado *listaCalzado) venderCalzado(marca string, talla int, cantidad int) {
	calzadoVendido := calzado.buscarCalzado(marca)
	if calzadoVendido != -1 && cantidad > 0 {
		if (*calzado)[calzadoVendido].cantidad > cantidad && (*calzado)[calzadoVendido].talla == talla {
			(*calzado)[calzadoVendido].cantidad = (*calzado)[calzadoVendido].cantidad - cantidad
			println("Calzado: ", (*calzado)[calzadoVendido].marca, " y talla: ", (*calzado)[calzadoVendido].talla, "se vendio con exito")
			fmt.Println(lCalzado)
		} else {
			calzado.eliminarProducto()
			println("Calzado: ", (*calzado)[calzadoVendido].marca, " y talla: ", (*calzado)[calzadoVendido].talla, "no se vendio con exito ya que no hay cantidad suficiente")
		}
	}
}
// Elimina los calzados cuales su cantidad es cero
func (lista *listaCalzado) eliminarProducto() {
	var i int
	for i = 0; i < len(*lista); i++ {
		if (*lista)[i].cantidad == 0 {
			*lista = append((*lista)[:i], (*lista)[i+1:]...)
			println("Calzado Eliminado")
		}
	}
	fmt.Println(lCalzado)
}

// Cargar datos
func tienda() {
	lCalzado.agregarCalzadomarca("Nike", 34, 50000, 6)
	lCalzado.agregarCalzadomarca("Converse", 36, 50000, 14)
	lCalzado.agregarCalzadomarca("Adidas", 37, 45000, 10)
	lCalzado.agregarCalzadomarca("Nike", 38, 50000, 10)
	lCalzado.agregarCalzadomarca("Adidas", 38, 50000, 5)
	lCalzado.agregarCalzadomarca("Puma", 39, 50000, 10)
	lCalzado.agregarCalzadomarca("Converse", 40, 70000, 0)
	lCalzado.agregarCalzadomarca("Converse", 41, 55000, 3)
	lCalzado.agregarCalzadomarca("Puma", 41, 50000, 7)
	lCalzado.agregarCalzadomarca("Puma", 42, 50000, 20)
	lCalzado.agregarCalzadomarca("Nike", 42, 45000, 5)

}

func main() {
	tienda()
	lCalzado.venderCalzado("Puma", 42, 5)
	lCalzado.venderCalzado("Nike", 42, 3)
	lCalzado.venderCalzado("Converse", 40, 3)
}

/*
Calzado:  Puma  y talla:  42 se vendio con exito
[{Nike 34 50000 6} {Converse 36 50000 14} {Adidas 37 45000 10} {Nike 38 50000 10} {Adidas 38 50000 5} {Puma 39 50000 10} {Converse 40 70000 0} {Converse 41 55000 3} {Puma 41 50000 7} {Puma 42 50000 15} {Nike 42 45000 5}]
Calzado:  Nike  y talla:  42 se vendio con exito
[{Nike 34 50000 6} {Converse 36 50000 14} {Adidas 37 45000 10} {Nike 38 50000 10} {Adidas 38 50000 5} {Puma 39 50000 10} {Converse 40 70000 0} {Converse 41 55000 3} {Puma 41 50000 7} {Puma 42 50000 15} {Nike 42 45000 2}]
Calzado:  Converse  y talla:  41 no se vendio con exito ya que no hay cantidad suficiente
*/
