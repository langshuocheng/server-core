package com.mexlang.server.core.model;

/***
 * 定义记录对象
 * @author mexlang
 *
 */
public class ResultEntity {
	
	//标题
	private String title;
	//链接地址
	private String url;
	//内容
	private String content;
	//关键词
	private String keyWord;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
}
