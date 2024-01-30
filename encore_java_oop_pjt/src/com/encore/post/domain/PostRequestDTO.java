package com.encore.post.domain;

public class PostRequestDTO {
	private String id ;
	private String title ;
	private String content ;
	private String date ;
	private int click ;
	private boolean open ;
	
	public PostRequestDTO() {
		
	}
	
	public PostRequestDTO(String id) {
		this.id = id ; 
	}
	
	public PostRequestDTO(String id, String title, String content, String date, int click, boolean open) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.date = date;
		this.click = click;
		this.open = open;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	
	
}
