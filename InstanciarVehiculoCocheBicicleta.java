public class InstanciarVehiculoCocheBicicleta {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.mover();
        Coche coche = new Coche();
        coche.mover();
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.mover();
    }
}
