/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicoheranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SHARK
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Employee> list=new ArrayList<>();
        
        
        System.out.print("Enter the number of employees: ");
        int n=sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Employee #"+(i+1)+" data:");
            System.out.print("Outsourced (y/n)");
            String res=sc.next();
            
           
            System.out.print("Name: ");
            String name=sc.next();
            System.out.print("Hours: ");
            Integer hours=sc.nextInt();
            System.out.print("Value per hour: ");
            Double value=sc.nextDouble();
            
            
            if("y".equals(res)){
                System.out.print("Additional charge: ");
                Double ad=sc.nextDouble();
                Employee emp= new OutsourcedEmployee(ad,name,hours,value);
                list.add(emp);
            }
            if("n".equals(res)){
                Employee emp= new Employee(name,hours,value);
                list.add(emp);
            }
            
            
        }
        
        System.out.println("Payments:");
        for (var e:list) {
            String txt;
            txt=e.getName()+" - $"+e.payment();
            System.out.println(txt);
        }
    }
}
