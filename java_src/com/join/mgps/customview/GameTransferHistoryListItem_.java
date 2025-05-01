package com.join.mgps.customview;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public final class GameTransferHistoryListItem_ extends GameTransferHistoryListItem implements a4.a, a4.b {

    /* renamed from: i  reason: collision with root package name */
    private boolean f47101i;

    /* renamed from: j  reason: collision with root package name */
    private final a4.c f47102j;

    public GameTransferHistoryListItem_(Context context) {
        super(context);
        this.f47101i = false;
        this.f47102j = new a4.c();
        f();
    }

    public static GameTransferHistoryListItem e(Context context) {
        GameTransferHistoryListItem_ gameTransferHistoryListItem_ = new GameTransferHistoryListItem_(context);
        gameTransferHistoryListItem_.onFinishInflate();
        return gameTransferHistoryListItem_;
    }

    private void f() {
        a4.c c5 = a4.c.c(this.f47102j);
        a4.c.b(this);
        a4.c.c(c5);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        if (!this.f47101i) {
            this.f47101i = true;
            RelativeLayout.inflate(getContext(), R.layout.game_transfer_list_item, this);
            this.f47102j.a(this);
        }
        super.onFinishInflate();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f47094b = (TextView) aVar.internalFindViewById(R.id.game_transfer_item_game_name_txt);
        this.f47095c = (TextView) aVar.internalFindViewById(R.id.game_transfer_item_game_size_txt);
        this.f47096d = (TextView) aVar.internalFindViewById(R.id.game_transfer_list_item_transfer_status_txt);
        this.f47097e = (SimpleDraweeView) aVar.internalFindViewById(R.id.game_transfer_item_game_icon_img);
    }
}
