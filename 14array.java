
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        int n = str.length();
        String s = new String("");
        for(int i = 0 ; i < n ; i++){
            
            char c = str.charAt(n -i -1);
            s= s+c;
            
        }
        
        return s;

    }
}

// we can only append a string to a string 
// if char to a string then str = str + char
// this is string declaration String s = new String("");
