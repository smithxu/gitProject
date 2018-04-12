package baolilai.baolilai.net.requestbean;



import java.util.List;

import baolilai.baolilai.net.resultbean.ImagesBean;
import baolilai.baolilai.net.resultbean.PersonBean;
import baolilai.baolilai.net.resultbean.RatingBean;


public class MovieInfo {

    public RatingBean rating;
    public String title;
    public int collect_count;
    public String original_title;
    public String subtype;
    public String year;
    public ImagesBean images;
    public String alt;
    public String id;
    public List<String> genres;
    public List<PersonBean> casts;
    public List<PersonBean> directors;

    public MovieInfo() {
    }

}
