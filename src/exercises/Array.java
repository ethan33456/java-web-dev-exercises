package exercises;

public class Array {
    public static void main(String[] args) {
        Integer[] values = new Integer[6];
        values = new Integer[]{1, 1, 2, 3, 5, 8};
        for (int i = 0; i < 6; i++) {
            System.out.println(values[i]);
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = new String[31];
        words = phrase.split(" ");
        System.out.println(words.toString());

    }
}
