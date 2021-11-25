package leantech.com.stage.two;

import java.sql.Timestamp;
import java.util.List;

public class SocialNetworkManager {

	protected SQLAndWebManager sqlAndWebManager;

	public SocialNetworkManager() {
		sqlAndWebManager = new SQLAndWebManager();
	}

	public void post(String message) {
		System.out.println("******************Social Timeline**************************");
		sqlAndWebManager.show(message);
		sqlAndWebManager.store(message);
		System.out.println("******************Social Timeline**************************");
	}

	public void refreshTimeline(Timestamp since) {
		System.out.println("******************Social Timeline**************************");
		List<String> readSince = sqlAndWebManager.readSince(since);
		readSince.stream().forEach(m -> sqlAndWebManager.show(m));
		System.out.println("******************Social Timeline**************************");
	}

}
