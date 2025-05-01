package com.aggmoread.sdk.b;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.aggmoread.sdk.client.AMAdMediaListener;
import com.aggmoread.sdk.client.AMAdMediaView;
import com.aggmoread.sdk.client.AMAppInfo;
import com.aggmoread.sdk.client.AMError;
import com.aggmoread.sdk.client.feedlist.AMNativeAd;
import com.aggmoread.sdk.client.feedlist.AMNativeInteractionListener;
import com.aggmoread.sdk.z.c.a.a.c.c;
import com.aggmoread.sdk.z.c.a.a.c.o.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class k extends c implements AMNativeAd {

    /* renamed from: b  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.o.e f1975b;

    /* loaded from: classes2.dex */
    class a implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AMNativeInteractionListener f1976a;

        a(k kVar, AMNativeInteractionListener aMNativeInteractionListener) {
            this.f1976a = aMNativeInteractionListener;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.f
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            this.f1976a.onAdError(new AMError(dVar.a(), dVar.b()));
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.e.b
        public void onADStatusChanged(int i4) {
            this.f1976a.onADStatusChanged(i4);
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.e.a
        public void onAdClicked() {
            this.f1976a.onAdClicked();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.e.a
        public void onAdExposed() {
            this.f1976a.onAdExposed();
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.o.e.b
        public void onLoadApkProgress(int i4) {
            this.f1976a.onLoadApkProgress(i4);
        }
    }

    /* loaded from: classes2.dex */
    class b implements com.aggmoread.sdk.z.c.a.a.c.t.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AMAdMediaListener f1977a;

        b(k kVar, AMAdMediaListener aMAdMediaListener) {
            this.f1977a = aMAdMediaListener;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.t.a
        public void a(com.aggmoread.sdk.z.c.a.a.c.d dVar) {
            AMAdMediaListener aMAdMediaListener = this.f1977a;
            if (aMAdMediaListener != null) {
                aMAdMediaListener.onVideoError(new AMError(dVar.a(), dVar.b()));
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.t.a
        public void onVideoClicked() {
            AMAdMediaListener aMAdMediaListener = this.f1977a;
            if (aMAdMediaListener != null) {
                aMAdMediaListener.onVideoClicked();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.t.a
        public void onVideoCompleted() {
            AMAdMediaListener aMAdMediaListener = this.f1977a;
            if (aMAdMediaListener != null) {
                aMAdMediaListener.onVideoCompleted();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.t.a
        public void onVideoInit() {
            AMAdMediaListener aMAdMediaListener = this.f1977a;
            if (aMAdMediaListener != null) {
                aMAdMediaListener.onVideoInit();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.t.a
        public void onVideoLoaded(int i4) {
            AMAdMediaListener aMAdMediaListener = this.f1977a;
            if (aMAdMediaListener != null) {
                aMAdMediaListener.onVideoLoaded(i4);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.t.a
        public void onVideoLoading() {
            AMAdMediaListener aMAdMediaListener = this.f1977a;
            if (aMAdMediaListener != null) {
                aMAdMediaListener.onVideoLoading();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.t.a
        public void onVideoPause() {
            AMAdMediaListener aMAdMediaListener = this.f1977a;
            if (aMAdMediaListener != null) {
                aMAdMediaListener.onVideoPause();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.t.a
        public void onVideoReady() {
            AMAdMediaListener aMAdMediaListener = this.f1977a;
            if (aMAdMediaListener != null) {
                aMAdMediaListener.onVideoReady();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.t.a
        public void onVideoResume() {
            AMAdMediaListener aMAdMediaListener = this.f1977a;
            if (aMAdMediaListener != null) {
                aMAdMediaListener.onVideoResume();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.t.a
        public void onVideoStart() {
            AMAdMediaListener aMAdMediaListener = this.f1977a;
            if (aMAdMediaListener != null) {
                aMAdMediaListener.onVideoStart();
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.c.t.a
        public void onVideoStop() {
            AMAdMediaListener aMAdMediaListener = this.f1977a;
            if (aMAdMediaListener != null) {
                aMAdMediaListener.onVideoStop();
            }
        }
    }

    public k(com.aggmoread.sdk.z.c.a.a.c.o.e eVar, d dVar) {
        super(eVar, dVar);
        this.f1975b = eVar;
    }

    @Override // com.aggmoread.sdk.b.c
    protected Map<String, Object> a() {
        return this.f1975b.h();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public View bindAdToView(@NonNull Context context, @NonNull View view, FrameLayout.LayoutParams layoutParams, List<View> list, View view2, @NonNull AMNativeInteractionListener aMNativeInteractionListener) {
        return this.f1975b.a(context, view, layoutParams, list, view2, new a(this, aMNativeInteractionListener));
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public void bindMediaAdToView(@NonNull AMAdMediaView aMAdMediaView, AMAdMediaListener aMAdMediaListener) {
        this.f1975b.a(aMAdMediaView, new b(this, aMAdMediaListener));
    }

    @Override // com.aggmoread.sdk.client.AMAdInterface
    public void destroy() {
        this.f1975b.destroy();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public int getAdPatternType() {
        switch (this.f1975b.getAdPatternType()) {
            case 1:
            case 3:
            case 6:
                return 3;
            case 2:
                return 2;
            case 4:
            case 5:
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public AMAppInfo getAppInfo() {
        if (this.f1975b.g() != null) {
            com.aggmoread.sdk.z.c.a.a.c.c g4 = this.f1975b.g();
            ArrayList arrayList = new ArrayList();
            if (g4.g() != null && g4.g().size() > 0) {
                for (int i4 = 0; i4 < g4.g().size(); i4++) {
                    c.a aVar = g4.g().get(i4);
                    arrayList.add(new AMAppInfo.Permission(aVar.f2745a, aVar.f2746b));
                }
            }
            return new AMAppInfo(g4.a(), g4.b(), g4.e(), g4.h(), arrayList, g4.i(), g4.k(), g4.f(), g4.c(), g4.d(), g4.j());
        }
        return null;
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public double getAppPrice() {
        return this.f1975b.getAppPrice();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public int getAppScore() {
        return this.f1975b.getAppScore();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public int getAppStatus() {
        return this.f1975b.getAppStatus();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public String getDesc() {
        return this.f1975b.getDesc();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public long getDownloadCount() {
        return this.f1975b.getDownloadCount();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public String getIconUrl() {
        return this.f1975b.getIconUrl();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public String getImageUrl() {
        return this.f1975b.getImageUrl();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public List<String> getImageUrlList() {
        return this.f1975b.getImageUrlList();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public int getPictureHeight() {
        return this.f1975b.getPictureHeight();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public int getPictureWidth() {
        return this.f1975b.getPictureWidth();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public int getProgress() {
        return this.f1975b.getProgress();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public String getTitle() {
        return this.f1975b.getTitle();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public int getVideoCurrentPosition() {
        return this.f1975b.getVideoCurrentPosition();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public int getVideoDuration() {
        return this.f1975b.f();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public boolean isAppAd() {
        return this.f1975b.isAppAd();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public boolean isVideoAd() {
        return this.f1975b.isVideoAd();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public void pauseVideo() {
        this.f1975b.pauseVideo();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public void resume() {
        this.f1975b.resume();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public void resumeVideo() {
        this.f1975b.resumeVideo();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public void setVideoMute(boolean z4) {
        this.f1975b.setVideoMute(z4);
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public void startVideo() {
        this.f1975b.startVideo();
    }

    @Override // com.aggmoread.sdk.client.feedlist.AMNativeAd
    public void stopVideo() {
        this.f1975b.stopVideo();
    }
}
