

public class Area {
    public static void main(String[] args) {
        Areaa A = new Areaa();
        A.setDim(5, 10);
        A.setArea();
        System.out.println("Diameter "+ A.dim);
        System.out.println("Area "+ A.area);
    }
}

class Areaa{
    int dim;
    int area;

    void setDim(int l, int b){
        dim = 2*(l+b);
    }

    void setArea(){
        area = dim/2;
    }
}

