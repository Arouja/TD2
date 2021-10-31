package smartphoneMgt;

import Details.Provider;
import Details.Screen;
import Details.microprocesseur;
import Enumerations.ProductState;

public class smartphone {
        private long id;
        //    composition
        private microprocesseur microprocess;
        private Screen screen;
        private Provider provider;
        private String Battery;
        private double price;
        private int ROM;
        private int RAM;
        private ProductState state;

        public smartphone()
        {
            this.id=1;
            this.provider=new Provider();
            this.microprocess=new microprocesseur();
            this.screen=new Screen();
            this.Battery="";
            this.price=0.0;
            this.ROM=0;
            this.RAM=0;
            this.state=ProductState.AVAILABLE;
        }

        public smartphone(long id, microprocesseur microprocess, Screen screen, Provider provider, String battery, double price, int RAM,  ProductState state) {
            this.id = id;
            this.microprocess = microprocess;
            this.screen = screen;
            this.provider = provider;
            this.Battery = battery;
            this.price = price;
            this.RAM = RAM;
            this.ROM = ROM;
            this.state = state;
        }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public microprocesseur getMicroprocess() {
        return microprocess;
    }

    public void setMicroprocess(microprocesseur microprocess) {
        this.microprocess = microprocess;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getBattery() {
        return Battery;
    }

    public void setBattery(String battery) {
        Battery = battery;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    public int getROM() {
        return ROM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }
    public ProductState getState() {
        return state;
    }

    public void setState(ProductState state) {
        this.state = state;
    }
}
