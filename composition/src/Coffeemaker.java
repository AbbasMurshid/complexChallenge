public class Coffeemaker {

    private boolean hasWorkToDo ;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Coffeemaker has work to do");

        }
        else{
            System.out.println("Coffeemaker has not work to do");
        }
    }

}
