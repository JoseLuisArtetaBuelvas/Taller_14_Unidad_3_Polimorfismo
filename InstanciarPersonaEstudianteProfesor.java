public class InstanciarPersonaEstudianteProfesor {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.presentarse();
        // persona.decirCarrera();
        Estudiante estudiante = new Estudiante();
        estudiante.presentarse();
        Profesor profesor = new Profesor();
        profesor.presentarse();
    }
}
