package model;

import java.util.Optional;

public class KangarooEnviroment 

{

	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------

	private double food1;				// this would be the amount of food that the kangaroo1 needs.		// 
																											//I put all this atributs here
	private double food2;				// this would be the amount of food that the kangaroo2 needs.		//
																											//because is the Enviroment who 																								
	private double food3;				// this would be the amount of food that the kangaroo3 needs.		// 
																											//have the water and the food,																									
	private double water1;				// this would be the amount of water that the kangaroo1 needs.		//	
																											//and not the animal, he only																								
	private double water2;				// this would be the amount of water that the kangaroo2 needs.		//	
																											//drinks or eats it from it.																									
	private double water3;				// this would be the amount of water that the kangaroo3 needs.		//	
																											//	
	private	double area1;				// this woild be the area of the first kangaroo.

	private	double area2;				// this woild be the area of the second kangaroo.

	private	double area3;				// this woild be the area of the third kangaroo.	

	private double enviromentArea;		// this would be the area of the enviroment																			
	//--------------------------------------------------------------------------------------------------

	//relations

	//--------------------------------------------------------------------------------------------------

	private Kangaroo kangaroo1;

	private Kangaroo kangaroo2;

	private Kangaroo kangaroo3;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------
// in this method I am initializing the object, and assigning each parameter to each attribute.
	public KangarooEnviroment(double newFood1, double newFood2, double newFood3, double newWater1, double newWater2, double newWater3, double newArea1, double newArea2, double newArea3, double newEnviromentArea, Kangaroo newKangaroo1, Kangaroo newKangaroo2, Kangaroo newKangaroo3) 

	{
		
		food1  = newFood1;

		food2  = newFood2;

		food3  = newFood3;
		
		water1 = newWater1;

		water2 = newWater2;

		water3 = newWater3;

		enviromentArea = newEnviromentArea;

		kangaroo1 = newKangaroo1;

		kangaroo2 = newKangaroo2;

		kangaroo3 = newKangaroo3;

	}

	public String calculateMaleFemale()

	{

		String x = "You can't put two male kangaroos in one enviroment";
		
		if(kangaroo1 != null && kangaroo2 != null && kangaroo3 != null){
	
			if ( kangaroo1.getSex().equals("Male") && kangaroo2.getSex().equals("Female") && kangaroo3.getSex().equals("Female")){

				x = "There is only one male kangaroo in the enviroment.";

			}else if ( kangaroo2.getSex().equals("Male") && kangaroo1.getSex().equals("Female") && kangaroo3.getSex().equals("Female")){

				x = "There is only one male kangaroo in the enviroment.";

			}else if ( kangaroo3.getSex().equals("Male") && kangaroo1.getSex().equals("Female") && kangaroo2.getSex().equals("Female")){

				x = "There is only one male kangaroo in the enviroment.";

			}else if ( kangaroo1.getSex().equals("Female") && kangaroo2.getSex().equals("Female") && kangaroo3.getSex().equals("Female")){

				x = "there isn't male kangaroos in this enviroment.";

			}

		}

		if(kangaroo1 != null && kangaroo2 != null ){
	
			if ( kangaroo1.getSex().equals("Male") && kangaroo2.getSex().equals("Female")){

				x = "There is only one male kangaroo in the enviroment.";

			}else if ( kangaroo2.getSex().equals("Male") && kangaroo1.getSex().equals("Female")){

				x = "There is only one male kangaroo in the enviroment.";

			}else if ( kangaroo1.getSex().equals("Female") && kangaroo2.getSex().equals("Female") ){

				x = "there isn't male kangaroos in this enviroment.";

			}

		}

		if(kangaroo1 != null && kangaroo3 != null){
	
			if ( kangaroo1.getSex().equals("Male") && kangaroo3.getSex().equals("Female")){

				x = "There is only one male kangaroo in the enviroment.";

			}else if ( kangaroo3.getSex().equals("Male") && kangaroo1.getSex().equals("Female")){

				x = "There is only one male kangaroo in the enviroment.";

			}else if ( kangaroo1.getSex().equals("Female") && kangaroo3.getSex().equals("Female")){

				x = "there isn't male kangaroos in this enviroment.";

			}

		}

		if(kangaroo2 != null && kangaroo3 != null){
	
			if ( kangaroo2.getSex().equals("Male") && kangaroo3.getSex().equals("Female")){

				x = "There is only one male kangaroo in the enviroment.";

			}else if ( kangaroo3.getSex().equals("Male") && kangaroo2.getSex().equals("Female")){

				x = "There is only one male kangaroo in the enviroment.";

			}else if ( kangaroo2.getSex().equals("Female") && kangaroo3.getSex().equals("Female")){

				x = "there isn't male kangaroos in this enviroment.";

			}

		}

		return x;


	} //kangaroo1.getSex() == "m" ? (kangaroo2.getSex() == "f" && kangaroo3.getSex() == "f") : (kangaroo2.getSex() == "m" ? (kangaroo1.getSex() == "f" && kangaroo3.getSex() == "f") :(kangaroo3.getSex() == "m" ? (kangaroo1.getSex() == "f" && kangaroo2.getSex() == "f") : (kangaroo1.getSex() == "f" && kangaroo2.getSex() == "f" && kangaroo3.getSex() == "f")));



