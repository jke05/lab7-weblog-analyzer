
/**
 * Read web server data and analyse hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 7.0
 */
public class LogAnalyzer
{
    public static final int HOURS_PER_DAY = 24;
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;
    

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer(String fileName)
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[HOURS_PER_DAY];
        // Create the reader to obtain the data.
        reader = new LogfileReader(fileName);
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        for(int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);
        }
    }
    
    public void printHourlyCountsWhile(){
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

   public void printGreater(double[] marks, double mean){
       for (int index = 0; index <= marks.length; index++){
           if (marks[index] > mean){
               System.out.println(marks[index]);
           }
       }
   }

    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData(){

    {
        reader.printData();
    }
   }
   
   public int busiestHour(){
       int busiestHour = 0;
       for (int hour = 1; hour < hourCounts.length ; hour++){
           if (hourCounts[hour] > hourCounts[busiestHour]){
               busiestHour = hour;
           }
       }
       return busiestHour;
   }
   
   public int quietestHour(){
       int quietestHour = 0;
       for (int hour = 1; hour < hourCounts.length ; hour++){
           if (hourCounts[hour] < hourCounts[quietestHour]){
               quietestHour = hour;
           }
       }
       return quietestHour;
   }
   
   public int busiestPeriod(){
       int busiestTwoHour = 0;
       int maxCount = hourCounts[0] + hourCounts[1];
       for (int hour = 0; hour < hourCounts.length - 1 ; hour++){
           int twoHourCount = hourCounts[hour] + hourCounts[hour + 1];
           if (twoHourCount > maxCount){
               maxCount = twoHourCount;
               busiestTwoHour = hour;
           }
       }
       return busiestTwoHour;
   }
}