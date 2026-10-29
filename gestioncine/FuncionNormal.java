/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncine;

/**
 *
 * @author VICTUS
 */
public class FuncionNormal extends FuncionCine {

    private int capacidadSala;

    public FuncionNormal(String tituloPelicula, String sala,
                         int asientosOcupados, int capacidadSala) {
        super(tituloPelicula, sala, asientosOcupados);

        if (capacidadSala >= 0 && asientosOcupados <= capacidadSala) {
            this.capacidadSala = capacidadSala;
        } else {
            this.capacidadSala = asientosOcupados;
        }
    }

    public int getCapacidadSala() {
        return capacidadSala;
    }

   public void setCapacidadSala(int capacidadSala) {
    if (capacidadSala >= getAsientosOcupados()) {
        this.capacidadSala = capacidadSala;
    }
}

public boolean hayAsientosDisponibles() {
    return getAsientosOcupados() < capacidadSala;
}

public int getAsientosDisponibles() {
    return capacidadSala - getAsientosOcupados();
}

public boolean venderEntrada() {
    if (hayAsientosDisponibles()) {
        setAsientosOcupados(getAsientosOcupados() + 1);
        return true;
    }

    return false;
}
public boolean venderEntradas(int cantidad) {
    if (cantidad <= 0) {
        return false;
    }

    if (cantidad > getAsientosDisponibles()) {
        return false;
    }

    setAsientosOcupados(getAsientosOcupados() + cantidad);
    return true;
}
}
