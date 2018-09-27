/*
 * Kaia Mac
 * Net pay of an employee 
 * September 18th, 2018
 */

package net.pay;

/**
 *
 * @author kamac8665
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double hours = 40;
        
        double pay = 5.00;
        
        double deductions = 2.00;
        
        double tax = 0.22;
        
        double netpay = 0.0;
        
        netpay = (hours*pay-deductions)-tax*(hours*pay-deductions);
        
        System.out.println("The net pay of this employee is... $" + netpay);
    }
    
}
