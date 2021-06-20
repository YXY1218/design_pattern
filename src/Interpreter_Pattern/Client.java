package Interpreter_Pattern;

public class Client {
	// 解释器模式
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expression isMale = getMalExpression();
		Expression isMarriedWoman = getMarriedWoman();

		System.out.println("John is male?" + isMale.interpret("John"));
		System.out.println("Julie is a married woman?" + isMarriedWoman.interpret("Married Julie"));
	}

	// 规则:Julie 是一个已婚的女性
	private static Expression getMarriedWoman() {
		// TODO Auto-generated method stub
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	// 规则:Robert和John是男性
	public static Expression getMalExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

}
