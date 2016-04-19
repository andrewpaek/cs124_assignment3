import java.util.Random;

/**
 * Created by Andrew on 4/19/2016.
 */
public class Rep_1 {
    private int[] representation_array;
    private int length;

    // may be a more efficient way to generate this

    public Rep_1(int[] input_array){
        int length = input_array.length;
        representation_array=new int[length];
        int random_number;
        Random generator = new Random();
        for (int i=0; i<length; i++) {
            random_number = generator.nextInt(2);
            if (random_number==1){
                representation_array[i]=1;
            }
            else{
                representation_array[i]=-1;
            }
        }
    }

    public void print_solution(){
        for (int i:representation_array){
            System.out.println(i);
        }
    }

    public void random_step(){
        Random generator = new Random();
        int s1 = generator.nextInt(length);
        int s2 = generator.nextInt(length);
        while (s1==s2){
            s2 = generator.nextInt(length);
        }

        int r = generator.nextInt(2);
        if (r==0){
            representation_array[s1]*=-1;
            representation_array[s2]*=-1;
        }
        else {
            representation_array[s1] *= -1;
        }
    }

}
