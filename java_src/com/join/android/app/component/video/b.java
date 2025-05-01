package com.join.android.app.component.video;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.join.android.app.mgsim.wufun.R;
import com.papa.gsyvideoplayer.video.base.GSYVideoPlayer;
/* compiled from: ListVideoManager.java */
/* loaded from: classes3.dex */
public class b extends com.papa.gsyvideoplayer.c {
    public static final int A = 2131297232;
    public static String B = "GSYVideoManager";

    /* renamed from: z  reason: collision with root package name */
    public static final int f15345z = 2131297233;

    public b() {
        P();
    }

    public static synchronized b d0(String str, String str2, int i4) {
        b o4;
        synchronized (b.class) {
            if (!TextUtils.isEmpty(str)) {
                o4 = g.o(str, str2, i4, true);
            } else {
                throw new IllegalStateException("key not be empty");
            }
        }
        return o4;
    }

    public static boolean e0(Activity activity) {
        View findViewById = ((ViewGroup) com.papa.gsyvideoplayer.utils.b.o(activity).findViewById(16908290)).findViewById(R.id.custom_full_id);
        return (findViewById != null ? (GSYVideoPlayer) findViewById : null) != null;
    }

    @Override // com.papa.gsyvideoplayer.c
    protected com.papa.gsyvideoplayer.player.c M() {
        return new com.papa.gsyvideoplayer.player.d();
    }

    public boolean c0(Context context) {
        boolean z4 = false;
        try {
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (com.papa.gsyvideoplayer.utils.b.o(context) == null) {
            return false;
        }
        if (((ViewGroup) com.papa.gsyvideoplayer.utils.b.o(context).findViewById(16908290)).findViewById(R.id.custom_full_id) != null) {
            z4 = true;
            com.papa.gsyvideoplayer.utils.b.k(context);
            if (p() != null) {
                p().onBackFullscreen();
            }
        }
        return z4;
    }

    public void f0() {
        if (w() != null) {
            w().onVideoPause();
        }
    }

    public void g0() {
        if (w() != null) {
            w().onVideoResume();
        }
    }

    public void h0(boolean z4) {
        if (w() != null) {
            w().onVideoResume(z4);
        }
    }

    public void i0() {
        if (w() != null) {
            w().onCompletion();
        }
        x();
    }
}
