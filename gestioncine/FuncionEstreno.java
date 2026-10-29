/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncine;

/**
 *
 * @author VICTUS
 */
public class FuncionEstreno extends FuncionCine {

    private double porcentajeRecargo;

    public FuncionEstreno(String tituloPelicula, String sala,
                          int asientosOcupados, double porcentajeRecargo) {
        super(tituloPelicula, sala, asientosOcupados);

        if (porcentajeRecargo >= 0) {
            this.porcentajeRecargo = porcentajeRecargo;
        } else {
            this.porcentajeRecargo = 0;
        }
    }

    public double getPorcentajeRecargo() {
        return porcentajeRecargo;
    }

    public void setPorcentajeRecargo(double porcentajeRecargo) {
        if (porcentajeRecargo >= 0) {
            this.porcentajeRecargo = porcentajeRecargo;
        }
    }

    @Override
    public double calcularRecaudacion() {
        return getAsientosOcupados() * 12000.0
                * (1 + porcentajeRecargo / 100.0);
    }
}
    
    

