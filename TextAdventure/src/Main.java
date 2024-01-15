import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Spiel Spiel = new Spiel(0);
        Spieler Spieler [] = new Spieler[41];
        Spieler [0] = new Spieler(100, 100, 2,5);

        Taetigkeit Taetigkeit;

        Ort Ort[] = new Ort[41];
        
        Ort [0] = new Ort("Bielefeld",5,2, true, 1000);
        Ort [1] = new Ort ("Schmalkalden",2,7,true,20);
        Ort [2] = new Ort("Buxtehude",20,5,true,1);
        Ort [3] = new Ort("Meiningen",18,5,true,1);
        Ort [4] = new Ort("Suhl",16,8,true,1);
        Ort [5] = new Ort("Ilmenau",22,9,true,1);
        Ort [6] = new Ort("Dermbach",2,9,false,1);
        Ort [7] = new Ort("Wernshausen",4,8,false,1);
        Ort [8] = new Ort("Roßdorf",11,7,false,1);
        Ort [9] = new Ort("Aßbach",2,11,false,1);

        
        ArrayList <String> Reiseziele = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Reiseziele.add(Spieler[0].zeigeReisen(Ort[i].getName(),Spieler[0].getS_x(), Spieler[0].getS_y(), Ort[i].getX(), Ort[i].getY()));
            System.out.println(1+i + ". " + Reiseziele.get(i));
          }
    }
    
}
