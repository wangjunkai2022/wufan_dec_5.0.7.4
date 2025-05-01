package com.kwad.components.ad.reward.presenter.platdetail.actionbar;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.components.ad.reward.g;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.az;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes5.dex */
public final class RewardActionBarControl {
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private Context mContext;
    private g qp;
    private b uF;
    @Nullable
    private d uJ;
    @Nullable
    private c uK;
    private final long uM;
    @NonNull
    private a uL = new a((byte) 0);
    private Handler fS = new Handler(Looper.getMainLooper());
    private boolean uN = false;
    private boolean uO = false;

    /* loaded from: classes5.dex */
    public enum ShowActionBarResult {
        SHOW_NATIVE_DEFAULT,
        SHOW_H5_SUCCESS,
        SHOW_H5_FAILURE,
        SHOW_ORDER,
        SHOW_NATIVE_ORDER,
        SHOW_NATIVE_JINNIU,
        SHOW_NATIVE_PLAYABLE_PORTRAIT,
        SHOW_NATIVE_LIVE_SUBSCRIBE,
        SHOW_NATIVE_ORIGIN_LIVE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a implements com.kwad.components.ad.reward.presenter.platdetail.actionbar.a {
        private List<com.kwad.components.ad.reward.presenter.platdetail.actionbar.a> uT;
        private ShowActionBarResult uU;

        private a() {
            this.uT = new CopyOnWriteArrayList();
        }

        public final void c(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar) {
            this.uT.add(aVar);
        }

        public final void d(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar) {
            this.uT.remove(aVar);
        }

        @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.a
        public final void a(ShowActionBarResult showActionBarResult, View view) {
            com.kwad.sdk.core.e.c.d("ActionBarControl", "onActionBarShown result: " + showActionBarResult);
            this.uU = showActionBarResult;
            for (com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar : this.uT) {
                aVar.a(showActionBarResult, view);
            }
        }

        /* synthetic */ a(byte b5) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a(boolean z4, com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar);
    }

    /* loaded from: classes5.dex */
    public interface c {
        void e(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar);
    }

    /* loaded from: classes5.dex */
    public interface d {
        boolean f(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar);
    }

    public RewardActionBarControl(g gVar, Context context, AdTemplate adTemplate) {
        this.qp = gVar;
        this.mContext = context;
        this.mAdTemplate = adTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        long cn2 = com.kwad.sdk.core.response.b.b.cn(adTemplate) > 0 ? com.kwad.sdk.core.response.b.b.cn(adTemplate) : 1000L;
        this.uM = cn2 > 0 ? cn2 : 1000L;
    }

    private ShowActionBarResult P(boolean z4) {
        c cVar;
        if (com.kwad.components.ad.reward.a.b.i(this.mAdInfo) && (cVar = this.uK) != null) {
            cVar.e(this.uL);
            return ShowActionBarResult.SHOW_ORDER;
        } else if (com.kwad.sdk.core.response.b.b.co(this.mAdTemplate) && !com.kwad.sdk.core.response.b.a.bc(this.mAdInfo) && this.uJ != null) {
            com.kwad.sdk.core.e.c.d("ActionBarControl", "showWebActionBar success in " + this.uM);
            if (this.uJ.f(this.uL)) {
                return ShowActionBarResult.SHOW_H5_SUCCESS;
            }
            return ShowActionBarResult.SHOW_H5_FAILURE;
        } else {
            Q(z4);
            return ShowActionBarResult.SHOW_NATIVE_DEFAULT;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(boolean z4) {
        if (this.uF != null) {
            com.kwad.sdk.core.e.c.d("ActionBarControl", "showNativeActionBar");
            this.uO = true;
            this.uF.a(z4, this.uL);
        }
    }

    public final void O(boolean z4) {
        ShowActionBarResult P = P(z4);
        com.kwad.sdk.core.e.c.d("ActionBarControl", "showActionBarOnVideoStart result: " + P);
        if (P != ShowActionBarResult.SHOW_H5_FAILURE) {
            return;
        }
        this.fS.postDelayed(new az() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.1
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                RewardActionBarControl.a(RewardActionBarControl.this, true);
                com.kwad.sdk.core.e.c.d("ActionBarControl", "mHasOutTime");
                if (RewardActionBarControl.this.uJ != null && !RewardActionBarControl.this.uO && RewardActionBarControl.this.uJ.f(RewardActionBarControl.this.uL)) {
                    com.kwad.sdk.core.e.c.d("ActionBarControl", "showWebActionBar success on " + RewardActionBarControl.this.uM);
                    return;
                }
                com.kwad.sdk.core.e.c.d("ActionBarControl", "showWebActionBar out " + RewardActionBarControl.this.uM);
                com.kwad.components.core.o.a.qI().i(RewardActionBarControl.this.mAdTemplate, RewardActionBarControl.this.uM);
                com.kwad.components.ad.reward.monitor.c.a(RewardActionBarControl.this.qp.mAdTemplate, RewardActionBarControl.this.qp.oZ, "play_card", com.kwad.sdk.core.response.b.b.cm(RewardActionBarControl.this.qp.mAdTemplate), RewardActionBarControl.this.uM, 1);
                RewardActionBarControl.this.Q(true);
            }
        }, this.uM);
    }

    public final void ig() {
        if (this.uN) {
            com.kwad.sdk.core.e.c.i("ActionBarControl", "showWebActionBar time out on pageStatus");
            return;
        }
        this.fS.removeCallbacksAndMessages(null);
        P(true);
    }

    @Nullable
    public final ShowActionBarResult ih() {
        return this.uL.uU;
    }

    static /* synthetic */ boolean a(RewardActionBarControl rewardActionBarControl, boolean z4) {
        rewardActionBarControl.uN = true;
        return true;
    }

    @MainThread
    public final void a(b bVar) {
        this.uF = bVar;
    }

    public final void b(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar) {
        this.uL.d(aVar);
    }

    @MainThread
    public final void a(d dVar) {
        this.uJ = dVar;
    }

    @MainThread
    public final void a(@Nullable c cVar) {
        this.uK = cVar;
    }

    public final void a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar) {
        this.uL.c(aVar);
    }

    public static void a(final com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar, final View view, final ShowActionBarResult showActionBarResult) {
        if (aVar != null) {
            view.post(new az() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.2
                @Override // com.kwad.sdk.utils.az
                public final void doTask() {
                    com.kwad.components.ad.reward.presenter.platdetail.actionbar.a.this.a(showActionBarResult, view);
                }
            });
        }
    }
}
