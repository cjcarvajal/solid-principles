package leantech.com.stage.fixed;

import java.sql.Timestamp;

public class WebSocialNetworkManager extends SocialNetworkManager {

	public WebSocialNetworkManager() {
		super(new SQLManager(), new WebManager());
	}

	public void post(String message) {
		System.out.println("******************Web Social Network Timeline**************************");
		super.post(message);
		System.out.println("******************Web Social Network Timeline**************************");
	}

	public void refreshTimeline(Timestamp since) {
		System.out.println("******************Web Social Network Timeline**************************");
		super.refreshTimeline(since);
		System.out.println("******************Web Social Network Timeline**************************");
	}

}
