/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinCodeSmell;

/**
 *
 * @author Angel Moya
 */
public class TelefoneNumberOffice {
    private String officeCodeArea;
    private String officeNumber;

    
    public TelefoneNumberOffice(String officeCodeArea, String officeNumber) {
        this.officeCodeArea = officeCodeArea;
        this.officeNumber = officeNumber;
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
