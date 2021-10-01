package org.api;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class UpsideDown {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader file = new FileReader("E:\\ExcelFiles\\API\\src\\test\\resources\\name.json");
		JSONParser son = new JSONParser();
		Object parse = son.parse(file);
		JSONObject yy = (JSONObject) parse;
		Object place = yy.get("Location").toString();
				System.out.println(place);
	}

}
