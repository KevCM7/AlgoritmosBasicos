package com.AlgoritmosBasicos.main;

import java.util.Scanner;

public class AppMostrarmiNombre 
{

	public static void main(String[] args) 
	{
		int cont2 = 0;
		String sNombre = " ";
		System.out.println("Escribe tu nombre: ");
		Scanner sc = new Scanner(System.in);
		sNombre = sc.nextLine();
		//for(int cont = 0; cont < 100; cont++)
		//while(cont2<100)
		do
		{	
			System.out.println("Hola " +sNombre);
			cont2++;
		}while(cont2 < 100);
		
	}

}
