public class Human {
    private String name = "человек";

    public void setName(String inputName) {
        name = inputName;
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Макс");
        System.out.println(human.name);
    }

}
