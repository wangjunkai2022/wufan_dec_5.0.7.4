package com.aggmoread.sdk.z.c.a.a.e.q;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.aggmoread.sdk.z.c.a.a.d.b.j;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class e extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f3537a;

    public e(Context context) {
        super(context);
        this.f3537a = new WeakReference<>(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void sendBroadcast(Intent intent) {
        j.f3429q.sendBroadcast(intent);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        j.f3429q.startActivity(intent);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, @Nullable Bundle bundle) {
        Context context = this.f3537a.get();
        if (context == null) {
            j.f3429q.startActivity(intent);
        } else if (Build.VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ComponentName startService(Intent intent) {
        return j.f3429q.startService(intent);
    }
}
