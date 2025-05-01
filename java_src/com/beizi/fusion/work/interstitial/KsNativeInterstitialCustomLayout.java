package com.beizi.fusion.work.interstitial;

import android.app.Activity;
import android.content.Context;
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
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsImage;
import com.kwad.sdk.api.KsNativeAd;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class KsNativeInterstitialCustomLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    Context f7695a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<View> f7696b;

    /* renamed from: c  reason: collision with root package name */
    private a f7697c;

    /* loaded from: classes2.dex */
    public interface a {
        void b();

        void b_();
    }

    public KsNativeInterstitialCustomLayout(@NonNull Context context) {
        this(context, null);
    }

    public boolean onBindData(KsNativeAd ksNativeAd, float f5, float f6, AdSpacesBean.RenderViewBean renderViewBean, KsNativeAd.AdInteractionListener adInteractionListener, KsNativeAd.VideoPlayListener videoPlayListener, View.OnClickListener onClickListener) {
        if (ksNativeAd == null) {
            setVisibility(8);
            return false;
        }
        int a5 = av.a(getContext(), f5);
        int a6 = f6 > 0.0f ? av.a(getContext(), f6) : -2;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.beizi_media_view);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.beizi_ad_cover_image_container);
        int materialType = ksNativeAd.getMaterialType();
        if (materialType == 1) {
            int videoWidth = ksNativeAd.getVideoWidth();
            int videoHeight = ksNativeAd.getVideoHeight();
            af.c("BeiZis", "interstitial videoWidth = " + videoWidth + ",videoHeight = " + videoHeight);
            if (videoWidth != 0 && videoHeight != 0) {
                a6 = Math.round((videoHeight / videoWidth) * a5);
            }
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(a5, a6));
            frameLayout2.setVisibility(8);
            frameLayout.setVisibility(0);
            ksNativeAd.setVideoPlayListener(videoPlayListener);
            View videoView = ksNativeAd.getVideoView(getContext(), new KsAdVideoPlayConfig.Builder().videoSoundEnable(false).dataFlowAutoStart(false).build());
            if (videoView != null && videoView.getParent() == null) {
                frameLayout.removeAllViews();
                frameLayout.addView(videoView);
            }
        } else if (materialType != 2 && materialType != 3) {
            return false;
        } else {
            if (ksNativeAd.getImageList() != null && !ksNativeAd.getImageList().isEmpty()) {
                af.c("BeiZis", "interstitial imageList size = " + ksNativeAd.getImageList().size());
                KsImage ksImage = ksNativeAd.getImageList().get(0);
                if (ksImage != null && ksImage.isValid()) {
                    int width = ksImage.getWidth();
                    int height = ksImage.getHeight();
                    af.c("BeiZis", "interstitial imageWidth = " + width + ",imageHeight = " + height);
                    if (width != 0 && height != 0) {
                        float f7 = height / width;
                        if (f7 >= 0.375f && f7 <= 2.667f) {
                            a6 = Math.round(f7 * a5);
                        } else {
                            af.c("BeiZis", "interstitial aspectRatio = " + f7 + " not proper , return fail ! ");
                            return false;
                        }
                    }
                    frameLayout2.setVisibility(0);
                    frameLayout.setVisibility(8);
                    ImageView imageView = new ImageView(getContext());
                    i.a(getContext()).a(ksImage.getImageUrl()).a(imageView);
                    frameLayout2.addView(imageView, new FrameLayout.LayoutParams(a5, a6));
                }
            }
        }
        af.c("BeiZis", "interstitial adWidth = " + a5 + ",adHeight = " + a6);
        ((FrameLayout) findViewById(R.id.beizi_root_container)).setLayoutParams(new FrameLayout.LayoutParams(a5, a6));
        ImageView imageView2 = (ImageView) findViewById(R.id.beizi_close);
        imageView2.setOnClickListener(onClickListener);
        a(imageView2, renderViewBean, a5, a6);
        this.f7696b.add(frameLayout2);
        af.c("BeiZis", "interstitial mContext instanceof Activity ? " + (this.f7695a instanceof Activity));
        Context context = this.f7695a;
        if (context instanceof Activity) {
            ksNativeAd.registerViewForInteraction((Activity) context, this, this.f7696b, adInteractionListener);
        }
        return true;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        a aVar;
        af.c("BeiZis", "interstitial visibility = " + i4);
        if (i4 == 0 && (aVar = this.f7697c) != null) {
            aVar.b_();
        }
        super.onWindowVisibilityChanged(i4);
    }

    public void setViewInteractionListener(a aVar) {
        this.f7697c = aVar;
    }

    public KsNativeInterstitialCustomLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        Context context = getContext();
        this.f7695a = context;
        LayoutInflater.from(context).inflate(R.layout.ks_native_interstitial_custom_view, this);
        this.f7696b = new ArrayList<>();
    }

    public KsNativeInterstitialCustomLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i4) {
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
        view.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.fusion.work.interstitial.KsNativeInterstitialCustomLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                KsNativeInterstitialCustomLayout.this.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.interstitial.KsNativeInterstitialCustomLayout.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (KsNativeInterstitialCustomLayout.this.f7697c != null) {
                            KsNativeInterstitialCustomLayout.this.f7697c.b();
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
