import java.util.Scanner;



public class guss_number {
    static int generate(){
        int num = (int)(Math.random()*100);
        return num;
    }
    static void play(int generated_number){
        Scanner sc = new Scanner(System.in);
        int usernumber =0;
        while(usernumber>=0){
            System.out.print("Enter the number: ");
            usernumber = sc.nextInt();

            if(usernumber == generated_number){
                System.out.println("=============\nWOOHOO!! Correct number.\n===============");
                break;
            }
            else if(usernumber > generated_number){
                System.out.println("your number is greater.");
            }
            else{
                System.out.println("your number is smaller.");
            }
        }

        System.out.println("The number was: "+ generated_number);
        System.out.println("Thanks for playing this game.");
        System.out.println("===============================================\n");
        System.out.print("To play again enter 1 or To stop enter -1: ");
        int playagain = sc.nextInt();
        if(playagain == 1){
            play(generate());
        }else{
            sc.close();
        }
    }
    public static void main(String[]  args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Welcome to this game. \"Guss the number\".");

        // to play again
        System.out.print("To play enter 1 or stop enter -1 : ");
        int playagain = sc.nextInt();
        if(playagain == 1){
            play(generate());
        }else{
            System.out.println("Ivalid input!");
            sc.close();
        }
    }
}
