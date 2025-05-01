package com.join.android.app.component.album;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import com.BaseActivity;
import com.join.android.app.component.album.a;
import com.join.android.app.component.album.lib.b;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.b0;
import com.join.mgps.Util.g2;
import com.join.mgps.activity.LocalGameActivity;
import com.kuaishou.weapon.p0.g;
import io.reactivex.functions.Consumer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public class MyAlbumActivity extends BaseActivity implements View.OnClickListener {
    private static final int A = 258;
    private static final String B = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM) + "/Camera";
    private static int C = 0;

    /* renamed from: x  reason: collision with root package name */
    public static final String f14984x = "key_selected_images";

    /* renamed from: y  reason: collision with root package name */
    public static final int f14985y = 256;

    /* renamed from: z  reason: collision with root package name */
    private static final int f14986z = 257;

    /* renamed from: b  reason: collision with root package name */
    private int f14987b;

    /* renamed from: c  reason: collision with root package name */
    private com.join.android.app.component.album.a f14988c;

    /* renamed from: d  reason: collision with root package name */
    private com.join.android.app.component.album.lib.b f14989d;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f14990e;

    /* renamed from: f  reason: collision with root package name */
    private List<String> f14991f;

    /* renamed from: g  reason: collision with root package name */
    private GridView f14992g;

    /* renamed from: h  reason: collision with root package name */
    private com.join.android.app.component.album.adapter.c f14993h;

    /* renamed from: i  reason: collision with root package name */
    private View f14994i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f14995j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f14996k;

    /* renamed from: l  reason: collision with root package name */
    private ImageView f14997l;

    /* renamed from: m  reason: collision with root package name */
    private Button f14998m;

    /* renamed from: n  reason: collision with root package name */
    private View f14999n;

    /* renamed from: o  reason: collision with root package name */
    private ImageView f15000o;

    /* renamed from: p  reason: collision with root package name */
    private com.join.android.app.component.album.lib.a f15001p;

    /* renamed from: r  reason: collision with root package name */
    private Uri f15003r;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f15002q = true;

    /* renamed from: s  reason: collision with root package name */
    private Map<String, com.join.android.app.component.album.lib.a> f15004s = new HashMap();

    /* renamed from: t  reason: collision with root package name */
    public Handler f15005t = new d();

    /* renamed from: u  reason: collision with root package name */
    String f15006u = "";

    /* renamed from: v  reason: collision with root package name */
    String f15007v = "";

    /* renamed from: w  reason: collision with root package name */
    List<String> f15008w = new ArrayList();

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
            MyAlbumActivity.this.f15004s = (Map) obj;
            MyAlbumActivity.this.f14988c.h();
            MyAlbumActivity myAlbumActivity = MyAlbumActivity.this;
            myAlbumActivity.f15001p = (com.join.android.app.component.album.lib.a) myAlbumActivity.f15004s.get("ALL");
            MyAlbumActivity.this.F0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            WindowManager.LayoutParams attributes = MyAlbumActivity.this.getWindow().getAttributes();
            attributes.alpha = 1.0f;
            MyAlbumActivity.this.getWindow().setAttributes(attributes);
            MyAlbumActivity.this.H0(true);
            MyAlbumActivity.this.f14999n.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements a.e {
        c() {
        }

        @Override // com.join.android.app.component.album.a.e
        public void a(com.join.android.app.component.album.lib.a aVar) {
            MyAlbumActivity.this.f15001p = aVar;
            MyAlbumActivity.this.F0();
        }
    }

    /* loaded from: classes3.dex */
    class d extends Handler {
        d() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            MyAlbumActivity.this.dismissLoading();
            MyAlbumActivity.this.L0((List) message.obj);
        }
    }

    /* loaded from: classes3.dex */
    class e extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.android.app.component.album.lib.a f15013b;

        e(com.join.android.app.component.album.lib.a aVar) {
            this.f15013b = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            List<String> k4 = MyAlbumActivity.this.f14989d.k(this.f15013b.d());
            Message message = new Message();
            message.what = 1;
            message.obj = k4;
            MyAlbumActivity.this.f15005t.sendMessage(message);
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
                    if (MyAlbumActivity.this.checkPermiss("android.permission.CAMERA") && MyAlbumActivity.this.checkPermiss(g.f55590j)) {
                        MyAlbumActivity.this.r0();
                    }
                } else if (bVar.f62141c) {
                } else {
                    b0.f0(MyAlbumActivity.this).X(MyAlbumActivity.this, bVar);
                }
            }
        }

        f() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (i4 < 1) {
                try {
                    new com.tbruyelle.rxpermissions2.c(MyAlbumActivity.this).r("android.permission.CAMERA").subscribe(new a());
                    UtilsMy.L3(MyAlbumActivity.this, "android.permission.CAMERA");
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return;
                }
            }
            MyAlbumActivity.this.E0(view, (String) ((com.join.android.app.component.album.adapter.c) adapterView.getAdapter()).getItem(i4));
        }
    }

    private void A0() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f14987b = displayMetrics.heightPixels;
    }

    private void B0(com.join.android.app.component.album.lib.a aVar) {
        if (this.f15008w.size() == 0) {
            showLoading();
        }
        new e(aVar).start();
    }

    private void C0(com.join.android.app.component.album.lib.a aVar) {
        this.f15006u = aVar.f();
        this.f15007v = aVar.d();
        L0(aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        com.join.android.app.component.album.lib.a aVar = this.f15001p;
        if (aVar != null) {
            C0(aVar);
        }
    }

    private void G0() {
        List<String> list = this.f14991f;
        if (list != null && list.size() != 0) {
            this.f14998m.setEnabled(true);
            Button button = this.f14998m;
            button.setText("完成(" + this.f14991f.size() + net.lingala.zip4j.util.e.F0 + C + ")");
            return;
        }
        Button button2 = this.f14998m;
        button2.setText("完成(0/" + C + ")");
        this.f14998m.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0(boolean z4) {
        if (z4) {
            this.f15000o.setBackgroundResource(R.drawable.arrow_down);
        } else {
            this.f15000o.setBackgroundResource(R.drawable.arrow_up);
        }
    }

    private void I0() {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putSerializable(f14984x, (Serializable) this.f14991f);
        intent.putExtras(bundle);
        setResult(256, intent);
        finish();
    }

    private void J0(View view) {
        this.f14988c.setAnimationStyle(R.style.animation_album_popup);
        K0(this.f14988c, view, 0, 0);
        H0(false);
        this.f14999n.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(List<String> list) {
        if (this.f15008w.size() > 0) {
            this.f15008w.clear();
            this.f15008w.add("camera");
            if (list != null) {
                this.f15008w.addAll(list);
            }
            this.f14993h.e(this.f15007v);
        } else {
            this.f15008w.clear();
            this.f15008w.add("camera");
            if (list != null) {
                this.f15008w.addAll(list);
                this.f14993h = new com.join.android.app.component.album.adapter.c(this, this.f15008w, this.f15007v, this.f14991f);
            } else {
                this.f14993h = new com.join.android.app.component.album.adapter.c(this, this.f15008w, null, this.f14991f);
            }
            this.f14992g.setAdapter((ListAdapter) this.f14993h);
            this.f14992g.setOnItemClickListener(new f());
        }
        this.f14993h.notifyDataSetChanged();
        this.f14995j.setText(this.f15006u);
        H0(true);
        com.join.android.app.component.album.a aVar = this.f14988c;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    private String p0(Intent intent) {
        if (intent == null) {
            return "";
        }
        Uri data = intent.getData();
        if (data == null) {
            if (intent.hasExtra("data")) {
                File file = new File(v0(this, t0(getApplicationContext(), (Bitmap) intent.getParcelableExtra("data"))));
                System.out.println(file.getAbsoluteFile());
                return file.getAbsolutePath();
            }
            Toast.makeText(getApplicationContext(), "拍照失败", 1).show();
            return null;
        }
        return v0(this, data);
    }

    private com.join.android.app.component.album.lib.a q0() {
        com.join.android.app.component.album.lib.a aVar = new com.join.android.app.component.album.lib.a();
        File file = new File(B);
        aVar.j(file.getPath());
        aVar.l(file.getName());
        return aVar;
    }

    private com.join.android.app.component.album.lib.a u0() {
        com.join.android.app.component.album.lib.a aVar = new com.join.android.app.component.album.lib.a();
        aVar.j("All");
        aVar.k("");
        aVar.i(1);
        aVar.l(LocalGameActivity.f34225s);
        return aVar;
    }

    private String v0(Context context, Uri uri) {
        int columnIndex;
        String str = null;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            str = uri.getPath();
        } else if (com.facebook.common.util.f.f10925c.equals(scheme)) {
            str = uri.getPath();
        } else if ("content".equals(scheme)) {
            File file = new File(uri.getPath());
            if (file.exists()) {
                str = file.getAbsolutePath();
            } else {
                Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
                if (query != null) {
                    if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_data")) > -1) {
                        str = query.getString(columnIndex);
                    }
                    query.close();
                }
            }
        }
        return TextUtils.isEmpty(str) ? uri.toString() : str;
    }

    private List<String> w0(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        return (List) extras.get(f14984x);
    }

    private void x0() {
        com.join.android.app.component.album.a aVar = new com.join.android.app.component.album.a(this, LayoutInflater.from(this).inflate(R.layout.album_layout, (ViewGroup) null), -1, this.f14987b, this.f14989d);
        this.f14988c = aVar;
        aVar.setOnDismissListener(new b());
        this.f14988c.f(new c());
    }

    private void y0() {
        if (this.f14990e == null) {
            this.f14990e = new ArrayList();
        }
        if (this.f14991f == null) {
            this.f14991f = new ArrayList();
        }
        this.f15001p = u0();
        this.f14989d.i();
    }

    private void z0() {
        this.f14989d = new com.join.android.app.component.album.lib.b(this);
        this.f14994i = findViewById(R.id.album_title);
        this.f14999n = findViewById(R.id.cover);
        this.f14992g = (GridView) findViewById(R.id.album_grid);
        this.f14997l = (ImageView) findViewById(R.id.back_image);
        this.f14998m = (Button) findViewById(R.id.ok_image);
        this.f14995j = (TextView) findViewById(R.id.layout_title);
        this.f15000o = (ImageView) findViewById(R.id.album_collapse_image);
        this.f14996k = (TextView) findViewById(R.id.select_num);
        this.f14989d.l(new a());
        this.f14997l.setOnClickListener(this);
        this.f14998m.setOnClickListener(this);
        ((View) this.f14995j.getParent()).setOnClickListener(this);
        H0(true);
        this.f14991f = w0(getIntent());
        G0();
        y0();
    }

    public synchronized void D0(String str, boolean z4) {
        net.bither.util.b.q().j(getApplicationContext(), str, z4);
    }

    public void E0(View view, String str) {
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.image_flag);
        if (this.f14991f == null) {
            this.f14991f = new ArrayList();
        }
        if (this.f14991f.contains(str)) {
            this.f14991f.remove(str);
            imageView.setColorFilter((ColorFilter) null);
            imageView2.setImageResource(R.drawable.pic_select_normal);
            G0();
            D0(str, false);
        } else if (this.f14991f.size() == C) {
            Toast.makeText(this, "最多选择" + C + "张图", 0).show();
        } else {
            this.f14991f.add(str);
            imageView.setColorFilter(Color.parseColor("#7f989898"));
            imageView2.setImageResource(R.drawable.pic_select_selected);
            G0();
            D0(str, true);
        }
    }

    public void K0(PopupWindow popupWindow, View view, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 24) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            Rect rect2 = new Rect();
            ((Activity) view.getContext()).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            popupWindow.setHeight(rect2.height() - rect.bottom);
            popupWindow.showAsDropDown(view, i4, i5);
            return;
        }
        popupWindow.showAsDropDown(view, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        String p02;
        super.onActivityResult(i4, i5, intent);
        if (i4 == 258 && i5 == -1) {
            if (this.f14991f == null) {
                this.f14991f = new ArrayList();
            }
            Uri uri = this.f15003r;
            if (uri != null) {
                p02 = v0(this, uri);
            } else {
                p02 = p0(intent);
            }
            if (!g2.h(p02)) {
                List<String> list = this.f14991f;
                if (list != null && list.size() >= C) {
                    List<String> list2 = this.f14991f;
                    list2.remove(list2.size() - 1);
                }
                this.f14991f.add(p02);
                D0(p02, true);
                I0();
                return;
            }
            Toast.makeText(this, "获取图片失败", 0).show();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.back_image) {
            finish();
        } else if (id == R.id.ok_image) {
            I0();
        } else if (id == R.id.album_collapse_image || id == R.id.layout_title || id == R.id.layout_show_album) {
            J0(findViewById(R.id.album_title));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.my_album_activity);
        C = getIntent().getIntExtra("MAX_PICK_SIZE", 9);
        A0();
        z0();
        x0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        F0();
    }

    protected void r0() {
        if (Environment.getExternalStorageState().equals("mounted")) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Long.valueOf(System.currentTimeMillis()));
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM) + "/Camera/IMG_" + format + ".jpg");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            System.out.println(file.getAbsoluteFile());
            Uri uriForFile = FileProvider.getUriForFile(this, getPackageName() + ".fileprovider", file);
            intent.putExtra("output", uriForFile);
            this.f15003r = uriForFile;
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(intent, 258);
                return;
            }
            return;
        }
        Toast.makeText(getApplicationContext(), "请确认已经插入SD卡", 1).show();
    }

    protected void s0() {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        startActivityForResult(intent, 257);
    }

    public Uri t0(Context context, Bitmap bitmap) {
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new ByteArrayOutputStream());
        return Uri.parse(MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, "Title", (String) null));
    }
}