	public double calculateArea1()

	{

		//if(kangaroo1 != null){

			return kangaroo1.getHeight() * 8;

		//}

	}

	public double calculateArea2()

	{	

		//if(kangaroo2 != null){

			return kangaroo2.getHeight() * 8;

		//}

	}

		public double calculateArea3()

	{

		double x = 0;	

		if(kangaroo3 != null){

			x = kangaroo3.getHeight() * 8;

		}
		return x;

	}

	public double calculateEnviromentArea()
	
	{

		//if (kangaroo1 != null && kangaroo2 != null && kangaroo3 != null){

		return (calculateArea1() + calculateArea2() + calculateArea3());

		//}	

	}    
//this method helps us to get the value of the attribute food1.
	public double getFood1()

	{

		return food1;

	}
//this method helps us to assign an initial value to the attribute food1.
	public void setFood1(double newFood1)

	{

		food1 = newFood1;

	}
//this method helps us to get the value of the attribute food2.
	public double getFood2()

	{

		return food2;

	}
//this method helps us to assign an initial value to the attribute food2.
	public void setFood2(double newFood2)

	{

		food2 = newFood2;

	}
//this method helps us to get the value of the attribute food3.
	public double getFood3()

	{

		return food3;

	}
//this method helps us to assign an initial value to the attribute food3.
	public void setFood3(double newFood3)

	{

		food3 = newFood3;

	}
// here, I'm calculating how many food the kangaroo needs
	public double calculateFood1()

	{

		if (kangaroo1.getWeight() <= 30){

			food1 = (kangaroo1.getWeight() * 0.8);

		}else if(kangaroo1.getWeight() <= 48){

			food1 = (kangaroo1.getWeight() * 1.1);

		}else{

			food1 = (40 + (0.4 * (kangaroo1.getWeight() - 48)));
		}

		return food1;

	}//return (kangaroo1.getWeight() <= 30) ? (kangaroo1.getWeight() * 80)/100 : (kangaroo1.getWeight() <= 48 ? kangaroo1.getWeight() * 1.1 : 40 + kangaroo1.getWeight() * 0.4);
// here, I'm calculating how many food the kangaroo needs
	public double calculateFood2()

	{

		if (kangaroo2.getWeight() <= 30){

			food2 = (kangaroo2.getWeight() * 0.8);

		}else if(kangaroo2.getWeight() <= 48){

			food2 = (kangaroo2.getWeight() * 1.1);

		}else{

			food2 = (40 + (0.4 * (kangaroo2.getWeight() - 48)));

		}

		return food2;

	}

// here, I'm calculating how many food the kangaroo needs
	public double calculateFood3()

	{

		if (kangaroo3.getWeight() <= 30){

			food3 = (kangaroo3.getWeight() * 0.8);

		}else if(kangaroo3.getWeight() <= 48){

			food3 = (kangaroo3.getWeight() * 1.1);

		}else{

			food3 = (40 + (0.4 * (kangaroo3.getWeight() - 48)));

		}

		return food3;

	}
//this method helps us to get the value of the attribute water1.
	public double getWater1()

	{

		return water1;

	}
//this method helps us to assign an initial value to the attribute water1.
	public void setWater1(double newWater1)

