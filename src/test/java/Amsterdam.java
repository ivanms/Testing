import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.testng.Assert;

/**
 * Created by Ivan_Murillo on 7/30/2015.
 */
public class Amsterdam {
    @Test
    public void Test() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String URL = "http://api.openweathermap.org/data/2.5/weather?q=Amsterdam";
        try{
            HttpUriRequest request = new HttpGet(URL);
            HttpResponse httpRspns = HttpClientBuilder.create().build().execute(request);
            String currentResult = EntityUtils.toString(httpRspns.getEntity());
            System.out.println("currentResult: " + currentResult );
            Start_Weather currentWeatherLocation = mapper.readValue(currentResult, Start_Weather.class);
            System.out.println(currentWeatherLocation);
            if(!currentWeatherLocation.getName().equals("Amsterdam"))
                Assert.fail("The Location is wrong");
            if(currentWeatherLocation.getId() != 2759794)
                Assert.fail("The id is wrong");
        }
        catch (JsonParseException e) { e.printStackTrace();}
        catch (JsonMappingException e) { e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace();
        }
    }
}
