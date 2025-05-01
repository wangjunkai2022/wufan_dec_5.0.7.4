package com.efs.sdk.base.core.config;

import android.content.Context;
import android.os.Message;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import com.join.mgps.data.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class GlobalEnvStruct {

    /* renamed from: a  reason: collision with root package name */
    private String f10321a;

    /* renamed from: b  reason: collision with root package name */
    private String f10322b;

    /* renamed from: h  reason: collision with root package name */
    private String f10328h;

    /* renamed from: m  reason: collision with root package name */
    private ILogEncryptAction f10333m;
    public Context mAppContext;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10323c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10324d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10325e = false;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f10326f = null;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10327g = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10329i = false;
    public long configRefreshDelayMills = 5000;

    /* renamed from: j  reason: collision with root package name */
    private long f10330j = c.f49010a;

    /* renamed from: k  reason: collision with root package name */
    private long f10331k = c.f49010a;

    /* renamed from: l  reason: collision with root package name */
    private Map<String, String> f10332l = new HashMap(5);

    /* renamed from: n  reason: collision with root package name */
    private ConcurrentHashMap<Integer, List<ValueCallback<Pair<Message, Message>>>> f10334n = new ConcurrentHashMap<>();

    /* renamed from: o  reason: collision with root package name */
    private List<IEfsReporterObserver> f10335o = new ArrayList(5);

    public void addConfigObserver(IEfsReporterObserver iEfsReporterObserver) {
        if (this.f10335o.contains(iEfsReporterObserver)) {
            return;
        }
        this.f10335o.add(iEfsReporterObserver);
    }

    public void addPublicParams(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        HashMap hashMap = new HashMap(this.f10332l);
        hashMap.putAll(map);
        this.f10332l = hashMap;
    }

    public String getAppid() {
        return this.f10321a;
    }

    public List<ValueCallback<Pair<Message, Message>>> getCallback(int i4) {
        if (this.f10334n.containsKey(Integer.valueOf(i4)) && this.f10334n.get(Integer.valueOf(i4)) != null) {
            return this.f10334n.get(Integer.valueOf(i4));
        }
        return Collections.emptyList();
    }

    public List<IEfsReporterObserver> getEfsReporterObservers() {
        return this.f10335o;
    }

    public ILogEncryptAction getLogEncryptAction() {
        return this.f10333m;
    }

    public long getLogSendDelayMills() {
        return this.f10330j;
    }

    public long getLogSendIntervalMills() {
        return this.f10331k;
    }

    public Map<String, String> getPublicParamMap() {
        Map<String, String> map = this.f10332l;
        return map == null ? Collections.emptyMap() : map;
    }

    public String getSecret() {
        return this.f10322b;
    }

    public String getUid() {
        return this.f10328h;
    }

    public boolean isDebug() {
        return this.f10325e;
    }

    public boolean isEnableSendLog() {
        return this.f10324d;
    }

    public boolean isEnableWaStat() {
        return this.f10323c;
    }

    public boolean isIntl() {
        return this.f10329i;
    }

    public boolean isPrintLogDetail() {
        return this.f10327g;
    }

    public void registerCallback(int i4, ValueCallback<Pair<Message, Message>> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        List<ValueCallback<Pair<Message, Message>>> list = this.f10334n.get(Integer.valueOf(i4));
        if (list == null) {
            list = new LinkedList<>();
            this.f10334n.putIfAbsent(Integer.valueOf(i4), list);
        }
        list.add(valueCallback);
    }

    public void setAppid(String str) {
        this.f10321a = str;
    }

    public void setDebug(boolean z4) {
        this.f10325e = z4;
    }

    public void setEnableSendLog(boolean z4) {
        this.f10324d = z4;
    }

    public void setEnableWaStat(boolean z4) {
        this.f10323c = z4;
    }

    public void setIsIntl(boolean z4) {
        this.f10329i = z4;
    }

    public void setLogEncryptAction(ILogEncryptAction iLogEncryptAction) {
        this.f10333m = iLogEncryptAction;
    }

    public void setPrintLogDetail(boolean z4) {
        this.f10327g = z4;
    }

    public void setSecret(String str) {
        this.f10322b = str;
    }

    public void setUid(String str) {
        this.f10328h = str;
    }
}
