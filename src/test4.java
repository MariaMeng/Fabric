import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
public class test4 {
    public static void main(String[] args) throws ClientProtocolException, IOException {
        HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet("https://api.github.com/users/repos");
        HttpResponse response = client.execute(request);
        BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
        String line = "";
        ArrayList<String> name = new ArrayList<>();
        while ((line = rd.readLine()) != null) {
            System.out.println(line);

            String[] data = line.split("\"" + "name" + "\"" + ":" + "\"");

            for (int i = 1; i < data.length; i++) {
                String[] s = data[i].split("\"" + "," + "\"");
                    name.add(s[0]);
            }
        }

        System.out.println(name);

    }
}