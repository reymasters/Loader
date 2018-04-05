package au.gui.panel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import au.define.Allegato2Sca;

@SuppressWarnings({"rawtypes","unchecked"})
public class PAllegato2Sca extends PGeneral {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PAllegato2Sca() {
		super();
	}

	public JPanel getGui(List<String> listaCampi) {
		this.add(new JLabel("Allegato2_Sca"));
		super.getGui("Allegato2Sca", new Allegato2Sca(), listaCampi);

		JButton addButton = new JButton("Add Campo");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allegato2Sca.DO_ALLEGATO2SCA = true;
				listaCampi.add(Allegato2Sca.ALLE2SCA + iCampo + Allegato2Sca.getAs(iCampo));
				reload(Allegato2Sca.ALLE2SCA + iCampo);
			}
		});
		
		JButton removeButton = new JButton("Rimuovi Campo");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaCampi.remove(Allegato2Sca.ALLE2SCA + iCampo+ Allegato2Sca.getAs(iCampo));

			}
		});

		this.add(addButton, BorderLayout.SOUTH);
		this.add(removeButton, BorderLayout.SOUTH);

		return this;
	}
}
