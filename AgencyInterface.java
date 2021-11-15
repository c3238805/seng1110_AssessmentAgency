import java.util.*;

public class AgencyInterface 
{
  static Scanner console = new Scanner(System.in);
  static Couple c = new Couple(); 

  public static void main (String[] args) 
  {
        int choice,position;
        
        showSelection(); 
        choice = console.nextInt();
        while(choice != 9)  {
            switch(choice) {
                case 1: addCouple();
                        break;
                case 2: System.out.print("inform the number of the couple");
                        position = console.nextInt();
                        testCouple(position);
                        break;
                case 3: System.out.print("inform the number of the couple");
                        position = console.nextInt();
                        displayCouple(position);
                        break;
                case 9: break;
                default: System.out.println("Invalid Selection");
           }//end switch    
        showSelection(); 
        choice = console.nextInt();
    }
 }      
 public static void showSelection()
 {
    System.out.println("Select and enter");
    System.out.println("1 - add a new couple");
    System.out.println("2 - test a couple");
    System.out.println("3 - display couple");
    System.out.println("9 - exit");
 }
 public static void addCouple() 
 {
    String   herName,hisName;
    int    herAge,hisAge;

    System.out.print("her name: ");  herName = console.next();
    System.out.print("her age: ");   herAge= console.nextInt();
    System.out.print("his name: ");  hisName = console.next();
    System.out.print("his age: ");   hisAge= console.nextInt();
    c.addData(herName,herAge,hisName,hisAge);
 }
 public static void testCouple (int position)
 {
    System.out.println(c.test(position));           
 }
 public static void displayCouple(int position)
 {
    System.out.println(c.display(position));           
 }
}