package baolilai.baolilai.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

import baolilai.baolilai.Pullable;


/**
 *可以下拉刷新的ScrollView
 */
public class PullableScrollView extends ScrollView implements Pullable
{

	public PullableScrollView(Context context)
	{
		super(context);
	}

	public PullableScrollView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
	}

	public PullableScrollView(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
	}

	@Override
	public boolean canPullDown()
	{
		if (getScrollY() == 0)
			return true;
		else
			return false;
	}


}
