package au.define;

public class Allegato2 {

	public static int COUNT_ALLEGATO2	= 0;
	public static boolean DO_ALLEGATO2 = false;
	public static final String ALLEGATO2 				= "ALLEGATO2";
	public static final String A2					= "a2.";
	
	public static String COD_OPERATORE		= "COD_OPERATORE";
	public static String DT_ALLEGATO2		= "DT_ALLEGATO2";
	public static String DT_ARRIVO			= "DT_ARRIVO";
	public static String DT_INS				= "DT_INS";
	public static String DT_NOTIFICA		= "DT_NOTIFICA";
	public static String DT_ULTMOD			= "DT_ULTMOD";
	public static String DT_VALIDITA_DAL	= "DT_VALIDITA_DAL";
	public static String NR_ALLEGATO1		= "NR_ALLEGATO1";
	public static String NR_ALLEGATO2		= "NR_ALLEGATO2";
	public static String TERMINALID			= "TERMINALID";
	public static String VERSION			= "VERSION";
	
	public String[] getCampi() {
		return new String[] {							
				COD_OPERATORE,
				DT_ALLEGATO2,
				DT_ARRIVO,
				DT_INS,
				DT_NOTIFICA,
				DT_ULTMOD,
				DT_VALIDITA_DAL,
				NR_ALLEGATO1,
				NR_ALLEGATO2,
				TERMINALID,
				VERSION

		};
	}
	
	public static String getAs(String s) {
		return s.equals(COD_OPERATORE) ? " as operatore" :
				s.equals(DT_ALLEGATO2) ? " as dt_allegato2" : "";
	}

	public static String tabelleEx() {
		COUNT_ALLEGATO2++;
		return A2 + " " + A2.replace(".", "") + ",\n";
	}
}
