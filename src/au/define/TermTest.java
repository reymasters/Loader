package au.define;

public class TermTest {
	
	public static int COUNT_TERM_TEST = 0;
	public static boolean DO_TERMTEST = false;
	public static final String TERM_TEST 			= "TERM_TEST";
	public static final String TT 					= "tt.";
	
	public static final String TERMINALID 			= "TERMINALID";
	public static final String NR_ALLEGATO1 		= "NR_ALLEGATO1";
	public static final String COD_CLIENTE			= "COD_CLIENTE";
	public static final String COD_STABI			= "COD_STABI";
	public static final String NR_CASSA				= "NR_CASSA";
	public static final String COD_RISORSA			= "COD_RISORSA";
	public static final String COD_COLLEG			= "COD_COLLEG";				
	public static final String COD_HOST				= "COD_HOST";
	public static final String COD_GESTORE			= "COD_GESTORE";							
	public static final String COD_MODEURO			= "COD_MODEURO";						
	public static final String DIVISA_LAVORO		= "DIVISA_LAVORO";						
	public static final String F_TELEGESTIONE		= "F_TELEGESTIONE";
	public static final String NR_TELEGESTIONE		= "NR_TELEGESTIONE";
	public static final String INSEGNA_SCO			= "INSEGNA_SCO";
	public static final String LOCALITA_SCO			= "LOCALITA_SCO";
	public static final String NR_CRO				= "NR_CRO";
	public static final String F_PROPRIETA_POS		= "F_PROPRIETA_POS";
	public static final String F_PROPRIETA_LINEA	= "F_PROPRIETA_LINEA";
	public static final String PROG_COMBINAZIONE	= "PROG_COMBINAZIONE";
	public static final String COD_COMP				= "COD_COMP";						
	public static final String F_CAPOFILA			= "F_CAPOFILA";
	public static final String DT_VALIDAZIONE		= "DT_VALIDAZIONE";
	public static final String DT_INSTALLAZIONE		= "DT_INSTALLAZIONE";
	public static final String DT_DISINSTALLAZIONE	= "DT_DISINSTALLAZIONE";
	public static final String F_STATO				= "F_STATO";
	public static final String F_STATOSIA			= "F_STATOSIA";
	public static final String F_BLOCCATO			= "F_BLOCCATO";						
	public static final String F_AGGPROFILI			= "F_AGGPROFILI";
	public static final String DT_RICHIESTA			= "DT_RICHIESTA";
	public static final String DT_INS				= "DT_INS";
	public static final String DT_ULTMOD			= "DT_ULTMOD";
	public static final String COD_OPERATORE		= "COD_OPERATORE";						
	public static final String MATRICOLA			= "MATRICOLA";
	public static final String COD_RELEASE			= "COD_RELEASE";	
	public static final String CRN					= "CRN";
	public static final String COD_CON1				= "COD_CON1";
	public static final String TIP_CON1				= "TIP_CON1";
	public static final String COD_CON2				= "COD_CON2";
	public static final String TIP_CON2				= "TIP_CON2";
	public static final String TERMINALID_OLD		= "TERMINALID_OLD";
	public static final String NR_ALLEGATO1_OLD		= "NR_ALLEGATO1_OLD";
	public static final String TIPO_RETE			= "TIPO_RETE";
	public static final String COD_COMP_PROPR		= "COD_COMP_PROPR";
	public static final String F_CENSECETI			= "F_CENSECETI";
	public static final String COD_FORN				= "COD_FORN";
	public static final String COD_SER				= "COD_SER";
	public static final String KTER					= "KTER";
	public static final String COD_SERVIZIO			= "COD_SERVIZIO";
	public static final String COD_PROPONENTE		= "COD_PROPONENTE";
	public static final String FUNZ_TERMINALE		= "FUNZ_TERMINALE";
	public static final String NR_CONTRATTO			= "NR_CONTRATTO";						
	public static final String F_GESTIONEMICRO		= "F_GESTIONEMICRO";						
	public static final String MICRO_NUM_TRANS		= "MICRO_NUM_TRANS";
	public static final String COD_CON1_MICRO		= "COD_CON1_MICRO";
	public static final String COD_CON2_MICRO		= "COD_CON2_MICRO";
	public static final String COD_ACCESSORIO		= "COD_ACCESSORIO";
	public static final String MAT_ACCESSORIO		= "MAT_ACCESSORIO";
	public static final String DT_INST_ACCESSORIO	= "DT_INST_ACCESSORIO";
	public static final String DT_DIS_ACCESSORIO	= "DT_DIS_ACCESSORIO";
	public static final String COD_SOL				= "COD_SOL";
	public static final String COD_FORNITORE		= "COD_FORNITORE";
	public static final String TIP_ACQ				= "TIP_ACQ";
	public static final String MICRO_OFF_LINE		= "MICRO_OFF_LINE";		
	public static final String NOTE					= "NOTE";
	public static final String COD_SOL_FAT			= "COD_SOL_FAT";
	public static final String COD_SERV_AGG			= "COD_SERV_AGG";
	public static final String TIPO_INSTALLAZIONE	= "TIPO_INSTALLAZIONE";
	public static final String COD_SEDEFOR			= "COD_SEDEFOR";
	public static final String VERSION				= "VERSION";
	
