import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Spiel Spiel = new Spiel(0);
        Spieler Spieler = new Spieler(100, 100, 2,5);
        Taetigkeit Taetigkeit;

        
        Ort Ort1 = new Ort("Bielefeld",5,2, true, 1000);
        Ort Ort2 = new Ort ("Schmalkalden",2,7,true,20);
        Ort Ort3 = new Ort("Buxtehude",18,5,true,1);
        
        ArrayList <String> Reiseziele = new ArrayList<>();

        Reiseziele.add(Spieler.zeigeReisen(Ort1.getName(),Spieler.getS_x(), Spieler.getS_y(), Ort1.getX(), Ort1.getY()));
        Reiseziele.add(Spieler.zeigeReisen(Ort2.getName(),Spieler.getS_x(), Spieler.getS_y(), Ort2.getX(), Ort2.getY()));
        Reiseziele.add(Spieler.zeigeReisen(Ort3.getName(),Spieler.getS_x(), Spieler.getS_y(), Ort3.getX(), Ort3.getY()));
        
        for (int i = 0; i < Reiseziele.size(); i++) {
            System.out.println(Reiseziele.get(i));
          }
    }
    
}
