package stackjava.com.model;

import java.util.List;

public class postUser {
	private String video;
	private String content;
	private List<link> links;

	public postUser(String video, String content, List<link> links) {
		this.video = video;
		this.content = content;
		this.links = links;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<link> getLinks() {
		return links;
	}

	public void setLinks(List<link> links) {
		this.links = links;
	}

}
