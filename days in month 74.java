import java.util.Scanner;

class Day {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int month, year, date;
        System.out.println("enter the month:");
        month = s.nextInt();
        System.out.println("enter the year:");
        year = s.nextInt();
        System.out.println("enter the date:");
        date = s.nextInt();
        double m;
        int y;
        int dow;
        m = (month+9)%12+1;
        if (month <= 2) {
            year--;
        }
        y = 5 * (year % 4) + 4 * (year % 100) + 6 * (year % 400);
        dow = (date + (int) (2.6 * m - 0.2) + y) % 7;
        switch (dow) {
            case 1: {
                String str = "Monday";
                System.out.println("Day:" + str);
                break;
            }
            case 2: {
                String str = "Tuesday";
                System.out.println("Day:" + str);
                break;
            }
            case 3: {
                String str = "Wednesday";
                System.out.println("Day:" + str);
                break;
            }
            case 4: {
                String str = "Thursday";
                System.out.println("Day:" + str);
                break;
            }
            case 5: {
                String str = "Friday";
                System.out.println("Day:" + str);
                break;
            }
            case 6: {
                String str = "Saturday";
                System.out.println("Day:" + str);
                break;
            }
            case 0: {
                String str = "Sunday";
                System.out.println("Day:" + str);
                break;
            }
        }
    }
}