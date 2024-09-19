public class Artwork {
    private String title;
    private int year;
    private String medium;
    private Artist artist;  // The artist who created the artwork

    public Artwork(String title, int year, String medium, Artist artist) {
        this.title = title;
        this.year = year;
        this.medium = medium;
        this.artist = artist;
        artist.addArtwork(this); // Add this artwork to the artist's list
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    // Print artwork details
    public String toString() {
        return "Artwork: " + title + " (" + year + "), Medium: " + medium + ", Artist: " + artist.getName();
    }
}
