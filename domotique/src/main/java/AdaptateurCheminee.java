public class AdaptateurCheminee implements Appareil{
    private Cheminee chemineeAdaptee;

    public AdaptateurCheminee(Cheminee c){
        this.chemineeAdaptee = c;
    }
    public void allumer() {
        this.chemineeAdaptee.changerIntensite(this.chemineeAdaptee.getLumiere()+10);
    }
    public void eteindre(){
        this.chemineeAdaptee.changerIntensite(0);
    }
    public String toString(){
        return this.chemineeAdaptee.toString();
    }
}
