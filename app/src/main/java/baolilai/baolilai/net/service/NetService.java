package baolilai.baolilai.net.service;





import java.util.List;
import java.util.Map;

import baolilai.baolilai.net.requestbean.MovieInfo;
import baolilai.baolilai.net.resultbean.HttpResult;
import baolilai.baolilai.net.resultbean.UserInfoResult;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface NetService {

    @FormUrlEncoded
    @POST("in_theaters")
    Observable<HttpResult<List<MovieInfo>>> inTheaters(@FieldMap Map<String, Object> map);


    @FormUrlEncoded
    @POST("login")
    Observable<HttpResult<UserInfoResult>> postLogin(@Field("lgiName") String loginName, @Field("lgiPwd") String loginPwd);

}
