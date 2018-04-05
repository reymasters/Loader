package au.gui.panel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import au.define.TermTest;

@SuppressWarnings({"rawtypes","unchecked"})
public class PTermTest extends PGeneral {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PTermTest() {
		super();
	}

	public JPanel getGui(List<String> listaCampi) {
		this.add(new JLabel("TermTest"));
		super.getGui("TermTest", new TermTest(), listaCampi);

		JButton addButton = new JButton("Add Campo");

		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TermTest.DO_TERMTEST = true;
				listaCampi.add(TermTest.TT + iCampo + TermTest.getAs(iCampo));
				reload(TermTest.TT + iCampo);
			}
		});

		JButton removeButton = new JButton("Rimuovi Campo");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaCampi.remove(TermTest.TT + iCampo + TermTest.getAs(iCampo));

			}
		});

		this.add(addButton, BorderLayout.SOUTH);
		this.add(removeButton, BorderLayout.SOUTH);

		return this;
	}
}
