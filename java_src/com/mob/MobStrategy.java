package com.mob;

import com.mob.commons.ab;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.i;
/* loaded from: classes5.dex */
public class MobStrategy implements PublicMemberKeeper {
    public static void setStrategy(final int i4) {
        new Thread(new i() { // from class: com.mob.MobStrategy.1
            @Override // com.mob.tools.utils.i
            protected void a() {
                ab.a().a(i4);
            }
        }).start();
    }
}
