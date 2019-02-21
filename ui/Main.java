package ui;

import model.*;

import java.util.*;

public class Main 
{
	//--------------------------------------------------------------------------------------------------

	//Atributes


	//--------------------------------------------------------------------------------------------------

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------

	private Zoo connect;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------

	public static void main(String[] args) 

	{


		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce the zoo name");//introduzca

		String newName = scan.nextLine();//lealo

		System.out.println("Introduce the NIT");//introduzca

		String newNit = scan.nextLine();//lealo

		Main main = new Main(newName, newNit);

		Kangaroo kan1 = main.connect.getZoneK().getKe1().getKangaroo1();

		Kangaroo kan2 = main.connect.getZoneK().getKe1().getKangaroo2();

		Kangaroo kan3 = main.connect.getZoneK().getKe1().getKangaroo3();

		Kangaroo kan4 = main.connect.getZoneK().getKe2().getKangaroo1();

		Kangaroo kan5 = main.connect.getZoneK().getKe2().getKangaroo2();

		Kangaroo kan6 = main.connect.getZoneK().getKe2().getKangaroo3();

		Kangaroo kan7 = main.connect.getZoneK().getKe3().getKangaroo1();

		Kangaroo kan8 = main.connect.getZoneK().getKe3().getKangaroo2();

		KangarooEnviroment env1 = main.connect.getZoneK().getKe1();

		KangarooEnviroment env2 = main.connect.getZoneK().getKe2();

		KangarooEnviroment env3 = main.connect.getZoneK().getKe3();

		Dragon dra1 = main.connect.getZoneD().getDragon1();

		Dragon dra2 = main.connect.getZoneD().getDragon2();



		System.out.println("Today is Sunday, February 10 of 2019");

		System.out.println("This is the monitor of the animals in the Australian Outback of the: " +main.connect.getName());

		System.out.println(" ");

		System.out.println("In the ​​kangaroos zone there are three environments");

		System.out.println("In the two first enviroments there are three kangaroos, and in the third one there are two kangaroos ");

		System.out.println(" ");

		System.out.print("The total area of the kangaroo zone is: " +main.connect.getZoneK().getTotalArea());

		System.out.println("m².");

		System.out.print("The area of the first kangaroo enviroment is: " +env1.getEnviromentArea());

		System.out.println("m².");

		System.out.print("the area of the second enviroment is : " +env2.getEnviromentArea());

		System.out.println("m².");

		System.out.print("and the area of the third enviroment is : " +env3.getEnviromentArea());

		System.out.println("m².");

		System.out.println("Information of all kangaroos"  );

		System.out.println("");

		System.out.println("				First enviroment");

		System.out.println("");

		System.out.println("First kangaroo:");

		System.out.println("");

		System.out.println("Name: " +kan1.getName());

		System.out.print("Weight: " +kan1.getWeight());

		System.out.println("kg.");

		System.out.print("Height: " +kan1.getHeight());

		System.out.println("mts.");

		System.out.println("Sex: " +kan1.getSex());

		System.out.println("Blood type: " +kan1.getBloodType());

		System.out.print("Birthdate: " +kan1.getBirth().getDay());

		System.out.print("/" +kan1.getBirth().getMonth());

		System.out.println("/" +kan1.getBirth().getYear());

		System.out.println("The body mass index is: " + kan1.getBmi());

		System.out.print("Amount of food that the animal needs: " +env1.getFood1());

		System.out.println("kg.");

		System.out.print("Amount of water that the animal needs: " +env1.getWater1());

		System.out.println("l.");

		System.out.print("The animal has a "+kan1.getHeartRisk());

		System.out.println(" to have a heart disease");

		System.out.print("The animal "+kan1.getVaccine());

		System.out.println(" to be vaccinated.");

		System.out.println("");


		System.out.println("Second kangaroo:");

		System.out.println("");

		System.out.println("Name: " +kan2.getName());

		System.out.print("Weight: " +kan2.getWeight());

		System.out.println("kg.");

		System.out.println("Height: " +kan2.getHeight());

		System.out.print("mts.");

		System.out.println("Sex: " +kan2.getSex());

		System.out.println("Blood type: " +kan2.getBloodType());

		System.out.print("Birthdate: " +kan2.getBirth().getDay());

		System.out.print("/" +kan2.getBirth().getMonth());

		System.out.println("/" +kan2.getBirth().getYear());

		System.out.println("The body mass index is: " + kan2.getBmi());

		System.out.print("Amount of food that the animal needs: " +env1.getFood2());

		System.out.println("kg.");

		System.out.print("Amount of water that the animal needs: " +env1.getWater2());

		System.out.println("l.");

		System.out.print("The animal has a "+kan2.getHeartRisk());

		System.out.println(" to have a heart disease");

		System.out.print("The animal "+kan2.getVaccine());

		System.out.println(" to be vaccinated.");

		

		System.out.println("");

		System.out.println("third kangaroo:");

		System.out.println("");

		System.out.println("Name: " +kan3.getName());

		System.out.print("Weight: " +kan3.getWeight());

		System.out.println("kg.");

		System.out.print("Height: " +kan3.getHeight());

		System.out.println("mts.");

		System.out.println("Sex: " +kan3.getSex());

		System.out.println("Blood type: " +kan3.getBloodType());

		System.out.print("Birthdate: " +kan3.getBirth().getDay());

		System.out.print("/" +kan3.getBirth().getMonth());

		System.out.println("/" +kan3.getBirth().getYear());

		System.out.println("The body mass index is: " + kan3.getBmi());

		System.out.print("Amount of food that the animal needs: " +env1.getFood3());

		System.out.println("kg.");

		System.out.print("Amount of water that the animal needs: " +env1.getWater3());

		System.out.println("l.");

		System.out.print("The animal has a "+kan3.getHeartRisk());

		System.out.println(" to have a heart disease");

		System.out.print("The animal "+kan3.getVaccine());

		System.out.println(" to be vaccinated.");

		

		System.out.println("");

		System.out.println("				Second enviroment");

		System.out.println("");

		System.out.println("fourth kangaroo:");

		System.out.println("");

		System.out.println("Name: " +kan4.getName());

		System.out.print("Weight: " +kan4.getWeight());

		System.out.println("kg.");

		System.out.print("Height: " +kan4.getHeight());

		System.out.println("mts.");

		System.out.println("Sex: " +kan4.getSex());

		System.out.println("Blood type: " +kan4.getBloodType());

		System.out.print("Birthdate: " +kan4.getBirth().getDay());

		System.out.print("/" +kan4.getBirth().getMonth());

		System.out.println("/" +kan4.getBirth().getYear());

		System.out.println("The body mass index is: " + kan4.getBmi());

		System.out.print("Amount of food that the animal needs: " +env2.getFood1());

		System.out.println("kg.");

		System.out.print("Amount of water that the animal needs: " +env2.getWater1());

		System.out.println("l.");

		System.out.print("The animal has a "+kan4.getHeartRisk());

		System.out.println(" to have a heart disease");

		System.out.print("The animal "+kan4.getVaccine());

		System.out.println(" to be vaccinated.");

		

		System.out.println("");

		System.out.println("Fifth kangaroo:");

		System.out.println("");

		System.out.println("Name: " +kan5.getName());

		System.out.print("Weight: " +kan5.getWeight());

		System.out.println("kg.");

		System.out.print("Height: " +kan5.getHeight());

		System.out.println("mts.");

		System.out.println("Sex: " +kan5.getSex());

		System.out.println("Blood type: " +kan5.getBloodType());

		System.out.print("Birthdate: " +kan5.getBirth().getDay());

		System.out.print("/" +kan5.getBirth().getMonth());

		System.out.println("/" +kan5.getBirth().getYear());

		System.out.println("The body mass index is: " + kan5.getBmi());

		System.out.print("Amount of food that the animal needs: " +env2.getFood2());

		System.out.println("kg.");

		System.out.print("Amount of water that the animal needs: " +env2.getWater2());

		System.out.println("l.");

		System.out.print("The animal has a "+kan5.getHeartRisk());

		System.out.println(" to have a heart disease");

		System.out.print("The animal "+kan5.getVaccine());

		System.out.println(" to be vaccinated.");

		

		System.out.println("");

		System.out.println("Sexth kangaroo:");

		System.out.println("");

		System.out.println("Name: " +kan6.getName());

		System.out.print("Weight: " +kan6.getWeight());

		System.out.println("kg.");

		System.out.print("Height: " +kan6.getHeight());

		System.out.println("mts.");

		System.out.println("Sex: " +kan6.getSex());

		System.out.println("Blood type: " +kan6.getBloodType());

		System.out.print("Birthdate: " +kan6.getBirth().getDay());

		System.out.print("/" +kan6.getBirth().getMonth());

		System.out.println("/" +kan6.getBirth().getYear());

		System.out.println("The body mass index is: " + kan6.getBmi());

		System.out.print("Amount of food that the animal needs: " +env2.getFood3());

		System.out.println("kg.");

		System.out.print("Amount of water that the animal needs: " +env2.getWater3());

		System.out.println("l.");

		System.out.print("The animal has a "+kan6.getHeartRisk());

		System.out.println(" to have a heart disease");

		System.out.print("The animal "+kan6.getVaccine());

		System.out.println(" to be vaccinated.");

		

		System.out.println("");

		System.out.println("				Third enviroment");

		System.out.println("");

		System.out.println("Seventh kangaroo:");

		System.out.println("");

		System.out.println("Name: " +kan7.getName());

		System.out.print("Weight: " +kan7.getWeight());

		System.out.println("kg.");

		System.out.print("Height: " +kan7.getHeight());

		System.out.println("mts.");

		System.out.println("Sex: " +kan7.getSex());

		System.out.println("Blood type: " +kan7.getBloodType());

		System.out.print("Birthdate: " +kan7.getBirth().getDay());

		System.out.print("/" +kan7.getBirth().getMonth());

		System.out.println("/" +kan7.getBirth().getYear());

		System.out.println("The body mass index is: " +kan7.getBmi());

		System.out.print("Amount of food that the animal needs: " +env3.getFood1());

		System.out.println("l.");

		System.out.print("Amount of water that the animal needs: " +env3.getWater1());

		System.out.println("l.");

		System.out.print("The animal has a "+kan7.getHeartRisk());

		System.out.println(" to have a heart disease");

		System.out.print("The animal "+kan7.getVaccine());

		System.out.println(" to be vaccinated in 24 weeks and 0 days.");

		

		System.out.println("");

		System.out.println("Eighth kangaroo:");

		System.out.println("");

		System.out.println("Name: " +kan8.getName());

		System.out.print("Weight: " +kan8.getWeight());

		System.out.println("kg.");

		System.out.print("Height: " +kan8.getHeight());

		System.out.println("mts.");

		System.out.println("Sex: " +kan8.getSex());

		System.out.println("Blood type: " +kan8.getBloodType());

		System.out.print("Birthdate: " +kan8.getBirth().getDay());

		System.out.print("/" +kan8.getBirth().getMonth());

		System.out.println("/" +kan8.getBirth().getYear());

		System.out.println("The body mass index is: " + kan8.getBmi());

		System.out.print("Amount of food that the animal needs: " +env3.getFood2());

		System.out.println("kg.");

		System.out.print("Amount of water that the animal needs: " +env3.getWater2());

		System.out.println("l.");

		System.out.print("The animal has a "+kan8.getHeartRisk());

		System.out.println(" to have a heart disease");

		System.out.print("The animal "+kan8.getVaccine());

		System.out.println(" to be vaccinated.");

		

		System.out.println("");

		System.out.println("The Bearded Dragons zone ");

		System.out.println("");

		System.out.print("The temperature in the zone is: " +main.connect.getZoneD().getTemperature());

		System.out.println(", so, " +main.connect.getZoneD().getTemperatureOK());

		System.out.print("The weight of the food in the Dragon Zone is: " +main.connect.getZoneD().getFood());

		System.out.print("kg");

		System.out.println(", so, " +main.connect.getZoneD().getEnoughFood());

		System.out.println("Information about Dragons");

		System.out.println("");

		System.out.println("First Dragon");

		System.out.println("");

		System.out.println("name:" +dra1.getName());

		System.out.print("weight: " +dra1.getWeight());

		System.out.println("kg.");

		System.out.print("lengthy: " +dra1.getLengthy());

		System.out.println("mts.");

		System.out.println("sex: " +dra1.getSex());

		System.out.println("body mass index: " +dra1.getBmi());

		System.out.println("water that the animal needs:  " +main.connect.getZoneD().getWater1());

		System.out.println("");

		System.out.println("Second Dragon");

		System.out.println("");

		System.out.println("name:" +dra2.getName());

		System.out.print("weight: " +dra2.getWeight());

		System.out.println("kg.");

		System.out.print("lengthy: " +dra2.getLengthy());

		System.out.println("mts.");

		System.out.println("sex: " +dra2.getSex());

		System.out.println("body mass index: " +dra2.getBmi());

		System.out.println("water that the animal needs:  " +main.connect.getZoneD().getWater2());




		
		









		
	}

	public Main(String newName, String newNit)

	{

		connect = new Zoo(newName, newNit);

	}
	
}

