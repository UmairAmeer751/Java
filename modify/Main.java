public class Main {
    public static void main(String[] args) {
        // Create the gallery
        Gallery gallery = new Gallery();

        // Create artists
        Artisit umair = new Artisit("Umair", "Pakistani");
        Artisit hamza = new Artisit("hamza ", "Pakistani");

        // Add artists to the gallery
        gallery.addArtisit(umair);
        gallery.addArtisit(hamza);

        // Create artworks
        Artwork ameer = new Artwork("toyota", 2000, "indus toyota", umair);
        Artwork sagheer = new Artwork("honda", 1995, "honda manga ", hamza);

        // Display all artworks in the gallery
        gallery.displayAllArtworks();
    }
}
