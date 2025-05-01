package androidx.core.location;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
/* compiled from: LocationListenerCompat.java */
/* loaded from: classes2.dex */
public final /* synthetic */ class a {
    public static void a(LocationListenerCompat locationListenerCompat, int i4) {
    }

    public static void b(@NonNull LocationListenerCompat _this, List list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            _this.onLocationChanged((Location) list.get(i4));
        }
    }

    public static void c(@NonNull LocationListenerCompat locationListenerCompat, String str) {
    }

    public static void d(@NonNull LocationListenerCompat locationListenerCompat, String str) {
    }

    public static void e(@NonNull LocationListenerCompat locationListenerCompat, String str, @Nullable int i4, Bundle bundle) {
    }
}
