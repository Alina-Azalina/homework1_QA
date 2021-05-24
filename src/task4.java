public class task4 {
    public static int convertToSeconds(int hour) {
        int a = hour * 3600;
        return a;
    }


    public static void main(String[] args) {
        System.out.println(convertToSeconds(3));
        System.out.println(convertToSeconds(120));
    }
}
