package test08;

//抽象同事者类
public abstract class Colleague
{
    //定义一个中介者
    protected Mediator mediator;
    //定义会员的名字
    protected String name;
    //构造函数
    public Colleague(){}
    public Colleague(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setName(String name) {
        this.name = name;
    }
    //不同的会员发送权限不同
    public abstract void sendText(String to,String message);
    public abstract void sendImage(String to,String image);
    //但都有接受权限
    public void receiveText(String sender,String text)
    {
        System.out.println(sender + "发送文本给" + this.name + "\n内容为：" + text);
    }

    public void receiveImage(String sender,String image)
    {
        System.out.println(sender+ "发送图片给" + this.name + "\n内容为：" + image);
    }

}


