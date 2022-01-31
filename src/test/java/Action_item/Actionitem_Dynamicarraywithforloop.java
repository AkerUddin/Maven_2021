package Action_item;

public class Actionitem_Dynamicarraywithforloop {


        public static void main(String[] args) {

            //literate through all zipcodes and streetnumbers defined by dynamic array using forLoop
            String[] zipcodes = new String[5];

            zipcodes[0] = "14212";
            zipcodes[1] = "14213";
            zipcodes[2] = "14214";
            zipcodes[3] = "14215";
            zipcodes[4] = "14216";

            //int dynamic array
            int[] streetNumber = new int[5];
            streetNumber[0] = 100;
            streetNumber[1] = 200;
            streetNumber[2] = 300;
            streetNumber[3] = 400;
            streetNumber[4] = 500;



            for (int i = 0; i < zipcodes.length; i++) {
                //Printstatement

                System.out.println("My current zipcode is " + zipcodes[i] + " and street Number is " + streetNumber[i]);



            }//end of for loop


        }//end of main
    }//end of JavaClass

