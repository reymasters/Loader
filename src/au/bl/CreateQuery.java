package au.bl;

import java.util.List;

import au.define.Allegato1;
import au.define.Allegato2;
import au.define.Allegato2Sca;
import au.define.Allegato2Voci;
import au.define.Allunga;
import au.define.AnCliente;
import au.define.AnStabi;
import au.define.TermRig;
import au.define.TermTest;

public class CreateQuery {
	
	private static final String MONETICA = "monetica.";
	private boolean comboVociESca = false;
	
	public boolean controllaCombo(String s, boolean comboPartitaIvaCf,boolean comboScaglioni,StringBuilder sb) {		
		if(comboPartitaIvaCf & s.equals(AnCliente.ex(AnCliente.PARTITA_IVA))) {
			sb.append("	nvl("+AnCliente.CL+AnCliente.PARTITA_IVA+","+AnCliente.CL+AnCliente.CODICE_FISCALE+") piva,\n");
			return true;
		}else if(comboScaglioni & s.equals(Allegato2Sca.ex(Allegato2Sca.VALORE_SCAGLIONE2))) {
			sb.append("	nvl("+Allegato2Sca.ALLE2SCA+Allegato2Sca.VALORE_SCAGLIONE2+","+Allegato2Sca.ALLE2SCA+Allegato2Sca.VALORE_SCAGLIONE+") scaglione,\n");
			return true;
		}
		return false;
	}
	
	public void getCampi(List<String> listaCampi, StringBuilder sb) {

		int index = 0;
		boolean comboPartitaIvaCf = false;
		boolean comboScaglioni = false;
		
		if(listaCampi.contains(AnCliente.ex(AnCliente.PARTITA_IVA)) &
				!listaCampi.contains(AnCliente.ex(AnCliente.CODICE_FISCALE))) {
			comboPartitaIvaCf = true;
		}
		if(listaCampi.contains(Allegato2Sca.ex(Allegato2Sca.VALORE_SCAGLIONE2)) &
				!listaCampi.contains(Allegato2Sca.ex(Allegato2Sca.VALORE_SCAGLIONE))) {
			comboScaglioni = true;
		}
		if(!Allegato2.DO_ALLEGATO2 & 
				Allegato2Sca.DO_ALLEGATO2SCA &
					Allegato2Voci.DO_ALLEGATO2VOCI) {
			comboVociESca = true;
			System.out.println("comboVociESca true");
		}
		
		for (String s : listaCampi) {			
			if (index < (listaCampi.size()-1)) {
				if(!controllaCombo(s,comboPartitaIvaCf,comboScaglioni, sb))
					sb.append("	" + s + ",\n");
			}else{
				if(!controllaCombo(s,comboPartitaIvaCf,comboScaglioni, sb))
					sb.append("	" + s + "\n");
			}
			index++;
		}

	}
	
	public void getTabelle(StringBuilder sb,boolean statoAttivazioneConvenzione) {
				
		if (TermTest.DO_TERMTEST) {								
			sb.append(" "+MONETICA + TermTest.tabelleEx());
		}
		if (AnCliente.DO_ANCLIENTE) {				
			sb.append(" "+MONETICA + AnCliente.tabelleEx());
		}
		if (AnStabi.DO_ANSTABI) {				
			sb.append(" "+MONETICA + AnStabi.tabelleEx());
		}
		if (TermRig.DO_TERMRIG || statoAttivazioneConvenzione) {				
			sb.append(" "+MONETICA + TermRig.tabelleEx());
		}
		if (Allunga.DO_ALLUNGA || statoAttivazioneConvenzione) {				
			sb.append(" "+MONETICA + Allunga.tabelleEx());
		}			
		if (Allegato1.DO_ALLEGATO1) {				
			sb.append(" "+MONETICA + Allegato1.tabelleEx());
		}
		if (Allegato2.DO_ALLEGATO2) {				
			sb.append(" "+MONETICA + Allegato2.tabelleEx());
		}
		if(comboVociESca) {
			sb.append("	(select a2.*,\n");
			sb.append("\tRank() Over(PARTITION BY a2.terminalid, a2.nr_allegato1 \n");
			sb.append("\tORDER BY a2.dt_validita_dal DESC, a2.nr_allegato2 desc) rk \n");
	        sb.append("\tfrom "+MONETICA+"allegato2 a2 \n");	                  
	        sb.append(" ) a2,\n");
		}
		if (Allegato2Sca.DO_ALLEGATO2SCA) {				
			sb.append(" "+MONETICA + Allegato2Sca.tabelleEx());
		}
		if (Allegato2Voci.DO_ALLEGATO2VOCI) {				
			sb.append(" "+MONETICA + Allegato2Voci.tabelleEx());
		}
		
		sb.substring(0,sb.length()-1);
		
	}
	
