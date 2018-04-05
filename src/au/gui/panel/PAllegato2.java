package au.gui.panel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import au.define.Allegato2;

@SuppressWarnings({"rawtypes","unchecked"})
public class PAllegato2 extends PGeneral {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PAllegato2() {
		super();
	}

	
	public JPanel getGui(List<String> listaCampi) {
		this.add(new JLabel("Allegato2"));
		super.getGui("Allegato2", new Allegato2(), listaCampi);

		JButton addButton = new JButton("Add Campo");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allegato2.DO_ALLEGATO2 = true;
				listaCampi.add(Allegato2.A2 + iCampo + Allegato2.getAs(iCampo));
				reload(Allegato2.A2 + iCampo);
			}
		});
		
		JButton removeButton = new JButton("Rimuovi Campo");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaCampi.remove(Allegato2.A2 + iCampo+ Allegato2.getAs(iCampo));

			}
		});

		this.add(addButton, BorderLayout.SOUTH);
		this.add(removeButton, BorderLayout.SOUTH);

		return this;
	}
}
