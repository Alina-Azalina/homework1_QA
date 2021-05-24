public class task5 {
    public static void main(String[] args) {
        System.out.println(multiplicationTable(1));
        System.out.println(multiplicationTable(2));
        System.out.println(multiplicationTable(3));
        System.out.println(multiplicationTable(4));
        System.out.println(multiplicationTable(5));
        System.out.println(multiplicationTable(6));
        System.out.println(multiplicationTable(7));
        System.out.println(multiplicationTable(8));
        System.out.println(multiplicationTable(9));
        System.out.println(multiplicationTable(10));
    }
    public static String multiplicationTable (int number){
        //напишите тут ваш код
        String b = "";
        for (int index = 1; index < 11; index++)
        {

          int a =  number * index;
          b = b + a + " ";
    }
        return b;
}
}
