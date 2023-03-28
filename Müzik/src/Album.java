import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumName;
    private String artistName;
    private static List<String> listsong = new ArrayList<String>();
    
    
    
	public Album(String albumName, String artistName,  List<String> listsong) {
		super();
		this.albumName = albumName;
		this.artistName = artistName;
		Album.listsong = listsong;
	}



	public String getAlbumName() {
		return albumName;
	}



	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}



	public String getArtistName() {
		return artistName;
	}



	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}



	public static List<String> getListsong() {
		return listsong;
	}



	public static void setListsong(List<String> listsong) {
		Album.listsong = listsong;
	}
	

    
    
}



