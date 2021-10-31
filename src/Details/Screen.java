package Details;


public class Screen {
    //    composition
    private float nb_taille;
    private String Type_ecr;

    public Screen()
    {
        this.nb_taille=0;
        this.Type_ecr="";
    }

    public Screen(float nb_taille,   String Type_ecr){
        this.nb_taille = nb_taille;
        this.Type_ecr = Type_ecr;
    }
    public float getNb_taille() {
        return nb_taille;
    }

    public void setnb_taille(float nb_taille) {
        this.nb_taille = nb_taille;
    }

    public String getType_ecr()
    {
        return Type_ecr;
    }
    public void setType_ecr(String Type_ecr)
    {
        this.Type_ecr=Type_ecr;
    }

}
