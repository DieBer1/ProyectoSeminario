/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author estudiante
 */
public class Ocasional extends Profesor
{
    Integer salBasico;

    public Ocasional() {
    }

    public Ocasional(Integer salBasico) {
        this.salBasico = salBasico;
    }

    public Integer getSalBasico() {
        return salBasico;
    }

    public void setSalBasico(Integer salBasico) {
        this.salBasico = salBasico;
    }
    
    
}
