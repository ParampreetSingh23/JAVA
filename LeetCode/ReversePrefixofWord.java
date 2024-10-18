public interface ReversePrefixofWord {
  public static String reversePrefix(String word, char ch) {
    String result = new String() ;
    String nstr ="";
    for(int i = 0;i<word.length();i++){
      if(word.charAt(i)==ch){
        String last = word.substring(i+1);
        for(int j = 0;j<=i;j++){
          char temp = word.charAt(j);
          nstr = temp + nstr;
         
        }
        result = nstr+last;
        break;
      }
      else{
        result = word;
      }
  
   
    
    }
    return result;

  }
  public static void main(String[] args) {
    String word = "abcd";
    char ch = 'z';
   System.out.println( reversePrefix(word, ch));
  }
}
