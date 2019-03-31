package pl.sda.encapsulation.task;

import pl.sda.encapsulation.task.item.ItemManager;
import pl.sda.encapsulation.task.item.ItemModel;
import pl.sda.encapsulation.task.user.UserManager;

public class OnlineShop {
    public static void main(String[] args) {

        UserManager user1 = new UserManager();
        user1.createUser("Jan", "Kowalski", 44);

        ItemManager item1 = new ItemManager();
        item1.createShopItem("komputer", "superlaptop", 1200);

        System.out.println(user1.getUser());
        System.out.println(item1.getItem());

    }
}
