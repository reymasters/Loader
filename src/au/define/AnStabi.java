package au.define;

public class AnStabi {

	public static int COUNT_AN_STABI = 0;
	public static boolean DO_ANSTABI = false;
	public static final String AN_STABI 				= "AN_STABI";
	public static final String STABI					= "stabi.";
	
	public static final String COD_CLIENTE				= "COD_CLIENTE";
	public static final String COD_STABI				= "COD_STABI";
	public static final String COD_PROVINCIA			= "COD_PROVINCIA";
	public static final String PV_CAMERA_COMMERCIO		= "PV_CAMERA_COMMERCIO";
	public static final String ATM_COD_ASSFOR			= "ATM_COD_ASSFOR";
	public static final String INSEGNA					= "INSEGNA";								
	public static final String INDIRIZZO				= "INDIRIZZO";							
	public static final String COD_CAP					= "COD_CAP";
	public static final String COD_LOCALITA			= "COD_LOCALITA";	
	public static final String F_SOGGETTO				= "F_SOGGETTO";							
	public static final String PARTITA_IVA				= "PARTITA_IVA";
	public static final String CODICE_FISCALE			= "CODICE_FISCALE";
	public static final String PREFISSO				= "PREFISSO";							
	public static final String NR_TELEFONO				= "NR_TELEFONO";							
	public static final String NR_FAX					= "NR_FAX";									
	public static final String INSEGNA_SCO				= "INSEGNA_SCO";									
	public static final String F_LU_M					= "F_LU_M";
	public static final String F_LU_P					= "F_LU_P";
	public static final String F_MA_M					= "F_MA_M";
	public static final String F_MA_P					= "F_MA_P";
	public static final String F_ME_M					= "F_ME_M";
	public static final String F_ME_P					= "F_ME_P";
	public static final String F_GI_M					= "F_GI_M";
	public static final String F_GI_P					= "F_GI_P";
	public static final String F_VE_M					= "F_VE_M";
	public static final String F_VE_P					= "F_VE_P";
	public static final String F_SA_M					= "F_SA_M";
	public static final String F_SA_P					= "F_SA_P";
	public static final String F_DO_M					= "F_DO_M";
	public static final String F_DO_P					= "F_DO_P";
	public static final String F_TURNO					= "F_TURNO";												
	public static final String PAUSA_DAL				= "PAUSA_DAL";							
	public static final String PAUSA_AL				= "PAUSA_AL";							
	public static final String APERTURA_DAL			= "APERTURA_DAL";							
	public static final String APERTURA_AL				= "APERTURA_AL";								
	public static final String F_GENNAIO				= "F_GENNAIO";
	public static final String F_FEBBRAIO				= "F_FEBBRAIO";
	public static final String F_MARZO					= "F_MARZO";
	public static final String F_APRILE				= "F_APRILE";
	public static final String F_MAGGIO				= "F_MAGGIO";
	public static final String F_GIUGNO				= "F_GIUGNO";
	public static final String F_LUGLIO				= "F_LUGLIO";
	public static final String F_AGOSTO				= "F_AGOSTO";
	public static final String F_SETTEMBRE			= "F_SETTEMBRE";
	public static final String F_OTTOBRE			= "F_OTTOBRE";
	public static final String F_NOVEMBRE			= "F_NOVEMBRE";
	public static final String F_DICEMBRE			= "F_DICEMBRE";
	public static final String F_HOTLIST			= "F_HOTLIST";
	public static final String COD_IVA				= "COD_IVA";
	public static final String COD_STABCTI			= "COD_STABCTI";											
	public static final String COD_CTI				= "COD_CTI";												
	public static final String COD_CAT				= "COD_CAT";										
	public static final String COD_NAZIONE			= "COD_NAZIONE";								
	public static final String E_MAIL				= "E_MAIL";									
	public static final String F_SPED_FAT			= "F_SPED_FAT";									
	public static final String F_MODIFICATO			= "F_MODIFICATO";									
	public static final String CODC_COGE			= "CODC_COGE";								
	public static final String COD_CAB				= "COD_CAB";									
	public static final String DT_INS				= "DT_INS";
	public static final String DT_ULTMOD			= "DT_ULTMOD";
	public static final String COD_OPERATORE		= "COD_OPERATORE";
	public static final String LOCALITA_SCO			= "LOCALITA_SCO";
	public static final String DT_RICH_CENS			= "DT_RICH_CENS";								
	public static final String NR_CAMERA_COMMERCIO	= "NR_CAMERA_COMMERCIO";															
	public static final String COD_COMM_INT			= "COD_COMM_INT";								
	public static final String NOTE					= "NOTE";
	public static final String COD_FILIALE			= "COD_FILIALE";																					
	public static final String ATM_TIPO_UBI			= "ATM_TIPO_UBI";								
	public static final String ATM_TIPO_PRIMA_NOTIFICA	= "ATM_TIPO_PRIMA_NOTIFICA";																												
	public static final String ATM_COD_CONT_ESTER_FORN	= "ATM_COD_CONT_ESTER_FORN";																				
	public static final String VERSION				= "VERSION";
	public static final String COD_CIG				= "COD_CIG";								
	public static final String COD_CUP				= "COD_CUP";								
	public static final String COD_ATECO			= "COD_ATECO";
	public static final String S_CELLULARE			= "S_CELLULARE";
	public static final String S_MAIL_PEC			= "S_MAIL_PEC";
	public static final String S_PRESSO				= "S_PRESSO";
	public static final String ATM_ID_UBICAZIONE	= "ATM_ID_UBICAZIONE";								
	public static final String ATM_CENSITO_K_MAPS	= "ATM_CENSITO_K_MAPS";								
	public static final String TIPO_CLIENTE			= "TIPO_CLIENTE";							
	public static final String PA_COD_UFFICIO		= "PA_COD_UFFICIO";									
	public static final String PA_CAT_ISTAT			= "PA_CAT_ISTAT";
	public static final String DUP_NEW				= "DUP_NEW";
	
