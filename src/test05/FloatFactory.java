package test05;

//float 工厂类
public class FloatFactory implements IFactory {

    @Override
    public IAdd createAdd() {
        return new FloatAdd();
    }

    @Override
    public IDiv createDiv() {
        return new FloatDiv();
    }

}
