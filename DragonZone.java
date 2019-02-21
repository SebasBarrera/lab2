package model;

public class DragonZone 

{

	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------

	private double temperature;		// this would be the temperature of the Dragon zone, it had to be among 35º and 40º.

	private double water1;			// this would be the amount of water that the baearded dragon1  needs.

	private double water2;			// this would be the amount of water that the baearded dragon2  needs.

	private String enoughFood;		// this would notice when de amount of Food is below 5 kgs. We will take yes if the food is below 5 kgs, and no if it doesn´t.

	private double food;			// this would be de amount of food.

	private String temperatureOK;   // this would say if de temperature is ok. We will take yes if the temperature is among 35º and 40º, and no if it doesn´t.

	//--------------------------------------------------------------------------------------------------

	//relations

	//--------------------------------------------------------------------------------------------------

	private Dragon dragon1;		// there are the
								// bearded dragons
	private Dragon dragon2;		// in the zone

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------
	
	public DragonZone(double newWater1, double newWater2, double newTemperature, String newEnoughFood, String newTemperatureOK, double newFood, Dragon newDragon1, Dragon newDragon2) 

	{// in this method I am initializing the object, and assigning each parameter to each attribute.

		water1         = newWater1;

		water2         = newWater2;

		temperature   = newTemperature;

		enoughFood    = newEnoughFood;

		temperatureOK = newTemperatureOK;

		food          = newFood;

		dragon1       = newDragon1;

		dragon2       = newDragon2;
	}

	public double getWater1()

	{//this method helps us to get the value of the attribute water1.

		return water1;

	}

	public void setWater1(double newWater1)

	{//this method helps us to assign an initial value to the attribute water1.

		water1 = newWater1;

	}

	public double getWater2()

	{//this method helps us to get the value of the attribute water2.

		return water2;

	}

	public void setWater2(double newWater2)

	{//this method helps us to assign an initial value to the attribute water2.

		water2 = newWater2;

	}

	public double calculateWater1()

	{// here, I'm calculating how many water the kangaroo needs

		return dragon1.calculateBmi() * 0.75;

	}

	public double calculateWater2()

	{// here, I'm calculating how many water the kangaroo needs

		return dragon2.calculateBmi() * 0.75;

	}

	public double getTemperature()

	{//this method helps us to get the value of the attribute temperature.

		return temperature;

	}

	public void setTemperature(double newTemperature)

	{//this method helps us to assign an initial value to the attribute temperatureenoughtFood.

		temperature = newTemperature;

	}

	public String getTemperatureOK()

	{//this method helps us to get the value of the attribute temperatureOK.

		return temperatureOK;

	}

	public void setTemperatureOK(String newTemperatureOK)

	{//this method helps us to assign an initial value to the attribute temperatureOK.

		temperatureOK = newTemperatureOK;

	}

	public String calculateTemperatureOK()

	{

		return (temperature <= 40) ? ((temperature >= 35) ? "yes" : "no" ): "no";

	}

	public double getFood()

	{//this method helps us to get the value of the attribute food.

		return food;

	}



	public void setFood(double newFood)

	{//this method helps us to assign an initial value to the attribute food.

		food = newFood;

	}

	public String getEnoughFood()

	{//this method helps us to get the value of the attribute enoughFood.

		return enoughFood;

	}

	public void setEnoughFood(String newEnoughFood)

	{//this method helps us to assign an initial value to the attribute enoughtFood.

		enoughFood = newEnoughFood;

	}

	public String calculateIfThereIsEnoughtFood()

	{

		return (food < 5) ? "you need to put more food" : "there is enought food";

	}

	public Dragon getDragon1()

	{//this method helps us to get the value of the relation dragon1.

		return dragon1;

	}

	public void setDragon1(Dragon newDragon1)

	{//this method helps us to assign an initial value to the attribute dragon1.

		dragon1 = newDragon1;

	}

	public Dragon getDragon2()

	{//this method helps us to get the value of the relation dragon2.

		return dragon2;

	}

	public void setDragon2(Dragon newDragon2)

	{//this method helps us to assign an initial value to the attribute dragon2.

		dragon2 = newDragon2;

	}

	public String toString(){

		String msg = "";

		msg = msg + "The temperature in the dragon zone is: " + temperature + ", so, " + calculateTemperatureOK() + ".\n";

		msg = msg + "The amount of food in this zone is: " + food + "kg, so, " + calculateIfThereIsEnoughtFood() + ".\n";

		msg = msg + "\nThe information about the first dragon:\n\n";

		msg = msg + dragon1.toString();

		msg = msg + "The amount of water that the animal needs is: " + calculateWater1() + "l.\n";

		msg = msg + "\nThe information about the second dragon:\n\n";

		msg = msg + dragon2.toString();

		msg = msg + "The amount of water that the animal needs is: " + calculateWater2() + "l.\n";

		return msg;

	}



}