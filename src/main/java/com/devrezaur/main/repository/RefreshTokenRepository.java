package com.devrezaur.main.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import com.devrezaur.main.model.RefreshToken;
import com.devrezaur.main.model.User;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

	Optional<RefreshToken> findByRefreshToken(String token);

	@Modifying
	int deleteByUser(User user);

}
