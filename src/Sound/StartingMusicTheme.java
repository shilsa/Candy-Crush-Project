package Sound;

import javax.sound.sampled.AudioSystem;

public class StartingMusicTheme extends Bgmusic{
	public StartingMusicTheme() {
		String file = "GMusic.wav";
		super.BGMusic(file, 5.0f);
	}
	
}
