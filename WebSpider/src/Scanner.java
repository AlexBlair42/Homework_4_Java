import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Scanner {
	static Map<String, Boolean> Spider = new HashMap<String, Boolean>();
	
	public static void main (String[] args){
		try{
			String news = "https://news.google.com/news/";
			Spider.put(news, false);
			String n = next();
			while (n!= null)
			{
				URL url = new URL(news);
				BufferedReader rdr = new BufferedReader(new InputStreamReader(url.openStream()));
				String line;
				
				while((line = rdr.readLine())!= null){
					Pattern p = Pattern.compile("href=\"(http:.*?)\"");
					Matcher match = p.matcher(line);
					if(match.find()&&!Spider.containsKey(match.group(1))){
						Spider.put(match.group(1), false);
						System.out.printf("%s\n", match.group(1));
					}
				}
				n = next();
			}
			
			
		}catch (Exception ex)
		{
			System.out.printf("Error: %s", ex.getMessage());
		}
	}
	private static String next()
	{
		for(Map.Entry<String, Boolean> j: Spider.entrySet())
		{
			if(j.getValue()==false){
				Spider.put(j.getKey(), true);
				return j.getKey();
			}
		}
		return null;
	}
}
