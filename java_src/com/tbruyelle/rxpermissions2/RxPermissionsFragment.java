package com.tbruyelle.rxpermissions2;

import android.annotation.TargetApi;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public class RxPermissionsFragment extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    private static final int f62130d = 42;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, PublishSubject<b>> f62131b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private boolean f62132c;

    public boolean V(@NonNull String str) {
        return this.f62131b.containsKey(str);
    }

    public PublishSubject<b> W(@NonNull String str) {
        return this.f62131b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(23)
    public boolean X(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity.checkSelfPermission(str) == 0;
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(23)
    public boolean Z(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity.getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a0(String str) {
        if (this.f62132c) {
            String str2 = c.f62146b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0(String[] strArr, int[] iArr, boolean[] zArr) {
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            a0("onRequestPermissionsResult  " + strArr[i4]);
            PublishSubject<b> publishSubject = this.f62131b.get(strArr[i4]);
            if (publishSubject == null) {
                String str = c.f62146b;
                return;
            }
            this.f62131b.remove(strArr[i4]);
            publishSubject.onNext(new b(strArr[i4], iArr[i4] == 0, zArr[i4]));
            publishSubject.onComplete();
        }
    }

    public void c0(boolean z4) {
        this.f62132c = z4;
    }

    public void d0(@NonNull String str, @NonNull PublishSubject<b> publishSubject) {
        this.f62131b.put(str, publishSubject);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    @TargetApi(23)
    public void onRequestPermissionsResult(int i4, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        if (i4 != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i5 = 0; i5 < strArr.length; i5++) {
            zArr[i5] = shouldShowRequestPermissionRationale(strArr[i5]);
        }
        b0(strArr, iArr, zArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(23)
    public void requestPermissions(@NonNull String[] strArr) {
        requestPermissions(strArr, 42);
    }
}
