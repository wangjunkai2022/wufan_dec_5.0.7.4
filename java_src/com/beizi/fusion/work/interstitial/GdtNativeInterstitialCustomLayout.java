package com.beizi.fusion.work.interstitial;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.beizi.fusion.R;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.i;
import com.beizi.fusion.model.AdSpacesBean;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.nativ.MediaView;
import com.qq.e.ads.nativ.NativeADEventListener;
import com.qq.e.ads.nativ.NativeADMediaListener;
import com.qq.e.ads.nativ.NativeUnifiedADData;
import com.qq.e.ads.nativ.widget.NativeAdContainer;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class GdtNativeInterstitialCustomLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<View> f7691a;

    /* renamed from: b  reason: collision with root package name */
    private a f7692b;

    /* loaded from: classes2.dex */
    public interface a {
        void a_();

        void b();
    }

    public GdtNativeInterstitialCustomLayout(@NonNull Context context) {
        this(context, null);
    }

    public boolean onBindData(NativeUnifiedADData nativeUnifiedADData, float f5, float f6, AdSpacesBean.RenderViewBean renderViewBean, NativeADEventListener nativeADEventListener, NativeADMediaListener nativeADMediaListener, View.OnClickListener onClickListener) {
        if (nativeUnifiedADData == null) {
            setVisibility(8);
            return false;
        }
        int a5 = av.a(getContext(), f5);
        int a6 = f6 > 0.0f ? av.a(getContext(), f6) : -2;
        af.c("BeiZis", "interstitial getPictureWidth = " + nativeUnifiedADData.getPictureWidth() + ",getPictureHeight = " + nativeUnifiedADData.getPictureHeight());
        int pictureWidth = nativeUnifiedADData.getPictureWidth();
        int pictureHeight = nativeUnifiedADData.getPictureHeight();
        if (pictureWidth != 0 && pictureHeight != 0) {
            float f7 = pictureHeight / pictureWidth;
            if (f7 >= 0.375f && f7 <= 2.667f) {
                a6 = Math.round(f7 * a5);
            } else {
                af.c("BeiZis", "interstitial aspectRatio = " + f7 + " not proper , return fail ! ");
                return false;
            }
        }
        af.c("BeiZis", "interstitial adWidth = " + a5 + ",adHeight = " + a6);
        NativeAdContainer nativeAdContainer = (NativeAdContainer) findViewById(R.id.beizi_root_container);
        nativeAdContainer.setLayoutParams(new FrameLayout.LayoutParams(a5, a6));
        af.c("BeiZis", "interstitial imageWidth = " + pictureWidth + ",imageHeight = " + pictureHeight);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.beizi_ad_cover_image_container);
        ImageView imageView = new ImageView(getContext());
        String imgUrl = nativeUnifiedADData.getImgUrl();
        if (!TextUtils.isEmpty(imgUrl)) {
            i.a(getContext()).a(imgUrl).a(imageView);
        }
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(a5, a6));
        ImageView imageView2 = (ImageView) findViewById(R.id.beizi_close);
        imageView2.setOnClickListener(onClickListener);
        a(imageView2, renderViewBean, a5, a6);
        this.f7691a.add(frameLayout);
        nativeUnifiedADData.bindAdToView(getContext(), nativeAdContainer, null, this.f7691a);
        if (nativeUnifiedADData.getAdPatternType() == 2) {
            MediaView mediaView = (MediaView) findViewById(R.id.beizi_media_view);
            mediaView.setLayoutParams(new FrameLayout.LayoutParams(a5, a6));
            VideoOption.Builder builder = new VideoOption.Builder();
            builder.setAutoPlayPolicy(1);
            builder.setAutoPlayMuted(true);
            builder.setDetailPageMuted(true);
            builder.setNeedCoverImage(true);
            builder.setNeedProgressBar(true);
            builder.setEnableDetailPage(true);
            builder.setEnableUserControl(false);
            nativeUnifiedADData.bindMediaView(mediaView, builder.build(), nativeADMediaListener);
            frameLayout.setVisibility(8);
            mediaView.setVisibility(0);
        }
        nativeUnifiedADData.setNativeAdEventListener(nativeADEventListener);
        return true;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        a aVar;
        af.c("BeiZis", "interstitial visibility = " + i4);
        if (i4 == 0 && (aVar = this.f7692b) != null) {
            aVar.a_();
        }
        super.onWindowVisibilityChanged(i4);
    }

    public void setViewInteractionListener(a aVar) {
        this.f7692b = aVar;
    }

    public GdtNativeInterstitialCustomLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(R.layout.gdt_native_interstitial_custom_view, this);
        this.f7691a = new ArrayList<>();
    }

    public GdtNativeInterstitialCustomLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a();
    }

    private void a(View view, AdSpacesBean.RenderViewBean renderViewBean, int i4, int i5) {
        int a5;
        if (renderViewBean == null) {
            return;
        }
        int[] a6 = a(renderViewBean, i4, i5);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.fusion.work.interstitial.GdtNativeInterstitialCustomLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                GdtNativeInterstitialCustomLayout.this.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.interstitial.GdtNativeInterstitialCustomLayout.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (GdtNativeInterstitialCustomLayout.this.f7692b != null) {
                            GdtNativeInterstitialCustomLayout.this.f7692b.b();
                        }
                    }
                }, 500L);
            }
        });
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            String location = renderViewBean.getLocation();
            location.hashCode();
            char c5 = 65535;
            switch (location.hashCode()) {
                case -1568638786:
                    if (location.equals("rightdown")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1106589470:
                    if (location.equals("leftup")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 1200601527:
                    if (location.equals("rightup")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 1718905129:
                    if (location.equals("leftdown")) {
                        c5 = 3;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    layoutParams2.gravity = 85;
                    layoutParams2.rightMargin = a6[0];
                    layoutParams2.bottomMargin = a6[1];
                    break;
                case 1:
                    layoutParams2.gravity = 51;
                    layoutParams2.leftMargin = a6[0];
                    layoutParams2.topMargin = a6[1];
                    break;
                case 2:
                    layoutParams2.gravity = 53;
                    layoutParams2.rightMargin = a6[0];
                    layoutParams2.topMargin = a6[1];
                    break;
                case 3:
                    layoutParams2.gravity = 83;
                    layoutParams2.leftMargin = a6[0];
                    layoutParams2.bottomMargin = a6[1];
                    break;
            }
            String size = renderViewBean.getSize();
            if (size != null) {
                if (size.endsWith("%")) {
                    a5 = (i4 * Integer.parseInt(size.substring(0, size.indexOf("%")))) / 100;
                } else {
                    a5 = av.a(getContext(), Integer.parseInt(size));
                }
                layoutParams2.width = a5;
                layoutParams2.height = a5;
            }
            af.c("BeiZis", "interstitial params = " + layoutParams2);
        }
    }

    private int[] a(AdSpacesBean.RenderViewBean renderViewBean, int i4, int i5) {
        String borderWidth = renderViewBean.getBorderWidth();
        String borderHeight = renderViewBean.getBorderHeight();
        int[] iArr = new int[2];
        if (borderWidth.endsWith("%")) {
            iArr[0] = (i4 * Integer.parseInt(borderWidth.substring(0, borderWidth.indexOf("%")))) / 100;
        } else {
            iArr[0] = av.a(getContext(), Integer.parseInt(borderWidth));
        }
        if (borderHeight.endsWith("%")) {
            iArr[1] = (i5 * Integer.parseInt(borderHeight.substring(0, borderHeight.indexOf("%")))) / 100;
        } else {
            iArr[1] = av.a(getContext(), Integer.parseInt(borderHeight));
        }
        return iArr;
    }
}
