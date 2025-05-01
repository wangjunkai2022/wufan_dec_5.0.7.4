package com.qq.e.ads.nativ;

import android.content.Context;
import android.text.TextUtils;
import com.qq.e.ads.NativeAbstractAD;
import com.qq.e.comm.adevent.ADEvent;
import com.qq.e.comm.adevent.ADListener;
import com.qq.e.comm.constants.LoadAdParams;
import com.qq.e.comm.pi.NUADI;
import com.qq.e.comm.pi.POFactory;
import com.qq.e.comm.util.AdErrorConvertor;
import com.qq.e.comm.util.GDTLogger;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public class NativeUnifiedAD extends NativeAbstractAD<NUADI> {

    /* renamed from: f  reason: collision with root package name */
    private AdListenerAdapter f59753f;

    /* renamed from: g  reason: collision with root package name */
    private NativeADUnifiedListener f59754g;

    /* renamed from: h  reason: collision with root package name */
    private List<Integer> f59755h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private List<String> f59756i;

    /* renamed from: j  reason: collision with root package name */
    private volatile int f59757j;

    /* renamed from: k  reason: collision with root package name */
    private volatile int f59758k;

    /* renamed from: l  reason: collision with root package name */
    private String f59759l;

    /* renamed from: m  reason: collision with root package name */
    private LoadAdParams f59760m;

    /* loaded from: classes5.dex */
    private static class AdListenerAdapter implements ADListener {

        /* renamed from: a  reason: collision with root package name */
        private NativeADUnifiedListener f59761a;

        public AdListenerAdapter(NativeADUnifiedListener nativeADUnifiedListener) {
            this.f59761a = nativeADUnifiedListener;
        }

        @Override // com.qq.e.comm.adevent.ADListener
        public void onADEvent(ADEvent aDEvent) {
            Integer num;
            if (this.f59761a != null) {
                int type = aDEvent.getType();
                if (type != 100) {
                    if (type == 101 && (num = (Integer) aDEvent.getParam(Integer.class)) != null) {
                        this.f59761a.onNoAD(AdErrorConvertor.formatErrorCode(num.intValue()));
                        return;
                    }
                    return;
                }
                List<NativeUnifiedADData> list = (List) aDEvent.getParam(List.class);
                if (list == null || list.size() <= 0) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (NativeUnifiedADData nativeUnifiedADData : list) {
                    arrayList.add(new NativeUnifiedADDataAdapter(nativeUnifiedADData));
                }
                this.f59761a.onADLoaded(arrayList);
            }
        }
    }

    public NativeUnifiedAD(Context context, String str, NativeADUnifiedListener nativeADUnifiedListener) {
        this.f59754g = nativeADUnifiedListener;
        this.f59753f = new AdListenerAdapter(nativeADUnifiedListener);
        a(context, str);
    }

    public NativeUnifiedAD(Context context, String str, NativeADUnifiedListener nativeADUnifiedListener, String str2) {
        this.f59754g = nativeADUnifiedListener;
        this.f59753f = new AdListenerAdapter(nativeADUnifiedListener);
        a(context, str, str2);
    }

    private void d(int i4, boolean z4) {
        if (a()) {
            if (!b()) {
                if (z4) {
                    this.f59755h.add(Integer.valueOf(i4));
                    return;
                }
                return;
            }
            T t4 = this.f59652a;
            if (t4 != 0) {
                LoadAdParams loadAdParams = this.f59760m;
                NUADI nuadi = (NUADI) t4;
                if (loadAdParams != null) {
                    nuadi.loadData(i4, loadAdParams);
                } else {
                    nuadi.loadData(i4);
                }
            }
        }
    }

    @Override // com.qq.e.ads.AbstractAD
    protected Object a(Context context, POFactory pOFactory, String str, String str2, String str3) {
        return pOFactory.getNativeAdManagerDelegate(context, str, str2, str3, this.f59753f);
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void b(int i4) {
        NativeADUnifiedListener nativeADUnifiedListener = this.f59754g;
        if (nativeADUnifiedListener != null) {
            nativeADUnifiedListener.onNoAD(AdErrorConvertor.formatErrorCode(i4));
        }
    }

    public String getAdNetWorkName() {
        T t4 = this.f59652a;
        if (t4 != 0) {
            return ((NUADI) t4).getAdNetWorkName();
        }
        a("getAdNetWorkName");
        return null;
    }

    public void loadData(int i4) {
        d(i4, true);
    }

    public void loadData(int i4, LoadAdParams loadAdParams) {
        this.f59760m = loadAdParams;
        loadData(i4);
    }

    public void setCategories(List<String> list) {
        this.f59756i = list;
        T t4 = this.f59652a;
        if (t4 == 0 || list == null) {
            return;
        }
        ((NUADI) t4).setCategories(list);
    }

    public void setMaxVideoDuration(int i4) {
        this.f59758k = i4;
        if (this.f59758k > 0 && this.f59757j > this.f59758k) {
            GDTLogger.e("maxVideoDuration 设置值非法，不得小于minVideoDuration");
        }
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((NUADI) t4).setMaxVideoDuration(this.f59758k);
        }
    }

    public void setMinVideoDuration(int i4) {
        this.f59757j = i4;
        if (this.f59758k > 0 && this.f59757j > this.f59758k) {
            GDTLogger.e("minVideoDuration 设置值非法，不得大于maxVideoDuration");
        }
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((NUADI) t4).setMinVideoDuration(this.f59757j);
        }
    }

    public void setVastClassName(String str) {
        if (TextUtils.isEmpty(str)) {
            GDTLogger.e("Vast class name 不能为空");
            return;
        }
        this.f59759l = str;
        T t4 = this.f59652a;
        if (t4 != 0) {
            ((NUADI) t4).setVastClassName(str);
        }
    }

    @Override // com.qq.e.ads.NativeAbstractAD, com.qq.e.ads.AbstractAD
    protected void a(Object obj) {
        NUADI nuadi = (NUADI) obj;
        nuadi.setMinVideoDuration(this.f59757j);
        nuadi.setMaxVideoDuration(this.f59758k);
        nuadi.setVastClassName(this.f59759l);
        List<String> list = this.f59756i;
        if (list != null) {
            setCategories(list);
        }
        for (Integer num : this.f59755h) {
            d(num.intValue(), false);
        }
    }
}
