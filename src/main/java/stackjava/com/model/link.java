package stackjava.com.model;

public class link {
	private long id;
	private String link;
	
	
	public link(long id, String link) {
		this.id = id;
		this.link = link;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	
}
