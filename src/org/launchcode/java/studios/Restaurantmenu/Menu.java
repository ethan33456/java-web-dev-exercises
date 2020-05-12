package org.launchcode.java.studios.Restaurantmenu;

    import java.util.ArrayList;
    import java.util.Date;
    public class Menu {
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        private Date lastUpdated = new Date();
        public void setLastUpdated() {
            this.lastUpdated = new Date();
        }
        public Date getLastUpdated() {
            return lastUpdated;
        }
        protected void setMenuItems(MenuItem aMenuItem) {
            this.menuItems.add(aMenuItem);
            setLastUpdated();
        }
        public ArrayList<MenuItem> getMenuItems() {
            return menuItems;
        }
        public void addMenuItem (MenuItem item) {
            menuItems.add(item);
            setLastUpdated();
        }

        public String toString (){
            String menuItemsToString = "";
            System.out.println("######");
            for (MenuItem item : menuItems){
                String stringItem = item.toString();
                menuItemsToString += stringItem;
                menuItemsToString += "\n";
            }
            return  menuItemsToString;
        }
    }

