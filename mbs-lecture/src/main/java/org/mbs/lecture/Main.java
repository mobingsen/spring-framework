package org.mbs.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	private static final Map<String, String> map = new HashMap<>();

	static {
		map.put("0", "0");
		map.put("1", "8");
		map.put("2", "4");
		map.put("3", "C");
		map.put("4", "2");
		map.put("5", "A");
		map.put("6", "6");
		map.put("7", "E");
		map.put("8", "1");
		map.put("9", "9");
		map.put("a", "5");
		map.put("b", "D");
		map.put("c", "3");
		map.put("d", "B");
		map.put("e", "7");
		map.put("f", "F");
		map.put("A", "5");
		map.put("B", "D");
		map.put("C", "3");
		map.put("D", "B");
		map.put("E", "7");
		map.put("F", "F");
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null && !"".equals(line)) {
			line = line.replaceAll(" ", "");
			String[] arr = line.split("");
			List<String> ji = new ArrayList<>();
			List<String> ou = new ArrayList<>();
			for (int i = 0; i < line.length(); i++) {
				(i % 2 == 0 ? ou : ji).add(arr[i]);
			}
			Collections.sort(ji);
			Collections.sort(ou);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < Math.max(ji.size(), ou.size()); i++) {
				if (ou.size() > i) {
					String o = ou.get(i);
					sb.append(map.getOrDefault(o, o));
				}
				if (ji.size() > i) {
					String j = ji.get(i);
					sb.append(map.getOrDefault(j, j));
				}
			}
			System.out.println(sb.toString());
		}
	}
}

