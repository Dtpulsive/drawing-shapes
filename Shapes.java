public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
        Turtle isamu = new Turtle();
        for (int i = 1; i <= 5; i++) {
         isamu.forward(100);
         isamu.left(72);
        }        
         
        // Task 2: Draw a regular shape many times
         for (int i = 1; i <= 10; i++) {
               isamu.forward(100);
               isamu.left(30);
            for ( int j = 1; j <= 9; j++) {
               isamu.forward(100);
               isamu.left(160);
            }
         }
         isamu.forward(500);
        // Task 3: How many times does Turtle turn!
         int sum = 0;
         for (int i = 1; i <= 10; i++) {
               isamu.forward(100);
               isamu.left(30);
               
            for ( int j = 1; j <= 9; j++) {
               isamu.forward(100);
               isamu.left(160);
               sum++; 
              
            }
         }
         System.out.println("Isamu has turned " + sum + " times!");
       
        // Extension 1:


        // Extension 2:

    }
}