package leantech.com.stage.two;

import java.sql.Timestamp;
import java.util.List;

public interface IRepositoryAndUIManager {
	
	void show(String message);

	String store(String message);

	List<String> readSince(Timestamp since);

}
