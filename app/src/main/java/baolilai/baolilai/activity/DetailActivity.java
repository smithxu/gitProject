package baolilai.baolilai.activity;

import android.widget.TextView;



import java.util.List;

import baolilai.baolilai.R;
import baolilai.baolilai.net.networks.NetWorks;
import baolilai.baolilai.net.requestbean.BaseRequest4List;
import baolilai.baolilai.net.requestbean.MovieInfo;
import baolilai.baolilai.net.subscribers.ProgressSubscriber;
import baolilai.baolilai.net.subscribers.SubscriberOnNextListener;
import butterknife.BindView;
import butterknife.ButterKnife;


public class DetailActivity extends BaseActivity {
    @BindView(R.id.text)
    TextView textView;
    SubscriberOnNextListener lisenter=new SubscriberOnNextListener<List<MovieInfo>>() {
        @Override
        public void onNext(List<MovieInfo> o) {
            initView(o);
        }
    };
    private ProgressSubscriber subscriber;

    private void initView(List<MovieInfo> o) {
        if (o!=null && !o.isEmpty())
        textView.setText(o.toString());
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_detail;
    }

    @Override
    protected void afterView() {
        setTitle("网络请求");
        ButterKnife.bind(this);
        subscriber=new ProgressSubscriber<List<MovieInfo>>(lisenter,this,true,false);
        NetWorks.getInstance().inTheaters(subscriber,new BaseRequest4List());
    }

    @Override
    protected void onDestroy() {
        if (subscriber!=null)subscriber.unsubscribe();
        super.onDestroy();
    }
}
