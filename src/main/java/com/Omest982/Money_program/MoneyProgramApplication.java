package com.Omest982.Money_program;

import com.Omest982.Money_program.model.User;
import com.Omest982.Money_program.model.Wallet;
import com.Omest982.Money_program.repository.UserRepository;
import com.Omest982.Money_program.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoneyProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyProgramApplication.class, args);
	}
}
