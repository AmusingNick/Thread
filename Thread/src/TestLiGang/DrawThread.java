package TestLiGang;

public class DrawThread extends Thread{
	private Account account;   //ģ���û��˻�
	private double drawAmount; //��ǰȡǮ�߳���ϣ����Ǯ��
	public DrawThread(String name,Account account, double drawAmount) {
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
	public void run(){
		synchronized(account){
			if(account.getBalance() >= drawAmount){
				System.out.println(getName()
						+"ȡǮ�ɹ�!�³���Ʊ:"+drawAmount);
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				account.setBalance(account.getBalance()-drawAmount);
				System.out.println("\t���Ϊ:"+account.getBalance());
			}
			else{
				System.out.println(getName() + "ȡǮʧ��,����");
			}
		}
	}
	
}
