public class Tester{
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    System.out.println(words.size());
    System.out.println(words.isEmpty());
    System.out.println(words.add("kani"));
    System.out.println(words.toString());
    System.out.println(words.contains("kan"));
    System.out.println(words.contains("kani"));
    System.out.println(words.contains("gani"));
    words.add(0, "hello");
    System.out.println(words.toArray());
    System.out.println(words.indexOf("hello"));
      System.out.println(words.remove(1));
    System.out.println(words.toString());
    /*for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    System.out.println(words.isEmpty());
    words.clear();
    System.out.println(words.isEmpty());
    System.out.println(words.set(0,"hehe"));
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    */
}
}
