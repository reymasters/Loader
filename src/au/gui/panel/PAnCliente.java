package au.gui.panel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import au.define.AnCliente;

@SuppressWarnings({"rawtypes","unchecked"})
public class PAnCliente extends PGeneral {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	public PAnCliente() {		
		super();			
	}
	
	public JPanel getGui(List<String> listaCampi) {
		this.add(new JLabel("AnCliente"));
		super.getGui("AnCliente", new AnCliente(), listaCampi);

		JButton addButton = new JButton("Add Campo");

		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnCliente.DO_ANCLIENTE = true;
								
				if(!listaCampi.contains(AnCliente.CL + iCampo + AnCliente.getAs(iCampo)))
					listaCampi.add(AnCliente.CL + iCampo + AnCliente.getAs(iCampo));
				System.out.println(AnCliente.CL + iCampo);
				reload(AnCliente.CL + iCampo);
			}
		});

		JButton removeButton = new JButton("Rimuovi Campo");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaCampi.remove(AnCliente.CL + iCampo
						+ AnCliente.getAs(iCampo));

			}
		});

		this.add(addButton, BorderLayout.SOUTH);
		this.add(removeButton, BorderLayout.SOUTH);

		return this;
	}
}
