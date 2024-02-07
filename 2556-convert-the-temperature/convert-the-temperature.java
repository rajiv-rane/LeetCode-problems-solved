class Solution {
    public double[] convertTemperature(double celsius) {
        double K=celsius+273.15;
        double F=celsius* 1.80+32.00;
        double arr[]=new double[2];
        arr[0]=K;
        arr[1]=F;
        return arr;
    }
}