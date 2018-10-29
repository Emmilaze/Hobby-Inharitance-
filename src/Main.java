public class Main {
    public static void main(String[] args) {
        Hobby[] hobby = {
                new Volleball(4.5, 254, '4', 63.5f),
                new HourseRiding(8.5, 843, true, (short)79)};

        for (Hobby h : hobby) {
            System.out.println(h.tellAboutHobby());
        }
    }
}