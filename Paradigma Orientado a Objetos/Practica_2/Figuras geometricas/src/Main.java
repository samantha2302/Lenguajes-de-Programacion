import Figuras.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("__________Circulo___________");
        Circulo circulo = new Circulo(5);
        circulo.calcularAreaYPerimetro();
        circulo.dibujar();

        System.out.println("______________Cuadrado________________");
        Cuadrado cuadrado = new Cuadrado(5);
        cuadrado.calcularAreaYPerimetro();
        cuadrado.dibujar();

        System.out.println("______________Texto________________");
        Texto texto = new Texto("Este es un laboratorio de figuras geometricas y composite");
        texto.dibujar();

        System.out.println("__________Circulo 1___________");
        Circulo circulo1 = new Circulo(10);
        circulo1.calcularAreaYPerimetro();
        circulo1.dibujar();

        System.out.println("______________Cuadrado 1________________");
        Cuadrado cuadrado1 = new Cuadrado(7);
        cuadrado1.calcularAreaYPerimetro();
        cuadrado1.dibujar();

        System.out.println("______________Texto 1________________");
        Texto texto1 = new Texto("Hola Mundo");
        texto1.dibujar();


        System.out.println("______________Grupo________________");
        Grupo grupo = new Grupo();
        grupo.agregarObjRepresentable(circulo);
        grupo.agregarObjRepresentable(cuadrado);
        grupo.agregarObjRepresentable(texto);
        grupo.dibujar();

        System.out.println("______________Grupo 1________________");
        Grupo grupo1 = new Grupo();
        grupo1.agregarObjRepresentable(circulo1);
        grupo1.agregarObjRepresentable(cuadrado1);
        grupo1.agregarObjRepresentable(texto1);
        grupo1.dibujar();

        System.out.println("______________Hoja________________");
        Hoja hoja = new Hoja();
        hoja.agregarObjeto(grupo);
        System.out.println(hoja);

        System.out.println("______________Hoja 1________________");
        Hoja hoja1 = new Hoja();
        hoja1.agregarObjeto(grupo1);
        System.out.println(hoja1);


        System.out.println("_______________Documento_______________");
        Documento documento = new Documento();
        documento.agregarHojas(hoja);
        documento.agregarHojas(hoja1);
        System.out.println(documento);
    }
}
