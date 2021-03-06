package baolilai.baolilai.activity;

import android.support.v7.app.AppCompatActivity;

import baolilai.baolilai.R;
import baolilai.baolilai.pagers.ContentBasePager;


public class MyTabActivity extends BaseTabActivity{
    @Override
    public String[] getTitles() {
        setTitle("tab演示页面");
        return new String[]{"tab1","tab2"};
    }

    @Override
    public void getPager() {
        pagerlist.add(new TestPager(this));
        pagerlist.add(new TestPager(this));
    }

    class TestPager extends ContentBasePager {

        public TestPager(AppCompatActivity activity) {
            super(activity);
        }

        @Override
        public void initData() {

        }

        @Override
        public void outData() {

        }

        @Override
        public int getContentView() {
            return R.layout.activity_test;
        }
    }
}
