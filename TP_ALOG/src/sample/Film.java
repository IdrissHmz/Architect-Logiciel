package sample;


public class Film extends StockItem {
    private String acteur ;
    public Film(String act,String nom , int rentprc){
        super(nom,rentprc);
        acteur = act ;
    }
    public String getActeur() {
        return acteur;
    }
    public void setActeur(String acteur) {
        this.acteur = acteur;
    }
}
