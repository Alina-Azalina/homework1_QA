public class task8 {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //if
       /* if (month == 12 || month == 1 || month == 2) {
            System.out.println("зима");
        } else if (month == 4 || month == 5 || month == 3) {
            System.out.println("весна");
        } else if (month == 7 || month == 8 || month == 6) {
            System.out.println("лето");
        } else {
            System.out.println("осень");
        } */
        //switch
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
        }
    }}
