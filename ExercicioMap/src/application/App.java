package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import entities.Candidate;

public class App {

	public static void main(String[] args) {
		
		String path = "C:\\temp\\in.txt";
		Map<Candidate, Integer> map = new HashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				
				String[] vector = line.split(",");
				String name = vector[0];
				Integer vote = Integer.getInteger(vector[1]);
				Candidate cd = new Candidate(name, vote);
				
				br.readLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
