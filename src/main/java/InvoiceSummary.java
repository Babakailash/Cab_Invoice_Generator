public class InvoiceSummary {
    private final int numOfRides;
    private final double totalFare;
    private final double averageFare;

    public InvoiceSummary(int numOfRide, double totalFare) {
        this.numOfRides = numOfRide;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare/this.numOfRides;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvoiceSummary)) return false;
        InvoiceSummary summary = (InvoiceSummary) o;
        return numOfRides == summary.numOfRides && Double.compare(summary.totalFare, totalFare) == 0 &&
                                                   Double.compare(summary.averageFare, averageFare) == 0;
    }

}