	public String[] getCampi() {
		return new String[] {							
				COD_CLIENTE,			
				COD_STABI,				
				COD_PROVINCIA,			
				PV_CAMERA_COMMERCIO,		
				ATM_COD_ASSFOR,			
				INSEGNA,					
				INDIRIZZO,				
				COD_CAP,					
				COD_LOCALITA,
				COD_PROVINCIA,			
				F_SOGGETTO,				
				PARTITA_IVA,				
				CODICE_FISCALE,			
				PREFISSO,
				NR_TELEFONO,				
				NR_FAX,					
				INSEGNA_SCO,				
				F_LU_M,					
				F_LU_P,				
				F_MA_M,					
				F_MA_P,					
				F_ME_M,					
				F_ME_P,					
				F_GI_M,					
				F_GI_P,					
				F_VE_M,					
				F_VE_P,					
				F_SA_M,					
				F_SA_P,					
				F_DO_M,					
				F_DO_P,					
				F_TURNO,					
				PAUSA_DAL,				
				PAUSA_AL,					
				APERTURA_DAL,				
				APERTURA_AL,				
				F_GENNAIO,				
				F_FEBBRAIO,				
				F_MARZO,					
				F_APRILE,					
				F_MAGGIO,					
				F_GIUGNO,					
				F_LUGLIO,					
				F_AGOSTO,					
				F_SETTEMBRE,
				F_OTTOBRE,
				F_NOVEMBRE,
				F_DICEMBRE,
				F_HOTLIST,	
				COD_IVA,
				COD_STABCTI,				
				COD_CTI,					
				COD_CAT,					
				COD_NAZIONE,				
				E_MAIL,					
				F_SPED_FAT,				
				F_MODIFICATO,				
				CODC_COGE,				
				COD_CAB,					
				DT_INS,
				DT_ULTMOD,
				COD_OPERATORE,
				LOCALITA_SCO,
				DT_RICH_CENS,				
				NR_CAMERA_COMMERCIO,		
				PV_CAMERA_COMMERCIO,		
				COD_COMM_INT,				
				NOTE,
				COD_FILIALE,				
				ATM_TIPO_UBI,				
				ATM_TIPO_PRIMA_NOTIFICA,	
				ATM_COD_ASSFOR,			
				ATM_COD_CONT_ESTER_FORN,	
				VERSION,
				COD_CIG,					
				COD_CUP,					
				COD_ATECO,
				S_CELLULARE,
				S_MAIL_PEC,
				S_PRESSO,
				ATM_ID_UBICAZIONE,		
				ATM_CENSITO_K_MAPS,		
				TIPO_CLIENTE,				
				PA_COD_UFFICIO,			
				PA_CAT_ISTAT,
				DUP_NEW					

		};
	}
	
	public static String getAs(String s) {
		return 
		s.equals(AnStabi.INSEGNA) ? " as insegna" : 
		s.equals(AnStabi.COD_STABI) ? " as cod_stabi" : 
		s.equals(AnStabi.COD_LOCALITA) ? " as localita" :
		s.equals(AnStabi.COD_PROVINCIA) ? " as provincia" :
		s.equals(AnStabi.COD_CAP) ? " as cap" : "";
		
	}

	public static String tabelleEx() {
		AnStabi.COUNT_AN_STABI++;
		return AnStabi.AN_STABI + " " + AnStabi.STABI.replace(".", "") + ",\n";
	}
}
