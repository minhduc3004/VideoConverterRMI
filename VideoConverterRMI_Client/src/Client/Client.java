/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Interface.FileInterface;
import Interface.ConvertInterface;
import View.MainView;
import View.View;
import java.io.*;
import java.util.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.net.*;

/**
 *
 * @author Vu Minh Duc
 */
public class Client implements Runnable {

//    MainView view;
    MainView view;
    Socket client;
    public ConvertInterface convertStub;
    public FileInterface fileStub;

//    private Socket clientSocket;
    public Client() throws RemoteException, NotBoundException, IOException {
        fileStub = (FileInterface) Naming.lookup("rmi://192.168.43.41/file");
        convertStub = (ConvertInterface) Naming.lookup("rmi://192.168.43.41/convert");
//        view = new MainView();
        view = new MainView();
        view.setClient(this);
    }

    @Override
    public void run() {
        view.setVisible(true);
    }

//    public MainView getView() {
//        return view;
//    }


    public Socket getClient() {
        return client;
    }

    public ConvertInterface getConvertStub() {
        return convertStub;
    }

    public FileInterface getFileStub() {
        return fileStub;
    }
    
//    public void sendFile()

}
