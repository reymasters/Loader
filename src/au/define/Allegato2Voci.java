package au.define;

public class Allegato2Voci {
	
	public static int COUNT_ALLEGATO2_VOCI	= 0;
	public static boolean DO_ALLEGATO2VOCI = false;
	public static final String ALLEGATO2VOCI				= "ALLEGATO2_VOCI";
	public static final String ALLE2VOCI					= "v2.";
	
	public static String COD_OPERATORE		= "COD_OPERATORE";
	public static String COD_VOCE			= "COD_VOCE";
	public static String DT_GRATUITA		= "DT_GRATUITA";
	public static String DT_INS				= "DT_INS";
	public static String DT_ULTMOD			= "DT_ULTMOD";
	public static String MM_GRATUITA		= "MM_GRATUITA";
	public static String NR_ALLEGATO2		= "NR_ALLEGATO2";
	public static String PERCENTUALE		= "PERCENTUALE";
	public static String VALORE				= "VALORE";
	public static String VERSION			= "VERSION";
	
	public String[] getCampi() {
		return new String[] {							
			COD_OPERATORE,
			COD_VOCE,
			DT_GRATUITA,
			DT_INS,
			DT_ULTMOD,
			MM_GRATUITA,
			NR_ALLEGATO2,
			PERCENTUALE,
			VALORE,
			VERSION

		};
	}
	
	public static String getAs(String s) {
		return s.equals(COD_OPERATORE) 	? " as operatore_voci" : 
			s.equals(COD_VOCE) 			? " as cod_voce" : 
			s.equals(PERCENTUALE) 		? " as valore_percentuale" : 
			s.equals(VALORE) 			? " as valore_fisso" :				
			"";
	}
	
	public static String tabelleEx() {
		COUNT_ALLEGATO2_VOCI++;
		return ALLEGATO2VOCI + " " + ALLE2VOCI.replace(".", "") + ",\n";
	}
	
	public static String ex(String s) {		
		return 
		s.equals(COD_OPERATORE) ? ALLE2VOCI+COD_OPERATORE+getAs(COD_OPERATORE) : 
		s.equals(PERCENTUALE) 	? ALLE2VOCI+PERCENTUALE+getAs(PERCENTUALE) : "";
	}
}
