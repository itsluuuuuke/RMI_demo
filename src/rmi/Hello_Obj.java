/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Jiayun
 */
public class Hello_Obj extends UnicastRemoteObject implements Hello_RMI{
    public Hello_Obj() throws RemoteException{}
    @Override
    public void hello() {
        System.out.println("Hello!");
    }
    
}
