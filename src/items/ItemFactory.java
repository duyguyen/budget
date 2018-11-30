package items;

import java.util.Date;

public class ItemFactory {

    // == public methods ==
    public HomeMorgage createHomeMortgage(){
        Date date = new Date();
        return new HomeMorgage("House Mortgage", date, 1200);
    }

    public CarInsurance createCarInsurance(){
        Date date = new Date();
        return new CarInsurance("State Farm",date, 200);
    }
}
