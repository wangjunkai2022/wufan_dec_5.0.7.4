package com.join.mgps.fragment;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.g2;
import com.join.mgps.activity.ClassifyGameActivity_;
import com.join.mgps.basefragment.BaseLoadingFragment;
import com.join.mgps.customview.CellClassifyItem;
import com.join.mgps.customview.FlowLayout;
import com.join.mgps.dto.AppBeanMain;
import com.join.mgps.dto.ClassifyBean;
import com.join.mgps.dto.ClassifyGameTagBean;
import com.join.mgps.dto.ClassifyGameTypeBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.papa91.arc.CContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_classify)
/* loaded from: classes3.dex */
public class ClassifyFragment extends BaseLoadingFragment implements View.OnClickListener {
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    FlowLayout f50063c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f50064d;

    /* renamed from: e  reason: collision with root package name */
    HashMap<Integer, View> f50065e;

    /* renamed from: f  reason: collision with root package name */
    com.join.mgps.rpc.e f50066f;

    /* renamed from: g  reason: collision with root package name */
    List<ClassifyGameTagBean> f50067g;

    /* renamed from: h  reason: collision with root package name */
    private Context f50068h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50069b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f50070c;

        a(int i4, String str) {
            this.f50069b = i4;
            this.f50070c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyGameActivity_.F0(ClassifyFragment.this.f50068h).a(0).b(this.f50069b).c(this.f50070c).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50072b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f50073c;

        b(int i4, String str) {
            this.f50072b = i4;
            this.f50073c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyGameActivity_.F0(ClassifyFragment.this.f50068h).a(0).b(this.f50072b).c(this.f50073c).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ClassifyGameTypeBean f50075b;

        c(ClassifyGameTypeBean classifyGameTypeBean) {
            this.f50075b = classifyGameTypeBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyGameActivity_.F0(ClassifyFragment.this.f50068h).b(0).a(this.f50075b.getId()).c(this.f50075b.getTitle()).start();
        }
    }

    private void g0() {
        this.f50067g = new ArrayList();
        new ClassifyGameTagBean();
        int[] iArr = {ConstantIntEnum.FEATURED_ONLINE.value(), ConstantIntEnum.LARGE_SINGLE.value(), ConstantIntEnum.FBA.value(), ConstantIntEnum.FC.value(), ConstantIntEnum.GBA.value(), ConstantIntEnum.PSP.value(), ConstantIntEnum.PS.value(), ConstantIntEnum.NDS.value(), ConstantIntEnum.MD.value(), ConstantIntEnum.ONS.value(), ConstantIntEnum.SFC.value(), ConstantIntEnum.GBC.value(), ConstantIntEnum.N64.value(), ConstantIntEnum.WSC.value(), ConstantIntEnum.DC.value(), ConstantIntEnum.PS2.value(), ConstantIntEnum.H5.value()};
        int[] iArr2 = {R.drawable.onlin_icon, R.drawable.single_icon, R.drawable.fba_icon, R.drawable.fc_icon, R.drawable.gba_icon, R.drawable.psp_icon, R.drawable.ps_icon, R.drawable.nd_icon, R.drawable.md_icon, R.drawable.on_icon, R.drawable.sfc_icon, R.drawable.gbc_icon, R.drawable.n64_icon, R.drawable.wsc_icon, R.drawable.dc_icon, R.drawable.ps2_icon, R.drawable.ps2_icon};
        String[] strArr = {"网游", "单机", "街机", "FC小霸王", CContext.SCENE_GBA, CContext.SCENE_PSP, "PS", "NDS", "MD", "ONS", "SFC", "GBC", "N64", "WSC", "DC", "PS2", "H5"};
        String[] strArr2 = {"潮流网络游戏", "优秀大型单机，汉化破解一网打尽", "经典街机房游戏，代表游戏有拳皇、合金弹头、恐龙快打、三国战纪等", "任天堂在1983年发售的游戏机，代表游戏有超级玛丽，魂斗罗等", "任天堂于2001年发售的第二代掌机，代表游戏有口袋妖怪，火焰纹章等", "索尼经典掌机", "索尼电视主机", "任天堂DS游戏", "世嘉MD主机", "GAL模拟器", "任天堂SNES主机", "任天堂第二代掌机", "任天堂经典主机", "经典掌机神奇天鹅", "任天堂经典主机", "任天堂经典主机", "页游"};
        this.f50065e = new HashMap<>();
        int a5 = com.join.mgps.Util.c0.a(this.f50068h, 1.0f);
        for (int i4 = 0; i4 < 17; i4++) {
            CellClassifyItem cellClassifyItem = new CellClassifyItem(this.f50068h);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (i4 != 0) {
                layoutParams.setMargins(0, a5, 0, 0);
            }
            cellClassifyItem.setLayoutParams(layoutParams);
            int i5 = iArr[i4];
            int i6 = iArr2[i4];
            String str = strArr[i4];
            String str2 = strArr2[i4];
            cellClassifyItem.setOnClickListener(new a(i5, str));
            cellClassifyItem.setmId(i5);
            cellClassifyItem.setmName(str);
            cellClassifyItem.setmDesc(str2);
            cellClassifyItem.setmIconRes(i6);
            this.f50064d.addView(cellClassifyItem);
            this.f50065e.put(Integer.valueOf(i5), cellClassifyItem);
        }
    }

    private void i0(List<ClassifyGameTagBean> list) {
        LinearLayout linearLayout = this.f50064d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        if (this.f50068h == null || !isAdded()) {
            return;
        }
        int a5 = com.join.mgps.Util.c0.a(this.f50068h, 1.0f);
        for (int i4 = 0; i4 < list.size(); i4++) {
            CellClassifyItem cellClassifyItem = new CellClassifyItem(this.f50068h);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (i4 != 0) {
                layoutParams.setMargins(0, a5, 0, 0);
            }
            cellClassifyItem.setLayoutParams(layoutParams);
            ClassifyGameTagBean classifyGameTagBean = list.get(i4);
            int id = classifyGameTagBean.getId();
            String ico_remote = classifyGameTagBean.getIco_remote();
            String name = classifyGameTagBean.getName();
            String describe = classifyGameTagBean.getDescribe();
            cellClassifyItem.setOnClickListener(new b(id, name));
            cellClassifyItem.setmId(id);
            cellClassifyItem.setmName(name);
            cellClassifyItem.setmDesc(describe);
            cellClassifyItem.setmIconSrc(ico_remote);
            cellClassifyItem.setCountTip(classifyGameTagBean.getGame_count());
            this.f50064d.addView(cellClassifyItem);
        }
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected int W() {
        return R.layout.fragment_classify;
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected int X() {
        return R.id.fragment_classify;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f50066f = com.join.mgps.rpc.impl.d.P1();
        this.f50068h = getContext();
        g0();
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0(ClassifyBean classifyBean) {
        if (this.f50063c != null) {
            if (classifyBean.getGame_type() != null && classifyBean.getGame_type().size() > 0) {
                this.f50063c.setVisibility(0);
                List<ClassifyGameTypeBean> game_type = classifyBean.getGame_type();
                int a5 = com.join.mgps.Util.c0.a(this.f50068h, 1.0f);
                for (int i4 = 0; i4 < game_type.size(); i4++) {
                    CellClassifyItem cellClassifyItem = new CellClassifyItem(this.f50068h);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    if (i4 != 0) {
                        layoutParams.setMargins(0, a5, 0, 0);
                    }
                    cellClassifyItem.setLayoutParams(layoutParams);
                    ClassifyGameTypeBean classifyGameTypeBean = game_type.get(i4);
                    cellClassifyItem.setOnClickListener(new c(classifyGameTypeBean));
                    cellClassifyItem.setmId(classifyGameTypeBean.getId());
                    cellClassifyItem.setmName(classifyGameTypeBean.getTitle());
                    cellClassifyItem.setmDesc(classifyGameTypeBean.getDescribe());
                    cellClassifyItem.setmIconSrc(classifyGameTypeBean.getIco_remote());
                    cellClassifyItem.setCountTip(classifyGameTypeBean.getGame_count());
                    if (g2.h(classifyGameTypeBean.getDescribe())) {
                        cellClassifyItem.setDescVisibility(8);
                    } else {
                        cellClassifyItem.setDescVisibility(0);
                    }
                    this.f50063c.addView(cellClassifyItem);
                }
            } else {
                this.f50063c.setVisibility(8);
            }
        }
        if (classifyBean.getGame_tag_type() != null && classifyBean.getGame_tag_type().size() > 0) {
            i0(classifyBean.getGame_tag_type());
        }
        a0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    @Background
    public void loadData() {
        if (com.join.android.app.common.utils.j.j(this.f50068h.getApplicationContext())) {
            try {
                ResultMainBean<ClassifyBean> q02 = this.f50066f.q0(RequestBeanUtil.getInstance(this.f50068h).getGameSortRequestBean(com.join.android.app.common.utils.n.n(this.f50068h.getApplicationContext()).z(), ""));
                if (q02 != null && q02.getFlag() == 1 && q02.getMessages() != null) {
                    ClassifyBean data = q02.getMessages().getData();
                    if (data != null) {
                        h0(data);
                    } else {
                        c0();
                    }
                } else {
                    c0();
                }
                return;
            } catch (Exception e5) {
                c0();
                e5.printStackTrace();
                return;
            }
        }
        c0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            if (view instanceof TextView) {
                IntentUtil.getInstance().intentActivity(this.f50068h, ((AppBeanMain) view.getTag()).getIntentDataBean());
            } else if (view instanceof RelativeLayout) {
                ClassifyGameTagBean classifyGameTagBean = (ClassifyGameTagBean) view.getTag();
                ClassifyGameActivity_.F0(this.f50068h).a(0).b(classifyGameTagBean.getId()).c(classifyGameTagBean.getName()).start();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
