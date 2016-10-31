package TestLiGang;

public class DaemonThread extends Thread{
	//后台线程
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println(getName()+" "+i);
		}
	}
	public static void main(String[] args){
		DaemonThread d = new DaemonThread();
		//将此线程设置为后台线程
		d.setDaemon(true);
		d.start();
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread()
					.getName()+" "+i);
		}
	}
}
