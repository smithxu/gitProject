package baolilai.baolilai.util.image;

import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.ImageView;

/**
 * 图片信息，用于放大缩小
 */
public class ImageInfo {

    // 内部图片在整个手机界面的位置
   public RectF mRect = new RectF();

    // 控件在窗口的位置
   public RectF mImgRect = new RectF();

   public RectF mWidgetRect = new RectF();

   public RectF mBaseRect = new RectF();

   public PointF mScreenCenter = new PointF();

   public  float mScale;

    public float mDegrees;

    public ImageView.ScaleType mScaleType;

    public ImageInfo(RectF rect, RectF img, RectF widget, RectF base, PointF screenCenter, float scale, float degrees, ImageView.ScaleType scaleType) {
        mRect.set(rect);
        mImgRect.set(img);
        mWidgetRect.set(widget);
        mScale = scale;
        mScaleType = scaleType;
        mDegrees = degrees;
        mBaseRect.set(base);
        mScreenCenter.set(screenCenter);
    }
}
