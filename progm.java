import java.util.Scanner;
public class progm {

  
    public static void main(String[] args) {
      int choice;
      System.out.println("Pick one: 1. Hi\n 2. Hey\n 3. hello\n");
      Scanner a=new Scanner(System.in);
      choice=a.nextInt();
      switch(choice)
      {
          case 1:System.out.println("You said Hi");
                  break;
          case 2:System.out.println("You said Hey");
                  break;
          case 3:System.out.println("You said Hello");
                  break;
          default: System.out.println("Invalid choice.");
      }
    }
}
