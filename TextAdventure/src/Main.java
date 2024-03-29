public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Spiel Spiel = new Spiel(0);
        Spieler Spieler[] = new Spieler[41];
        Taetigkeit Taetigkeit;
        Ort Ort[] = new Ort[41];
        Ware Ware[] = new Ware[41];
        Spieler[0] = new Spieler(100, 100, 0, 0);

        //------------------------------------ Waren ------------------------------------------
        Ware[0] = new Ware("Apfel", 1, 0.3, true, 0.3);
        Ware[1] = new Ware("Birne", 1, 0.2, true, 0.2);
        Ware[2] = new Ware("Schaufel", 5, 1, false, 1);
        //------------------------------------ Orte ------------------------------------------

        Ort[0] = new Ort("Bielefeld", 1000, 1000, true, 1000);
        Ort[1] = new Ort("Schmalkalden", 2, 7, true, 20);
        Ort[2] = new Ort("Buxtehude", 20, 5, true, 1);
        Ort[3] = new Ort("Meiningen", 18, 5, true, 1);
        Ort[4] = new Ort("Suhl", 16, 8, true, 1);
        Ort[5] = new Ort("Ilmenau", 22, 9, true, 1);
        Ort[6] = new Ort("Dermbach", 2, 9, false, 1);
        Ort[7] = new Ort("Wernshausen", 4, 8, false, 1);
        Ort[8] = new Ort("Roßdorf", 11, 7, false, 1);
        Ort[9] = new Ort("Aßbach", 2, 11, false, 1);

        // -------------------------------- Menü´s -----------------------------------------

        // ---- Main - Menu ----
        boolean AWF_Flag = true;
        boolean mainmenu = true;
        int mainAction = 0;
        boolean reisen=false, kaufen=false, verkaufen=false, warten=false,
                essen=false, arbeiten=false, inventar=false, endgame=false,
                standort = false, spielende = false;

        while (mainmenu == true & Spiel.getTageszaehler() <= 100) {
            System.out.println("Spielmenü");
            System.out.println(
                    "1. Reisen   2. Kaufen   3. Verkaufen" + "\n"
                    + "4. Warten   5. Essen    6. Arbeiten" + "\n"
                    + "7. Inventar 8. Standort 9. Spiel beenden");
            mainmenu = false;
            System.out.print("Aktion: ");
            mainAction = input.nextInt();

            switch (mainAction) {
                case 1:
                    reisen = true;
                    break;
                case 2:
                    kaufen = true;
                    break;
                case 3:
                    verkaufen = true;
                    break;
                case 4:
                    warten = true;
                    break;
                case 5:
                    essen = true;
                    break;
                case 6:
                    arbeiten = true;
                    break;
                case 7:
                    inventar = true;
                    break;
                case 8:
                    standort = true;
                    break;
                case 9:
                    spielende = true;
                    break;
                default:
                    mainmenu = true;
                    break;
            }   
        
        // Inventar - Menu

        if (inventar == true){
            System.out.println("Inventar");
            

        }



        // Ende Menu
        //-------------------------------------------------------------------------------
        // ------------------------------ Reisen ----------------------------------------
        int reisenAction;
        if (reisen == true) { 

            System.out.println("Mögliche Reiseziele sind: ");
            ArrayList<String> Reiseziele = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                Reiseziele.add(Spieler[0].zeigeReisen(Ort[i].getName(), Spieler[0].getS_x(), Spieler[0].getS_y(),
                        Ort[i].getX(), Ort[i].getY()));
                System.out.println((1 + i) + ". " + Reiseziele.get(i));
            }
            
        /* 
            System.out.println
                ("-------------------------------" + "\n"
                +"Aktion heute nicht mehr möglich" + "\n"
                +"-------------------------------");
        */
            if (AWF_Flag == true){
                System.out.print("Reisen nach: ");
                reisenAction = input.nextInt();
                Spieler[0].changePlayerCoordinates(Ort[reisenAction-1].getX(), Ort[reisenAction-1].getY());
                Spieler[0].setStandort(Ort[reisenAction-1].getName());
            }
        reisen = false;
        mainmenu = true;    
        }

        // Ende Reisen

        if (standort == true){
            System.out.println("Standort des Spielers ist: " +Spieler[0].getStandort());
        }
        //-----------------------------------------------------------------------------
        //------------------------------ Kaufen ---------------------------------------
        


    }
    }

}

