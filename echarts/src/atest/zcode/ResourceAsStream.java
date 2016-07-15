package atest.zcode;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ResourceAsStream {

	/**
	 * 
	 * @author ZhaoYongEn.zhaoye@strongit.com.cn 2016-6-28 下午5:49:43
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			System.out.println(ResourceAsStream.class);
			System.out.println(ResourceAsStream.class.getClassLoader().getResource("/template"));
			System.out.println(ResourceAsStream.class.getResource("/template"));
			System.out.println();
			
			List<String> lines = new ArrayList<String>();
			InputStream is = ResourceAsStream.class.getResourceAsStream("/template");
			
			
			InputStreamReader iReader = new InputStreamReader(is, "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(iReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				if (line.contains("##option##")) {
					
                    //line = line.replace("##option##", optionStr);
                }
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
