package com.devrezaur.main.model;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "refresh_tokens")
@Component
public class RefreshToken {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "token_id")
	private long id;

	@OneToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User user;

	@Column(name = "ref_token", unique = true)
	private String refreshToken;

	@Column(name = "exp_date")
	private Instant expDate;

	public RefreshToken() {

	}

	public RefreshToken(long id, User user, String refreshToken, Instant expDate) {
		this.id = id;
		this.user = user;
		this.refreshToken = refreshToken;
		this.expDate = expDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public Instant getExpDate() {
		return expDate;
	}

	public void setExpDate(Instant expDate) {
		this.expDate = expDate;
	}

}
