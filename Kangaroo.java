package model;

public class Kangaroo

{

	public final static double
	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------

	private String name;		// this would be the name of the kangaroo.
	
	private int weight;  		// this would be the weight of the kangaroo.

	private double height;      // this would be the weight of the kangaroo.

	private String sex; 		// this would say if the kangaroo is male or female.

	private String bloodType;   // this would be the kind of blood that the kangaroo has.

	private double bmi; 		// this would be the body mass index.

	private String vaccine;		// this would say if the kangaroo needs to be vaccinated. 

	private String heartRisk;	// this would say the level of heart risk. 

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------

	private DateK birth;			// this would be the birthday of th kangaroo

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------
// in this method I am initializing the object, and assigning each parameter to each attribute.
	public Kangaroo(String newName, int newWeight, double newHeight, String newSex, String newBloodType, double newBmi, String newHeartRisk, String newVaccine, DateK newBirth)

	{
		
		name      = newName;
		
		weight    = newWeight;

		height    = newHeight;

		sex       = newSex;

		bloodType = newBloodType;		

		bmi       = newBmi;

		heartRisk = newHeartRisk;
		
		vaccine   = newVaccine;

		birth     = newBirth;

	}
//this method helps us to get the value of the attribute name.
	public String getName()
	
	{

		return name;

	}
//this method helps us to assign an initial value to the attribute name.
	public void setName(String newName)
		
	{

		name = newName;

	}
//this method helps us to get the value of the attribute height.
	public double getHeight()

	{

		return height;

	}
//this method helps us to assign an initial value to the attribute height.
	public void setHeight(double newHeight)

	{

		height = newHeight;

	}
//this method helps us to get the value of the attribute weight.
	public int getWeight()

	{

		return weight;

	}
//this method helps us to assign an initial value to the attribute weight.
	public void setWeight(int newWeight)

	{

		weight = newWeight;

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
//this method helps us to get the value of the attribute bloodType.
	public String getBloodType()

	{

		return bloodType;

	}
//this method helps us to assign an initial value to the attribute bloodType.
	public void setBloodType(String newBloodType)

	{

		bloodType = newBloodType;

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
//here, the operation of the ibm is declared
	public double calculateBmi()

	{

		return (weight / (height*height));

		

	}
//this method helps us to get the value of the attribute heartRisk.
	public String getHeartRisk()

	{

		return heartRisk;

	}
//this method helps us to assign an initial value to the attribute heartRisk.
	public void setHearRisk(String newHeartRisk)

	{

		heartRisk = newHeartRisk;

	}
// here, I'm calculating when the kangaroo has a heart risk
	public String calculateHeartRisk()

	{
 
		if (calculateBmi() <= 18){

			if (bloodType == "ab" ){

				heartRisk = "low risk";

			}else{

				heartRisk = "medium risk";
				
			}

			if (bloodType == "a"){

				heartRisk = "low risk";

			}else{

				heartRisk = "medium risk";

			}
			
		}else if(calculateBmi() <= 25 ){

				heartRisk = "low risk";

		}else if(bloodType == "ab"){

			heartRisk = "low risk";

		}else{

			heartRisk = "high risk";

		}

		return heartRisk;

	}//(bmi <= 18 ? (bloodType == ab ?  ("low risk" : "medium risk") : (bloodType == a ? "low risk" : "medium risk") : (bmi <=25 ? "low risk" : bloodType == "ab" ? "low risk" : "high risk"));
//this method helps us to get the value of the attribute vaccine.
	public String getVaccine()

	{

		return vaccine;

	}
//this method helps us to assign an initial value to the attribute vaccine.
	public void setVaccine(String newVaccine)

	{

		vaccine = newVaccine;

	}
//this method helps us to get the value of the relation birth.
	public DateK getBirth()

	{

		return birth;

	}
//this method helps us to assign an initial value to the the relation birth.
	public void setBirth(DateK newBirth)

	{

		birth = newBirth;

	}

	public String calculateVaccine(){

		DateK today = new DateK (newDay, newMonth, newYear)	
	}

	public String toString()

	{

		String msg = "";
		
		msg = msg + "The name of the animal is:  " + name + "\n";

		msg = msg + "The height of te animal is: " + height + "m.\n";

		msg = msg + "The weight of the animal is: " + weight + "kg.\n";

		msg = msg + "The sex of the animal is: " + sex + ".\n";

		msg = msg + "The blood Type of the animal is: " + bloodType + ".\n";

		msg = msg + "The body mass index of the animal is: " + calculateBmi() + "kg/m².\n";

		msg = msg + "The animal" + vaccine + " to be vaccinated.\n";

		msg = msg + "The animal has a " + calculateHeartRisk() + " to have a heart disease.\n";

		msg = msg + birth.toString();

		return msg;

	}



}
