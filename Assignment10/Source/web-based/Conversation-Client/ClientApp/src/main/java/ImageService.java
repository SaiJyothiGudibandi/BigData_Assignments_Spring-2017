import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Naga on 13-03-2017.
 */
@WebServlet(name = "ImageService", urlPatterns = "/ImageService")
public class ImageService extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder buffer = new StringBuilder();
        BufferedReader reader = req.getReader();
        String response="";
        String line;
        while ((line = reader.readLine()) != null) {
            buffer.append(line);
        }
        String data = buffer.toString();
        System.out.println(data);
        String output = "";
        JSONObject params = new JSONObject(data);
        JSONObject result = params.getJSONObject("result");
        JSONObject parameters = result.getJSONObject("parameters");
        if (parameters.get("flowers").toString().equals("flowers")) {
            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            jsonArray.put("http://www.dgreetings.com/fragrance-flowers/images/a-rose-flower.jpg");
            jsonArray.put("https://img.clipartfest.com/20303c3f0f4519b6a1f475396f7d246e_field-tulip-flower-tulip-picture-of-tulip-flower_1440-900.jpeg");
            jsonArray.put("https://s-media-cache-ak0.pinimg.com/originals/2f/20/c6/2f20c62db0c2464cb92e1d2669405769.jpg");
            jsonArray.put("https://putneyfarm.files.wordpress.com/2012/09/orc6.jpg");
            jsonArray.put("https://static.pexels.com/photos/36764/marguerite-daisy-beautiful-beauty.jpg");
            jsonArray.put("http://wallpaper-gallery.net/images/picture-flower/picture-flower-8.jpg");
            jsonObject.put("data", jsonArray);
            output = jsonObject.toString();
            Data data_ob = Data.getInstance();
            data_ob.setData(output);
            data_ob.setFlag(true);
            JSONObject js = new JSONObject();
            js.put("speech", "flowers are displayed");
            js.put("displayText", "flowers are displayed");
            js.put("source", "image database");
            response = js.toString();
        }
        else if (parameters.get("animals").toString().equals("rose")) {
            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            jsonArray.put("");
            jsonArray.put("");
            jsonArray.put("");
            jsonArray.put("");
            jsonArray.put("");
            jsonArray.put("");
            jsonObject.put("data", jsonArray);
            output = jsonObject.toString();
            Data data_ob = Data.getInstance();
            data_ob.setData(output);
            data_ob.setFlag(true);
            JSONObject js = new JSONObject();
            js.put("speech", "roses are displayed");
            js.put("displayText", "roses are displayed");
            js.put("source", "image database");
            response = js.toString();
        }
        else if (parameters.get("animals").toString().equals("tulip")){
            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            jsonArray.put("");
            jsonArray.put("");
            jsonArray.put("");
            jsonArray.put("");
            jsonArray.put("");
            jsonArray.put("");
            jsonObject.put("data", jsonArray);
            output = jsonObject.toString();
            Data data_ob = Data.getInstance();
            data_ob.setData(output);
            data_ob.setFlag(true);
            JSONObject js = new JSONObject();
            js.put("speech", "tulip are displayed");
            js.put("displayText", "tulip are displayed");
            js.put("source", "image database");
            response = js.toString();
        }
        else if (parameters.get("animals").toString().equals("lily")){
            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            jsonArray.put("");
            jsonArray.put("");
            jsonArray.put("");
            jsonArray.put("");
            jsonArray.put("");
            jsonArray.put("");
            jsonObject.put("data", jsonArray);
            output = jsonObject.toString();
            Data data_ob = Data.getInstance();
            data_ob.setData(output);
            data_ob.setFlag(true);
            JSONObject js = new JSONObject();
            js.put("speech", "lilys are displayed");
            js.put("displayText", "lilys are displayed");
            js.put("source", "image database");
            response = js.toString();
        }
        else if (parameters.get("animals").toString().equals("orchid")){
            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            jsonArray.put("");
            jsonArray.put("");
            jsonArray.put("");
            jsonArray.put("");
            jsonArray.put("");
            jsonArray.put("");
            jsonObject.put("data", jsonArray);
            output = jsonObject.toString();
            Data data_ob = Data.getInstance();
            data_ob.setData(output);
            data_ob.setFlag(true);
            JSONObject js = new JSONObject();
            js.put("speech", "orchids are displayed");
            js.put("displayText", "orchids are displayed");
            js.put("source", "image database");
            response = js.toString();
        }
        else if (parameters.get("null").toString().equals("clear")){
            Data data_ob = Data.getInstance();
            JSONObject js1 = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            jsonArray.put(" ");
            js1.put("data", jsonArray);
            data_ob.setData(js1.toString());
            data_ob.setFlag(true);
            JSONObject js = new JSONObject();
            js.put("speech", "screen is cleared");
            js.put("displayText", "screen is cleared");
            js.put("source", "image database");
            response = js.toString();
        }
        resp.setHeader("Content-type", "application/json");
        resp.getWriter().write(response);
    }
}
