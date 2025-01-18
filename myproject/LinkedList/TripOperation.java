package myproject.LinkedList;

import java.util.LinkedList;


public class TripOperation {

    LinkedList<Town> list;
    private String startingTown;



    private String tripName;

    public TripOperation(String tripName , Town StartPlace) {

        this.tripName = tripName;

        list = new LinkedList<>();
        list.offerFirst(StartPlace);
        this.startingTown = tripName;
    }
    public TripOperation(String tripName){
        this.tripName = tripName;
    }


    public TripOperation(Town StartPlace) {
        list = new LinkedList<>();
        list.offerFirst(StartPlace);
        this.startingTown = StartPlace.getTownName();
    }

    public void addTown(Town town) {

        if(list.contains(town)) {
            System.out.println("Town already exists in plan");
        }
        else {
            list.add(town);
            System.out.println("Added Town " + town);
        }

    }

    public void removeTown(String townName) {

        var Iterator = list.listIterator();
        while(Iterator.hasNext()) {
            if(townName.equals(((Town)Iterator.next()).getTownName())) {
                Iterator.remove();
                System.out.println("Removed Town " + townName);

            } else if(townName.equals(((Town)Iterator.previous()).getTownName())) {
                System.out.println("Town does not exist in plan");

            }


        }



    }

    private  void sortingByDistance() {

        Town town;

        for(int i = 0 ; i<list.size() ; i++) {
            for(int j = i+1 ; j<list.size() ; j++) {
                if(list.get(i).getDistance() > list.get(j).getDistance()) {
                    town = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, town);
                }
            }
        }

    }

    public LinkedList<Town> tripStart() {
        sortingByDistance();
        var trip = list.listIterator(1);

        String startPosition = startingTown;


        while(trip.hasNext()) {

            System.out.println("From--> "+startPosition+ " to " + trip.next());
            if(trip.previous().getTownName().equals(startPosition)) {
                break;
            }
            startPosition = trip.next().getTownName();


        }

        return list;

    }



    public LinkedList<Town> getTown() {
        System.out.println(list);

        return list;
    }

    public String tripName() {
        return tripName;
    }

}
