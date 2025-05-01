package com.join.mgps.Util;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
/* compiled from: PhotoSelectUtils.java */
/* loaded from: classes3.dex */
public class o1 {

    /* renamed from: m  reason: collision with root package name */
    public static final int f27964m = 10001;

    /* renamed from: n  reason: collision with root package name */
    public static final int f27965n = 10002;

    /* renamed from: o  reason: collision with root package name */
    public static final int f27966o = 10003;

    /* renamed from: a  reason: collision with root package name */
    private Activity f27967a;

    /* renamed from: b  reason: collision with root package name */
    private String f27968b;

    /* renamed from: c  reason: collision with root package name */
    private String f27969c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f27970d;

    /* renamed from: e  reason: collision with root package name */
    private Uri f27971e;

    /* renamed from: f  reason: collision with root package name */
    private File f27972f;

    /* renamed from: g  reason: collision with root package name */
    private File f27973g;

    /* renamed from: h  reason: collision with root package name */
    private int f27974h;

    /* renamed from: i  reason: collision with root package name */
    private int f27975i;

    /* renamed from: j  reason: collision with root package name */
    private int f27976j;

    /* renamed from: k  reason: collision with root package name */
    private int f27977k;

    /* renamed from: l  reason: collision with root package name */
    a f27978l;

    /* compiled from: PhotoSelectUtils.java */
    /* loaded from: classes3.dex */
    public interface a {
        void onFinish(File file, Uri uri);
    }

    public o1(Activity activity, a aVar, boolean z4) {
        this.f27968b = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + String.valueOf(System.currentTimeMillis()) + ".jpg";
        this.f27969c = "packageName.fileprovider";
        this.f27970d = false;
        this.f27971e = null;
        this.f27973g = null;
        this.f27974h = 1;
        this.f27975i = 1;
        this.f27976j = 800;
        this.f27977k = 480;
        this.f27967a = activity;
        this.f27978l = aVar;
        this.f27970d = z4;
        this.f27969c = activity.getPackageName() + ".fileprovider";
        this.f27968b = b();
    }

    private String b() {
        return c() + File.separator + String.valueOf(System.currentTimeMillis()) + ".jpg";
    }

    private String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("Android/data/" + this.f27967a.getPackageName());
        sb.append(str);
        return sb.toString();
    }

    private Uri d(Context context, File file) {
        String absolutePath = file.getAbsolutePath();
        Cursor query = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_data=? ", new String[]{absolutePath}, null);
        if (query != null && query.moveToFirst()) {
            int i4 = query.getInt(query.getColumnIndex("_id"));
            Uri parse = Uri.parse("content://media/external/images/media");
            return Uri.withAppendedPath(parse, "" + i4);
        } else if (file.exists()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_data", absolutePath);
            return context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        } else {
            return null;
        }
    }

    private void i(File file, File file2) {
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        Intent intent = new Intent("com.android.camera.action.CROP");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.setDataAndType(d(this.f27967a, file), "image/*");
        } else {
            intent.setDataAndType(Uri.fromFile(file), "image/*");
        }
        intent.putExtra("crop", "true");
        intent.putExtra("mAspectX", this.f27974h);
        intent.putExtra("mAspectY", this.f27975i);
        intent.putExtra("mOutputX", this.f27976j);
        intent.putExtra("mOutputY", this.f27977k);
        intent.putExtra("return-data", false);
        intent.putExtra("output", Uri.fromFile(file2));
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        this.f27967a.startActivityForResult(intent, 10003);
    }

    public void a(int i4, int i5, Intent intent) {
        if (i5 == -1) {
            switch (i4) {
                case 10001:
                    File file = new File(this.f27968b);
                    this.f27972f = file;
                    if (this.f27970d) {
                        File file2 = new File(b());
                        this.f27973g = file2;
                        this.f27971e = Uri.fromFile(file2);
                        i(this.f27972f, this.f27973g);
                        return;
                    }
                    Uri fromFile = Uri.fromFile(file);
                    this.f27971e = fromFile;
                    a aVar = this.f27978l;
                    if (aVar != null) {
                        aVar.onFinish(this.f27972f, fromFile);
                        return;
                    }
                    return;
                case 10002:
                    if (intent != null) {
                        Cursor managedQuery = this.f27967a.managedQuery(intent.getData(), new String[]{"_data"}, null, null, null);
                        int columnIndexOrThrow = managedQuery.getColumnIndexOrThrow("_data");
                        managedQuery.moveToFirst();
                        File file3 = new File(managedQuery.getString(columnIndexOrThrow));
                        this.f27972f = file3;
                        if (this.f27970d) {
                            File file4 = new File(b());
                            this.f27973g = file4;
                            this.f27971e = Uri.fromFile(file4);
                            i(this.f27972f, this.f27973g);
                            return;
                        }
                        Uri fromFile2 = Uri.fromFile(file3);
                        this.f27971e = fromFile2;
                        a aVar2 = this.f27978l;
                        if (aVar2 != null) {
                            aVar2.onFinish(this.f27972f, fromFile2);
                            return;
                        }
                        return;
                    }
                    return;
                case 10003:
                    if (intent == null || this.f27971e == null) {
                        return;
                    }
                    File file5 = new File(this.f27968b);
                    if (file5.exists()) {
                        file5.delete();
                    }
                    a aVar3 = this.f27978l;
                    if (aVar3 != null) {
                        aVar3.onFinish(this.f27973g, this.f27971e);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void e() {
        Intent intent = new Intent("android.intent.action.PICK", (Uri) null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        this.f27967a.startActivityForResult(intent, 10002);
    }

    public void f(String str) {
        this.f27969c = str;
    }

    public void g(String str) {
        this.f27968b = str;
    }

    public void h() {
        Uri insert;
        File file = new File(this.f27968b);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (Build.VERSION.SDK_INT < 24) {
            insert = Uri.fromFile(file);
        } else {
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("_data", file.getAbsolutePath());
            insert = this.f27967a.getApplication().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", insert);
        this.f27967a.startActivityForResult(intent, 10001);
    }

    public o1(Activity activity, a aVar, int i4, int i5, int i6, int i7) {
        this(activity, aVar, true);
        this.f27974h = i4;
        this.f27975i = i5;
        this.f27976j = i6;
        this.f27977k = i7;
    }
}
