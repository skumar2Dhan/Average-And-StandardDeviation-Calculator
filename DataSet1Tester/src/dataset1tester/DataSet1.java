/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataset1tester;

/**
 *
 * @author user
 */
public class DataSet1 {

    public DataSet1(){

sum = 0;
sum_square = 0;
max = 0;
n = 0;
}

public double getAverage()
{
double average = sum / n;
return average;
}

public double getDeviation()
{
double stddev = Math.sqrt((sum_square - sum / n) / (n - 1));
return stddev;
}

public int getIncrementNumber()
{
return n;
}

public double getMaximum()
{
return max;
}

public void add(double x)
{
if (n==0)
max = x;
else if (x > max)
max = x;

sum = sum + x;
sum_square = sum_square + x * x;
n++;
}
private double sum;
private double sum_square;
private double max;
private int n;
}
