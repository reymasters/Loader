package au.gui.panel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import au.define.TermRig;

@SuppressWarnings({"rawtypes","unchecked"})
public class PTermRig extends PGeneral {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PTermRig() {
		super();
	}

	public JPanel getGui(List<String> listaCampi) {
		this.add(new JLabel("TermRig"));
		super.getGui("TermRig", new TermRig(), listaCampi);

		JButton addButton = new JButton("Add Campo");

		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TermRig.DO_TERMRIG = true;
				listaCampi.add(TermRig.TR + iCampo + TermRig.getAs(iCampo));
				reload(TermRig.TR + iCampo);
			}
		});
		JButton removeButton = new JButton("Rimuovi Campo");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaCampi.remove(TermRig.TR + iCampo + TermRig.getAs(iCampo));
			}
		});

		this.add(addButton, BorderLayout.SOUTH);
		this.add(removeButton, BorderLayout.SOUTH);

		return this;
	}
}
