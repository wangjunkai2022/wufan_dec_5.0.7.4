package com.papa.gsyvideoplayer;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.papa.gsyvideoplayer.utils.n;
import com.papa.gsyvideoplayer.utils.o;
import com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import java.util.Objects;
import s2.h;
/* loaded from: classes5.dex */
public abstract class GSYBaseActivityDetail<T extends GSYBaseVideoPlayer> extends AppCompatActivity implements h {

    /* renamed from: b  reason: collision with root package name */
    protected boolean f58161b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f58162c;

    /* renamed from: d  reason: collision with root package name */
    protected o f58163d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GSYBaseActivityDetail.this.o0();
            GSYBaseActivityDetail.this.e0();
        }
    }

    public abstract void e0();

    public abstract boolean f0();

    public abstract com.papa.gsyvideoplayer.builder.a g0();

    public abstract T h0();

    public n i0() {
        return null;
    }

    public boolean j0() {
        return true;
    }

    public boolean k0() {
        return true;
    }

    public void l0() {
        o oVar = new o(this, h0(), i0());
        this.f58163d = oVar;
        oVar.I(false);
        if (h0().getFullscreenButton() != null) {
            h0().getFullscreenButton().setOnClickListener(new a());
        }
    }

    public void m0() {
        l0();
        g0().T(this).b(h0());
    }

    public boolean n0() {
        return false;
    }

    public void o0() {
        if (this.f58163d.r() != 1) {
            this.f58163d.E();
        }
        h0().startWindowFullscreen(this, j0(), k0());
    }

    @Override // s2.h
    public void onAutoComplete(String str, Object... objArr) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        o oVar = this.f58163d;
        if (oVar != null) {
            oVar.q();
        }
        if (d.c0(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // s2.h
    public void onClickBlank(String str, Object... objArr) {
    }

    @Override // s2.h
    public void onClickBlankFullscreen(String str, Object... objArr) {
    }

    @Override // s2.h
    public void onClickResume(String str, Object... objArr) {
    }

    @Override // s2.h
    public void onClickResumeFullscreen(String str, Object... objArr) {
    }

    @Override // s2.h
    public void onClickSeekbar(String str, Object... objArr) {
    }

    @Override // s2.h
    public void onClickSeekbarFullscreen(String str, Object... objArr) {
    }

    @Override // s2.h
    public void onClickStartError(String str, Object... objArr) {
    }

    @Override // s2.h
    public void onClickStartIcon(String str, Object... objArr) {
    }

    @Override // s2.h
    public void onClickStartThumb(String str, Object... objArr) {
    }

    @Override // s2.h
    public void onClickStop(String str, Object... objArr) {
    }

    @Override // s2.h
    public void onClickStopFullscreen(String str, Object... objArr) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.f58161b || this.f58162c) {
            return;
        }
        h0().onConfigurationChanged(this, configuration, this.f58163d, j0(), k0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f58161b) {
            h0().getCurrentPlayer().release();
        }
        o oVar = this.f58163d;
        if (oVar != null) {
            oVar.D();
        }
    }

    public void onEnterFullscreen(String str, Object... objArr) {
    }

    @Override // s2.h
    public void onEnterSmallWidget(String str, Object... objArr) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        h0().getCurrentPlayer().onVideoPause();
        o oVar = this.f58163d;
        if (oVar != null) {
            oVar.K(true);
        }
        this.f58162c = true;
    }

    @Override // s2.h
    public void onPlayError(String str, Object... objArr) {
    }

    public void onPrepared(String str, Object... objArr) {
        o oVar = this.f58163d;
        Objects.requireNonNull(oVar, "initVideo() or initVideoBuilderMode() first");
        oVar.I(f0() && !n0());
        this.f58161b = true;
    }

    @Override // s2.h
    public void onQuitFullscreen(String str, Object... objArr) {
        o oVar = this.f58163d;
        if (oVar != null) {
            oVar.q();
        }
    }

    @Override // s2.h
    public void onQuitSmallWidget(String str, Object... objArr) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        h0().getCurrentPlayer().onVideoResume();
        o oVar = this.f58163d;
        if (oVar != null) {
            oVar.K(false);
        }
        this.f58162c = false;
    }

    public void onStartPrepared(String str, Object... objArr) {
    }

    @Override // s2.h
    public void onTouchScreenSeekLight(String str, Object... objArr) {
    }

    @Override // s2.h
    public void onTouchScreenSeekPosition(String str, Object... objArr) {
    }

    @Override // s2.h
    public void onTouchScreenSeekVolume(String str, Object... objArr) {
    }
}
