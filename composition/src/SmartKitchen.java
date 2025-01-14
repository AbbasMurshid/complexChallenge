public class SmartKitchen {

     private Refrigerator iceBox;
     private DishWasher  dishWasher;
     private Coffeemaker brewMaker;

     public void addWater(){

         brewMaker.setHasWorkToDo(true);
         brewMaker.brewCoffee();

     }

     public void pourMilk(){
         iceBox.setHasWorkToDo(true);
         iceBox.orderFood();

     }

     public void loadDishWasher(){
         dishWasher.setHasWorkToDo(true);
         dishWasher.doDishes();
     }
        public void setKitchenState(boolean coffee , boolean washer , boolean milk){
         brewMaker.setHasWorkToDo(coffee);
         dishWasher.setHasWorkToDo(washer);
         iceBox.setHasWorkToDo(milk);



        }

}
