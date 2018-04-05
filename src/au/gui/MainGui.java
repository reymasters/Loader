package au.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import au.bl.CreateQuery;
import au.gui.panel.PAllegato1;
import au.gui.panel.PAllegato2;
import au.gui.panel.PAllegato2Sca;
import au.gui.panel.PAllegato2Voci;
import au.gui.panel.PAllunga;
import au.gui.panel.PAnCliente;
import au.gui.panel.PAnStabi;
import au.gui.panel.PTermRig;
import au.gui.panel.PTermTest;
import au.mig.CreaFile;

public class MainGui extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	List<String> listaCampi = new ArrayList<String>();
	
	public MainGui() {		
		creaGui();
	}
	
	private ActionListener getConferma(JTextField inputCampo) {
		return new ActionListener() {
			  public void actionPerformed(ActionEvent e) {	
				  CreateQuery query = new CreateQuery();				  
				  String sql = query.getQuery(listaCampi,inputCampo.getText(),false);
				  String nomefile = JOptionPane.showInputDialog("Nome File?");
			      CreaFile.scriptSql(sql,nomefile);
			  }
		};
	}
	
		
	public void creaGui() {		
		this.setTitle("Frame");		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		
		JPanel pRoot = new JPanel();		
		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
		JTextField inputCampo = new JTextField();
		inputCampo.setSize(50, 30);
		inputCampo.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent ae){
			   //sInputCampo = inputCampo.getText();		     
		   }
		});
		
		JButton conferma = new JButton("Conferma");
		conferma.addActionListener(getConferma(inputCampo));
		p1.add(inputCampo);
		p1.add(conferma);
										
		pRoot.add(new PAnCliente().getGui(listaCampi));
		pRoot.add(new PTermTest().getGui(listaCampi));
		pRoot.add(new PTermRig().getGui(listaCampi));
		pRoot.add(new PAnStabi().getGui(listaCampi));
		pRoot.add(new PAllunga().getGui(listaCampi));
		pRoot.add(new PAllegato1().getGui(listaCampi));
		pRoot.add(new PAllegato2().getGui(listaCampi));
		pRoot.add(new PAllegato2Sca().getGui(listaCampi));
		pRoot.add(new PAllegato2Voci().getGui(listaCampi));		
		pRoot.add(p1);
		
		//jcb.addActionListener(this);
		//getContentPane().add(nordPnl,BorderLayout.NORTH);		
		c.add(pRoot);
		
		//c.add(p1);
		this.setSize(1000,800);		
		this.setVisible(true);

	}
}
