package leantech.com.stage.fixed;

import java.sql.Timestamp;

public class SMSSocialNetworkManager extends SocialNetworkManager {

	public SMSSocialNetworkManager() {
		super(new NoSQLManager(), new SMSManager());
	}

	@Override
	public void post(String message) {
		System.out.println("******************SMS Social Network Timeline**************************");
		super.post(message);
		System.out.println("******************SMS Social Network Timeline**************************");
	}

	@Override
	public void refreshTimeline(Timestamp since) {
		System.out.println("******************SMS Social Network Timeline**************************");
		super.refreshTimeline(since);
		System.out.println("******************SMS Social Network Timeline**************************");
	}

}
