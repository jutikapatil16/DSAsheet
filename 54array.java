class GFG {
  // For each character, store the sequence which should be obtained at its respective position in an array, i.e. for Z, store 9999. For Y, store 999. For K, store 55 and so on.
  // For each character, subtract ASCII value of ‘A’ and obtain the position in the array pointed  by that character and add the sequence stored in that array to a string.
  // If the character is a space, store 0
  // Print 
  // Function which computes the sequence
  static String printSequence(String arr[], String input)
  {
      String output = "";

      // length of input string
      int n = input.length();
      for (int i = 0; i < n; i++) {
          // Checking for space
          if (input.charAt(i) == ' ')
              output = output + "0";

          else {
              // Calculating index for each
              // character
              int position = input.charAt(i) - 'A';
              output = output + arr[position];
          }
      }

      // Output sequence
      return output;
  }

  // Driver Code
  public static void main(String[] args)
  {
      // storing the sequence in array
      String str[]
          = { "2",    "22",  "222", "3",   "33", "333",
              "4",    "44",  "444", "5",   "55", "555",
              "6",    "66",  "666", "7",   "77", "777",
              "7777", "8",   "88",  "888", "9",  "99",
              "999",  "9999" };

      String input = "GEEKSFORGEEKS";
      System.out.println(printSequence(str, input));
  }
}
