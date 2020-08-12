import java.util.Scanner;
class Exp2a
{
  public static void main(String args[])
  { 
    int pizza = 120, top = 15, no_of_pizza, no_of_top;
    float tax = 0.125f, bill, total;
    Scanner S = new Scanner(System.in);
    System.out.print("ENTER NUMBER OF PIZZA(S): ");
    no_of_pizza = S.nextInt();
    System.out.println("");
    System.out.print("ENTER NUMBER OF TOPPINGS TO BE PUT ON PIZZA(S): ");
    no_of_top = S.nextInt();
    total = (pizza*no_of_pizza)+(no_of_top*top*no_of_pizza);
    bill = total + (total*tax);
    System.out.println("  ");
    System.out.println("  ");
    System.out.println("NUMBER OF PIZZA(S) ORDERED:"+no_of_pizza+"     NUMBER OF TOPPINGS TO BE PUT ON THE PIZZA(S):"+no_of_top+"     Bill:Rupees "+bill);
    System.out.println("  ");
    System.out.println("  ");
    System.out.println("THANK YOU FOR ORDERING!!");
   }
}
   