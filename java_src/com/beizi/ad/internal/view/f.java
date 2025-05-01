package com.beizi.ad.internal.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.beizi.ad.AdActivity;
import com.beizi.ad.R;
import com.beizi.ad.internal.j;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.Hex;
import com.beizi.ad.internal.utilities.StringUtil;
import com.beizi.ad.internal.utilities.ViewUtil;
import com.beizi.ad.internal.utilities.W3CEvent;
import com.beizi.ad.internal.view.AdWebView;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.umeng.analytics.pro.bm;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: MRAIDImplementation.java */
@SuppressLint({"InlinedApi"})
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    protected static final String[] f6375a = {"default", "expanded"};

    /* renamed from: b  reason: collision with root package name */
    protected final AdWebView f6376b;

    /* renamed from: e  reason: collision with root package name */
    int f6379e;

    /* renamed from: f  reason: collision with root package name */
    int f6380f;

    /* renamed from: g  reason: collision with root package name */
    int f6381g;

    /* renamed from: j  reason: collision with root package name */
    boolean f6384j;

    /* renamed from: l  reason: collision with root package name */
    private int f6386l;

    /* renamed from: m  reason: collision with root package name */
    private int f6387m;

    /* renamed from: n  reason: collision with root package name */
    private Activity f6388n;

    /* renamed from: o  reason: collision with root package name */
    private ViewGroup f6389o;

    /* renamed from: q  reason: collision with root package name */
    private int f6391q;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6385k = false;

    /* renamed from: c  reason: collision with root package name */
    boolean f6377c = false;

    /* renamed from: d  reason: collision with root package name */
    boolean f6378d = false;

    /* renamed from: h  reason: collision with root package name */
    boolean f6382h = false;

    /* renamed from: i  reason: collision with root package name */
    boolean f6383i = false;

    /* renamed from: p  reason: collision with root package name */
    private int[] f6390p = new int[4];

    /* renamed from: r  reason: collision with root package name */
    private boolean f6392r = false;

    /* renamed from: s  reason: collision with root package name */
    private g f6393s = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MRAIDImplementation.java */
    /* renamed from: com.beizi.ad.internal.view.f$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6400a;

        static {
            int[] iArr = new int[AdActivity.b.values().length];
            f6400a = iArr;
            try {
                iArr[AdActivity.b.landscape.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6400a[AdActivity.b.portrait.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6400a[AdActivity.b.none.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: MRAIDImplementation.java */
    /* loaded from: classes2.dex */
    public enum a {
        top_left,
        top_right,
        center,
        bottom_left,
        bottom_right,
        top_center,
        bottom_center
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: MRAIDImplementation.java */
    /* loaded from: classes2.dex */
    public enum b {
        STARTING_DEFAULT,
        STARTING_EXPANDED
    }

    public f(AdWebView adWebView) {
        this.f6376b = adWebView;
    }

    private void c(ArrayList<Pair<String, String>> arrayList) {
        Iterator<Pair<String, String>> it2 = arrayList.iterator();
        String str = null;
        while (it2.hasNext()) {
            Pair<String, String> next = it2.next();
            if (((String) next.first).equals("uri")) {
                str = Uri.decode((String) next.second);
            }
        }
        if (StringUtil.isEmpty(str)) {
            return;
        }
        this.f6376b.b(str);
        this.f6376b.c();
    }

    private void d(ArrayList<Pair<String, String>> arrayList) {
        Iterator<Pair<String, String>> it2 = arrayList.iterator();
        String str = null;
        while (it2.hasNext()) {
            Pair<String, String> next = it2.next();
            if (((String) next.first).equals("uri")) {
                str = (String) next.second;
            }
        }
        if (str == null) {
            HaoboLog.d(HaoboLog.mraidLogTag, HaoboLog.getString(R.string.store_picture_error));
            return;
        }
        final String decode = Uri.decode(str);
        AlertDialog.Builder builder = new AlertDialog.Builder(ViewUtil.getTopContext(this.f6376b));
        builder.setTitle(R.string.store_picture_title);
        builder.setMessage(R.string.store_picture_message);
        builder.setPositiveButton(R.string.store_picture_accept, new DialogInterface.OnClickListener() { // from class: com.beizi.ad.internal.view.f.2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v49 */
            @Override // android.content.DialogInterface.OnClickListener
            @SuppressLint({"NewApi"})
            public void onClick(DialogInterface dialogInterface, int i4) {
                String str2;
                String string;
                FileOutputStream fileOutputStream;
                int i5;
                byte[] decode2;
                try {
                    if (decode.startsWith("data:")) {
                        String str3 = ".png";
                        if (decode.contains("image/gif")) {
                            str3 = ".gif";
                        } else {
                            if (!decode.contains("image/jpeg") && !decode.contains("image/pjpeg")) {
                                if (!decode.contains("image/png")) {
                                    if (decode.contains("image/tiff")) {
                                        str3 = ".tif";
                                    } else if (decode.contains("image/svg+xml")) {
                                        str3 = ".svg";
                                    }
                                }
                            }
                            str3 = ".jpg";
                        }
                        boolean contains = decode.contains(HttpHeaders.Values.BASE64);
                        File b5 = com.beizi.ad.lance.a.h.b(f.this.f6376b.getContext());
                        File file = new File(b5, System.currentTimeMillis() + str3);
                        FileOutputStream fileOutputStream2 = 0;
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(file);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (FileNotFoundException unused) {
                        } catch (IOException unused2) {
                        } catch (IllegalArgumentException unused3) {
                        }
                        try {
                            boolean canWrite = file.canWrite();
                            int i6 = canWrite;
                            if (canWrite) {
                                if (!contains) {
                                    String str4 = decode;
                                    int lastIndexOf = str4.lastIndexOf(",") + 1;
                                    decode2 = Hex.hexStringToByteArray(str4.substring(lastIndexOf, decode.length()));
                                    i5 = lastIndexOf;
                                } else {
                                    String str5 = decode;
                                    i5 = false;
                                    decode2 = Base64.decode(str5.substring(str5.lastIndexOf(",") + 1, decode.length()), 0);
                                }
                                fileOutputStream.write(decode2);
                                i6 = i5;
                            }
                            try {
                                fileOutputStream.close();
                                fileOutputStream2 = i6;
                            } catch (IOException unused4) {
                                str2 = HaoboLog.mraidLogTag;
                                string = HaoboLog.getString(R.string.store_picture_error);
                                HaoboLog.d(str2, string);
                                f.this.f6376b.c();
                            }
                        } catch (FileNotFoundException unused5) {
                            fileOutputStream2 = fileOutputStream;
                            HaoboLog.d(HaoboLog.mraidLogTag, HaoboLog.getString(R.string.store_picture_error));
                            fileOutputStream2 = fileOutputStream2;
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                    fileOutputStream2 = fileOutputStream2;
                                } catch (IOException unused6) {
                                    str2 = HaoboLog.mraidLogTag;
                                    string = HaoboLog.getString(R.string.store_picture_error);
                                    HaoboLog.d(str2, string);
                                    f.this.f6376b.c();
                                }
                            }
                            f.this.f6376b.c();
                        } catch (IOException unused7) {
                            fileOutputStream2 = fileOutputStream;
                            HaoboLog.d(HaoboLog.mraidLogTag, HaoboLog.getString(R.string.store_picture_error));
                            fileOutputStream2 = fileOutputStream2;
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                    fileOutputStream2 = fileOutputStream2;
                                } catch (IOException unused8) {
                                    str2 = HaoboLog.mraidLogTag;
                                    string = HaoboLog.getString(R.string.store_picture_error);
                                    HaoboLog.d(str2, string);
                                    f.this.f6376b.c();
                                }
                            }
                            f.this.f6376b.c();
                        } catch (IllegalArgumentException unused9) {
                            fileOutputStream2 = fileOutputStream;
                            HaoboLog.d(HaoboLog.mraidLogTag, HaoboLog.getString(R.string.store_picture_error));
                            fileOutputStream2 = fileOutputStream2;
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                    fileOutputStream2 = fileOutputStream2;
                                } catch (IOException unused10) {
                                    str2 = HaoboLog.mraidLogTag;
                                    string = HaoboLog.getString(R.string.store_picture_error);
                                    HaoboLog.d(str2, string);
                                    f.this.f6376b.c();
                                }
                            }
                            f.this.f6376b.c();
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream2 = fileOutputStream;
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException unused11) {
                                    HaoboLog.d(HaoboLog.mraidLogTag, HaoboLog.getString(R.string.store_picture_error));
                                }
                            }
                            throw th;
                        }
                    }
                    f.this.f6376b.c();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        });
        builder.setNegativeButton(R.string.store_picture_decline, new DialogInterface.OnClickListener() { // from class: com.beizi.ad.internal.view.f.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
            }
        });
        builder.create().show();
    }

    private void e() {
        Activity activity = (Activity) this.f6376b.getContextFromMutableContext();
        this.f6376b.getLocationOnScreen(r2);
        int[] iArr = {0, iArr[1] - activity.getWindow().findViewById(16908290).getTop()};
        this.f6376b.measure(0, 0);
        int[] iArr2 = {this.f6376b.getMeasuredWidth(), this.f6376b.getMeasuredHeight()};
        ViewUtil.convertFromPixelsToDP(activity, iArr2);
        this.f6376b.c(String.format("javascript:window.mraid.util.setDefaultPosition(%d, %d, %d, %d)", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(iArr2[0]), Integer.valueOf(iArr2[1])));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L1f
            int r0 = r2.size()     // Catch: java.io.UnsupportedEncodingException -> L1e
            if (r0 <= 0) goto L1f
            r0 = 0
            java.lang.Object r2 = r2.get(r0)     // Catch: java.io.UnsupportedEncodingException -> L1e
            android.util.Pair r2 = (android.util.Pair) r2     // Catch: java.io.UnsupportedEncodingException -> L1e
            java.lang.Object r2 = r2.second     // Catch: java.io.UnsupportedEncodingException -> L1e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.UnsupportedEncodingException -> L1e
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r0)     // Catch: java.io.UnsupportedEncodingException -> L1e
            com.beizi.ad.internal.utilities.W3CEvent r2 = com.beizi.ad.internal.utilities.W3CEvent.createFromJSON(r2)     // Catch: java.io.UnsupportedEncodingException -> L1e
            goto L20
        L1e:
            return
        L1f:
            r2 = 0
        L20:
            if (r2 == 0) goto L44
            android.content.Intent r2 = r2.getInsertIntent()     // Catch: java.lang.Exception -> L44
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r0)     // Catch: java.lang.Exception -> L44
            com.beizi.ad.internal.view.AdWebView r0 = r1.f6376b     // Catch: java.lang.Exception -> L44
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Exception -> L44
            r0.startActivity(r2)     // Catch: java.lang.Exception -> L44
            com.beizi.ad.internal.view.AdWebView r2 = r1.f6376b     // Catch: java.lang.Exception -> L44
            r2.c()     // Catch: java.lang.Exception -> L44
            java.lang.String r2 = com.beizi.ad.internal.utilities.HaoboLog.mraidLogTag     // Catch: java.lang.Exception -> L44
            int r0 = com.beizi.ad.R.string.create_calendar_event     // Catch: java.lang.Exception -> L44
            java.lang.String r0 = com.beizi.ad.internal.utilities.HaoboLog.getString(r0)     // Catch: java.lang.Exception -> L44
            com.beizi.ad.internal.utilities.HaoboLog.d(r2, r0)     // Catch: java.lang.Exception -> L44
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.ad.internal.view.f.f(java.util.ArrayList):void");
    }

    private void g(ArrayList<Pair<String, String>> arrayList) {
        AdActivity.b bVar = AdActivity.b.none;
        Iterator<Pair<String, String>> it2 = arrayList.iterator();
        int i4 = 1;
        boolean z4 = true;
        while (it2.hasNext()) {
            Pair<String, String> next = it2.next();
            if (((String) next.first).equals("allow_orientation_change")) {
                z4 = Boolean.parseBoolean((String) next.second);
            } else if (((String) next.first).equals("force_orientation")) {
                bVar = a((String) next.second);
            }
        }
        if (this.f6377c || this.f6376b.adViewImpl.e()) {
            AdWebView adWebView = this.f6376b;
            Activity c5 = adWebView.f6277a ? c() : (Activity) ViewUtil.getTopContext(adWebView);
            if (z4) {
                AdActivity.b(c5);
                return;
            }
            int i5 = AnonymousClass4.f6400a[bVar.ordinal()];
            if (i5 == 1) {
                i4 = 2;
            } else if (i5 != 2) {
                i4 = 0;
            }
            AdActivity.a(c5, i4);
        }
    }

    private void h(ArrayList<Pair<String, String>> arrayList) {
        Iterator<Pair<String, String>> it2 = arrayList.iterator();
        int i4 = 0;
        int i5 = -1;
        String str = "top-right";
        int i6 = -1;
        int i7 = 0;
        boolean z4 = true;
        while (it2.hasNext()) {
            Pair<String, String> next = it2.next();
            try {
                if (((String) next.first).equals("w")) {
                    i5 = Integer.parseInt((String) next.second);
                } else if (((String) next.first).equals(bm.aK)) {
                    i6 = Integer.parseInt((String) next.second);
                } else if (((String) next.first).equals("offset_x")) {
                    i4 = Integer.parseInt((String) next.second);
                } else if (((String) next.first).equals("offset_y")) {
                    i7 = Integer.parseInt((String) next.second);
                } else if (((String) next.first).equals("custom_close_position")) {
                    str = (String) next.second;
                } else if (((String) next.first).equals("allow_offscreen")) {
                    z4 = Boolean.parseBoolean((String) next.second);
                }
            } catch (NumberFormatException unused) {
                HaoboLog.d(HaoboLog.mraidLogTag, HaoboLog.getString(R.string.number_format));
                return;
            }
        }
        if (i5 > this.f6386l && i6 > this.f6387m) {
            this.f6376b.c("javascript:mraid.util.errorEvent('Resize called with resizeProperties larger than the screen.', 'mraid.resize()')");
            return;
        }
        a aVar = a.top_right;
        try {
            aVar = a.valueOf(str.replace('-', '_'));
        } catch (IllegalArgumentException unused2) {
        }
        int i8 = i5;
        int i9 = i6;
        int i10 = i4;
        int i11 = i7;
        boolean z5 = z4;
        HaoboLog.d(HaoboLog.mraidLogTag, HaoboLog.getString(R.string.resize, i8, i9, i10, i11, str, z5));
        this.f6376b.resize(i8, i9, i10, i11, aVar, z5);
        this.f6376b.c();
        this.f6376b.c("javascript:window.mraid.util.stateChangeEvent('resized');");
        this.f6378d = true;
    }

    void b(ArrayList<Pair<String, String>> arrayList) {
        AdActivity.b bVar = AdActivity.b.none;
        Iterator<Pair<String, String>> it2 = arrayList.iterator();
        String str = null;
        final AdActivity.b bVar2 = bVar;
        int i4 = -1;
        int i5 = -1;
        boolean z4 = false;
        final boolean z5 = true;
        while (it2.hasNext()) {
            Pair<String, String> next = it2.next();
            if (((String) next.first).equals("w")) {
                try {
                    i4 = Integer.parseInt((String) next.second);
                } catch (NumberFormatException unused) {
                }
            } else if (((String) next.first).equals(bm.aK)) {
                i5 = Integer.parseInt((String) next.second);
            } else if (((String) next.first).equals("useCustomClose")) {
                z4 = Boolean.parseBoolean((String) next.second);
            } else if (((String) next.first).equals("url")) {
                str = Uri.decode((String) next.second);
            } else if (((String) next.first).equals("allow_orientation_change")) {
                z5 = Boolean.parseBoolean((String) next.second);
            } else if (((String) next.first).equals("force_orientation")) {
                bVar2 = a((String) next.second);
            }
        }
        if (!StringUtil.isEmpty(str)) {
            try {
                g gVar = new g(this.f6376b.adViewImpl, this);
                this.f6393s = gVar;
                gVar.a(str);
                this.f6376b.adViewImpl.a(this.f6393s.getMRAIDImplementation(), z4, new AdWebView.b() { // from class: com.beizi.ad.internal.view.f.1
                    @Override // com.beizi.ad.internal.view.AdWebView.b
                    public void a() {
                        if (f.this.c() != null) {
                            f.this.f6393s.a(f.this.c(), z5, bVar2);
                            AdViewImpl.setMRAIDFullscreenListener(null);
                        }
                    }
                });
            } catch (Exception e5) {
                String str2 = HaoboLog.baseLogTag;
                HaoboLog.e(str2, "Exception initializing the redirect webview: " + e5.getMessage());
            }
        } else {
            this.f6376b.a(i4, i5, z4, this, z5, bVar2);
        }
        this.f6376b.c("javascript:window.mraid.util.stateChangeEvent('expanded');");
        this.f6377c = true;
        if (this.f6376b.adViewImpl.e()) {
            return;
        }
        this.f6376b.adViewImpl.getAdDispatcher().c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AdWebView adWebView, String str) {
        if (this.f6385k) {
            return;
        }
        String str2 = this.f6376b.adViewImpl.d() ? "inline" : MediationConstant.RIT_TYPE_INTERSTITIAL;
        boolean equals = str.equals(f6375a[b.STARTING_EXPANDED.ordinal()]);
        this.f6392r = equals;
        this.f6376b.f6277a = equals;
        adWebView.c("javascript:window.mraid.util.setPlacementType('" + str2 + "')");
        if (!this.f6392r) {
            a(adWebView);
            g();
            f();
            e();
        }
        this.f6376b.f();
        adWebView.c("javascript:window.mraid.util.stateChangeEvent('" + str + "')");
        adWebView.c("javascript:window.mraid.util.readyEvent();");
        this.f6379e = this.f6376b.getLayoutParams().width;
        this.f6380f = this.f6376b.getLayoutParams().height;
        if (this.f6376b.adViewImpl.getMediaType().equals(j.BANNER)) {
            this.f6381g = ((FrameLayout.LayoutParams) this.f6376b.getLayoutParams()).gravity;
        }
        this.f6385k = true;
        a(this.f6376b.g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity c() {
        return this.f6388n;
    }

    private void f() {
        if (this.f6376b.getContextFromMutableContext() instanceof Activity) {
            Activity activity = (Activity) this.f6376b.getContextFromMutableContext();
            int[] screenSizeAsPixels = ViewUtil.getScreenSizeAsPixels(activity);
            int i4 = screenSizeAsPixels[0];
            float f5 = activity.getResources().getDisplayMetrics().density;
            int i5 = (int) ((i4 / f5) + 0.5f);
            AdWebView adWebView = this.f6376b;
            adWebView.c("javascript:window.mraid.util.setMaxSize(" + i5 + ", " + ((int) (((screenSizeAsPixels[1] - activity.getWindow().findViewById(16908290).getTop()) / f5) + 0.5f)) + ")");
        }
    }

    private void e(ArrayList<Pair<String, String>> arrayList) {
        Iterator<Pair<String, String>> it2 = arrayList.iterator();
        String str = null;
        while (it2.hasNext()) {
            Pair<String, String> next = it2.next();
            if (((String) next.first).equals("uri")) {
                str = (String) next.second;
            }
        }
        if (str == null) {
            HaoboLog.d(HaoboLog.mraidLogTag, HaoboLog.getString(R.string.play_vide_no_uri));
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        try {
            intent.setDataAndType(Uri.parse(URLDecoder.decode(str, "UTF-8")), "video/mp4");
            try {
                this.f6376b.getContext().startActivity(intent);
                this.f6376b.c();
            } catch (Exception unused) {
            }
        } catch (UnsupportedEncodingException unused2) {
            HaoboLog.d(HaoboLog.mraidLogTag, HaoboLog.getString(R.string.unsupported_encoding));
        }
    }

    private void g() {
        if (this.f6376b.getContextFromMutableContext() instanceof Activity) {
            int[] screenSizeAsDP = ViewUtil.getScreenSizeAsDP((Activity) this.f6376b.getContextFromMutableContext());
            this.f6386l = screenSizeAsDP[0];
            this.f6387m = screenSizeAsDP[1];
            AdWebView adWebView = this.f6376b;
            adWebView.c("javascript:window.mraid.util.setScreenSize(" + this.f6386l + ", " + this.f6387m + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewGroup d() {
        return this.f6389o;
    }

    private void a(AdWebView adWebView, String str, boolean z4) {
        adWebView.c(String.format("javascript:window.mraid.util.setSupports('%s', %s)", str, String.valueOf(z4)));
    }

    @SuppressLint({"NewApi"})
    private void a(AdWebView adWebView) {
        if (a(new Intent("android.intent.action.VIEW", Uri.parse("sms:5555555555")))) {
            a(adWebView, "sms", true);
        }
        if (a(new Intent("android.intent.action.VIEW", Uri.parse("tel:5555555555")))) {
            a(adWebView, "tel", true);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            try {
                if (a(new Intent("android.intent.action.EDIT").setData(Uri.parse(com.beizi.ad.lance.a.b.a("Y29udGVudDovL2NvbS5hbmRyb2lkLmNhbGVuZGFyL2V2ZW50cw=="))))) {
                    a(adWebView, "calendar", true);
                    this.f6383i = true;
                } else if (a(new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event"))) {
                    a(adWebView, "calendar", true);
                    this.f6383i = true;
                    W3CEvent.useMIME = true;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        a(adWebView, "inlineVideo", true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        boolean g4 = this.f6376b.g();
        if (this.f6384j != g4) {
            a(g4);
        }
    }

    boolean a(Intent intent) {
        return this.f6376b.getContext().getPackageManager().queryIntentActivities(intent, 0).size() > 0;
    }

    void a(boolean z4) {
        if (this.f6385k) {
            this.f6384j = z4;
            AdWebView adWebView = this.f6376b;
            adWebView.c("javascript:window.mraid.util.setIsViewable(" + z4 + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i4, int i5, int i6, int i7) {
        int[] iArr = this.f6390p;
        if (iArr[0] == i4 && iArr[1] == i5 && iArr[2] == i6 && iArr[3] == i7) {
            return;
        }
        iArr[0] = i4;
        iArr[1] = i5;
        iArr[2] = i6;
        iArr[3] = i7;
        Activity activity = (Activity) this.f6376b.getContextFromMutableContext();
        int[] iArr2 = {i4, i5 - activity.getWindow().findViewById(16908290).getTop(), i6, i7};
        ViewUtil.convertFromPixelsToDP(activity, iArr2);
        int i8 = iArr2[0];
        int i9 = iArr2[1];
        int i10 = iArr2[2];
        int i11 = iArr2[3];
        this.f6376b.c(String.format("javascript:window.mraid.util.setCurrentPosition(%d, %d, %d, %d)", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)));
        this.f6376b.c(String.format("javascript:window.mraid.util.sizeChangeEvent(%d, %d)", Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public void a() {
        if (!this.f6377c && !this.f6378d && !this.f6392r) {
            if (this.f6376b.adViewImpl.e()) {
                this.f6376b.adViewImpl.getAdDispatcher().b();
                Activity activity = (Activity) this.f6376b.getContextFromMutableContext();
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                activity.finish();
                return;
            }
            this.f6376b.d();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f6376b.getLayoutParams());
        layoutParams.height = this.f6380f;
        layoutParams.width = this.f6379e;
        if (this.f6376b.adViewImpl.getMediaType().equals(j.BANNER)) {
            layoutParams.gravity = this.f6381g;
        } else {
            layoutParams.gravity = 17;
        }
        this.f6376b.setLayoutParams(layoutParams);
        this.f6376b.e();
        this.f6376b.c("javascript:window.mraid.util.stateChangeEvent('default');");
        if (!this.f6376b.adViewImpl.e() && !this.f6392r) {
            this.f6376b.adViewImpl.getAdDispatcher().b();
        }
        Activity activity2 = (Activity) this.f6376b.getContextFromMutableContext();
        if (activity2 != null) {
            activity2.setRequestedOrientation(-1);
        }
        this.f6377c = false;
        this.f6378d = false;
        this.f6393s = null;
    }

    void a(ArrayList<Pair<String, String>> arrayList) {
        this.f6376b.setMRAIDUseCustomClose(Boolean.parseBoolean((String) arrayList.get(0).second));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, boolean z4) {
        String replaceFirst = str.replaceFirst("mraid://", "");
        String[] split = replaceFirst.split("\\?");
        String replaceAll = split[0].replaceAll(net.lingala.zip4j.util.e.F0, "");
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (split.length > 1) {
            for (String str2 : replaceFirst.substring(replaceFirst.indexOf("?") + 1).split(m.a.f71490d)) {
                String[] split2 = str2.split(SimpleComparison.EQUAL_TO_OPERATION);
                if (split2.length >= 2 && !StringUtil.isEmpty(split2[1]) && !"undefined".equals(split2[1])) {
                    arrayList.add(new Pair<>(split2[0], split2[1]));
                }
            }
        }
        if (replaceAll.equals("expand")) {
            if (z4) {
                b(arrayList);
            } else {
                HaoboLog.w(HaoboLog.mraidLogTag, HaoboLog.getString(R.string.no_user_interaction, replaceFirst));
            }
        } else if (replaceAll.equals("close")) {
            a();
        } else if (replaceAll.equals("resize")) {
            if (z4) {
                h(arrayList);
            } else {
                HaoboLog.w(HaoboLog.mraidLogTag, HaoboLog.getString(R.string.no_user_interaction, replaceFirst));
            }
        } else if (replaceAll.equals("setOrientationProperties")) {
            g(arrayList);
        } else if (this.f6383i && replaceAll.equals("createCalendarEvent")) {
            if (z4) {
                f(arrayList);
            } else {
                HaoboLog.w(HaoboLog.mraidLogTag, HaoboLog.getString(R.string.no_user_interaction, replaceFirst));
            }
        } else if (replaceAll.equals("playVideo")) {
            if (z4) {
                e(arrayList);
            } else {
                HaoboLog.w(HaoboLog.mraidLogTag, HaoboLog.getString(R.string.no_user_interaction, replaceFirst));
            }
        } else if (this.f6382h && replaceAll.equals("storePicture")) {
            if (z4) {
                d(arrayList);
            } else {
                HaoboLog.w(HaoboLog.mraidLogTag, HaoboLog.getString(R.string.no_user_interaction, replaceFirst));
            }
        } else if (replaceAll.equals("open")) {
            if (z4) {
                c(arrayList);
            } else {
                HaoboLog.w(HaoboLog.mraidLogTag, HaoboLog.getString(R.string.no_user_interaction, replaceFirst));
            }
        } else if (replaceAll.equals("setUseCustomClose")) {
            a(arrayList);
        } else if (!replaceAll.equals("enable")) {
            HaoboLog.d(HaoboLog.mraidLogTag, HaoboLog.getString(R.string.unsupported_mraid, replaceAll));
        }
    }

    private AdActivity.b a(String str) {
        AdActivity.b bVar = AdActivity.b.none;
        if (str.equals("landscape")) {
            return AdActivity.b.landscape;
        }
        return str.equals("portrait") ? AdActivity.b.portrait : bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i4) {
        if (this.f6391q != i4) {
            this.f6391q = i4;
            f();
            g();
        }
    }

    public void a(Activity activity) {
        this.f6388n = activity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup) {
        this.f6389o = viewGroup;
    }
}
