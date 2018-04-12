package baolilai.baolilai.util.image;

import android.graphics.Bitmap;

import com.nostra13.universalimageloader.core.assist.LoadedFrom;
import com.nostra13.universalimageloader.core.display.BitmapDisplayer;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;

public class SimpleImageDisplayer implements BitmapDisplayer {

	private int targetWidth;

	public SimpleImageDisplayer(int targetWidth) {
		this.targetWidth = targetWidth;
	}
	@Override
	public void display(Bitmap bitmap, ImageAware imageAware,
                        LoadedFrom loadedFrom) {
		// TODO Auto-generated method stub
		if (bitmap != null) {
			bitmap =BitmapUtil.resizeImageByWidth(bitmap, targetWidth);
		}
		imageAware.setImageBitmap(bitmap);
	}

}
