package excepciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Excepciones {
    
    static List listaNumerosOperadores = new ArrayList<>();

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese lo que desea operar: ");
        String op = sc.nextLine();
        
        List expresion = meterEnLista(op);
        System.out.println("Resultado: " + resultado(expresion).getNumero());
        
    }
    
    public static List meterEnLista(String expresionOperacion){
        List listaR = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(expresionOperacion,"+/-* ", true);
        try {
            while (st.hasMoreTokens()) {
                String tk = st.nextToken();
                if (tk.matches("[0-9]")){
                    Numero numero = new Numero(Integer.valueOf(tk));
                    listaR.add(numero);
                }
                else if(tk.matches("[+/*[-]]+")){
                    Operador operador = new Operador(tk);
                    listaR.add(operador);
                }
                else if(tk.equals(" ")){
                    continue;
                }
                else {
                    throw new Excepcion("Error de operacion");
                }
            }
         } catch (Excepcion e) {
            System.err.println(e.getMessage());
        }
        return listaR;
    }
    
    public static int realizarOperacion(int numero1, int numero2, String operador){
         int resultadoOperacion = 0;
         switch(operador){
            case "+":
                resultadoOperacion = numero1 + numero2;
                return resultadoOperacion;
            case "-":
                resultadoOperacion = numero1 - numero2;
                return resultadoOperacion;
            case "/":
                resultadoOperacion = numero1 / numero2;
                return resultadoOperacion;
            case "*":
                resultadoOperacion = numero1 * numero2;
                return resultadoOperacion;
         }
         return resultadoOperacion; 
    }
    
    public static Numero resultado(List l){
        Numero result = new Numero(-1);
        Object n1, n2, operador;
        Numero num1, num2;
        Operador op;

        try {
            for(int i = 0; i < l.size();){
                if (l.size() < 3){
                    throw new Excepcion("Error");
                }
                n1 = l.get(i);
                operador = l.get(i+1);
                n2 = l.get(i+2);
                if((n1.getClass().toString().equals("class Numero")) && (operador.getClass().toString().equals("class Operador")) && (n2.getClass().toString().equals("class Numero"))){
                    num1 = (Numero) n1;
                    num2 = (Numero) n2;
                    op = (Operador) operador;

                    result.setNumero(realizarOperacion(num1.getNumero(),num2.getNumero(),op.getOperador()));
                    l.add(0, result);
                    l.subList(1, 4).clear();

                }else {
                    throw new Excepcion("Error");
                }
                if (l.size() == 1) {
                    return result;
                }
            }

        }catch (Excepcion e) {
            System.err.println(e.getMessage());
        }

        return result;
    }
}
