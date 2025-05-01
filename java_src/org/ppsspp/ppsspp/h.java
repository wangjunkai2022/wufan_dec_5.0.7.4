package org.ppsspp.ppsspp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.papa91.arc.util.SDCardUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/* compiled from: SimpleFileChooser.java */
/* loaded from: classes7.dex */
public class h {

    /* renamed from: g  reason: collision with root package name */
    private static final String f72958g = "..";

    /* renamed from: a  reason: collision with root package name */
    private c f72959a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f72960b;

    /* renamed from: c  reason: collision with root package name */
    private String[] f72961c;

    /* renamed from: d  reason: collision with root package name */
    private File f72962d;

    /* renamed from: e  reason: collision with root package name */
    private Comparator<File> f72963e = new a();

    /* renamed from: f  reason: collision with root package name */
    private DialogInterface.OnClickListener f72964f = new b();

    /* compiled from: SimpleFileChooser.java */
    /* loaded from: classes7.dex */
    class a implements Comparator<File> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(File file, File file2) {
            if (file == null || file2 == null) {
                return 0;
            }
            if (!file.isDirectory() || file2.isDirectory()) {
                if (!file2.isDirectory() || file.isDirectory()) {
                    return file.getName().toUpperCase().compareTo(file2.getName().toUpperCase());
                }
                return 1;
            }
            return -1;
        }
    }

    /* compiled from: SimpleFileChooser.java */
    /* loaded from: classes7.dex */
    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            File e5 = h.this.e(h.this.f72961c[i4]);
            dialogInterface.cancel();
            dialogInterface.dismiss();
            if (e5.isDirectory()) {
                h.this.f(e5);
                h.this.g();
            } else if (h.this.f72959a != null) {
                h.this.f72959a.a(e5);
            }
        }
    }

    /* compiled from: SimpleFileChooser.java */
    /* loaded from: classes7.dex */
    public interface c {
        void a(File file);
    }

    public h(Activity activity, File file, c cVar) {
        this.f72960b = activity;
        this.f72959a = cVar;
        f(file.exists() ? file : new File(SDCardUtil.getExternalStorageDirectory(activity)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File e(String str) {
        if (str.equals(f72958g)) {
            return this.f72962d.getParentFile();
        }
        return new File(this.f72962d, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(File file) {
        this.f72962d = file;
        ArrayList arrayList = new ArrayList();
        if (file.getParentFile() != null) {
            arrayList.add(f72958g);
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles, this.f72963e);
            for (File file2 : listFiles) {
                arrayList.add(file2.getName());
            }
        }
        this.f72961c = (String[]) arrayList.toArray(new String[0]);
    }

    public void g() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f72960b);
        builder.setTitle(this.f72962d.getPath());
        builder.setItems(this.f72961c, this.f72964f);
        builder.show();
    }
}
