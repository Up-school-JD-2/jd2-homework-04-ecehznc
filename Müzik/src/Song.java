public class Song {
    private  static String songName;
    private String artistName;
    private Album album;
	public Song(String artistName, Album album) {
		super();
		this.artistName = artistName;
		this.album = album;
	}
	public static String getSongName() {
		return songName;
	}
	public static void setSongName(String songName) {
		Song.songName = songName;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	


    

 
}
