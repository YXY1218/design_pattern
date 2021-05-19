package test08;



import java.util.HashMap;
import java.util.Map;

//抽象中介者类
public  abstract class Mediator {
    //定义会员集合
    protected Map<String,Object> colleagues=new HashMap<String,Object>();
    //注册会员
    public void register(Colleague colleague)
    {
        colleagues.put(colleague.getName(),colleague);
        colleague.setMediator(this);
    }
    public abstract void sendText(String sender,String receiver,String text);
    public abstract void sendImage(String sender,String receiver,String image);

}

