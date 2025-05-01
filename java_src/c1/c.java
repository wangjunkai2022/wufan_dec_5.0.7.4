package c1;

import android.content.Context;
import android.text.TextUtils;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.join.android.app.common.db.DatabaseHelper;
import com.join.mgps.enums.Dtype;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import p1.e;
import p1.f;
/* compiled from: ISqlImpl.java */
/* loaded from: classes3.dex */
public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private DatabaseHelper f348a = null;

    /* renamed from: b  reason: collision with root package name */
    private Context f349b;

    public c(Context context) {
        this.f349b = null;
        this.f349b = context;
    }

    private DatabaseHelper f() {
        if (this.f348a == null) {
            this.f348a = e.d(this.f349b).c();
        }
        return this.f348a;
    }

    @Override // c1.b
    public DownloadTask a(DownloadTask downloadTask) throws SQLException {
        if (downloadTask == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", downloadTask.getUrl());
        List<DownloadTask> h4 = f.K().h(hashMap);
        if (h4 == null || h4.size() <= 0) {
            return null;
        }
        return h4.get(0);
    }

    @Override // c1.b
    public void b(DownloadTask downloadTask) throws SQLException {
        String name;
        if (downloadTask == null) {
            return;
        }
        if (TextUtils.isEmpty(downloadTask.getFileType())) {
            if (downloadTask.getFileType() != null && !downloadTask.getFileType().equals(Dtype.apk.name())) {
                name = downloadTask.getFileType();
            } else {
                name = Dtype.apk.name();
            }
            downloadTask.setFileType(name);
        }
        if (downloadTask.getStatus() != 7) {
            f.K().m(downloadTask);
        }
    }

    @Override // c1.b
    public void c(DownloadTask downloadTask) throws SQLException {
        if (downloadTask == null) {
            return;
        }
        f.K().n(downloadTask.getCrc_link_type_val());
    }

    @Override // c1.b
    public void d(DownloadTask downloadTask) throws SQLException {
        if (downloadTask == null || a(downloadTask) == null) {
            return;
        }
        f.K().update(downloadTask);
    }

    public void e() {
        if (this.f348a != null) {
            OpenHelperManager.releaseHelper();
            this.f348a = null;
        }
    }
}
