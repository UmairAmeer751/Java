import java.util.ArrayList;
import java.util.List;

public class Gallery {
    private List<Artisit> artists;

    public Gallery() {
        this.artists = new ArrayList<>();
    }

    // Add artist to the gallery
    public void addArtisit(Artisit artist) {
        artists.add(artist);
    }

    // Find artist by name
    public Artisit findArtistByName(String name) {
        for (Artisit artist : artists) {
            if (artist.getName().equalsIgnoreCase(name)) {
                return artist;
            }
        }
        return null;  // If no artist found
    }

    // Print all artworks in the gallery
    public void displayAllArtworks() {
        for (Artisit artisit : artists) {
            for (Artwork artwork : artisit.getArtworks()) {
                System.out.println(artwork);
            }
        }
    }
}
