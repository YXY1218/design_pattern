package test09;


public class Client {
    public static void main(String[] argv) {
        Cahier cahier = new Cahier();
        cahier.setName("公司计划执行");
        cahier.setContent("需尽快完成以下内容");
        cahier.setPersons("请工具人一号制定明天的活动并提交报告给工具人二号");
        System.out.println("原来的内容：" + cahier.getName() + " :" + cahier.getContent() +  " :" + cahier.getPersons());
        Memento memento = cahier.getMemento();
        //进行其它代码的处理
        cahier.setName("公司假期安排");
        cahier.setContent("放假安排");
        cahier.setPersons("给工具人一号放假");
        System.out.println("修改后的内容：" + cahier.getName() + " :" + cahier.getContent() +  " :" + cahier.getPersons());
        //恢复原来的代码
        cahier.setMemento(memento);
        System.out.println("恢复到原来的内容：" + cahier.getName() + " :" + cahier.getContent() +  " :" + cahier.getPersons());
    }
}

