package Queue;

public class AntrianApp {
   public static void main(String[] args){
          System.out.println("Siti Aminah Dauda");
           System.out.println("20090102");
           System.out.println(" ");
        
           Antrian antrian = new Antrian(10);
           
           antrian.enqueue(40);
           antrian.display();
           System.out.println();
           
           antrian.enqueue(33);
           antrian.display();
           System.out.println();
           
           System.out.println("nilai yang paling depan = "+ antrian.peek());
           
           antrian.enqueue(60);
           antrian.display();
           System.out.println();
           
           System.out.println("yang diambil dari antrian = "+ antrian.dequeue());
           antrian.display();
           System.out.println();
           
           System.out.println("yang diambil dari antrian = "+ antrian.dequeue());
           antrian.display();
           System.out.println();
           
           antrian.enqueue(54);
           antrian.display();
           System.out.println();
           
           System.out.println("nilai yang paling depan =  "+ antrian.peek());
    
    }
}