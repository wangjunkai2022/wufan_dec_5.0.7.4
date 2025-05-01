package com.psk.frame.roomlibrary.volcano;

import android.content.Context;
import com.psk.frame.roomlibrary.volcano.dao.VolcanoEventDao;
import com.psk.frame.roomlibrary.volcano.database.VolcanoDataBaseHelper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: EventVolcanoDataBasFactory.kt */
/* loaded from: classes5.dex */
public final class a {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final a f59646a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static VolcanoDataBaseHelper f59647b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private static VolcanoEventDao f59648c;

    private a() {
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        f59647b = new VolcanoDataBaseHelper(context);
    }

    @NotNull
    public final VolcanoEventDao b() {
        if (f59648c == null) {
            VolcanoDataBaseHelper volcanoDataBaseHelper = f59647b;
            if (volcanoDataBaseHelper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("database");
                volcanoDataBaseHelper = null;
            }
            f59648c = new VolcanoEventDao(volcanoDataBaseHelper);
        }
        VolcanoEventDao volcanoEventDao = f59648c;
        Intrinsics.checkNotNull(volcanoEventDao);
        return volcanoEventDao;
    }
}
