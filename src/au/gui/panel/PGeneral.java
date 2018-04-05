package au.gui.panel;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import au.define.Allegato1;
import au.define.Allegato2;
import au.define.Allegato2Sca;
import au.define.Allegato2Voci;
import au.define.Allunga;
import au.define.AnCliente;
import au.define.AnStabi;
import au.define.TermRig;
import au.define.TermTest;

public class PGeneral<T> extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int indice = 0;
	public String iCampo;
	private T t;
	List<String> listaCampi = new ArrayList<String>();	
	
	public PGeneral() {
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		this.setSize(200, 320);
	}
	
	public PGeneral(T t) {
		this();
		this.t = t;		
	}
	
	public void reload(String s) {			
		this.add(new JLabel(++indice + ". " + s));
		this.setVisible(false);
		this.repaint();		
		this.setVisible(true);
		
	}
	
	public ListSelectionListener getAction(String tabella) {
		return new ListSelectionListener() {
		    
			@SuppressWarnings({ "rawtypes", "unused" })
			public void valueChanged(ListSelectionEvent evt) {
		    	  		          
		          boolean adjust = evt.getValueIsAdjusting();
		          
		          if (!adjust) {
		        	
					JList list = (JList) evt.getSource();		            
		            int s = list.getSelectedIndex();
		            
		            iCampo = (String)list.getSelectedValue();		            
		          }
		        }
		    };
	}
	
	public JList<String> creaLista(String tabella,String[] campi) {
		JList<String> lista = new JList<String>(campi);
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lista.setLayoutOrientation(JList.VERTICAL);
		lista.setVisibleRowCount(0);
		lista.addListSelectionListener(getAction(tabella));
		
		return lista;
	}
	
	public JPanel getGui(String tabella,T t,List<String> listaCampi) {
		
		this.t = t;
		JScrollPane listaTabella = null;
		
		if(this.t instanceof AnCliente) {			
			listaTabella = new JScrollPane(creaLista(tabella,((AnCliente)t).getCampi()));
		}
		if(this.t instanceof TermTest) {			
			listaTabella = new JScrollPane(creaLista(tabella,((TermTest)t).getCampi()));
		}
		if(this.t instanceof TermRig) {			
			listaTabella = new JScrollPane(creaLista(tabella,((TermRig)t).getCampi()));
		}
		if(this.t instanceof AnStabi) {			
			listaTabella = new JScrollPane(creaLista(tabella,((AnStabi)t).getCampi()));
		}
		if(this.t instanceof Allunga) {			
			listaTabella = new JScrollPane(creaLista(tabella,((Allunga)t).getCampi()));
		}
		if(this.t instanceof Allegato1) {			
			listaTabella = new JScrollPane(creaLista(tabella,((Allegato1)t).getCampi()));
		}
		if(this.t instanceof Allegato2) {			
			listaTabella = new JScrollPane(creaLista(tabella,((Allegato2)t).getCampi()));
		}
		if(this.t instanceof Allegato2Sca) {			
			listaTabella = new JScrollPane(creaLista(tabella,((Allegato2Sca)t).getCampi()));
		}
		if(this.t instanceof Allegato2Voci) {			
			listaTabella = new JScrollPane(creaLista(tabella,((Allegato2Voci)t).getCampi()));
		}
		
		if(listaTabella != null)
			listaTabella.setPreferredSize(new Dimension(200, 300));
		
		if(listaTabella != null)
	      this.add(listaTabella);
	      
		return this;
	}

	public List<String> getListaCampi() {
		return listaCampi;
	}

	public void setListaCampi(List<String> listaCampi) {
		this.listaCampi = listaCampi;
	}
	
	public void addCampo(String c) {
		this.listaCampi.add(c);
	}

	public String getiCampo() {
		return iCampo;
	}

	public void setiCampo(String iCampo) {
		this.iCampo = iCampo;
	}
	
	
}
