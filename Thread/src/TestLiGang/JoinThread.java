package TestLiGang;

public class JoinThread extends Thread{
	//�ṩһ���в����Ĺ�����,�������ø��̵߳�����
	public JoinThread(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(getName()+" "+i);
		}
	}
	public static void main(String[] args) {
		//�������߳�
		new JoinThread("���߳�").start();
		for(int i=0;i<100;i++){
			if(i==20){
				JoinThread jt = new JoinThread("��Join���߳�");
				jt.start();
				try {
					jt.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread()
					.getName()+" "+i);
		}
	}
}
