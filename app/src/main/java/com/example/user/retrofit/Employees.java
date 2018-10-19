package com.example.user.retrofit;

public class Employees
{
    private String mail;

    private String age;

    private String firstname;

    public String getMail ()
    {
        return mail;
    }

    public void setMail (String mail)
    {
        this.mail = mail;
    }

    public String getAge ()
    {
        return age;
    }

    public void setAge (String age)
    {
        this.age = age;
    }

    public String getFirstname ()
    {
        return firstname;
    }

    public void setFirstname (String firstname)
    {
        this.firstname = firstname;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [mail = "+mail+", age = "+age+", firstname = "+firstname+"]";
    }
}
			
			