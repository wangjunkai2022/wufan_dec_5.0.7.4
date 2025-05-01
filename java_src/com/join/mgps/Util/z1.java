package com.join.mgps.Util;

import android.content.Context;
import android.content.Intent;
import com.MApplication;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EBean;
/* compiled from: StartGame.java */
@EBean(scope = EBean.Scope.Singleton)
/* loaded from: classes3.dex */
public class z1 {

    /* renamed from: a  reason: collision with root package name */
    private static String f28159a = "z1";

    public void a(Context context, StartGameMeta startGameMeta) {
        StringBuilder sb = new StringBuilder();
        sb.append("method startGame() called.");
        sb.append(startGameMeta.toString());
        d(context, startGameMeta.getGameID());
        try {
            com.join.android.app.common.utils.e.l0(context).N(context, startGameMeta);
        } catch (Exception unused) {
        }
    }

    public void b(Context context, StartGameMeta startGameMeta) {
        StringBuilder sb = new StringBuilder();
        sb.append("method startNetBattleGame() called.gameId=");
        sb.append(startGameMeta.getGameID());
        MApplication.V = startGameMeta.getGroupId();
        com.join.android.app.common.utils.e.l0(context).T(context, startGameMeta);
        d(context, startGameMeta.getGameID());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void c(Context context, String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void d(Context context, String str) {
        p1.f.K().i0(str, true);
        Intent intent = new Intent(o1.a.f72008k);
        intent.putExtra("gameId", str);
        context.sendBroadcast(intent);
    }
}
