package TestTongBu;

public class DrawThread extends Thread{
	private Account account;   //模拟用户账户
	private double drawAmount; //当前取钱线程所希望的钱数
	public DrawThread(String name,Account account, double drawAmount) {
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
	public void run(){
		account.draw(drawAmount);
	}
}
