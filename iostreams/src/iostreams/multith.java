package iostreams;

public class multith extends Thread {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		multith mt = new multith();
		mt.start();
		
		for (int j=1; j<=200 ; j++) {
			System.out.println("j:"+j+"\t");
			Thread.sleep(1000);
		}

	}
	public void run() {
		for(int i = 1; i<=200;i++) {
			System.out.println("i:"+ i+"\t");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.out.println("Child thread");
			}
		}
	}

}
