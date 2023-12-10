public class arr{
    public static void main(String[] args) {

        // array use dto store multiple values in a single variable
        int[] num={1,2,3,4,5,6};
        String[] cars={"audi","bmw","maruti"};
        cars[0]="mercedes";
        System.out.println(cars[0]);
        System.out.println(cars[2]);

        String[] car=new String[3]; //can assign only 3 array
        car[0]="audi";
        car[1]="bmw";
        car[2]="mercedes";

        for(int i=0;i<cars.length;i++){
            System.out.println(car[i]);
        }

        
    }
}

// scanner.close();