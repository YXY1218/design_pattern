package test05;

public class FactoryPattern {
    public static void main(String[] args){

    }
}
 interface AbstractFactory{
    Phone createPhone(String param);
    Mask createMask(String param);
 }

 //具体工厂
class SuperFactory implements AbstractFactory{

     @Override
     public Phone createPhone(String param){
         return new iPhone();
     }
     @Override
     public Mask createMask(String param) {
         return new N95();
     }
 }

 //产品大类-手机
interface Phone{ }
class iPhone implements Phone{ }

//产品大类-口罩
interface Mask{ }
class N95 implements Mask{ }
