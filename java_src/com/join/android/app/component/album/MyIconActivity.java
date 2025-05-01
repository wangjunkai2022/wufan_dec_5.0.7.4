package com.join.android.app.component.album;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import com.BaseActivity;
import com.MApplication;
import com.join.android.app.component.album.a;
import com.join.android.app.component.album.lib.b;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.b0;
import com.join.mgps.activity.LocalGameActivity;
import com.kuaishou.weapon.p0.g;
import io.reactivex.functions.Consumer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public class MyIconActivity extends BaseActivity implements View.OnClickListener {

    /* renamed from: w  reason: collision with root package name */
    private static final int f15017w = 257;

    /* renamed from: x  reason: collision with root package name */
    private static final int f15018x = 258;

    /* renamed from: y  reason: collision with root package name */
    private static final String f15019y = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM) + "/Camera";

    /* renamed from: b  reason: collision with root package name */
    MApplication f15020b;

    /* renamed from: c  reason: collision with root package name */
    private int f15021c;

    /* renamed from: d  reason: collision with root package name */
    private com.join.android.app.component.album.a f15022d;

    /* renamed from: e  reason: collision with root package name */
    private com.join.android.app.component.album.lib.b f15023e;

    /* renamed from: f  reason: collision with root package name */
    private List<String> f15024f;

    /* renamed from: g  reason: collision with root package name */
    private GridView f15025g;

    /* renamed from: h  reason: collision with root package name */
    private com.join.android.app.component.album.adapter.d f15026h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f15027i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f15028j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f15029k;

    /* renamed from: l  reason: collision with root package name */
    private ImageView f15030l;

    /* renamed from: m  reason: collision with root package name */
    private com.join.android.app.component.album.lib.a f15031m;

    /* renamed from: n  reason: collision with root package name */
    private Context f15032n;

    /* renamed from: p  reason: collision with root package name */
    private Uri f15034p;

    /* renamed from: q  reason: collision with root package name */
    private int f15035q;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f15033o = true;

    /* renamed from: r  reason: collision with root package name */
    private Map<String, com.join.android.app.component.album.lib.a> f15036r = new HashMap();

    /* renamed from: s  reason: collision with root package name */
    public Handler f15037s = new d();

    /* renamed from: t  reason: collision with root package name */
    String f15038t = "";

    /* renamed from: u  reason: collision with root package name */
    String f15039u = "";

    /* renamed from: v  reason: collision with root package name */
    List<String> f15040v = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements b.g {
        a() {
        }

        @Override // com.join.android.app.component.album.lib.b.g
        public void a() {
        }

        @Override // com.join.android.app.component.album.lib.b.g
        public void b(Object obj) {
        }

        @Override // com.join.android.app.component.album.lib.b.g
        public void c(Object obj) {
            MyIconActivity.this.f15036r = (Map) obj;
            MyIconActivity.this.f15022d.h();
            MyIconActivity myIconActivity = MyIconActivity.this;
            myIconActivity.f15031m = (com.join.android.app.component.album.lib.a) myIconActivity.f15036r.get("ALL");
            MyIconActivity.this.F0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            WindowManager.LayoutParams attributes = MyIconActivity.this.getWindow().getAttributes();
            attributes.alpha = 1.0f;
            MyIconActivity.this.getWindow().setAttributes(attributes);
            MyIconActivity.this.G0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements a.e {
        c() {
        }

        @Override // com.join.android.app.component.album.a.e
        public void a(com.join.android.app.component.album.lib.a aVar) {
            MyIconActivity.this.f15031m = aVar;
            MyIconActivity.this.F0();
        }
    }

    /* loaded from: classes3.dex */
    class d extends Handler {
        d() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            MyIconActivity.this.dismissLoading();
            MyIconActivity.this.J0((List) message.obj);
        }
    }

    /* loaded from: classes3.dex */
    class e extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.android.app.component.album.lib.a f15045b;

        e(com.join.android.app.component.album.lib.a aVar) {
            this.f15045b = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            List<String> k4 = MyIconActivity.this.f15023e.k(this.f15045b.d());
            Message message = new Message();
            message.what = 1;
            message.obj = k4;
            MyIconActivity.this.f15037s.sendMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements AdapterView.OnItemClickListener {

        /* loaded from: classes3.dex */
        class a implements Consumer<com.tbruyelle.rxpermissions2.b> {
            a() {
            }

            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(com.tbruyelle.rxpermissions2.b bVar) throws Exception {
                if (bVar.f62140b) {
                    if (MyIconActivity.this.checkPermiss("android.permission.CAMERA") && MyIconActivity.this.checkPermiss(g.f55590j)) {
                        MyIconActivity.this.t0();
                    }
                } else if (bVar.f62141c) {
                } else {
                    b0.f0(MyIconActivity.this).X(MyIconActivity.this, bVar);
                }
            }
        }

        f() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (i4 >= 1) {
                CropPicActivity_.u0(MyIconActivity.this.f15032n).a(MyIconActivity.this.f15026h.getItem(i4).toString()).b(MyIconActivity.this.f15035q).start();
                return;
            }
            try {
                new com.tbruyelle.rxpermissions2.c(MyIconActivity.this).r("android.permission.CAMERA").subscribe(new a());
                UtilsMy.L3(MyIconActivity.this, "android.permission.CAMERA");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    private void A0() {
        if (this.f15024f == null) {
            this.f15024f = new ArrayList();
        }
        this.f15023e.i();
        this.f15031m = w0();
        this.f15023e.i();
    }

    private void B0() {
        this.f15023e = new com.join.android.app.component.album.lib.b(this);
        this.f15025g = (GridView) findViewById(R.id.album_grid);
        this.f15029k = (ImageView) findViewById(R.id.back_image);
        this.f15028j = (TextView) findViewById(R.id.layout_title);
        this.f15030l = (ImageView) findViewById(R.id.album_collapse_image);
        this.f15027i = (ImageView) findViewById(R.id.back_image);
        this.f15029k.setOnClickListener(this);
        this.f15027i.setOnClickListener(this);
        ((View) this.f15028j.getParent()).setOnClickListener(this);
        this.f15023e.l(new a());
        G0(true);
        A0();
    }

    private void C0() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f15021c = displayMetrics.heightPixels;
    }

    private void D0(com.join.android.app.component.album.lib.a aVar) {
        if (this.f15040v.size() == 0) {
            showLoading();
        }
        new e(aVar).start();
    }

    private void E0(com.join.android.app.component.album.lib.a aVar) {
        this.f15038t = aVar.f();
        this.f15039u = aVar.d();
        J0(aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        com.join.android.app.component.album.lib.a aVar = this.f15031m;
        if (aVar != null) {
            E0(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(boolean z4) {
        if (z4) {
            this.f15030l.setBackgroundResource(R.drawable.arrow_down);
        } else {
            this.f15030l.setBackgroundResource(R.drawable.arrow_up);
        }
    }

    private void H0() {
    }

    private void I0(View view) {
        this.f15022d.setAnimationStyle(R.style.animation_album_popup);
        this.f15022d.showAsDropDown(view, 0, 0);
        G0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0(List<String> list) {
        if (this.f15040v.size() > 0) {
            this.f15040v.clear();
            this.f15040v.add("camera");
            if (list != null) {
                this.f15040v.addAll(list);
            }
            this.f15026h.d(this.f15039u);
        } else {
            this.f15040v.clear();
            this.f15040v.add("camera");
            if (list != null) {
                this.f15040v.addAll(list);
                this.f15026h = new com.join.android.app.component.album.adapter.d(this, this.f15040v, this.f15039u);
            } else {
                this.f15026h = new com.join.android.app.component.album.adapter.d(this, this.f15040v, null);
            }
            this.f15025g.setAdapter((ListAdapter) this.f15026h);
            this.f15025g.setOnItemClickListener(new f());
        }
        this.f15026h.notifyDataSetChanged();
        this.f15028j.setText(this.f15038t);
        G0(true);
        com.join.android.app.component.album.a aVar = this.f15022d;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    private String r0(Intent intent) {
        if (intent == null) {
            return "";
        }
        Uri data = intent.getData();
        if (data == null) {
            if (intent.hasExtra("data")) {
                File file = new File(x0(this, v0(getApplicationContext(), (Bitmap) intent.getParcelableExtra("data"))));
                System.out.println(file.getAbsoluteFile());
                return file.getAbsolutePath();
            }
            Toast.makeText(getApplicationContext(), "拍照失败", 1).show();
            return null;
        }
        return x0(this, data);
    }

    private com.join.android.app.component.album.lib.a s0() {
        com.join.android.app.component.album.lib.a aVar = new com.join.android.app.component.album.lib.a();
        File file = new File(f15019y);
        aVar.j(file.getPath());
        aVar.l(file.getName());
        return aVar;
    }

    private com.join.android.app.component.album.lib.a w0() {
        com.join.android.app.component.album.lib.a aVar = new com.join.android.app.component.album.lib.a();
        aVar.j("All");
        aVar.k("");
        aVar.i(1);
        aVar.l(LocalGameActivity.f34225s);
        return aVar;
    }

    private String x0(Context context, Uri uri) {
        Cursor query;
        int columnIndex;
        String str = null;
        if (uri == null || context == null) {
            return null;
        }
        int i4 = context.getApplicationInfo().targetSdkVersion;
        if (Build.VERSION.SDK_INT >= 21 || i4 > 19) {
            try {
                return uri.toString();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            return uri.getPath();
        }
        if (com.facebook.common.util.f.f10925c.equals(scheme)) {
            return uri.getPath();
        }
        if (!"content".equals(scheme) || (query = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null)) == null) {
            return null;
        }
        if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_data")) > -1) {
            str = query.getString(columnIndex);
        }
        query.close();
        return str;
    }

    private List<String> y0(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        return (List) extras.get(MyAlbumActivity.f14984x);
    }

    private void z0() {
        com.join.android.app.component.album.a aVar = new com.join.android.app.component.album.a(this, LayoutInflater.from(this).inflate(R.layout.album_layout, (ViewGroup) null), -1, this.f15021c, this.f15023e);
        this.f15022d = aVar;
        aVar.setOnDismissListener(new b());
        this.f15022d.f(new c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        String r02;
        super.onActivityResult(i4, i5, intent);
        if (i4 == 258 && i5 == -1) {
            Uri uri = this.f15034p;
            if (uri != null) {
                r02 = x0(this, uri);
            } else {
                r02 = r0(intent);
            }
            CropPicActivity_.u0(this.f15032n).a(r02).b(this.f15035q).start();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.back_image) {
            finish();
        } else if (id == R.id.album_collapse_image || id == R.id.layout_title || id == R.id.layout_show_album) {
            I0(findViewById(R.id.album_title));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.my_icon_activity);
        this.f15032n = this;
        MApplication mApplication = (MApplication) getApplication();
        this.f15020b = mApplication;
        mApplication.e(this);
        C0();
        B0();
        z0();
        this.f15035q = getIntent().getIntExtra("from", 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        F0();
    }

    protected void t0() {
        Uri uriForFile;
        if (Environment.getExternalStorageState().equals("mounted")) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Long.valueOf(System.currentTimeMillis()));
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM) + "/Camera/IMG_" + format + ".jpg");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            System.out.println(file.getAbsoluteFile());
            if (Build.VERSION.SDK_INT < 21) {
                uriForFile = Uri.fromFile(file);
            } else {
                uriForFile = FileProvider.getUriForFile(this, getPackageName() + ".fileprovider", file);
            }
            intent.putExtra("output", uriForFile);
            this.f15034p = uriForFile;
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(intent, 258);
                return;
            }
            return;
        }
        Toast.makeText(getApplicationContext(), "请确认已经插入SD卡", 1).show();
    }

    protected void u0() {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        startActivityForResult(intent, 257);
    }

    public Uri v0(Context context, Bitmap bitmap) {
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new ByteArrayOutputStream());
        return Uri.parse(MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, "Title", (String) null));
    }
}
