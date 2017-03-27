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
            jsonArray.put("https://www.google.com/imgres?imgurl=https%3A%2F%2Fstatic.pexels.com%2Fphotos%2F15239%2Fflower-roses-red-roses-bloom.jpg&imgrefurl=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Froses%2F&docid=Y8URAoSnvdNKsM&tbnid=GIygWYOeyU_zBM%3A&vet=10ahUKEwjGpbDatPfSAhVn5YMKHU7VAeYQMwhiKAAwAA..i&w=5168&h=4000&bih=759&biw=1536&q=roses&ved=0ahUKEwjGpbDatPfSAhVn5YMKHU7VAeYQMwhiKAAwAA&iact=mrc&uact=8#h=4000&imgrc=GIygWYOeyU_zBM:&vet=10ahUKEwjGpbDatPfSAhVn5YMKHU7VAeYQMwhiKAAwAA..i&w=5168");
            jsonArray.put("https://www.google.com/imgres?imgurl=https%3A%2F%2Fstatic.pexels.com%2Fphotos%2F15239%2Fflower-roses-red-roses-bloom.jpg&imgrefurl=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Froses%2F&docid=Y8URAoSnvdNKsM&tbnid=GIygWYOeyU_zBM%3A&vet=10ahUKEwjGpbDatPfSAhVn5YMKHU7VAeYQMwhiKAAwAA..i&w=5168&h=4000&bih=759&biw=1536&q=roses&ved=0ahUKEwjGpbDatPfSAhVn5YMKHU7VAeYQMwhiKAAwAA&iact=mrc&uact=8#h=4000&imgdii=h2OqQDyh2eLJYM:&imgrc=GIygWYOeyU_zBM:&vet=10ahUKEwjGpbDatPfSAhVn5YMKHU7VAeYQMwhiKAAwAA..i&w=5168");
            jsonArray.put("https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjl_snptPfSAhVB6YMKHTIcA5cQjRwIBw&url=https%3A%2F%2Forchidflowers.wordpress.com%2Fcategory%2Froses%2F&psig=AFQjCNHk2WF8XsRKb2R2bvpicMkTxN69IQ&ust=1490729078084556");
            jsonArray.put("https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwiUkvDxtPfSAhWm14MKHbPRDAYQjRwIBw&url=http%3A%2F%2Fwww.wiroses.com%2F&psig=AFQjCNHk2WF8XsRKb2R2bvpicMkTxN69IQ&ust=1490729078084556");
            jsonArray.put("https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwj29cr6tPfSAhWh7IMKHaStDtoQjRwIBw&url=https%3A%2F%2Fpixabay.com%2Fen%2Fphotos%2Froses%2F&psig=AFQjCNHk2WF8XsRKb2R2bvpicMkTxN69IQ&ust=1490729078084556");
            jsonArray.put("https://s-media-cache-ak0.pinimg.com/originals/00/1e/3c/001e3ca5a2e822f450395b9270d2a1e2.jpg");
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
            jsonArray.put("https://www.google.com/imgres?imgurl=http%3A%2F%2Fpngimg.com%2Fuploads%2Ftulip%2Ftulip_PNG9020.png&imgrefurl=http%3A%2F%2Fpngimg.com%2Fimg%2Fflowers%2Ftulip&docid=iPQskcVdVRo1IM&tbnid=XCTUNunGe7QbYM%3A&vet=10ahUKEwisnqyRtffSAhUM9YMKHdk2BVoQMwiDASgCMAI..i&w=2078&h=3521&bih=759&biw=1536&q=tulip&ved=0ahUKEwisnqyRtffSAhUM9YMKHdk2BVoQMwiDASgCMAI&iact=mrc&uact=8");
            jsonArray.put("https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwimhcKYtffSAhUq0oMKHWR0B_0QjRwIBw&url=http%3A%2F%2Funisci24.com%2F353259.html&bvm=bv.150729734,d.amc&psig=AFQjCNGP46omHg29JgmLmcSSUJGgr9HfOQ&ust=1490729193335872");
            jsonArray.put("https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjyptWitffSAhUC5oMKHVQNCn0QjRwIBw&url=http%3A%2F%2Fsymbolism.wikia.com%2Fwiki%2FTulip&bvm=bv.150729734,d.amc&psig=AFQjCNGP46omHg29JgmLmcSSUJGgr9HfOQ&ust=1490729193335872");
            jsonArray.put("https://www.google.com/imgres?imgurl=https%3A%2F%2Fs-media-cache-ak0.pinimg.com%2F736x%2F1a%2Fb1%2F4e%2F1ab14e60736b9d834cbadaed5edf97b8.jpg&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2Fexplore%2Ftulip%2F&docid=zPkQAAK1_Z4i0M&tbnid=N924PApEo7wnGM%3A&vet=10ahUKEwisnqyRtffSAhUM9YMKHdk2BVoQMwi0ASgqMCo..i&w=387&h=571&bih=759&biw=1536&q=tulip&ved=0ahUKEwisnqyRtffSAhUM9YMKHdk2BVoQMwi0ASgqMCo&iact=mrc&uact=8");
            jsonArray.put("https://www.google.com/imgres?imgurl=http%3A%2F%2Fwww.dutchgrown.com%2Fmedia%2Fcatalog%2Fproduct%2Fcache%2F1%2Fimage%2F9df78eab33525d08d6e5fb8d27136e95%2Ft%2Fu%2Ftulip-happy-generation8.jpg&imgrefurl=http%3A%2F%2Fwww.dutchgrown.com%2Ftulip-happy-generation.html&docid=YaM5aKSU4L4d4M&tbnid=wwNQ-ft1ib7gMM%3A&vet=10ahUKEwisnqyRtffSAhUM9YMKHdk2BVoQMwjDASg5MDk..i&w=400&h=500&bih=759&biw=1536&q=tulip&ved=0ahUKEwisnqyRtffSAhUM9YMKHdk2BVoQMwjDASg5MDk&iact=mrc&uact=8");
            jsonArray.put("https://www.google.com/imgres?imgurl=http%3A%2F%2Fwww.1023jackfm.com%2Fwp-content%2Fuploads%2Fsites%2F5%2F2016%2F05%2Ftulip-39-happy-generation-39-beautiful-looks-like-a-skewed-canadian-flag-with-the-red-maple-leaf-on-white-color-flowers-plants-beautiful-flowers-pretty-flowers-gardens-tulips-flowers.jpg&imgrefurl=http%3A%2F%2Fwww.1023jackfm.com%2F2016%2F05%2F18%2Fwow-check-tulip%2F&docid=pPeb_Prxpp1iZM&tbnid=ED1NfQwm0-qDjM%3A&vet=10ahUKEwisnqyRtffSAhUM9YMKHdk2BVoQMwjYAShOME4..i&w=736&h=888&bih=759&biw=1536&q=tulip&ved=0ahUKEwisnqyRtffSAhUM9YMKHdk2BVoQMwjYAShOME4&iact=mrc&uact=8");
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
            jsonArray.put("https://cargocollective.com/suit5/lily");
            jsonArray.put("https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwi6veTFtffSAhVJ7oMKHYh7DpgQjRwIBw&url=http%3A%2F%2Fwww.americanmeadows.com%2Fflower-bulbs%2Flily-flower-bulbs&bvm=bv.150729734,d.amc&psig=AFQjCNEnX7tylp_7l04qokMrYvObLbxveQ&ust=1490729289338269");
            jsonArray.put("https://www.google.com/imgres?imgurl=http%3A%2F%2Fwww.botanus.com%2Fproduct_images%2Fi%2F528%2F87014__01711_zoom.jpg&imgrefurl=https%3A%2F%2Fsites.google.com%2Fsite%2Flilysarethebomb%2Fhome%2Flily&docid=Gpz5QHs6kecIAM&tbnid=YOFhYaB-5MNEPM%3A&vet=10ahUKEwjxwY2_tffSAhVMyoMKHVX-D6EQMwhUKBEwEQ..i&w=630&h=630&bih=759&biw=1536&q=lily&ved=0ahUKEwjxwY2_tffSAhVMyoMKHVX-D6EQMwhUKBEwEQ&iact=mrc&uact=8");
            jsonArray.put("https://www.google.com/imgres?imgurl=http%3A%2F%2Fmedia.americanmeadows.com%2Fmedia%2Fcatalog%2Fproduct%2Fcache%2F1%2Fimage%2F500x%2F2664a1c26d20ff89f08769f165108d16%2Fo%2Fr%2Foriental-lily-magny-course_1.jpg&imgrefurl=http%3A%2F%2Fwww.americanmeadows.com%2Fflower-bulbs%2Flily-flower-bulbs&docid=XhhV2axXRhXggM&tbnid=QwL8HBnfoUYGhM%3A&vet=10ahUKEwjxwY2_tffSAhVMyoMKHVX-D6EQMwhiKBYwFg..i&w=500&h=500&bih=759&biw=1536&q=lily&ved=0ahUKEwjxwY2_tffSAhVMyoMKHVX-D6EQMwhiKBYwFg&iact=mrc&uact=8");
            jsonArray.put("https://www.google.com/imgres?imgurl=https%3A%2F%2Fs-media-cache-ak0.pinimg.com%2Foriginals%2Fb7%2Ffc%2F3b%2Fb7fc3b041e69fb15a44d1df2d45d0e56.jpg&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2Ftessamae78%2Fmy-favorite-flower-lily%2F&docid=NnH8DaqCNbxUQM&tbnid=MOMhzeWOfaWIBM%3A&vet=10ahUKEwjxwY2_tffSAhVMyoMKHVX-D6EQMwhpKB0wHQ..i&w=800&h=594&bih=759&biw=1536&q=lily&ved=0ahUKEwjxwY2_tffSAhVMyoMKHVX-D6EQMwhpKB0wHQ&iact=mrc&uact=8");
            jsonArray.put("https://www.google.com/imgres?imgurl=http%3A%2F%2Fwww.petmd.com%2Fsites%2Fdefault%2Ffiles%2Flily-poisoning-cats-2.jpg&imgrefurl=http%3A%2F%2Fwww.petmd.com%2Fcat%2Femergency%2Fpoisoning-toxicity%2Fe_ct_lily_poisoning&docid=z1R3oXnAXeOd1M&tbnid=KAgD4ljN5aGXhM%3A&vet=10ahUKEwjxwY2_tffSAhVMyoMKHVX-D6EQMwhyKCYwJg..i&w=473&h=355&bih=759&biw=1536&q=lily&ved=0ahUKEwjxwY2_tffSAhVMyoMKHVX-D6EQMwhyKCYwJg&iact=mrc&uact=8");
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
            jsonArray.put("https://www.google.com/imgres?imgurl=http%3A%2F%2Fpad1.whstatic.com%2Fimages%2F9%2F9b%2FOrchid_dendrobium_989.jpg&imgrefurl=http%3A%2F%2Fwww.wikihow.com%2FCare-for-Orchids&docid=TnirRXiSjE0Q4M&tbnid=CdX7ETw5EEXfuM%3A&vet=10ahUKEwi4iM_ptffSAhWh24MKHV7rArAQMwjAASgBMAE..i&w=400&h=290&bih=759&biw=1536&q=orchid&ved=0ahUKEwi4iM_ptffSAhWh24MKHV7rArAQMwjAASgBMAE&iact=mrc&uact=8");
            jsonArray.put("https://www.google.com/imgres?imgurl=https%3A%2F%2Fs-media-cache-ak0.pinimg.com%2F736x%2Fa0%2Fd5%2F29%2Fa0d529fdfe67a8905e57d8c4967b0758.jpg&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2Fexplore%2Forchids%2F&docid=9nHxs1NQ5JixCM&tbnid=76rRkyNQYQV9bM%3A&vet=10ahUKEwi4iM_ptffSAhWh24MKHV7rArAQMwjDASgEMAQ..i&w=736&h=736&bih=759&biw=1536&q=orchid&ved=0ahUKEwi4iM_ptffSAhWh24MKHV7rArAQMwjDASgEMAQ&iact=mrc&uact=8");
            jsonArray.put("https://www.google.com/imgres?imgurl=http%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fcommons%2F3%2F30%2FOrchid_Phalaenopsis_hybrid.jpg&imgrefurl=https%3A%2F%2Fpeople.ucsc.edu%2F~gherna19%2F&docid=LsOMs6dWXn1aWM&tbnid=TcKLFuLl0bT0hM%3A&vet=10ahUKEwi4iM_ptffSAhWh24MKHV7rArAQMwjFASgGMAY..i&w=3409&h=2234&bih=759&biw=1536&q=orchid&ved=0ahUKEwi4iM_ptffSAhWh24MKHV7rArAQMwjFASgGMAY&iact=mrc&uact=8");
            jsonArray.put("https://www.google.com/imgres?imgurl=http%3A%2F%2Fwww.fragrantorchids.com%2Fimfaces%2Forchid1.jpg&imgrefurl=http%3A%2F%2Fwww.fragrantorchids.com%2Forchids-faces.php&docid=BXjE9inl2kUzLM&tbnid=BQahQcgqMPVdmM%3A&vet=10ahUKEwi4iM_ptffSAhWh24MKHV7rArAQMwjGASgHMAc..i&w=868&h=694&bih=759&biw=1536&q=orchid&ved=0ahUKEwi4iM_ptffSAhWh24MKHV7rArAQMwjGASgHMAc&iact=mrc&uact=8https://www.google.com/imgres?imgurl=https%3A%2F%2Fhelonational.com%2Fwp-content%2Fuploads%2F2016%2F04%2Forchid-the-national-flower-of-venezuela.jpg&imgrefurl=https%3A%2F%2Fhelonational.com%2Forchid-national-flower-of-venezuela%2F&docid=9yne6RlknVas8M&tbnid=0EnzJ2p24_ur4M%3A&vet=10ahUKEwi4iM_ptffSAhWh24MKHV7rArAQMwjmASgdMB0..i&w=2721&h=2000&bih=759&biw=1536&q=orchid&ved=0ahUKEwi4iM_ptffSAhWh24MKHV7rArAQMwjmASgdMB0&iact=mrc&uact=8");
            jsonArray.put("https://www.google.com/imgres?imgurl=http%3A%2F%2Fwww.westerlayorchids.com%2Fwp-content%2Fuploads%2F2013%2F03%2FSaphhire-orchid2-BBP3649.jpg&imgrefurl=http%3A%2F%2Fwww.westerlayorchids.com%2Four-products%2Fgemstones%2F&docid=omt_3NbKiqCA3M&tbnid=OCt6M3yCFaIqOM%3A&vet=10ahUKEwi4iM_ptffSAhWh24MKHV7rArAQMwjnASgeMB4..i&w=1600&h=800&bih=759&biw=1536&q=orchid&ved=0ahUKEwi4iM_ptffSAhWh24MKHV7rArAQMwjnASgeMB4&iact=mrc&uact=8https://www.google.com/imgres?imgurl=http%3A%2F%2Fwww.naturallivingideas.com%2Fwp-content%2Fuploads%2F2016%2F03%2FSlipper-Orchids-Paphiopedilum.jpg&imgrefurl=http%3A%2F%2Fwww.naturallivingideas.com%2Fthe-total-guide-to-growing-beautiful-orchids%2F&docid=ng0ofv6jNP99LM&tbnid=DqoxDzVS_DT3wM%3A&vet=10ahUKEwi4iM_ptffSAhWh24MKHV7rArAQMwjqASghMCE..i&w=728&h=483&bih=759&biw=1536&q=orchid&ved=0ahUKEwi4iM_ptffSAhWh24MKHV7rArAQMwjqASghMCE&iact=mrc&uact=8");
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
