package exercises;
import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        values.add(9);
        values.add(10);

        int sum = 0;
    for (Integer value : values) {
        if (value % 2 == 0){
            sum += value;
        }
    }
        System.out.println(sum);

    }

}
