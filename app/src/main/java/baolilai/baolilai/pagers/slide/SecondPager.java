package baolilai.baolilai.pagers.slide;

import android.support.v7.app.AppCompatActivity;


import baolilai.baolilai.R;
import baolilai.baolilai.pagers.ContentBasePager;
import butterknife.ButterKnife;


public class SecondPager extends ContentBasePager {

	public SecondPager(AppCompatActivity activity) {
		super(activity);
		ButterKnife.bind(this, mRootView);
		initView();
	}

	@Override
	public void initData() {
		//ToastUtil.ToastCenter(mActivity,"进入SecondPager");
	}

	@Override
	public void outData() {
		//ToastUtil.ToastCenter(mActivity,"离开SecondPager");
	}

	@Override
	public int getContentView() {
		return R.layout.pager_second;
	}
	private void initView() {

	}

}
