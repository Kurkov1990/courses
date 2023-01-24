package lesson13.homework;

public class Month {

   void dayCount (int num) {
       switch (num) {
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               System.out.println("Month has 31 days");
               break;
           case 4:
           case 6:
           case 9:
           case 11:
               System.out.println("Month has 30 days");
               break;
           case 2:
               System.out.println("Month has 28 days");
               break;
           default:
               System.out.println("incorrect number");
       }
   }

    public static void main(String[] args) {
        Month m1 =new Month();
        m1.dayCount(174);
    }
}
