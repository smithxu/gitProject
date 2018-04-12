package baolilai.baolilai.pagers.slide;

import android.support.v7.app.AppCompatActivity;


import baolilai.baolilai.R;
import baolilai.baolilai.pagers.ContentBasePager;
import butterknife.ButterKnife;


public class FirstPager extends ContentBasePager {

	public FirstPager(AppCompatActivity activity) {
		super(activity);
		ButterKnife.bind(this, mRootView);
		initView();
	}

	@Override
	public void initData() {
		//ToastUtil.ToastCenter(mActivity,"进入FisrtPager");
	}

	@Override
	public void outData() {
		//ToastUtil.ToastCenter(mActivity,"离开FisrtPager");
	}

	@Override
	public int getContentView() {
		return R.layout.pager_first;
	}

	private void initView() {

	}
}
