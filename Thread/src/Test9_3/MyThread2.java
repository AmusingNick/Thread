package Test9_3;

public class MyThread2 implements Runnable{
	int count = 1,number;
	public MyThread2(int i){
		number = i;
		System.out.println("�����߳�:"+number);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("�̣߳�"+number+"������"+count);
			if(++count==6){
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			new Thread(new MyThread2(i+1)).start();
		}
	}
}
