/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Sam
 */
public class Operador {
    
    private String operador;

    public Operador(String operador) {
        this.operador = operador;
    }

    public String getOperador() {
        return operador;
    }

    @Override
    public String toString() {
        return "Operador{" + "operador=" + operador + '}';
    }

    
    
    
}
