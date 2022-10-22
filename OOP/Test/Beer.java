import java.util.ArrayList;
import java.util.List;

public class Beer {
    private String beerName;
    private int alcPercentage;



    public Beer(String beerName, int alcPercentage) {
        this.beerName = beerName;
        this.alcPercentage = alcPercentage;


    }

    public String getBeerName() {
        return beerName;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public int getAlcPercentage() {
        return alcPercentage;
    }

    public void setAlcPercentage(int alcPercentage) {
        this.alcPercentage = alcPercentage;
    }
}
