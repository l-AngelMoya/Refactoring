/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinCodeSmell;

import ConCodeSmell.*;

/**
 *
 * @author Angel Moya
 */
public class Person {
    private String name;
    private TelefoneNumberOffice numberOffice;
  

    public Person(String name, TelefoneNumberOffice number) {
        this.name = name;
        this.numberOffice=number;
    }

    public String getTelephoneNumber(){
        return (numberOffice.getOfficeCodeArea()+numberOffice.getOfficeNumber());
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TelefoneNumberOffice getNumberOffice() {
        return numberOffice;
    }

    public void setNumberOffice(TelefoneNumberOffice numberOffice) {
        this.numberOffice = numberOffice;
    }

    
    
}
