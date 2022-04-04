package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SongRepository {
	private List<Song> list = new ArrayList<Song>();

    public List<Song> getAllSongs() {
     return list;
    }

    public Song getSongById(Integer id) {
       // TODO
    }

    public void addSong(Song s) {
      // TODO
    }

    public void updateSong(Song s) {
      // TODO
    }

    public void removeSong(Song s) {
       // TODO
    }
}
