package contoller.ctec;
import java.awt.Color;
import java.util.*;

import model.ctec.*;

public class DataController
{
	private Queue<Customer> customerQueue;
	private Stack<Dish> dishes;
	
	private void doDishes()
	{
		dishes = new Stack<Dish>();
		dishes.add(new Dish(true,Color.BLACK,8));
		System.out.println(dishes.size());
	}
	
	private void useQueue()
	{
		customerQueue = new LinkedList<Customer>();
	}

}
