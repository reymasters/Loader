package au.mig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import au.gui.MainGui;


public class MainMigrazione {
	
	public static void main(String args[]) {	
		if(args==null || args.length==0)			
			args = new String[1];		
		
		args[0] = "sql";
		
		if(args[0].equals("sql")) {
			new MainGui();
		}
			
		String nomeTabella = "";
		String stringa = "s";		
		int scelta = 0;
		
		List<Migrazione> listaCampi = new ArrayList<Migrazione>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MigrazioneBl bl = new MigrazioneBl();
		try {
			System.out.println("nome tabella:");				
			nomeTabella = br.readLine();
		}catch (IOException e){
			System.out.println("Error");
		}
		
		while(!stringa.equals("finito")) {	
			
			try {				
				System.out.println("inserire campo");
				stringa = bl.inserisciNome();		
				if(stringa.equals("help")) {
					System.out.println("scrivere finito per terminare la lista dei campi");
				}else if(stringa.equals("menu")) {
					System.out.println("*******************");
					System.out.println("1. Modifica nome campo");					
					System.out.println("2. Modifica lunghezza campo");
					System.out.println("3. cambia stato del campo");
					System.out.println("4. inserisci altri campi");
					System.out.println("5. procedi alla scrittura dei files");
					System.out.println("6. Esci");
					System.out.println("*******************");
					scelta = br.read();
					bl.scelta(scelta,listaCampi,nomeTabella,stringa);
				}else if(!stringa.equals("finito") & !stringa.equals("menu")) {				
					bl.inserisciCampo(stringa);
				}else if(stringa.equals("exit")) {
					System.out.println("processo terminato");
					System.exit(0);
				}
			}
			catch (IOException e){
				System.out.println("Error");
			}catch (Exception e){
				System.out.println("Error");
			}
		}
		
		try {
			bl.scriviFile(listaCampi, nomeTabella);			
			System.out.println("processo terminato");
			System.exit(0);
		}
		catch (IOException e){
			System.out.println("IOException "+e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception "+e.getMessage());
			e.printStackTrace();
		}
	}
	
}
