package org.launchcode.java.studios.Restaurantmenu;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        MenuItem veggie = new MenuItem(28.00, "best veggie ever", "entree");

        MenuItem burger = new MenuItem(28.00, "best burger ever", "entree");
        Menu mainMenu = new Menu();
        mainMenu.setMenuItems(burger);
        mainMenu.addMenuItem(veggie);
        System.out.println(mainMenu.toString());
//        System.out.println(mainMenu.getAppetizer());
        for (MenuItem item: mainMenu.menuItems) {
         //   System.out.println(item.getDescription());
        }
    }
}
