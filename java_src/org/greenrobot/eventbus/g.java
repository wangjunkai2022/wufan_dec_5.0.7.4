package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PendingPost.java */
/* loaded from: classes7.dex */
final class g {

    /* renamed from: d  reason: collision with root package name */
    private static final List<g> f72349d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    Object f72350a;

    /* renamed from: b  reason: collision with root package name */
    l f72351b;

    /* renamed from: c  reason: collision with root package name */
    g f72352c;

    private g(Object obj, l lVar) {
        this.f72350a = obj;
        this.f72351b = lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g a(l lVar, Object obj) {
        List<g> list = f72349d;
        synchronized (list) {
            int size = list.size();
            if (size > 0) {
                g remove = list.remove(size - 1);
                remove.f72350a = obj;
                remove.f72351b = lVar;
                remove.f72352c = null;
                return remove;
            }
            return new g(obj, lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(g gVar) {
        gVar.f72350a = null;
        gVar.f72351b = null;
        gVar.f72352c = null;
        List<g> list = f72349d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(gVar);
            }
        }
    }
}
