package androidx.core.database;

import android.database.Cursor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Cursor.kt */
/* loaded from: classes.dex */
public final class CursorKt {
    @Nullable
    public static final byte[] getBlobOrNull(@NotNull Cursor cursor, int i4) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        if (cursor.isNull(i4)) {
            return null;
        }
        return cursor.getBlob(i4);
    }

    @Nullable
    public static final Double getDoubleOrNull(@NotNull Cursor cursor, int i4) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        if (cursor.isNull(i4)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i4));
    }

    @Nullable
    public static final Float getFloatOrNull(@NotNull Cursor cursor, int i4) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        if (cursor.isNull(i4)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i4));
    }

    @Nullable
    public static final Integer getIntOrNull(@NotNull Cursor cursor, int i4) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        if (cursor.isNull(i4)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i4));
    }

    @Nullable
    public static final Long getLongOrNull(@NotNull Cursor cursor, int i4) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        if (cursor.isNull(i4)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i4));
    }

    @Nullable
    public static final Short getShortOrNull(@NotNull Cursor cursor, int i4) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        if (cursor.isNull(i4)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i4));
    }

    @Nullable
    public static final String getStringOrNull(@NotNull Cursor cursor, int i4) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        if (cursor.isNull(i4)) {
            return null;
        }
        return cursor.getString(i4);
    }
}
