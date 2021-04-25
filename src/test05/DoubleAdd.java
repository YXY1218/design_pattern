package test05;

public class DoubleAdd implements IAdd {

    @Override
    public String getResult(int numberA, int numberB) {
        return String.valueOf((double)numberA + numberB);
    }

}
