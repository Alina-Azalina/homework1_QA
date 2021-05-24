public class task2 {
    public static void main (String[] args){
        Man man = new Man();
        Woman woman = new Woman();
        man.wife = woman;
        woman.husband = man;
    }
}
class Man {
    Woman wife;
}
class Woman {
    Man husband;
}