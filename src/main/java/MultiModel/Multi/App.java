package MultiModel.Multi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import com.etao.hbase.oddiff.RandomGenerateNid;



/**
 * Hello world!
 *
 */
public class App 
{
	public static String generate(int key,int region,int length)
	{
		String rowkey = String.format("%010d:%d", (int) (key % region), key);
		String first = rowkey.split(":")[0];
		if (first.length() ==length)
			return rowkey;
		if (first.length() > length){
			String a = rowkey.split(":")[0].substring(first.length()-length, first.length());
			return a.concat(":").concat(rowkey.split(":")[1]);
		}
		if (first.length() < length){
			for(int i=0;i<length-first.length();i++)
				first = "0".concat(first);
			//String a = ""rowkey.split(":")[0].substring(first.length()-length, first.length());
			return first.concat(":").concat(rowkey.split(":")[1]);
		}
		
		return rowkey;
	}
    public static void main( String[] args )
    {
    		//String aa="1233445674444444444678899";
    		//System.out.println(aa.substring(5));
    	String aa = "9.59|元/500g|5392114";
    	System.out.println("stdmeasure:9.59|元/500g|5392114".substring("stdmeasure:".length()));
    	for (String key :aa.split("\\|")){
    			System.out.println("key:"+key);
    	}
    	System.out.println(aa.indexOf(' '));
    	
    	String assist_img = "1\004i1/125478964/T2I9kWXXVaXXXXXXXX_!!125478964.jpg\0031\004i2/125478964/T2M.EYXdNXXXXXXXXX_!!125478964.jpg";
		String[] img_info = assist_img.split("\003");
		String[] img_urls = new String[10];
		for (int i = 0; i < img_info.length; ++i) {
			System.out.println("img_info:"+img_info[i]);
			if (img_info[i].isEmpty())
				continue;
			String[] img = img_info[i].split("\004");
			if (img.length != 2)
				continue;
			int pos = Integer.valueOf(img[0]);
			System.out.println("pos:"+pos);
			if (pos < 1 || pos >= 10)
				continue;
			String url = img[1];
			if (url.indexOf(' ') != -1)
				continue;
			img_urls[pos] = url;
			HashSet filter_cat_set = new HashSet();
			filter_cat_set.add("35");
			if (pos == 1) {
				//assist_image逻辑: 指定类目的宝贝,将1号小图输出
				String categoryp = "35 0";
				if (!categoryp.isEmpty()) {
					String[] cats = categoryp.split(" ");
					System.out.println("cats:"+cats);
					boolean flag = false;
					for (String cat : cats) {
						System.out.println("cat:"+cat);
						if (filter_cat_set.contains(cat)) {
							flag = true;
							break;
						}
					}
					if (flag){
					String assist_image = url;
					System.out.println("assist_image:"+assist_image);}
				}
			}
		}
    	
    	
    	

    }
}
