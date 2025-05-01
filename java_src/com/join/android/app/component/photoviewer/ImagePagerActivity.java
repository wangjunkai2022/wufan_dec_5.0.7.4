package com.join.android.app.component.photoviewer;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.BaseFragmentActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.h0;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.p1;
import com.join.mgps.Util.s1;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes3.dex */
public class ImagePagerActivity extends BaseFragmentActivity {

    /* renamed from: g  reason: collision with root package name */
    private static final String f15164g = "STATE_POSITION";

    /* renamed from: h  reason: collision with root package name */
    public static final String f15165h = "image_index";

    /* renamed from: i  reason: collision with root package name */
    public static final String f15166i = "image_urls";

    /* renamed from: b  reason: collision with root package name */
    private MultiTouchViewPager f15167b;

    /* renamed from: c  reason: collision with root package name */
    private int f15168c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f15169d;

    /* renamed from: e  reason: collision with root package name */
    g f15170e;

    /* renamed from: f  reason: collision with root package name */
    View.OnLongClickListener f15171f = new a();

    /* loaded from: classes3.dex */
    class a implements View.OnLongClickListener {
        a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ImagePagerActivity.this.f15167b.getCurrentItem();
            ImagePagerActivity imagePagerActivity = ImagePagerActivity.this;
            if (imagePagerActivity.f15170e == null) {
                imagePagerActivity.m0();
            }
            if (ImagePagerActivity.this.f15170e.isShowing()) {
                return true;
            }
            ImagePagerActivity.this.n0(view);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    class b implements ViewPager.OnPageChangeListener {
        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            ImagePagerActivity.this.f15169d.setText(ImagePagerActivity.this.getString(R.string.viewpager_indicator, new Object[]{Integer.valueOf(i4 + 1), Integer.valueOf(ImagePagerActivity.this.f15167b.getAdapter().getCount())}));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements PopupWindow.OnDismissListener {
        c() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            WindowManager.LayoutParams attributes = ImagePagerActivity.this.getWindow().getAttributes();
            attributes.alpha = 1.0f;
            ImagePagerActivity.this.getWindow().setAttributes(attributes);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d extends AsyncTask {

        /* renamed from: a  reason: collision with root package name */
        String f15175a;

        d() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
            if (r6 == null) goto L7;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v7, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r6v9 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private android.graphics.Bitmap a(java.lang.String r6) {
            /*
                r5 = this;
                r0 = 0
                java.net.HttpURLConnection r6 = r5.b(r6)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L1a
                java.io.InputStream r1 = r6.getInputStream()     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L13
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L13
            Ld:
                r6.disconnect()
                goto L2e
            L11:
                r0 = move-exception
                goto L2f
            L13:
                r1 = move-exception
                goto L1c
            L15:
                r6 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L2f
            L1a:
                r1 = move-exception
                r6 = r0
            L1c:
                com.join.android.app.component.photoviewer.ImagePagerActivity r2 = com.join.android.app.component.photoviewer.ImagePagerActivity.this     // Catch: java.lang.Throwable -> L11
                r3 = 2131755673(0x7f100299, float:1.9142232E38)
                java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L11
                com.join.android.app.component.photoviewer.ImagePagerActivity.k0(r2, r3)     // Catch: java.lang.Throwable -> L11
                r1.printStackTrace()     // Catch: java.lang.Throwable -> L11
                if (r6 == 0) goto L2e
                goto Ld
            L2e:
                return r0
            L2f:
                if (r6 == 0) goto L34
                r6.disconnect()
            L34:
                goto L36
            L35:
                throw r0
            L36:
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.component.photoviewer.ImagePagerActivity.d.a(java.lang.String):android.graphics.Bitmap");
        }

        private void d(Bitmap bitmap, String str) {
            try {
                String str2 = s1.g() + "/wufan91/img/IMG_" + System.currentTimeMillis() + str.substring(str.lastIndexOf(h0.f27805a), str.length());
                File file = new File(str2);
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                if (bitmap == null) {
                    ImagePagerActivity.this.showToast("保存失败");
                    return;
                }
                p1.n(bitmap, str2);
                c(str2, file.getName());
                ImagePagerActivity.this.showToast("保存成功");
            } catch (Exception e5) {
                ImagePagerActivity.this.showToast("保存失败");
                e5.printStackTrace();
            }
        }

        public HttpURLConnection b(String str) throws Exception {
            HttpURLConnection httpURLConnection;
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setRequestMethod("GET");
                } catch (Exception unused) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                }
            } catch (Exception unused2) {
                httpURLConnection = null;
            }
            if (httpURLConnection.getResponseCode() == 200) {
                return httpURLConnection;
            }
            return null;
        }

        void c(String str, String str2) {
            ContentResolver contentResolver = ImagePagerActivity.this.getContentResolver();
            ContentValues contentValues = new ContentValues(7);
            contentValues.put("title", str2);
            contentValues.put("_display_name", str2);
            contentValues.put("mime_type", "image/jpeg");
            contentValues.put("_data", str);
            contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        }

        @Override // android.os.AsyncTask
        protected Object doInBackground(Object[] objArr) {
            String str = (String) objArr[0];
            this.f15175a = str;
            d(a(str), this.f15175a);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f15177b;

        e(String str) {
            this.f15177b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            l2.a(ImagePagerActivity.this).b(this.f15177b);
        }
    }

    /* loaded from: classes3.dex */
    private class f extends FragmentStatePagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public String[] f15179a;

        public f(FragmentManager fragmentManager, String[] strArr) {
            super(fragmentManager);
            this.f15179a = strArr;
        }

        public String b(int i4) {
            if (i4 >= 0) {
                String[] strArr = this.f15179a;
                return i4 < strArr.length ? strArr[i4] : "";
            }
            return "";
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            String[] strArr = this.f15179a;
            if (strArr == null) {
                return 0;
            }
            return strArr.length;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public Fragment getItem(int i4) {
            ImageDetailFragment b02 = ImageDetailFragment.b0(this.f15179a[i4]);
            b02.d0(ImagePagerActivity.this.f15171f);
            return b02;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g extends PopupWindow {

        /* renamed from: a  reason: collision with root package name */
        private final Context f15181a;

        /* renamed from: b  reason: collision with root package name */
        private final View f15182b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ImagePagerActivity.this.l0().execute(((f) ImagePagerActivity.this.f15167b.getAdapter()).b(ImagePagerActivity.this.f15167b.getCurrentItem()));
                g.this.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                g.this.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class c implements View.OnTouchListener {
            c() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 4) {
                    g.this.dismiss();
                    return true;
                }
                return false;
            }
        }

        public g(Context context, View view, int i4, int i5) {
            super(view, i4, i5, true);
            this.f15181a = context;
            this.f15182b = view;
            b();
            a();
        }

        private void a() {
            View findViewById = this.f15182b.findViewById(R.id.saveImage);
            View findViewById2 = this.f15182b.findViewById(R.id.cancel);
            findViewById.setOnClickListener(new a());
            findViewById2.setOnClickListener(new b());
        }

        private void b() {
            setBackgroundDrawable(new BitmapDrawable());
            setTouchable(true);
            setOutsideTouchable(true);
            setTouchInterceptor(new c());
        }

        @Override // android.widget.PopupWindow
        public int getHeight() {
            return this.f15182b.getMeasuredHeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AsyncTask l0() {
        return new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        g gVar = new g(this, LayoutInflater.from(this).inflate(R.layout.image_detail_pager_popupwindow, (ViewGroup) null), -1, -2);
        this.f15170e = gVar;
        gVar.setOnDismissListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(View view) {
        View findViewById = findViewById(R.id.bottomLayout);
        if (this.f15170e == null) {
            m0();
        }
        this.f15170e.setAnimationStyle(R.style.animation_image_pager_popup);
        int i4 = -this.f15170e.getHeight();
        if (i4 == 0) {
            i4 = (int) (findViewById.getResources().getDisplayMetrics().density * (-92.0f));
        }
        this.f15170e.showAsDropDown(findViewById, 0, i4);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.alpha = 0.3f;
        getWindow().setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showToast(String str) {
        runOnUiThread(new e(str));
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.image_detail_pager);
        this.f15168c = getIntent().getIntExtra("image_index", 0);
        String[] stringArrayExtra = getIntent().getStringArrayExtra("image_urls");
        this.f15167b = (MultiTouchViewPager) findViewById(R.id.pager);
        this.f15167b.setAdapter(new f(getSupportFragmentManager(), stringArrayExtra));
        this.f15169d = (TextView) findViewById(R.id.indicator);
        this.f15169d.setText(getString(R.string.viewpager_indicator, new Object[]{1, Integer.valueOf(this.f15167b.getAdapter().getCount())}));
        this.f15167b.setOnPageChangeListener(new b());
        if (bundle != null) {
            this.f15168c = bundle.getInt(f15164g);
        }
        this.f15167b.setCurrentItem(this.f15168c);
        m0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        g gVar = this.f15170e;
        if (gVar != null && gVar.isShowing()) {
            this.f15170e.dismiss();
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(f15164g, this.f15167b.getCurrentItem());
    }
}
