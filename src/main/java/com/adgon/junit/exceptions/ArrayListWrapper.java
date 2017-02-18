package com.adgon.junit.exceptions;

import java.util.ArrayList;

class ArrayListWrapper {

    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private final static ArrayList<Object> list = new ArrayList<>();

    @SuppressWarnings("SameParameterValue")
    Object get(int index) {
        return list.get(index);
    }

}
