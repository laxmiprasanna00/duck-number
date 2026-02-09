package Ladderiftask;

public class MovieTheater {

    public double getTicketPrice(int age) {
        if (age < 5) {
            return 0.0;          
        } else if (age <= 12) {
            return 5.0;         
        } else if (age <= 60) {
            return 10.0;         
        } else {
            return 5.0;          
        }
    }

    public static void main(String[] args) {
        MovieTheater theater = new MovieTheater();

        System.out.println("Age 3  -> $" + theater.getTicketPrice(3));
        System.out.println("Age 8  -> $" + theater.getTicketPrice(8));
        System.out.println("Age 25 -> $" + theater.getTicketPrice(25));
        System.out.println("Age 70 -> $" + theater.getTicketPrice(70));
    }
}
