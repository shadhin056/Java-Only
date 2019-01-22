package model;

public class alltableElement {

	private int id;
	private String title;
	private String tableName;
	private int totalItem;

	public alltableElement() {
		super();
	}

	public alltableElement(int id, String title, String tableName, int totalItem) {
		super();
		this.id = id;
		this.title = title;
		this.tableName = tableName;
		this.totalItem = totalItem;
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

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

}
