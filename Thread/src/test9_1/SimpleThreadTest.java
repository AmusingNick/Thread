package test9_1;

public class SimpleThreadTest {
	public static void main(String[] args) {
		Thread sum = new SumThread();
		Thread suqareSum = new SquareSumThread();
		sum.start();
		suqareSum.start();
	}
}
class SquareSumThread extends Thread{
	public void run(){
		int sum = 0;
		for(int i =0;i<=1000;i++){
			sum += i*i;
		}
		System.out.println("平方和为："+sum);
	}
}

class SumThread extends Thread{
	public void run(){
		int sum = 0;
		for(int i =0;i<=1000;i++){
			sum+=i;
		}
		System.out.println("和为："+sum);
	}
}