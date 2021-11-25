package leantech.com.stage.one;

import java.sql.Timestamp;
import java.time.Instant;

public class Executor {

	public static void main(String[] args) {

		SocialNetworkManager manager = new SocialNetworkManager();

		manager.refreshTimeline(getInstant());

		manager.post("This is my first message, hello to all");

		manager.refreshTimeline(getInstant());
	}

	private static Timestamp getInstant() {
		return Timestamp.from(Instant.now());
	}

}
