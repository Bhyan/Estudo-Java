package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import product.ImportedProduct;
import product.Product;
import product.UsedProduct;

public class Program{

	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> listProduct = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int itens = sc.nextInt();
		
		for(int i = 0; i < itens; i ++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			switch (ch) {
				case 'c':
					listProduct.add(new Product(name, price));
					break;
				case 'u':
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					Date manufactureDate = sdf.parse(sc.next());
					listProduct.add(new UsedProduct(name, price, manufactureDate));
					break;
				case 'i':
					System.out.print("Customs fee: ");
					double customFee = sc.nextDouble();
					listProduct.add(new ImportedProduct(name, price, customFee));
			}
		}
		
		System.out.println("PRICE TAGS:");
		
		for(Product item: listProduct) {
			System.out.println(item.priceTag());
		}
		
		sc.close();
	}

}
