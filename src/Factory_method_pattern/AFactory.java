package Factory_method_pattern;

public class AFactory extends Factory {

	public Fruit CreateFruit(){
    	return new Apple();
    }

}
