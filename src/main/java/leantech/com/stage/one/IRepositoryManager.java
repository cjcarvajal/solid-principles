package leantech.com.stage.one;

import java.sql.Timestamp;
import java.util.List;

public interface IRepositoryManager {

	void store(String message);

	List<String> readSince(Timestamp since);

}
