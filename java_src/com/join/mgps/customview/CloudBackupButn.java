package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class CloudBackupButn extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    TextView f46582b;

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: b  reason: collision with root package name */
        public static final int f46583b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static final int f46584c = 2;

        /* renamed from: d  reason: collision with root package name */
        public static final int f46585d = 3;

        /* renamed from: e  reason: collision with root package name */
        public static final int f46586e = 4;

        /* renamed from: f  reason: collision with root package name */
        public static final int f46587f = 5;

        /* renamed from: g  reason: collision with root package name */
        public static final int f46588g = 6;

        /* renamed from: h  reason: collision with root package name */
        public static final int f46589h = 7;

        public a() {
        }
    }

    public CloudBackupButn(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        this.f46582b = (TextView) LayoutInflater.from(context).inflate(R.layout.cloud_down_butn, this).findViewById(R.id.downView);
    }

    public void setStatu(int i4) {
        switch (i4) {
            case 1:
                this.f46582b.setText("启动");
                return;
            case 2:
                this.f46582b.setText("上传中");
                return;
            case 3:
                this.f46582b.setText("下载中");
                return;
            case 4:
                this.f46582b.setText("备份");
                return;
            case 5:
                this.f46582b.setText("已备份");
                return;
            case 6:
                this.f46582b.setText("下载");
                return;
            case 7:
                this.f46582b.setText("备份中");
                return;
            default:
                return;
        }
    }

    public CloudBackupButn(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public CloudBackupButn(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a(context);
    }
}
