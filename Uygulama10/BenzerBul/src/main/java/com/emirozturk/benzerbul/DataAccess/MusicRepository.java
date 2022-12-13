package com.emirozturk.benzerbul.DataAccess;

import com.emirozturk.benzerbul.Model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music,Integer> {
}
