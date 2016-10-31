package TestTongBu;


public class Account {
	private String accountNo;
	private double balance;
	public Account (){}
	public Account (String accountNo,double balance){
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public synchronized void draw(double drawAmount){
		if(balance >= drawAmount){
			System.out.println(Thread.currentThread().getName()
					+"ȡǮ�ɹ�!�³���Ʊ:"+drawAmount);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance -= drawAmount;
			System.out.println("\t���Ϊ:"+balance);
		}
		else{
			System.out.println(Thread.currentThread()
					.getName()+ "ȡǮʧ��,����");
		}
	}
	public int hashCode(){
		return accountNo.hashCode();
	}
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj !=null &&obj.getClass() == Account.class){
			Account target = (Account)obj;
			return target.getAccountNo().equals(accountNo);
		}
		return false;
	}
	
}
