package test05;

//加法
public class IntAdd implements IAdd {

    @Override
    public String getResult(int numberA, int numberB) {
        return String.valueOf((int)numberA + numberB);
    }

}
