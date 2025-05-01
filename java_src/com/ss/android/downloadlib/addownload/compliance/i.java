package com.ss.android.downloadlib.addownload.compliance;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.downloadlib.n.p;
import com.ss.android.socialbase.downloader.network.wv;
import java.io.BufferedInputStream;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class i extends com.ss.android.socialbase.downloader.wv.qv<Long, Bitmap> {
    private final Map<Long, SoftReference<vv>> vv;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class m {
        private static i vv = new i();
    }

    /* loaded from: classes5.dex */
    public interface vv {
        void vv(Bitmap bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(int i4, int i5, BitmapFactory.Options options) {
        int i6 = options.outWidth;
        if (i6 > i4 || options.outHeight > i5) {
            return Math.min(Math.round(i6 / i4), Math.round(options.outHeight / i5));
        }
        return 1;
    }

    private i() {
        super(8, 8);
        this.vv = new HashMap();
    }

    public static i vv() {
        return m.vv;
    }

    public void vv(long j4, @NonNull vv vvVar) {
        if (get(Long.valueOf(j4)) != null) {
            vvVar.vv(get(Long.valueOf(j4)));
        } else {
            this.vv.put(Long.valueOf(j4), new SoftReference<>(vvVar));
        }
    }

    public void vv(final long j4, final long j5, final String str) {
        if (get(Long.valueOf(j4)) != null) {
            SoftReference<vv> remove = this.vv.remove(Long.valueOf(j4));
            if (remove == null || remove.get() == null) {
                return;
            }
            remove.get().vv(get(Long.valueOf(j4)));
        } else if (TextUtils.isEmpty(str)) {
            n.vv(12, j5);
        } else {
            com.ss.android.downloadlib.n.p.vv((p.vv<Object, R>) new p.vv<Object, Object>() { // from class: com.ss.android.downloadlib.addownload.compliance.i.2
                @Override // com.ss.android.downloadlib.n.p.vv
                public Object vv(Object obj) {
                    BufferedInputStream bufferedInputStream;
                    Throwable th;
                    wv vv2;
                    try {
                        vv2 = com.ss.android.socialbase.downloader.downloader.p.vv(true, 0, str, null);
                    } catch (Exception e5) {
                        e = e5;
                        bufferedInputStream = null;
                    } catch (Throwable th2) {
                        bufferedInputStream = null;
                        th = th2;
                        com.ss.android.socialbase.downloader.wv.u.vv(bufferedInputStream);
                        throw th;
                    }
                    if (vv2 == null) {
                        com.ss.android.socialbase.downloader.wv.u.vv(null);
                        return null;
                    }
                    bufferedInputStream = new BufferedInputStream(vv2.vv());
                    try {
                        try {
                            bufferedInputStream.mark(bufferedInputStream.available());
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeStream(bufferedInputStream, null, options);
                            int i4 = options.outWidth;
                            int i5 = options.outHeight;
                            int vv3 = jh.vv(b.getContext(), 60.0f);
                            options.inSampleSize = i.m(vv3, vv3, options);
                            options.inJustDecodeBounds = false;
                            bufferedInputStream.reset();
                            Bitmap decodeStream = BitmapFactory.decodeStream(bufferedInputStream, null, options);
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.putOpt("ttdownloader_type", "load_bitmap");
                                jSONObject.putOpt("bm_original_w", Integer.valueOf(i4));
                                jSONObject.putOpt("bm_original_h", Integer.valueOf(i5));
                                jSONObject.putOpt("bm_bytes", Integer.valueOf(decodeStream == null ? -1 : decodeStream.getByteCount()));
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                            com.ss.android.downloadlib.i.vv.vv().vv("ttd_pref_monitor", jSONObject, j5);
                            i.this.put(Long.valueOf(j4), decodeStream);
                            com.ss.android.socialbase.downloader.wv.u.vv(bufferedInputStream);
                        } catch (Exception e7) {
                            e = e7;
                            com.ss.android.downloadlib.o.p.vv().vv(e, "BitmapCache loadBitmap");
                            com.ss.android.socialbase.downloader.wv.u.vv(bufferedInputStream);
                            return null;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        com.ss.android.socialbase.downloader.wv.u.vv(bufferedInputStream);
                        throw th;
                    }
                }
            }, (Object) null).vv(new p.vv<Object, Object>() { // from class: com.ss.android.downloadlib.addownload.compliance.i.1
                @Override // com.ss.android.downloadlib.n.p.vv
                public Object vv(Object obj) {
                    SoftReference softReference = (SoftReference) i.this.vv.remove(Long.valueOf(j4));
                    if (softReference == null || softReference.get() == null) {
                        return null;
                    }
                    ((vv) softReference.get()).vv(i.this.get(Long.valueOf(j4)));
                    return null;
                }
            }).vv();
        }
    }
}
