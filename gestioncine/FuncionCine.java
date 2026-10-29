/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncine;

/**
 *
 * @author VICTUS
 */
public class FuncionCine {
    private String tituloPelicula;
    private String sala;
    private int asientosOcupados;
    private double recaudacion;

    public FuncionCine(String tituloPelicula, String sala,
                       int asientosOcupados) {
      setTituloPelicula(tituloPelicula);
      setSala(sala);
      
      this.asientosOcupados=0;
      this.recaudacion =0;
        setAsientosOcupados(asientosOcupados);
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
    if (tituloPelicula != null
            && !tituloPelicula.trim().isEmpty()) {
        this.tituloPelicula = tituloPelicula;
    } else {
        throw new IllegalArgumentException(
                "Error: el titulo de la pelicula no puede estar vacio.");
    }
}
        
    

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        if (sala != null && sala.length() > 0) {
            this.sala = sala;
            
        }else{
            throw new IllegalArgumentException("Error: la sala no puede estar vacio");
        }
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public void setAsientosOcupados(int asientosOcupados) {
        if (asientosOcupados >= 0) {
            this.asientosOcupados = asientosOcupados;
            this.recaudacion = calcularRecaudacion();
        }else{
            throw new IllegalArgumentException("Error los asientos ocupados no pueden ser negativos.");
        }
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        if (recaudacion >= 0) {
            this.recaudacion = recaudacion;
        }
    }

    public double calcularRecaudacion() {
        return asientosOcupados * 12000.0;
    }
}