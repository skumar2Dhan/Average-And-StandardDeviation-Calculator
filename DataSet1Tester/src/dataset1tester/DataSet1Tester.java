/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataset1tester;

import java.util.Random;

public class DataSet1Tester {
public static void main(String[] args){

DataSet1 a = new DataSet1();
Random generator = new Random();

for (int i = 0; i<100; i++)
{
a.add(generator.nextDouble() * 1000);
}
System.out.println("There is a total of   " + a.getIncrementNumber());
System.out.println("The average is:   " + a.getAverage());
System.out.println("The maximum value is: " + a.getMaximum());
}
}
