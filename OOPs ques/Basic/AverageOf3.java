
public class AverageOf3 {
    public static void main(String[] args) {
        Average av = new Average();
        av.setAvg(5,10,2);
        System.out.println("Average of 5,10 and 2 is " + av.avg);
    }
}


class Average{
    float avg;

    void setAvg(int x,int y,int z){
        avg = (x+y+z)/3.3f;

    }
}