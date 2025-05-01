package com.beizi.fusion.work.nativead;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.beizi.fusion.R;
import com.beizi.fusion.g.av;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.nativ.MediaView;
import com.qq.e.ads.nativ.NativeADEventListener;
import com.qq.e.ads.nativ.NativeADMediaListener;
import com.qq.e.ads.nativ.NativeUnifiedADData;
import com.qq.e.ads.nativ.widget.NativeAdContainer;
import com.uc.crashsdk.export.LogType;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class GdtNativeCustomLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<View> f7778a;

    public GdtNativeCustomLayout(@NonNull Context context) {
        this(context, null);
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(R.layout.beizi_native_custom_view, this);
        this.f7778a = new ArrayList<>();
    }

    public void onBindData(NativeUnifiedADData nativeUnifiedADData, float f5, float f6, NativeADEventListener nativeADEventListener, NativeADMediaListener nativeADMediaListener, View.OnClickListener onClickListener) {
        if (nativeUnifiedADData == null) {
            setVisibility(8);
            return;
        }
        int a5 = av.a(getContext(), f5);
        int a6 = f6 > 0.0f ? av.a(getContext(), f6) : -2;
        NativeAdContainer nativeAdContainer = (NativeAdContainer) findViewById(R.id.beizi_root_container);
        nativeAdContainer.setLayoutParams(new FrameLayout.LayoutParams(a5, a6));
        int pictureWidth = ((nativeUnifiedADData.getPictureWidth() != 0 ? nativeUnifiedADData.getPictureWidth() : LogType.UNEXP_ANR) * a6) / (nativeUnifiedADData.getPictureHeight() != 0 ? nativeUnifiedADData.getPictureHeight() : 720);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.beizi_ad_cover_image_container);
        ImageView imageView = new ImageView(getContext());
        String imgUrl = nativeUnifiedADData.getImgUrl();
        if (!TextUtils.isEmpty(imgUrl)) {
            com.beizi.fusion.g.i.a(getContext()).a(imgUrl).a(imageView);
        }
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(pictureWidth, a6));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.beizi_right_view);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        int i4 = a5 - pictureWidth;
        layoutParams.width = i4;
        layoutParams.height = a6;
        linearLayout.setLayoutParams(layoutParams);
        ImageView imageView2 = (ImageView) findViewById(R.id.beizi_ad_logo);
        String iconUrl = nativeUnifiedADData.getIconUrl();
        if (!TextUtils.isEmpty(iconUrl)) {
            com.beizi.fusion.g.i.a(getContext()).a(iconUrl).a(imageView2);
        }
        TextView textView = (TextView) findViewById(R.id.beizi_ad_action);
        ((ImageView) findViewById(R.id.beizi_close)).setOnClickListener(onClickListener);
        this.f7778a.add(frameLayout);
        this.f7778a.add(linearLayout);
        this.f7778a.add(imageView2);
        this.f7778a.add(textView);
        nativeUnifiedADData.bindAdToView(getContext(), nativeAdContainer, null, this.f7778a);
        if (nativeUnifiedADData.getAdPatternType() == 2) {
            MediaView mediaView = (MediaView) findViewById(R.id.beizi_media_view);
            mediaView.setLayoutParams(new FrameLayout.LayoutParams(pictureWidth, a6));
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.width = i4;
            layoutParams2.height = a6;
            linearLayout.setLayoutParams(layoutParams2);
            VideoOption.Builder builder = new VideoOption.Builder();
            builder.setAutoPlayPolicy(1);
            builder.setAutoPlayMuted(true);
            builder.setDetailPageMuted(false);
            builder.setNeedCoverImage(true);
            builder.setNeedProgressBar(true);
            builder.setEnableDetailPage(true);
            builder.setEnableUserControl(false);
            nativeUnifiedADData.bindMediaView(mediaView, builder.build(), nativeADMediaListener);
            frameLayout.setVisibility(8);
            mediaView.setVisibility(0);
        }
        nativeUnifiedADData.setNativeAdEventListener(nativeADEventListener);
        a(textView, nativeUnifiedADData);
    }

    public GdtNativeCustomLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GdtNativeCustomLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a();
    }

    private void a(TextView textView, NativeUnifiedADData nativeUnifiedADData) {
        if (nativeUnifiedADData == null) {
            textView.setText("浏览");
        } else if (!nativeUnifiedADData.isAppAd()) {
            textView.setText("浏览");
        } else {
            int appStatus = nativeUnifiedADData.getAppStatus();
            if (appStatus == 0) {
                textView.setText("下载");
            } else if (appStatus == 1) {
                textView.setText("启动");
            } else if (appStatus == 2) {
                textView.setText("更新");
            } else if (appStatus == 4) {
                textView.setText(nativeUnifiedADData.getProgress() + "%");
            } else if (appStatus == 8) {
                textView.setText("安装");
            } else if (appStatus != 16) {
                textView.setText("浏览");
            } else {
                textView.setText("下载失败，重新下载");
            }
        }
    }
}
