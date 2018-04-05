package au.define;

public class Allunga {

	public static int COUNT_ALLUNGA = 0;
	public static boolean DO_ALLUNGA = false;
	public static final String ALLUNGA 							= "ALLUNGA";
	public static final String A								= "a.";
	
	public static final String NR_ALLUNGA						= "NR_ALLUNGA";
	public static final String NR_ALLEGATO1						= "NR_ALLEGATO1";
	public static final String COD_COMP							= "COD_COMP";
	public static final String NR_CONVENZIONE					= "NR_CONVENZIONE";
	public static final String CODESE_SIA						= "CODESE_SIA";
	public static final String CODSTAB_SIA						= "CODSTAB_SIA";
	public static final String DT_VALIDAZIONE					= "DT_VALIDAZIONE";
	public static final String DT_ARRIVO						= "DT_ARRIVO";
	public static final String DT_ALLUNGA						= "DT_ALLUNGA";
	public static final String COD_BLOCCO						= "COD_BLOCCO";
	public static final String F_STATO							= "F_STATO";
	public static final String COD_PROMO						= "COD_PROMO";
	public static final String DT_INS							= "DT_INS";
	public static final String DT_ULTMOD						= "DT_ULTMOD";
	public static final String COD_OPERATORE					= "COD_OPERATORE";
	public static final String CODESE_SIA_NEW					= "CODESE_SIA_NEW";
	public static final String CODSTAB_SIA_NEW					= "CODSTAB_SIA_NEW";
	public static final String COD_TIPOALLUNGA					= "COD_TIPOALLUNGA";
	public static final String GG_VAL							= "GG_VAL";
	public static final String SGN_VAL							= "SGN_VAL";
	public static final String TIP_GG_VAL						= "TIP_GG_VAL";
	public static final String TIP_LIQ							= "TIP_LIQ";
	public static final String VERSION							= "VERSION";
	public static final String F_TITOLARI						= "F_TITOLARI";
	public static final String MOTIVO_NON_ESISTENZA_TITOLARI	= "MOTIVO_NON_ESISTENZA_TITOLARI";
	public static final String MY_BANK_INTEST_CONTO				= "MY_BANK_INTEST_CONTO";
	public static final String MY_BANK_COD_BIC					= "MY_BANK_COD_BIC";
	public static final String MY_BANK_TIP_COMMISS				= "MY_BANK_TIP_COMMISS";
	public static final String MY_BANK_COMMISS					= "MY_BANK_COMMISS";
	public static final String PROGR_SIA						= "PROGR_SIA";
	public static final String PROGR_SIA_NEW					= "PROGR_SIA_NEW";
	
	public String[] getCampi() {
		return new String[] {
				NR_ALLUNGA,
				NR_ALLEGATO1,
				COD_COMP,
				NR_CONVENZIONE,
				CODESE_SIA,
				CODSTAB_SIA,
				DT_VALIDAZIONE,
				DT_ARRIVO,
				DT_ALLUNGA,
				COD_BLOCCO,
				F_STATO,
				COD_PROMO,
				DT_INS,
				DT_ULTMOD,
				COD_OPERATORE,
				CODESE_SIA_NEW,
				CODSTAB_SIA_NEW,
				COD_TIPOALLUNGA,
				GG_VAL,
				SGN_VAL,
				TIP_GG_VAL,
				TIP_LIQ,
				VERSION,
				F_TITOLARI,
				MOTIVO_NON_ESISTENZA_TITOLARI,
				MY_BANK_INTEST_CONTO,
				MY_BANK_COD_BIC,
				MY_BANK_TIP_COMMISS,
				MY_BANK_COMMISS,
				PROGR_SIA,
				PROGR_SIA_NEW					
		};
	}
	
	public static String getAs(String s) {
		return s.equals(Allunga.NR_CONVENZIONE) ? " as nr_convenzione" : "";
	}

	public static String tabelleEx() {
		COUNT_ALLUNGA++;
		return ALLUNGA + " " + A.replace(".", "") + ",\n";
	}
}
