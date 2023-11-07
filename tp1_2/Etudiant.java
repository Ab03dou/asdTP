public class Etudiant {
    private String nom;
    private float note;
    private int grp;

    public Etudiant(String nom, double d, int grp) {
        this.nom = nom;
        this.note = d;
        this.grp = grp;
    }

    public String getNom() {
        return nom;
    }

    public float getNote() {
        return note;
    }

    public int getGrp() {
        return grp;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public void setGrp(int grp) {
        this.grp = grp;
    }
    
    
}
public class Traitement{

    public int comparer(Etudiant a, Etudiant b, Etudiant c){
        if(a.getNote()>=b.getNote() && a.getNote()>=c.getNote()){
            System.out.println(a.getNote());
        }else if(b.getNote()>=a.getNote() && b.getNote()>=c.getNote()){
            System.out.println(b.getNote());
        }else if(c.getNote()>=a.getNote() && c.getNote()>=b.getNote()){
            System.out.println(c.getNote());
        }else{
            System.out.println(a.getNote());
        }
    }
    public void admis(Etudiant e, boolean res){
    if(e.getNote() >=10){
        res = true;
    }else{
        res = false;
    }
}
     public boolean memegroupe(Etudiant a, Etudiant b){
        if(a.getGrp() == b.getGrp()){
            return true;
        }else{
            return false;
        }
     }
}