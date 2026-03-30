public class TestDoor
{
public static void main(String[]args)
{
Door enterDoor = new Door("Enter\n");
Door exitDoor = new Door("Exit\n");
Door treasureDoor = new Door("Treasure\n");

enterDoor.unlock();
enterDoor.open();

exitDoor.lock();
exitDoor.close();

treasureDoor.unlock();
treasureDoor.open();
treasureDoor.lock();

System.out.println("Testing Door\n");

System.out.println("Enter Door - Inscription\n " + enterDoor.getInscription());
System.out.println("Is Closed " + enterDoor.isClosed());
System.out.println("Is Locked " + enterDoor.isLocked());

System.out.println("Exit Door - Inscription\n " + exitDoor.getInscription());
System.out.println("Is Closed " + exitDoor.isClosed());
System.out.println("Is Locked " + exitDoor.isLocked());


System.out.println("Treasure Door - Inscription\n " + treasureDoor.getInscription());
System.out.println("Is Closed " + treasureDoor.isClosed());
System.out.println("Is Locked " + treasureDoor.isLocked());

}
}