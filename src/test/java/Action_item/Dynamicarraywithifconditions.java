package Action_item;

public class Dynamicarraywithifconditions {
    public static void main(String[] args) {
        //Create a  dynamic array for different cities, and iterate through the values and only print me when the city is Manhatten or brooklyn

//either Manhatten or brooklyn


        String[] cities = new String[4];
        cities[0] = "Queens";
        cities[1] = "Manhatten";
        cities[2] = "Bronx";
        cities[3] = "Brooklyn";


        int i = 0;
        while(i < cities.length) {


            //two if conditions
        //when you are not sure if the value is in upper case , lower case or mixed case
        if (cities[i].toLowerCase().equals("manhatten")){
            System.out.println("City is " + cities[i]);


        }else if(cities[i].toUpperCase().equals("BROOKLYN")) {
            System.out.println("City is " + cities[i]);
        }//end of conditions
        i++;

    }//end of while loop
    }//end of main
}//end of Java class










