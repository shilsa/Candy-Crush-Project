package Sound;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

abstract public class Bgmusic {
	 
	 public Clip clip;
	 
	public void BGMusic(String str, float i) {
		 String name = str;
		 float k = i;
		 File file = new File(name);
		 try {
				clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(file));
				FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			     gainControl.setValue(-k);
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		
	 }


}
