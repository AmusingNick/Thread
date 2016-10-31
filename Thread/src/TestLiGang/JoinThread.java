package TestLiGang;

public class JoinThread extends Thread{
	//提供一个有参数的构造器,用于设置该线程的名字
	public JoinThread(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(getName()+" "+i);
		}
	}
	public static void main(String[] args) {
		//启动子线程
		new JoinThread("新线程").start();
		for(int i=0;i<100;i++){
			if(i==20){
				JoinThread jt = new JoinThread("被Join的线程");
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
