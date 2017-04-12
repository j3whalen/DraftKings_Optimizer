import java.io.File;

import javax.swing.JFileChooser;

public class FileFinder {
	public static File GetFile() {
    	
    	JFileChooser jfc = new JFileChooser();
        jfc.showDialog(null,"Please Select the File");
        jfc.setVisible(true);
        File filename = jfc.getSelectedFile();
        System.out.println("File name "+filename.getName());
        return filename;
	}

}
