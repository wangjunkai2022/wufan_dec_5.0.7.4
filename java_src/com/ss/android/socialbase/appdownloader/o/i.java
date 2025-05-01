package com.ss.android.socialbase.appdownloader.o;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationManagerCompat;
import com.ss.android.socialbase.appdownloader.p.t;
import com.ss.android.socialbase.appdownloader.wv;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public class i {

    /* renamed from: i  reason: collision with root package name */
    private static AlertDialog f60823i = null;

    /* renamed from: m  reason: collision with root package name */
    private static List<t> f60824m = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    private static com.ss.android.socialbase.appdownloader.view.vv f60825p = null;
    private static final String vv = "i";

    public static void m(@NonNull Activity activity, @NonNull t tVar) {
        if (activity != null) {
            try {
                if (!activity.isFinishing()) {
                    FragmentManager fragmentManager = activity.getFragmentManager();
                    String str = vv;
                    com.ss.android.socialbase.appdownloader.view.vv vvVar = (com.ss.android.socialbase.appdownloader.view.vv) fragmentManager.findFragmentByTag(str);
                    f60825p = vvVar;
                    if (vvVar == null) {
                        f60825p = new com.ss.android.socialbase.appdownloader.view.vv();
                        fragmentManager.beginTransaction().add(f60825p, str).commitAllowingStateLoss();
                        fragmentManager.executePendingTransactions();
                    }
                    f60825p.vv();
                    return;
                }
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    tVar.vv();
                    return;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            }
        }
        tVar.vv();
    }

    public static boolean vv() {
        try {
            return NotificationManagerCompat.from(com.ss.android.socialbase.downloader.downloader.p.ky()).areNotificationsEnabled();
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    public static synchronized void vv(boolean z4) {
        synchronized (i.class) {
            try {
                AlertDialog alertDialog = f60823i;
                if (alertDialog != null) {
                    alertDialog.cancel();
                    f60823i = null;
                }
                for (t tVar : f60824m) {
                    if (tVar != null) {
                        if (z4) {
                            tVar.vv();
                        } else {
                            tVar.m();
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static synchronized void vv(@NonNull final Activity activity, @NonNull final t tVar) {
        synchronized (i.class) {
            if (tVar == null) {
                return;
            }
            if (activity != null) {
                try {
                    if (!activity.isFinishing()) {
                        int vv2 = wv.vv(com.ss.android.socialbase.downloader.downloader.p.ky(), "tt_appdownloader_notification_request_title");
                        int vv3 = wv.vv(com.ss.android.socialbase.downloader.downloader.p.ky(), "tt_appdownloader_notification_request_message");
                        int vv4 = wv.vv(com.ss.android.socialbase.downloader.downloader.p.ky(), "tt_appdownloader_notification_request_btn_yes");
                        int vv5 = wv.vv(com.ss.android.socialbase.downloader.downloader.p.ky(), "tt_appdownloader_notification_request_btn_no");
                        f60824m.add(tVar);
                        AlertDialog alertDialog = f60823i;
                        if (alertDialog == null || !alertDialog.isShowing()) {
                            f60823i = new AlertDialog.Builder(activity).setTitle(vv2).setMessage(vv3).setPositiveButton(vv4, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.o.i.3
                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i4) {
                                    i.m(activity, tVar);
                                    dialogInterface.cancel();
                                    AlertDialog unused = i.f60823i = null;
                                }
                            }).setNegativeButton(vv5, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.o.i.2
                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i4) {
                                    i.vv(false);
                                }
                            }).setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.ss.android.socialbase.appdownloader.o.i.1
                                @Override // android.content.DialogInterface.OnKeyListener
                                public boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
                                    if (i4 == 4) {
                                        if (keyEvent.getAction() == 1) {
                                            i.vv(false);
                                        }
                                        return true;
                                    }
                                    return false;
                                }
                            }).setCancelable(false).show();
                        }
                        return;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    vv(false);
                    return;
                }
            }
            tVar.m();
        }
    }
}
