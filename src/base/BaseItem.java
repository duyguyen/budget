package base;
import java.util.Date;

public abstract class BaseItem{

    // == constants ==
    private StringBuilder name;
    private StringBuilder date;
    private double amount;

    // == constructor ==
    public BaseItem(String name, Date date, double amount) {
        this.name = convertToStringBuilder(name);
        this.date = convertToStringBuilder(date.toString());
        this.amount = amount;
    }

    // == public method ==
    public StringBuilder getName() {
        return name;
    }

    public StringBuilder getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    // == private methods ==
    private StringBuilder convertToStringBuilder(String string){
        return new StringBuilder(string);
    }
}
