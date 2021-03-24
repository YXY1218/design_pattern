package test02_02;

public class MainClass{
    public static void main(String args[]) {

        AbstractSource source = new TextSource();  //这里用new模拟 XML解析以及反射生成具体类
        AbstractTransformer XMLt = new XMLTransformer(); //这里用new模拟 XML解析以及反射生成具体类

        source.change();
        XMLt.change();

    }
}