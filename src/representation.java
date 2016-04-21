/**
 * Created by Andrew on 4/20/2016.
 */
public class representation {

    public int[] random_step(int[] input_array){
        return input_array;
    }

    public int[] generate(int size){
        int[] temp = {1, 2, 3};
        return temp;
    }

    public int residue(int[] nothing){
        return 0;
    }

    public void print(int[] input_array){
        String s="";
        s+="[";
        for (int i=0;i < input_array.length-1; i++){
            s+=input_array[i];
            s+=", ";
        }
        s+=input_array[input_array.length-1];
        s+="]";
        System.out.println(s);
    }

    public int[] copy_array(int[] input_array){
        int[] temp = new int[input_array.length];
        for (int i=0; i<input_array.length; i++){
            temp[i]=input_array[i];
        }
        return temp;
    }


    public int[] return_array(){
        int[] temp = {1, 2, 3, 4, 5};
        return temp;
    }
}
