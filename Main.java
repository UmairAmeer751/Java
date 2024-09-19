public class Main {
    public static void main(String[] args) {
        // Create the gallery
        Gallery gallery = new Gallery();

        // Create artists
        Artist umair = new Artist("Umair", "Pakistani");
        Artist hamza = new Artist("hamza ", "Pakistani");

        // Add artists to the gallery
        gallery.addArtist(umair);
        gallery.addArtist(hamza);

        // Create artworks
        Artwork ameer = new Artwork("toyota", 2000, "indus toyota", umair);
        Artwork sagheer = new Artwork("honda", 1995, "honda manga ", hamza);

        // Display all artworks in the gallery
        gallery.displayAllArtworks();
    }
}
