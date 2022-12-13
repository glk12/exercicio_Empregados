/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicoheranca;

/**
 *
 * @author SHARK
 */
public class OutsourcedEmployee extends Employee {
    
    public Double additionalCharge;

    public OutsourcedEmployee(Double additionalCharge, String name, Integer hours, Double valuePerHour) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }
    
    @Override
    public Double payment(){
        return super.payment()+additionalCharge*1.1 ;
    }
    
}
