public class Spiel {
    private int tageszaehler = 0;
    final private int maxLebenspunkte = 100;
    final private int minLebenspunkte = 0;
    final private int maximalGewicht = 1000;

    public Spiel(int tageszaehler) {
        this.tageszaehler = tageszaehler;
    }

    public int getTageszaehler() {
        return tageszaehler;
    }

    public void setTageszaeler(int tageszaeler) {
        this.tageszaehler = tageszaeler;
        if (tageszaehler > 100){
            System.out.println("""
                               --------------------------
                               Ende des Spiels
                               Grund: 100 Tage erreicht!
                               --------------------------
                               """);
        }  
    }

    public int getMaxLebenspunkte() {
        return maxLebenspunkte;
    }

    public int getMinLebenspunkte() {
        return minLebenspunkte;
    }

    public int getMaximalGewicht() {
        return maximalGewicht;
    }
}
