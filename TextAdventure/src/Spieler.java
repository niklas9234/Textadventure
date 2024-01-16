public class Spieler {
    private int gold = 0;
    private int lebenspunkte = 0;
    private int S_x;
    private int S_y; 

    
    
    public Spieler(int gold, int lebenspunkte, int s_x, int s_y) {
        this.gold = gold;
        this.lebenspunkte = lebenspunkte;
        S_x = s_x;
        S_y = s_y;
    }

    
    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }

    public int getS_x() {
        return S_x;
    }

    public void setS_x(int s_x) {
        S_x = s_x;
    }

    public int getS_y() {
        return S_y;
    }

    public void setS_y(int s_y) {
        S_y = s_y;
    }

    String zeigeReisen(String Name, int Spieler_x, int Spieler_y, int ZielOrt_x, int ZielOrt_y){
        double d = Math.sqrt( Math.pow((ZielOrt_x - Spieler_x),2) + Math.pow((ZielOrt_y - Spieler_y),2));
        return Name + " ist " + (int)d + " km entfernt";
    }

}
