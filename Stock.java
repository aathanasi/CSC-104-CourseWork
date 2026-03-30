public class Stock 
{
private String symbol;
private String name;
private double currentPrice;
private double previousClosingPrice;

public Stock(String symbol, String name) 
{
this.symbol = symbol;
this.name = name;
this.currentPrice = 0.0;
this.previousClosingPrice = 0.0;
}

public Stock() 
{
this.symbol = "";
this.name = "";
this.currentPrice = 0.0;
this.previousClosingPrice = 0.0;
}

public String getSymbol() 
{
return symbol;
}

public String getName() 
{
return name;
}

public double getCurrentPrice() 
{
return currentPrice;
}

public double getPreviousClosingPrice() 
{
return previousClosingPrice;
}

public void setCurrentPrice(double currentPrice) 
{
this.currentPrice = currentPrice;
}

public void setPreviousClosingPrice(double previousClosingPrice) 
{
this.previousClosingPrice = previousClosingPrice;
}

public void printStock() 
{
System.out.println("Stock: " + symbol + " " + name + " Closing: " + currentPrice + " Previous: " + previousClosingPrice);
}
}
