package model;

public class Dragon 

{

	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------

	private String name;		// this would be the name of the baearded dragon.
	
	private double weight;  	// this would be the weight of the baearded dragon.

	private double lengthy;       // this would be the lengthy of the baearded dragon.

	private String sex; 		// this would say if the baearded dragon  is male or female. We will take the value of M for male and the value of F for female.

	private double bmi; 		// this would be the body mass index.

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------

	// it doesn´t have relations

	//--------------------------------------------------------------------------------------------------

	//Methods//

	//--------------------------------------------------------------------------------------------------
// in this method I am initializing the object, and assigning each parameter to each attribute.
	public Dragon (String newName, double newWeight, double newLengthy, String newSex,  double newBmi)

	{
		
		name   = newName;

		weight = newWeight;

		lengthy  = newLengthy;		

		sex    = newSex;

		bmi    = newBmi;

	}
//this method helps us to get the value of the attribute name.
	public String getName()
	
	{

		return name;

	}
//this method helps us to assign an initial value to the attribute .
	public void setName(String newName)
		
	{

		name = newName;

	}
//this method helps us to get the value of the attribute height.
	public double getWeight()

	{

		return weight;

	}
//this method helps us to assign an initial value to the attribute weight.
	public void setwWight(double newWeight)

	{

		weight = newWeight;

	}
//this method helps us to get the value of the attribute weight.
	public double getLengthy()

	{

		return lengthy;

	}
//this method helps us to assign an initial value to the attribute lengthy.
	public void setLengthy(double newLengthy)

	{

		lengthy = newLengthy;

	}
//this method helps us to get the value of the attribute sex.
	public String getSex()

	{

		return sex;

	}
//this method helps us to assign an initial value to the attribute sex.
	public void setSex(String newSex)

	{

		sex = newSex;

	}
//this method helps us to get the value of the attribute bmi.
	public double getBmi()

	{

		return bmi;

	}
//this method helps us to assign an initial value to the attribute bmi.
	public void setBmi(double newBmi)

	{

		bmi = newBmi;

	}

	public double calculateBmi()

	{

		return (weight / (lengthy * lengthy));

	}

	public String toString(){

		String msg = "";

		msg = msg + "The name of the animal is:  " + name + "\n";

		msg = msg + "The lengthy of te animal is: " + lengthy + "m.\n";

		msg = msg + "The weight of the animal is: " + weight + "kg.\n";

		msg = msg + "The sex of the animal is: " + sex + ".\n";

		msg = msg + "The body mass index of the animal is: " + calculateBmi() + "kg/m².\n";

		return msg;


	}

}