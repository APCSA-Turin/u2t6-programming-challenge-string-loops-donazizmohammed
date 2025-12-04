package com.example.project;

public class StringLoops {

   public StringLoops() { }

   //WARM UP 
    // using a for loop remove all 'a' characters from input string
  public String removeA(String str) {
    String answer = "";
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (c != 'a') {
            answer += c;
        }
    }
    return answer;
}

   // WARM UP
   // using a while loop remove all 'a' characters from input string
  public String removeA2(String str) {
    while (str.contains("a")) {
        str = str.replace("a", "");
    }
    return str;
}


   //WARM UP 
   //Reverse a string by counting down from the end to the start
   public String reverseString(String str) {
        String ans = "";
        for (int i = str.length() -1; i >= 0 ; i--) {
            ans += str.charAt(i);
        }
       return ans;
   }


   //WARM UP
   //Reverse a string by counting up from the start to the end
   public String reverseString2(String str) {
    String result = "";
    int i = 0;

    while (i < str.length()) {
        result = str.charAt(i) + result; 
        i++;
    }

    return result;
}


   // using a for loop
   public String replaceCharacterV1(String searchChar, String origStr, String replaceChar) {
    String ans = "";

    for (int i = 0; i < origStr.length(); i++) {
        String current = origStr.substring(i, i + 1);

        if (current.equals(searchChar)) {
            ans += replaceChar;
        } else {
            ans += current;
        }
    }

    return ans;
}



   // using a while loop
    public String replaceCharacterV2(String searchChar, String origStr, String replaceChar) {
        while (origStr.contains(searchChar)) {
            origStr = origStr.replace(searchChar, replaceChar);
        }
        return origStr;
    }

    public int countString(String searchString, String origString) {
   
       int count = 0;
        for(int i = 0; i <= origString.length() - searchString.length(); i++) {
            if(origString.substring(i, i + searchString.length()).equals(searchString)) {
                count++;
            }
        }
        return count;
   }

   public String removeString(String searchString, String origString) {
     while (origString.contains(searchString)) {
        origString = origString.replace(searchString, "");
    }
    return origString;
}


    public void commaSeparated(int fromNum, int toNum) { //the tests will compare your printed output (not a returned string)
        if(fromNum < toNum) {
            for(int i = fromNum; i <= toNum; i++) {
                if(i != toNum) System.out.print(i + ", ");
                else System.out.print(i);
            }
        }
        else {
            for(int i = fromNum; i >= toNum; i--) {
                if(i != toNum) System.out.print(i + ", ");
                else System.out.print(i);
            }
        }
        System.out.println("");
    }




  
    public boolean isPalindrome(String myString) {
    String processed = myString.toLowerCase();
    int left = 0;
    int right = processed.length() - 1;
    
    while(left < right) {
        if(processed.charAt(left) == ' ') {
            left++;
        } else if(processed.charAt(right) == ' ') {
            right--;
        } else if(processed.charAt(left) != processed.charAt(right)) {
            return false;
        } else {
            left++;
            right--;
        }
    }
    return true;
   }


   
    public void multiPrint(String toPrint, int num) { //the tests will compare your printed output (not a returned string)
        System.out.print("[");
        for(int i = 0; i < num; i++) {
            if(i != num-1) System.out.print(toPrint + " ");
            else System.out.print(toPrint);
        }
        System.out.println("]");
    }
}

