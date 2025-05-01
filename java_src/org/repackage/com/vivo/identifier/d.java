package org.repackage.com.vivo.identifier;

import android.database.ContentObserver;
/* compiled from: IdentifierIdObserver.java */
/* loaded from: classes7.dex */
public class d extends ContentObserver {

    /* renamed from: d  reason: collision with root package name */
    private static final String f73064d = "VMS_SDK_Observer";

    /* renamed from: a  reason: collision with root package name */
    private String f73065a;

    /* renamed from: b  reason: collision with root package name */
    private int f73066b;

    /* renamed from: c  reason: collision with root package name */
    private c f73067c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(c cVar, int i4, String str) {
        super(null);
        this.f73067c = cVar;
        this.f73066b = i4;
        this.f73065a = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z4) {
        c cVar = this.f73067c;
        if (cVar != null) {
            cVar.l(this.f73066b, this.f73065a);
        }
    }
}
