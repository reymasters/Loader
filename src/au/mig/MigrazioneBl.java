package au.mig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class MigrazioneBl {
	
	List<Migrazione> listaCampi = new ArrayList<Migrazione>();
	
	public BufferedReader getBuffer() throws Exception {
		return new BufferedReader(new InputStreamReader(System.in));
	}
	
	public String inserisciNome() throws Exception {
		String stringa = "";
		try {					
			stringa = getBuffer().readLine();		
		}catch (IOException e){
			System.out.println("Error");
			stringa = "";
		}catch (Exception e){
			System.out.println("Error");
			stringa = "";
		}
		return stringa;
	}
	
	public String inserisciCampo(String stringa) throws Exception {		
		try {								
			System.out.println("campo inserito "+stringa);
			System.out.println("inserire lunghezza");
			int lung = getBuffer().read();
			System.out.println("Obbligatorio? y or n");
			String obb = getBuffer().readLine();
			listaCampi.add(
			new Migrazione(stringa,lung,obb.equals("y") ? true : false)
			);		
		}catch (IOException e){
			System.out.println("Error");
			stringa = "";
		}catch (Exception e){
			System.out.println("Error");
			stringa = "";
		}
		return stringa;
	}
	
	public void modificaNome(List<Migrazione> listaCampi) throws Exception {
		
		if(listaCampi.size()>0) {
			int index = 0;
			for(Migrazione mig : listaCampi) {				
				System.out.println(index + " - "+ mig.getCampo());
				index++;
			}
			
			System.out.println("numero campo:");				
			int idCampo = getBuffer().read();
			System.out.println("rinomina campo:");
			String newCampo = getBuffer().readLine();
			int index2 = 0;
			for(Migrazione mig : listaCampi) {
				if(index2==idCampo)
					mig.setCampo(newCampo);
			}
		}else{
			System.out.println("lista vuota");
		}
		
		
	}
	
	public void modificaLunghezza(List<Migrazione> listaCampi) throws Exception {
		
		if(listaCampi.size()>0) {
			int index = 0;
			for(Migrazione mig : listaCampi) {				
				System.out.println(index + " - "+ mig.getCampo() + " size-> "+mig.getLung() );
				index++;
			}
			
			System.out.println("numero campo:");				
			int idCampo = getBuffer().read();
			System.out.println("ridefinisci lunghezza:");
			int newCampo = getBuffer().read();
			int index2 = 0;
			for(Migrazione mig : listaCampi) {
				if(index2==idCampo)
					mig.setLung(newCampo);
			}
		}else{
			System.out.println("lista vuota");
		}
		
		
	}
	
	public void scriviFile(List<Migrazione> listaCampi,String nomeTabella) throws Exception {
		System.out.println("Csv? y or n");				
		String csv = getBuffer().readLine();
		CreaFile cf = new CreaFile();
		cf.scriptTabella(listaCampi,nomeTabella);
		cf.scriptCtl(listaCampi,nomeTabella,(csv.equals("y") ? true : false));
	}
	
	public void scelta(int scelta,List<Migrazione> listaCampi,String nomeTabella,String stringa) throws Exception {
		switch(scelta) {
		case 1:	modificaNome(listaCampi);
				break;
		case 2:	modificaLunghezza(listaCampi);
				break;
		case 3:
		case 4:	inserisciCampo(stringa);
				break;
		case 5:	scriviFile(listaCampi,nomeTabella);
				break;
		case 6:System.exit(0);
		
		}
	}
}
