package leantech.com.stage.fixed;

public class WebManager implements IUIManager {

	private String htmlTemplate = "<html>\n<body>\n<h1>\n\t%s\n</h1>\n</body>\n</html>";

	@Override
	public void show(String message) {
		System.out.println("-----------------------------------------------------------------");
		System.out.println(String.format(htmlTemplate, message));
		System.out.println("-----------------------------------------------------------------");
	}

}
