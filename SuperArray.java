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
      data[size]=element;
      size++;
      return true;
    }
  public String get(int index){
    if (data[index]!= null){
      return data[index];
    }
    else {return "none";}
  }
  public String set(int index, String element){
    if (data[index]!= null){
      String ans = data[index];
      data[index]=element;
      return ans;
    }
    return "NO ELEMENT TO REPLACE";
  }
  private void resize(){
    String [] temp = new String [size + 10];
    for (int i = 0; i<data.length; i++){
      temp[i]=data[i];
    }
    
  }
}
