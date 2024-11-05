public class Videojuego {
    private String genero;
    private String titulo;
    private String empresa;

    public Videojuego(String titulo, String genero, String empresa) {
        this.titulo=titulo;
        this.genero=genero;
        this.empresa=empresa;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void mostrarInformacion(){
        System.out.println("\nINFORMACION DEL JUEGO\n1.Título: "+titulo+"\n2.Género: "+genero+"\n3.Empresa: "+empresa);
    }
}
