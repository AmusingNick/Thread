package TestLiGang;

public class DrawThread extends Thread{
	private Account account;   //模拟用户账户
	private double drawAmount; //当前取钱线程所希望的钱数
	public DrawThread(String name,Account account, double drawAmount) {
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
	public void run(){
		synchronized(account){
			if(account.getBalance() >= drawAmount){
				System.out.println(getName()
						+"取钱成功!吐出钞票:"+drawAmount);
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				account.setBalance(account.getBalance()-drawAmount);
				System.out.println("\t余额为:"+account.getBalance());
			}
			else{
				System.out.println(getName() + "取钱失败,余额不足");
			}
		}
	}
	
}
