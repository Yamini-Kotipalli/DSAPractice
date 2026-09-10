package Arrays.com;

public class MovieTicket {
	 // Private data members
    private String movieName;
    private int cost;
    private String area;
    private int time;

    // Getter Methods
    public String getMovieName() {
        return movieName;
    }

    public int getCost() {
        return cost;
    }

    public String getArea() {
        return area;
    }

    public int getTime() {
        return time;
    }

    // Setter Methods
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setTime(int time) {
        this.time = time;
    }

    // Main Method
    public static void main(String[] args) {

        MovieTicket mt = new MovieTicket();

        // Setting values
        mt.setMovieName("Bahubali");
        mt.setCost(70);
        mt.setArea("Hyderabad");
        mt.setTime(10);

        // Getting values
        System.out.println("============= Movie Ticket Details =============");
        System.out.println("Movie Name : " + mt.getMovieName());
        System.out.println("Ticket Cost: ₹" + mt.getCost());
        System.out.println("Area       : " + mt.getArea());
        System.out.println("Show Time  : " + mt.getTime() + " AM");
    }
    	   	 	 
    	 
 }

