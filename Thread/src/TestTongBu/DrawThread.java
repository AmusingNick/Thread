package TestTongBu;

public class DrawThread extends Thread{
	private Account account;   //ģ���û��˻�
	private double drawAmount; //��ǰȡǮ�߳���ϣ����Ǯ��
	public DrawThread(String name,Account account, double drawAmount) {
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
	public void run(){
		account.draw(drawAmount);
	}
}
