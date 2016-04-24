import java.util.Random;
/**
 * Created by Andrew on 4/19/2016.
 */
public class Rep_1 extends representation{
    private int[] representation_array;
    private int array_length;
    private int[] user_input;

    // may be a more efficient way to generate this

    public Rep_1(int[] input_array){
        array_length = input_array.length;
        user_input=input_array;
        representation_array=generate(array_length);
    }


    public int[] generate(int size){
        int[] temp_array=new int[size];
        int random_number;
        Random generator = new Random();
        for (int i=0; i<array_length; i++) {
            random_number = generator.nextInt(2);
            if (random_number==1){
                temp_array[i]=1;
            }
            else{
                temp_array[i]=-1;
            }
        }
        return temp_array;
    }

    public int[] random_step(int[] input_array){
        int[] temp = copy_array(input_array);
        Random generator = new Random();
        int s1 = generator.nextInt(array_length);
        int s2 = generator.nextInt(array_length);
        while (s1==s2){
            s2 = generator.nextInt(array_length);
        }

        int r = generator.nextInt(2);
        if (r==0){
            temp[s1]*=-1;
            temp[s2]*=-1;
        }
        else {
            temp[s1] *= -1;
        }
        return temp;
    }

    public int residue(int[] ones){
        int res=0;
        for (int i=0; i<array_length; i++){
            res+=user_input[i]*ones[i];

        }
        return Math.abs(res);
    }
    public int[] return_array(){
        return representation_array;
    }

}
