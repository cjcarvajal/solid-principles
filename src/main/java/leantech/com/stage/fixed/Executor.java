package leantech.com.stage.fixed;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Executor {

	public static void main(String[] args) {

		List<SocialNetworkManager> networkManagers = Arrays
				.asList(new SocialNetworkManager[] { new SMSSocialNetworkManager(), new WebSocialNetworkManager() });

		String message = "This is my first message in both web and sms social networks, Hi to you all";

		networkManagers.stream().forEach(m -> m.post(message));
		networkManagers.stream().forEach(m -> m.refreshTimeline(getInstant()));
	}

	private static Timestamp getInstant() {
		return Timestamp.from(Instant.now());
	}

}
