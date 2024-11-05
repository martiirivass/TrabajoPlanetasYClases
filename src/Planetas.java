public class Planetas {

    public String nombrePlaneta;
    public int cantidadSatelites;
    public double masa;   //Masa en kilogramos
    public double volumen;  //Volumen en kilómetros cúbicos
    public int diametro;  //Diámetro en kilómetros
    public int distanciaMediaAlSol;  //Distancia media al Sol en millones de kilómetros
    public enum tipoPlaneta{
        GASEOSO,
        TERRESTRE,
        ENANO
    }
    public tipoPlaneta tipo;
    public boolean esObservable;
    public double periodoOrbital;
    public double periodoDeRotacion;


    public Planetas(String nombrePlaneta,int cantidadSatelites,double masa,double volumen, int diametro, int distanciaMediaAlSol,
                    tipoPlaneta tipo, boolean esObservable,double periodoOrbital,double periodoDeRotacion) {
        this.nombrePlaneta=nombrePlaneta;
        this.cantidadSatelites=cantidadSatelites;
        this.masa=masa;
        this.volumen=volumen;
        this.diametro=diametro;
        this.distanciaMediaAlSol=distanciaMediaAlSol;
        this.tipo=tipo;
        this.esObservable=esObservable;
        this.periodoOrbital=periodoOrbital;
        this.periodoDeRotacion=periodoDeRotacion;
    }

    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public void setNombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }

    public int getCantidadSatelites() {
        return cantidadSatelites;
    }

    public void setCantidadSatelites(int cantidadSatelites) {
        this.cantidadSatelites = cantidadSatelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDistanciaMediaAlSol() {
        return distanciaMediaAlSol;
    }

    public void setDistanciaMediaAlSol(int distanciaMediaAlSol) {
        this.distanciaMediaAlSol = distanciaMediaAlSol;
    }

    public tipoPlaneta getTipo() {
        return tipo;
    }

    public void setTipo(tipoPlaneta tipo) {
        this.tipo = tipo;
    }

    public boolean isEsObservable() {
        return esObservable;
    }

    public void setEsObservable(boolean esObservable) {
        this.esObservable = esObservable;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public void setPeriodoOrbital(double periodoOrbital) {
        this.periodoOrbital = periodoOrbital;
    }

    public double getPeriodoDeRotacion() {
        return periodoDeRotacion;
    }

    public void setPeriodoDeRotacion(double periodoDeRotacion) {
        this.periodoDeRotacion = periodoDeRotacion;
    }

    public void infoPlaneta(){
        System.out.println("\nINFORMACIÓN DEL PLANETA");
        System.out.println("\nNombre del planeta: "+nombrePlaneta+"\nCantidad de satelites: "+cantidadSatelites+
                "\nMasa en kg: "+masa+"\nVolumen en kg cúbicos: "+volumen+"\nDiametro en km: "+diametro+"\nDistancia media al sol medido en millones de km: "+distanciaMediaAlSol+
                "\nTipo de planeta: "+tipo+"\nObservable?: "+esObservable+"\nPeriodo orbital (en años): "+periodoOrbital+"\nPeriodo de rotación (en dias): "+periodoDeRotacion);
    }
}
