package baolilai.baolilai.activity;

import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

;import baolilai.baolilai.R;
import baolilai.baolilai.util.ToastUtil;


public class TestActivity extends BaseActivity{
    @Override
    protected int getContentView() {
        return R.layout.activity_test;
    }

    @Override
    protected void afterView() {
        setTitle("基本页");

        toolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_settings:
                        ToastUtil.ToastCenter("点击了设置");
                        break;
                    default:break;
                }
                return true;
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_base, menu);//加载menu文件到布局
        return true;
    }
}
