
package paparon.it2b;

import java.util.*;


public class hotel {
   

   
    Scanner sc = new Scanner(System.in);
    hotels[] hl = new hotels[100];
    
    Set<Integer> idSet = new HashSet<>();
    
    int num;
    
    public void addhotel() {
        while (true) {
            System.out.print("Enter number of Bookings: ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num > 0 && num <= 50) {
                    break;
                } else {
                    System.out.println("You can only book between 1 and 50 rooms.");
                }
            } else {
                System.out.println("Invalid Input. Please enter a number.");
                sc.next(); 
            }
        }
        
        for (int j = 0; j < num; j++) {
            System.out.println("\nDetails of Booking " + (j + 1) + ":");
            
            int id;
            while (true) {
                System.out.print("Booking ID: ");
                if (sc.hasNextInt()) {
                    id = sc.nextInt();
                    if (!idSet.contains(id)) {
                        idSet.add(id);
                        break;
                    } else {
                        System.out.println("This ID already exists. Please enter a unique ID.");
                    }
                } else {
                    System.out.println("Invalid Input. Please enter a number.");
                    sc.next(); 
                }
            }
            sc.nextLine();
            
            System.out.print("Guest Name: ");
            String name = sc.nextLine();
            
            System.out.print("Room Type: ");
            String rtype = sc.nextLine();
            
            System.out.print("Check-in Date: ");
            int cin = sc.nextInt(); 
            
            System.out.print("Check-out Date: ");
            int cout = sc.nextInt();
            
            sc.nextLine();
            
              System.out.print("Payment Status: ");
        String pstats = sc.nextLine().trim().toLowerCase();
         
           String status = null;
        if (pstats.equals("paid")){
            System.out.println("Confirmed");
        }
            else if(pstats.equals("Paid")){
                    
                 System.out.println("Confirmed");   
        } else {
            System.out.println("Pending"); 
        
}
            
            hl[j] = new hotels(); 
            hl[j].gethotels(name, rtype, pstats, status, id, cout, cin); 
        }
        
        System.out.printf("|%-10s|%-15s|%-15s|%-15s|%-15s|%-15s|%-10s|\n", 
                          "Booking ID", "Guest Name", "Room Type", "Check-in Date", "Check-out Date", "Payment Status", "Status");
        
        for (int j = 0; j < num; j++) {
            hl[j].viewhotels(); 
        }
    }
    
}



