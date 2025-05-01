package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.r;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: BaseNetworkFetcher.java */
/* loaded from: classes.dex */
public abstract class c<FETCH_STATE extends r> implements d0<FETCH_STATE> {
    @Override // com.facebook.imagepipeline.producers.d0
    public void b(FETCH_STATE fetch_state, int i4) {
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public boolean c(FETCH_STATE fetch_state) {
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    @Nullable
    public Map<String, String> d(FETCH_STATE fetch_state, int i4) {
        return null;
    }
}
