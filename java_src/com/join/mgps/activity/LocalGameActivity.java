package com.join.mgps.activity;

import android.annotation.SuppressLint;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.customview.NavigationAdapter;
import com.join.mgps.customview.TabPageIndicator;
import com.join.mgps.dto.GameSortBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.fragment.PaPaLocalGameFragment;
import com.join.mgps.fragment.PaPaLocalGameFragment_;
import com.join.mgps.pref.PrefDef_;
import com.papa91.arc.CContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.activity_game_local)
/* loaded from: classes4.dex */
public class LocalGameActivity extends FragmentActivity {

    /* renamed from: p  reason: collision with root package name */
    public static final String f34222p = "网游";

    /* renamed from: q  reason: collision with root package name */
    public static final String f34223q = "单机";

    /* renamed from: r  reason: collision with root package name */
    public static final String f34224r = "对战";

    /* renamed from: s  reason: collision with root package name */
    public static final String f34225s = "全部";
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ImageView f34226b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f34227c;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TabPageIndicator f34230f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ViewPager f34231g;

    /* renamed from: h  reason: collision with root package name */
    private NavigationAdapter f34232h;

    /* renamed from: m  reason: collision with root package name */
    com.join.mgps.rpc.e f34237m;
    @Pref

    /* renamed from: n  reason: collision with root package name */
    PrefDef_ f34238n;

    /* renamed from: o  reason: collision with root package name */
    private List<DownloadTask> f34239o;

    /* renamed from: d  reason: collision with root package name */
    private boolean f34228d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f34229e = false;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<Fragment> f34233i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private List<String> f34234j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private Map<String, List<DownloadTask>> f34235k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    List<String> f34236l = null;

