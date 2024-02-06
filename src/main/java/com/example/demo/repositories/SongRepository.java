package com.example.demo.repositories;
import com.example.demo.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Integer>
{
public Song findByName(String name);
}
