package au.gui.panel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import au.define.AnStabi;

@SuppressWarnings({"rawtypes","unchecked"})
public class PAnStabi extends PGeneral {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PAnStabi() {
		super();
	}

	public JPanel getGui(List<String> listaCampi) {
		this.add(new JLabel("AnStabi"));
		super.getGui("AnStabi", new AnStabi(), listaCampi);

		JButton addButton = new JButton("Add Campo");

		JButton removeButton = new JButton("Rimuovi Campo");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnStabi.DO_ANSTABI = true;
				listaCampi.add(AnStabi.STABI + iCampo + AnStabi.getAs(iCampo));
				reload(AnStabi.STABI + iCampo);
			}
		});

		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaCampi.remove(AnStabi.STABI + iCampo
						+ AnStabi.getAs(iCampo));

			}
		});

		this.add(addButton, BorderLayout.SOUTH);
		this.add(removeButton, BorderLayout.SOUTH);

		return this;
	}

}
