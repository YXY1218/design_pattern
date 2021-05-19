package test08;

public class ConcreteMediator extends Mediator {
    @Override
    public void sendText(String sender, String receiver, String text) {
        //通过传入的接收者的名字，获取接收者对象
        Colleague receiver1= (Colleague) colleagues.get(receiver);
        //对不雅字符进行过滤，如将“日”字符，用“*”代替
        String text1=text.replaceAll("日","*");
        receiver1.receiveText(sender,text1);
    }

    @Override
    public void sendImage(String sender, String receiver, String image) {
        Colleague receiver1= (Colleague) colleagues.get(receiver);
        //对发送图片大小进行控制
        if(image.length()>15){
            System.out.println("图片太大，发送失败");
        }
        else{
            receiver1.receiveImage(sender,image);
        }
    }
}

