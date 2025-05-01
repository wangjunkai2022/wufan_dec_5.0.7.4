package com.mob.commons.cc;

import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import java.io.OutputStream;
import java.util.HashMap;
/* loaded from: classes5.dex */
public class d implements t<d> {

    /* renamed from: a  reason: collision with root package name */
    private static final NetworkHelper f56268a = new NetworkHelper();

    public static String a(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) throws Throwable {
        return f56268a.httpGet(str, hashMap, hashMap2);
    }

    public static String a(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2, NetworkHelper.NetworkTimeOut networkTimeOut) throws Throwable {
        return f56268a.httpPostNew(str, hashMap, hashMap2, networkTimeOut);
    }

    public static void a(String str, OutputStream outputStream, NetworkHelper.NetworkTimeOut networkTimeOut) throws Throwable {
        f56268a.download(str, outputStream, networkTimeOut);
    }

    public static <T> T a(NetCommunicator netCommunicator, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z4) throws Throwable {
        return (T) netCommunicator.requestSynchronized(false, hashMap, hashMap2, str, z4);
    }

    @Override // com.mob.commons.cc.t
    public boolean a(d dVar, Class<d> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if ("hGet".equals(str)) {
            try {
                objArr2[0] = a((String) objArr[0], (HashMap) objArr[1], (HashMap) objArr[2]);
            } catch (Throwable th) {
                thArr[0] = th;
                objArr2[0] = null;
            }
            return true;
        } else if (com.kuaishou.weapon.p0.t.f55700s.equals(str)) {
            try {
                objArr2[0] = a((String) objArr[0], (HashMap) objArr[1], (HashMap) objArr[2], (NetworkHelper.NetworkTimeOut) objArr[3]);
            } catch (Throwable th2) {
                thArr[0] = th2;
                objArr2[0] = null;
            }
            return true;
        } else if (com.mob.commons.a.l.a("0087edelghXfh+el0e8ed").equals(str)) {
            try {
                a((String) objArr[0], (OutputStream) objArr[1], (NetworkHelper.NetworkTimeOut) objArr[2]);
            } catch (Throwable th3) {
                thArr[0] = th3;
                objArr2[0] = null;
            }
            return true;
        } else if (com.mob.commons.a.l.a("007*ek:gUeffmfd!fd").equals(str)) {
            try {
                objArr2[0] = a((NetCommunicator) objArr[0], (HashMap) objArr[1], (HashMap) objArr[2], (String) objArr[3], ((Boolean) objArr[4]).booleanValue());
            } catch (Throwable th4) {
                thArr[0] = th4;
                objArr2[0] = null;
            }
            return true;
        } else {
            return false;
        }
    }
}
