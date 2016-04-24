import java.util.LinkedList;
import java.util.Random;

/**
 * Created by Andrew on 4/20/2016.
 */
public class Rep_2 extends representation {
////    1. generating P randomly
////    2. stepping through P
////    3. Getting residue of P
    private int[] representation_array;
    private int array_length;
    private int[] user_input;

    public Rep_2(int[] input_array){
        array_length=input_array.length;
        representation_array=generate(array_length);
        user_input=copy_array(input_array);
    }

    // GENERATING TOTALLY NEW RANDOM SOLUTIONS

    public int[] generate(int size){
        int random_number;
        int[] temp_array=new int[size];
        Random generator = new Random();
        for (int i=0; i<size; i++){
            random_number=generator.nextInt(array_length);
            temp_array[i]=random_number;
        }
        return temp_array;
    }

    public int[] random_step(int[] input_array){
        int[] temp = copy_array(input_array);
        int s1;
        int s2;
        Random generator = new Random();
        s1=generator.nextInt(input_array.length);
        s2=generator.nextInt(input_array.length);
        while (s1==s2){
            s2=generator.nextInt(input_array.length);
        }
        temp[s1]=s2;
        return temp;
    }

    // input is P, output is A', uses representation_array aka A
    public int residue(int[] input_array){
        karp k = new karp();
        return k.residue(get_Aprime(input_array));
    }

    private int[] get_Aprime(int[] input_array){
        LinkedList<Integer>[] dict = new LinkedList[array_length];
        int[] A_prime = new int[array_length];
        int temp_val;
        int temp_sum=0;
        int ot;
        for (int i=0; i<array_length; i++){
            ot=input_array[i];
            if (dict[ot] == null) {
                dict[ot] = new LinkedList<Integer>();
            }
            dict[ot].add(i);
        }
        for (int j=0; j<array_length; j++){
            if (dict[j]==null){
                continue;
            }
            for (int k=0; k<dict[j].size(); k++){
                temp_val=user_input[dict[j].get(k)];
                temp_sum+=temp_val;
            }
            A_prime[j]=temp_sum;
            temp_sum=0;
        }
        print(A_prime);
        return A_prime;
    }

    public int[] return_array(){

        return representation_array;
    }
}
