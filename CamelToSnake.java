class CamelToSnake {

   public static String camelToSnake(String str)
   {
      String word = "";
      char char1= str.charAt(0);
      word = word + Character.toLowerCase(char1);
   
      for (int i = 1; i < str.length(); i++) {
         char char2 = str.charAt(i);
         if (Character.isUpperCase(char2)) {
            word=word+'_';
            word=word+Character.toLowerCase(char2);
         }
         else 
         {
            word = word + char2;
         }
      }
      return word;
   }

   public static void main(String args[])
   {
      String str = "varTwo = 5 - theBestVar";
      System.out.print(camelToSnake(str));
   }
}