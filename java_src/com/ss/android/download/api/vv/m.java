package com.ss.android.download.api.vv;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.ss.android.download.api.config.wv;
import com.ss.android.download.api.config.x;
/* loaded from: classes5.dex */
public class m implements wv {
    private x vv;

    @Override // com.ss.android.download.api.config.wv
    public void vv(@NonNull Activity activity, @NonNull String[] strArr, x xVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.vv = xVar;
            activity.requestPermissions(strArr, 1);
        } else if (xVar != null) {
            xVar.vv();
        }
    }

    @Override // com.ss.android.download.api.config.wv
    public boolean vv(@Nullable Context context, @NonNull String str) {
        return context != null && ContextCompat.checkSelfPermission(context, str) == 0;
    }

    @Override // com.ss.android.download.api.config.wv
    public void vv(@NonNull Activity activity, int i4, @NonNull String[] strArr, @NonNull int[] iArr) {
        x xVar;
        if (iArr.length <= 0 || (xVar = this.vv) == null) {
            return;
        }
        if (iArr[0] == -1) {
            xVar.vv(strArr[0]);
        } else if (iArr[0] == 0) {
            xVar.vv();
        }
    }
}
