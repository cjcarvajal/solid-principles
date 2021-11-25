package leantech.com.stage.fixed;

public class SMSManager implements IUIManager {

	@Override
	public void show(String message) {
		System.out.println("-----------------------------------------------------------------");
		System.out.println(message);
		System.out.println("-----------------------------------------------------------------");
	}

}
