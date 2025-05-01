package com.join.mgps.Util;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.papa91.arc.ext.ThreadManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: ImageUtils.java */
/* loaded from: classes3.dex */
public class p0 {

    /* compiled from: ImageUtils.java */
    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bitmap f27979b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f27980c;

        /* compiled from: ImageUtils.java */
        /* renamed from: com.join.mgps.Util.p0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0326a implements MediaScannerConnection.OnScanCompletedListener {
            C0326a() {
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
            }
        }

        a(Bitmap bitmap, Context context) {
            this.f27979b = bitmap;
            this.f27980c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f27979b != null) {
                String str = System.currentTimeMillis() + ".jpg";
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), str);
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", str);
                    contentValues.put("mime_type", "image/jpeg");
                    contentValues.put("relative_path", Environment.DIRECTORY_DCIM);
                    try {
                        OutputStream openOutputStream = this.f27980c.getContentResolver().openOutputStream(this.f27980c.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues));
                        this.f27979b.compress(Bitmap.CompressFormat.JPEG, 90, openOutputStream);
                        openOutputStream.close();
                        return;
                    } catch (IOException e5) {
                        e5.printStackTrace();
                        return;
                    }
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    this.f27979b.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    MediaScannerConnection.scanFile(this.f27980c, new String[]{file.getAbsolutePath()}, null, new C0326a());
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
        }
    }

    public static void a(Context context, Bitmap bitmap) {
        ThreadManager.runOnWriteThread(new a(bitmap, context));
    }
}
