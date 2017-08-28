package com.chatbot.model;


import com.fasterxml.jackson.annotation.JsonProperty;
public class Response_Mdl {

	@JsonProperty
	String speech;
	String displayText;
    String source;
	public String getSpeech() {
		return speech;
	}
	public void setSpeech(String speech) {
		this.speech = speech;
	}
	public String getDisplayText() {
		return displayText;
	}
	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	@Override
	public String toString() {
		return "Response [speech=" + speech + ", displayText=" + displayText + ", source=" + source + "]";
	}
    
}


