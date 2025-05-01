package com.alipay.sdk.widget;

import android.content.DialogInterface;
import android.view.KeyEvent;
/* loaded from: classes2.dex */
final class e implements DialogInterface.OnKeyListener {
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
        return i4 == 4;
    }
}
