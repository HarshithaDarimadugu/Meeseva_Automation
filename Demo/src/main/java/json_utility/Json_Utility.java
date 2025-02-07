package json_utility;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 * This class provides the utility to read the data from JSON files
 * @author Vijay
 */
public class Json_Utility {

	
	 private JSONObject jsonObject;

	    // Constructor to load JSON data from the specified file
	    public Json_Utility(String filePath) {
	        JSONParser parser = new JSONParser();
	        try {
	            Object obj = parser.parse(new FileReader(filePath));
	            this.jsonObject = (JSONObject) obj;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    /**
	     * This method will read string data from json file
	     * @param key
	     * @return
	     * @author Vijay
	     */
	    public String jsonStringData(String key) {
	        return (String) jsonObject.get(key);
	    }
	    
	    /**
	     * This method will read numerical data from json file
	     * @param key
	     * @return
	     * @author Vijay
	     */
	    public long jsonNumericData(String key) {
	        return (long) jsonObject.get(key);
	    }
	    
//	    public static void main(String[] args) {
//			Read_Json json=new Read_Json("./src/test/resources/TMS_JSON_DATA/enquiry.json");
//			System.out.println(json.jsonStringData("name"));
//		}
}
