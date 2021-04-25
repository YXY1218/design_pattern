package test05;

//主程序代码
public class Test {

    public static void main(String[] args) {
        IFactory factory = new IntFactory();
        IAdd add = factory.createAdd();
        IDiv div = factory.createDiv();
        System.out.println("int工厂：7+3 = " + add.getResult(7, 3));
        System.out.println("int工厂：7/3 = " + div.getResult(7, 3));

        factory = new DoubleFactory();
        add = factory.createAdd();
        div = factory.createDiv();
        System.out.println("double工厂：7+3 = " + add.getResult(7, 3));
        System.out.println("double工厂：7/3 = " + div.getResult(7, 3));

        factory = new FloatFactory();
        add = factory.createAdd();
        div = factory.createDiv();
        System.out.println("float工厂：7+3 = " + add.getResult(7, 3));
        System.out.println("float工厂：7/3 = " + div.getResult(7, 3));
    }

}
