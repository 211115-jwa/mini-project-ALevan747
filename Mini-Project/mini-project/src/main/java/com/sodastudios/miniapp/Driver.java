package com.sodastudios.miniapp;

import io.javalin.Javalin;

public class Driver {
	static int currentIndex;
	static Collection[] collections;
	
	public static void main(String[]args) {
		currentIndex = 0;
		collections = new Collection[10];
		
		Javalin app = Javalin.create();
		
		app.start(8080);
		
		app.post("/Collection", ctx ->{
			Collection collection = new Collection();
			collection.name = ctx.formParam("name");
			collection.flavor = ctx.formParam("flavor");
			collection.type = ctx.formParam("type");
			collection.isAlcoholic = Boolean.getBoolean("isAlcoholic");
			
			collections[currentIndex] = collection;
			currentIndex++;
			
			String responseText = "";
			
			for(Collection eachDrink : collections) {
				System.out.println(eachDrink);
				if(eachDrink != null) {
					responseText += eachDrink.name + "<br>";
				}
			}
			
			ctx.html(responseText);
		});
		
		
	}

}
