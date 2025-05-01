package com.join.mgps.Util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import com.join.android.app.mgsim.wufun.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PermissionUtil.java */
/* loaded from: classes3.dex */
public class n1 {

    /* renamed from: a  reason: collision with root package name */
    private static n1 f27948a = null;

    /* renamed from: b  reason: collision with root package name */
    private static List<String> f27949b = null;

    /* renamed from: c  reason: collision with root package name */
    private static final String f27950c = "android.permission.WRITE_EXTERNAL_STORAGE";

    /* renamed from: d  reason: collision with root package name */
    private static final String f27951d = "android.permission.READ_PHONE_STATE";

    /* renamed from: e  reason: collision with root package name */
    private static final String f27952e = "android.permission.CAMERA";

    /* compiled from: PermissionUtil.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b(String str);

        void c();
    }

    private void a(List<String> list) {
        list.add("android.permission.WRITE_EXTERNAL_STORAGE");
        list.add(f27952e);
    }

    public static n1 c() {
        if (f27948a == null) {
            f27948a = new n1();
        }
        return f27948a;
    }

    @TargetApi(23)
    public List<String> b(Activity activity, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (activity.checkSelfPermission(str) != 0) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public boolean d() {
        return Build.VERSION.SDK_INT >= 23;
    }

    @TargetApi(23)
    public void e(Activity activity, int i4, String str, a aVar) {
        ArrayList arrayList = new ArrayList();
        if (d()) {
            arrayList.add(str);
            List<String> b5 = b(activity, arrayList);
            if (b5 != null && b5.size() > 0) {
                activity.requestPermissions((String[]) b5.toArray(new String[b5.size()]), i4);
            } else {
                aVar.a();
            }
        }
    }

    public void f(Activity activity, String[] strArr, int[] iArr, a aVar) {
        f27949b = new ArrayList();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (iArr[i4] != 0 && d()) {
                boolean shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(strArr[i4]);
                f27949b.add(strArr[i4]);
                if (shouldShowRequestPermissionRationale) {
                    arrayList.add(strArr[i4]);
                } else {
                    arrayList2.add(strArr[i4]);
                }
            }
        }
        if (arrayList.size() > 0) {
            aVar.c();
        } else if (arrayList2.size() > 0) {
            ArrayList arrayList3 = new ArrayList();
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                String str = (String) arrayList2.get(i5);
                if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str)) {
                    arrayList3.add("存储权限");
                } else if ("android.permission.READ_PHONE_STATE".equals(str)) {
                    arrayList3.add("设备信息");
                }
            }
            aVar.b(String.format("权限信息", activity.getString(R.string.app_name), arrayList3.toString().replace("[", "").replace("]", "").replace(",", "、"), m.a.f71493g));
        } else {
            aVar.a();
        }
    }

    @TargetApi(23)
    public void requestPermissions(Activity activity, int i4, a aVar) {
        List<String> list = f27949b;
        if (list == null || list.size() == 0) {
            ArrayList arrayList = new ArrayList();
            f27949b = arrayList;
            a(arrayList);
        }
        if (d()) {
            List<String> b5 = b(activity, f27949b);
            f27949b = b5;
            if (b5 != null && b5.size() > 0) {
                List<String> list2 = f27949b;
                activity.requestPermissions((String[]) list2.toArray(new String[list2.size()]), i4);
                return;
            }
            aVar.a();
        }
    }
}
