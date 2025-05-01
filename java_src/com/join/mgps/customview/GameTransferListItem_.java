package com.join.mgps.customview;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public final class GameTransferListItem_ extends GameTransferListItem implements a4.a, a4.b {

    /* renamed from: n  reason: collision with root package name */
    private boolean f47116n;

    /* renamed from: o  reason: collision with root package name */
    private final a4.c f47117o;

    public GameTransferListItem_(Context context) {
        super(context);
        this.f47116n = false;
        this.f47117o = new a4.c();
        e();
    }

    public static GameTransferListItem d(Context context) {
        GameTransferListItem_ gameTransferListItem_ = new GameTransferListItem_(context);
        gameTransferListItem_.onFinishInflate();
        return gameTransferListItem_;
    }

    private void e() {
        a4.c c5 = a4.c.c(this.f47117o);
        a4.c.b(this);
        a4.c.c(c5);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        if (!this.f47116n) {
            this.f47116n = true;
            RelativeLayout.inflate(getContext(), R.layout.game_transfer_list_item, this);
            this.f47117o.a(this);
        }
        super.onFinishInflate();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f47104b = (TextView) aVar.internalFindViewById(R.id.game_transfer_item_game_name_txt);
        this.f47105c = (TextView) aVar.internalFindViewById(R.id.game_transfer_item_game_size_txt);
        this.f47106d = (TextView) aVar.internalFindViewById(R.id.game_transfer_list_item_transfer_status_txt);
        this.f47107e = (CheckBox) aVar.internalFindViewById(R.id.game_transfer_list_item_transfer_status_chk);
        this.f47108f = (FrameLayout) aVar.internalFindViewById(R.id.checkLayout);
        this.f47109g = (SimpleDraweeView) aVar.internalFindViewById(R.id.game_transfer_item_game_icon_img);
    }
}
