package Command_Pattern;

public class ClientClass {
	//命令模式
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建多个订单
		Order order1 = new Order();
		order1.setId(1);
		order1.setFruitmap("橙子", 1);
		order1.setFruitmap("梨子", 2);
		order1.setFruitmap("苹果", 3);

		Order order2 = new Order();
		order2.setId(2);
		order2.setFruitmap("橙子", 1);
		order2.setFruitmap("梨子", 2);
		order2.setFruitmap("苹果", 3);
		// 创建操作者
		Operator op = new Operator();
		// 将多个订单封装成命令对象
		OrderCommand cmd1 = new OrderCommand(op, order1);
		OrderCommand cmd2 = new OrderCommand(op, order2);
		// 创建调用者并加命令
		WaiterInvoker waiter = new WaiterInvoker();
		waiter.SetCommand(cmd1);
		waiter.SetCommand(cmd2);
		// 执行命令
		waiter.OrderUp();
	}

}
