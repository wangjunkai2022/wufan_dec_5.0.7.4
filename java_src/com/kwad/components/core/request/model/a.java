package com.kwad.components.core.request.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.components.core.request.i;
import com.kwad.sdk.commercial.d.d;
import com.kwad.sdk.core.network.e;
import com.kwad.sdk.core.response.model.AdResultData;
import com.kwad.sdk.internal.api.SceneImpl;
import java.util.List;
/* loaded from: classes5.dex */
public final class a {
    @NonNull
    public final ImpInfo MX;
    @NonNull
    public final com.kwad.components.core.request.c Sb;
    @Nullable
    public i Sc;
    @Nullable
    public List<String> Sd;
    public boolean Se;
    public boolean Sf;
    @Nullable
    public c Sg;
    private String Sh;

    /* renamed from: com.kwad.components.core.request.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0475a {
        public ImpInfo MX;
        public com.kwad.components.core.request.c Sb;
        public boolean Se;
        public boolean Sf;
        public i Si;

        public final C0475a a(@NonNull com.kwad.components.core.request.c cVar) {
            this.Sb = cVar;
            return this;
        }

        public final C0475a aI(boolean z4) {
            this.Se = true;
            return this;
        }

        public final C0475a aJ(boolean z4) {
            this.Sf = z4;
            return this;
        }

        public final C0475a e(ImpInfo impInfo) {
            this.MX = impInfo;
            return this;
        }

        public final a ra() {
            if (com.kwad.components.ad.e.a.md.booleanValue() && (this.MX == null || this.Sb == null)) {
                throw new IllegalStateException("AdRequestParams build Illegal");
            }
            return new a(this, (byte) 0);
        }

        public final C0475a a(i iVar) {
            this.Si = iVar;
            return this;
        }
    }

    /* synthetic */ a(C0475a c0475a, byte b5) {
        this(c0475a);
    }

    public static void a(@NonNull a aVar, AdResultData adResultData, boolean z4) {
        d.a(aVar.MX.adScene, aVar.qZ(), adResultData.getAdSource());
        if (adResultData.isAdResultDataEmpty()) {
            aVar.Sb.a(e.awK.errorCode, TextUtils.isEmpty(adResultData.testErrorMsg) ? e.awK.msg : adResultData.testErrorMsg, z4);
        } else {
            aVar.Sb.a(adResultData, z4);
        }
    }

    public final void ay(String str) {
        this.Sh = str;
    }

    public final int getAdNum() {
        SceneImpl sceneImpl = this.MX.adScene;
        if (sceneImpl != null) {
            return sceneImpl.getAdNum();
        }
        return 1;
    }

    public final int getAdStyle() {
        SceneImpl sceneImpl = this.MX.adScene;
        if (sceneImpl != null) {
            return sceneImpl.adStyle;
        }
        return 0;
    }

    public final long getPosId() {
        SceneImpl sceneImpl = this.MX.adScene;
        if (sceneImpl != null) {
            return sceneImpl.getPosId();
        }
        return -1L;
    }

    @Nullable
    public final i qY() {
        return this.Sc;
    }

    public final String qZ() {
        return !TextUtils.isEmpty(this.Sh) ? this.Sh : "network_only";
    }

    private a(C0475a c0475a) {
        this.MX = c0475a.MX;
        this.Sb = c0475a.Sb;
        this.Se = c0475a.Se;
        this.Sf = c0475a.Sf;
        this.Sc = c0475a.Si;
    }

    public static void a(@NonNull a aVar, int i4, String str, boolean z4) {
        aVar.Sb.a(i4, str, z4);
        d.a(aVar.getAdStyle(), i4, str, aVar.qZ());
    }
}
