import java.util.*;
class queue_sim{
    static void welcome(){
        System.out.println("Welcome to the Queue Simulation Program");
    }
    static  int add_customer(int customer){
        customer+=1;
        return customer;
    }
    static int serve_cus(int customer){
        if (customer>0){
            customer-=1;
            
            return customer;
           
        }
         
        else{
            System.out.println("queue is empty, no customers to serve.");
            return customer;
        }
    }
    
    static void menu(int customer){
        int choice=0;
        Scanner s=new Scanner(System.in);
        while (choice!=3){
            System.out.println("\n===== QueueSim =====");
            System.out.println("1. Add customer");
            System.out.println("2. Serve customer");
            System.out.println("3. Exit");
            System.out.println("Enter ur choice:");
            choice=s.nextInt();
            switch (choice){
                case 1:
                    customer=add_customer(customer);
                    System.out.println("Customer added to the queue. Total customers: " + customer);
                    break;
                case 2:
                    if (customer>0){
                     customer=serve_cus(customer);
                    System.out.println("Customer served Succesfully."+ customer);}
                    else{
                        System.out.println("Quee is empty. no customers to serve");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the queue simulation program.");
                    break;
                default:
                    System.out.println("Enter a valid number");
            }
        }
    }
    public static void main(String[] args){
        int customer=5;
        welcome();
        menu(customer);
        
    }
    
}