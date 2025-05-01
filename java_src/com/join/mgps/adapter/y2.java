package com.join.mgps.adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.AccountVoucherGame;
import java.util.List;
/* compiled from: MyVoucherGameAdapter.java */
/* loaded from: classes4.dex */
public class y2 extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static final String f46045e = "expire";

    /* renamed from: f  reason: collision with root package name */
    public static final String f46046f = "un_use";

    /* renamed from: g  reason: collision with root package name */
    public static final String f46047g = "used";

    /* renamed from: h  reason: collision with root package name */
    public static final String f46048h = "will_expire";

    /* renamed from: b  reason: collision with root package name */
    private List<AccountVoucherGame> f46049b;

    /* renamed from: c  reason: collision with root package name */
    private Context f46050c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutInflater f46051d;

    /* compiled from: MyVoucherGameAdapter.java */
    /* loaded from: classes4.dex */
    class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f46052a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f46053b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f46054c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f46055d;

        /* renamed from: e  reason: collision with root package name */
        public ImageView f46056e;

        /* renamed from: f  reason: collision with root package name */
        public ImageView f46057f;

        /* renamed from: g  reason: collision with root package name */
        public LinearLayout f46058g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f46059h;

        /* renamed from: i  reason: collision with root package name */
        public RelativeLayout f46060i;

        public a(View view) {
            this.f46058g = (LinearLayout) view.findViewById(R.id.layoutLeft);
            this.f46059h = (LinearLayout) view.findViewById(R.id.layoutVoucherLeft);
            this.f46060i = (RelativeLayout) view.findViewById(R.id.layoutRight);
            this.f46052a = (TextView) view.findViewById(R.id.voucherName);
            this.f46053b = (TextView) view.findViewById(R.id.voucherPrice);
            this.f46054c = (TextView) view.findViewById(R.id.voucherDate);
            this.f46055d = (TextView) view.findViewById(R.id.voucherNo);
            this.f46056e = (ImageView) view.findViewById(R.id.voucherStateTop);
            this.f46057f = (ImageView) view.findViewById(R.id.voucherStateButtom);
        }
    }

    public y2(List<AccountVoucherGame> list, Context context) {
        this.f46049b = list;
        this.f46050c = context;
        this.f46051d = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f46049b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f46049b.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        a aVar;
        View view2;
        if (view == null) {
            view2 = this.f46051d.inflate(R.layout.my_voucher_game_item, (ViewGroup) null);
            aVar = new a(view2);
            view2.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
            view2 = view;
        }
        AccountVoucherGame accountVoucherGame = this.f46049b.get(i4);
        aVar.f46052a.setText(accountVoucherGame.getName());
        aVar.f46053b.setText(String.format(this.f46050c.getString(R.string.voucher_price), Double.valueOf(accountVoucherGame.getMoney())));
        aVar.f46054c.setText(accountVoucherGame.getExpire_date());
        if (accountVoucherGame.getStatus() != null && !accountVoucherGame.getStatus().equals("")) {
            String status = accountVoucherGame.getStatus();
            status.hashCode();
            char c5 = 65535;
            switch (status.hashCode()) {
                case -1289159393:
                    if (status.equals(f46045e)) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -840823071:
                    if (status.equals(f46046f)) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 3599293:
                    if (status.equals(f46047g)) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 484784684:
                    if (status.equals(f46048h)) {
                        c5 = 3;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    aVar.f46056e.setVisibility(8);
                    aVar.f46057f.setVisibility(0);
                    aVar.f46057f.setImageResource(R.drawable.voucher_time_out);
                    aVar.f46054c.setText(String.format(this.f46050c.getString(R.string.voucher_time), accountVoucherGame.getExpire_date()));
                    aVar.f46058g.setBackgroundResource(R.drawable.voucher_gay_left_bg);
                    aVar.f46060i.setBackgroundResource(R.drawable.voucher_gay_right_bg);
                    TextView textView = aVar.f46055d;
                    String string = this.f46050c.getString(R.string.voucher_no);
                    textView.setText(Html.fromHtml(String.format(string, "<font color='0xe1e1e1' >" + accountVoucherGame.getNo() + "<\font>")));
                    aVar.f46059h.setBackgroundResource(R.drawable.account_voucher_gay_bg);
                    aVar.f46053b.setBackgroundResource(R.drawable.account_voucher_gay_bg);
                    break;
                case 1:
                    aVar.f46056e.setVisibility(0);
                    aVar.f46057f.setVisibility(8);
                    aVar.f46056e.setImageResource(R.drawable.voucher_time_now);
                    aVar.f46054c.setText(String.format(this.f46050c.getString(R.string.voucher_time), accountVoucherGame.getExpire_date()));
                    aVar.f46058g.setBackgroundResource(R.drawable.voucher_blue_left_bg);
                    aVar.f46060i.setBackgroundResource(R.drawable.voucher_blue_right_bg);
                    aVar.f46059h.setBackgroundResource(R.drawable.account_voucher_white_bg);
                    aVar.f46053b.setBackgroundResource(R.drawable.account_voucher_white_bg);
                    TextView textView2 = aVar.f46055d;
                    String string2 = this.f46050c.getString(R.string.voucher_no);
                    textView2.setText(Html.fromHtml(String.format(string2, "<font color='0xffb6b6' >" + accountVoucherGame.getNo() + "<\font>")));
                    break;
                case 2:
                    aVar.f46056e.setVisibility(8);
                    aVar.f46057f.setVisibility(0);
                    aVar.f46057f.setImageResource(R.drawable.voucher_time_use);
                    aVar.f46054c.setText(String.format(this.f46050c.getString(R.string.voucher_time), accountVoucherGame.getExpire_date()));
                    aVar.f46058g.setBackgroundResource(R.drawable.voucher_gay_left_bg);
                    aVar.f46060i.setBackgroundResource(R.drawable.voucher_gay_right_bg);
                    aVar.f46059h.setBackgroundResource(R.drawable.account_voucher_gay_bg);
                    aVar.f46053b.setBackgroundResource(R.drawable.account_voucher_gay_bg);
                    TextView textView3 = aVar.f46055d;
                    String string3 = this.f46050c.getString(R.string.voucher_no);
                    textView3.setText(Html.fromHtml(String.format(string3, "<font color='0xe1e1e1' >" + accountVoucherGame.getNo() + "<\font>")));
                    break;
                case 3:
                    aVar.f46056e.setVisibility(0);
                    aVar.f46057f.setVisibility(8);
                    aVar.f46056e.setImageResource(R.drawable.voucher_time_run_out);
                    aVar.f46054c.setText(String.format(this.f46050c.getString(R.string.voucher_time_out), accountVoucherGame.getExpire_date(), accountVoucherGame.getNotice()));
                    aVar.f46058g.setBackgroundResource(R.drawable.voucher_blue_left_bg);
                    aVar.f46060i.setBackgroundResource(R.drawable.voucher_blue_right_bg);
                    aVar.f46059h.setBackgroundResource(R.drawable.account_voucher_white_bg);
                    aVar.f46053b.setBackgroundResource(R.drawable.account_voucher_white_bg);
                    TextView textView4 = aVar.f46055d;
                    String string4 = this.f46050c.getString(R.string.voucher_no);
                    textView4.setText(Html.fromHtml(String.format(string4, "<font color='0xffb6b6' >" + accountVoucherGame.getNo() + "<\font>")));
                    break;
            }
        }
        return view2;
    }
}
