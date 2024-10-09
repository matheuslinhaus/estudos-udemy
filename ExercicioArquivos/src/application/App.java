package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Product;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter file path: ");
		String path =  sc.nextLine();
		
		File source = new File(path);
		String sourceFolder = source.getParent();
		
		System.out.println(sourceFolder);
		
		boolean sucess = new File(sourceFolder + "\\out").mkdir();
		
		System.out.println("Folder created: " + sucess);
		String targetFile =  sourceFolder + "\\out\\summary.csv";
				
		try (BufferedReader br = new BufferedReader(new FileReader(path)))
		{
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, quantity));
				line = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {	
				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}

	}

}
