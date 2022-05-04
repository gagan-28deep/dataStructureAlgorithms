// Sample Input

// zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc

// Sample Output
// q


import java.io.*;
import java.util.*;

public class hfc {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        HashMap<Character , Integer > hm = new HashMap<>();

        for(int i = 0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                int of = hm.get(ch);
                int nf = of + 1;
                hm.put(ch, nf);
            }
            else{
                hm.put(ch, 1);
            }
        }

        char mfc = str.charAt(0);
        for(Character key : hm.keySet()){
            if(hm.get(key) > hm.get(mfc)){
                mfc = key;
            }
        }

        System.out.println(mfc);

    }

}