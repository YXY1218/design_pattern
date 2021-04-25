package test05;

//double 工厂类
public class DoubleFactory implements IFactory {

    @Override
    public IAdd createAdd() {
        return new DoubleAdd();
    }

    @Override
    public IDiv createDiv() {
        return new DoubleDiv();
    }

}
