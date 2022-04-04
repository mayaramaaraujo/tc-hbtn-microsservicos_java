package com.example.demo;

@RestController
public class SongController {

   @Autowired
   private SongRepository songRepository;

   @GetMapping("/welcome")
   public String mensagemBoasVindas() {
       // TODO
   }

   @GetMapping(path = "/allSongs")
   public List<Song> getAllSongs() {
      // TODO
   }

   @GetMapping(path = "/findSong/{id}")
   public Song findSongById(@PathVariable Integer id) {
       // TODO
   }

   @PostMapping(path = "/addSong", consumes = "application/json", produces = "application/json")
   public Song addSong(@RequestBody Song song) {
        // TODO
   }

   @PutMapping(path = "/updateSong", consumes = "application/json", produces = "application/json")
   public Song updadeSong(@RequestBody Song song) {
        // TODO
   }

   @DeleteMapping(path = "/removeSong", consumes = "application/json", produces = "application/json")
   public void deleteSongById(@RequestBody Song song) {
        // TODO
   }
}