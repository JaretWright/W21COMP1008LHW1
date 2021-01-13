public class WarmUpExercise2 {
    public static void main(String[] args) {

        System.out.printf("timeToSki(30) should be false: %b%n", timeToSki(30));
        System.out.printf("timeToSki(31) should be true: %b%n", timeToSki(31));

    }

    public static boolean timeToSki(int snowDepth)
    {
        return snowDepth>30;
    }
}
