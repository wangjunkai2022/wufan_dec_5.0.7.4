package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.g2;
import com.join.mgps.dto.GameTransferBean;
import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;
@EViewGroup(R.layout.game_transfer_list_item)
/* loaded from: classes4.dex */
public class GameTransferHistoryListItem extends RelativeLayout {

    /* renamed from: h  reason: collision with root package name */
    private static final String f47093h = GameTransferHistoryListItem.class.getSimpleName();
    @ViewById(R.id.game_transfer_item_game_name_txt)

    /* renamed from: b  reason: collision with root package name */
    TextView f47094b;
    @ViewById(R.id.game_transfer_item_game_size_txt)

    /* renamed from: c  reason: collision with root package name */
    TextView f47095c;
    @ViewById(R.id.game_transfer_list_item_transfer_status_txt)

    /* renamed from: d  reason: collision with root package name */
    TextView f47096d;
    @ViewById(R.id.game_transfer_item_game_icon_img)

    /* renamed from: e  reason: collision with root package name */
    SimpleDraweeView f47097e;

    /* renamed from: f  reason: collision with root package name */
    GameTransferBean f47098f;

    /* renamed from: g  reason: collision with root package name */
    Context f47099g;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameTransferHistoryListItem gameTransferHistoryListItem = GameTransferHistoryListItem.this;
            GameTransferBean gameTransferBean = gameTransferHistoryListItem.f47098f;
            if (gameTransferBean != null) {
                String c5 = gameTransferHistoryListItem.c(gameTransferBean.getId());
                if (g2.h(c5)) {
                    return;
                }
                GameTransferHistoryListItem.this.a(c5);
            }
        }
    }

    public GameTransferHistoryListItem(Context context) {
        super(context);
        this.f47099g = context;
    }

    void a(String str) {
        com.join.android.app.common.utils.e.l0(this.f47099g).x(this.f47099g, str);
    }

    public void b(GameTransferBean gameTransferBean) {
        if (gameTransferBean == null) {
            return;
        }
        this.f47098f = gameTransferBean;
        this.f47094b.setText(gameTransferBean.getGameName());
        TextView textView = this.f47095c;
        textView.setText(gameTransferBean.getSize() + "M");
        MyImageLoader.d(this.f47097e, R.drawable.main_normal_icon, this.f47098f.getIconUrl());
        StringBuilder sb = new StringBuilder();
        sb.append("bind:  gameName:::");
        sb.append(this.f47094b.getText().toString());
        sb.append("::gameSize:::");
        sb.append(this.f47095c.getText().toString());
        this.f47096d.setOnClickListener(null);
        this.f47096d.setOnClickListener(new a());
        d();
    }

    String c(String str) {
        DownloadTask F = p1.f.K().F(str);
        if (F == null) {
            return null;
        }
        return F.getGameZipPath();
    }

    void d() {
        int transferStatus = this.f47098f.getTransferStatus();
        this.f47096d.setVisibility(0);
        this.f47096d.setClickable(false);
        TextView textView = this.f47096d;
        new Color();
        textView.setBackgroundColor(Color.alpha(0));
        switch (transferStatus) {
            case 1:
                this.f47096d.setText(R.string.waiting_status_game_transfer);
                this.f47096d.setTextColor(this.f47099g.getResources().getColor(R.color.black_game_transfer_game_size));
                return;
            case 2:
                TextView textView2 = this.f47096d;
                textView2.setText(this.f47098f.getProgerss() + "%");
                this.f47096d.setTextColor(this.f47099g.getResources().getColor(R.color.blue_game_transfer));
                return;
            case 3:
                this.f47096d.setText(R.string.game_transfer_success);
                this.f47096d.setTextColor(this.f47099g.getResources().getColor(R.color.blue_game_transfer));
                return;
            case 4:
                this.f47096d.setTextColor(SupportMenu.CATEGORY_MASK);
                this.f47096d.setText(R.string.transfer_failed_status_game_transfer);
                return;
            case 5:
            default:
                return;
            case 6:
                this.f47096d.setText(R.string.transfer_unzip_status_game_transfer);
                this.f47096d.setTextColor(this.f47099g.getResources().getColor(R.color.blue_game_transfer));
                return;
            case 7:
                this.f47096d.setBackgroundResource(R.drawable.bg_game_transfer_install_app_txt);
                this.f47096d.setText(R.string.transfer_install_status_game_transfer);
                this.f47096d.setTextColor(this.f47099g.getResources().getColor(R.color.app_green_color));
                this.f47096d.setClickable(true);
                return;
            case 8:
                this.f47096d.setTextColor(SupportMenu.CATEGORY_MASK);
                this.f47096d.setText(R.string.transfer_failed_status_game_transfer);
                return;
            case 9:
                this.f47096d.setText(R.string.transfer_success_status_game_transfer);
                this.f47096d.setTextColor(this.f47099g.getResources().getColor(R.color.blue_game_transfer));
                return;
        }
    }
}
