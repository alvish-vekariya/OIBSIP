import java.util.*;

public class NumberGuess{
    public static void limited(){
        Scanner sc = new Scanner(System.in);
        boolean b1 = true;
        while(b1){
            int a = (int)(10 * Math.random() + 100 * Math.random());
            //System.out.println(a);
            System.out.println("How many attempts you want to try = ");
            int atmp = sc.nextInt();
            System.out.println("\nStart Guessing Number = ");
            int n = 0,i=0;

                for(int j=0;j<atmp;j++){
                    i++;
                    int g = sc.nextInt();
                    if(g > a) System.out.println("guess smaller number..."); 
                    else if( g < a) System.out.println("guess larger number..."); 
                    else{
                        System.out.println("You guessed the number..");
                    }
                }

                if(i >= atmp-1) {
                    System.out.println("Your attempts are over..");
                }

                System.out.println();
                System.out.println("You want to play again = \n1.Yes\n2.Return to Menu.");
                int s = sc.nextInt();
                if (s == 1) {
                    continue;
                }
                else{
                    b1 = false;
                } 
        }
    }

    public static void Unlimited(){
        Scanner sc = new Scanner(System.in);
        boolean b1  = true;
        while(b1){
            int a = (int)(10 * Math.random() + 100 * Math.random());
            //System.out.println(a);
            System.out.println("\nStart Guessing Number = ");
            boolean b2 = true;
            int n = 0;

                while(b2){
                    int g = sc.nextInt();

                    if(g > a) {
                        System.out.println("guess smaller number..."); 
                        n++;
                    }
                    else if( g < a) {
                        System.out.println("guess larger number..."); 
                        n++;
                    }
                    else{
                        n++;
                        System.out.println("You are guess the right number with " + n + " attempts.");
                        b2 = false;
                    }
                }

                System.out.println();
                System.out.println("You want to play again = \n1.Yes\n2.Return to Menu");
                int s = sc.nextInt();
                if (s == 1) {
                    continue;
                }
                else{
                    b1 = false;
                } 
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean b1 = true;

        while(b1){
            System.out.println("(:---- NUMBER GUESSING GAME ----:)");
            System.out.println("----------------------------------");
            System.out.println("You want play with \n1.Limited attempts\n2.Unlimited attempts\n3.exit");
            int at = sc.nextInt();
            switch(at){
                case 1: 
                        limited();
                        break;
                case 2:
                        Unlimited();
                        break;
                case 3:
                        b1 = false;
                        break;
                default:
                        System.out.println("Enter valueable input..");
            }
        }
    }
}