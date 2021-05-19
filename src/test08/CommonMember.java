package test08;

public class CommonMember extends Colleague {
    public CommonMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String receiver, String text) {
        mediator.sendText(name,receiver,text);
    }

    @Override
    public void sendImage(String receiver, String image) {
        System.out.println("普通会员不能发送图片！");
    }
}
