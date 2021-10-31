package Details;

public class microprocesseur {
    //    composition
    private String marque;
    private float vitesse;
    private float nb_corps;

    public microprocesseur()
    {
        this.marque="";
        this.vitesse=0;
        this.nb_corps=0;
    }
    public microprocesseur(String marque, float vitesse, float nb_corps)
    {
        this.marque=marque;
        this.vitesse=vitesse;
        this.nb_corps=nb_corps;
    }
    public String getMarque()
    {
        return marque;
    }
    public void setMarque(String marque)
    {
        this.marque=marque;
    }
    public float getVitesse()
    {
        return vitesse;
    }
    public void setVitesse(float vitesse)
    {
        this.vitesse=vitesse;
    }
    public float getNb_corps()
    {
        return nb_corps;
    }
    public void setNb_corps(float nb_corps)
    {
        this.nb_corps=nb_corps;
    }
}

