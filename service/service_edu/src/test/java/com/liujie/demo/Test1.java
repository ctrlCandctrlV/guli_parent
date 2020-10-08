package com.liujie.demo;

public class Test1 {
    public static void main(String[] args) {
        System.out.println( monkeyKing(60,3));
    }

    public static int monkeyKing(int n, int m)  //n只猴 ，m个排除。
    {
        int z=0; //z是王
        for (int j = 2; j <= n; j++) z = (z + m) % j;
        return ++z;
            
    }
}
