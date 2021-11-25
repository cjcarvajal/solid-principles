package leantech.com.stage.fixed;

import java.sql.Timestamp;
import java.util.List;

public abstract class SocialNetworkManager {

	protected IRepositoryManager repositoryManager;
	protected IUIManager uiManager;

	public SocialNetworkManager(IRepositoryManager repositoryManager, IUIManager uiManager) {
		this.repositoryManager = repositoryManager;
		this.uiManager = uiManager;
	}

	public void post(String message) {
		if (message.isEmpty())
			throw new RuntimeException();
		uiManager.show(message);
		repositoryManager.store(message);
	}

	public void refreshTimeline(Timestamp since) {
		List<String> readSince = repositoryManager.readSince(since);
		readSince.stream().forEach(m -> uiManager.show(m));
	}

}
