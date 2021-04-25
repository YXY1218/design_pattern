package test05;

public class FloatDiv implements IDiv {

    @Override
    public String getResult(int numberA, int numberB) {
        return numberB == 0 ? "除数不能为0" : String.valueOf((float)numberA / numberB);
    }

}
