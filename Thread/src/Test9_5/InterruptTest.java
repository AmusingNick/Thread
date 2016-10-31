package Test9_5;

public class InterruptTest extends Thread{
	static int result = 0 ;
	public InterruptTest(String name){
		super(name);
	}
	public static void main(String[] args) {
		System.out.println("主线程执行");
		Thread y = new InterruptTest("计算线程");
		y.start();
		System.out.println("result"+result);
		try {
			long start = System.nanoTime();
			y.join(2000);
			long end = System.nanoTime();
			y.interrupt();
			System.out.println((end-start)/1000000+"ms后:"+result);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void run(){
		System.out.println(this.getName()+"开始计算--");
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(this.getName()+"被中断,结束");
			return;
		}
		result = (int)(Math.random()*10000);
		System.out.println(this.getName()+"计算结束");
	}
}
