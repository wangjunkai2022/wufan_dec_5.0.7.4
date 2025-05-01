package com.kingja.loadsir.callback;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StyleRes;
/* loaded from: classes5.dex */
public class HintCallback extends Callback {

    /* renamed from: b  reason: collision with root package name */
    private String f55183b;

    /* renamed from: c  reason: collision with root package name */
    private String f55184c;

    /* renamed from: d  reason: collision with root package name */
    private int f55185d;

    /* renamed from: e  reason: collision with root package name */
    private int f55186e;

    /* renamed from: f  reason: collision with root package name */
    private int f55187f;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f55188a;

        /* renamed from: b  reason: collision with root package name */
        private String f55189b;

        /* renamed from: c  reason: collision with root package name */
        private int f55190c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f55191d = -1;

        /* renamed from: e  reason: collision with root package name */
        private int f55192e = -1;

        public HintCallback f() {
            return new HintCallback(this);
        }

        public a g(@DrawableRes int i4) {
            this.f55190c = i4;
            return this;
        }

        public a h(String str) {
            return i(str, -1);
        }

        public a i(String str, @StyleRes int i4) {
            this.f55189b = str;
            this.f55191d = i4;
            return this;
        }

        public a j(String str) {
            return k(str, -1);
        }

        public a k(String str, @StyleRes int i4) {
            this.f55188a = str;
            this.f55192e = i4;
            return this;
        }
    }

    public HintCallback(a aVar) {
        this.f55183b = aVar.f55188a;
        this.f55184c = aVar.f55189b;
        this.f55185d = aVar.f55190c;
        this.f55187f = aVar.f55191d;
        this.f55186e = aVar.f55192e;
    }

    @Override // com.kingja.loadsir.callback.Callback
    protected View onBuildView(Context context) {
        return new LinearLayout(context);
    }

    @Override // com.kingja.loadsir.callback.Callback
    protected int onCreateView() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kingja.loadsir.callback.Callback
    public void onViewCreate(Context context, View view) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        if (this.f55185d != -1) {
            ImageView imageView = new ImageView(context);
            imageView.setBackgroundResource(this.f55185d);
            linearLayout.addView(imageView, layoutParams);
        }
        if (!TextUtils.isEmpty(this.f55183b)) {
            TextView textView = new TextView(context);
            textView.setText(this.f55183b);
            int i4 = this.f55186e;
            if (i4 == -1) {
                textView.setTextAppearance(context, 16973890);
            } else {
                textView.setTextAppearance(context, i4);
            }
            linearLayout.addView(textView, layoutParams);
        }
        if (TextUtils.isEmpty(this.f55184c)) {
            return;
        }
        TextView textView2 = new TextView(context);
        textView2.setText(this.f55184c);
        int i5 = this.f55187f;
        if (i5 == -1) {
            textView2.setTextAppearance(context, 16973894);
        } else {
            textView2.setTextAppearance(context, i5);
        }
        linearLayout.addView(textView2, layoutParams);
    }
}
