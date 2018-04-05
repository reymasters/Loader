package au.gui.panel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import au.define.Allegato1;

@SuppressWarnings({"rawtypes","unchecked"})
public class PAllegato1 extends PGeneral {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PAllegato1() {
		super();
	}
	
	public JPanel getGui(List<String> listaCampi) {
		this.add(new JLabel("Allegato1"));
		super.getGui("Allegato1", new Allegato1(), listaCampi);

		JButton addButton = new JButton("Add Campo");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allegato1.DO_ALLEGATO1 = true;
				listaCampi.add(Allegato1.A1 + iCampo + Allegato1.getAs(iCampo));
				reload(Allegato1.A1 + iCampo);
			}
		});
		
		JButton removeButton = new JButton("Rimuovi Campo");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaCampi.remove(Allegato1.A1 + iCampo+ Allegato1.getAs(iCampo));
			}
		});

		this.add(addButton, BorderLayout.SOUTH);
		this.add(removeButton, BorderLayout.SOUTH);

		return this;
	}

}
