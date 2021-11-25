package leantech.com.stage.two;

import java.sql.Timestamp;
import java.util.List;

public class SMSSocialNetworkManager extends SocialNetworkManager {
	
	@Override
	public void post(String message) {
		System.out.println("******************SMS Network Timeline**************************");
		sqlAndWebManager.show(message);
		sqlAndWebManager.store(message);
		System.out.println("******************SMS Network Timeline**************************");
	}

	@Override
	public void refreshTimeline(Timestamp since) {
		System.out.println("******************SMS Network Timeline**************************");
		List<String> readSince = sqlAndWebManager.readSince(since);
		readSince.stream().forEach(m -> sqlAndWebManager.show(m));
		System.out.println("******************SMS Network Timeline**************************");
	}

}
