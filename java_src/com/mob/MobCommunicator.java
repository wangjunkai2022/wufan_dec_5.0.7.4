package com.mob;

import com.mob.tools.network.NetCommunicator;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;
@Deprecated
/* loaded from: classes5.dex */
public final class MobCommunicator implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private NetCommunicator f56003a;

    /* loaded from: classes5.dex */
    public static class Callback<T> implements PublicMemberKeeper {
        public void onResultError(Throwable th) {
        }

        public void onResultOk(T t4) {
        }
    }

    /* loaded from: classes5.dex */
    public static class NetworkError extends Exception implements PublicMemberKeeper {
        private static final long serialVersionUID = -8447657431687664787L;

        public NetworkError(String str) {
            super(str);
        }
    }

    public MobCommunicator(int i4, String str, String str2) {
        this.f56003a = new NetCommunicator(i4, str, str2);
    }

    public static HashMap<String, String> getCommonDefaultHeaders() throws Throwable {
        return NetCommunicator.getCommonDefaultHeaders();
    }

    public <T> void request(HashMap<String, Object> hashMap, String str, boolean z4, Callback<T> callback) {
        request(true, null, hashMap, str, z4, callback);
    }

    public <T> T requestSynchronized(HashMap<String, Object> hashMap, String str, boolean z4) throws Throwable {
        return (T) requestSynchronized((HashMap<String, String>) null, hashMap, str, z4);
    }

    public void setThreadPool(ThreadPoolExecutor threadPoolExecutor) {
        this.f56003a.setThreadPool(threadPoolExecutor);
    }

    public <T> void request(HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z4, Callback<T> callback) {
        request(true, hashMap, hashMap2, str, z4, callback);
    }

    public <T> T requestSynchronized(HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z4) throws Throwable {
        return (T) requestSynchronized(true, hashMap, hashMap2, str, z4);
    }

    public <T> void request(boolean z4, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z5, final Callback<T> callback) {
        if (callback == null) {
            this.f56003a.request(z4, hashMap, hashMap2, str, z5, null);
        } else {
            this.f56003a.request(z4, hashMap, hashMap2, str, z5, new NetCommunicator.Callback<T>() { // from class: com.mob.MobCommunicator.1
                @Override // com.mob.tools.network.NetCommunicator.Callback
                public void onResultError(Throwable th) {
                    callback.onResultError(th);
                }

                @Override // com.mob.tools.network.NetCommunicator.Callback
                public void onResultOk(T t4) {
                    callback.onResultOk(t4);
                }
            });
        }
    }

    public <T> T requestSynchronized(String str, String str2, boolean z4) throws Throwable {
        return (T) requestSynchronized((HashMap<String, String>) null, str, str2, z4);
    }

    public <T> T requestSynchronized(HashMap<String, String> hashMap, String str, String str2, boolean z4) throws Throwable {
        return (T) requestSynchronized(true, hashMap, str, str2, z4);
    }

    public <T> T requestSynchronized(boolean z4, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z5) throws Throwable {
        return (T) this.f56003a.requestSynchronized(z4, hashMap, hashMap2, str, z5);
    }

    public <T> T requestSynchronized(boolean z4, HashMap<String, String> hashMap, String str, String str2, boolean z5) throws Throwable {
        return (T) this.f56003a.requestSynchronized(z4, hashMap, str, str2, z5);
    }
}
