package Factory_method_pattern;

public class BFactory extends Factory {

    public Fruit CreateFruit(){
    	return new Banana();
    }

}
