/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioncine;

/**
 *
 * @author VICTUS
 */
public class GestionCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      FuncionCine general = new FuncionCine(
                "Spider-Man", "Sala 3", 20);

        FuncionEstreno estreno = new FuncionEstreno(
                "Avatar", "Sala 1", 10, 20);

        FuncionNormal normal = new FuncionNormal(
                "Titanic", "Sala 2", 15, 50 );
System.out.println("\n=== PRUEBA DE SALA LLENA ===");

FuncionNormal salaLlena = new FuncionNormal(
        "Titanic", "Sala 2", 50, 50);

System.out.println("Capacidad: "
        + salaLlena.getCapacidadSala());

System.out.println("Asientos ocupados: "
        + salaLlena.getAsientosOcupados());

if (salaLlena.venderEntrada()) {
    System.out.println("Entrada vendida correctamente.");
} else {
    System.out.println("No hay asientos disponibles.");
}
        System.out.println("=== FUNCION GENERAL ===");
        System.out.println("Pelicula: " + general.getTituloPelicula());
        System.out.println("Sala: " + general.getSala());
        System.out.println("Asientos ocupados: "
                + general.getAsientosOcupados());
        System.out.println("Recaudacion: $"
                + general.calcularRecaudacion());

        System.out.println("\n=== FUNCION DE ESTRENO ===");
        System.out.println("Pelicula: " + estreno.getTituloPelicula());
        System.out.println("Sala: " + estreno.getSala());
        System.out.println("Asientos ocupados: "
                + estreno.getAsientosOcupados());
        System.out.println("Recargo: "
                + estreno.getPorcentajeRecargo() + "%");
        System.out.println("Recaudacion: $"
                + estreno.calcularRecaudacion());

        System.out.println("\n=== FUNCION NORMAL ===");
        System.out.println("Pelicula: " + normal.getTituloPelicula());
        System.out.println("Sala: " + normal.getSala());
        System.out.println("Asientos ocupados: "
                + normal.getAsientosOcupados());
        System.out.println("Capacidad: " + normal.getCapacidadSala());

        if (normal.venderEntrada()) {
            System.out.println("Entrada vendida correctamente.");
        } else {
            System.out.println("No hay asientos disponibles.");
        }
       System.out.println("\n=== PRUEBA DE RECAUDACION ===");

FuncionCine pruebaNormal = new FuncionCine(
        "Pelicula normal", "Sala 4", 55);

System.out.println("Recaudacion normal esperada: $660000");
System.out.println("Recaudacion normal calculada: $"
        + pruebaNormal.calcularRecaudacion());

FuncionEstreno pruebaEstreno = new FuncionEstreno(
        "Pelicula estreno", "Sala 5", 40, 20);

System.out.println("Recaudacion estreno esperada: $576000");
System.out.println("Recaudacion estreno calculada: $"
        + pruebaEstreno.calcularRecaudacion());

System.out.println("\n=== PRUEBA DE TITULO VACIO ===");

try {
    general.setTituloPelicula("");
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}

System.out.println("\n=== PRUEBA DE SALA VACIA ===");

try {
    general.setSala("");
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}



        System.out.println("Asientos ocupados despues de la venta: "
                + normal.getAsientosOcupados());
        System.out.println("Recaudacion: $"
                + normal.calcularRecaudacion());
        System.out.println("\n=== PRUEBA DE VALIDACION ===");

try {
    general.setAsientosOcupados(-3);
    System.out.println("Error: se aceptaron asientos negativos.");
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}
    
    System.out.println("\n=== PRUEBA DE EXCESO DE VENTAS ===");

FuncionNormal pruebaVentas = new FuncionNormal(
        "Titanic", "Sala 6", 45, 50);

System.out.println("Asientos disponibles: " + pruebaVentas.getAsientosDisponibles());

if (pruebaVentas.venderEntradas(6)) {
    System.out.println("Venta realizada correctamente.");
} else {
    System.out.println("Error: no hay suficientes asientos disponibles.");


System.out.println("Asientos ocupados: " + pruebaVentas.getAsientosOcupados());
}
 
}  
}

 