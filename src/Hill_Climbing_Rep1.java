/**
 * Created by Andrew on 4/19/2016.
 */
public class Hill_Climbing_Rep1 {

    public int trial (int[] input_array, int max_iter, String key){

        representation r;
        if (key.equals("one")){
            r = new Rep_1(input_array);
        }
        else {
            r = new Rep_2(input_array);
        }


        int[] temp1=r.return_array();
        int[] temp2;
        for (int i=0; i<max_iter; i++){
            temp2=r.random_step(temp1);
            r.print(temp1);
            System.out.println(r.residue(temp1));
            r.print(temp2);
            System.out.println(r.residue(temp2));
            if (Math.abs(r.residue(temp2))<Math.abs(r.residue(temp1))){
                temp1=temp2;
            }
            System.out.println("BREAK");
        }
        return r.residue(temp1);
    }

}
