package com.example.cokathon.user.dto.request;

public record LoginRequest(
	String email,
	String password
) {
}
