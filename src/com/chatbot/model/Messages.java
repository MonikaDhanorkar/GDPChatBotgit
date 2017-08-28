package com.chatbot.model;


public class Messages
{
private String speech;

private String type;

public String getSpeech ()
{
return speech;
}

public void setSpeech (String speech)
{
this.speech = speech;
}

public String getType ()
{
return type;
}

public void setType (String type)
{
this.type = type;
}

@Override
public String toString()
{
return "ClassPojo [speech = "+speech+", type = "+type+"]";
}
}
