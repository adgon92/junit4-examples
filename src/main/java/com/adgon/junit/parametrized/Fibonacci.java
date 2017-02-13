package com.adgon.junit.parametrized;

class Fibonacci {

    static int compute(int n) {
        int result;

        if (n <= 1) {
            result = n;
        } else {
            result = compute(n - 1) + compute(n - 2);
        }

        return result;
    }

}