    private void e0(DownloadTask downloadTask, List<DownloadTask> list) {
        boolean z4;
        Iterator<DownloadTask> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z4 = false;
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                next.setStatus(downloadTask.getStatus());
                z4 = true;
                break;
            }
        }
        if (z4) {
            return;
        }
        list.add(0, downloadTask);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0171 A[Catch: Exception -> 0x0176, TRY_LEAVE, TryCatch #0 {Exception -> 0x0176, blocks: (B:2:0x0000, B:4:0x0004, B:9:0x000f, B:11:0x0015, B:15:0x0028, B:17:0x002c, B:18:0x0037, B:20:0x003d, B:22:0x0041, B:24:0x0049, B:25:0x0066, B:27:0x0093, B:29:0x00a2, B:34:0x00bd, B:36:0x00c1, B:38:0x00da, B:39:0x00eb, B:41:0x00ef, B:42:0x0102, B:44:0x0108, B:46:0x0110, B:49:0x012c, B:51:0x0132, B:53:0x0136, B:55:0x0147, B:59:0x0171, B:56:0x015d, B:48:0x0121), top: B:65:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f0(com.github.snowdream.android.app.downloader.DownloadTask r8, int r9, java.lang.String r10, java.util.List<com.github.snowdream.android.app.downloader.DownloadTask> r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.LocalGameActivity.f0(com.github.snowdream.android.app.downloader.DownloadTask, int, java.lang.String, java.util.List):void");
    }

    private void g0(DownloadTask downloadTask, int i4, String str) {
        if (this.f34228d) {
            if (this.f34234j.indexOf(f34225s) != -1) {
                List<DownloadTask> list = this.f34235k.get(f34225s);
                list.add(0, downloadTask);
                ((PaPaLocalGameFragment) this.f34233i.get(0)).X(list);
            } else {
                int indexOf = this.f34236l.indexOf(f34225s);
                ArrayList arrayList = new ArrayList();
                arrayList.add(downloadTask);
                PaPaLocalGameFragment_ paPaLocalGameFragment_ = new PaPaLocalGameFragment_();
                paPaLocalGameFragment_.Z(arrayList);
                int i02 = i0(indexOf);
                this.f34234j.add(i02, f34225s);
                this.f34233i.add(i02, paPaLocalGameFragment_);
                this.f34235k.put(f34225s, arrayList);
            }
        }
        if ((ConstantIntEnum.CHOICENESS.value() + "").equals(str)) {
            l0();
            return;
        }
        if (downloadTask.isIs_fight() == 1 && this.f34229e) {
            if (this.f34234j.indexOf("对战") != -1) {
                List<DownloadTask> list2 = this.f34235k.get("对战");
                e0(downloadTask, list2);
                ((PaPaLocalGameFragment) this.f34233i.get(this.f34234j.indexOf("对战"))).X(list2);
            } else {
                int indexOf2 = this.f34236l.indexOf("对战");
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(downloadTask);
                PaPaLocalGameFragment_ paPaLocalGameFragment_2 = new PaPaLocalGameFragment_();
                paPaLocalGameFragment_2.Z(arrayList2);
                this.f34235k.put("对战", arrayList2);
                int i03 = i0(indexOf2);
                this.f34234j.add(i03, "对战");
                this.f34233i.add(i03, paPaLocalGameFragment_2);
            }
        }
        int indexOf3 = this.f34236l.indexOf(str);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(downloadTask);
        PaPaLocalGameFragment_ paPaLocalGameFragment_3 = new PaPaLocalGameFragment_();
        paPaLocalGameFragment_3.Z(arrayList3);
        int i04 = i0(indexOf3);
        this.f34234j.add(i04, str);
        this.f34233i.add(i04, paPaLocalGameFragment_3);
        this.f34235k.put(str, arrayList3);
        l0();
    }

    private String h0(DownloadTask downloadTask) {
        if (com.join.mgps.Util.g2.h(downloadTask.getRomType())) {
            downloadTask.setRomType(downloadTask.getPlugin_num());
        }
        String romType = downloadTask.getRomType();
        StringBuilder sb = new StringBuilder();
        ConstantIntEnum constantIntEnum = ConstantIntEnum.FBA;
        sb.append(constantIntEnum.value());
        sb.append("");
        if (romType.equals(sb.toString())) {
            return constantIntEnum.nickName();
        }
        String romType2 = downloadTask.getRomType();
        StringBuilder sb2 = new StringBuilder();
        ConstantIntEnum constantIntEnum2 = ConstantIntEnum.FC;
        sb2.append(constantIntEnum2.value());
        sb2.append("");
        if (romType2.equals(sb2.toString())) {
            return constantIntEnum2.nickName();
        }
        String romType3 = downloadTask.getRomType();
        StringBuilder sb3 = new StringBuilder();
        ConstantIntEnum constantIntEnum3 = ConstantIntEnum.GBA;
        sb3.append(constantIntEnum3.value());
        sb3.append("");
        if (romType3.equals(sb3.toString())) {
            return constantIntEnum3.nickName();
        }
        String romType4 = downloadTask.getRomType();
        StringBuilder sb4 = new StringBuilder();
        ConstantIntEnum constantIntEnum4 = ConstantIntEnum.PSP;
        sb4.append(constantIntEnum4.value());
        sb4.append("");
        if (romType4.equals(sb4.toString())) {
            return constantIntEnum4.nickName();
        }
        String romType5 = downloadTask.getRomType();
        StringBuilder sb5 = new StringBuilder();
        ConstantIntEnum constantIntEnum5 = ConstantIntEnum.NDS;
        sb5.append(constantIntEnum5.value());
        sb5.append("");
        if (romType5.equals(sb5.toString())) {
            return constantIntEnum5.nickName();
        }
        String romType6 = downloadTask.getRomType();
        StringBuilder sb6 = new StringBuilder();
        ConstantIntEnum constantIntEnum6 = ConstantIntEnum.PS2;
        sb6.append(constantIntEnum6.value());
        sb6.append("");
        if (romType6.equals(sb6.toString())) {
            return constantIntEnum6.nickName();
        }
        String romType7 = downloadTask.getRomType();
        StringBuilder sb7 = new StringBuilder();
        ConstantIntEnum constantIntEnum7 = ConstantIntEnum.GBC;
        sb7.append(constantIntEnum7.value());
        sb7.append("");
        if (romType7.equals(sb7.toString())) {
            return constantIntEnum7.nickName();
        }
        String romType8 = downloadTask.getRomType();
        StringBuilder sb8 = new StringBuilder();
        ConstantIntEnum constantIntEnum8 = ConstantIntEnum.MD;
        sb8.append(constantIntEnum8.value());
        sb8.append("");
        if (romType8.equals(sb8.toString())) {
            return constantIntEnum8.nickName();
        }
        String romType9 = downloadTask.getRomType();
        StringBuilder sb9 = new StringBuilder();
        ConstantIntEnum constantIntEnum9 = ConstantIntEnum.PS;
        sb9.append(constantIntEnum9.value());
        sb9.append("");
        if (romType9.equals(sb9.toString())) {
            return constantIntEnum9.nickName();
        }
        String romType10 = downloadTask.getRomType();
        StringBuilder sb10 = new StringBuilder();
        ConstantIntEnum constantIntEnum10 = ConstantIntEnum.SFC;
        sb10.append(constantIntEnum10.value());
        sb10.append("");
        if (romType10.equals(sb10.toString())) {
            return constantIntEnum10.nickName();
        }
        String romType11 = downloadTask.getRomType();
        StringBuilder sb11 = new StringBuilder();
        ConstantIntEnum constantIntEnum11 = ConstantIntEnum.WSC;
        sb11.append(constantIntEnum11.value());
        sb11.append("");
        if (romType11.equals(sb11.toString())) {
            return constantIntEnum11.nickName();
        }
        String romType12 = downloadTask.getRomType();
        StringBuilder sb12 = new StringBuilder();
        ConstantIntEnum constantIntEnum12 = ConstantIntEnum.N64;
        sb12.append(constantIntEnum12.value());
        sb12.append("");
        if (romType12.equals(sb12.toString())) {
            return constantIntEnum12.nickName();
        }
        String romType13 = downloadTask.getRomType();
        StringBuilder sb13 = new StringBuilder();
        ConstantIntEnum constantIntEnum13 = ConstantIntEnum.ONS;
        sb13.append(constantIntEnum13.value());
        sb13.append("");
        if (romType13.equals(sb13.toString())) {
            return constantIntEnum13.nickName();
        }
        String romType14 = downloadTask.getRomType();
        StringBuilder sb14 = new StringBuilder();
        ConstantIntEnum constantIntEnum14 = ConstantIntEnum.DC;
        sb14.append(constantIntEnum14.value());
        sb14.append("");
        if (romType14.equals(sb14.toString())) {
            return constantIntEnum14.nickName();
        }
        Iterator<TipBean> it2 = downloadTask.getTipBeans().iterator();
        while (it2.hasNext()) {
            TipBean next = it2.next();
            if (next.getName().indexOf("网游") != -1) {
                return "网游";
            }
            if (next.getName().indexOf("单机") != -1) {
                return "单机";
            }
            String id = next.getId();
            StringBuilder sb15 = new StringBuilder();
            ConstantIntEnum constantIntEnum15 = ConstantIntEnum.CHOICENESS;
            sb15.append(constantIntEnum15.value());
            sb15.append("");
            if (id.equals(sb15.toString())) {
                return constantIntEnum15.value() + "";
            }
        }
        return null;
    }

    private int i0(int i4) {
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            if (this.f34234j.contains(this.f34236l.get(i5))) {
                return this.f34234j.indexOf(this.f34236l.get(i5)) + 1;
            }
        }
        return 0;
    }

    private void k0(List<String> list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        LocalGameActivity localGameActivity = this;
        try {
            List<DownloadTask> R = p1.f.K().R(null);
            localGameActivity.f34239o = R;
            try {
                if (R.size() > 0) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(localGameActivity.f34239o);
                    localGameActivity.f34235k.put(f34225s, arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    localGameActivity.f34235k.put("网游", arrayList4);
                    ArrayList arrayList5 = new ArrayList();
                    localGameActivity.f34235k.put("单机", arrayList5);
                    ArrayList arrayList6 = new ArrayList();
                    localGameActivity.f34235k.put("对战", arrayList6);
                    ArrayList arrayList7 = new ArrayList();
                    localGameActivity.f34235k.put(CContext.SCENE_FC, arrayList7);
                    ArrayList arrayList8 = new ArrayList();
                    localGameActivity.f34235k.put("街机", arrayList8);
                    ArrayList arrayList9 = new ArrayList();
                    localGameActivity.f34235k.put(CContext.SCENE_GBA, arrayList9);
                    ArrayList arrayList10 = new ArrayList();
                    localGameActivity.f34235k.put(CContext.SCENE_PSP, arrayList10);
                    ArrayList arrayList11 = new ArrayList();
                    localGameActivity.f34235k.put("NDS", arrayList11);
                    ArrayList arrayList12 = new ArrayList();
                    localGameActivity.f34235k.put("GBC", arrayList12);
                    ArrayList arrayList13 = new ArrayList();
                    localGameActivity.f34235k.put("MD", arrayList13);
                    ArrayList arrayList14 = new ArrayList();
                    ArrayList arrayList15 = arrayList5;
                    localGameActivity.f34235k.put("PS", arrayList14);
                    ArrayList arrayList16 = new ArrayList();
                    String str = "单机";
                    localGameActivity.f34235k.put("SFC", arrayList16);
                    ArrayList arrayList17 = new ArrayList();
                    ArrayList arrayList18 = arrayList4;
                    localGameActivity.f34235k.put("WSC", arrayList17);
                    ArrayList arrayList19 = new ArrayList();
                    String str2 = "网游";
                    localGameActivity.f34235k.put("N64", arrayList19);
                    ArrayList arrayList20 = new ArrayList();
                    ArrayList arrayList21 = arrayList19;
                    localGameActivity.f34235k.put("ONS", arrayList20);
                    ArrayList arrayList22 = new ArrayList();
                    ArrayList arrayList23 = arrayList20;
                    localGameActivity.f34235k.put("DC", arrayList22);
                    Iterator<DownloadTask> it2 = localGameActivity.f34239o.iterator();
                    while (it2.hasNext()) {
                        try {
                            DownloadTask next = it2.next();
                            Iterator<DownloadTask> it3 = it2;
                            if (next.isIs_fight() == 1) {
                                arrayList6.add(next);
                            }
                            if (com.join.mgps.Util.g2.h(next.getRomType())) {
                                next.setRomType(next.getPlugin_num());
                            }
                            String romType = next.getRomType();
                            StringBuilder sb = new StringBuilder();
                            ArrayList arrayList24 = arrayList6;
                            sb.append(ConstantIntEnum.FBA.value());
                            sb.append("");
                            if (romType.equals(sb.toString())) {
                                arrayList8.add(next);
                            } else {
                                String romType2 = next.getRomType();
                                if (romType2.equals(ConstantIntEnum.FC.value() + "")) {
                                    arrayList7.add(next);
                                } else {
                                    String romType3 = next.getRomType();
                                    if (romType3.equals(ConstantIntEnum.GBA.value() + "")) {
                                        arrayList9.add(next);
                                    } else {
                                        String romType4 = next.getRomType();
                                        if (romType4.equals(ConstantIntEnum.PSP.value() + "")) {
                                            arrayList10.add(next);
                                        } else {
                                            String romType5 = next.getRomType();
                                            if (romType5.equals(ConstantIntEnum.NDS.value() + "")) {
                                                arrayList11.add(next);
                                            } else {
                                                String romType6 = next.getRomType();
                                                if (romType6.equals(ConstantIntEnum.PS2.value() + "")) {
                                                    arrayList11.add(next);
                                                } else {
                                                    String romType7 = next.getRomType();
                                                    if (romType7.equals(ConstantIntEnum.GBC.value() + "")) {
                                                        arrayList12.add(next);
                                                    } else {
                                                        String romType8 = next.getRomType();
                                                        if (romType8.equals(ConstantIntEnum.MD.value() + "")) {
                                                            arrayList13.add(next);
                                                        } else {
                                                            String romType9 = next.getRomType();
                                                            if (romType9.equals(ConstantIntEnum.PS.value() + "")) {
                                                                arrayList14.add(next);
                                                            } else {
                                                                String romType10 = next.getRomType();
                                                                if (romType10.equals(ConstantIntEnum.SFC.value() + "")) {
                                                                    arrayList16.add(next);
                                                                } else {
                                                                    String romType11 = next.getRomType();
                                                                    if (romType11.equals(ConstantIntEnum.WSC.value() + "")) {
                                                                        arrayList17.add(next);
                                                                    } else {
                                                                        String romType12 = next.getRomType();
                                                                        if (romType12.equals(ConstantIntEnum.N64.value() + "")) {
                                                                            ArrayList arrayList25 = arrayList21;
                                                                            arrayList25.add(next);
                                                                            arrayList21 = arrayList25;
                                                                            it2 = it3;
                                                                        } else {
                                                                            ArrayList arrayList26 = arrayList21;
                                                                            String romType13 = next.getRomType();
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            ArrayList arrayList27 = arrayList17;
                                                                            sb2.append(ConstantIntEnum.ONS.value());
                                                                            sb2.append("");
                                                                            if (romType13.equals(sb2.toString())) {
                                                                                ArrayList arrayList28 = arrayList23;
                                                                                arrayList28.add(next);
                                                                                arrayList23 = arrayList28;
                                                                            } else {
                                                                                String romType14 = next.getRomType();
                                                                                StringBuilder sb3 = new StringBuilder();
                                                                                arrayList23 = arrayList23;
                                                                                sb3.append(ConstantIntEnum.DC.value());
                                                                                sb3.append("");
                                                                                if (romType14.equals(sb3.toString())) {
                                                                                    arrayList22.add(next);
                                                                                } else {
                                                                                    Iterator<TipBean> it4 = next.getTipBeans().iterator();
                                                                                    while (true) {
                                                                                        if (!it4.hasNext()) {
                                                                                            arrayList = arrayList15;
                                                                                            arrayList2 = arrayList18;
                                                                                            break;
                                                                                        }
                                                                                        TipBean next2 = it4.next();
                                                                                        Iterator<TipBean> it5 = it4;
                                                                                        String str3 = str2;
                                                                                        str2 = str3;
                                                                                        if (next2.getName().indexOf(str3) != -1) {
                                                                                            arrayList2 = arrayList18;
                                                                                            arrayList2.add(next);
                                                                                            arrayList = arrayList15;
                                                                                            break;
                                                                                        }
                                                                                        arrayList2 = arrayList18;
                                                                                        String str4 = str;
                                                                                        str = str4;
                                                                                        if (next2.getName().indexOf(str4) != -1) {
                                                                                            arrayList = arrayList15;
                                                                                            arrayList.add(next);
                                                                                            break;
                                                                                        }
                                                                                        arrayList18 = arrayList2;
                                                                                        it4 = it5;
                                                                                    }
                                                                                    arrayList15 = arrayList;
                                                                                    arrayList21 = arrayList26;
                                                                                    arrayList18 = arrayList2;
                                                                                    it2 = it3;
                                                                                    arrayList17 = arrayList27;
                                                                                }
                                                                            }
                                                                            arrayList21 = arrayList26;
                                                                            it2 = it3;
                                                                            arrayList17 = arrayList27;
                                                                        }
                                                                        arrayList6 = arrayList24;
                                                                        localGameActivity = this;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            localGameActivity = this;
                            it2 = it3;
                            arrayList6 = arrayList24;
                        } catch (Exception e5) {
                            e = e5;
                            e.printStackTrace();
                            n0();
                            return;
                        }
                    }
                    for (String str5 : list) {
                        if (this.f34235k.containsKey(str5) && this.f34235k.get(str5).size() > 0) {
                            PaPaLocalGameFragment_ paPaLocalGameFragment_ = new PaPaLocalGameFragment_();
                            paPaLocalGameFragment_.Z(this.f34235k.get(str5));
                            this.f34233i.add(paPaLocalGameFragment_);
                            this.f34234j.add(str5);
                        }
                    }
                    o0();
                    return;
                }
                n0();
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Exception e7) {
            e = e7;
        }
    }

    private void m0(DownloadTask downloadTask, List<DownloadTask> list) {
        Iterator<DownloadTask> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                it2.remove();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f34237m = com.join.mgps.rpc.impl.d.P1();
        this.f34227c.setText("本地游戏");
        ArrayList arrayList = new ArrayList();
        this.f34236l = arrayList;
        arrayList.addAll(Arrays.asList(getResources().getStringArray(R.array.my_game_list)));
        NavigationAdapter navigationAdapter = new NavigationAdapter(getSupportFragmentManager(), this.f34233i, this.f34234j);
        this.f34232h = navigationAdapter;
        this.f34231g.setAdapter(navigationAdapter);
        this.f34230f.setViewPager(this.f34231g);
        this.f34228d = this.f34236l.contains(f34225s);
        this.f34229e = this.f34236l.contains("对战");
        loadData();
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0() {
        List<GameSortBean> data;
        try {
            ResultMainBean<List<GameSortBean>> B0 = this.f34237m.B0(RequestBeanUtil.getInstance(this).getGameSortRequestBean(com.join.android.app.common.utils.n.n(getApplicationContext()).z(), ""));
            if (B0 != null && B0.getFlag() == 1 && B0.getMessages() != null && (data = B0.getMessages().getData()) != null && data.size() > 0) {
                this.f34236l.clear();
                for (GameSortBean gameSortBean : data) {
                    String name = gameSortBean.getName();
                    if (gameSortBean.getName().indexOf("单机") != -1) {
                        name = "单机";
                    }
                    this.f34236l.add(name);
                }
                this.f34228d = this.f34236l.contains(f34225s);
                this.f34229e = this.f34236l.contains("对战");
            }
            this.f34238n.myGameAllTabSort().g(JsonMapper.getInstance().toJson(this.f34236l));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        this.f34232h.d(this.f34233i, this.f34234j);
        this.f34232h.notifyDataSetChanged();
        this.f34230f.notifyDataSetChanged();
        if (this.f34233i.size() > 0) {
            this.f34230f.setVisibility(0);
            this.f34231g.setVisibility(0);
            this.f34231g.setCurrentItem(0);
        } else {
            n0();
        }
        this.f34231g.setOffscreenPageLimit(this.f34233i.size());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Background
    public void loadData() {
        String d5 = this.f34238n.myGameAllTabSort().d();
        if (com.join.mgps.Util.g2.h(d5)) {
            k0(this.f34236l);
            return;
        }
        List<String> list = null;
        try {
            list = (List) JsonMapper.getInstance().fromJson(d5, List.class);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (list == null || list.size() == 0) {
            list = this.f34236l;
        }
        k0(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        this.f34230f.setVisibility(8);
        this.f34231g.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        this.f34230f.setVisibility(0);
        this.f34231g.setVisibility(0);
        this.f34231g.setOffscreenPageLimit(2);
        this.f34232h.d(this.f34233i, this.f34234j);
        this.f34232h.notifyDataSetChanged();
        this.f34230f.notifyDataSetChanged();
    }

    @SuppressLint({"LongLogTag"})
    synchronized void updateUI(DownloadTask downloadTask, int i4) {
        int i5;
        boolean z4;
        boolean z5;
        boolean z6;
        if (i4 == 4) {
            return;
        }
        if (downloadTask.getFileType().indexOf(Dtype.chajian.toString()) != -1) {
            return;
        }
        int status = downloadTask.getStatus();
        List<DownloadTask> list = null;
        String h02 = h0(downloadTask);
        if (h02 != null) {
            list = this.f34235k.get(h02);
            i5 = this.f34234j.indexOf(h02);
            if ((ConstantIntEnum.CHOICENESS.value() + "").equals(h02) && this.f34234j.indexOf(f34225s) != -1) {
                h02 = f34225s;
                list = this.f34235k.get(f34225s);
                i5 = this.f34234j.indexOf(f34225s);
            }
        } else {
            i5 = 0;
        }
        if (list != null && list.size() > 0) {
            if (status != 7 && status != 2) {
                Iterator<DownloadTask> it2 = this.f34239o.iterator();
                while (true) {
                    z4 = true;
                    if (!it2.hasNext()) {
                        z5 = true;
                        break;
                    } else if (it2.next().getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                        z5 = false;
                        break;
                    }
                }
                if (z5) {
                    this.f34239o.add(downloadTask);
                }
                if (status == 5) {
                    if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.chajian.name())) {
                        return;
                    }
                    if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.apk.name())) {
                        Iterator<DownloadTask> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z6 = false;
                                break;
                            }
                            DownloadTask next = it3.next();
                            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                                next.setStatus(downloadTask.getStatus());
                                next.setGameZipPath(downloadTask.getGameZipPath());
                                next.setVer(downloadTask.getVer());
                                next.setVer_name(downloadTask.getVer_name());
                                next.setCfg_ver(downloadTask.getCfg_ver());
                                next.setSource_ver(downloadTask.getSource_ver());
                                z6 = true;
                                break;
                            }
                        }
                        if (!z6) {
                            list.add(0, downloadTask);
                        }
                    }
                    if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.android.name())) {
                        Iterator<DownloadTask> it4 = list.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                z4 = false;
                                break;
                            }
                            DownloadTask next2 = it4.next();
                            if (next2.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                                next2.setStatus(downloadTask.getStatus());
                                break;
                            }
                        }
                        if (!z4) {
                            list.add(0, downloadTask);
                        }
                    }
                }
                f0(downloadTask, i5, h02, list);
            }
            Iterator<DownloadTask> it5 = list.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                } else if (it5.next().getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    it5.remove();
                    break;
                }
            }
            Iterator<DownloadTask> it6 = this.f34239o.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                } else if (it6.next().getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    it6.remove();
                    break;
                }
            }
            f0(downloadTask, i5, h02, list);
        } else if (status == 5) {
            this.f34239o.add(downloadTask);
            g0(downloadTask, i5, h02);
        }
    }
}
