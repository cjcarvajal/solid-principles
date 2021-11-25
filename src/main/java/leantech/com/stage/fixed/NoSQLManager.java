package leantech.com.stage.fixed;

import java.sql.Timestamp;
import java.util.List;

import leantech.com.db.NoSQLRepository;

public class NoSQLManager implements IRepositoryManager {

	private NoSQLRepository db;

	public NoSQLManager() {
		db = new NoSQLRepository();
	}

	@Override
	public String store(String message) {
		return db.add(message);
	}

	@Override
	public List<String> readSince(Timestamp since) {
		return db.findAllByDate(since);
	}

}
