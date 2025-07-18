package com.inventory;

import java.util.Scanner;

import com.Repository.ProductRepo;

/**
 * Hello world!
 *
 *
 */
public class App {
	public static void main(String[] args) {
		ProductRepo p = new ProductRepo();

		System.out.println("==welcome==");
		System.out.println("Enter the following option");
		System.out.println("1.Add a Product ");
		System.out.println("2. get all product List ");
		System.out.println("3. update product quantity ");
		System.out.println("4. delete product ");

		Scanner sc = new Scanner(System.in);
		int opration = sc.nextInt();

		switch (opration) {

		case 1:
			p.addProduct();
			break;
		case 2:
			p.getAllProduct();
			break;

		case 3:
			p.updateProduct();
			break;
		case 4:
			p.deleteProduct();
			break;

		default:
			System.out.println("choose right option ");
			break;

		}

	}
}
