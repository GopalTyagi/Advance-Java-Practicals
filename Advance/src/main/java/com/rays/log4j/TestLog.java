package com.rays.log4j;

import org.apache.log4j.Logger;

public class TestLog {
	public static void main(String[] args) {

		Logger log = Logger.getLogger(TestLog.class);
		log.debug("This is Debug Statement");
		log.info("This is Info Statement");
		log.warn("This is Warn Statement");
		log.error("This is Error Statement");
		log.fatal("This is Fatal Statement");

		int i = 0;
		try {
			int x = 5 / i;
			System.out.println(x);
		} catch (RuntimeException e) {
			System.out.println(e);
			log.error("My Error", e);
		}
	}

}
