package com.lms.design.proxy.ragent;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringCompareHelper extends UnicastRemoteObject implements CompareHelper<String>{
    protected StringCompareHelper() throws RemoteException {
    }
    @Override
    public boolean compare(String object1, String object2) throws RemoteException {
        return object1.compareTo(object2) > 0;
    }
    @Override
    public String append(String object1, String object2) throws RemoteException {
        return object1 + object2;
    }

}
