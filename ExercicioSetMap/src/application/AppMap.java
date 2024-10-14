package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class AppMap {

	public static void main(String[] args) {
		String path = "C:\\temp\\in.txt";

		Map<String, Integer> map = new LinkedHashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {

				String[] vector = line.split(",");
				String name = vector[0];
				Integer count = Integer.parseInt(vector[1]);

				if (map.containsKey(name)) {
					int votesSoFar = map.get(name);
					map.put(name, count + votesSoFar);
				} else {
					map.put(name, count);
				}

				line = br.readLine();
			}
			
			for (String key : map.keySet()) {
				System.out.println(key + ": " + map.get(key));
			}

		} catch (Exception e) {

		}
	}

}
