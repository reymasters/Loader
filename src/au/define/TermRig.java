package au.define;

public class TermRig {
	
	public static int COUNT_TERM_RIG = 0;
	public static boolean DO_TERMRIG = false;
	public static final String TERM_RIG 			= "TERM_RIG";
	public static final String TR					= "tr.";
	
	public static final String TERMINALID			= "TERMINALID";		
	public static final String NR_ALLEGATO1			= "NR_ALLEGATO1";
	public static final String NR_ALLUNGA			= "NR_ALLUNGA";
	public static final String DT_RICHIESTA			= "DT_RICHIESTA";
	public static final String F_STATORIC			= "F_STATORIC";
	public static final String F_STATO				= "F_STATO";
	public static final String F_MODALITA			= "F_MODALITA";
	public static final String COD_BLOCCO			= "COD_BLOCCO";
	public static final String H_DLL				= "H_DLL";
	public static final String H_LOG				= "H_LOG";
	public static final String FLOOR1				= "FLOOR1";
	public static final String FLOOR2				= "FLOOR2";
	public static final String DT_FLOORINIZIO		= "DT_FLOORINIZIO";
	public static final String DT_FLOORFINE			= "DT_FLOORFINE";
	public static final String F_MANCE				= "F_MANCE";
	public static final String NR_ORDINE			= "NR_ORDINE";
	public static final String NR_RIGA				= "NR_RIGA";
	public static final String DT_VAL_CRC			= "DT_VAL_CRC";
	public static final String DT_ATT_CRC			= "DT_ATT_CRC";
	public static final String DT_FINE_CRC			= "DT_FINE_CRC";
	public static final String DT_COM_ATT_CRC		= "DT_COM_ATT_CRC";
	public static final String DT_COM_RID_CRC		= "DT_COM_RID_CRC";
	public static final String DT_INS				= "DT_INS";
	public static final String DT_ULTMOD			= "DT_ULTMOD";
	public static final String COD_OPERATORE		= "COD_OPERATORE";
	public static final String PROG_COMBINAZIONE	= "PROG_COMBINAZIONE";
	public static final String COD_PROPONENTE		= "COD_PROPONENTE";
	public static final String COD_COMP_MUSE		= "COD_COMP_MUSE";
	public static final String COD_FLOOR			= "COD_FLOOR";
	public static final String COD_RANGE_MUSE		= "COD_RANGE_MUSE";
	public static final String F_GESTIONEPIN		= "F_GESTIONEPIN";
	public static final String COD_CON1				= "COD_CON1";
	public static final String COD_CON2				= "COD_CON2";
	public static final String TIP_CON1				= "TIP_CON1";
	public static final String TIP_CON2				= "TIP_CON2";
	public static final String COD_DCC				= "COD_DCC";
	public static final String COD_MICRO_FUNZIONI	= "COD_MICRO_FUNZIONI";
	public static final String COD_CON1_MICRO		= "COD_CON1_MICRO";
	public static final String COD_CON2_MICRO		= "COD_CON2_MICRO";
	public static final String PROG_COMBINAZIONE_MICRO	= "PROG_COMBINAZIONE_MICRO";
	public static final String COD_RANGE_MUSE_MICRO		= "COD_RANGE_MUSE_MICRO";
	public static final String TICKET_APPLIX			= "TICKET_APPLIX";
	public static final String DT_CHIUSURA_TICKET		= "DT_CHIUSURA_TICKET";
	public static final String ESITO_APPLIX				= "ESITO_APPLIX";
	public static final String MICRO_TIMEOUT			= "MICRO_TIMEOUT";
	public static final String VERSION					= "VERSION";
	
	public String[] getCampi() {
		return new String[] {
				TERMINALID,			
				NR_ALLEGATO1,			
				NR_ALLUNGA,			
				DT_RICHIESTA,			
				F_STATORIC,			
				F_STATO,				
				F_MODALITA,			
				COD_BLOCCO,			
				H_DLL,				
				H_LOG,				
				FLOOR1,				
				FLOOR2,				
				DT_FLOORINIZIO,		
				DT_FLOORFINE,			
				F_MANCE,				
				NR_ORDINE,			
				NR_RIGA,				
				DT_VAL_CRC,			
				DT_ATT_CRC,			
				DT_FINE_CRC,		
				DT_COM_ATT_CRC,		
				DT_COM_RID_CRC,		
				DT_INS,				
				DT_ULTMOD,			
				COD_OPERATORE,		
				PROG_COMBINAZIONE,	
				COD_PROPONENTE,		
				COD_COMP_MUSE,		
				COD_FLOOR,			
				COD_RANGE_MUSE,		
				F_GESTIONEPIN,		
				COD_CON1,				
				COD_CON2,				
				TIP_CON1,				
				TIP_CON2,				
				COD_DCC,				
				COD_MICRO_FUNZIONI,	
				COD_CON1_MICRO,		
				COD_CON2_MICRO,		
				PROG_COMBINAZIONE_MICRO,
				COD_RANGE_MUSE_MICRO,	
				TICKET_APPLIX,		
				DT_CHIUSURA_TICKET,	
				ESITO_APPLIX,			
				MICRO_TIMEOUT,		
				VERSION				
		
		};
	}
	
	public static String getAs(String s) {
		return "";
	}
	
	public static String tabelleEx() {
		TermRig.COUNT_TERM_RIG++;
		return TermRig.TERM_RIG + " " + TermRig.TR.replace(".", "") + ",\n";
	}
}
