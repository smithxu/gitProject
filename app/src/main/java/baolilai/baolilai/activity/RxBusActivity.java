package baolilai.baolilai.activity;

import android.view.View;

import baolilai.baolilai.R;
import baolilai.baolilai.net.rx.RxBus;
import baolilai.baolilai.net.rx.RxCodeConstants;



public class RxBusActivity extends BaseActivity{
    @Override
    protected int getContentView() {
        return R.layout.rxbus_activity;
    }

    @Override
    protected void afterView() {

    }
    public void jump(View view){
        RxBus.getDefault().post(RxCodeConstants.JUMP_TYPE, "跳转到消息页");
        finish();
    }

}
