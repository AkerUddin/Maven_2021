package Day4_12_12_21;

public class loop_inarray_condition {


    public static void main(String[] args) {

    //create a dynamic array for different cities, itereate through the values but only print when city is
        //either brooklyn or queens
        String[] cities = new String[4];
        cities[0] = "Queens";
        cities[1] = "Manhatten";
        cities[2] = "Bronx";
        cities[3] = "Brooklyn";

    int i = 0;
        while(i < cities.length) {


        //two if conditions
        //when you are not sure if the value is in upper case , lower case or mixed case
        if (cities[i].toLowerCase().equals("brooklyn")){
        System.out.println("City is " + cities[i]);


        }else if(cities[i].toUpperCase().equals("QUEENS")) {
        System.out.println("City is " + cities[i]);
        }//end of conditions
        i++;

        }//end of while loop

        }//end of main


}//end of java class
