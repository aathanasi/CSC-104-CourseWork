public class Job
{
public char jobName;
public int jobTime;

public Job()
{
jobName = ' ';
jobTime = 0;
}

public Job(char name, int time)
{
jobName = name;
jobTime = time;
}

@Override
public String toString()
{
return jobName + " : " + jobTime;
}
}
