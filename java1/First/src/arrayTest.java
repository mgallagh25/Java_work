class arrayTest {
    public static void main(String[] args) {
        // declares an array of integers
       // int[] anArray;       //this line
    	
    	int[] anArray = {100, 200, 300,     //or this
        	    400, 500, 600, 
        	    700, 800, 900, 1000};

        // allocates memory for 10 integers
        //anArray = new int[10];
        
    	String[][] names={
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
            };

    	System.out.println(names[0][0] + names[0][1]+names[0][2]+names[1][0]+names[1][1]);
        // Ms. Jones
        System.out.println(names[0][1] + names[1][1]);

        
        
        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
        
        
        System.out.println(anArray.length);

    }
}