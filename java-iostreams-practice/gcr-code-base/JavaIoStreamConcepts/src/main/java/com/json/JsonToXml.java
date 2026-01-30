package com.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXml {
	public static void main(String[] args) throws Exception {

		ObjectMapper jsonMapper = new ObjectMapper(); // JSON mapper
		XmlMapper xmlMapper = new XmlMapper(); // XML mapper

		String json = "{\"name\":\"Ansh\",\"age\":21,\"email\":\"arif@example.com\"}";

		JsonNode node = jsonMapper.readTree(json); // parse JSON
		String xml = xmlMapper.writeValueAsString(node); // convert to XML

		System.out.println(xml); // output
	}
}