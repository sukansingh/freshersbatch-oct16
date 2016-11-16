package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class TestData {

	public static List<Fruit> getAllFruits() {
		List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Fruit("Peach", 90, 50, "Red"));
		fruits.add(new Fruit("Banana", 200, 10, "Yellow"));
		fruits.add(new Fruit("Pomegranate", 200, 70, "Red"));
		fruits.add(new Fruit("Apple", 300, 150, "Red"));
		fruits.add(new Fruit("Watermelon", 30, 20, "Red"));
		return fruits;
	}
	public static void printFruits(List<Fruit> fruits) {
		fruits.stream().forEach(System.out::println);
	}

	public static List<News> getAllNews() {
		List<News> newsList = new ArrayList<News>();
		newsList.add(new News(1, "Tom", "Anand", "Very nice article on budget"));
		newsList.add(new News(2, "Ivan", "Bipin", "Good budget description"));
		newsList.add(new News(1, "Tom", "Narang", "How can you write such an article?"));
		newsList.add(new News(2, "Jerry", "Mitul", "I agree with you!!"));
		newsList.add(new News(2, "James", "Anand", "This seems to be paid news for glorifying the budget"));
		newsList.add(new News(3, "Sara", "Daji", "Good article"));
		return newsList;
	}
	public static void printNews(List<News> newsList) {
		newsList.stream().forEach(System.out::println);
	}

	public static List<Transaction> getAllTransactions() {
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(new Transaction(new Trader("Anand", "Pune"), 2016, 10000));
		transactions.add(new Transaction(new Trader("Neeraja", "Indore"), 2015, 25000));
		transactions.add(new Transaction(new Trader("Yog", "Mumbai"), 2011, 33000));
		transactions.add(new Transaction(new Trader("Lokesh", "Nagpur"), 2016, 200000));
		transactions.add(new Transaction(new Trader("Komal", "Pune"), 2011, 80000));
		transactions.add(new Transaction(new Trader("Ishwar", "Indore"), 2016, 12000));
		return transactions;
	}
	
	public static void printTransactions(List<Transaction> transactions) 
	{
		transactions.stream().forEach(System.out::println);
	}
	
	public static void main(String arg[])
	{
		List <Fruit> f = getAllFruits();
		
		
		//1
		Predicate <Fruit> p = (Fruit fr)-> fr.getCalories() < 100;
		List <Fruit> fByCal = f.stream().filter(p).sorted(Comparator.comparing(Fruit::getCalories).reversed()).collect(Collectors.toList());
		System.out.println(fByCal);
		
		//2
		Map<String,List<Fruit>> fByColor = f.stream().collect(Collectors.groupingBy(Fruit::getColor));
		System.out.println(fByColor);
		
		//3
		p = (Fruit fr)-> fr.getColor().equals("Red");
		List <Fruit> fByRedColor = f.stream().filter(p).sorted(Comparator.comparing(Fruit::getPrice)).collect(Collectors.toList());
		System.out.println(fByRedColor);
		
		//---------------------------
		List <News> n = getAllNews();
		//4
		System.out.println("4.	Find out the newsId which has received maximum comments");
		Map<Object, Long> counts =
			    n.stream().collect(Collectors.groupingBy(News::getNewsId, Collectors.counting()));
		
		//counts.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
		System.out.println(counts);
		System.out.println("Max count ID : "+counts.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());
		
		//5
		System.out.println("5.	Find out how many times the word 'budget' arrived in user comments of all news");
		
		List <String> commentList=null;
		
		Iterator<News> itr = n.iterator();
		while(itr.hasNext())
		{
			commentList.add(itr.next().getComment());
		}
		commentList.stream().filter()
	}
}
