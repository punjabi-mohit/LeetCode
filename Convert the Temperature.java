class Solution {
    public double[] convertTemperature(double celsius) {
        double[] temp1=new double[2];
        temp1[0]=celsius +273.15;
        temp1[1]=celsius * 1.80 + 32.00; 
        return temp1;
    }
}
