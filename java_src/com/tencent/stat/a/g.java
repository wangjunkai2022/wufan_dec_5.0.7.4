package com.tencent.stat.a;

import android.content.Context;
import com.join.mgps.activity.ForumGroupMemberActivity_;
import com.tencent.stat.StatGameUser;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class g extends e {

    /* renamed from: a  reason: collision with root package name */
    private StatGameUser f62911a;

    public g(Context context, int i4, StatGameUser statGameUser) {
        super(context, i4);
        this.f62911a = null;
        this.f62911a = statGameUser.m28clone();
    }

    @Override // com.tencent.stat.a.e
    public f a() {
        return f.MTA_GAME_USER;
    }

    @Override // com.tencent.stat.a.e
    public boolean a(JSONObject jSONObject) {
        StatGameUser statGameUser = this.f62911a;
        if (statGameUser == null) {
            return false;
        }
        com.tencent.stat.common.k.a(jSONObject, "wod", statGameUser.getWorldName());
        com.tencent.stat.common.k.a(jSONObject, ForumGroupMemberActivity_.f30403u, this.f62911a.getAccount());
        com.tencent.stat.common.k.a(jSONObject, "lev", this.f62911a.getLevel());
        return true;
    }
}
