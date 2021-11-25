package leantech.com.stage.fixed;

import java.sql.Timestamp;
import java.util.List;

import leantech.com.db.SQLRepository;

public class SQLManager implements IRepositoryManager {

	private SQLRepository db;

	public SQLManager() {
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

}
