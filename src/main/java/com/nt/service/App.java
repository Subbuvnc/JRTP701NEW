package com.nt.service;

/**
 * Hello world!
 *
 */
public class App 
{
	public int sum(int a,int b) {
		return a+b;
	}
    public static void main( String[] args )
    {
    	App a1 = new App();
        System.out.println( "Hello World!" );
        System.out.println(a1.sum(20, 30));
    }
}
