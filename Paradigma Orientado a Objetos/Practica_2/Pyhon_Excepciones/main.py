import re

from Classes.Excepcion import *
from Classes.Numero import *
from Classes.Operador import *


class main:
    def meterEnLista(self, operando):
        lista = []
        l = re.split("\s", operando)
        try:
            for i in l:
                x = re.search("^[0-9]+$", i)
                y = re.search("[+/*-]", i)
                if y:
                    o = Operador(i)
                    lista.append(o)
                elif x:
                    n = Numero(int(i))
                    lista.append(n)
                else:
                    raise Excepcion("Error de operacion")
        except Excepcion as e:
            print(e.mensaje)
        return lista

    def realizarOperacion(self, numero1, numero2, operador):
        resultado = 0
        if operador == "+":
            resultado = numero1 + numero2;
            return resultado;
        if operador == "-":
            resultado = numero1 - numero2;
            return resultado;
        if operador == "/":
            resultado = numero1 / numero2;
            return resultado;
        if operador == "*":
            resultado = numero1 * numero2;
            return resultado;
        return resultado;

    def resultado(self, lista):
        result = Numero(-1)
        try:
            for i, j in enumerate(lista):
                i = 0
                if len(lista) < 3:
                    raise Excepcion("Error")
                n1 = lista[i]
                operador = lista[i + 1]
                n2 = lista[i + 2]
                if (type(n1).__name__ == "Numero") and (type(n2).__name__ == "Numero") and (type(operador).__name__ == "Operador"):
                    result.setNumero(self.realizarOperacion(n1.getNumero(), n2.getNumero(), operador.getOperador()))
                    lista.insert(0, result)
                    del lista[1:4]
                else:
                    raise Excepcion("Error")
                if len(lista) == 1:
                    return result

        except Excepcion as e:
            print(e.mensaje)
        return result


if __name__ == '__main__':
    print("Ingrese la operación: ")
    x = input()
    expresion = main.meterEnLista(x)
    print("El resultado de la operación es: ", main.resultado(expresion).getNumero())