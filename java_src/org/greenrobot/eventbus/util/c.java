package org.greenrobot.eventbus.util;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;
import org.greenrobot.eventbus.util.ErrorDialogFragments;
/* compiled from: ErrorDialogFragmentFactory.java */
/* loaded from: classes7.dex */
public abstract class c<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final org.greenrobot.eventbus.util.b f72431a;

    /* compiled from: ErrorDialogFragmentFactory.java */
    @TargetApi(11)
    /* loaded from: classes7.dex */
    public static class a extends c<Fragment> {
        public a(org.greenrobot.eventbus.util.b bVar) {
            super(bVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.greenrobot.eventbus.util.c
        /* renamed from: e */
        public Fragment a(f fVar, Bundle bundle) {
            ErrorDialogFragments.Honeycomb honeycomb = new ErrorDialogFragments.Honeycomb();
            honeycomb.setArguments(bundle);
            return honeycomb;
        }
    }

    /* compiled from: ErrorDialogFragmentFactory.java */
    /* loaded from: classes7.dex */
    public static class b extends c<androidx.fragment.app.Fragment> {
        public b(org.greenrobot.eventbus.util.b bVar) {
            super(bVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.greenrobot.eventbus.util.c
        /* renamed from: e */
        public androidx.fragment.app.Fragment a(f fVar, Bundle bundle) {
            ErrorDialogFragments.Support support = new ErrorDialogFragments.Support();
            support.setArguments(bundle);
            return support;
        }
    }

    protected c(org.greenrobot.eventbus.util.b bVar) {
        this.f72431a = bVar;
    }

    protected abstract T a(f fVar, Bundle bundle);

    protected String b(f fVar, Bundle bundle) {
        return this.f72431a.f72422a.getString(this.f72431a.d(fVar.f72433a));
    }

    protected String c(f fVar, Bundle bundle) {
        org.greenrobot.eventbus.util.b bVar = this.f72431a;
        return bVar.f72422a.getString(bVar.f72423b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T d(f fVar, boolean z4, Bundle bundle) {
        Bundle bundle2;
        int i4;
        Class<?> cls;
        if (fVar.d()) {
            return null;
        }
        if (bundle != null) {
            bundle2 = (Bundle) bundle.clone();
        } else {
            bundle2 = new Bundle();
        }
        if (!bundle2.containsKey(ErrorDialogManager.f72399d)) {
            bundle2.putString(ErrorDialogManager.f72399d, c(fVar, bundle2));
        }
        if (!bundle2.containsKey(ErrorDialogManager.f72400e)) {
            bundle2.putString(ErrorDialogManager.f72400e, b(fVar, bundle2));
        }
        if (!bundle2.containsKey(ErrorDialogManager.f72401f)) {
            bundle2.putBoolean(ErrorDialogManager.f72401f, z4);
        }
        if (!bundle2.containsKey(ErrorDialogManager.f72403h) && (cls = this.f72431a.f72430i) != null) {
            bundle2.putSerializable(ErrorDialogManager.f72403h, cls);
        }
        if (!bundle2.containsKey(ErrorDialogManager.f72402g) && (i4 = this.f72431a.f72429h) != 0) {
            bundle2.putInt(ErrorDialogManager.f72402g, i4);
        }
        return a(fVar, bundle2);
    }
}
