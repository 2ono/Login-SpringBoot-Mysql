package com.login.service;

import com.login.model.User;
import com.login.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);
}
