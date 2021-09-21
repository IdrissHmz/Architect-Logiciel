package sample;
public class Jeux extends StockItem {
    private String platform ;

    public Jeux (String plt,String nom, int rentprc){
        super(nom,rentprc);
        platform = plt;
    }
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
