package com.demo.democalculator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

	@PostMapping("/calculate")
	public Response calculate(@RequestBody InputRequest request) {
		System.out.println(request.getFirst());
		int result = 0;
		switch (request.getOperation().toLowerCase()) {
		case "add":
			result = add(request.getFirst(), request.getSecond());
			break;
		case "sub":
			result = sub(request.getFirst(), request.getSecond());
			break;
		case "mul":
			result = mul(request.getFirst(), request.getSecond());
			break;
		case "div":
			result = div(request.getFirst(), request.getSecond());
			break;
		default:
			System.out.println("operation not found");
			break;
		}

		return new Response(result);
	}

	/**
	 * 
	 * @param first
	 * @param second
	 * @return method return addition of two numbers
	 */
	private int add(int first, int second) {
		return first + second;

	}

	/**
	 * 
	 * @param first
	 * @param second
	 * @return method return subtraction of two numbers
	 */
	private int sub(int first, int second) {
		return first - second;

	}

	/**
	 * 
	 * @param first
	 * @param second
	 * @return method return multiplication of two numbers
	 */
	private int mul(int first, int second) {
		return first * second;

	}

	/**
	 * 
	 * @param first
	 * @param second
	 * @return method return division of two numbers
	 */
	private int div(int first, int second) {
		return first / second;

	}
}
