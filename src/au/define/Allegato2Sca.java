package au.define;

public class Allegato2Sca {
	
	public static int COUNT_ALLEGATO2_SCA	= 0;
	public static boolean DO_ALLEGATO2SCA = false;
	public static final String ALLEGATO2SCA 				= "ALLEGATO2_SCA";
	public static final String ALLE2SCA					= "s2.";
	
	public static String COD_OPERATORE			= "COD_OPERATORE";
	public static String COD_VOCE				= "COD_VOCE";
	public static String DT_INS					= "DT_INS";
	public static String DT_ULTMOD				= "DT_ULTMOD";
	public static String HIDDEN_KEY				= "HIDDEN_KEY";
	public static String NR_ALLEGATO2			= "NR_ALLEGATO2";
	public static String PERCENTUALE			= "PERCENTUALE";
	public static String VALORE					= "VALORE";
	public static String VALORE_SCAGLIONE		= "VALORE_SCAGLIONE";
	public static String VALORE_SCAGLIONE2		= "VALORE_SCAGLIONE2";
	public static String VERSION				= "VERSION";
	
	public String[] getCampi() {
		return new String[] {							
			COD_OPERATORE,
			COD_VOCE,
			DT_INS,
			DT_ULTMOD,
			HIDDEN_KEY,
			NR_ALLEGATO2,
			PERCENTUALE,
			VALORE,
			VALORE_SCAGLIONE,
			VALORE_SCAGLIONE2,
			VERSION

		};
	}
	
	public static String getAs(String s) {
		return 
			s.equals(COD_OPERATORE) 	? " as operatore_sca" : 
			s.equals(COD_VOCE) 			? " as cod_voce" : 
			s.equals(PERCENTUALE) 		? " as valore_percentuale_scaglione" : 
			s.equals(VALORE) 			? " as valore_fisso" :
			s.equals(VALORE_SCAGLIONE) 	? " as valore_fisso_scaglione" :
			s.equals(VALORE_SCAGLIONE2) ? " as valore_fisso_scaglione2" :
			s.equals(DT_INS) 			? " as dt_ins" :
			"";		
	}
	
	public static String tabelleEx() {
		COUNT_ALLEGATO2_SCA++;
		return ALLEGATO2SCA + " " + ALLE2SCA.replace(".", "") + ",\n";
	}
	
	public static String ex(String s) {		
		return 
		s.equals(COD_OPERATORE) 	? ALLE2SCA+COD_OPERATORE+getAs(COD_OPERATORE) : 
		s.equals(PERCENTUALE) 		? ALLE2SCA+PERCENTUALE+getAs(PERCENTUALE) : 
		s.equals(VALORE_SCAGLIONE2) ? ALLE2SCA+VALORE_SCAGLIONE2+getAs(VALORE_SCAGLIONE2) : 
		s.equals(VALORE_SCAGLIONE) 	? ALLE2SCA+VALORE_SCAGLIONE+getAs(VALORE_SCAGLIONE) : 
		"";
	}
}
