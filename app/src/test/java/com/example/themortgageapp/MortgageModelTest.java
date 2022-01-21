package com.example.themortgageapp;
import org.junit.Assert;
import org.junit.Test;

public class MortgageModelTest {
    @Test


    public void testPayment () {
        String p, a, i;
        p = "700000"; a = "25";  i = "2.75";
     MortgageModel newModel = new MortgageModel(p,a,i);
     Assert.assertEquals("$3,229.18",newModel.computePayment());

        p = "300000"; a = "20";  i = "4.5";
        MortgageModel newModel1 = new MortgageModel(p,a,i);
        Assert.assertEquals("$1,897.95",newModel1.computePayment());
    }

}
