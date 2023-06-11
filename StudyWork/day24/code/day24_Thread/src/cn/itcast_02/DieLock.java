package cn.itcast_02;

public class DieLock extends Thread {
	private boolean flag;

	public DieLock(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		if (flag) {
			synchronized (MyLock.objA) {
				System.out.println("if objA"); // CPU的执行权没有了
				synchronized (MyLock.objB) {
					System.out.println("if objB");
				}
			}
		} else {
			synchronized (MyLock.objB) {
				System.out.println("else objB");
				synchronized (MyLock.objA) {
					System.out.println("else objA");
					System.out.println("i奥委会的哈 家务活付钱肤浅和王菲");
				}
			}
		}   
	}
}

class Test {
	public static void main(String[] args) {
		System.out.println("hdffqihai  金丝猴方式v");
		System.out.println("看到佛山发放jawfiqhfq ");
	}
}
