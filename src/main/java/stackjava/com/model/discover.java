package stackjava.com.model;


public class discover {

	private int id;
	private String content;
	private Boolean isMusic;
	
	public discover(int id, String content, Boolean isMusic) {
		this.id = id;
		this.content = content;
		this.isMusic = isMusic;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Boolean getIsMusic() {
		return isMusic;
	}
	public void setIsMusic(Boolean isMusic) {
		this.isMusic = isMusic;
	}
	
}
