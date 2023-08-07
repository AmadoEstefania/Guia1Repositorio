/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1repositorio;

/**
 *
 * @author Ivan
 */
public class numeroCliente {
    
    private int dni;
    private String nombre;
    private int numcliente;

    public numeroCliente(int dni, String nombre, int numcliente) {
        this.dni = dni;
        this.nombre = nombre;
        this.numcliente = numcliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumcliente() {
        return numcliente;
    }

    public void setNumcliente(int numcliente) {
        this.numcliente = numcliente;
    }

    
    
    
}
