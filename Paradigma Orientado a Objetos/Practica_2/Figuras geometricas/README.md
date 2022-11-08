# Lenguajes de Programación
- Ashley Samantha Acuña Montero - 2021055077

## Explicacion

1)	Realizar la implementación de un programa que emule un editor gráfico de documentos que admita el agrupamiento, lo cual es un concepto que se utiliza en toda una 
gama de editores gráficos. Suponer que el documento consta de varias hojas. Cada hoja contiene objetos representables, incluyendo textos, objetos geométricos y grupos. 
Un grupo es, simplemente, un conjunto de objetos representables, y que posiblemente hasta incluya a otros grupos. Los objetos geométricos pueden ser círculos, elipses, 
rectángulos, líneas y cuadrados.
Cree instancias para demostrar el uso exhaustivo de cada uno de los elementos del editor gráfico de documentos. Utilice ocultamiento de información y declare 
solo los get/set necesarios para su implementación


### Lo que imprime en consola

__________Circulo___________
Calcular area y perimetro de circulo
Area: 78
Perimetro: 31

El circulo tiene:
Medida del radio: 5
Perimetro: 31
Area: 78
______________Cuadrado________________
Calcular area y perimetro de cuadrado
Area: 25
Perimetro: 20

El cuadrado tiene: 
Medida del lado: 5
Perimetro: 20
Area: 25
______________Texto________________
El texto tiene:
Este es un laboratorio de figuras geometricas y composite
__________Circulo 1___________
Calcular area y perimetro de circulo
Area: 314
Perimetro: 62

El circulo tiene:
Medida del radio: 10
Perimetro: 62
Area: 314
______________Cuadrado 1________________
Calcular area y perimetro de cuadrado
Area: 49
Perimetro: 28

El cuadrado tiene: 
Medida del lado: 7
Perimetro: 28
Area: 49
______________Texto 1________________
El texto tiene:
Hola Mundo
______________Grupo________________
Este grupo de objetos representables tiene:
[Circulo{radio=5, Area=78, Perimetro=31}, Cuadrado{Lado=5, Area=25, Perimetro=20}, Texto{texto='Este es un laboratorio de figuras geometricas y composite}]
______________Grupo 1________________
Este grupo de objetos representables tiene:
[Circulo{radio=10, Area=314, Perimetro=62}, Cuadrado{Lado=7, Area=49, Perimetro=28}, Texto{texto='Hola Mundo}]
______________Hoja________________
Hoja{Objetos=[Grupo{Elementos=[Circulo{radio=5, Area=78, Perimetro=31}, Cuadrado{Lado=5, Area=25, Perimetro=20}, Texto{texto='Este es un laboratorio de figuras geometricas y composite}]}]}
______________Hoja 1________________
Hoja{Objetos=[Grupo{Elementos=[Circulo{radio=10, Area=314, Perimetro=62}, Cuadrado{Lado=7, Area=49, Perimetro=28}, Texto{texto='Hola Mundo}]}]}
_______________Documento_______________
Documento{Hojas=[Hoja{Objetos=[Grupo{Elementos=[Circulo{radio=5, Area=78, Perimetro=31}, Cuadrado{Lado=5, Area=25, Perimetro=20}, Texto{texto='Este es un laboratorio de figuras geometricas y composite}]}]}, Hoja{Objetos=[Grupo{Elementos=[Circulo{radio=10, Area=314, Perimetro=62}, Cuadrado{Lado=7, Area=49, Perimetro=28}, Texto{texto='Hola Mundo}]}]}]}
