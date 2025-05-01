package com.beizi.ad.internal.nativead;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.beizi.ad.AdActivity;
import com.beizi.ad.NativeAdResponse;
import com.beizi.ad.R;
import com.beizi.ad.c.b;
import com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity;
import com.beizi.ad.internal.h;
import com.beizi.ad.internal.network.ServerResponse;
import com.beizi.ad.internal.o;
import com.beizi.ad.internal.q;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.JsonUtil;
import com.beizi.ad.internal.utilities.ReportEventUtil;
import com.beizi.ad.internal.utilities.StringUtil;
import com.beizi.ad.internal.utilities.UrlUtil;
import com.beizi.ad.internal.utilities.WebviewUtil;
import com.beizi.ad.lance.ApkBean;
import com.beizi.ad.lance.a.f;
import com.beizi.ad.lance.a.i;
import com.beizi.ad.lance.a.j;
import com.beizi.ad.lance.a.l;
import com.kuaishou.weapon.p0.bi;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: BeiZiNativeAdResponse.java */
/* loaded from: classes2.dex */
public class a implements NativeAdResponse {
    private ServerResponse.AdLogoInfo A;
    private List<? extends View> B;
    private View D;
    private List<View> E;
    private NativeAdEventListener F;
    private View.OnClickListener G;
    private q H;
    private ArrayList<Object> I;
    private long K;
    private int L;
    private String M;
    private String N;
    private String O;
    private String P;
    private String Q;
    private String R;
    private String S;
    private String T;
    private String U;
    private String V;
    private String W;
    private b.C0171b.C0172b X;
    private b.C0171b.a Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private NativeAdResponse.b f5961a;

    /* renamed from: b  reason: collision with root package name */
    private String f5962b;

    /* renamed from: c  reason: collision with root package name */
    private String f5963c;

    /* renamed from: d  reason: collision with root package name */
    private String f5964d;

    /* renamed from: f  reason: collision with root package name */
    private String f5966f;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap f5967g;

    /* renamed from: h  reason: collision with root package name */
    private Bitmap f5968h;

    /* renamed from: i  reason: collision with root package name */
    private String f5969i;

    /* renamed from: j  reason: collision with root package name */
    private String f5970j;

    /* renamed from: k  reason: collision with root package name */
    private b.C0171b f5971k;

    /* renamed from: l  reason: collision with root package name */
    private String f5972l;

    /* renamed from: m  reason: collision with root package name */
    private double f5973m;

    /* renamed from: n  reason: collision with root package name */
    private String f5974n;

    /* renamed from: o  reason: collision with root package name */
    private String f5975o;

    /* renamed from: p  reason: collision with root package name */
    private String f5976p;

    /* renamed from: q  reason: collision with root package name */
    private HashMap<String, Object> f5977q;

    /* renamed from: z  reason: collision with root package name */
    private ServerResponse.AdLogoInfo f5986z;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Bitmap> f5965e = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    private boolean f5978r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f5979s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f5980t = false;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<String> f5981u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<String> f5982v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    private ArrayList<String> f5983w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    private ArrayList<String> f5984x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    private ArrayList<String> f5985y = new ArrayList<>();
    private Runnable C = new Runnable() { // from class: com.beizi.ad.internal.nativead.a.1
        @Override // java.lang.Runnable
        public void run() {
            a.this.f5978r = true;
            a.this.D = null;
            a.this.E = null;
            if (a.this.H != null) {
                a.this.H.a();
                a.this.H = null;
            }
            a.this.I = null;
            a.this.F = null;
            if (a.this.f5968h != null) {
                a.this.f5968h.recycle();
                a.this.f5968h = null;
            }
            if (a.this.f5967g != null) {
                a.this.f5967g.recycle();
                a.this.f5967g = null;
            }
        }
    };
    private String J = "";
    private boolean aa = false;
    private boolean ab = false;

    a() {
    }

    @Override // com.beizi.ad.NativeAdResponse
    public void destroy() {
        Handler handler = new Handler(Looper.getMainLooper());
        handler.removeCallbacks(this.C);
        handler.post(this.C);
    }

