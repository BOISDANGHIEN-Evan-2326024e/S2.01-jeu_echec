package java_code;

public class Piece {
    private String nom;
    private int position_h;
    private int position_v;

    public Piece(String nom, int position_h, int position_v) {
        this.nom = nom;
        this.position_h = position_h;
        this.position_v = position_v;
    }

    public int getPosition_h() {
        return position_h;
    }

    public void setPosition_h(int position_h) {
        this.position_h = position_h;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPosition_v() {
        return position_v;
    }

    public void setPosition_v(int position_v) {
        this.position_v = position_v;
    }
}
