package com.developersdelicias.util.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class FileUtils {

	public static String getResourceAsString(String resourceFile) throws IOException {
		InputStream stream = FileUtils.class.getResourceAsStream(resourceFile);
		
		if (stream == null) {
			throw new FileNotFoundException(String.format("%s file does not exists.", resourceFile));
		}
		return inputStreamToString(stream);
	}

	private static String inputStreamToString(InputStream inputStream) throws IOException {
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		try {
			br = readLines(inputStream, sb);
		} finally {
			closeFile(br);
		}

		return sb.toString();
	}

	private static void closeFile(BufferedReader br) throws IOException {
		br.close();
	}

	private static BufferedReader readLines(InputStream inputStream, StringBuilder sb) throws IOException {
		BufferedReader br;
		String line;
		br = new BufferedReader(new InputStreamReader(inputStream));
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		return br;
	}
}
