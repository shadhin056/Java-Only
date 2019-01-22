package model;

public class Item {
	
	private String title;
	private String body;
	
	public Item(String title, String body) {
		super();
		this.title = title;
		this.body = body;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	

}
