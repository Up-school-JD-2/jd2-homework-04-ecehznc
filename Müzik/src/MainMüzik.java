import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class MainMüzik {
    private static List<Album> albums = new ArrayList<>();
    private static List<Account> accounts = new ArrayList<>();
    private static Account currentAccount;
    
    public static void main(String[] args) {
        Data();
        login();
        searchAlbums();
        addSongToUserCart();        
    }
    private static void Data() {
        Album album1 = new Album("After Hours", "The Weeknd", Arrays.asList("faith, snowchild,heartless"));
        Album album2 = new Album("Lotus", "Soen", Arrays.asList("river, lunacy,rival"));
        Album album3 = new Album("Tron", "Daft Punk", Arrays.asList("fall, arena, finale"));
               
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        accounts.add(new Account("ecce", "eha12"));       
    }

    private static void login() {
        Scanner scanner = new Scanner(System.in);

        while (currentAccount == null) {
            System.out.print("Kullanıcı adı: ");
            String username = scanner.nextLine();
            System.out.print("Şifre: ");
            String password = scanner.nextLine();            
        }        
    }
    
    private static void searchAlbums() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Arama yapmak istediğiniz albüm adını girin : ");
            String albumName = scanner.nextLine();           
            List<Album> results = new ArrayList<>();
            
            for (Album album : albums) {
            	if (album.getAlbumName().contains(albumName))  {
                    results.add(album);
                    return;
                }
            }

            if (results.isEmpty()) {
                System.out.println("Arama sonucu bulunamadı.");
            } 
            else {
                System.out.println("Arama sonuçları:");
                for (Album album : results) {
                    System.out.println("- " + album.getAlbumName() + " - " + album.getArtistName());
                       }
                
                    }            
           }        
  }    
    private static void addSongToUserCart() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	System.out.print("Sepete eklemek istediğiniz albüm adını girin : ");
            String albumName = scanner.nextLine();
            Album albumToAdd = null;
            
            for (Album album : albums) {
            	if (album.getAlbumName().contains(albumName)) {
                    albumToAdd = album;
                    break;
                }
            }                                              
            while (true) {
            	Song songToAdd = null;	
            	System.out.println("- " + Song.getSongName());
                System.out.print("Sepete eklemek istediğiniz şarkının adını girin: ");
                String songName = scanner.nextLine();
                return;
                                              
            }            
        }
    }
}

    


