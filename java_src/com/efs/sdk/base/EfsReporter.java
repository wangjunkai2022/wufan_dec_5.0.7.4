package com.efs.sdk.base;

import android.app.Application;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import com.efs.sdk.base.core.b.a;
import com.efs.sdk.base.core.b.e;
import com.efs.sdk.base.core.c.d;
import com.efs.sdk.base.core.config.GlobalEnvStruct;
import com.efs.sdk.base.core.config.a.c;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.a;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class EfsReporter {
    private static ControllerCenter sControllerCenter;

    /* loaded from: classes2.dex */
    public static class Builder {
        private static Map<String, EfsReporter> sInstanceMap = new ConcurrentHashMap();
        private static boolean sUseAppContext = true;
        private final String TAG;
        private GlobalEnvStruct mGlobalEnvStruct;

        /* loaded from: classes2.dex */
        public interface IPublicParams {
            Map<String, String> getRecordHeaders();
        }

        public Builder(@NonNull Application application, @NonNull String str, @NonNull String str2) {
            this(application.getApplicationContext(), str, str2);
        }

        private static Context checkContext(Context context) {
            if (context != null) {
                if (!sUseAppContext || (context instanceof Application) || ((context = context.getApplicationContext()) != null && (context instanceof Application))) {
                    return context;
                }
                Log.e("Can not get Application context from given context!");
                throw new IllegalArgumentException("Can not get Application context from given context!");
            }
            Log.e("context can not be null!");
            throw null;
        }

        private void checkParam(String str) {
            GlobalEnvStruct globalEnvStruct = sInstanceMap.get(str).getGlobalEnvStruct();
            if (globalEnvStruct.mAppContext.equals(getGlobalEnvStruct().mAppContext)) {
                if (!TextUtils.isEmpty(globalEnvStruct.getSecret()) && !globalEnvStruct.getSecret().equals(getGlobalEnvStruct().getSecret())) {
                    throw new RuntimeException("efs-core: duplicate init, but secret is different");
                } else if (globalEnvStruct.isIntl() == getGlobalEnvStruct().isIntl()) {
                    if (!TextUtils.isEmpty(getGlobalEnvStruct().getUid()) && !getGlobalEnvStruct().getUid().equals(globalEnvStruct.getUid())) {
                        Log.w("efs.reporter.builder", "efs-core: duplicate init, but  uid is different");
                    }
                    if (getGlobalEnvStruct().getPublicParamMap() == null || getGlobalEnvStruct().getPublicParamMap().size() <= 0) {
                        return;
                    }
                    globalEnvStruct.addPublicParams(getGlobalEnvStruct().getPublicParamMap());
                    return;
                } else {
                    throw new RuntimeException("efs-core: duplicate init, but intl setting is different");
                }
            }
            throw new RuntimeException("efs-core: duplicate init, but application context is different");
        }

        public Builder addEfsReporterObserver(IEfsReporterObserver iEfsReporterObserver) {
            this.mGlobalEnvStruct.addConfigObserver(iEfsReporterObserver);
            return this;
        }

        public EfsReporter build() {
            String appid = getGlobalEnvStruct().getAppid();
            if (!sInstanceMap.containsKey(appid)) {
                synchronized (EfsReporter.class) {
                    if (!sInstanceMap.containsKey(appid)) {
                        EfsReporter efsReporter = new EfsReporter(this);
                        sInstanceMap.put(appid, efsReporter);
                        return efsReporter;
                    }
                }
            }
            Log.w("efs.reporter.builder", "efs-core: duplicate init");
            checkParam(appid);
            return sInstanceMap.get(appid);
        }

        public Builder configRefreshAction(@NonNull IConfigRefreshAction iConfigRefreshAction) {
            c.a().f10351b = iConfigRefreshAction;
            return this;
        }

        public Builder configRefreshDelayMills(long j4) {
            this.mGlobalEnvStruct.configRefreshDelayMills = j4;
            return this;
        }

        public Builder debug(boolean z4) {
            this.mGlobalEnvStruct.setDebug(z4);
            return this;
        }

        public Builder efsDirRootName(String str) {
            a.a(str);
            return this;
        }

        public Builder enableSendLog(boolean z4) {
            this.mGlobalEnvStruct.setEnableSendLog(z4);
            return this;
        }

        public Builder enableWaStat(boolean z4) {
            this.mGlobalEnvStruct.setEnableWaStat(z4);
            return this;
        }

        public GlobalEnvStruct getGlobalEnvStruct() {
            return this.mGlobalEnvStruct;
        }

        public Builder intl(boolean z4) {
            this.mGlobalEnvStruct.setIsIntl(z4);
            return this;
        }

        public Builder logEncryptAction(ILogEncryptAction iLogEncryptAction) {
            this.mGlobalEnvStruct.setLogEncryptAction(iLogEncryptAction);
            return this;
        }

        public Builder maxConcurrentUploadCnt(int i4) {
            d.a().f10306a = i4;
            return this;
        }

        public Builder printLogDetail(boolean z4) {
            this.mGlobalEnvStruct.setPrintLogDetail(z4);
            return this;
        }

        public Builder publicParams(@NonNull IPublicParams iPublicParams) {
            if (iPublicParams.getRecordHeaders() != null && iPublicParams.getRecordHeaders().size() > 0) {
                this.mGlobalEnvStruct.addPublicParams(iPublicParams.getRecordHeaders());
            }
            return this;
        }

        public Builder uid(String str) {
            this.mGlobalEnvStruct.setUid(str);
            return this;
        }

        public Builder(@NonNull Context context, @NonNull String str, @NonNull String str2) {
            this.TAG = "efs.reporter.builder";
            Context checkContext = checkContext(context);
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    GlobalEnvStruct globalEnvStruct = new GlobalEnvStruct();
                    this.mGlobalEnvStruct = globalEnvStruct;
                    globalEnvStruct.mAppContext = checkContext;
                    globalEnvStruct.setAppid(str);
                    this.mGlobalEnvStruct.setSecret(str2);
                    return;
                }
                throw new RuntimeException("EfsReporter init, secret is empty");
            }
            throw new RuntimeException("EfsReporter init, appid is empty");
        }

        public Builder publicParams(@NonNull Map<String, String> map) {
            if (map.size() > 0) {
                this.mGlobalEnvStruct.addPublicParams(map);
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public GlobalEnvStruct getGlobalEnvStruct() {
        return ControllerCenter.getGlobalEnvStruct();
    }

    public void addPublicParams(@NonNull Map<String, String> map) {
        if (map.size() > 0) {
            getGlobalEnvStruct().addPublicParams(map);
        }
    }

    public void flushRecordLogImmediately(String str) {
        e a5 = a.b.a().f10287c.a((byte) 1);
        if (a5 != null) {
            a5.a(str);
        }
    }

    public Map<String, String> getAllConfig() {
        return c.a().c();
    }

    public void getAllSdkConfig(String[] strArr, IConfigCallback iConfigCallback) {
        c a5 = c.a();
        a5.f10354e.put(iConfigCallback, strArr);
        if (a5.f10353d.f10347g.isEmpty()) {
            return;
        }
        a5.d();
    }

    public Map<String, Object> getStrategyMap() {
        return new HashMap(c.a().f10353d.f10348h);
    }

    public void refreshConfig(String str) {
        c.a().a(str);
    }

    public void registerCallback(int i4, ValueCallback<Pair<Message, Message>> valueCallback) {
        getGlobalEnvStruct().registerCallback(i4, valueCallback);
    }

    public void send(ILogProtocol iLogProtocol) {
        sControllerCenter.send(iLogProtocol);
    }

    public HttpResponse sendSyncImediatelly(String str, int i4, String str2, File file) {
        return sendSyncImediatelly(str, i4, str2, true, file);
    }

    public void setEnableRefreshConfigFromRemote(boolean z4) {
        c.a().f10352c = z4;
    }

    private EfsReporter(Builder builder) {
        sControllerCenter = new ControllerCenter(builder);
    }

    public HttpResponse sendSyncImediatelly(String str, int i4, String str2, boolean z4, File file) {
        return sControllerCenter.sendSyncImmediately(str, i4, str2, z4, file);
    }

    public Map<String, Object> getAllSdkConfig() {
        return new HashMap(c.a().f10353d.f10347g);
    }
}
