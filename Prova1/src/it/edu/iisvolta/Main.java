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
			FileWriter fw=new FileWriter("prodotti.csv");	//crea un file di nome prodotti.txt
			fw.write("Pane;3.50;20\n");
			fw.write("Pasta;1.60;45\n");
			fw.write("Biscotti;4.70;80\n");
			fw.write("Salame;35;37\n");
			fw.close();
			System.out.println("File correttamente creato");
		} catch (IOException e) {
			System.out.println("Si è verificato un errore in fase di creazione file!");
			e.printStackTrace();
		}
	
//////////////////LETTURA DA UN FILE//////////////////////////////
 
	
		File f=new File("prodotti.csv");
		
		String[]dati;
		try {
			String riga;
			Scanner sc=new Scanner(f);
			while(sc.hasNextLine()) {/////vero quando c'è, falso quando finisce. vuol dire ripeti finkè non ci sono altre linee da leggere
				riga=sc.nextLine(); /////legge una linea alla volta
				dati=riga.split(";"); /////divide la ringa in pezzettini con il separatore indicato
				//System.out.println("Trovato prodotto:\n"+riga);
				System.out.println("Nome:"+dati[0]);
				System.out.println("Prezzo:"+dati[1]);
				System.out.println("Quantità:"+dati[2]);
		System.out.println("\n");
			}
			sc.close(); ////chiude il file
			System.out.println("\n\nLettura terminata!!!");
		} catch (FileNotFoundException e) 
		{System.out.println("Si è verificato un errore in fase di lettura!"); ///il file legge una riga alla volta
			e.printStackTrace();
		}
		
	}
}