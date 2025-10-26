1. The busiest hours of the day are: 18, 14 and 10
2. private Person[] people;
3. private boolean[] vacant;
4. The hourCounts variable is being used in all the methods
except the printData method
5. int[] counts;
   boolean[] occupied = new boolean[5000];
6. reading = new double[60];
   urls = new String[90];
   machines = new TicketMachine[5];
7. 20
8. prices = new double[50];
9. Index 24 out of bounds
10. public void printHourlyCountsWhile(){
        //declaration
        int hour = 0;
        System.out.println("Hr: Count");
        //while condition
        while (hour < hourCounts.length) {
            //body
            System.out.println(hour + ": " + hourCounts[hour]);
            
            //update
            hour ++;
        }
   }
11. public void printGreater(double[] marks, double mean){
       for (int index = 0; index <= marks.length; index++){
           if (marks[index] > mean){
               System.out.println(marks[index]);
           }
       }
   }
12. public LogAnalyzer(String fileName)
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[HOURS_PER_DAY];
        // Create the reader to obtain the data.
        reader = new LogfileReader(fileName);
    }