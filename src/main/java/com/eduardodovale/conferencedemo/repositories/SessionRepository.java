package com.eduardodovale.conferencedemo.repositories;

import com.eduardodovale.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository <Session, Long> {

}
