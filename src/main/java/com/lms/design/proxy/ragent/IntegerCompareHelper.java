package com.lms.design.proxy.ragent;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IntegerCompareHelper extends UnicastRemoteObject implements CompareHelper<Integer> {
    protected IntegerCompareHelper() throws RemoteException {
    }

    @Override
    public boolean compare(Integer object1, Integer object2) throws RemoteException {
        return object1 - object2 > 0;
    }

    @Override
    public Integer append(Integer object1, Integer object2) throws RemoteException {
        return Integer.valueOf(object1.toString() + object2.toString());
    }

}
