package com.papa.gsyvideoplayer;

import android.content.res.Configuration;
import android.view.View;
import com.papa.gsyvideoplayer.utils.n;
import com.papa.gsyvideoplayer.utils.o;
import com.papa.gsyvideoplayer.video.GSYADVideoPlayer;
import com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.papa.gsyvideoplayer.video.base.GSYVideoPlayer;
/* loaded from: classes5.dex */
public abstract class GSYBaseADActivityDetail<T extends GSYBaseVideoPlayer, R extends GSYADVideoPlayer> extends GSYBaseActivityDetail<T> {

    /* renamed from: e  reason: collision with root package name */
    protected o f58158e;

    /* loaded from: classes5.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GSYBaseADActivityDetail.this.t0();
            GSYBaseADActivityDetail.this.e0();
        }
    }

    /* loaded from: classes5.dex */
    class b extends s2.b {
        b() {
        }

        /* JADX WARN: Type inference failed for: r1v18, types: [com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer] */
        /* JADX WARN: Type inference failed for: r1v23, types: [com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer] */
        /* JADX WARN: Type inference failed for: r1v9, types: [com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer] */
        @Override // s2.b, s2.h
        public void onAutoComplete(String str, Object... objArr) {
            GSYBaseADActivityDetail.this.q0().getCurrentPlayer().release();
            GSYBaseADActivityDetail.this.q0().onVideoReset();
            GSYBaseADActivityDetail.this.q0().setVisibility(8);
            GSYBaseADActivityDetail.this.h0().getCurrentPlayer().startAfterPrepared();
            if (GSYBaseADActivityDetail.this.q0().getCurrentPlayer().isIfCurrentIsFullscreen()) {
                GSYBaseADActivityDetail.this.q0().b();
                if (GSYBaseADActivityDetail.this.h0().getCurrentPlayer().isIfCurrentIsFullscreen()) {
                    return;
                }
                GSYBaseADActivityDetail.this.o0();
                GSYBaseADActivityDetail.this.h0().setSaveBeforeFullSystemUiVisibility(GSYBaseADActivityDetail.this.q0().getSaveBeforeFullSystemUiVisibility());
            }
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer] */
        /* JADX WARN: Type inference failed for: r1v8, types: [com.papa.gsyvideoplayer.video.base.GSYBaseVideoPlayer] */
        @Override // s2.b, s2.h
        public void onQuitFullscreen(String str, Object... objArr) {
            o oVar = GSYBaseADActivityDetail.this.f58158e;
            if (oVar != null) {
                oVar.q();
            }
            if (GSYBaseADActivityDetail.this.h0().getCurrentPlayer().isIfCurrentIsFullscreen()) {
                GSYBaseADActivityDetail.this.h0().onBackFullscreen();
            }
        }

        @Override // s2.b, s2.h
        public void onStartPrepared(String str, Object... objArr) {
            super.onStartPrepared(str, objArr);
            GSYBaseADActivityDetail gSYBaseADActivityDetail = GSYBaseADActivityDetail.this;
            gSYBaseADActivityDetail.f58158e.I(gSYBaseADActivityDetail.f0());
        }
    }

    @Override // com.papa.gsyvideoplayer.GSYBaseActivityDetail
    public void e0() {
    }

    @Override // com.papa.gsyvideoplayer.GSYBaseActivityDetail
    public n i0() {
        return null;
    }

    @Override // com.papa.gsyvideoplayer.GSYBaseActivityDetail
    public void l0() {
        super.l0();
        o oVar = new o(this, q0(), i0());
        this.f58158e = oVar;
        oVar.I(false);
        if (q0().getFullscreenButton() != null) {
            q0().getFullscreenButton().setOnClickListener(new a());
        }
    }

    @Override // com.papa.gsyvideoplayer.GSYBaseActivityDetail
    public void m0() {
        super.m0();
        p0().T(new b()).a(q0());
    }

    @Override // com.papa.gsyvideoplayer.GSYBaseActivityDetail
    public void o0() {
        if (this.f58163d.r() != 1) {
            this.f58163d.E();
        }
        h0().startWindowFullscreen(this, j0(), k0());
    }

    @Override // com.papa.gsyvideoplayer.GSYBaseActivityDetail, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        o oVar = this.f58158e;
        if (oVar != null) {
            oVar.q();
        }
        if (com.papa.gsyvideoplayer.b.c0(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.papa.gsyvideoplayer.GSYBaseActivityDetail, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        boolean z4 = this.f58161b;
        if (!this.f58162c && q0().getVisibility() == 0 && r0()) {
            this.f58161b = false;
            q0().getCurrentPlayer().onConfigurationChanged(this, configuration, this.f58158e, j0(), k0());
        }
        super.onConfigurationChanged(configuration);
        this.f58161b = z4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.GSYBaseActivityDetail, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.papa.gsyvideoplayer.b.i0();
        o oVar = this.f58158e;
        if (oVar != null) {
            oVar.D();
        }
    }

    @Override // com.papa.gsyvideoplayer.GSYBaseActivityDetail, s2.h
    public void onEnterFullscreen(String str, Object... objArr) {
        super.onEnterFullscreen(str, objArr);
        ((GSYVideoPlayer) objArr[1]).getBackButton().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.GSYBaseActivityDetail, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.papa.gsyvideoplayer.b.f0();
    }

    @Override // com.papa.gsyvideoplayer.GSYBaseActivityDetail, s2.h
    public void onPrepared(String str, Object... objArr) {
        super.onPrepared(str, objArr);
        if (s0()) {
            u0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa.gsyvideoplayer.GSYBaseActivityDetail, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.papa.gsyvideoplayer.b.g0();
    }

    @Override // com.papa.gsyvideoplayer.GSYBaseActivityDetail, s2.h
    public void onStartPrepared(String str, Object... objArr) {
        super.onStartPrepared(str, objArr);
    }

    public abstract com.papa.gsyvideoplayer.builder.a p0();

    public abstract R q0();

    protected boolean r0() {
        return (q0().getCurrentPlayer().getCurrentState() < 0 || q0().getCurrentPlayer().getCurrentState() == 0 || q0().getCurrentPlayer().getCurrentState() == 6) ? false : true;
    }

    public abstract boolean s0();

    public void t0() {
        if (this.f58158e.r() != 1) {
            this.f58158e.E();
        }
        q0().startWindowFullscreen(this, j0(), k0());
    }

    public void u0() {
        q0().setVisibility(0);
        q0().startPlayLogic();
        if (h0().getCurrentPlayer().isIfCurrentIsFullscreen()) {
            t0();
            q0().setSaveBeforeFullSystemUiVisibility(h0().getSaveBeforeFullSystemUiVisibility());
        }
    }
}
