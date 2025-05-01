package com.aggmoread.sdk.z.a.o;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.aggmoread.sdk.z.a.g.e;
import com.aggmoread.sdk.z.a.g.g;
import com.aggmoread.sdk.z.a.m.j;
import com.aggmoread.sdk.z.a.m.m;
import com.aggmoread.sdk.z.a.p.a;
import com.aggmoread.sdk.z.c.a.a.e.l;
/* loaded from: classes2.dex */
public class a implements com.aggmoread.sdk.z.a.t.d {

    /* renamed from: a  reason: collision with root package name */
    private Activity f2347a;

    /* renamed from: b  reason: collision with root package name */
    private l f2348b;

    /* renamed from: c  reason: collision with root package name */
    private g f2349c;

    /* renamed from: d  reason: collision with root package name */
    private d f2350d;

    /* renamed from: e  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.r.a f2351e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f2352f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.aggmoread.sdk.z.a.o.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0065a implements View.OnClickListener {
        View$OnClickListenerC0065a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f2347a != null) {
                a.this.f2347a.finish();
            }
            if (a.this.f2350d != null) {
                a.this.f2350d.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f2350d != null) {
                a.this.f2350d.a(a.this.f2347a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements a.g {

        /* renamed from: com.aggmoread.sdk.z.a.o.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0066a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bitmap f2356b;

            RunnableC0066a(Bitmap bitmap) {
                this.f2356b = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f2350d != null) {
                    a.this.f2350d.a(a.this.f2351e);
                }
                a.this.f2348b.setImageBitmap(this.f2356b);
                a.this.f2352f.setVisibility(0);
            }
        }

        c() {
        }

        @Override // com.aggmoread.sdk.z.a.p.a.g
        public void a(int i4, byte[] bArr, e eVar) {
            a aVar = a.this;
            if (eVar != null) {
                aVar.d();
            } else if (bArr == null) {
                aVar.d();
            } else {
                m.a().post(new RunnableC0066a(com.aggmoread.sdk.z.a.n.a.a().a(aVar.f2348b.getWidth(), a.this.f2348b.getHeight(), Bitmap.Config.ARGB_8888, ImageView.ScaleType.CENTER_INSIDE, bArr)));
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a();

        void a(int i4, String str);

        void a(Activity activity);

        void a(com.aggmoread.sdk.z.a.r.a aVar);
    }

    private View c() {
        FrameLayout frameLayout = new FrameLayout(this.f2347a);
        frameLayout.setBackgroundColor(Color.parseColor("#50000000"));
        FrameLayout frameLayout2 = new FrameLayout(this.f2347a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.aggmoread.sdk.z.a.m.b.a(this.f2347a, 300.0d), com.aggmoread.sdk.z.a.m.b.a(this.f2347a, 500.0d));
        layoutParams.gravity = 17;
        int a5 = com.aggmoread.sdk.z.a.m.b.a(this.f2347a, 6.0d);
        Drawable a6 = com.aggmoread.sdk.z.a.m.b.a(-16777216, 1.0f, a5, 0, 0);
        frameLayout2.setBackground(a6);
        frameLayout2.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(this.f2347a);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        l lVar = new l(this.f2347a);
        this.f2348b = lVar;
        lVar.a(a5);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 1.0f;
        this.f2348b.setLayoutParams(layoutParams2);
        this.f2348b.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f2348b.setBackground(a6);
        linearLayout.addView(this.f2348b);
        this.f2352f = new TextView(this.f2347a);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int a7 = com.aggmoread.sdk.z.a.m.b.a(this.f2347a, 10.0d);
        com.aggmoread.sdk.z.a.m.b.a(this.f2347a, 20.0d);
        layoutParams3.topMargin = a7;
        this.f2352f.setLayoutParams(layoutParams3);
        this.f2352f.setText("查看详情");
        this.f2352f.setTextColor(Color.parseColor("#ffffff"));
        this.f2352f.setTextSize(15.0f);
        this.f2352f.setPadding(a7, a7, a7, a7);
        this.f2352f.setGravity(17);
        this.f2352f.setBackground(com.aggmoread.sdk.z.a.m.b.a(Color.parseColor("#0a81fc"), 1.0f, com.aggmoread.sdk.z.a.m.b.a(this.f2347a, 6.0d), 0, 0));
        this.f2352f.setVisibility(4);
        linearLayout.addView(this.f2352f);
        frameLayout2.addView(linearLayout);
        ImageView imageView = new ImageView(this.f2347a);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(com.aggmoread.sdk.z.a.m.b.a(this.f2347a, 24.0d), com.aggmoread.sdk.z.a.m.b.a(this.f2347a, 24.0d));
        layoutParams4.gravity = 53;
        layoutParams4.topMargin = com.aggmoread.sdk.z.a.m.b.a(this.f2347a, 10.0d);
        layoutParams4.rightMargin = com.aggmoread.sdk.z.a.m.b.a(this.f2347a, 10.0d);
        imageView.setLayoutParams(layoutParams4);
        j.a(imageView, "iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAAXNSR0IArs4c6QAAAmZJREFUWEfVlzloFmEQhp+30FIQQVAUBK9ORLQQDyKS1IKaWkjpFQUbU6igQbTQJJYGe2PAq9LCI9opqJ0HaCEKKe3ldT+ZHzabvRIDiwvbfNc8O/POzLei40cd2+f/ArC9ExgA+oG1wJrw4E/gB3APmJH0oa1nW3nA9j7gNHC4cPA34DewsTA+DYxJmmkCaQSwfQU4Hwe9A14Bb4HnkhIAttcBu+M9CGyL9ROSTtVB1ALYTsb2xAHXgcuSftUdaHs1cAs4Guu+SNpctacSwPZnYFNsHJD0tMmd+XnbKWQ3Y+y1pL1l+0sBbI8DJ9MGSY1havCIY35U0khx7bzDQ3AvY+GwpLGFfHlxre2UMU9ifH9RmGUAKZWS2qckDfYOtN2XCa8vc8jFhi8eBu73BBoivQacA6YlHcnvnwNgO6n3PZDyuF/SbA4gGb5QBCvE/W6I71Ie1PYK4EUGth3YJelNb18R4Hgo+Eam9rMl7uwZmOOd+MrKuZifAE4AI5JGqwCeJTcDg5Kmylxte56hsrES+GPAnagfB6oAPgJbgPWSvlfFOm8w1qScn+eVQng2AF+BT5K2VgGkIjMrqZf/lXrLQaQ1tcZzOkoAqyQlTfx9ihroHGAxIVgGHGrygu1WIViwCG0vBx5Fm64Mhe1WIlxUGtpeCTwEUr0vhbDdKg3rCtEQcLvGQGrJDzKQHcAZSb1GlNp1u0IUBaO0FMfckKTJmvRM6XU1S+NJSY9z6m9XisNIuv1014wCort2nHNbdxeSHER3V7IcRHeX0hxEd9fyQkfr5seksiUuwcQ/3XiXwH73P6d/AMNtZjBWZp4QAAAAAElFTkSuQmCC");
        imageView.setOnClickListener(new View$OnClickListenerC0065a());
        frameLayout2.addView(imageView);
        frameLayout2.setOnClickListener(new b());
        this.f2351e = com.aggmoread.sdk.z.a.r.a.a(frameLayout2, null);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        d dVar = this.f2350d;
        if (dVar != null) {
            dVar.a(50006, "素材加载失败");
        }
    }

    private void e() {
        g gVar = this.f2349c;
        if (gVar == null) {
            d();
        } else if (this.f2348b != null) {
            com.aggmoread.sdk.z.a.p.a.a(gVar.f2120a, null, new c());
        }
    }

    @Override // com.aggmoread.sdk.z.a.t.d
    public void a(Activity activity) {
        this.f2347a = activity;
    }

    @Override // com.aggmoread.sdk.z.a.t.d
    public void a(Intent intent) {
    }

    @Override // com.aggmoread.sdk.z.a.t.d
    public void a(Bundle bundle) {
        Activity activity = this.f2347a;
        if (activity != null) {
            activity.setContentView(c());
            e();
        }
    }

    public void a(g gVar) {
        this.f2349c = gVar;
    }

    public void a(d dVar) {
        this.f2350d = dVar;
    }

    @Override // com.aggmoread.sdk.z.a.t.d
    public boolean a() {
        return true;
    }

    @Override // com.aggmoread.sdk.z.a.t.d
    public boolean a(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.aggmoread.sdk.z.a.t.d
    public void b() {
    }

    @Override // com.aggmoread.sdk.z.a.t.d
    public void onPause() {
    }

    @Override // com.aggmoread.sdk.z.a.t.d
    public void onResume() {
    }
}
