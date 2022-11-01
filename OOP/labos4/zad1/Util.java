package labos4.zad1;

import java.util.HashMap;
import java.util.Map;

class Util {
	public static Map<String, Double> findBestPrices(Map<String, Double> supplier1, Map<String, Double> supplier2) {
		Map<String, Double> map = new HashMap<>();

		for (Map.Entry<String, Double> entry : supplier1.entrySet()) {
			map.put(entry.getKey(), entry.getValue());
		}
		for (Map.Entry<String, Double> entry : supplier2.entrySet()) {
			if (!map.containsKey(entry.getKey())) {
				map.put(entry.getKey(), entry.getValue());
			} else {
				if (map.get(entry.getKey()) > entry.getValue()) {
					map.put(entry.getKey(), entry.getValue());
				}
			}
		}

		return map;
	}
}
