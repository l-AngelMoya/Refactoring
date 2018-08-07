/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConCodeSmell;

/**
 *
 * @author Angel Moya
 */
public class Person {
    private String name;
    private String officeCodeArea;
    private String officeNumber;

    public Person(String name, String officeCodeArea, String officeNumber) {
        this.name = name;
        this.officeCodeArea = officeCodeArea;
        this.officeNumber = officeNumber;
    }

    
    public String getTelephoneNumber(){
        return (getOfficeCodeArea()+getOfficeNumber());
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficeCodeArea() {
        return officeCodeArea;
    }

    public void setOfficeCodeArea(String officeCodeArea) {
        this.officeCodeArea = officeCodeArea;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
    
    
}
