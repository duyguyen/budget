import base.BaseItem;
import items.ItemFactory;

import java.util.ArrayList;

public class FinancialTrack {

    // == constants ==
    private ItemFactory factory;
    private ArrayList<BaseItem> items = new ArrayList<>();

    // == constructor ==
    public FinancialTrack(ItemFactory factory) {
        this.factory = factory;
        init();
    }

    // == init ==
    private void init(){
        items.add(factory.createHomeMortgage());
        items.add(factory.createCarInsurance());
    }

    // == public methods ==
    public void run(){
        for (BaseItem item:items){
            System.out.println(item.getName() + ": " + item.getAmount() + "$: " + item.getDate() + "\n");
        }
    }

}
