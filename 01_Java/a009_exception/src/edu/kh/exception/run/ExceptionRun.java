package edu.kh.exception.run;

import java.io.IOException;

import edu.kh.exception.service.ExceptionService;
import edu.kh.exception.user.exception.ScoreInputException;

public class ExceptionRun {

	public static void main(String[] args) throws IOException, ScoreInputException {

		ExceptionService service = new ExceptionService();
		
		service.startEx5();
	}

}
