package com.book.utility;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BookConstant {

	public static final List<String> bookCatalog = Arrays.asList("Clean Code", "Clean Coder", "Clean Architecture",
			"Test Driven Development", "Working effectively with Legacy Code");
	public static final Integer a1=1000;
	public static final double basePrice = 50.0;

	public static final String Basket_Empty = "Book Basket is empty, Please add some books";

	public static final String Response_Message = "Total price for the given list of books";

	public static final int Group_Five = 5;

	public static final int Group_Four = 4;
	public static final int Group_One = 1;
	public static final int Group_Two = 2;

	public static final double finalPrice = 0.0;
	public static final int Group_Three = 3;

	public static final int Group_Increment_One = 1;
	public static final int Group_Increment_Two = 2;

	public static final double discount_TwoDifferentBooks = 0.95;
	public static final double discount_ThreeDifferentBooks = 0.90;
	public static final double discount_FourDifferentBooks = 0.80;
	public static final double discount_FiveDifferentBooks = 0.75;

}


