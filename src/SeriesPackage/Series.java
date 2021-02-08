package SeriesPackage;

import java.util.ArrayList;

public class Series {

    public static int nSum(int n){

        int sum = 0;
        for (int i= 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n){

        ArrayList<Integer> track = new ArrayList<>();
        track.add(0);

        if (n >= 1){
            track.add(1);
        }

        for (int i = 2; i <= n; i++){
            int currentProduct = i * track.get(track.size() - 1);
            track.add(currentProduct);
        }
        return track.get(track.size() -1);
    }

    public static int fibonacci(int n){
        if (n == 0) return 0;
        if (n < 2) return 1;

        ArrayList<Integer> track = new ArrayList<>();
        track.add(0);
        track.add(1);

        for (int i = 2; i <= n; i++){
            int newFib = track.get(i -1) + track.get(i - 2);
            track.add(newFib);
        }

        return track.get(track.size() -1);
    }

}
