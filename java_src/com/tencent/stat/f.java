package com.tencent.stat;

import com.tencent.stat.common.StatLogger;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f62994a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f62995b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d f62996c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(d dVar, List list, c cVar) {
        this.f62996c = dVar;
        this.f62994a = list;
        this.f62995b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        StatLogger statLogger;
        try {
            this.f62996c.a(this.f62994a, this.f62995b);
        } catch (Throwable th) {
            statLogger = d.f62987c;
            statLogger.e(th);
        }
    }
}
