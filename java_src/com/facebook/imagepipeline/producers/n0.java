package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: QualifiedResourceFetchProducer.java */
/* loaded from: classes2.dex */
public class n0 extends x {

    /* renamed from: d  reason: collision with root package name */
    public static final String f12315d = "QualifiedResourceFetchProducer";

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f12316c;

    public n0(Executor executor, com.facebook.common.memory.g gVar, ContentResolver contentResolver) {
        super(executor, gVar);
        this.f12316c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.x
    protected com.facebook.imagepipeline.image.e d(ImageRequest imageRequest) throws IOException {
        return e(this.f12316c.openInputStream(imageRequest.t()), -1);
    }

    @Override // com.facebook.imagepipeline.producers.x
    protected String f() {
        return f12315d;
    }
}
