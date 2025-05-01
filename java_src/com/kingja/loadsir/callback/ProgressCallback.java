package com.kingja.loadsir.callback;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.StyleRes;
/* loaded from: classes5.dex */
public class ProgressCallback extends Callback {

    /* renamed from: b  reason: collision with root package name */
    private String f55193b;

    /* renamed from: c  reason: collision with root package name */
    private String f55194c;

    /* renamed from: d  reason: collision with root package name */
    private int f55195d;

    /* renamed from: e  reason: collision with root package name */
    private int f55196e;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private String f55197a;

        /* renamed from: b  reason: collision with root package name */
        private String f55198b;

        /* renamed from: c  reason: collision with root package name */
        private int f55199c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f55200d = -1;

        /* renamed from: e  reason: collision with root package name */
        private boolean f55201e;

        public ProgressCallback f() {
            return new ProgressCallback(this);
        }

        public b g(boolean z4) {
            this.f55201e = z4;
            return this;
        }

        public b h(String str) {
            return i(str, -1);
        }

        public b i(String str, @StyleRes int i4) {
            this.f55198b = str;
            this.f55199c = i4;
            return this;
        }

        public b j(String str) {
            return k(str, -1);
        }

        public b k(String str, @StyleRes int i4) {
            this.f55197a = str;
            this.f55200d = i4;
            return this;
        }
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
        linearLayout.addView(new ProgressBar(context), layoutParams);
        if (!TextUtils.isEmpty(this.f55193b)) {
            TextView textView = new TextView(context);
            textView.setText(this.f55193b);
            int i4 = this.f55196e;
            if (i4 == -1) {
                textView.setTextAppearance(context, 16973890);
            } else {
                textView.setTextAppearance(context, i4);
            }
            linearLayout.addView(textView, layoutParams);
        }
        if (TextUtils.isEmpty(this.f55194c)) {
            return;
        }
        TextView textView2 = new TextView(context);
        textView2.setText(this.f55194c);
        int i5 = this.f55195d;
        if (i5 == -1) {
            textView2.setTextAppearance(context, 16973892);
        } else {
            textView2.setTextAppearance(context, i5);
        }
        linearLayout.addView(textView2, layoutParams);
    }

    private ProgressCallback(b bVar) {
        this.f55195d = -1;
        this.f55196e = -1;
        this.f55193b = bVar.f55197a;
        this.f55194c = bVar.f55198b;
        this.f55195d = bVar.f55199c;
        this.f55196e = bVar.f55200d;
        setSuccessVisible(bVar.f55201e);
    }
}
