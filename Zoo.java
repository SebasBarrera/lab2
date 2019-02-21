package model;

public class Zoo 

{

	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------

	private String name;  // this would be the name of the Zoo

	private String nit;	  // this would be de nit of the Zoo

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------

	private KangarooZone zoneK;

	private DragonZone zoneD;

	private DateK date;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------

	public Zoo(String newName, String newNit)

	{// in this method I am initializing the object, and assigning each parameter to each attribute.

		nit   = newNit;

		name  = newName;

		//Date objDate = new Date(int newDay, int newMonth, int newYear)
		
		date = new DateK(8, 2, 2019);

		DateK objDateK1 = new DateK(31, 10, 2017);

		DateK objDateK2 = new DateK(8, 9, 2016);

		DateK objDateK3 = new DateK(28, 2, 2017);

		DateK objDateK4 = new DateK(4, 11, 2017);

		DateK objDateK5 = new DateK(21, 8, 2016);

		DateK objDateK6 = new DateK(18, 2, 2017);

		DateK objDateK7 = new DateK(10, 6, 2018);

		DateK objDateK8 = new DateK(4, 6, 2017);


		

		Kangaroo objKang1 = new Kangaroo("Jan", 55, 1.92, "Male", "ab", 14.91 , "low risk", "doesn't need", objDateK1);

		Kangaroo objKang2 = new Kangaroo("Sasha", 19, 1.57, "Female", "o", 7.7 , "medium risk", "doesn't need", objDateK2);

		Kangaroo objKang3 = new Kangaroo("Camla", 33, 1.48, "Female", "o", 15.06 , "medium risk", "doesn't need", objDateK3);

		KangarooEnviroment objKEnv1 = new KangarooEnviroment(42.8, 15.2, 36.3, 22.36, 11.55, 22.59, 15.36, 12.56, 11.81, 39.73, objKang1, objKang2, objKang3);

		Kangaroo objKang4 = new Kangaroo("Instrid", 29, 1.37, "Female", "b", 15.45 , "medium risk", "doesn't need", objDateK4);

		Kangaroo objKang5 = new Kangaroo("Facunda", 21, 1.7, "Female", "a", 7.26 , "low risk", "doesn't need", objDateK5);

		Kangaroo objKang6 = new Kangaroo("Teresa", 25, 1.63, "Female", "o", 9.4 , "medium risk", "doesn't need", objDateK6);

		KangarooEnviroment objKEnv2 = new KangarooEnviroment(23.2, 16.8, 20.0, 23.17, 10.89, 14.1, 10.96, 13.6, 13.04, 37.6, objKang4, objKang5, objKang6);

		Kangaroo objKang7 = new Kangaroo("Duola", 30, 1.51, "Female", "a", 13.15 , "low risk", "needs", objDateK7); 

		Kangaroo objKang8 = new Kangaroo("Cory", 69, 2.1, "Male", "a", 16.64 , "low risk", "doesn't need", objDateK8);

		KangarooEnviroment objKEnv3 = new KangarooEnviroment(33.0, 48.4, 21.6, 19.72, 24.96, 14.4, 12.08, 16.8, 13.36, 42.24, objKang7, objKang8, null);

		zoneK = new KangarooZone(119.57, objKEnv1, objKEnv2, objKEnv3);

		Dragon objDrag1 = new Dragon("Poker", 0.45, 0.6, "Male",  1.25);

		Dragon objDrag2 = new Dragon("Teola", 0.39, 0.52, "Female",  1.44);

		zoneD = new DragonZone(0.93, 1.08, 37.5, "You do not need to put more food", "The temperature is ok", 5.6, objDrag1, objDrag2);




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
//this method helps us to get the value of the attribute nit.
	public String getNit()

	{

		return nit;

	}
//this method helps us to assign an initial value to the attribute nit.
	public void setNit(String newNit)

	{

		nit = newNit;

	}
//this method helps us to get the value of the relation zone1.
	public KangarooZone getZoneK()

	{

		return zoneK;

	}
//this method helps us to assign an initial value to the relation zone1.
	public void setZoneK(KangarooZone newZoneK)

	{

		zoneK = newZoneK;

	}
//this method helps us to get the value of the relation zone2.
	public DragonZone getZoneD()

	{

		return zoneD;

	}
//this method helps us to assign an initial value to the relation zone2.
	public void setZoneD(DragonZone newZoneD)

	{

		zoneD = newZoneD;

	}

	public String toString(){

		String msg = "";

		if(zoneK!=null){

			msg += "today is " + date +".\n";

			msg = msg + "This is the monitor of the animals in the Australian Outback of the: " + name + ".\n";

			msg = msg + "In the kangaroos zone there are three enviroments. \n";

			msg = msg + zoneK.toString() + "\n";

		}

		msg = msg + "In the dragons zone there are two bearded dragons in one enviroment. \n";

		msg = msg + zoneD.toString();

		return msg;
	}
	public void chooseCreate(){


	}
	public Kangaroo createKangaroo(String newName, int newWeight, double newHeight, String newSex, String newBloodType, double newBmi, String newHeartRisk, String newVaccine, DateK newBirth){

			Kangaroo objKang = new Kangaroo(newName, newWeight, newHeight, newSex, newBloodType, newBmi, newHeartRisk, newVaccine, newBirth);

			return objKang;
	}

	public void newKangarooEnviroment(double newFood1, double newFood2, double newFood3, double newWater1, double newWater2, double newWater3, double newArea1, double newArea2, double newArea3, double newEnviromentArea, Kangaroo newKangaroo1, Kangaroo newKangaroo2, Kangaroo newKangaroo3){

			KangarooEnviroment objEnv = new KangarooEnviroment(newFood1, newFood2, newFood3, newWater1, newWater2, newWater3, newArea1, newArea2, newArea3, newEnviromentArea, newKangaroo1, newKangaroo2, newKangaroo3);
	}

	public void newKangarooZone(double newTotalArea, KangarooEnviroment newKe1, KangarooEnviroment newKe2, KangarooEnviroment newKe3){

			zoneK = new KangarooZone(newTotalArea, newKe1, newKe2, newKe3);
	}

	


}

