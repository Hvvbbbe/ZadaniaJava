package wyszukiwarkaLotów;


import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        FlightDataBase database = new FlightDataBase();
        database.checkIfFlightExists("Berlin","Paris");
        database.displayFlightsFromCity("Berlin");
        database.displayFlightsToCity("Paris");
        ArrayList<String> cities = database.getCities();
        System.out.println(cities);
        Flight cheapestFlight = database.getCheapestFlight();
        System.out.println("Cheapest Flight: " + cheapestFlight.getDetails());
        Flight cheapestFlightFromCity = database.getCheapestFlighFromCity("Warsaw");
        System.out.println("Cheapest Flight from Warsaw is: " + cheapestFlightFromCity.getDetails());
        ArrayList journeys = database.getFlights("Paris", "Porto");
        journeys.toString();
    }
}

class Flight{
    String departure;
    String arrival;
    int price;

    public Flight(String departure, String arrival, int price){
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }

    public String getDetails(){
        return "Flight from " + this.departure + " to " + this.arrival +  " costs " + this.price;
    }

}

class FlightDataBase{
    ArrayList<Flight> flights = new ArrayList<Flight>();

    public FlightDataBase(){
        this.flights.add(new Flight("Berlin", "Tokyo", 1800));
        this.flights.add(new Flight("Paris", "Berlin", 79));
        this.flights.add(new Flight("Warsaw", "Paris", 120));
        this.flights.add(new Flight("Madrid", "Berlin", 200));
        this.flights.add(new Flight("Berlin", "Warsaw", 77));
        this.flights.add(new Flight("Paris", "Madrid", 180));
        this.flights.add(new Flight("Porto", "Warsaw", 412));
        this.flights.add(new Flight("Madrid", "Porto", 102));
        this.flights.add(new Flight("Warsaw", "Madrid", 380));

    }

    public void checkIfFlightExists(String start, String end){
        for(Flight flight: this.flights){
            if(start.equals(flight.departure) && end.equals(flight.arrival)){
                System.out.println("This flight exist!");
                return;

            }
        }
        System.out.println("This flight not exist!");
    }

    public ArrayList<Flight> getFlightsFromCity( String city){
        ArrayList<Flight> results = new ArrayList<Flight>();
        for(Flight flight: this.flights){
            if (city.equals(flight.departure)){
                results.add(flight);

            }

        }
        return results;
    }

    public ArrayList<Flight> getFlightsToCity(String city){
        ArrayList<Flight> results = new ArrayList<Flight>();
        for(Flight flight: this.flights){
            if (city.equals(flight.arrival)){
                results.add(flight);

            }

        }
        return results;
    }

    public void displayFlights(ArrayList<Flight> results){
        if(results.isEmpty()){
            System.out.println("Flight not found");
        }
        for( int i=0; i<results.size(); i++){
            Flight flight = results.get(i);
            System.out.println(flight.getDetails());
        }
    }
    public void displayFlightsFromCity(String city){
        ArrayList<Flight> results = getFlightsFromCity(city);
        displayFlights(results);
    }
    public void displayFlightsToCity(String city){
        ArrayList<Flight> results = getFlightsToCity(city);
        displayFlights(results);
    }

    public ArrayList<String> getCities(){
        ArrayList<String> cities = new ArrayList<>();
        for(Flight flight: this.flights){
            if(!cities.contains(flight.departure)){
                cities.add(flight.departure);
            }
            if(!cities.contains(flight.arrival)){
                cities.add(flight.arrival);
            }
        }
        return cities;
    }
    public Flight getCheapestFlight(){
        Flight cheapestFlight = null;
        for(Flight flight: this.flights)
            if(cheapestFlight == null || flight.price < cheapestFlight.price){
                cheapestFlight = flight;
            }
        return cheapestFlight;
    }

    public Flight getCheapestFlighFromCity(String city){
        ArrayList<Flight> fromCity = getFlightsFromCity(city);
        Flight cheapestFlight = null ;
        for(Flight flight: fromCity){
            if(cheapestFlight == null || flight.price < cheapestFlight.price){
                cheapestFlight = flight;
            }

        }return cheapestFlight;
    }

    public ArrayList<Journey> getFlights(String start, String end){
        ArrayList<Flight> starting = getFlightsFromCity(start);
        ArrayList<Flight> ending = getFlightsFromCity(end);
        ArrayList<Journey> results= new ArrayList<Journey>();
        for(Flight first: starting){
            for (Flight second: ending){
                if(first.arrival.equals(second.departure)){
                    results.add(new Journey(first, second));
                }
            }
        }
        return results;
    }
}

class Journey{
    Flight first;
    Flight second;
    public Journey(Flight first, Flight second){
        this.first = first;
        this.second = second;
    }
    public String toString(){
        return "Flight from " + first.departure + " to " + second.arrival + " with stop at " + first.arrival + " costs " + (first.price + second.price);
    }
}


