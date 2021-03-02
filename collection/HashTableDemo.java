
import java.util.Hashtable;
class Temp
{
    int i;
    Temp(int i){
    this.i=i;
    }
    @Override
    public int hashCode()
    {
        return i;
    }
    @Override
    public String toString()
    {
    return i+" ";  
    }
}
public class HashTableDemo {
    public static void main(String[] args) {
      Hashtable<Temp,String> h=new Hashtable<>();  
      h.put(new Temp(5), "A");
      h.put(new Temp(2), "B");
      h.put(new Temp(6), "C");
      h.put(new Temp(15), "D");
      h.put(new Temp(23), "E");
        System.out.println(h);
    }
}
