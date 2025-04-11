public class ProfitPerc{
public static void main(String[] args){
int cost = 129; 
int selling = 191; 
int profit = selling - cost;
double perc = ((double)profit / cost ) * 100;
System.out.println("The Cost Price is INR " + cost + " and Selling Price is INR " + selling + ".\n" + "The Profit is INR " + profit + " and the Profit Percentage is " + perc +"%.");}}
