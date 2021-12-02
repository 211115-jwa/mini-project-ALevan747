package nov30;

import java.util.HashMap;
import java.util.Map;


	public class Speak {
		
		public static void main(String[] args) {
			Map<String,Animal> t = new HashMap<String, Animal>();
			t.put("Dog",new Dog());
			t.put("Cat",  new Cat());
			t.put("Cheems", new Cheems());
			printMap(t);
		
		}
		public static void  printMap(Map<String, Animal> p){
			(p.keySet()).forEach(s ->{
				System.out.println(p.get(s).speak());
			});
		}
	}

}
}

