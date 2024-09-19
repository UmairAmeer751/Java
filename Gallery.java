import java.util.ArrayList;
import java.util.List;

public class Gallery {
    private List<Artist> artists;

    public Gallery() {
        this.artists = new ArrayList<>();
    }

    // Add artist to the gallery
    public void addArtist(Artist artist) {
        artists.add(artist);
    }

    // Find artist by name
    public Artist findArtistByName(String name) {
        for (Artist artist : artists) {
            if (artist.getName().equalsIgnoreCase(name)) {
                return artist;
            }
        }
        return null;  // If no artist found
    }

    // Print all artworks in the gallery
    public void displayAllArtworks() {
        for (Artist artist : artists) {
            for (Artwork artwork : artist.getArtworks()) {
                System.out.println(artwork);
            }
        }
    }
}
