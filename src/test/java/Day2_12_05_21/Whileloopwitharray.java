package Day2_12_05_21;


public class Whileloopwitharray {
    public static void main(String[] args) {

        //literate through all boroughs defined by dynamic array using while Loop
        String[] boroughs = new String[6];
        boroughs[0] = "Brooklyn";
        boroughs[1] = "Queens";
        boroughs[2] = "Manhattan";
        boroughs[3] = "Bronx";
        boroughs[4] = "Staten";
        boroughs[5] = "LI";


        //declare and define the initial starting point
        int i = 0;

//define while loop with your end point (condition)
        while(i<boroughs.length){
            System.out.println("My current borough is " + boroughs[i]);
            i= i+1; //if there is no incrementation, the while loop becomes infinite Loop

        }//end of while Loop
    }//end of main
}//end of java class







  //  public static void main(String[] args) {

  //  String[] borough = new String[2];

  //  borough[0] = "Manhatten";
  //  borough[1] = "brooklyn";
  //  borough[2] = "queens";

  //  int i = 0;

  //  while ("i<borough.lenght"){
    //    System.out.println("My current borough is" + borough[i]);
    //    i=i+1

  //  }//end of while loop



 //   }