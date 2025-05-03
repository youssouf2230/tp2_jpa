package net.youssouf.tp2.repository;

import net.youssouf.tp2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUser extends JpaRepository<User, String> {}
