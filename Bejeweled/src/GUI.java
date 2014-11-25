import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class GUI {

	protected Shell shlBejeweled;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			GUI window = new GUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlBejeweled.open();
		shlBejeweled.layout();
		while (!shlBejeweled.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlBejeweled = new Shell();
		shlBejeweled.setSize(450, 300);
		shlBejeweled.setText("Bejeweled");

	}

}
