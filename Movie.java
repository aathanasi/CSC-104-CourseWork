public class Movie extends Item
{
private int time;
private String rating;
private char format;

public Movie(String title, int time, double fee, String rating, char format, int status, String owner)
{
super(title, fee, status, owner);
this.time = time;
this.rating = rating;
this.format = format;
}

public String toString()
{
return super.toString() + ", Time: " + time + " min, Rating: " + rating + ", Format: " + format;
}
}
