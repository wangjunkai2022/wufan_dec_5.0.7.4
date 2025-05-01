package com.ss.android.download.api.vv;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ss.android.download.api.config.jh;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.model.m;
/* loaded from: classes5.dex */
public class vv implements jh {
    @Override // com.ss.android.download.api.config.jh
    public Dialog m(@NonNull com.ss.android.download.api.model.m mVar) {
        return vv(mVar);
    }

    @Override // com.ss.android.download.api.config.jh
    public void vv(int i4, @Nullable Context context, DownloadModel downloadModel, String str, Drawable drawable, int i5) {
        Toast.makeText(context, str, 0).show();
    }

    private static Dialog vv(final com.ss.android.download.api.model.m mVar) {
        if (mVar == null) {
            return null;
        }
        AlertDialog show = new AlertDialog.Builder(mVar.vv).setTitle(mVar.f60305m).setMessage(mVar.f60308p).setPositiveButton(mVar.f60303i, new DialogInterface.OnClickListener() { // from class: com.ss.android.download.api.vv.vv.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                m.InterfaceC0608m interfaceC0608m = com.ss.android.download.api.model.m.this.qv;
                if (interfaceC0608m != null) {
                    interfaceC0608m.vv(dialogInterface);
                }
            }
        }).setNegativeButton(mVar.f60307o, new DialogInterface.OnClickListener() { // from class: com.ss.android.download.api.vv.vv.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                m.InterfaceC0608m interfaceC0608m = com.ss.android.download.api.model.m.this.qv;
                if (interfaceC0608m != null) {
                    interfaceC0608m.m(dialogInterface);
                }
            }
        }).show();
        show.setCanceledOnTouchOutside(mVar.f60309u);
        show.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.ss.android.download.api.vv.vv.3
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                m.InterfaceC0608m interfaceC0608m = com.ss.android.download.api.model.m.this.qv;
                if (interfaceC0608m != null) {
                    interfaceC0608m.p(dialogInterface);
                }
            }
        });
        Drawable drawable = mVar.f60306n;
        if (drawable != null) {
            show.setIcon(drawable);
        }
        return show;
    }
}