	{

		water1 = newWater1;

	}
//this method helps us to get the value of the attribute water2.
	public double getWater2()

	{

		return water2;

	}
//this method helps us to assign an initial value to the attribute water2.
	public void setWater2(double newWater2)

	{

		water2 = newWater2;

	}
//this method helps us to get the value of the attribute water3.
	public double getWater3()

	{

		return water3;

	}
//this method helps us to assign an initial value to the attribute water3.
	public void setWater3(double newWater3)

	{

		water3 = newWater3;

	}  
// here, I'm calculating how many water the kangaroo needs
	public double calculateWater1()

	{

		return kangaroo1.calculateBmi() * 1.5;

	}
// here, I'm calculating how many water the kangaroo needs
	public double calculateWater2()

	{

		return kangaroo2.calculateBmi() * 1.5;

	}
// here, I'm calculating how many water the kangaroo needs
	public double calculateWater3()

	{

		return kangaroo3.calculateBmi() * 1.5;

	}
//this method helps us to get the value of the attribute area1.
	public double getArea1()

	{

		return area1;

	}
//this method helps us to assign an initial value to the attribute area1.
	public void setArea1(double newArea1)

	{

		area1 = newArea1;

	}
//this method helps us to get the value of the attribute area2.
	public double getArea2()

	{

		return area2;

	}
//this method helps us to assign an initial value to the attribute area2.
	public void setArea2(double newArea2)

	{

		area2 = newArea2;
		
	}
//this method helps us to get the value of the attribute area3.

	public double getArea3()

	{
		return area3;

	}
//this method helps us to assign an initial value to the attribute area3.
	public void setArea3(double newArea3)

	{

		area3 = newArea3;
		
	}
//this method helps us to get the value of the attribute enviromentArea.
	public double getEnviromentArea()

	{

		return enviromentArea;

	}
//this method helps us to assign an initial value to the attribute enviromentArea.
	public void setEnviromentArea(double newEnviromentArea)

	{

		enviromentArea = newEnviromentArea;
		
	}
//this method helps us to get the value of the relation kangaroo1.
	public Kangaroo getKangaroo1()

	{

		return kangaroo1;

	}
//this method helps us to assign an initial value to the relation kangaroo1.
	public void setKangaroo1(Kangaroo newKangaroo1)

	{

		kangaroo1 = newKangaroo1;

	}
//this method helps us to get the value of the relation kangaroo2.
	public Kangaroo getKangaroo2()

	{
		return kangaroo2;

	}
//this method helps us to assign an initial value to the relation kangaroo2.
	public void setKangaroo2(Kangaroo newKangaroo2)

	{

		kangaroo2 = newKangaroo2;
		
	}
//this method helps us to get the value of the relation kangaroo3.
	public Kangaroo getKangaroo3()

	{

		return kangaroo3;

	}
//this method helps us to assign an initial value to the relation kangaroo3.
	public void setKangaroo3(Kangaroo newKangaroo3)

	{

		kangaroo3 = newKangaroo3;
		
	}

	public String toString(){

		String msg = "";
		
		msg += "\n" + calculateMaleFemale() + "\n" ;
		
		if(kangaroo1 != null){
		
			msg = msg + "\n \nThe first kangaroo of this enviroment:\n \n" + kangaroo1.toString();
		
			msg = msg + "The amount of food that the animal needs is: " + calculateFood1() + "kg.\n";
		
			msg = msg + "The amount of water that the animal needs is: " + calculateWater1() + "l.\n";	
			
		}


		if(kangaroo2 != null){

			msg = msg + "\n \nThe second kangaroo of this enviroment:\n \n" + kangaroo2.toString();

			msg = msg + "The amount of food that the animal needs is: " + calculateFood2() + "kg.\n";

			msg = msg + "The amount of water that the animal needs is: " + calculateWater2() + "l.\n";

		}

		if(kangaroo3 != null){

			msg = msg + "\n \nThe third kangaroo of this enviroment:\n \n" + kangaroo3.toString();

			msg = msg + "The amount of food that the animal needs is: " + calculateFood3() + "kg.\n";

			msg = msg + "The amount of water that the animal needs is: " + calculateWater3() + "l.\n";

		}

		return msg; 

	}

}
