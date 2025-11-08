public abstract class Figura {
    protected String nombre;
    public Figura(String nombre){
        this.nombre = nombre;
    }
    protected double getArea(){
        return 0.0;
    }

    protected void mostrarArea(){
        System.out.println("El area del " + nombre + " es: " + getArea());
}
}
