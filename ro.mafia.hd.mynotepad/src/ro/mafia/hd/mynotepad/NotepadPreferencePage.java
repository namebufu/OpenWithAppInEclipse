package ro.mafia.hd.mynotepad;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class NotepadPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {

	public NotepadPreferencePage() {
		// TODO Auto-generated constructor stub
	}

	public NotepadPreferencePage(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public NotepadPreferencePage(String title, ImageDescriptor image) {
		super(title, image);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub

	}

	@Override
	protected Control createContents(Composite parent) {
		// TODO Auto-generated method stub
		Composite comp = new Composite(parent, SWT.FILL);
		comp.setLayout(new GridLayout(2, false));
		comp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		// comp.setLayoutData(new GridLayout(1, 2));
		Label label = new Label(comp, SWT.None);
		label.setText("Notepad++ Path: ");
		Text text = new Text(comp, SWT.FILL & SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

		return parent;
	}

}
