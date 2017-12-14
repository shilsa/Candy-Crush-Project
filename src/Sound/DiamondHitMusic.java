package Sound;

public class DiamondHitMusic extends Bgmusic {
	public DiamondHitMusic() {
		String file = "SMusic.wav";
		super.BGMusic(file, 0.0f);
		super.clip.start();
	}
}
