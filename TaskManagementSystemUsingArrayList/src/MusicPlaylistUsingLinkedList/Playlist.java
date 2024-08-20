package MusicPlaylistUsingLinkedList;

import java.util.LinkedList;

public class Playlist {
    private LinkedList<Song> songs;

    public Playlist() {
        songs = new LinkedList<>();
    }

    public void addSong(String title) {
        songs.add(new Song(title));
    }

    public void removeSong(String title) {
        songs.removeIf(song -> song.getTitle().equals(title));
    }

    public void moveSong(int fromIndex, int toIndex) {
        if (fromIndex >= 0 && fromIndex < songs.size() && toIndex >= 0 && toIndex < songs.size()) {
            Song song = songs.remove(fromIndex);
            songs.add(toIndex, song);
        }
    }

    public void displayPlaylist() {
        for (int i = 0; i < songs.size(); i++) {
            System.out.println((i + 1) + ". " + songs.get(i));
        }
    }
}
