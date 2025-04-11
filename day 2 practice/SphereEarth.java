public class SphereEarth{
public static void main(String[] args){
double radius = 6378; 
double formula = (4/3)*3.14;
double kmvolume = formula*radius*radius*radius;
double miles = Math.pow(0.621,3);
double milevolume = kmvolume*miles;

System.out.println("The volume of earth in cubic kilometers is " + kmvolume + " and cubic miles is " + milevolume);}}
