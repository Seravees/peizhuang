package com.qqq.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tools {
	public static ArrayList<String> Reader(String filePath) {
		ArrayList<String> data = new ArrayList<String>();
		File file = new File(filePath);
		StringBuffer sb = new StringBuffer();
		String count = null;
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(
					new FileInputStream(file), "MS932"));
			while (true) {
				if ((count = bf.readLine()) != null) {
					data.add(count);
				} else {
					break;
				}
			}
			bf.close();

			// FileInputStream fis = new FileInputStream(file);
			// byte[] buf = new byte[1024];
			// int len = 0;
			// while ((len = fis.read(buf)) != -1) {
			// sb.append(new String(buf, 0, len, "MS932"));
			// }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;
	}
}
