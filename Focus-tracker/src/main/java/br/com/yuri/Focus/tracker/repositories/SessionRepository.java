package br.com.yuri.Focus.tracker.repositories;

import br.com.yuri.Focus.tracker.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
