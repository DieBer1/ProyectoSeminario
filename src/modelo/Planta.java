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
public class Planta extends Profesor
{
    Integer salBasico, punSalarial, valPunto, numNombra;
    String categoria, fecNombra;

    public Planta() {
    }

    public Planta(Integer salBasico, Integer punSalarial, Integer valPunto, Integer numNombra, String categoria, String fecNombra) {
        this.salBasico = salBasico;
        this.punSalarial = punSalarial;
        this.valPunto = valPunto;
        this.numNombra = numNombra;
        this.categoria = categoria;
        this.fecNombra = fecNombra;
    }

    public Integer getSalBasico() {
        return salBasico;
    }

    public void setSalBasico(Integer salBasico) {
        this.salBasico = salBasico;
    }

    public Integer getPunSalarial() {
        return punSalarial;
    }

    public void setPunSalarial(Integer punSalarial) {
        this.punSalarial = punSalarial;
    }

    public Integer getValPunto() {
        return valPunto;
    }

    public void setValPunto(Integer valPunto) {
        this.valPunto = valPunto;
    }

    public Integer getNumNombra() {
        return numNombra;
    }

    public void setNumNombra(Integer numNombra) {
        this.numNombra = numNombra;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFecNombra() {
        return fecNombra;
    }

    public void setFecNombra(String fecNombra) {
        this.fecNombra = fecNombra;
    }
    
    public double calcularSalario()
    {
        Planta p = new Planta();
        double salarioTotal = 0;
        salarioTotal = p.getSalBasico()+(p.getPunSalarial()*p.getValPunto());
        return salarioTotal;
    }
}
