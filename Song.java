public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    //Détection de cycle avec l’algorithme du lièvre et de la tortue
    public boolean isInRepeatingPlaylist() {
        Song slow = this;   // pointeur lent
        Song fast = this;   // pointeur rapide

        while (fast != null && fast.nextSong != null) {
            slow = slow.nextSong;              // avance d’un pas
            fast = fast.nextSong.nextSong;     // avance de deux pas

            if (slow == fast) {
                return true; // cycle détecté
            }
        }
        return false; // pas de cycle
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isInRepeatingPlaylist()); // true
    }
}
