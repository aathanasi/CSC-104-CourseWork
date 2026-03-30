public class IntegerSet1 implements SetOperations1
{
private boolean[] set;
private int size;

public IntegerSet1()
{
set = new boolean[100];
size = 0;
}

public IntegerSet1(int[] nums, int length)
{
set = new boolean[100];
size = 0;
for (int i = 0; i < length; i++)
{
if (!set[nums[i]])
{
set[nums[i]] = true;
size++;
}
}
}


public IntegerSet1(boolean[] set, int size)
{
this.set = set;
this.size = size;
}

public int getSize()
{
return size;
}

public boolean elementOf(int x)
{
return set[x];
}

public void add(int x)
{
if (!set[x])
{
set[x] = true;
size++;
}
}

public boolean equals(Object o)
{
if (!(o instanceof IntegerSet1)) 
return false;
IntegerSet1 other = (IntegerSet1) o;
for (int i = 0; i < 100; i++)
{
if (this.set[i] != other.set[i]) return false;
}
return true;
}

public String toString() {
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 100; i++) {
if (set[i]) sb.append(i).append(" ");
}
return sb.toString().trim();
}

public Object union(Object x)
{
IntegerSet1 other = (IntegerSet1) x;
boolean[] result = new boolean[100];
int newSize = 0;
for (int i = 0; i < 100; i++)
{
result[i] = this.set[i] || other.set[i];
if (result[i]) newSize++;
}
return new IntegerSet1(result, newSize);
}

public Object intersection(Object x)
{
IntegerSet1 other = (IntegerSet1) x;
boolean[] result = new boolean[100];
int newSize = 0;
for (int i = 0; i < 100; i++)
{
result[i] = this.set[i] && other.set[i];
if (result[i]) newSize++;
}
return new IntegerSet1(result, newSize);
}
}
