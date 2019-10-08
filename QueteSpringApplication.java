package com.QueteSpring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class QueteSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(QueteSpringApplication.class, args);
    }

  @RequestMapping(value = "/doctor/{number}")
	@ResponseBody
	public doctor nameDoctor(@PathVariable int number){
		doctor d;
		if(number >= 1 && number <= 8){
			throw new ResponseStatusException(HttpStatus.SEE_OTHER, "See other");
		}
		switch (number)
		{

			case 9:
				d=new doctor("Christopher Eccleston",number);
				return d;
			case 10:
				d=new doctor("David Tennant",number);
				return d;

			case 11:
				d=new doctor("Matt Smith",number);
				return d;

			case 12:
			d=new doctor("Peter Capaldi" ,number);
				return d;

			case 13:
				d=new doctor("Jodie Whittaker" ,number);
				return d;


		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible to recover the incarnation  "+ number);

	}
    
}
