package TestLiGang;

public class DaemonThread extends Thread{
	//��̨�߳�
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println(getName()+" "+i);
		}
	}
	public static void main(String[] args){
		DaemonThread d = new DaemonThread();
		//�����߳�����Ϊ��̨�߳�
		d.setDaemon(true);
		d.start();
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread()
					.getName()+" "+i);
		}
	}
}
