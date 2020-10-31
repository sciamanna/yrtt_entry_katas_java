package com.techreturners.exercise004;

import java.util.StringTokenizer;

public class Exercise004 {

    // Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
    // Leave punctuation marks untouched.

    public String pigLatin(String str) {
        // Add your code here
        StringTokenizer st = new StringTokenizer(str);
        String word, result = "";
        char punctuation = '*', lastletter;

        while (st.countTokens() > 0)
        {
            word = st.nextToken();
            lastletter = word.charAt(word.length()-1);
            if ( lastletter == '!' || lastletter == '?' || lastletter == '.' || lastletter == ',' || lastletter == ':' || lastletter == ';' )
            {
                punctuation = word.charAt(word.length()-1);
                word = word.substring(0,word.length()-1);
            }
            result += word.substring(1) + word.charAt(0) + "ay";
            if ( punctuation != '*' )
                result += punctuation;           
            if ( st.hasMoreTokens() )
               result = result + " ";
        }
        //System.out.println("Result '" + result + "'");
        return result;
    }
}