    @Override // com.beizi.ad.NativeAdResponse
    public ServerResponse.AdLogoInfo getAdUrl() {
        return this.f5986z;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public String getAdvertiser() {
        return this.f5976p;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public ApkBean getApkInfo() {
        int i4 = this.L;
        if (i4 == 2 || i4 == 5) {
            ApkBean apkBean = new ApkBean();
            apkBean.setApkName(this.M);
            apkBean.setAppVersion(this.Q);
            apkBean.setAppDeveloper(this.R);
            apkBean.setAppPermissionsDesc(this.S);
            apkBean.setAppPermissionsUrl(this.T);
            apkBean.setAppPrivacyUrl(this.U);
            apkBean.setAppintro(this.W);
            return apkBean;
        }
        return null;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public String getBody() {
        return this.f5963c;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public String getCallToAction() {
        return this.f5972l;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public ArrayList<String> getClickTrackers() {
        return this.f5985y;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public String getHeadline() {
        return this.f5962b;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public Bitmap getIcon() {
        return this.f5968h;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public String getIconUrl() {
        return this.f5966f;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public Bitmap getImage() {
        return this.f5967g;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public String getImageUrl() {
        return this.f5964d;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public ArrayList<String> getImageUrls() {
        return this.f5981u;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public ArrayList<String> getImpTrackers() {
        return this.f5984x;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public String getLandingPageUrl() {
        return this.f5969i;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public NativeAdResponse.b getNativeAdType() {
        return this.f5961a;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public HashMap<String, Object> getNativeElements() {
        return this.f5977q;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public List<? extends View> getNativeInfoListView() {
        return this.B;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public NativeAdResponse.a getNetworkIdentifier() {
        return NativeAdResponse.a.BeiZi;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public String getPrice() {
        return this.f5975o;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public double getStarRating() {
        return this.f5973m;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public String getStore() {
        return this.f5974n;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public ArrayList<String> getTexts() {
        return this.f5983w;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public ArrayList<String> getVedioUrls() {
        return this.f5982v;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public ServerResponse.AdLogoInfo getlogoUrl() {
        return this.A;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public void handleClick(Context context) {
        if (context == null) {
            return;
        }
        if (!this.f5980t) {
            Iterator<String> it2 = this.f5985y.iterator();
            while (it2.hasNext()) {
                new h(it2.next()).executeOnExecutor(com.beizi.ad.lance.a.c.b().d(), new Void[0]);
            }
            this.f5985y.clear();
            this.f5980t = true;
        }
        a(this.f5970j, this.f5969i, context);
    }

    @Override // com.beizi.ad.NativeAdResponse
    public boolean hasExpired() {
        return this.f5978r;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public void regesterClickListener(View view, final NativeAdEventListener nativeAdEventListener) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.nativead.a.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                try {
                    if (a.this.f5985y != null) {
                        Iterator it2 = a.this.f5985y.iterator();
                        while (it2.hasNext()) {
                            new h((String) it2.next()).execute(new Void[0]);
                        }
                    }
                    nativeAdEventListener.onAdWasClicked();
                    Context context = view2.getContext();
                    View rootView = view2.getRootView();
                    if (rootView != null) {
                        context = rootView.getContext();
                    }
                    a aVar = a.this;
                    if (!aVar.a(aVar.f5970j, a.this.f5969i, context)) {
                        HaoboLog.d(HaoboLog.nativeLogTag, "Unable to handle click.");
                    }
                    a.this.f5985y = null;
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        });
    }

    @Override // com.beizi.ad.NativeAdResponse
    public boolean regesterShow(View view) {
        if (this.f5978r || view == null) {
            return false;
        }
        this.D = view;
        new Handler(Looper.getMainLooper()).removeCallbacks(this.C);
        return true;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public boolean registerView(final View view, NativeAdEventListener nativeAdEventListener) {
        if (this.f5978r || view == null) {
            return false;
        }
        this.F = nativeAdEventListener;
        this.D = view;
        final GestureDetector gestureDetector = new GestureDetector(new GestureDetector.OnGestureListener() { // from class: com.beizi.ad.internal.nativead.a.4
            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                a.this.K = System.currentTimeMillis();
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (a.this.f5985y != null) {
                    float x4 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    Iterator it2 = a.this.f5985y.iterator();
                    while (it2.hasNext()) {
                        String replaceToTouchEventUrl = UrlUtil.replaceToTouchEventUrl((String) it2.next(), x4 + "", y2 + "", rawX + "", rawY + "", String.valueOf(a.this.K), String.valueOf(System.currentTimeMillis()), "", 0);
                        if (!TextUtils.isEmpty(a.this.J)) {
                            replaceToTouchEventUrl = replaceToTouchEventUrl.replace("__REQUESTUUID__", a.this.J);
                        }
                        new h(StringUtil.replaceClick(view, replaceToTouchEventUrl)).execute(new Void[0]);
                    }
                }
                a.this.f5985y = null;
                return false;
            }
        });
        a();
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.beizi.ad.internal.nativead.a.5
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });
        view.setOnClickListener(this.G);
        new Handler(Looper.getMainLooper()).removeCallbacks(this.C);
        return true;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public boolean registerViewList(final View view, List<View> list, NativeAdEventListener nativeAdEventListener) {
        if (registerView(view, nativeAdEventListener)) {
            if (list == null || list.size() <= 0) {
                return true;
            }
            view.setOnClickListener(null);
            for (View view2 : list) {
                final GestureDetector gestureDetector = new GestureDetector(new GestureDetector.OnGestureListener() { // from class: com.beizi.ad.internal.nativead.a.6
                    @Override // android.view.GestureDetector.OnGestureListener
                    public boolean onDown(MotionEvent motionEvent) {
                        a.this.K = System.currentTimeMillis();
                        return false;
                    }

                    @Override // android.view.GestureDetector.OnGestureListener
                    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
                        return false;
                    }

                    @Override // android.view.GestureDetector.OnGestureListener
                    public void onLongPress(MotionEvent motionEvent) {
                    }

                    @Override // android.view.GestureDetector.OnGestureListener
                    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
                        return false;
                    }

                    @Override // android.view.GestureDetector.OnGestureListener
                    public void onShowPress(MotionEvent motionEvent) {
                    }

                    @Override // android.view.GestureDetector.OnGestureListener
                    public boolean onSingleTapUp(MotionEvent motionEvent) {
                        if (a.this.f5985y != null) {
                            float x4 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            float rawX = motionEvent.getRawX();
                            float rawY = motionEvent.getRawY();
                            Iterator it2 = a.this.f5985y.iterator();
                            while (it2.hasNext()) {
                                String replaceToTouchEventUrl = UrlUtil.replaceToTouchEventUrl((String) it2.next(), x4 + "", y2 + "", rawX + "", rawY + "", String.valueOf(a.this.K), String.valueOf(System.currentTimeMillis()), "", 0);
                                if (!TextUtils.isEmpty(a.this.J)) {
                                    replaceToTouchEventUrl = replaceToTouchEventUrl.replace("__REQUESTUUID__", a.this.J);
                                }
                                new h(StringUtil.replaceClick(view, replaceToTouchEventUrl)).execute(new Void[0]);
                            }
                        }
                        a.this.f5985y = null;
                        return false;
                    }
                });
                view2.setOnTouchListener(new View.OnTouchListener() { // from class: com.beizi.ad.internal.nativead.a.7
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view3, MotionEvent motionEvent) {
                        return gestureDetector.onTouchEvent(motionEvent);
                    }
                });
                view2.setOnClickListener(this.G);
            }
            this.E = list;
            return true;
        }
        return false;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public void sendClickLog() {
        if (this.f5980t) {
            return;
        }
        Iterator<String> it2 = this.f5985y.iterator();
        while (it2.hasNext()) {
            new h(it2.next()).executeOnExecutor(com.beizi.ad.lance.a.c.b().d(), new Void[0]);
        }
        this.f5985y.clear();
        this.f5980t = true;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public void sendImpLog() {
        if (this.f5979s) {
            return;
        }
        Iterator<String> it2 = this.f5984x.iterator();
        while (it2.hasNext()) {
            new h(it2.next()).executeOnExecutor(com.beizi.ad.lance.a.c.b().d(), new Void[0]);
        }
        this.f5984x.clear();
        this.f5979s = true;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public void setIcon(Bitmap bitmap) {
        this.f5968h = bitmap;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public void setImage(Bitmap bitmap) {
        this.f5967g = bitmap;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public void setNativeInfoListView(List<? extends View> list) {
        this.B = list;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public void unregisterViews() {
        View view = this.D;
        if (view != null) {
            view.setOnClickListener(null);
        }
        List<View> list = this.E;
        if (list != null && !list.isEmpty()) {
            for (View view2 : this.E) {
                view2.setOnClickListener(null);
            }
        }
        destroy();
    }

    public void d(String str) {
        this.f5984x.add(str);
    }

    public void e(String str) {
        this.f5985y.add(str);
    }

    public void c(String str) {
        this.f5970j = str;
    }

    public void b(ServerResponse.AdLogoInfo adLogoInfo) {
        this.A = adLogoInfo;
    }

    public void b(String str) {
        this.f5969i = str;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public boolean regesterShow(final View view, NativeAdShownListener nativeAdShownListener) {
        if (!this.f5978r && view != null) {
            f.a(view, nativeAdShownListener, new d() { // from class: com.beizi.ad.internal.nativead.a.3
                @Override // com.beizi.ad.internal.nativead.d
                public void a() {
                    if (a.this.f5984x == null || a.this.f5984x.size() == 0) {
                        return;
                    }
                    Iterator it2 = a.this.f5984x.iterator();
                    while (it2.hasNext()) {
                        new o(a.this.a((String) it2.next(), view));
                    }
                    a.this.f5984x = null;
                }
            });
            this.D = view;
            new Handler(Looper.getMainLooper()).removeCallbacks(this.C);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z4) {
        this.ab = z4;
    }

    private boolean b() {
        if (TextUtils.isEmpty(this.P) || TextUtils.isEmpty(this.M) || TextUtils.isEmpty(this.R) || TextUtils.isEmpty(this.Q) || TextUtils.isEmpty(this.U) || TextUtils.isEmpty(this.W)) {
            return false;
        }
        if (TextUtils.isEmpty(this.T) && TextUtils.isEmpty(this.S)) {
            return false;
        }
        int i4 = this.L;
        return i4 == 2 || i4 == 5;
    }

    @Override // com.beizi.ad.NativeAdResponse
    public void handleClick(Context context, View view, String str, String str2, String str3, String str4, int i4) {
        ArrayList<String> arrayList = this.f5985y;
        if (arrayList != null) {
            Iterator<String> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String replaceToTouchEventUrl = UrlUtil.replaceToTouchEventUrl(it2.next(), str + "", str2 + "", str3 + "", str4 + "", String.valueOf(System.currentTimeMillis()), String.valueOf(System.currentTimeMillis()), "", i4);
                if (!TextUtils.isEmpty(this.J)) {
                    replaceToTouchEventUrl = replaceToTouchEventUrl.replace("__REQUESTUUID__", this.J);
                }
                new h(StringUtil.replaceClick(view, replaceToTouchEventUrl)).execute(new Void[0]);
            }
        }
        this.f5985y = null;
        a(this.f5970j, this.f5969i, context);
        NativeAdEventListener nativeAdEventListener = this.F;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdWasClicked();
        }
    }

    public void a(ServerResponse.AdLogoInfo adLogoInfo) {
        this.f5986z = adLogoInfo;
    }

    public void a(String str) {
        this.J = str;
    }

    public static a a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        ArrayList<String> stringArrayList = JsonUtil.getStringArrayList(JsonUtil.getJSONArray(jSONObject, "ImpressionTrackers"));
        a aVar = new a();
        if (stringArrayList != null) {
            aVar.f5984x = stringArrayList;
        }
        aVar.f5962b = JsonUtil.getJSONString(jSONObject, "Headline");
        aVar.f5963c = JsonUtil.getJSONString(jSONObject, "Body");
        aVar.f5964d = JsonUtil.getJSONString(jSONObject, "Image");
        JSONArray jSONArray = JsonUtil.getJSONArray(jSONObject, "Images");
        JSONArray jSONArray2 = JsonUtil.getJSONArray(jSONObject, "Videos");
        JSONArray jSONArray3 = JsonUtil.getJSONArray(jSONObject, "Texts");
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                aVar.f5981u.add((String) jSONArray.get(i4));
            }
        }
        if (jSONArray2 != null) {
            for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                aVar.f5982v.add((String) jSONArray2.get(i5));
            }
        }
        if (jSONArray3 != null) {
            for (int i6 = 0; i6 < jSONArray3.length(); i6++) {
                aVar.f5983w.add((String) jSONArray3.get(i6));
            }
        }
        if (jSONObject.has("AppIcon")) {
            aVar.f5961a = NativeAdResponse.b.APP_INSTALL;
            aVar.f5966f = JsonUtil.getJSONString(jSONObject, "AppIcon");
            aVar.f5972l = JsonUtil.getJSONString(jSONObject, "Action");
            aVar.f5973m = JsonUtil.getJSONDouble(jSONObject, "Star");
            aVar.f5974n = JsonUtil.getJSONString(jSONObject, "Store");
            aVar.f5975o = JsonUtil.getJSONString(jSONObject, "Price");
        } else {
            aVar.f5961a = NativeAdResponse.b.CONTENT;
            aVar.f5966f = JsonUtil.getJSONString(jSONObject, "Logo");
            aVar.f5972l = JsonUtil.getJSONString(jSONObject, "Action");
            aVar.f5976p = JsonUtil.getJSONString(jSONObject, "Advertiser");
        }
        ArrayList<String> stringArrayList2 = JsonUtil.getStringArrayList(JsonUtil.getJSONArray(jSONObject, "ClickTrackers"));
        if (stringArrayList2 != null) {
            aVar.f5985y = stringArrayList2;
        }
        aVar.f5977q = JsonUtil.getStringObjectHashMap(JsonUtil.getJSONObject(jSONObject, TypedValues.Custom.NAME));
        new Handler(Looper.getMainLooper()).postDelayed(aVar.C, bi.f55326s);
        return aVar;
    }

    private boolean b(String str, Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            HaoboLog.w(HaoboLog.baseLogTag, HaoboLog.getString(R.string.opening_url_failed, str));
            return false;
        }
    }

    public String a(String str, View view) {
        if (view != null) {
            if (!TextUtils.isEmpty(this.J)) {
                str = str.replace("__REQUESTUUID__", this.J);
            }
            return StringUtil.replaceView(0, view, str);
        }
        return UrlUtil.replaceToTouchEventUrl(str, "", "", "", "", "", "", "");
    }

    public void a(b.C0171b c0171b) {
        this.f5971k = c0171b;
        this.X = c0171b.j();
        this.L = c0171b.c();
        this.M = c0171b.d();
        this.N = c0171b.e();
        this.O = c0171b.f();
        this.P = c0171b.g();
        if (TextUtils.isEmpty(this.N)) {
            this.N = "lance";
        }
        if (TextUtils.isEmpty(this.M)) {
            this.M = "BeiZi";
        }
        if (TextUtils.isEmpty(this.O)) {
            this.O = "Ad Download";
        }
        this.Q = c0171b.m();
        this.R = c0171b.n();
        this.S = c0171b.o();
        this.T = c0171b.p();
        this.U = c0171b.q();
        this.V = c0171b.r();
        this.W = c0171b.s();
        b.C0171b.a t4 = c0171b.t();
        this.Y = t4;
        if (t4 == null || t4.a() != 1) {
            return;
        }
        this.Z = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z4) {
        this.aa = z4;
    }

    private void a() {
        this.G = new View.OnClickListener() { // from class: com.beizi.ad.internal.nativead.a.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    if (a.this.f5985y != null) {
                        Iterator it2 = a.this.f5985y.iterator();
                        while (it2.hasNext()) {
                            String str = (String) it2.next();
                            l.a("lance", "setClickListener:" + str);
                            new h(str).execute(new Void[0]);
                        }
                    }
                    Context context = view.getContext();
                    View rootView = view.getRootView();
                    if (rootView != null) {
                        context = rootView.getContext();
                    }
                    a aVar = a.this;
                    if (!aVar.a(aVar.f5970j, a.this.f5969i, context)) {
                        HaoboLog.d(HaoboLog.nativeLogTag, "Unable to handle click.");
                    }
                    if (a.this.F != null) {
                        a.this.F.onAdWasClicked();
                    }
                    a.this.f5985y = null;
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, String str2, Context context) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (!j.a(context, str) && !com.beizi.ad.lance.a.h.a(context, this.N)) {
                    b.C0171b.C0172b c0172b = this.X;
                    if (c0172b != null) {
                        ReportEventUtil.report(c0172b.i());
                    }
                    a(context, str2);
                    return true;
                }
                b.C0171b.C0172b c0172b2 = this.X;
                if (c0172b2 != null) {
                    ReportEventUtil.report(c0172b2.h());
                }
                a(context);
                b.C0171b.C0172b c0172b3 = this.X;
                if (c0172b3 != null) {
                    ReportEventUtil.report(c0172b3.f());
                }
                return true;
            } catch (Exception unused) {
                b.C0171b.C0172b c0172b4 = this.X;
                if (c0172b4 != null) {
                    ReportEventUtil.report(c0172b4.g());
                }
                a(context, str2);
                return true;
            }
        }
        a(context, str2);
        return true;
    }

    private void a(Context context, String str) {
        try {
            if (!b()) {
                a(str, context);
                return;
            }
            int i4 = this.L;
            if (i4 == 2) {
                if (com.beizi.ad.lance.a.h.a(context, this.N)) {
                    com.beizi.ad.lance.a.h.b(context, this.N);
                    b.C0171b.C0172b c0172b = this.X;
                    if (c0172b != null) {
                        ReportEventUtil.report(c0172b.a());
                        return;
                    }
                    return;
                }
                a(context, 1);
            } else if (i4 == 5) {
                if (!j.a(context, this.P) && !this.P.contains("market://")) {
                    a(str, context);
                    return;
                }
                if (this.ab) {
                    b(this.P, context);
                    b.C0171b.C0172b c0172b2 = this.X;
                    if (c0172b2 != null) {
                        ReportEventUtil.report(c0172b2.a());
                        return;
                    }
                    return;
                }
                a(context, 2);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void a(Context context, int i4) {
        try {
            File a5 = com.beizi.ad.lance.a.h.a(context);
            String absolutePath = a5 != null ? a5.getAbsolutePath() : "";
            ApkBean apkBean = new ApkBean(this.P, this.N + ".apk", this.N, absolutePath, this.M, this.O, context.getPackageName() + ".fileprovider", this.X, this.Q, this.R, this.S, this.T, this.U, this.V, this.W);
            Bundle bundle = new Bundle();
            bundle.putSerializable("apkBean", apkBean);
            bundle.putInt("type", i4);
            bundle.putBoolean("isCanJump", this.Z);
            if (i4 == 2) {
                b.C0171b.C0172b c0172b = this.X;
                if (c0172b != null) {
                    bundle.putStringArrayList("openList", (ArrayList) c0172b.a());
                }
                bundle.putString("landingPageUrl", this.f5969i);
            }
            Intent intent = new Intent(context, BeiZiDownloadDialogActivity.class);
            intent.putExtra("data", bundle);
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void a(Context context) {
        Uri parse = Uri.parse(this.f5970j);
        if (parse.getScheme() != null && parse.getScheme().equals("bzopen") && !TextUtils.isEmpty(parse.getHost()) && parse.getPathSegments().size() > 0) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            String queryParameter = parse.getQueryParameter("flags");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    if (!queryParameter.startsWith("0x") && !queryParameter.startsWith("0X")) {
                        intent.setFlags(Integer.parseInt(queryParameter));
                    }
                    intent.setFlags(Integer.parseInt(queryParameter.substring(2), 16));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            intent.setComponent(new ComponentName(parse.getHost(), parse.getPathSegments().get(0)));
            String queryParameter2 = parse.getQueryParameter("rect");
            if (!TextUtils.isEmpty(queryParameter2)) {
                try {
                    String[] split = queryParameter2.split(":");
                    if (split.length == 4) {
                        Rect rect = new Rect();
                        rect.set(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
                        intent.setSourceBounds(rect);
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            if (context != null) {
                context.startActivity(intent);
                return;
            }
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", parse);
        intent2.setFlags(805339136);
        if (context != null) {
            context.startActivity(intent2);
        }
    }

    private boolean a(String str, Context context) {
        if (str != null && !str.isEmpty()) {
            if (!this.aa) {
                if (b(str, context)) {
                    NativeAdEventListener nativeAdEventListener = this.F;
                    if (nativeAdEventListener != null) {
                        nativeAdEventListener.onAdWillLeaveApplication();
                    }
                    return true;
                }
                return false;
            }
            Class a5 = AdActivity.a();
            try {
                WebView webView = new WebView(new MutableContextWrapper(context));
                WebviewUtil.setWebViewSettings(webView);
                webView.loadUrl(str, i.a());
                com.beizi.ad.internal.activity.a.f5750a.add(webView);
                Intent intent = new Intent(context, a5);
                intent.setFlags(268435456);
                intent.putExtra("ACTIVITY_TYPE", "DOWNLOADBROWSER");
                intent.putExtra("ACTIVITY_CAN_JUMP", this.Z);
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException unused) {
                HaoboLog.w(HaoboLog.baseLogTag, HaoboLog.getString(R.string.adactivity_missing, a5.getName()));
                com.beizi.ad.internal.activity.a.f5750a.remove();
            } catch (Exception e5) {
                String str2 = HaoboLog.baseLogTag;
                HaoboLog.e(str2, "Exception initializing the redirect webview: " + e5.getMessage());
                return false;
            }
        }
        return false;
    }
}
