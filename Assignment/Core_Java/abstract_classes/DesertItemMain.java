//package p1;
import java.util.Scanner;
abstract class DesertItem 
{
	abstract public String getCurrency();
	abstract public int getCost();
	abstract public int getQuantity();
	abstract public String getFlavour();
	
	abstract public void setCurrency(String ss);
	abstract public void setCost(int cc);
	abstract public void setQuantity(int qq);
	abstract public void setFlavour(String ff);
	
}

class Candy extends DesertItem 
{
	private String currency;
	private int cost;
	private int quantity;
	private String flavour;
	
	public Candy()
	{
		this.currency = "$";
		this.cost = 100; 
		this.quantity = 10; 
		this.flavour = "chocolate"; 
	}
	public Candy(String currency,int cost,int quantity,String flavour)
	{
		this.currency = currency; 
		this.cost = cost; 
		this.quantity = quantity; 
		this.flavour = flavour; 
	}
	public void setCurrency(String currency)
	{
		this.currency = currency; 
	}
	public void setCost(int cost)
	{
		this.cost = cost; 
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity; 
	}
	public void setFlavour(String flavour)
	{
		this.flavour = flavour; 
	}
	
	public String getCurrency()
	{
		return currency;
	}
	public int getCost()
	{
		return cost;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public String getFlavour()
	{
		return flavour;
	}
}
class IceCream extends DesertItem 
{
	private String currency;
	private int cost;
	private int quantity;
	private String flavour;
	
	public IceCream()
	{
		this.currency = "Rupee"; 
		this.cost = 100; 
		this.quantity = 10; 
		this.flavour = "chocolate"; 
	}
	public IceCream(String currency,int cost,int quantity,String flavour)
	{
		this.currency = currency; 
		this.cost = cost; 
		this.quantity = quantity; 
		this.flavour = flavour; 
	}
	public void setCurrency(String currency)
	{
		this.currency = currency; 
	}
	public void setCost(int cost)
	{
		this.cost = cost; 
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity; 
	}
	public void setFlavour(String flavour)
	{
		this.flavour = flavour; 
	}
	
	public String getCurrency()
	{
		return currency;
	}
	public int getCost()
	{
		return cost;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public String getFlavour()
	{
		return flavour;
	}
}
class Cookie extends DesertItem 
{
	private String currency;
	private int cost;
	private int quantity;
	private String flavour;
	public Cookie()
	{
		this.currency = "Euro";
		this.cost = 100; 
		this.quantity = 10; 
		this.flavour = "chocolate";
	}
	public Cookie(String currency,int cost,int quantity,String flavour)
	{
		this.currency = currency; 
		this.cost = cost; 
		this.quantity = quantity; 
		this.flavour = flavour; 
	}
	public void setCurrency(String currency)
	{
		this.currency = currency; 
	}
	public void setCost(int cost)
	{
		this.cost = cost; 
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity; 
	}
	public void setFlavour(String flavour)
	{
		this.flavour = flavour; 
	}
	
