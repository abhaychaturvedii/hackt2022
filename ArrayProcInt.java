/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class Main {
    public static int processArray(ArrayList<Integer> arr) {
        
        int maxGreater = -1;

        for(int i=0;i<arr.size()-1;i++)
        {   
            int last = arr.get(i);
            for(int j=i+1;j<arr.size();j++)
            {
                if(arr.get(j) < arr.get(j-1))
                    break;
                
                last = arr.get(j);
            }

            maxGreater = Math.max(maxGreater,Math.abs(last - arr.get(i)));
        }
        
        for(int i=0;i<arr.size()-1;i++)
        {   
            int last = arr.get(i);
            for(int j=i+1;j<arr.size();j++)
            {
                if(arr.get(j) > arr.get(j-1))
                    break;
                
                last = arr.get(j);
            }

            maxGreater = Math.max(maxGreater,Math.abs(last - arr.get(i)));
        }
        


        return maxGreater;
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(new Integer(num));
        }
        int result = processArray(arrayList);
        System.out.println(result);
    }
}
