/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;
import java.rmi.*;
/**
 *
 * @author Jiayun
 */
public class Client {
    public static void main(String args[]){
        try{
            Hello_RMI obj = (Hello_Obj)Naming.lookup("//localhost/hello");
            obj.hello();
        }catch(Exception e){}
    }
}
