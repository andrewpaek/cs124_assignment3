import java.util.Random;

/**
 * Created by Jason on 4/23/2016.
 */
public class input_generator {
    public long[] generate(int size) {
        long[] new_array = new long[size];
        for (int i=0; i < size; i++){
            long new_long = random_long();
            new_array[i] = new_long;
        }
        return new_array;
    }

    public long random_long() {
        long leftLimit = 0L;
        long rightLimit = 10^12L;
        long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));

        return generatedLong;
    }
}
