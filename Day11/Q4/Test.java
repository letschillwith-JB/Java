package Day11.Q4;

import java.util.ArrayList;

public class Test implements Intr{
    @Override
    public int[] display(int p){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1; i<=p; i++){
            int P=0;
            for(int j=2; j<i; j++){
                if(i%j != 0)continue;
                else{
                    P=1;
                }
            }
            if(P == 0)al.add(i);
        }
        int [] arr = new int[al.size()];
        for(int i=0; i<al.size(); i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
}
