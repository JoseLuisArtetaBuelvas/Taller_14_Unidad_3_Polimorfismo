//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class IntanciarCirculoRectangulo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Circulo", 20);
        circulo.getArea();
        circulo.mostrarArea();
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 30, 40);
        rectangulo.getArea();
        rectangulo.mostrarArea();
    }
}