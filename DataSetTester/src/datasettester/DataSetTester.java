/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasettester;


import java.util.Random;

public class DataSetTester {

    public static void main(String[] args) {
        DataSet a = new DataSet();
        Random generator = new Random();

        int z = 0;
        for (int i = 0; i < 100; i++) {
            z = generator.nextInt(1000) + 1;
            a.add(z);
            System.out.println("" + z);
        }
        System.out.println();
        //System.out.println(""+ a.maxValue);//works only if the variable maxValue in DataSet class is declared as public
        //System.out.println("There is a average of :" + a.sum/100);//works only if the variable sum in DataSet class is declared as public
        System.out.println("There is a average of :" + a.getAverage());
        System.out.println("The maximum value is : " + a.getMaximum());
    }
}
