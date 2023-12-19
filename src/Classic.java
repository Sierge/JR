public class Classic {
    public static void main(String[] args) {
        String mother = "Мама";
        String wash = "Мыла";
        String frame = "Раму";
        System.out.println(String.format("%1$s%2$s%3$s", mother,wash,frame));
        System.out.println(String.format("%1$s%3$s%2$s", mother,wash,frame));
        System.out.println(String.format("%3$s%2$s%1$s", mother,wash,frame));
        System.out.println(String.format("%3$s%1$s%2$s", mother,wash,frame));
        System.out.println(String.format("%2$s%1$s%3$s", mother,wash,frame));
        System.out.println(String.format("%2$s%3$s%1$s", mother,wash,frame));


    }
}