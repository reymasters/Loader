package au.define;

public class Allegato1 {

	public static int COUNT_ALLEGATO1	= 0;
	public static boolean DO_ALLEGATO1 = false;
	public static final String ALLEGATO1 				= "ALLEGATO1";
	public static final String A1					= "a1.";
	
	public static final String NR_ALLEGATO1			= "NR_ALLEGATO1";
	public static final String NR_CONTRATTO			= "NR_CONTRATTO";
	public static final String COD_TIPOLAVORO			= "COD_TIPOLAVORO";
	public static final String COD_SOL					= "COD_SOL";
	public static final String COD_STABI				= "COD_STABI";	
	public static final String TIPO_CONT				= "TIPO_CONT";
	public static final String TIPO_ADDEBITO			= "TIPO_ADDEBITO";
	public static final String ABI_OLD					= "ABI_OLD";								
	public static final String ABI						= "ABI";
	public static final String CAB						= "CAB";
	public static final String CONTO_COR				= "CONTO_COR";
	public static final String CODESE_SIA				= "CODESE_SIA";								
	public static final String CODSTAB_SIA				= "CODSTAB_SIA";
	public static final String NR_TERMINALI			= "NR_TERMINALI";
	public static final String NR_TESSERE_ESE			= "NR_TESSERE_ESE";
	public static final String DT_RICHIESTA			= "DT_RICHIESTA";
	public static final String DT_PROD_TESSERE			= "DT_PROD_TESSERE";
	public static final String DT_ALLEGATO1			= "DT_ALLEGATO1";
	public static final String DT_ARRIVO				= "DT_ARRIVO";
	public static final String NOTE					= "NOTE";
	public static final String NOTE_ORD				= "NOTE_ORD";
	public static final String FREQ_FATTURA			= "FREQ_FATTURA";
	public static final String DESCR					= "DESCR";
	public static final String DT_INS					= "DT_INS";								
	public static final String DT_ULTMOD				= "DT_ULTMOD";
	public static final String COD_OPERATORE			= "COD_OPERATORE";
	public static final String DT_FINE					= "DT_FINE";
	public static final String COD_BLOCCO				= "COD_BLOCCO";
	public static final String ABI_LIQUIDATORE			= "ABI_LIQUIDATORE";
	public static final String CEB						= "CEB";
	public static final String PSP						= "PSP";
	public static final String CAUSALE_CM				= "CAUSALE_CM";
	public static final String DATA_ALL_CM				= "DATA_ALL_CM";
	public static final String CAUSALE_BANCA			= "CAUSALE_BANCA";
	public static final String DATA_ALL_BANCA			= "DATA_ALL_BANCA";
	public static final String TIPO_CANONE				= "TIPO_CANONE";
	public static final String NR_PRECONTRATTO			= "NR_PRECONTRATTO";
	public static final String COD_FISCALE_RAPLEGALE	= "COD_FISCALE_RAPLEGALE";
	public static final String ID_VP_ASSOCIATA			= "ID_VP_ASSOCIATA";
	public static final String IBAN_COD_PAESE			= "IBAN_COD_PAESE";
	public static final String IBAN_CIN_IBAN			= "IBAN_CIN_IBAN";
	public static final String IBAN_CIN_IT				= "IBAN_CIN_IT";
	public static final String VERSION					= "VERSION";
	public static final String PROGR_SIA				= "PROGR_SIA";
	public static final String ABI_COLLOCATORE			= "ABI_COLLOCATORE";
	
	public String[] getCampi() {
		return new String[] {							
				NR_ALLEGATO1,			
				NR_CONTRATTO,			
				COD_TIPOLAVORO,		
				COD_SOL,				
				COD_STABI,			
				TIPO_CONT,			
				TIPO_ADDEBITO,		
				ABI_OLD,			
				ABI,					
				CAB,					
				CONTO_COR,			
				CODESE_SIA,			
				CODSTAB_SIA,			
				NR_TERMINALI,			
				NR_TESSERE_ESE,		
				DT_RICHIESTA,			
				DT_PROD_TESSERE,		
				DT_ALLEGATO1,			
				DT_ARRIVO,			
				NOTE,					
				NOTE_ORD,				
				FREQ_FATTURA,			
				DESCR,				
				DT_INS,				
				DT_ULTMOD,			
				COD_OPERATORE,		
				DT_FINE,				
				COD_BLOCCO,			
				ABI_LIQUIDATORE,		
				CEB,				
				PSP,					
				CAUSALE_CM,			
				DATA_ALL_CM,			
				CAUSALE_BANCA,		
				DATA_ALL_BANCA,		
				TIPO_CANONE,			
				NR_PRECONTRATTO,		
				COD_FISCALE_RAPLEGALE,
				ID_VP_ASSOCIATA,		
				IBAN_COD_PAESE,		
				IBAN_CIN_IBAN,		
				IBAN_CIN_IT,			
				VERSION,				
				PROGR_SIA,			
				ABI_COLLOCATORE		
					

		};
	}
	
	public static String getAs(String s) {
		return s.equals(CODESE_SIA) ? " as codese_sia" :
				s.equals(CODSTAB_SIA) ? " as codstab_sia" : "";
	}

	public static String tabelleEx() {
		COUNT_ALLEGATO1++;
		return ALLEGATO1 + " " + A1.replace(".", "") + ",\n";
	}
}
