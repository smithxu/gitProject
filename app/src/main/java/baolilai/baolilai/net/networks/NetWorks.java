package baolilai.baolilai.net.networks;



import java.util.List;

import baolilai.baolilai.net.requestbean.BaseRequest4List;
import baolilai.baolilai.net.requestbean.MovieInfo;
import baolilai.baolilai.net.resultbean.HttpResult;
import baolilai.baolilai.net.resultbean.UserInfoResult;
import baolilai.baolilai.net.subscribers.ProgressSubscriber;
import baolilai.baolilai.net.utils.RetrofitUtils;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;


public class NetWorks extends RetrofitUtils {
    private NetWorks() {
        super();
    }

    public void inTheaters(Subscriber<List<MovieInfo>> subscriber, BaseRequest4List requset) {
        Observable observable = service.inTheaters(requset.toMap()).map(new HttpResultFunc<List<MovieInfo>>());
        setSubscribe(observable, subscriber);
    }

    /**
     * 登录
     * @param subscriber
     * @param loginName
     * @param loginPwd
     */
    public void postLogin(ProgressSubscriber<UserInfoResult> subscriber, String loginName, String loginPwd) {
        Observable observable = service.postLogin(loginName,loginPwd).map(new HttpResultFunc<UserInfoResult>());
        setSubscribe(observable, subscriber);
    }
    /**
     * 用来统一处理Http的resultCode,并将HttpResult的Data部分剥离出来返回给subscriber
  */
    private class HttpResultFunc<T> implements Func1<HttpResult<T>, T> {

        @Override
        public T call(HttpResult<T> httpResult) {
            return httpResult.getSubjects();
        }
    }


    //在访问HttpMethods时创建单例
    private static class SingletonHolder {
        private static final NetWorks INSTANCE = new NetWorks();
    }

    //获取单例
    public static NetWorks getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
