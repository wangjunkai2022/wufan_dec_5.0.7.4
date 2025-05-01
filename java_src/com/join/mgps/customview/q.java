package com.join.mgps.customview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: MyGameDeleteGamePopupWindow.java */
/* loaded from: classes4.dex */
public class q extends p implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    SimpleDraweeView f48648b;

    /* renamed from: c  reason: collision with root package name */
    TextView f48649c;

    /* renamed from: d  reason: collision with root package name */
    View f48650d;

    /* renamed from: e  reason: collision with root package name */
    View f48651e;

    /* renamed from: f  reason: collision with root package name */
    private String f48652f;

    /* renamed from: g  reason: collision with root package name */
    a f48653g;

    /* compiled from: MyGameDeleteGamePopupWindow.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);
    }

    public q(Context context) {
        super(context);
        init();
    }

    public a a() {
        return this.f48653g;
    }

    public void b(a aVar) {
        this.f48653g = aVar;
    }

    public void c(View view, String str) {
        showAtLocation(view, 80, 0, 0);
        this.f48652f = str;
        DownloadTask F = p1.f.K().F(str);
        if (F == null) {
            return;
        }
        MyImageLoader.h(this.f48648b, F.getPortraitURL());
        TextView textView = this.f48649c;
        textView.setText("是否删除“" + F.getShowName() + "”？");
    }

    void init() {
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.pop_my_game_delete_game, (ViewGroup) null);
        this.parentView = inflate;
        setContentView(inflate);
        setWidth(-1);
        setHeight(-2);
        this.f48648b = (SimpleDraweeView) this.parentView.findViewById(R.id.icon);
        this.f48649c = (TextView) this.parentView.findViewById(R.id.name);
        this.f48650d = this.parentView.findViewById(R.id.delete);
        this.f48651e = this.parentView.findViewById(R.id.cancel);
        this.f48650d.setOnClickListener(this);
        this.f48651e.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.delete) {
            if (id == R.id.cancel) {
                dismiss();
                return;
            }
            return;
        }
        a aVar = this.f48653g;
        if (aVar != null) {
            aVar.a(this.f48652f);
        }
        dismiss();
    }
}
