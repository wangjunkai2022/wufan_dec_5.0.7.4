package com.beizi.ad.internal.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import com.beizi.ad.NativeAdListener;
import com.beizi.ad.NativeAdResponse;
import com.beizi.ad.R;
import com.beizi.ad.internal.j;
import com.beizi.ad.internal.network.a;
import com.beizi.ad.internal.utilities.DeviceInfoUtil;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.ImageService;
import com.beizi.ad.internal.utilities.StringUtil;
import com.beizi.ad.internal.utilities.UserEnvInfoUtil;
/* compiled from: NativeAdRequestImpl.java */
/* loaded from: classes2.dex */
public class b extends com.beizi.ad.internal.network.a implements com.beizi.ad.internal.a {

    /* renamed from: a  reason: collision with root package name */
    public com.beizi.ad.internal.c f6021a;

    /* renamed from: c  reason: collision with root package name */
    private NativeAdListener f6022c;

    /* renamed from: d  reason: collision with root package name */
    private a f6023d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6024e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6025f;

    /* renamed from: g  reason: collision with root package name */
    private com.beizi.ad.internal.d f6026g;

    /* renamed from: h  reason: collision with root package name */
    private String f6027h;

    /* renamed from: i  reason: collision with root package name */
    private String f6028i;

    /* renamed from: j  reason: collision with root package name */
    private String f6029j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6030k = false;

    public b(Context context, String str, int i4) {
        this.f6026g = null;
        DeviceInfoUtil.retrieveDeviceInfo(context.getApplicationContext());
        UserEnvInfoUtil.retrieveUserEnvInfo(context.getApplicationContext());
        com.beizi.ad.internal.d dVar = new com.beizi.ad.internal.d(context, StringUtil.createRequestId());
        this.f6026g = dVar;
        dVar.a(str);
        this.f6026g.a(i4);
        this.f6026g.a(j.NATIVE);
        com.beizi.ad.internal.c cVar = new com.beizi.ad.internal.c(this);
        this.f6021a = cVar;
        cVar.a(-1);
        this.f6023d = new a();
    }

    public String d() {
        return this.f6027h;
    }

    public String e() {
        return this.f6028i;
    }

