public class UserCart {
    private String[] albums;
    private String[] songs;
    private double totalPrice;
	public UserCart(String[] albums, String[] songs, double totalPrice) {
		super();
		this.albums = albums;
		this.songs = songs;
		this.totalPrice = totalPrice;
	}
	public String[] getAlbums() {
		return albums;
	}
	public void setAlbums(String[] albums) {
		this.albums = albums;
	}
	public String[] getSongs() {
		return songs;
	}
	public void setSongs(String[] songs) {
		this.songs = songs;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
    
    

}