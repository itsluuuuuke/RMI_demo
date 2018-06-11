/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Jiayun
 */
public class Server {
    public static void main(String[] args){
        while(true){
            try{
            Hello_Obj obj = new Hello_Obj();
            Registry r = LocateRegistry.createRegistry(3088);
            r.bind("//localhost/hello", obj);
        }catch(Exception e){}
        }
        
    } 
}
