package com.join.mgps.customview;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.GameTransferBean;
import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;
@EViewGroup(R.layout.game_transfer_list_item)
/* loaded from: classes4.dex */
public class GameTransferListItem extends RelativeLayout {

    /* renamed from: m  reason: collision with root package name */
    private static final String f47103m = GameTransferListItem.class.getSimpleName();
    @ViewById(R.id.game_transfer_item_game_name_txt)

    /* renamed from: b  reason: collision with root package name */
    TextView f47104b;
    @ViewById(R.id.game_transfer_item_game_size_txt)

    /* renamed from: c  reason: collision with root package name */
    TextView f47105c;
    @ViewById(R.id.game_transfer_list_item_transfer_status_txt)

    /* renamed from: d  reason: collision with root package name */
    TextView f47106d;
    @ViewById(R.id.game_transfer_list_item_transfer_status_chk)

    /* renamed from: e  reason: collision with root package name */
    CheckBox f47107e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    FrameLayout f47108f;
    @ViewById(R.id.game_transfer_item_game_icon_img)

    /* renamed from: g  reason: collision with root package name */
    SimpleDraweeView f47109g;

    /* renamed from: h  reason: collision with root package name */
    GameTransferBean f47110h;

    /* renamed from: i  reason: collision with root package name */
    int f47111i;

    /* renamed from: j  reason: collision with root package name */
    boolean f47112j;

    /* renamed from: k  reason: collision with root package name */
    SparseArray<GameTransferBean> f47113k;

    /* renamed from: l  reason: collision with root package name */
    Context f47114l;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z4 = !GameTransferListItem.this.f47107e.isChecked();
            GameTransferListItem.this.f47107e.setChecked(z4);
            String unused = GameTransferListItem.f47103m;
            StringBuilder sb = new StringBuilder();
            sb.append("changeCheckboxStatus: ");
            sb.append(z4);
            sb.append("位置");
            sb.append(GameTransferListItem.this.f47111i);
            GameTransferListItem.this.f47110h.setSelectedTransfer(z4);
            GameTransferListItem gameTransferListItem = GameTransferListItem.this;
            gameTransferListItem.f47113k.setValueAt(gameTransferListItem.f47111i, gameTransferListItem.f47110h);
            org.greenrobot.eventbus.c.f().o(GameTransferListItem.this.f47110h);
        }
    }

    public GameTransferListItem(Context context) {
        super(context);
        this.f47114l = context;
    }

    public void b(int i4, SparseArray<GameTransferBean> sparseArray, boolean z4) {
        if (sparseArray == null) {
            return;
        }
        this.f47111i = i4;
        this.f47113k = sparseArray;
        GameTransferBean valueAt = sparseArray.valueAt(i4);
        this.f47110h = valueAt;
        this.f47104b.setText(valueAt.getGameName());
        TextView textView = this.f47105c;
        textView.setText(this.f47110h.getSize() + "M");
        this.f47112j = this.f47110h.isSelectedTransfer();
        MyImageLoader.d(this.f47109g, R.drawable.main_normal_icon, this.f47110h.getIconUrl());
        StringBuilder sb = new StringBuilder();
        sb.append("bind: 图片地址");
        sb.append(this.f47110h.getIconUrl());
        this.f47107e.setEnabled(false);
        this.f47107e.setChecked(this.f47112j);
        this.f47108f.setOnClickListener(null);
        this.f47108f.setEnabled(!z4);
        setOnClickListener(null);
        a aVar = new a();
        this.f47108f.setClickable(false);
        if (this.f47110h.getTransferStatus() == -1) {
            setOnClickListener(aVar);
        }
        c();
    }

    void c() {
        int transferStatus = this.f47110h.getTransferStatus();
        if (transferStatus == -1) {
            this.f47108f.setVisibility(0);
        } else {
            this.f47108f.setVisibility(8);
            this.f47106d.setVisibility(0);
        }
        this.f47106d.setText("");
        if (transferStatus == 1) {
            this.f47106d.setText(R.string.waiting_status_game_transfer);
        } else if (transferStatus == 2) {
            TextView textView = this.f47106d;
            textView.setText(this.f47110h.getProgerss() + "%");
        } else if (transferStatus == 3) {
            this.f47106d.setText(R.string.transfer_success_status_game_transfer);
            this.f47106d.setTextColor(this.f47114l.getResources().getColor(R.color.blue_game_transfer));
        } else if (transferStatus == 4) {
            this.f47106d.setTextColor(SupportMenu.CATEGORY_MASK);
            this.f47106d.setText(R.string.transfer_failed_status_game_transfer);
        } else if (transferStatus != 5) {
        } else {
            this.f47106d.setText(R.string.transfer_zip_status_game_transfer);
        }
    }
}
