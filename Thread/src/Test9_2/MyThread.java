package Test9_2;

public class MyThread extends Thread{
	private static int count = 0;
	public MyThread(String name){
		super(name);
	}
	public static void main(String[] args) {
		MyThread p = new MyThread("t1");
		p.start();
		for(int i =0;i<5;i++){
			count++;
			System.out.println(count+":main");
		}
	}
	public void run(){
		for(int i =0;i<5;i++){
			count++;
			System.out.println(count+"::"+count+"::"+this.getName());
		}
	}
}
