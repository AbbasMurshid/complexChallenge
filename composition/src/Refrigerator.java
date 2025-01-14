public class Refrigerator {

    private boolean hasWorkToDo ;

    public void setHasWorkToDo(boolean hasWorkToDo){

        this.hasWorkToDo=hasWorkToDo;

    }






    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ready to order food");
        } else {
            System.out.println("Not ready to order food");
        }

    }
}
