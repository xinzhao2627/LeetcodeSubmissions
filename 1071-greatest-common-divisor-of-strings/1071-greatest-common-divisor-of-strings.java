import java.util.ArrayList;
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        ArrayList<String> candidates = new ArrayList<String>();
        String winner = "";
        String x = "";
        int curlen1 = str1.length();
        int curlenstr2 = str2.length();

        for (int i = 0; i < str2.length(); i++){
            x += str2.charAt(i);
            int curlen2 = x.length();
    
            boolean proceed = true;
            if ((curlen1 % curlen2 == 0) &&(curlenstr2 % curlen2 ==0) ){ // if you can divide the current stack of word to str1
                System.out.println("str2 length: "+curlen2 + " str1 len: " + curlen1);
                for (int j = 0; j < curlen1; j+=curlen2){// jump by every curlen of string 1
                    for(int k = 0; k < curlen2; k++){
                        char c2 = str2.charAt(k);// char of the divisor
                        char c1 = str1.charAt(k + j); // char of string1 from landed jump to curlen

                        int res = c2 - c1;
                        if (res != 0){ // if the result is not divisible
                            proceed = false;
                            break;
                        }
                    }
                    if (!proceed){ // if there is any consistency
                        break;
                    }
                }
                for (int j = 0; j < curlenstr2; j+=curlen2){// jump by every curlen of string 1
                    for(int k = 0; k < curlen2; k++){
                        char c2 = str2.charAt(k);// char of the divisor
                        char c3 = str2.charAt(k + j); // char of string1 from landed jump to curlen

                        int res = c2 - c3;
                        if (res != 0){ // if the result is not divisible
                            proceed = false;
                            break;
                        }
                    }
                    if (!proceed){ // if there is any consistency
                        break;
                    }
                }


                if (proceed){
                    candidates.add(x);
                    System.out.println("str2 length added: "+curlen2);

                }
            }
            
        }
        // get the gcd
        for (String c : candidates){
            
            if (c.length() > winner.length()){
                System.out.println("candidate: "+c); 
                winner = c;
            }
        }
        return winner;
    }
}