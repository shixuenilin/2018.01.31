package com.neuedu.work;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Test {
	public static void main(String[] args) throws IOException {
		File from = new File("F:/asdf/abc.txt");
		File to = new File("F:/fdsa/abc.txt");
		InputStream is = new FileInputStream(from);
		byte[] b = new byte[(int) from.length()];
		is.read(b);
		is.close();
		OutputStream os = new FileOutputStream(to);
		os.write(b);
		os.close();
	}
}
