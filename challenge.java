import java.util.HashMap;


public class challenge {

    public static void main(String[] args) {
        // From a String Array count all the same similiar
       // String s = "BleegelB";
       // String s = "aaabbbccc";
        String s = "Megahn Markel";
        //arvind.chandok@techmahindra.com

//        int count = 0;
//        int checked[] = new int[26];
//        boolean hasChecked = false;


        HashMap<Character, Integer> uniqueArray = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            if(uniqueArray.containsKey(s.charAt(i))){
                int val = uniqueArray.get(s.charAt(i));
                val += 1;
                uniqueArray.put(s.charAt(i), val);
            } else {
                uniqueArray.put(s.charAt(i), 1);
            }
        }

        System.out.println(uniqueArray);


    }



}
