abstract class Persistence
{
	abstract public void persist();
}

class FilePersistence extends Persistence
{
	public void persist()
	{
		System.out.println("data persisted into file");
	}
}

class DataPersistence extends Persistence
{
	public void persist()
	{
		System.out.println("data persisted into database");
	}
}

class PersistenceFactory
{
	public static Persistence getInstance()
	{
		return (new FilePersistence());
	}
}
class PersistenceMain
{
	public static void main(String arg[])
	{
		Persistence p = PersistenceFactory.getInstance();
		p.persist();
	}
}