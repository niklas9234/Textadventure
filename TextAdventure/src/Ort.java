public class Ort {
    private String Name;
    private boolean istStadt;
    private int warenInteresse;
    private int x;
    private int y;
    
    
    public Ort(String Name, int x, int y, boolean istStadt, int warenInteresse) {
        this.Name = Name;
        this.x = x;
        this.y = y;
        this.istStadt = istStadt;
        this.warenInteresse = warenInteresse;
    }

    public String getName() {
        return Name;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public boolean isIstStadt() {
        return istStadt;
    }
    public void setIstStadt(boolean istStadt) {
        this.istStadt = istStadt;
    }
    public int getWarenInteresse() {
        return warenInteresse;
    }
    public void setWarenInteresse(int warenInteresse) {
        this.warenInteresse = warenInteresse;
    }

    
}
