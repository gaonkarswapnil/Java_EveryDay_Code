package day7;

public class MessageWithoutSync {
	private String content;

	public MessageWithoutSync(String content) {
		this.content = content;
	}
	
	public void printMessage() throws InterruptedException{
		System.out.println("*****************");
		Thread.sleep(2000);
		System.out.println(content);
		Thread.sleep(2000);
		System.out.println("*****************");
		Thread.sleep(2000);
	}
}
