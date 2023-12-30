class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String re = "";    
            
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = str.length()-1; i >= 0; i--){    
            re= re + str.charAt(i);    
        }    
        return re;    
        
    }
}
