package vocalreconnaissanceplugin.handlers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.eclipsetotale.horloge.texte.HorlogeTexte;

import org.eclipse.jface.dialogs.MessageDialog;

public class SampleHandler extends AbstractHandler {

	private HorlogeTexte ht ;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"Vocalreconnaissanceplugin",
				"Hello, Eclipse world"
				+ "blabla");
		File fichier = new File ("C:\\Users\\mathy\\git\\Voxclipse\\src\\Main.java") ;
		try {
			fichier.createNewFile() ;
			BufferedWriter bw = new BufferedWriter (new FileWriter (new File ("C:\\Users\\mathy\\git\\Voxclipse\\src\\Main.java"))) ;
			bw.write("import java.io.File;\n" + 
					"import java.io.IOException;\n" + 
					"\n" + 
					"public class Main {\n" + 
					"	public static void main (String[] args) {\n" + 
					"		\n" + 
					"		System.out.println(\"Un Main est né.\");\n" + 
					"\n" + 
					"	}\n" + 
					"}\n" + 
			"");
			String str = "coucou" ;
			bw.newLine();
			bw.write(str, 10, str.length());
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MessageDialog.openInformation(
				window.getShell(),
				"Vocalreconnaissanceplugin",
				"Hello, Eclipse world"
				+ "blabla");
		return null;
	}
}
