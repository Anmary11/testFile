package it.edu.iisvolta;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
////*****************************scrittura sul file***************************
		try {
			FileWriter fw=new FileWriter("prodotti.txt");	//crea un file di nome prodotti.txt
			fw.write("Pane\n");
			fw.write("Pasta\n");
			fw.write("Biscotti\n");
			fw.write("Salame\n");
			fw.close();
			System.out.println("File correttamente creato");
		} catch (IOException e) {
			System.out.println("Si è verificato un errore in fase di creazione file!");
			e.printStackTrace();
		}
	
//////////////////LETTURA DA UN FILE//////////////////////////////
 
	
		File f=new File("prodotti.txt");
		
		
		try {
			String riga;
			Scanner sc=new Scanner(f);
			while(sc.hasNextLine()) {/////vero quando c'è, falso quando finisce. vuol dire ripeti finkè non ci sono altre linee da leggere
				riga=sc.nextLine(); /////legge una linea alla volta
				System.out.println("Trovato prodotto:\n"+riga);
				
			}
			sc.close(); ////chiude il file
			System.out.println("\n\nLettura terminata!!!");
		} catch (FileNotFoundException e) 
		{System.out.println("Si è verificato un errore in fase di lettura!"); ///il file legge una riga alla volta
			e.printStackTrace();
		}
		
	}
}