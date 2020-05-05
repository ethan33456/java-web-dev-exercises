package org.launchcode.java.studios.Restaurantmenu;

    import java.util.ArrayList;
    import java.util.Date;
    public class Menu {
        ArrayList<MenuItem> appetizer = new ArrayList<>();
        ArrayList<MenuItem> mainCourse = new ArrayList<>();
        ArrayList<MenuItem> dessert = new ArrayList<>();
        private Date lastUpdated = new Date();
        public void setLastUpdated() {
            this.lastUpdated = new Date();
        }
        public Date getLastUpdated() {
            return lastUpdated;
        }
        protected void setAppetizer(MenuItem aMenuItem) {
            this.appetizer.add(aMenuItem);
            setLastUpdated();
        }
        public ArrayList<MenuItem> getAppetizer() {
            return appetizer;
        }
    }

