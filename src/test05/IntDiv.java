package test05;

//除法
public class IntDiv implements IDiv {

    @Override
    public String getResult(int numberA, int numberB) {
        return numberB == 0 ? "除数不能为0" : String.valueOf(numberA / numberB);
    }

}

