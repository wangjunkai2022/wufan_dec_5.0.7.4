package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class CloudDownButn extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    TextView f46591b;

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: b  reason: collision with root package name */
        public static final int f46592b = 0;

        /* renamed from: c  reason: collision with root package name */
        public static final int f46593c = 2;

        /* renamed from: d  reason: collision with root package name */
        public static final int f46594d = 3;

        /* renamed from: e  reason: collision with root package name */
        public static final int f46595e = 4;

        /* renamed from: f  reason: collision with root package name */
        public static final int f46596f = 5;

        /* renamed from: g  reason: collision with root package name */
        public static final int f46597g = 6;

        /* renamed from: h  reason: collision with root package name */
        public static final int f46598h = 7;

        /* renamed from: i  reason: collision with root package name */
        public static final int f46599i = 8;

        public a() {
        }
    }

    public CloudDownButn(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        this.f46591b = (TextView) LayoutInflater.from(context).inflate(getLayoutId(), this).findViewById(R.id.downView);
    }

    protected int getLayoutId() {
        return R.layout.cloud_down_butn;
    }

    public void setStatu(int i4) {
        if (i4 != 0) {
            switch (i4) {
                case 2:
                    this.f46591b.setText("上传中");
                    return;
                case 3:
                    this.f46591b.setText("下载中");
                    return;
                case 4:
                    this.f46591b.setText("备份");
                    return;
                case 5:
                    this.f46591b.setText("已备份");
                    return;
                case 6:
                    this.f46591b.setText("下载");
                    return;
                case 7:
                    this.f46591b.setText("备份中");
                    return;
                default:
                    return;
            }
        }
        this.f46591b.setText("启动");
    }

    public void setTextColor(int i4) {
        this.f46591b.setTextColor(i4);
    }

    public CloudDownButn(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public CloudDownButn(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a(context);
    }
}
