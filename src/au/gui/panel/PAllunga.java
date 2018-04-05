package au.gui.panel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import au.define.Allunga;

@SuppressWarnings({"rawtypes","unchecked"})
public class PAllunga extends PGeneral {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PAllunga() {
		super();
	}

	public JPanel getGui(List<String> listaCampi) {
		this.add(new JLabel("Allunga"));
		super.getGui("Allunga", new Allunga(), listaCampi);

		JButton addButton = new JButton("Add Campo");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allunga.DO_ALLUNGA = true;
				listaCampi.add(Allunga.A + iCampo + Allunga.getAs(iCampo));	
				reload(Allunga.A + iCampo);
			}
		});
		JButton removeButton = new JButton("Rimuovi Campo");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaCampi.remove(Allunga.A + iCampo + Allunga.getAs(iCampo));

			}
		});

		this.add(addButton, BorderLayout.SOUTH);
		this.add(removeButton, BorderLayout.SOUTH);

		return this;
	}

}
