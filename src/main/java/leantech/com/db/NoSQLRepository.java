package leantech.com.db;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class NoSQLRepository {

	private List<String> messagesList;

	public NoSQLRepository() {
		messagesList = new ArrayList<String>();
		messagesList.add("Hello World");
		messagesList.add("I hate the actual president");
		messagesList.add("Javascript is the best programming language, period!");
		messagesList.add(
				"Why do devs earn so much money? I hope I could go back in time and pick a computer science carreer");
		messagesList.add("All work and no play makes Jack a dull boy");
	}

	public String add(String message) {

		messagesList.add(message);
		String databaseId = String.valueOf(ThreadLocalRandom.current().nextInt());
		System.err.println("Message stored in collection, id assigned is " + databaseId);
		return databaseId;
	}

	public List<String> findAllByDate(Timestamp since) {

		String timestampString = since.toString();
		int index = Integer.valueOf(timestampString.substring(timestampString.length() - 1));
		return messagesList.subList(messagesList.size() - index, messagesList.size());
	}

}
