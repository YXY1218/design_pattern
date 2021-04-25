package test05;

//int 工厂类
public class IntFactory implements IFactory {

    @Override
    public IAdd createAdd() {
        return new IntAdd();
    }

    @Override
    public IDiv createDiv() {
        return new IntDiv();
    }

}
