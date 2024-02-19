package arep2.taller2.Spark;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Spark {
    public static Map<String, Answer> cache = new HashMap<>();

    public static void get(String path, Route route){
        Request req = new Request();
        Answer ans = new Answer();
        String body = route.get(req,ans);
        ans.setBody(body);
        ans.setPath(path);
        cache.put(path,ans);
    }

    public static String post(String value, String key){
        Answer ans = new Answer();
        String body = "{"+key+":"+value+"}";
        ans.setBody(body);
        ans.setType("application/json");
        cache.put(key,ans);
        return ans.getResponse();
    }

    public static String setCache (String path){
        Answer ans = new Answer();
        String path2 = "src/main/resources/public"+path;
        byte[] content = new byte[0];
        try {
            Path file = Paths.get(path2);
            content = Files.readAllBytes(file);
            String type = (path2).split("\\.")[1];
            ans.setType("text/"+type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ans.setBody(new String(content));
        cache.put(path, ans);
        return ans.getResponse();
    }
}