	public void getWhere(List<String> listaCampi, StringBuilder sb,
			boolean statoAttivazioneConvenzione) {
		
		int countWhere = 0;
		
		if (TermTest.DO_TERMTEST & AnCliente.DO_ANCLIENTE) {
			countWhere++;
			sb.append(TermTest.TT + TermTest.COD_CLIENTE + " = " + AnCliente.CL
					+ AnCliente.COD_CLIENTE + "\n");
		}
		if (TermTest.DO_TERMTEST & AnStabi.DO_ANSTABI) {
			if (countWhere > 0)
				sb.append("	and ");
			countWhere++;
			sb.append(TermTest.TT + TermTest.COD_CLIENTE + " = "
					+ AnStabi.STABI + AnStabi.COD_CLIENTE + "\n");
			sb.append("	and ");
			sb.append(TermTest.TT + TermTest.COD_STABI + " = " + AnStabi.STABI
					+ AnStabi.COD_STABI + "\n");
		}

		if (Allunga.DO_ALLUNGA & TermRig.DO_TERMRIG || 
				statoAttivazioneConvenzione) {
			if (countWhere > 0)
				sb.append("	and ");
			countWhere++;
			sb.append(Allunga.A + Allunga.NR_ALLUNGA + " (+) = " + TermRig.TR
					+ TermRig.NR_ALLUNGA + "\n");
		}

		if (TermRig.DO_TERMRIG & TermTest.DO_TERMTEST || 
				statoAttivazioneConvenzione) {
			if (countWhere > 0)
				sb.append("	and ");
			countWhere++;
			
			sb.append(TermRig.TR + TermRig.TERMINALID + " (+) = " + TermTest.TT
					+ TermTest.TERMINALID + "\n");
			sb.append("	and ");			
			sb.append(TermRig.TR + TermRig.NR_ALLEGATO1 + " (+) = "
					+ TermTest.TT + TermTest.NR_ALLEGATO1 + "\n");
		}
		
		if (Allegato1.DO_ALLEGATO1 & TermTest.DO_TERMTEST) {
			if (countWhere > 0)
				sb.append("	and ");
			countWhere++;
			sb.append(Allegato1.A1 + Allegato1.NR_ALLEGATO1 + " = " +
					TermTest.TT + TermTest.NR_ALLEGATO1+ "\n");
			
		}
		
		if(comboVociESca & TermTest.DO_TERMTEST) {
			if (countWhere > 0)
				sb.append("	and ");
			
			sb.append(Allegato2.A2 + Allegato2.TERMINALID + " = " +
					TermTest.TT + TermTest.TERMINALID + "\n");
			sb.append("	and ");
			sb.append(Allegato2.A2 + Allegato2.NR_ALLEGATO1 + " = " +
					TermTest.TT + TermTest.NR_ALLEGATO1 + "\n");
		}
		
		//a2.nr_allegato2 = v2.nr_allegato2
		if(comboVociESca & Allegato2Voci.DO_ALLEGATO2VOCI) {
			if (countWhere > 0)
				sb.append("	and ");
			
			sb.append(Allegato2.A2 + Allegato2.NR_ALLEGATO2 + " = " +
					Allegato2Voci.ALLE2VOCI + Allegato2Voci.NR_ALLEGATO2 + "\n");			
		}
		
		/* s2.nr_allegato2 (+) = v2.nr_allegato2
  		 * s2.cod_voce (+) = v2.cod_voce   
		 * */
		if (Allegato2Sca.DO_ALLEGATO2SCA & Allegato2Voci.DO_ALLEGATO2VOCI) {
			if (countWhere > 0)
				sb.append("	and ");
			countWhere++;
			sb.append(Allegato2Sca.ALLE2SCA + Allegato2Sca.COD_VOCE + " (+) = " +
					Allegato2Voci.ALLE2VOCI + Allegato2Voci.COD_VOCE+ "\n");
			sb.append("	and ");
			sb.append(Allegato2Sca.ALLE2SCA + Allegato2Sca.NR_ALLEGATO2 + " (+) = " +
					Allegato2Voci.ALLE2VOCI + Allegato2Voci.NR_ALLEGATO2+ "\n");
			
		}

		if (statoAttivazioneConvenzione) {
			if (countWhere > 0)
				sb.append("	and ");
			countWhere++;
			sb.append(TermRig.TR + TermRig.DT_FINE_CRC + " is null \n");

		}
		
		
		
	}

	public String getQuery(List<String> listaCampi, String sInputCampo,
			boolean statoAttivazioneConvenzione) {

		StringBuilder sb = new StringBuilder();
		
		sb.append("select \n\n");
		//System.out.println(listaCampi.size());

		getCampi(listaCampi, sb);

		if (sInputCampo.equalsIgnoreCase("stato attivazione convenzione")) {

			statoAttivazioneConvenzione = true;
			sb.append("	nullif(a.nr_convenzione,'0')  as cod_pv,--se 0 metti NULL\n");
			sb.append("	Case\n");
			sb.append("		When nullif(a.nr_convenzione,'0') is null Then 'Nessuna convenzione in essere'\n");
			sb.append("		When tr.dt_att_crc Is null Then 'Non attiva'\n");
			sb.append("		Else 'Attivata'\n");
			sb.append("	End as stato_attivazione_convenzione\n");
		}

		// FROM
		sb.append("FROM \n");
		
		getTabelle(sb, statoAttivazioneConvenzione);
		
		// WHERE

		sb.append("WHERE ");

		getWhere(listaCampi, sb, statoAttivazioneConvenzione);

		System.out.println("query risultato:\n");
		System.out.println(sb.toString()+"\n");

		return sb.toString();
	}
}
