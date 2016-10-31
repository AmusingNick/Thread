package Test9_6;

public class InterruptTest2 extends Thread{
	static int result = 0;
	public InterruptTest2(String name){
		super(name);
	}
	public static void main(String[] args) {
		System.out.println("主线程执行");
		Thread t = new InterruptTest2("计算线程");
		t.start();
		System.out.println("result:"+result);
		try{
			long start = System.nanoTime();
			t.join(10);
			long end = System.nanoTime();
			t.interrupt();
			System.out.println((end - start)/1000000+"ms后:"+result);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void run(){
		System.out.println(this.getName()+"开始计算---");
		for(int i = 0;i<100000;i++){
			result++;
			if(Thread.interrupted()){
				System.out.println(this.getName()+"被中断");
				return;
			}
		}
		System.out.println(this.getName()+"结束计算");
	}
}
