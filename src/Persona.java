public class Persona {
    private String nombre;
    private String paisNacimiento;
    private char genero;


    public Persona() {
    }

    public Persona(String nombre, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.paisNacimiento=paisNacimiento;
        this.genero=genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void infoPersona(){
        System.out.println("\nINFORMACIÓN DE LA PERSONA:\nNombre: "+nombre+"\nPais de nacimiento: "+paisNacimiento+"\nGenero: "+genero);
    }

}
