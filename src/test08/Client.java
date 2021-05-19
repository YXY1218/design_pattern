package test08;

public class Client {
    public static void main(String[] args) {
        Mediator chatRoom=new ConcreteMediator();
        Colleague colleague1,colleague2;

        colleague1=new CommonMember("工具人一号");
        colleague2=new DiamondMember("工具人二号");

        chatRoom.register(colleague1);
        chatRoom.register(colleague2);

        //测试普通会员的发送权限
        System.out.println("-----------------------------测试普通会员的发送权限---------------------------\n");
        colleague1.sendText("工具人一号","我是普通会员，向你发送文本！");
        colleague1.sendImage("工具人一号","我是普通会员，向你发送图片！");


        //测试钻石会员发送权限
        System.out.println("\n------------------------------测试钻石会员发送权限-----------------------------\n");
        colleague2.sendText("工具人二号","我是钻石会员，向你发送文本！请速速接收吧");
        colleague2.sendImage("工具人二号","我是钻石会员，向你发送图片！请速速查看吧");

        //测试过滤不雅字符
        System.out.println("\n----------------------------------测试过滤某些字符-------------------------------\n");
        colleague1.sendText("工具人一号","我是工具人我是工具人我是工具人");

        //测试发送图片大小
        System.out.println("\n-----------------------------测试发送图片大小---------------------------------\n");
        colleague2.sendImage("工具人二号","测试发送图片大小测试发送图片大小测试发送图片大小测试发送图片大小");
    }
}

