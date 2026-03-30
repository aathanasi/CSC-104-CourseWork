public abstract class Person implements Comparable<Person>
{
private String lastName;
private String firstName;
private String SSNumber;

public Person() 
{
this.lastName = "";
this.firstName = "";
this.SSNumber = "";
}

public Person(String lastName, String firstName, String SSNumber) 
{
this.lastName = lastName.toUpperCase();
this.firstName = firstName.toUpperCase();
this.SSNumber = SSNumber;
}

public String getLastName() 
{ 
return lastName; 
}
public String getFirstName() 
{
return firstName;
}
public String getSSNumber()
{ 
return SSNumber;
}

public void setLastName(String lastName) 
{
this.lastName = lastName.toUpperCase(); 
}
public void setFirstName(String firstName) 
{ 
this.firstName = firstName.toUpperCase(); 
}
public void setSSNumber(String SSNumber) 
{
this.SSNumber = SSNumber; 
}

@Override
public int compareTo(Person o) 
{
return (this.lastName + this.firstName).compareTo(o.lastName + o.firstName);
}


@Override
public boolean equals(Object obj) 
{
if (!(obj instanceof Person)) return false;
Person other = (Person) obj;
return this.lastName.equals(other.lastName) && this.firstName.equals(other.firstName);
}
}
