package net.opalgames.tanks.launcher;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TanksLauncher {
	@Getter
	private boolean mac;
	
	public void main(String[] args) throws Exception {
		if (System.getProperty("os.name").toLowerCase().contains("mac")) {
			mac = true;
			
			System.setProperty("apple.laf.useScreenMenuBar", "true");
			System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Tanks Launcher");
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		
		SwingUtilities.invokeLater(TanksLauncher::init); // TODO: Stop procrastinating!
	}
	
	private void init() {
		LauncherFrame frame = new LauncherFrame();
		frame.setVisible(true);
	}
}
