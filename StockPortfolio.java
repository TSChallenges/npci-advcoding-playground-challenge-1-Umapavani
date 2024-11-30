class StockPortfolio {
    
    private String symbol;
    private int quantity;
    private double buyingPrice;
    private double currentPrice;
    private double highestPrice;

    // TODO: Initialize stock details
    public StockPortfolio(String symbol, int quantity, double buyingPrice) {
        this.symbol = symbol;
        this.quantity= quantity;
        this.buyingPrice = buyingPrice;
        this.currentPrice = buyingPrice;
        this.highestPrice = buyingPrice;
    }

    // TODO: Update current market price
    public void updatePrice(double newPrice) {
        if(newPrice>0){
            if(newPrice>higestPrice){
                highestPrice = newPrice;
            }
        this.currentPrice = newPrice;
        }
    }

    // TODO: Calculate total profit or loss
    public double calculateProfit() {
    
        return (currentPrice - buyingPrice) * quantity;
    }

    // TODO: Calculate current total value of holdings
    public double getCurrentValue() {
        return currentPrice * quantity;
    }
}
