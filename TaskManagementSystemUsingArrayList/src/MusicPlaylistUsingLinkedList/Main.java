package MusicPlaylistUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Song A");
        playlist.addSong("Song B");
        playlist.displayPlaylist();

        playlist.removeSong("Song A");
        playlist.displayPlaylist();

        playlist.addSong("Song C");
        playlist.addSong("Song D");
        playlist.moveSong(1, 0);
        playlist.displayPlaylist();
    }
}
