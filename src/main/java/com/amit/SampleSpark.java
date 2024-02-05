package com.amit;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class SampleSpark {
	
	public static void main(String[] args) {
		
		SparkSession spark = SparkSession.builder().appName("My Appp").getOrCreate();
		
		Dataset<Row> df3 = spark.read().option("ignoreLeadingWhiteSpace", true).option("header", "true")
				.csv("/home/amit/Amit/DELETE_LATER/GRADE_DATA.csv");
		
		df3.show();
		
	}

}
