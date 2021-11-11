package day04;

public class Passenger {
    private String name;
    private String ticketCode;
    private int numberOfPackage;


    public Passenger(String name, String ticketCode, int numberOfPackage) {
        this.name = name;
        this.ticketCode = ticketCode;
        this.numberOfPackage = numberOfPackage;
    }

    public String getName() {
        return name;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public int getNumberOfPackage() {
        return numberOfPackage;
    }
}
