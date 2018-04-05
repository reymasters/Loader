package au.define;

public class AnCliente {

	public static int COUNT_AN_CLIENTE = 0;
	public static boolean DO_ANCLIENTE = false;
	public static final String AN_CLIENTE 			= "AN_CLIENTE";
	public static final String CL					= "cl.";
	
	public static final String COD_CLIENTE			= "COD_CLIENTE";
	public static final String COD_LOCALITA		= "COD_LOCALITA";
	public static final String COD_CAP				= "COD_CAP";
	public static final String COD_PROVINCIA		= "COD_PROVINCIA";	
	
	public static final String RAG_SOC				= "RAG_SOC";
	public static final String INDIRIZZO			= "INDIRIZZO";
	public static final String COD_NAZIONE			= "COD_NAZIONE";
	public static final String F_SOGGETTO			= "F_SOGGETTO";	
	public static final String PARTITA_IVA			= "PARTITA_IVA";
	public static final String CODICE_FISCALE		= "CODICE_FISCALE";
	public static final String PREFISSO			= "PREFISSO";
	public static final String NR_TELEFONO			= "NR_TELEFONO";
	public static final String NR_FAX				= "NR_FAX";
	public static final String E_MAIL				= "E_MAIL";
	public static final String F_MODIFICATO		= "F_MODIFICATO";
	public static final String CODC_COGE			= "CODC_COGE";
	public static final String DT_INS				= "DT_INS";
	public static final String DT_ULTMOD			= "DT_ULTMOD";
	public static final String COD_OPERATORE		= "COD_OPERATORE";
	public static final String COD_CAB				= "COD_CAB";
	public static final String ATM_ABI_CLIENTE		= "ATM_ABI_CLIENTE";						
	public static final String VERSION				= "VERSION";
	public static final String SAE					= "SAE";
	public static final String RAE					= "RAE";
	public static final String E_MAIL_PEC			= "E_MAIL_PEC";
	public static final String E_PRESSO			= "E_PRESSO";
	public static final String E_CELLULARE			= "E_CELLULARE";
	public static final String ATM_KMAPS_ENABLE	= "ATM_KMAPS_ENABLE";
		
	public String[] getCampi() {
		return new String[] {COD_CLIENTE,COD_LOCALITA,COD_CAP,COD_PROVINCIA,
				RAG_SOC,INDIRIZZO,COD_NAZIONE,F_SOGGETTO,PARTITA_IVA,
				CODICE_FISCALE,PREFISSO,NR_TELEFONO,NR_FAX,E_MAIL,F_MODIFICATO,
				CODC_COGE,DT_INS,DT_ULTMOD,COD_OPERATORE,COD_CAB,ATM_ABI_CLIENTE,
				VERSION,SAE,RAE,E_MAIL_PEC,E_PRESSO,E_CELLULARE,ATM_KMAPS_ENABLE};
	}
	//select
	// * from information_schema.columns where table_name like
	
	public static String getAs(String s) {
		return s.equals(PARTITA_IVA) ? " as piva" : 
			s.equals(RAG_SOC) ? " as rag_soc" : "";
	}
	
	public static String ex(String s) {		
		return 
		s.equals(PARTITA_IVA) ? CL+PARTITA_IVA+getAs(PARTITA_IVA) : 
		s.equals(CODICE_FISCALE) ? CL+CODICE_FISCALE+getAs(CODICE_FISCALE) : "";
	}

	public static String tabelleEx() {
		COUNT_AN_CLIENTE++;
		return AnCliente.AN_CLIENTE + " " + AnCliente.CL.replace(".", "") + ",\n";
	}
}
