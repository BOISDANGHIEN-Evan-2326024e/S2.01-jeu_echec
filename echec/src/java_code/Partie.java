package java_code;

import java.util.ArrayList;

public class Partie {
    private int id;
    private int dernierId=0;
    private ArrayList<ArrayList<Piece>> plateau;
    private Joueur joueur1;
    private Joueur joueur2;

    public Partie(Joueur joueur1, Joueur joueur2) {
        this.id=dernierId+1;
        dernierId++;
        this.joueur1=joueur1;
        this.joueur2=joueur2;
        Piece Pion_N1=new Piece("Pion",0,0);
        Piece Pion_N2=new Piece("Pion",1,0);
        Piece Pion_N3=new Piece("Pion",2,0);
        Piece Pion_N4=new Piece("Pion",3,0);
        Piece Pion_N5=new Piece("Pion",4,0);
        Piece Pion_N6=new Piece("Pion",5,0);
        Piece Pion_N7=new Piece("Pion",6,0);
        Piece Pion_N8=new Piece("Pion",7,0);

    }
}
