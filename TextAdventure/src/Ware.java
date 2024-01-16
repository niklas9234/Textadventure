public class Ware {
    private final String name;
    private final int preis;
    private final double gewicht;
    private final boolean essbar;
    private double interesse;
    private String [][]  inventar= new String [41][41];

    public Ware(String name, int preis, double gewicht, boolean essbar, double interesse) {
        this.name = name;
        this.preis = preis;
        this.gewicht = gewicht;
        this.essbar = essbar;
        this.interesse = interesse;
    }

    public String getName() {
        return name;
    }

    public int getPreis() {
        return preis;
    }

    public double getGewicht() {
        return gewicht;
    }

    public boolean isEssbar() {
        return essbar;
    }

    public double getInteresse() {
        return interesse;
    }

    public void setInteresse(double interesse) {
        this.interesse = interesse;
    }

    public String[][] getInventar() {
        return inventar;
    }

    public void setInventar(String[][] inventar) {
        this.inventar = inventar;
    }
    
}
