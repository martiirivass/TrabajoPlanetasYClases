public class MainVideojuegoAuto {
    public static void main(String[] args) {
        Videojuego v1=new Videojuego("Mortal Kombat","Peleas", "Warner Bros");
        Videojuego v2=new Videojuego("Resident Evil","Terror","CAPCOM");
        Videojuego v3=new Videojuego("Gran Turismo","Carreras","Sony Interactive Entertainment");
        Videojuego v4=new Videojuego("Minecraft","Supervivencia","Mojang");

        v1.mostrarInformacion();
        v2.mostrarInformacion();
        v3.mostrarInformacion();
        v4.mostrarInformacion();



        Auto a1=new Auto("Honda", 2000,240000);
        Auto a2=new Auto("Volkswagen", 2004,200000);
        Auto a3=new Auto("Subaru", 2015,105000);
        Auto a4=new Auto("Toyota", 2022,14000);
        Auto a5=new Auto("BMW", 2017,47059);

        a1.mostrarInfoAuto();
        a2.mostrarInfoAuto();
        a3.mostrarInfoAuto();
        a4.mostrarInfoAuto();
        a5.mostrarInfoAuto();
    }
}
