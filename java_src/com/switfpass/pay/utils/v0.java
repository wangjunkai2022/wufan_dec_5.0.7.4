package com.switfpass.pay.utils;

import android.content.Context;
import android.content.DialogInterface;
import java.util.List;
/* loaded from: classes5.dex */
final class v0 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ List f61962b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Context f61963c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(List list, Context context) {
        this.f61962b = list;
        this.f61963c = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        if (((g) this.f61962b.get(i4)).c() != 0) {
            ((g) this.f61962b.get(i4)).f61880d.startActivityForResult(((g) this.f61962b.get(i4)).f61878b, ((g) this.f61962b.get(i4)).c());
        } else {
            this.f61963c.startActivity(((g) this.f61962b.get(i4)).f61878b);
        }
    }
}
