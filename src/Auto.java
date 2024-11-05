public class Auto {
    private String marca;
    private int modelo;
    private int kilometraje;

    public Auto(String marca, int modelo, int kilometraje) {
        this.marca = marca;
        this.modelo=modelo;
        this.kilometraje=kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void mostrarInfoAuto(){
        System.out.println("\nINFORMACIÓN DEL AUTO\n1.Marca: "+marca+"\n2.Modelo: "+modelo+"\n3.Kilometraje: "+kilometraje);
    }
}

