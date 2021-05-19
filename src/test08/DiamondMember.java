package test08;


public class DiamondMember extends Colleague {
    public DiamondMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String receiver, String text) {
        mediator.sendText(name,receiver,text);
    }

    @Override
    public void sendImage(String receiver, String image) {
        mediator.sendImage(name,receiver,image);
    }
}

