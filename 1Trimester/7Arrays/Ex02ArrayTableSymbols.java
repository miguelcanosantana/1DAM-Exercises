public class Ex02ArrayTableSymbols {
  public static void main(String[] args){
  /*
    This way is an alternative

    String[] simbolo = {"a", "x", "", "", "@", "", " ", "+", "Q", ""};

  */

  String[] simbolo = new String[10];

  simbolo[0] = "a";
  simbolo[1] = "x";
  simbolo[4] = "@";
  simbolo[6] = " ";
  simbolo[7] = "+";
  simbolo[8] = "Q";
    
  //Not initialized elements are shown as "null"
    for (int i = 0; i <= 9; i++){
      System.out.print(simbolo[i] + " ");
    }
  }
}

