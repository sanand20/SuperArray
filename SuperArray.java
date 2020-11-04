public class SuperArray{
  private String [] data;
  private int size;

  public SuperArray() {
    data = new String [10];
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean add(String element){
      for (int i = 0; i<element.length(); i++){
        data[size]=element;
        size++;
      }
      return true;
    }
}
