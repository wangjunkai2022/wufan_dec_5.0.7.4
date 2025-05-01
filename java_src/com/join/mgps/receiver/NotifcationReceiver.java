package com.join.mgps.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.MApplication;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.servcie.i;
import com.join.android.app.common.utils.APKUtils;
import com.join.mgps.activity.AppDownFinishDialogActivity;
import com.join.mgps.activity.MGMainActivity_;
import com.join.mgps.activity.ModGameIndexActivity_;
import com.join.mgps.activity.MyGameManagerActivity_;
import com.join.mgps.event.o;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import o1.a;
import org.greenrobot.eventbus.c;
import p1.f;
/* loaded from: classes4.dex */
public class NotifcationReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f53994a = "_task_id";

    /* renamed from: b  reason: collision with root package name */
    public static final String f53995b = "_game_down_status";

    private void a(Context context) {
        Intent intent = new Intent(context, MGMainActivity_.class);
        intent.setFlags(335544320);
        Bundle bundle = new Bundle();
        bundle.putInt("MainPos", 2);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    private void b(Intent intent) {
        String stringExtra = intent.getStringExtra(f53994a);
        DownloadTask f5 = i.e().f(stringExtra);
        if (f5 == null) {
            f5 = f.K().F(stringExtra);
        }
        if (f5 != null) {
            f5.setHasDeleteNotify(true);
        }
    }

    private boolean c(Intent intent) {
        return APKUtils.G(f.K().F(intent.getStringExtra(f53994a)));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        MApplication.f1497x.G(true);
        if (a.f72019p0.equals(intent.getAction())) {
            b(intent);
        } else if (a.f72021q0.equals(intent.getAction())) {
            if (MApplication.C1) {
                a(context);
            } else if (MApplication.f1497x.getActivity() != null) {
                c.f().o(new o(AppDownFinishDialogActivity.class));
                Bundle extras = intent.getExtras();
                Intent intent2 = new Intent(context, ModGameIndexActivity_.class);
                intent2.putExtras(extras);
                intent2.setFlags(536870912);
                context.startActivity(intent2);
            } else {
                a(context);
            }
            p.l(context).O1(Event.onclickNotbarDownloaded, new Ext().setGameFlag(c(intent) ? 1 : 0));
        } else if (a.f72023r0.equals(intent.getAction())) {
            if (MApplication.C1) {
                a(context);
            } else if (MApplication.f1497x.getActivity() != null) {
                Intent intent3 = new Intent(MApplication.f1497x.getActivity(), MyGameManagerActivity_.class);
                intent3.setFlags(536870912);
                MApplication.f1497x.getActivity().startActivity(intent3);
            } else {
                a(context);
            }
            if (intent.getIntExtra(f53995b, 0) == 1) {
                p.l(context).O1(Event.onclickNotbarDownloaded, new Ext().setGameFlag(c(intent) ? 1 : 0));
            } else {
                p.l(context).O1(Event.onclickNotbarDownloading, new Ext().setGameFlag(c(intent) ? 1 : 0));
            }
        }
    }
}
