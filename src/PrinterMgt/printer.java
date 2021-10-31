package PrinterMgt;

import Details.Provider;
import Enumerations.ProductState;

public class printer {
    //    composition
    private long id;
    private Provider provider;
    private String Type_imp;
    private double price;
    private float vit_imp;
    private int nb_max_papier;
    private ProductState state;

    public printer()
    {
        this.id=1;
        this.provider=new Provider();
        this.Type_imp="";
        this.price=0.0;
        this.vit_imp=0;
        this.nb_max_papier=0;
        this.state=ProductState.AVAILABLE;
    }

    public printer(long id,   Provider provider, String Type_imp, double price, float vit_imp,int nb_max_papier,  ProductState state) {
        this.id = id;
        this.provider = provider;
        this.Type_imp = Type_imp;
        this.price = price;
        this.vit_imp = vit_imp;
        this.nb_max_papier = nb_max_papier;
        this.state = state;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

   public String getType_imp()
   {
       return Type_imp;
   }
   public void setType_imp(String Type_imp)
   {
       this.Type_imp=Type_imp;
   }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public float getvit_imp() {
        return vit_imp;
    }

    public void setvit_imp(float vit_imp) {
        vit_imp = vit_imp;
    }

    public int getnb_max_papier() {
        return nb_max_papier;
    }

    public void setnb_max_papier(int nb_max_papier) {
        nb_max_papier = nb_max_papier;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public ProductState getState() {
        return state;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

}
