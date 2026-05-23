package p1;

import java.util.Scanner;

public class EcommerceApp {
	public String[] products= {"Laptop","Mobile","HeadPhones","Tablets"};
	
	public int[] stock= {5,10,15,8};
	
	public int[] cart= {0,0,0,0};
	
	public double[] prices= {50000,20000,30000,15000};
	
	public void displayProducts()
	{
		System.out.println("\nAvaliable products:");
		for(int i=0;i<products.length;i++)
		{
			System.out.println((i+1)+"."+products[i]+"-"+prices[i]+"-stock"+":"+stock[i]);
		}
	}
	
	public void addToCart(int productIndex,int quantity)
	{
		cart[productIndex]=cart[productIndex]+quantity;
		stock[productIndex]-=quantity;
		System.out.println(quantity+" "+products[productIndex]+" added to cart");
	}
	
	public void removeFromCart(int rIndex,int rquantity)
	{
		cart[rIndex]-=rquantity;
		stock[rIndex]=stock[rIndex]+rquantity;
		System.out.println(rquantity+" "+products[rIndex]+" removed from cart");
	}
	
	public void checkout()
	{
		System.out.println("\nCheckout Summary");
		for(int i=0;i<cart.length;i++)
		{
			if(cart[i]>0)
			{
				System.out.println(cart[i]*prices[i]);
			}
		}
	}
	
	public void exit()
	{
		System.out.println("Thank u for visting......");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EcommerceApp shop=new EcommerceApp();
		while(true)
		{
			System.out.println("\n1.ViewProducts \n2.Add to cart \n3.Remove from Cart \n4.Checkout \n5.Exit");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				shop.displayProducts();
			break;
			case 2:
				shop.displayProducts();
				System.out.println("Enter the product number:");
				int productIndex=sc.nextInt()-1;
				System.out.println("Enter quantity:");
				int quantity=sc.nextInt();
				shop.addToCart(productIndex, quantity);
			break;
			case 3:
				System.out.println("Enter the product number:");
				int rIndex=sc.nextInt()-1;
				System.out.println("Enter quantity:");
				int rquantity=sc.nextInt();
				shop.removeFromCart(rIndex, rquantity);
			break;
			case 4:
				shop.checkout();
			break;
			case 5:
				shop.exit();
			break;
			}
		}
	}
}