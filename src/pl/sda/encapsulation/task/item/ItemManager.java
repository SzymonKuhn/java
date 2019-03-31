package pl.sda.encapsulation.task.item;

import pl.sda.encapsulation.task.item.ItemModel;

public class ItemManager {
    private ItemModel item;


    public void createShopItem(String title, String description, double price) {
        item = new ItemModel(title, description, price);
    }

    public ItemModel getItem() {
        return item;
    }


}
