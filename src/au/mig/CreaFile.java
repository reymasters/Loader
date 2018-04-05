package au.mig;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class CreaFile {
		
	public static void scriptSql(String sql, String nomefile) {
		System.out.println("init create file sql");
		try {			
			scrivi(sql,"c:\\AREA POS\\" + nomefile + ".sql");			
			System.out.println("scrittura file terminata "+nomefile+".sql");
		}catch(IOException e) {System.out.println(e.getMessage());}
	}
	
	public void scriptTabella(List<Migrazione> listaCampi, String nomeTabella) {
		StringBuilder sb = new StringBuilder();
		System.out.println("init create tabella");
		sb.append("CREATE TABLE "+nomeTabella.toUpperCase() + "(\n");
			int numeroCampi = listaCampi.size();
			int index = 0;
			for(Migrazione mig : listaCampi) {
				index++;
				sb.append(mig.getCampo().toUpperCase()+" "); 
				sb.append("VARCHAR2("+mig.getLung()+" BYTE) ");
				if(index<numeroCampi)
					sb.append("NULL,\n");
				else
					sb.append("NULL \n");
			}
		
		sb.append(") ;");
		
		try {			
			scrivi(sb.toString(),"c:\\AREA POS\\carica_"+nomeTabella+".txt");			
			System.out.println("scrittura file terminata carica_"+nomeTabella+".txt");
		}catch(IOException e) {System.out.println(e.getMessage());}
		
	}
	
	
	public void scriptCtl(List<Migrazione> listaCampi, String nomeTabella, boolean csv) {
		System.out.println("init create file ctl");
		StringBuilder sb = new StringBuilder();
		sb.append("LOAD DATA \n");
		sb.append("INFILE \n");
		sb.append("replace \n");
		sb.append("INTO TABLE "+nomeTabella.toUpperCase()+"\n");
		if(csv)
			sb.append("FIELDS TERMINATED BY ';' \n");
		sb.append("TRAILING NULLCOLS \n (");		
		
		int numeroCampi = listaCampi.size();
		int index = 0;
		for(Migrazione migr : listaCampi) {			
			if(csv) {
				sb.append(migr.getCampo().toUpperCase());				
			}else{
				int campoPrecedente = migr.getLung();			
				if(index==0)
					sb.append(migr.getCampo().toUpperCase()+" position(1:"+migr.getLung()+")"); 
				else
					sb.append(migr.getCampo().toUpperCase()+" position("+(campoPrecedente+1)+":"+(campoPrecedente+migr.getLung())+")"); 				
				
			}

			if(index<numeroCampi)
				sb.append(",\n");
			else
				sb.append("\n");

			index++;
		}
		
		sb.append(") ;");
		
		try {			
			scrivi(sb.toString(),"c:\\AREA POS\\tab_"+nomeTabella+".ctl");			
			System.out.println("scrittura file terminata tab_"+nomeTabella+".ctl");
		}catch(IOException e) {System.out.println(e.getMessage());}
		
	}
	
	public static void scrivi(String sql, String nomefile) throws IOException {
		File f = new File(nomefile);
		if (f.exists()) {
		    f.delete();
		} 
		FileWriter w = new FileWriter(nomefile);
		BufferedWriter b =new BufferedWriter (w);
		b.write(sql);			
		b.flush();
		w.close();
	}
}
