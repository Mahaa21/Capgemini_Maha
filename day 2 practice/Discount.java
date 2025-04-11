public class Discount{
public static void main(String[] args){
float fees = 125000; 
float discountperc = 10; 
float discount = fees*(discountperc/100);
float amount = fees - discount;
System.out.println("The discount amount is INR " + discount +  " and final discounted fee is INR " + amount);}}
