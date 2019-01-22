package model;

public class DBItem {

	private int id;
	private String title;
	private String body;
	private int bookmark;

	public DBItem() {
		super();
	}

	public DBItem(int id, String title, String body, int bookmark) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.bookmark = bookmark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getBookmark() {
		return bookmark;
	}

	public void setBookmark(int bookmark) {
		this.bookmark = bookmark;
	}

}
