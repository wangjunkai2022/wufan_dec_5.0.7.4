package com.papa.gsyvideoplayer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.papa.gsyvideoplayer.video.base.GSYVideoPlayer;
/* compiled from: GSYVideoManager.java */
/* loaded from: classes5.dex */
public class d extends c {
    @SuppressLint({"StaticFieldLeak"})
    private static d C;

    /* renamed from: z  reason: collision with root package name */
    public static final int f58248z = R.id.small_id;
    public static final int A = R.id.full_id;
    public static String B = "GSYVideoManager";

    private d() {
        P();
    }

    public static boolean c0(Context context) {
        if (((ViewGroup) com.papa.gsyvideoplayer.utils.b.o(context).findViewById(16908290)).findViewById(A) != null) {
            com.papa.gsyvideoplayer.utils.b.k(context);
            if (e0().p() != null) {
                e0().p().onBackFullscreen();
                return true;
            }
            return true;
        }
        return false;
    }

    public static synchronized void d0(d dVar) {
        synchronized (d.class) {
            C = dVar;
        }
    }

    public static synchronized d e0() {
        d dVar;
        synchronized (d.class) {
            if (C == null) {
                C = new d();
            }
            dVar = C;
        }
        return dVar;
    }

    public static boolean f0(Activity activity) {
        View findViewById = ((ViewGroup) com.papa.gsyvideoplayer.utils.b.o(activity).findViewById(16908290)).findViewById(A);
        return (findViewById != null ? (GSYVideoPlayer) findViewById : null) != null;
    }

    public static void g0() {
        if (e0().w() != null) {
            e0().w().onVideoPause();
        }
    }

    public static void h0() {
        if (e0().w() != null) {
            e0().w().onVideoResume();
        }
    }

    public static void i0(boolean z4) {
        if (e0().w() != null) {
            e0().w().onVideoResume(z4);
        }
    }

    public static void j0() {
        if (e0().w() != null) {
            e0().w().onCompletion();
        }
        e0().x();
    }

    public static synchronized d k0(s2.a aVar) {
        d dVar;
        synchronized (d.class) {
            dVar = new d();
            d dVar2 = C;
            dVar.f58219o = dVar2.f58219o;
            dVar.f58211g = dVar2.f58211g;
            dVar.f58212h = dVar2.f58212h;
            dVar.f58215k = dVar2.f58215k;
            dVar.f58216l = dVar2.f58216l;
            dVar.f58205a = dVar2.f58205a;
            dVar.f58217m = dVar2.f58217m;
            dVar.f58218n = dVar2.f58218n;
            dVar.f58220p = dVar2.f58220p;
            dVar.f58221q = dVar2.f58221q;
            dVar.f58222r = dVar2.f58222r;
            dVar.z(aVar);
        }
        return dVar;
    }
}
