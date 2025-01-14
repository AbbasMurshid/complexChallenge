public class DishWasher {

    private boolean hasWorkToDo ;

    public void setHasWorkToDo(boolean hasWorkToDo){

        this.hasWorkToDo=hasWorkToDo;

    }

    public void doDishes(){

        if(hasWorkToDo){

            System.out.println("Dish ready to washed!");
        }
        else{
            System.out.println("Dish not ready to washed!");
        }
    }



}
