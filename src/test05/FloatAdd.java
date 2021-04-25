package test05;

public class FloatAdd implements IAdd {

    @Override
    public String getResult(int numberA, int numberB) {
        return String.valueOf((float)numberA + numberB);
    }

}
