package leantech.com.db;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SQLRepository {

	private List<String> messagesList;

	private boolean connected = false;

	public SQLRepository() {
		messagesList = new ArrayList<String>();
		messagesList.add("Hello World");
		messagesList.add("I hate the actual president");
		messagesList.add("Javascript is the best programming language, period!");
		messagesList.add(
				"Why do devs earn so much money? I hope I could go back in time and pick a computer science carreer");
		messagesList.add("All work and no play makes Jack a dull boy");
	}

	public void connect() {
		connected = true;
	}

	public String insert(String message) {

		if (!connected) {
			throw new RuntimeException();
		}

		messagesList.add(message);
		String databaseId = String.valueOf(ThreadLocalRandom.current().nextInt());
		System.err.println("Message stored with id " + databaseId);
		return databaseId;
	}

	public List<String> select(Timestamp since) {
		if (!connected) {
			throw new RuntimeException();
		}

		String timestampString = since.toString();
		int index = Integer.valueOf(timestampString.substring(timestampString.length() - 1));

		index = index < messagesList.size() ? index : 0;

		return messagesList.subList(messagesList.size() - index, messagesList.size());
	}

}
