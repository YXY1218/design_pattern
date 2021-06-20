package Adapter_Pattern;

public class OldJuicer {

    public String onePort(MyFruit fruit){
    	String str = fruit.Get() + "果汁";
        return str;
    }

}
