package leantech.com.stage.fixed;

import java.sql.Timestamp;
import java.util.List;

public interface IRepositoryManager {

	String store(String message);

	List<String> readSince(Timestamp since);

}
