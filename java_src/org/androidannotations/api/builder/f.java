package org.androidannotations.api.builder;

import android.app.Activity;
import android.content.Context;
/* compiled from: PostActivityStarter.java */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private Context f72060a;

    public f(Context context) {
        this.f72060a = context;
    }

    public void a(int i4, int i5) {
        Context context = this.f72060a;
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(i4, i5);
        }
    }
}
