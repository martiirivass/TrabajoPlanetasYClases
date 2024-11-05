public class MainPlanetas {
    public static void main(String[] args) {
        Planetas p1=new Planetas("Tierra",1,5.9736E24,1.08321E12,12742,150000000, Planetas.tipoPlaneta.TERRESTRE,true,1,1);
        Planetas p2=new Planetas("Jupiter",1,1.899e27,1.4313e15,139820,750000000, Planetas.tipoPlaneta.GASEOSO,true,12,0.37);


        p1.infoPlaneta();
        p2.infoPlaneta();
    }
}