	public String getCurrency()
	{
		return currency;
	}
	public int getCost()
	{
		return cost;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public String getFlavour()
	{
		return flavour;
	}
}

public class DesertItemMain
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Who u r? : ");
		System.out.println("1. Customer");
		System.out.println("2. Owner");
		int user = sc.nextInt();
		if(user==1)
		{
			//Customer cases
			System.out.println("What u want to buy : ");
			System.out.println("1. Candy");
			System.out.println("2. IceCream");
			System.out.println("3. Cookie");
			
			int ch = sc.nextInt();
			DesertItem d=null;
			int quantity=0;
			switch(ch)
			{
				
				case 1:
					d = new Candy();
					System.out.println("Cost is : "+d.getCost());
					System.out.println("How many u want");
					 quantity = sc.nextInt();
					if(quantity <= d.getQuantity())
					{
						System.out.println("Succcesfully buy candy");
						d.setQuantity(d.getQuantity()-quantity);
					}
					else
						System.out.println("Not enough stock!!!");
					break;
				case 2:
					d = new IceCream();
					System.out.println("Cost is : "+d.getCost());
					System.out.println("How many u want");
					 quantity = sc.nextInt();
					if(quantity <= d.getQuantity())
					{
						System.out.println("Succcesfully buy IceCream");
						d.setQuantity(d.getQuantity()-quantity);
					}
					else
						System.out.println("Not enough stock!!!");
					break;
				case 3:
					d = new Cookie();
					System.out.println("Cost is : "+d.getCost());
					System.out.println("How many u want");
					 quantity = sc.nextInt();
					if(quantity <= d.getQuantity())
					{
						System.out.println("Succcesfully buy Cookie");
						d.setQuantity(d.getQuantity()-quantity);
					}
					else
						System.out.println("Not enough stock!!!");
					break;
				default:
					break;
			}//end of switch
		}
		else if(user==2)
		{
			//Owner cases
			DesertItem d = null;
			System.out.println("What u want to update : ");
			System.out.println("1. Candy");
			System.out.println("2. IceCream");
			System.out.println("3. Cookie");
			
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					d = new Candy();
					System.out.println("What type u want to update : ");
					System.out.println("1. currency");
					System.out.println("2. cost");
					System.out.println("3. quantity");
					System.out.println("4. flavour");
					int tch = sc.nextInt();
					switch(tch)
					{
						case 1:
							System.out.println("Enter new Currency : ");
							String currency = sc.next();
							d.setCurrency(currency);
							break;
						case 2:
							System.out.println("Enter new Cost : ");
							int cost = sc.nextInt();
							d.setCost(cost);
							break;
						case 3:
							System.out.println("Enter new Quantity : ");
							int quantity = sc.nextInt();
							d.setQuantity(quantity);
							break;
						case 4:
							System.out.println("Enter new Flavour : ");
							String flavour = sc.next();
							d.setFlavour(flavour);
							break;
						default:
							System.out.println("Wrong choice!!!!");
							break;
					}//end of inner switch
					break;
				case 2:
					d = new IceCream();
					System.out.println("What type u want to update : ");
					System.out.println("1. currency");
					System.out.println("2. cost");
					System.out.println("3. quantity");
					System.out.println("4. flavour");
					int tch1 = sc.nextInt();
					switch(tch1)
					{
						case 1:
							System.out.println("Enter new Currency : ");
							String currency = sc.next();
							d.setCurrency(currency);
							break;
						case 2:
							System.out.println("Enter new Cost : ");
							int cost = sc.nextInt();
							d.setCost(cost);
							break;
						case 3:
							System.out.println("Enter new Quantity : ");
							int quantity = sc.nextInt();
							d.setQuantity(quantity);
							break;
						case 4:
							System.out.println("Enter new Flavour : ");
							String flavour = sc.next();
							d.setFlavour(flavour);
							break;
						default:
							System.out.println("Wrong choice!!!!");
							break;
					}//end of inner switch
					break;
				case 3:
					d = new Cookie();
					System.out.println("What type u want to update : ");
					System.out.println("1. currency");
					System.out.println("2. cost");
					System.out.println("3. quantity");
					System.out.println("4. flavour");
					 tch1 = sc.nextInt();
					switch(tch1)
					{
						case 1:
							System.out.println("Enter new Currency : ");
							String currency = sc.next();
							d.setCurrency(currency);
							break;
						case 2:
							System.out.println("Enter new Cost : ");
							int cost = sc.nextInt();
							d.setCost(cost);
							break;
						case 3:
							System.out.println("Enter new Quantity : ");
							int quantity = sc.nextInt();
							d.setQuantity(quantity);
							break;
						case 4:
							System.out.println("Enter new Flavour : ");
							String flavour = sc.next();
							d.setFlavour(flavour);
							break;
						default:
							System.out.println("Wrong choice!!!!");
							break;
					}//end of inner switch
					break;
				default:
					System.out.println("Wrong choice!!!!");
					break;
			}//end of outer switch 
		}
		else
		{
			System.out.println("Wrong Choice!!!");
		}
	}
}