package com.kwad.components.core.i;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.components.core.request.j;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.sdk.core.network.f;
import com.kwad.sdk.core.network.o;
import com.kwad.sdk.core.response.model.AdResultData;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.BaseResultData;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.bo;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public final class a {
    private static int Mw = 12;
    private static int Mx = 4;
    private static int My = 1;

    /* renamed from: com.kwad.components.core.i.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0462a {
        void e(@Nullable List<c> list);

        void onError(int i4, String str);

        void onRequestResult(int i4);
    }

    public static void a(@NonNull SceneImpl sceneImpl, InterfaceC0462a interfaceC0462a) {
        a(15, Mx, sceneImpl, e.AGGREGATION, interfaceC0462a);
    }

    private static void a(int i4, int i5, @NonNull SceneImpl sceneImpl, final int i6, final InterfaceC0462a interfaceC0462a) {
        SceneImpl m23clone = sceneImpl.m23clone();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        m23clone.setAdStyle(i4);
        m23clone.setAdNum(i5);
        a(new ImpInfo(m23clone), null, false, true, new j() { // from class: com.kwad.components.core.i.a.1
            @Override // com.kwad.components.core.request.k
            public final void a(@NonNull final AdResultData adResultData) {
                bo.runOnUiThread(new az() { // from class: com.kwad.components.core.i.a.1.2
                    @Override // com.kwad.sdk.utils.az
                    public final void doTask() {
                        try {
                            InterfaceC0462a.this.onRequestResult(adResultData.getAdTemplateList().size());
                        } catch (Throwable th) {
                            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                        }
                    }
                });
                bo.runOnUiThread(new az() { // from class: com.kwad.components.core.i.a.1.3
                    @Override // com.kwad.sdk.utils.az
                    public final void doTask() {
                        InterfaceC0462a.this.e(a.b(adResultData.getAdTemplateList(), i6));
                        a.a(adResultData, elapsedRealtime);
                    }
                });
            }

            @Override // com.kwad.components.core.request.k
            public final void onError(final int i7, final String str) {
                bo.runOnUiThread(new az() { // from class: com.kwad.components.core.i.a.1.1
                    @Override // com.kwad.sdk.utils.az
                    public final void doTask() {
                        com.kwad.sdk.core.e.c.w("RefluxAdLoadManager", "loadInnerAd onError:" + String.format("code:%s__msg:%s", Integer.valueOf(i7), str));
                        InterfaceC0462a.this.onError(i7, str);
                    }
                });
            }
        }, false);
    }

    public static void b(@NonNull SceneImpl sceneImpl, InterfaceC0462a interfaceC0462a) {
        a(17, My, sceneImpl, e.MI, interfaceC0462a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<c> b(List<AdTemplate> list, int i4) {
        ArrayList arrayList = new ArrayList();
        for (AdTemplate adTemplate : list) {
            arrayList.add(new c(adTemplate, i4));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AdResultData adResultData, long j4) {
        AdTemplate adTemplate;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (adResultData.getAdTemplateList().size() <= 0 || (adTemplate = adResultData.getAdTemplateList().get(0)) == null) {
            return;
        }
        com.kwad.components.core.o.a.qI().g(adTemplate, elapsedRealtime - j4);
    }

    private static void a(final ImpInfo impInfo, List<String> list, boolean z4, boolean z5, @NonNull final j jVar, boolean z6) {
        new com.kwad.components.core.m.a(impInfo) { // from class: com.kwad.components.core.i.a.2
            @Override // com.kwad.components.core.m.a, com.kwad.sdk.core.network.a
            @NonNull
            /* renamed from: no */
            public final com.kwad.components.core.request.a createRequest() {
                com.kwad.components.core.request.a aVar = new com.kwad.components.core.request.a(impInfo, r3, r4, null);
                aVar.aF(r5 ? 1 : 0);
                return aVar;
            }
        }.request(new o<com.kwad.components.core.request.a, AdResultData>() { // from class: com.kwad.components.core.i.a.3
            private void c(@NonNull AdResultData adResultData) {
                if (adResultData.isAdResultDataEmpty() && !r1) {
                    jVar.onError(com.kwad.sdk.core.network.e.awK.errorCode, TextUtils.isEmpty(adResultData.testErrorMsg) ? com.kwad.sdk.core.network.e.awK.msg : adResultData.testErrorMsg);
                } else {
                    jVar.a(adResultData);
                }
            }

            private void h(int i4, String str) {
                jVar.onError(i4, str);
            }

            @Override // com.kwad.sdk.core.network.o, com.kwad.sdk.core.network.g
            public final /* synthetic */ void onError(@NonNull f fVar, int i4, String str) {
                h(i4, str);
            }

            @Override // com.kwad.sdk.core.network.o, com.kwad.sdk.core.network.g
            public final /* synthetic */ void onSuccess(@NonNull f fVar, @NonNull BaseResultData baseResultData) {
                c((AdResultData) baseResultData);
            }
        });
    }
}
