package lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("Monday") {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thuesday":
            case "Friday":
                System.out.println("18-00");
                break;
            case "Saturday":
                System.out.println("14-00");
                break;
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Incorrect day");
        }
    }
}
