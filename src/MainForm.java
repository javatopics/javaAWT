import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainForm extends Frame{
	private static final long serialVersionUID = 1L;

	MainForm(){
		setExtendedState(Frame.MAXIMIZED_BOTH);
		//setUndecorated(true);
		setSize(600, 350);
		setVisible(true);
		//window close event
		addWindowListener(this.closeWindowListener());
	}
	
	public static void main(String[] args) {
		new MainForm();
	}
	
	private WindowAdapter closeWindowListener(){
		return new WindowAdapter() {
			 public void windowClosing(WindowEvent we) {
		          dispose();
		    }
		};
	}

}