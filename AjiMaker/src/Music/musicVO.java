package Music;

public class musicVO {

	private String musicName; // 노래제목
	private String musicPath; // 노래경로
	


	public musicVO(String musicName, String musicPath) {
		
		this.musicName = musicName;
		this.musicPath = musicPath;
	}
	
	public String getMusicName() {
		return musicName;
	}


	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}


	public String getMusicPath() {
		return musicPath;
	}


	public void setMusicPath(String musicPath) {
		this.musicPath = musicPath;
	}



	
	
}