	public String[] getCampi() {
		return new String[] {
				COD_ACCESSORIO,
				COD_CLIENTE,
				COD_COLLEG,
				COD_COMP,
				COD_COMP_PROPR,
				COD_CON1,
				COD_CON1_MICRO,
				COD_CON2,
				COD_CON2_MICRO,
				COD_FORN,
				COD_FORNITORE,
				COD_GESTORE,
				COD_HOST,
				COD_MODEURO,
				COD_OPERATORE,
				COD_PROPONENTE,
				COD_RELEASE,
				COD_RISORSA,
				COD_SEDEFOR,
				COD_SER,
				COD_SERV_AGG,
				COD_SERVIZIO,
				COD_SOL,
				COD_SOL_FAT,
				COD_STABI,
				CRN,
				DIVISA_LAVORO,
				DT_DIS_ACCESSORIO,
				DT_DISINSTALLAZIONE,
				DT_INS,
				DT_INST_ACCESSORIO,
				DT_INSTALLAZIONE,
				DT_RICHIESTA,
				DT_ULTMOD,
				DT_VALIDAZIONE,
				F_AGGPROFILI,
				F_BLOCCATO,
				F_CAPOFILA,
				F_CENSECETI,
				F_GESTIONEMICRO,
				F_PROPRIETA_LINEA,
				F_PROPRIETA_POS,
				F_STATO,
				F_STATOSIA,
				F_TELEGESTIONE,
				FUNZ_TERMINALE,
				INSEGNA_SCO,
				KTER,
				LOCALITA_SCO,
				MAT_ACCESSORIO,
				MATRICOLA,
				MICRO_NUM_TRANS,
				MICRO_OFF_LINE,
				NOTE,
				NR_ALLEGATO1,
				NR_ALLEGATO1_OLD,
				NR_CASSA,
				NR_CONTRATTO,
				NR_CRO,
				NR_TELEGESTIONE,
				PROG_COMBINAZIONE,
				TERMINALID,
				TERMINALID_OLD,
				TIP_ACQ,
				TIP_CON1,
				TIP_CON2,
				TIPO_INSTALLAZIONE,
				TIPO_RETE,
				VERSION			
		};
	}
	
	public static String getAs(String s) {
		return s.equals(COD_PROPONENTE) ? " as abi" : 
			s.equals(TERMINALID) ? " as tmid" : 
			s.equals(DT_INSTALLAZIONE) ? " as dt_installazione_pos" : 
			s.equals(F_STATO) ? " as stato" :
			s.equals(COD_SOL_FAT) ? " as cod_sol_fat" :
			"";
	}
	
	public static String tabelleEx() {
		COUNT_TERM_TEST++;
		return TERM_TEST + " " + TT.replace(".", "") + ",\n";
	}
}
