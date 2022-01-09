public class EphrataTemp {

    public static void main(String[] args) {

        int[] hightemp = {26, 43, 28, 30};

        int sum = 0;
        int count = 0;

        // Calculate Sum, Count, and Average Temperature

        for (int t = 0; t < hightemp.length; t++) {        
            sum += hightemp[t];
            count++;
            //System.out.println(count);
        }

        double averageTemp = (double)sum / count;

        System.out.println("Average Daily Temperature: " + averageTemp);

        // Count and print out the number of days the tempature was below the average tempature
        int badt = 0;
        for (int t = 0; t < hightemp.length; t++) { 
            if(hightemp[t] < averageTemp){
                badt++;
            }
        }
        
        System.out.println("Days below Average Daily Temperature: " + badt);

        // Using a ForEach Loop Count and print out the number of days the tempature was above the average tempature
        int aadt = 0;
        for(int t : hightemp){
            if(t > averageTemp){
                aadt++;
            }
        }

        System.out.println("Days above Average Daily Temperature: " + aadt);
        
    }

}
