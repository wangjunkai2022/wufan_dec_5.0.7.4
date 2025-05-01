package com.join.mgps.va.overmind;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.g2;
import com.papa.sim.statistic.p;
/* loaded from: classes5.dex */
public class VExtDbHelperProvider extends ContentProvider {

    /* renamed from: b  reason: collision with root package name */
    private Handler f54929b = new Handler();

    /* loaded from: classes5.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f54930b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f54931c;

        a(DownloadTask downloadTask, int i4) {
            this.f54930b = downloadTask;
            this.f54931c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.l(VExtDbHelperProvider.this.getContext()).m2(this.f54930b.getCrc_link_type_val(), AccountUtil_.getInstance_(VExtDbHelperProvider.this.getContext()).getUid(), this.f54931c, this.f54930b.get_from(), this.f54930b.get_from_type(), this.f54930b.getExt());
        }
    }

    public boolean a(Context context, String str) {
        try {
            if (g2.h(str)) {
                return false;
            }
            return context.getPackageManager().getPackageArchiveInfo(str, 128).applicationInfo.metaData.getBoolean(com.join.mgps.mod.utils.d.f53628k);
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    @Override // android.content.ContentProvider
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle call(@androidx.annotation.NonNull java.lang.String r11, @androidx.annotation.Nullable java.lang.String r12, @androidx.annotation.Nullable android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.va.overmind.VExtDbHelperProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
