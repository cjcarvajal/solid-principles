package leantech.com.stage.one;

import java.sql.Timestamp;
import java.util.List;

import leantech.com.db.SQLRepository;

public class SQLAndWebManager implements IRepositoryAndUIManager {

	private String htmlTemplate = "<html>\n<body>\n<h1>\n\t%s\n</h1>\n</body>\n</html>";
	private SQLRepository db;

	public SQLAndWebManager() {
		db = new SQLRepository();
		db.connect();
	}

	@Override
	public String store(String message) {
		return db.insert(message);
	}

	@Override
	public List<String> readSince(Timestamp since) {
		return db.select(since);
	}

	@Override
	public void show(String message) {
		System.out.println("-----------------------------------------------------------------");
		System.out.println(String.format(htmlTemplate, message));
		System.out.println("-----------------------------------------------------------------");
	}

}
