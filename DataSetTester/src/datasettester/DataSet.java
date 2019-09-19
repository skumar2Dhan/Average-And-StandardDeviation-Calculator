/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasettester;

/*
Genrate 100 random numbers between 0 and 1000 and add them to a DataSet. Print out the average and the
maximum.
 */
public class DataSet {

    
    private double sum;
    private double maxValue;

    public DataSet() {
        maxValue = 0.0;
        sum=0.0;
    }

    public double getAverage() {//
        return sum / 100;
    }

    public void add(double x) {//
        if (x > maxValue) {
            maxValue = x;
        }
        sum = sum + x;
    }

    public double getMaximum() {//
        return maxValue;
    }
}
