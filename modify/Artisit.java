import java.util.ArrayList;
import java.util.List;

public class Artisit {
    private String name;
    private String nationality;
    private List<Artwork> artworks; // Missing field

    // Constructor
    public Artisit(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
        this.artworks = new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<Artwork> getArtworks() {
        return artworks;
    }

    // Add artwork to the artist's collection
    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    // Print artist details
    @Override
    public String toString() {
        return "Artist: " + name + " (" + nationality + ")";
    }
}
