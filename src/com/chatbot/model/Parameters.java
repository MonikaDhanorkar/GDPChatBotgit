package com.chatbot.model;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Parameters
{
private String email;

private String year;

private String country;

public String getEmail ()
{
return email;
}

public void setEmail (String email)
{
this.email = email;
}

public String getYear ()
{
return year;
}

public void setYear (String year)
{
this.year = year;
}

public String getCountry ()
{
return country;
}

public void setCountry (String country)
{
this.country = country;
}

@Override
public String toString()
{
return "ClassPojo [email = "+email+", year = "+year+", country = "+country+"]";
}
}

