import java.util.Scanner;

public class PFassignment {

    public static void main(String[] args) {
        
    
                Scanner s = new Scanner(System.in);
                int Rows = 5;
                int SeatsInRow = 6;
                int[][] Cinema = new int[Rows][SeatsInRow];
                while (true) {
                    System.out.println("\nCurrent Seating Arrangement:");
                    displaySeats(Cinema);
                    System.out.print("\nEnter row number (1 to " + Rows + ", or 0 to exit): ");
                    int row = s.nextInt();
                    if (row == 0) {
                        System.out.println("Exiting the booking system.");
                        break;
                    }
                    System.out.print("Enter seat number (1 to " + SeatsInRow + "): ");
                    int seat = s.nextInt();
                    if (Cinema[row - 1][seat - 1] == 0) {
                        Cinema[row - 1][seat - 1] = 1;
                        System.out.println("Seat successfully booked!");
                    } else {
                        System.out.println("Sorry, that seat is already booked.");
                    }
                }
                s.close();
          }
           public static void displaySeats(int[][] cinemaHall) {
                for (int i = 0; i < cinemaHall.length; i++) {
                    for (int j = 0; j < cinemaHall[i].length; j++) {
                        if (cinemaHall[i][j] == 0) {
                            System.out.print("A ");
                        } else {
                            System.out.print("B ");
                        }
                    }
                    System.out.println();
                }
     }
}
        
        
        