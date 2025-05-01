package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.g2;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.enums.Dtype;
import java.util.List;
/* compiled from: ModGameDeleteGamePopupWindow.java */
/* loaded from: classes4.dex */
public class m extends p implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    SimpleDraweeView f48563b;

    /* renamed from: c  reason: collision with root package name */
    SimpleDraweeView f48564c;

    /* renamed from: d  reason: collision with root package name */
    TextView f48565d;

    /* renamed from: e  reason: collision with root package name */
    TextView f48566e;

    /* renamed from: f  reason: collision with root package name */
    TextView f48567f;

    /* renamed from: g  reason: collision with root package name */
    TextView f48568g;

    /* renamed from: h  reason: collision with root package name */
    private String f48569h;

    /* renamed from: i  reason: collision with root package name */
    private String f48570i;

    /* renamed from: j  reason: collision with root package name */
    private ImageView f48571j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f48572k;

    /* renamed from: l  reason: collision with root package name */
    private View f48573l;

    /* renamed from: m  reason: collision with root package name */
    private View f48574m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f48575n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f48576o;

    /* renamed from: p  reason: collision with root package name */
    a f48577p;

    /* compiled from: ModGameDeleteGamePopupWindow.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a(boolean z4, String str, boolean z5, String str2);
    }

    public m(Context context) {
        super(context);
        init();
    }

    private void d(boolean z4, ImageView imageView) {
        if (z4) {
            imageView.setImageResource(R.drawable.ic_mod_check_selected);
        } else {
            imageView.setImageResource(R.drawable.ic_mod_check_normal);
        }
        if (!this.f48575n && !this.f48576o) {
            this.f48567f.setTextColor(Color.parseColor("#FFB6B6B6"));
        } else {
            this.f48567f.setTextColor(Color.parseColor("#FFFF4E4E"));
        }
    }

    public a a() {
        return this.f48577p;
    }

    public void b(a aVar) {
        this.f48577p = aVar;
    }

    public void c(View view, DownloadTask downloadTask) {
        ModInfoBean modInfoBean;
        List<DownloadTask> G;
        showAtLocation(view, 80, 0, 0);
        if (downloadTask == null || !g2.i(downloadTask.getMod_info()) || (modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(downloadTask.getMod_info(), ModInfoBean.class)) == null || (G = p1.f.K().G(modInfoBean.getMain_game_id(), modInfoBean.getMod_game_id())) == null) {
            return;
        }
        for (DownloadTask downloadTask2 : G) {
            if (Dtype.MOD.name().equals(downloadTask2.getFileType())) {
                this.f48570i = downloadTask2.getCrc_link_type_val();
                this.f48573l.setVisibility(0);
                MyImageLoader.h(this.f48564c, downloadTask2.getPortraitURL());
            } else {
                this.f48574m.setVisibility(0);
                this.f48569h = downloadTask2.getCrc_link_type_val();
                MyImageLoader.h(this.f48563b, downloadTask2.getPortraitURL());
            }
        }
    }

    void init() {
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.pop_mod_game_delete_game, (ViewGroup) null);
        this.parentView = inflate;
        setContentView(inflate);
        setWidth(-1);
        setHeight(-2);
        this.f48563b = (SimpleDraweeView) this.parentView.findViewById(R.id.icon);
        this.f48565d = (TextView) this.parentView.findViewById(R.id.name);
        this.f48564c = (SimpleDraweeView) this.parentView.findViewById(R.id.icon_mod);
        this.f48566e = (TextView) this.parentView.findViewById(R.id.name_mod);
        this.f48571j = (ImageView) this.parentView.findViewById(R.id.iv_mod_check);
        this.f48572k = (ImageView) this.parentView.findViewById(R.id.iv_stand_check);
        this.f48573l = this.parentView.findViewById(R.id.rl_mod);
        this.f48574m = this.parentView.findViewById(R.id.rl_stand);
        this.f48567f = (TextView) this.parentView.findViewById(R.id.delete);
        this.f48568g = (TextView) this.parentView.findViewById(R.id.cancel);
        this.f48567f.setOnClickListener(this);
        this.f48568g.setOnClickListener(this);
        this.f48573l.setOnClickListener(this);
        this.f48574m.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.delete) {
            boolean z4 = this.f48575n;
            if (z4 || this.f48576o) {
                a aVar = this.f48577p;
                if (aVar != null) {
                    aVar.a(z4, this.f48570i, this.f48576o, this.f48569h);
                }
                dismiss();
            }
        } else if (id == R.id.cancel) {
            dismiss();
        } else if (id == R.id.rl_mod) {
            boolean z5 = !this.f48575n;
            this.f48575n = z5;
            d(z5, this.f48571j);
        } else if (id == R.id.rl_stand) {
            boolean z6 = !this.f48576o;
            this.f48576o = z6;
            d(z6, this.f48572k);
        }
    }
}
