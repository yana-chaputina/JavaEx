public class SportmasterClient {
    private int totalCost=0;

    public int getTotalCost() {
        return totalCost;
    }

    public void increaseTotalCost(int cost) {
        this.totalCost += cost;
    }
}
