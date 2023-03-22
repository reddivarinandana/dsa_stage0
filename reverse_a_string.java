public class Main {
  public static void main(String[] args) {
    String originalStr = "nandana";
    String reverseStr = "";
    System.out.println("Original string: " + originalStr);
        
    for (int i = 0; i < originalStr.length(); i++) {
      reverseStr = originalStr.charAt(i) + reverseStr;
    }
    
    System.out.println("Reverse string: "+ reverseStr);
  }
}

