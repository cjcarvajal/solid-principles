package leantech.com.stage.two;

import java.sql.Timestamp;
import java.time.Instant;

public class Executor {

	public static void main(String[] args) {

		WebSocialNetworkManager webManager = new WebSocialNetworkManager();
		webManager.post("This web UI is really cool");
		webManager.refreshTimeline(getInstant());

		SMSSocialNetworkManager smsManager = new SMSSocialNetworkManager();
		smsManager.post("I love the simplicity of sms");
		webManager.refreshTimeline(getInstant());

		SocialNetworkManager genericManager = new SocialNetworkManager();

		String emptyMessage = "";
		smsManager.post(emptyMessage);
		genericManager.post(emptyMessage);

	}

	private static Timestamp getInstant() {
		return Timestamp.from(Instant.now());
	}

}
