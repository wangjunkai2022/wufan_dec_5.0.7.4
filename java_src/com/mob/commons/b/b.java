package com.mob.commons.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.mob.commons.C0811r;
import com.mob.commons.b.h;
/* loaded from: classes5.dex */
public class b extends h {
    public b(Context context) {
        super(context);
    }

    @Override // com.mob.commons.b.h
    protected Intent a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(C0811r.b("027b=cjceck?bNcjcj6fic$cbckcbFe=ccchFbe3chcbehcf$iiOcjciUh"), C0811r.b("043b%cjceck?bDcjcj-fic8cbckcb-e>ccch'beSchcbehcfWiiXcjci3hMckek3eJccchIbeLddcbdk5eDciccch*be")));
        return intent;
    }

    @Override // com.mob.commons.b.h
    public h.b a(IBinder iBinder) {
        h.b bVar = new h.b();
        bVar.f56222a = a(C0811r.b("004=cjWcVchcb"), iBinder, C0811r.b("044b,cjceckEb]cjcjVficCcbckcbBeOccchYbe$chcbehcf iiGcjci4h,ckddek5eEccch:be]ddcbgb<cdc!di=e2ci"), 2, this.f56215b);
        return bVar;
    }
}
