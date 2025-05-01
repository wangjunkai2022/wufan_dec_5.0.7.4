package com.beizi.fusion.g;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.beizi.ad.internal.view.complaint.ComplaintDialog;
/* compiled from: ComplaintViewUtil.java */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private TextView f7002a;

    /* renamed from: b  reason: collision with root package name */
    private a f7003b;

    /* compiled from: ComplaintViewUtil.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);
    }

    public void a(Context context, ViewGroup viewGroup, String str) {
        try {
            a(context, str);
            TextView textView = this.f7002a;
            if (textView != null) {
                viewGroup.addView(textView);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void a(Context context, String str) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            this.f7002a = textView;
            textView.setText("投诉");
            this.f7002a.setTextColor(Color.parseColor("#FFFFFF"));
            as.a(this.f7002a, "#99000000", 0, "", 30);
            if ("1".equals(str)) {
                this.f7002a.setTextSize(2, 13.0f);
                this.f7002a.setPadding(av.a(context, 12.0f), av.a(context, 1.0f), av.a(context, 12.0f), av.a(context, 1.0f));
                layoutParams.leftMargin = 18;
                layoutParams.topMargin = 18;
            } else if ("2".equals(str)) {
                this.f7002a.setTextSize(2, 13.0f);
                this.f7002a.setPadding(av.a(context, 12.0f), av.a(context, 1.0f), av.a(context, 12.0f), av.a(context, 1.0f));
                layoutParams.leftMargin = av.a(context, 16.0f);
                layoutParams.topMargin = av.a(context, 16.0f);
            } else if ("3".equals(str)) {
                this.f7002a.setTextSize(2, 10.0f);
                this.f7002a.setPadding(av.a(context, 11.0f), av.a(context, 1.0f), av.a(context, 11.0f), av.a(context, 1.0f));
                layoutParams.leftMargin = 16;
                layoutParams.topMargin = 16;
            }
            this.f7002a.setLayoutParams(layoutParams);
            a();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a() {
        try {
            this.f7002a.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.fusion.g.p.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        ComplaintDialog.Builder builder = new ComplaintDialog.Builder(view.getContext());
                        builder.setDialogItemCallback(new ComplaintDialog.DialogItemCallback() { // from class: com.beizi.fusion.g.p.1.1
                            @Override // com.beizi.ad.internal.view.complaint.ComplaintDialog.DialogItemCallback
                            public void onDialogCloseClick() {
                            }

                            @Override // com.beizi.ad.internal.view.complaint.ComplaintDialog.DialogItemCallback
                            public void onDialogItemClick(String str) {
                                if (p.this.f7003b != null) {
                                    p.this.f7003b.a(str);
                                }
                            }
                        });
                        builder.create().show();
                    } catch (Exception e5) {
                        af.c("BeiZis", "e ：" + e5);
                    }
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a(a aVar) {
        this.f7003b = aVar;
    }
}
