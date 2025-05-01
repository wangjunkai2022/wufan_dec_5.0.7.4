package com.kwad.components.ad.reward;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ksad.json.annotation.KsJson;
import com.kwad.components.ad.reward.widget.RewardTaskStepView;
import com.kwad.components.core.widget.KSCornerImageView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.response.model.AdProductInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.t;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class h extends com.kwad.components.core.proxy.g {
    private static String pR = "进阶奖励还差 %s 步到手，\n确认放弃吗？";
    private static String pS = "再观看%ss可获得基础奖励，\n确认放弃吗？";
    private AdTemplate mAdTemplate;
    private a pQ;

    /* loaded from: classes5.dex */
    public interface a extends com.kwad.components.core.webview.tachikoma.e.c {
        void fZ();

        void g(int i4, int i5);
    }

    /* loaded from: classes5.dex */
    public static class b implements a {
        @Override // com.kwad.components.core.webview.tachikoma.e.c
        public void F(boolean z4) {
        }

        @Override // com.kwad.components.core.webview.tachikoma.e.c
        public void fS() {
        }

        @Override // com.kwad.components.ad.reward.h.a
        public void fZ() {
        }

        @Override // com.kwad.components.ad.reward.h.a
        public void g(int i4, int i5) {
        }

        @Override // com.kwad.components.core.webview.tachikoma.e.c
        public void ga() {
        }

        @Override // com.kwad.components.core.webview.tachikoma.e.c
        public void gb() {
        }
    }

    public static c a(g gVar, @Nullable String str) {
        int i4;
        AdTemplate adTemplate = gVar.mAdTemplate;
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        com.kwad.components.ad.reward.l.b.a aVar = gVar.pr;
        com.kwad.components.ad.reward.l.a.a aVar2 = gVar.ps;
        int i5 = gVar.pt;
        boolean k4 = com.kwad.sdk.core.response.b.e.k(adTemplate, com.kwad.components.ad.reward.a.b.k(com.kwad.sdk.core.response.b.e.dS(adTemplate)));
        int i6 = 0;
        if (k4 || com.kwad.sdk.core.response.b.e.F(adTemplate)) {
            int ac = (int) com.kwad.sdk.core.response.b.a.ac(dS);
            int L = com.kwad.sdk.core.response.b.a.L(dS);
            if (ac > L) {
                ac = L;
            }
            long playDuration = gVar.oK.getPlayDuration();
            if (playDuration < (ac * 1000) - 800 && (i4 = (int) (ac - ((((float) playDuration) / 1000.0f) + 0.5f))) >= 0) {
                i6 = i4;
            }
        }
        if (k4 && aVar != null) {
            return c.a(aVar, adTemplate, String.valueOf(i6));
        }
        if (com.kwad.sdk.core.response.b.e.F(adTemplate) && aVar2 != null) {
            return c.a(aVar2, adTemplate, String.valueOf(i6));
        }
        if (com.kwad.components.ad.reward.a.b.i(dS)) {
            return c.h(dS);
        }
        if (com.kwad.sdk.core.response.b.a.cc(dS) == 1 && com.kwad.components.ad.reward.a.b.gA() == 1) {
            return c.a(dS, i5);
        }
        if (adTemplate.isNativeRewardPreview) {
            return c.h(str, i5);
        }
        if (com.kwad.sdk.core.response.b.a.cM(dS)) {
            return c.b(adTemplate, i5);
        }
        if (com.kwad.sdk.core.response.b.a.cd(adTemplate)) {
            return c.c(adTemplate, i5);
        }
        if (com.kwad.components.ad.reward.a.b.gu() == 1) {
            return c.j(i5);
        }
        return c.z(str);
    }

    private static View b(DialogFragment dialogFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, c cVar, AdTemplate adTemplate, a aVar) {
        return a(cVar.gf(), dialogFragment, layoutInflater, viewGroup, cVar, adTemplate, aVar);
    }

    private static View c(final DialogFragment dialogFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, c cVar, AdTemplate adTemplate, final a aVar) {
        View inflate = layoutInflater.inflate(R.layout.ksad_reward_order_dialog, viewGroup, false);
        KSImageLoader.loadImage((KSCornerImageView) inflate.findViewById(R.id.ksad_reward_order_dialog_icon), cVar.qb, adTemplate);
        ((TextView) inflate.findViewById(R.id.ksad_reward_order_dialog_desc)).setText(cVar.getTitle());
        inflate.findViewById(R.id.ksad_reward_order_dialog_btn_close).setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.h.9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogFragment.dismiss();
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.gb();
                }
            }
        });
        inflate.findViewById(R.id.ksad_reward_order_dialog_btn_view_detail).setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.h.10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar2 = a.this;
                if (aVar2 != null) {
                    aVar2.fZ();
                }
            }
        });
        inflate.findViewById(R.id.ksad_reward_order_dialog_btn_deny).setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.h.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogFragment.dismiss();
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.F(false);
                }
            }
        });
        return inflate;
    }

    private static SpannableString f(Context context, String str) {
        SpannableString spannableString = new SpannableString("再看" + str + "秒，即可获得奖励");
        int i4 = R.color.ksad_reward_main_color;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(com.kwad.sdk.c.a.a.getColor(context, i4));
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(com.kwad.sdk.c.a.a.getColor(context, i4));
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableString.length();
        spannableString.setSpan(foregroundColorSpan, 2, length - 7, 34);
        spannableString.setSpan(foregroundColorSpan2, length - 2, length, 34);
        spannableString.setSpan(styleSpan, 0, length, 34);
        return spannableString;
    }

    public static c g(String str, int i4) {
        return c.h(str, i4);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window == null) {
            return;
        }
        getDialog().setCanceledOnTouchOutside(false);
        window.setLayout(-1, -1);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        a aVar = this.pQ;
        if (aVar != null) {
            aVar.fS();
        }
    }

    @KsJson
    /* loaded from: classes5.dex */
    public static class c extends com.kwad.sdk.core.response.a.a {
        public String pX;
        public String pY;
        public String pZ;
        public com.kwad.components.ad.reward.l.b.a pr;
        public com.kwad.components.ad.reward.l.a.a ps;
        public String qa;
        public String qb;
        public String qc;
        public String qd;
        public String qe;
        public int style;
        public String title;

        private c() {
        }

        public static c A(String str) {
            c cVar = new c();
            try {
                cVar.parseJson(new JSONObject(str));
            } catch (JSONException unused) {
            }
            return cVar;
        }

        private void B(String str) {
            this.qe = str;
        }

        static c a(com.kwad.components.ad.reward.l.b.a aVar, AdTemplate adTemplate, String str) {
            c cVar = new c();
            cVar.style = 1;
            cVar.pr = aVar;
            cVar.qa = str;
            cVar.qb = com.kwad.sdk.core.response.b.a.cg(com.kwad.sdk.core.response.b.e.dS(adTemplate));
            return cVar;
        }

        static c b(AdTemplate adTemplate, long j4) {
            AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
            c cVar = new c();
            cVar.style = 8;
            cVar.qb = com.kwad.sdk.core.response.b.a.cg(dS);
            cVar.title = String.format("再看%s秒，可获得奖励", Long.valueOf(j4));
            cVar.qc = com.kwad.sdk.core.response.b.a.cd(dS);
            cVar.qd = com.kwad.sdk.core.response.b.a.at(dS);
            cVar.pX = "放弃奖励";
            cVar.pY = "继续观看";
            cVar.pZ = com.kwad.sdk.core.response.b.a.aD(com.kwad.sdk.core.response.b.e.dS(adTemplate));
            return cVar;
        }

        static c c(AdTemplate adTemplate, long j4) {
            AdMatrixInfo.MerchantLiveReservationInfo dd = com.kwad.sdk.core.response.b.b.dd(adTemplate);
            c cVar = new c();
            cVar.style = 8;
            cVar.qb = dd.userHeadUrl;
            cVar.title = String.format("再看%s秒，可获得奖励", Long.valueOf(j4));
            cVar.qc = dd.title;
            cVar.pX = "放弃奖励";
            cVar.pY = "继续观看";
            cVar.pZ = com.kwad.sdk.core.response.b.a.aD(com.kwad.sdk.core.response.b.e.dS(adTemplate));
            return cVar;
        }

        public static c h(String str, int i4) {
            c cVar = new c();
            cVar.style = 6;
            cVar.title = str;
            cVar.pX = "残忍离开";
            cVar.pY = "留下看看";
            if (i4 > 0) {
                cVar.qe = String.valueOf(i4);
            }
            return cVar;
        }

        static c j(long j4) {
            c cVar = new c();
            cVar.style = 6;
            cVar.pX = "残忍离开";
            cVar.pY = "留下看看";
            if (j4 > 0) {
                cVar.B(String.valueOf(j4));
            } else {
                cVar.B(null);
            }
            return cVar;
        }

        static c z(String str) {
            c cVar = new c();
            cVar.style = 0;
            cVar.title = str;
            cVar.pX = "关闭广告";
            cVar.pY = "继续观看";
            return cVar;
        }

        @Override // com.kwad.sdk.core.response.a.a
        public void afterParseJson(@Nullable JSONObject jSONObject) {
            super.afterParseJson(jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("mLaunchAppTask");
            if (optJSONObject != null) {
                if (this.pr == null) {
                    this.pr = new com.kwad.components.ad.reward.l.b.a();
                }
                this.pr.parseJson(optJSONObject);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("mLandPageOpenTask");
            if (optJSONObject2 != null) {
                if (this.ps == null) {
                    this.ps = new com.kwad.components.ad.reward.l.a.a();
                }
                this.ps.parseJson(optJSONObject2);
            }
        }

        @Override // com.kwad.sdk.core.response.a.a
        public void afterToJson(JSONObject jSONObject) {
            super.afterToJson(jSONObject);
            com.kwad.components.ad.reward.l.b.a aVar = this.pr;
            if (aVar != null) {
                t.a(jSONObject, "mLaunchAppTask", aVar);
            }
            com.kwad.components.ad.reward.l.a.a aVar2 = this.ps;
            if (aVar2 != null) {
                t.a(jSONObject, "mLandPageOpenTask", aVar2);
            }
        }

        public final String gc() {
            return TextUtils.isEmpty(this.pX) ? "关闭广告" : this.pX;
        }

        public final String gd() {
            return TextUtils.isEmpty(this.pY) ? "继续观看" : this.pY;
        }

        public final com.kwad.components.ad.reward.l.b.a ge() {
            return this.pr;
        }

        public final int getStyle() {
            return this.style;
        }

        public final String getTitle() {
            return this.title;
        }

        public final com.kwad.components.ad.reward.l.a.a gf() {
            return this.ps;
        }

        public final String gg() {
            return this.qb;
        }

        public final String gh() {
            return this.qc;
        }

        public final String gi() {
            return this.qd;
        }

        public final String gj() {
            return TextUtils.isEmpty(this.qe) ? "" : String.format("再看%s秒，可获得优惠", this.qe);
        }

        static c a(com.kwad.components.ad.reward.l.a.a aVar, AdTemplate adTemplate, String str) {
            c cVar = new c();
            cVar.style = 2;
            cVar.ps = aVar;
            cVar.qa = str;
            cVar.qb = com.kwad.sdk.core.response.b.a.cg(com.kwad.sdk.core.response.b.e.dS(adTemplate));
            return cVar;
        }

        static c h(AdInfo adInfo) {
            c cVar = new c();
            cVar.style = 4;
            AdProductInfo cQ = com.kwad.sdk.core.response.b.a.cQ(adInfo);
            cVar.title = com.kwad.sdk.core.response.b.a.at(adInfo);
            cVar.qb = cQ.getIcon();
            return cVar;
        }

        public static c a(AdInfo adInfo, long j4) {
            c cVar = new c();
            cVar.style = 5;
            AdProductInfo cQ = com.kwad.sdk.core.response.b.a.cQ(adInfo);
            cVar.qc = com.kwad.sdk.core.response.b.a.at(adInfo);
            String name = cQ.getName();
            cVar.title = name;
            if (TextUtils.isEmpty(name)) {
                cVar.title = com.kwad.sdk.core.response.b.a.aw(adInfo);
            }
            cVar.qb = cQ.getIcon();
            if (j4 > 0) {
                cVar.B(String.valueOf(j4));
            } else {
                cVar.B(null);
            }
            return cVar;
        }
    }

    public static h a(Activity activity, AdTemplate adTemplate, c cVar, a aVar) {
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putString("key_params_json", cVar.toJson().toString());
        bundle.putString("key_template_json", adTemplate.toJson().toString());
        hVar.setArguments(bundle);
        hVar.a(aVar);
        hVar.show(activity.getFragmentManager(), "videoCloseDialog");
        return hVar;
    }

    private void a(a aVar) {
        this.pQ = aVar;
    }

    @Override // com.kwad.components.core.proxy.g
    @Nullable
    public final View a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        View a5;
        Bundle arguments = getArguments();
        String string = arguments.getString("key_params_json");
        try {
            String string2 = arguments.getString("key_template_json");
            AdTemplate adTemplate = new AdTemplate();
            this.mAdTemplate = adTemplate;
            adTemplate.parseJson(new JSONObject(string2));
        } catch (Throwable unused) {
        }
        c A = c.A(string);
        int style = A.getStyle();
        if (style == 1) {
            a5 = a(this, layoutInflater, viewGroup, A, this.mAdTemplate, this.pQ);
        } else if (style == 2) {
            a5 = b(this, layoutInflater, viewGroup, A, this.mAdTemplate, this.pQ);
        } else if (style == 4) {
            a5 = c(this, layoutInflater, viewGroup, A, this.mAdTemplate, this.pQ);
            com.kwad.components.core.s.i.a(new com.kwad.components.core.widget.e(), (ViewGroup) a5);
        } else if (style == 5) {
            com.kwad.components.ad.reward.n.j jVar = new com.kwad.components.ad.reward.n.j(this, this.mAdTemplate, layoutInflater, viewGroup, this.pQ);
            jVar.a(A);
            a5 = jVar.gG();
        } else if (style == 6) {
            a5 = a(this, layoutInflater, viewGroup, A, this.pQ);
        } else if (style != 8) {
            a5 = a((DialogFragment) this, layoutInflater, viewGroup, A, this.pQ);
        } else {
            com.kwad.components.ad.reward.n.m mVar = new com.kwad.components.ad.reward.n.m(this, this.mAdTemplate, layoutInflater, viewGroup, this.pQ);
            mVar.a(A);
            a5 = mVar.gG();
        }
        getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.kwad.components.ad.reward.h.1
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
                return i4 == 4 && keyEvent.getAction() == 0;
            }
        });
        return a5;
    }

    private static View a(final DialogFragment dialogFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, c cVar, final a aVar) {
        View inflate = layoutInflater.inflate(R.layout.ksad_video_close_dialog, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.ksad_title)).setText(cVar.getTitle());
        TextView textView = (TextView) inflate.findViewById(R.id.ksad_close_btn);
        TextView textView2 = (TextView) inflate.findViewById(R.id.ksad_continue_btn);
        textView.setText(cVar.gc());
        textView2.setText(cVar.gd());
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.h.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogFragment.dismiss();
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.F(false);
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.h.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogFragment.dismiss();
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.gb();
                }
            }
        });
        return inflate;
    }

    private View a(final h hVar, LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, c cVar, final a aVar) {
        View inflate = layoutInflater.inflate(R.layout.ksad_video_close_extend_dialog, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.ksad_reward_close_extend_dialog_play_time_tips)).setText(f(inflate.getContext(), cVar.qe));
        TextView textView = (TextView) inflate.findViewById(R.id.ksad_reward_close_extend_dialog_btn_deny);
        TextView textView2 = (TextView) inflate.findViewById(R.id.ksad_reward_close_extend_dialog_btn_continue);
        textView.setText(cVar.gc());
        textView2.setText(cVar.gd());
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.h.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hVar.dismiss();
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.F(false);
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.h.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hVar.dismiss();
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.gb();
                }
            }
        });
        return inflate;
    }

    private static View a(com.kwad.components.ad.reward.l.a aVar, final DialogFragment dialogFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, c cVar, AdTemplate adTemplate, final a aVar2) {
        String format;
        int i4;
        View inflate = layoutInflater.inflate(R.layout.ksad_reward_task_launch_app_dialog, viewGroup, false);
        if (aVar instanceof com.kwad.components.ad.reward.l.b.a) {
            com.kwad.components.ad.reward.l.b.a.a((com.kwad.components.ad.reward.l.b.a) aVar, inflate.getContext(), adTemplate);
        }
        ((RewardTaskStepView) inflate.findViewById(R.id.ksad_reward_task_dialog_steps)).a(aVar.jr(), cVar.qa);
        KSImageLoader.loadAppIcon((ImageView) inflate.findViewById(R.id.ksad_reward_task_dialog_icon), cVar.gg(), adTemplate, 12);
        TextView textView = (TextView) inflate.findViewById(R.id.ksad_reward_task_dialog_abandon);
        TextView textView2 = (TextView) inflate.findViewById(R.id.ksad_reward_task_dialog_continue);
        TextView textView3 = (TextView) inflate.findViewById(R.id.ksad_reward_task_dialog_title);
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.js());
        String sb2 = sb.toString();
        String str = cVar.qa;
        boolean equals = "0".equals(str);
        if (equals) {
            format = String.format(pR, sb2);
        } else {
            format = String.format(pS, str);
        }
        int indexOf = equals ? format.indexOf(sb2) : format.indexOf(str);
        if (indexOf < 0) {
            textView3.setText(format);
        } else {
            if (equals) {
                i4 = indexOf + 1;
            } else {
                i4 = str.length() > 1 ? indexOf + 3 : indexOf + 2;
            }
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(inflate.getContext().getResources().getColor(R.color.ksad_reward_main_color));
            SpannableString spannableString = new SpannableString(format);
            spannableString.setSpan(foregroundColorSpan, indexOf, i4, 17);
            textView3.setText(spannableString);
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.h.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogFragment.dismiss();
                a aVar3 = aVar2;
                if (aVar3 != null) {
                    aVar3.F(false);
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.h.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogFragment.dismiss();
                a aVar3 = aVar2;
                if (aVar3 != null) {
                    aVar3.gb();
                }
            }
        });
        return inflate;
    }

    private static View a(DialogFragment dialogFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, c cVar, AdTemplate adTemplate, a aVar) {
        return a(cVar.ge(), dialogFragment, layoutInflater, viewGroup, cVar, adTemplate, aVar);
    }
}
