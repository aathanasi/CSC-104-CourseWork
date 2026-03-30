import java.util.*;

public class JobTest
{
public static ArrayList<Job> initializeJobs()
{
ArrayList<Job> jobs = new ArrayList<Job>();
jobs.add(new Job('A', 6));
jobs.add(new Job('B', 12));
jobs.add(new Job('C', 4));
jobs.add(new Job('D', 16));
jobs.add(new Job('E', 10));
jobs.add(new Job('F', 2));
jobs.add(new Job('G', 13));
jobs.add(new Job('H', 8));
return jobs;
}

public static void shortestJobFirst(ArrayList<Job> jobs)
{
System.out.println("Shortest Job First:");
Collections.sort(jobs, new Comparator<Job>()
{
public int compare(Job j1, Job j2)
{
return j1.jobTime - j2.jobTime;
}
});

for (Job job : jobs)
{
System.out.println(job);
}
System.out.println();
}

public static void longestJobFirst(ArrayList<Job> jobs)
{
System.out.println("Longest Job First:");
Collections.sort(jobs, new Comparator<Job>()
{
public int compare(Job j1, Job j2)
{
return j2.jobTime - j1.jobTime;
}
});

for (Job job : jobs)
{
System.out.println(job);
}
System.out.println();
}

public static void shortestTimeRemaining(ArrayList<Job> jobs)
{
System.out.println("Shortest Time Remaining:");
ArrayList<Job> queue = new ArrayList<Job>();
for (Job j : jobs)
queue.add(new Job(j.jobName, j.jobTime));

while (!queue.isEmpty())
{
Collections.sort(queue, new Comparator<Job>()
{
public int compare(Job j1, Job j2)
{
return j1.jobTime - j2.jobTime;
}
});

Job j = queue.get(0);
j.jobTime--;
if (j.jobTime == 0)
queue.remove(0);
System.out.println(j.jobName + " remaining time: " + j.jobTime);
}
System.out.println();
}

public static void longestTimeRemaining(ArrayList<Job> jobs)
{
System.out.println("Longest Time Remaining:");
ArrayList<Job> queue = new ArrayList<Job>();
for (Job j : jobs)
queue.add(new Job(j.jobName, j.jobTime));

while (!queue.isEmpty())
{
Collections.sort(queue, new Comparator<Job>()
{
public int compare(Job j1, Job j2)
{
return j2.jobTime - j1.jobTime;
}
});

Job j = queue.get(0);
j.jobTime--;
if (j.jobTime == 0)
queue.remove(0);
System.out.println(j.jobName + " remaining time: " + j.jobTime);
}
System.out.println();
}

public static void roundRobin(ArrayList<Job> jobs)
{
System.out.println("Round Robin:");
ArrayList<Job> queue = new ArrayList<Job>();
for (Job j : jobs)
queue.add(new Job(j.jobName, j.jobTime));

while (!queue.isEmpty())
{
Iterator<Job> it = queue.iterator();
while (it.hasNext())
{
Job j = it.next();
j.jobTime--;
if (j.jobTime == 0)
{
System.out.println(j.jobName + " remaining time: 0");
it.remove();
} else {
System.out.println(j.jobName + " remaining time: " + j.jobTime);
}
}
}
System.out.println();
}

public static void main(String[] args)
{
shortestJobFirst(initializeJobs());
longestJobFirst(initializeJobs());
shortestTimeRemaining(initializeJobs());
longestTimeRemaining(initializeJobs());
roundRobin(initializeJobs());
}
}