    public NativeAdListener f() {
        return this.f6022c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.beizi.ad.internal.d g() {
        return this.f6026g;
    }

    @Override // com.beizi.ad.internal.a
    public j getMediaType() {
        return this.f6026g.i();
    }

    public com.beizi.ad.internal.b h() {
        return this.f6023d;
    }

    public String i() {
        return this.f6029j;
    }

    @Override // com.beizi.ad.internal.a
    public boolean isReadyToStart() {
        return this.f6022c != null && this.f6026g.j();
    }

    public boolean b() {
        com.beizi.ad.internal.d dVar = this.f6026g;
        if (dVar != null) {
            return dVar.l();
        }
        return true;
    }

    public String c() {
        HaoboLog.d(HaoboLog.nativeLogTag, HaoboLog.getString(R.string.get_placement_id, this.f6026g.c()));
        return this.f6026g.c();
    }

    public void d(boolean z4) {
        this.f6025f = z4;
    }

    public boolean a() {
        HaoboLog.d(HaoboLog.nativeLogTag, HaoboLog.getString(R.string.get_opens_native_browser, this.f6026g.h()));
        return this.f6026g.h();
    }

    public void d(String str) {
        this.f6029j = str;
    }

    public void b(boolean z4) {
        com.beizi.ad.internal.d dVar = this.f6026g;
        if (dVar != null) {
            dVar.c(z4);
        }
    }

    public void b(String str) {
        this.f6027h = str;
    }

    public void c(String str) {
        this.f6028i = str;
    }

    public void a(boolean z4) {
        HaoboLog.d(HaoboLog.nativeLogTag, HaoboLog.getString(R.string.set_opens_native_browser, z4));
        this.f6026g.b(z4);
    }

    public void c(boolean z4) {
        this.f6024e = z4;
    }

    public void a(String str) {
        HaoboLog.d(HaoboLog.nativeLogTag, HaoboLog.getString(R.string.set_placement_id, str));
        this.f6026g.a(str);
    }

    public void a(NativeAdListener nativeAdListener) {
        this.f6022c = nativeAdListener;
    }

    public boolean a(a.C0179a c0179a) {
        if (this.f6022c == null) {
            HaoboLog.e(HaoboLog.nativeLogTag, "No mNativeAdListener installed for this request, won't load a new ad");
            return false;
        } else if (this.f6030k) {
            HaoboLog.e(HaoboLog.nativeLogTag, "Still loading last nativead ad , won't load a new ad");
            return false;
        } else if (this.f6026g.j()) {
            this.f6021a.a();
            this.f6021a.c();
            this.f6021a.b();
            this.f6030k = true;
            return true;
        } else {
            return false;
        }
    }

    /* compiled from: NativeAdRequestImpl.java */
    /* loaded from: classes2.dex */
    private class a implements com.beizi.ad.internal.b, ImageService.ImageServiceListener {

        /* renamed from: a  reason: collision with root package name */
        ImageService f6031a;

        /* renamed from: b  reason: collision with root package name */
        NativeAdResponse f6032b;

        private a() {
        }

        @Override // com.beizi.ad.internal.b
        public void a() {
        }

        @Override // com.beizi.ad.internal.b
        public void a(long j4) {
        }

        @Override // com.beizi.ad.internal.b
        public void a(com.beizi.ad.internal.network.b bVar) {
            if (!bVar.a().equals(j.NATIVE)) {
                a(0);
                return;
            }
            final NativeAdResponse d5 = bVar.d();
            if (d5 == null) {
                return;
            }
            b.this.b(bVar.f());
            b.this.c(bVar.g());
            b.this.d(d5.getLandingPageUrl());
            if (!b.this.f6024e && !b.this.f6025f) {
                if (b.this.f6022c != null) {
                    b.this.f6022c.onAdLoaded(d5);
                } else {
                    d5.destroy();
                }
                b.this.f6030k = false;
                return;
            }
            this.f6031a = new ImageService();
            this.f6032b = d5;
            if (b.this.f6024e) {
                this.f6031a.registerImageReceiver(new ImageService.ImageReceiver() { // from class: com.beizi.ad.internal.nativead.b.a.1
                    @Override // com.beizi.ad.internal.utilities.ImageService.ImageReceiver
                    public void onFail() {
                        String str = HaoboLog.httpRespLogTag;
                        HaoboLog.e(str, "Image downloading logFailed for url " + d5.getImageUrl());
                    }

                    @Override // com.beizi.ad.internal.utilities.ImageService.ImageReceiver
                    public void onReceiveImage(Bitmap bitmap) {
                        d5.setImage(bitmap);
                    }
                }, d5.getImageUrl());
            }
            if (b.this.f6025f) {
                this.f6031a.registerImageReceiver(new ImageService.ImageReceiver() { // from class: com.beizi.ad.internal.nativead.b.a.2
                    @Override // com.beizi.ad.internal.utilities.ImageService.ImageReceiver
                    public void onFail() {
                        String str = HaoboLog.httpRespLogTag;
                        HaoboLog.e(str, "Image downloading logFailed for url " + d5.getIconUrl());
                    }

                    @Override // com.beizi.ad.internal.utilities.ImageService.ImageReceiver
                    public void onReceiveImage(Bitmap bitmap) {
                        d5.setIcon(bitmap);
                    }
                }, d5.getIconUrl());
            }
            this.f6031a.registerNotification(this);
            this.f6031a.execute();
        }

        @Override // com.beizi.ad.internal.b
        public void a(String str) {
        }

        @Override // com.beizi.ad.internal.b
        public void a(String str, int i4) {
        }

        @Override // com.beizi.ad.internal.b
        public void a(String str, String str2) {
        }

        @Override // com.beizi.ad.internal.b
        public void b() {
        }

        @Override // com.beizi.ad.internal.b
        public void c() {
        }

        @Override // com.beizi.ad.internal.b
        public void d() {
        }

        @Override // com.beizi.ad.internal.b
        public void e() {
        }

        @Override // com.beizi.ad.internal.b
        public void f() {
        }

        @Override // com.beizi.ad.internal.utilities.ImageService.ImageServiceListener
        public void onAllImageDownloadsFinish() {
            if (b.this.f6022c != null) {
                b.this.f6022c.onAdLoaded(this.f6032b);
            } else {
                this.f6032b.destroy();
            }
            this.f6031a = null;
            this.f6032b = null;
            b.this.f6030k = false;
        }

        @Override // com.beizi.ad.internal.b
        public void a(int i4) {
            if (b.this.f6022c != null) {
                b.this.f6022c.onAdFailed(i4);
            }
            b.this.f6030k = false;
        }
    }
}
