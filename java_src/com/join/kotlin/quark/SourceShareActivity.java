package com.join.kotlin.quark;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ActivitySourceShareBinding;
import com.join.kotlin.base.activity.BaseVmDbActivity;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.ext.CustomViewExtKt;
import com.join.kotlin.base.net.AppException;
import com.join.kotlin.base.state.ResultState;
import com.join.kotlin.quark.model.bean.SourceTabItemBean;
import com.join.kotlin.quark.model.bean.SourceTabListBean;
import com.join.kotlin.quark.proxy.SourceShareClickProxy;
import com.join.kotlin.quark.viewmodel.SourceShareViewModel;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.ExtBean;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.ext.ToastManager;
import com.papa91.arc.view.GlideImageLoader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceShareActivity.kt */
/* loaded from: classes3.dex */
public final class SourceShareActivity extends BaseVmDbActivity<SourceShareViewModel, ActivitySourceShareBinding> implements SourceShareClickProxy {
    @Nullable
    private FragmentPagerAdapter adapter;
    @Nullable
    private ExtBean extBean;
    @NotNull
    private ArrayList<FragmentPagerAdapter.a> fragments = new ArrayList<>();
    private com.kingja.loadsir.core.b<Object> loadSir;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$3$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getView(ArrayList<SourceTabItemBean> arrayList, int i4) {
        View view;
        View customView;
        View customView2;
        if (getMDatabind().f17046m.getTabCount() == 0) {
            return;
        }
        int tabCount = getMDatabind().f17046m.getTabCount();
        int i5 = 0;
        while (true) {
            view = null;
            view = null;
            if (i5 >= tabCount) {
                break;
            }
            View inflate = LayoutInflater.from(this).inflate(R.layout.layout_source_share_tab_item, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(this).inflate(R.lay…rce_share_tab_item, null)");
            View findViewById = inflate.findViewById(R.id.tv_name);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById;
            SourceTabItemBean sourceTabItemBean = arrayList.get(i5);
            textView.setText(sourceTabItemBean != null ? sourceTabItemBean.getName() : null);
            TabLayout.Tab tabAt = getMDatabind().f17046m.getTabAt(i5);
            if (tabAt != null) {
                tabAt.setCustomView(inflate);
            }
            i5++;
        }
        TabLayout.Tab tabAt2 = getMDatabind().f17046m.getTabAt(i4);
        View findViewById2 = (tabAt2 == null || (customView2 = tabAt2.getCustomView()) == null) ? null : customView2.findViewById(R.id.tv_name);
        Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById2;
        textView2.setTextColor(-16777216);
        textView2.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp32));
        textView2.setTypeface(textView2.getTypeface(), 1);
        TabLayout.Tab tabAt3 = getMDatabind().f17046m.getTabAt(i4);
        if (tabAt3 != null && (customView = tabAt3.getCustomView()) != null) {
            view = customView.findViewById(R.id.iv_ind);
        }
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    static /* synthetic */ void getView$default(SourceShareActivity sourceShareActivity, ArrayList arrayList, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        sourceShareActivity.getView(arrayList, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$1(SourceShareActivity this$0, View view, int i4, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        if (i4 == 66) {
            Object systemService = this$0.getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            View currentFocus = activity.getCurrentFocus();
            Intrinsics.checkNotNull(currentFocus);
            ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            this$0.onSearchClick();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStatus(TabLayout.Tab tab) {
        if (getMDatabind().f17046m.getTabCount() == 0) {
            return;
        }
        int tabCount = getMDatabind().f17046m.getTabCount();
        for (int i4 = 0; i4 < tabCount; i4++) {
            TabLayout.Tab tabAt = getMDatabind().f17046m.getTabAt(i4);
            View customView = tabAt != null ? tabAt.getCustomView() : null;
            if (customView != null) {
                if (i4 == tab.getPosition()) {
                    customView.findViewById(R.id.iv_ind).setVisibility(0);
                    View findViewById = customView.findViewById(R.id.tv_name);
                    Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) findViewById;
                    textView.setTextColor(-16777216);
                    textView.setTypeface(textView.getTypeface(), 1);
                    textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp32));
                } else {
                    customView.findViewById(R.id.iv_ind).setVisibility(4);
                    View findViewById2 = customView.findViewById(R.id.tv_name);
                    Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView2 = (TextView) findViewById2;
                    textView2.setTextColor(Color.parseColor("#000000"));
                    textView2.setTypeface(textView2.getTypeface(), 0);
                    textView2.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp28));
                }
            }
        }
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public void createObserver() {
        MutableLiveData<ResultState<SourceTabListBean>> homeData = ((SourceShareViewModel) getMViewModel()).getHomeData();
        final Function1<ResultState<? extends SourceTabListBean>, Unit> function1 = new Function1<ResultState<? extends SourceTabListBean>, Unit>() { // from class: com.join.kotlin.quark.SourceShareActivity$createObserver$1$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SourceShareActivity.kt */
            @SourceDebugExtension({"SMAP\nSourceShareActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceShareActivity.kt\ncom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1\n+ 2 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n29#2,2:269\n32#2,3:273\n29#2,2:276\n32#2,3:281\n1855#3,2:271\n1864#3,3:278\n1#4:284\n*S KotlinDebug\n*F\n+ 1 SourceShareActivity.kt\ncom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1\n*L\n104#1:269,2\n104#1:273,3\n126#1:276,2\n126#1:281,3\n108#1:271,2\n128#1:278,3\n*E\n"})
            /* renamed from: com.join.kotlin.quark.SourceShareActivity$createObserver$1$1$1  reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass1 extends Lambda implements Function1<SourceTabListBean, Unit> {
                final /* synthetic */ SourceShareActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SourceShareActivity sourceShareActivity) {
                    super(1);
                    this.this$0 = sourceShareActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invoke$lambda$10$lambda$2$lambda$1(SourceShareActivity this$0, List list, int i4) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(list, "$list");
                    IntentUtil.getInstance().intentActivity(this$0, ((CommonGameInfoBean) list.get(i4)).getIntentDataBean());
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SourceTabListBean sourceTabListBean) {
                    invoke2(sourceTabListBean);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable SourceTabListBean sourceTabListBean) {
                    com.kingja.loadsir.core.b bVar;
                    Integer tab_id;
                    ArrayList arrayList = new ArrayList();
                    bVar = this.this$0.loadSir;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                        bVar = null;
                    }
                    bVar.h();
                    if (sourceTabListBean != null) {
                        final SourceShareActivity sourceShareActivity = this.this$0;
                        final List<CommonGameInfoBean> banner = sourceTabListBean.getBanner();
                        if (banner != null) {
                            ((SourceShareViewModel) sourceShareActivity.getMViewModel()).getShowBanner().setValue(Boolean.valueOf(!banner.isEmpty()));
                            ArrayList arrayList2 = new ArrayList();
                            for (CommonGameInfoBean commonGameInfoBean : banner) {
                                arrayList2.add(commonGameInfoBean.getCoverPicUrl());
                            }
                            sourceShareActivity.getMDatabind().f17037d.z(arrayList2).x(2000).y(new GlideImageLoader()).D(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0078: INVOKE  
                                  (wrap: com.youth.banner.Banner : 0x0074: INVOKE  (r2v12 com.youth.banner.Banner A[REMOVE]) = 
                                  (wrap: com.youth.banner.Banner : 0x006b: INVOKE  (r3v10 com.youth.banner.Banner A[REMOVE]) = 
                                  (wrap: com.youth.banner.Banner : 0x0062: INVOKE  (r3v9 com.youth.banner.Banner A[REMOVE]) = 
                                  (wrap: com.youth.banner.Banner : 0x005c: INVOKE  (r3v8 com.youth.banner.Banner A[REMOVE]) = 
                                  (wrap: com.youth.banner.Banner : 0x005a: IGET  (r4v10 com.youth.banner.Banner A[REMOVE]) = 
                                  (wrap: com.join.android.app.mgsim.wufun.databinding.ActivitySourceShareBinding : 0x0054: INVOKE  (r4v8 com.join.android.app.mgsim.wufun.databinding.ActivitySourceShareBinding A[REMOVE]) = (r1v3 'sourceShareActivity' com.join.kotlin.quark.SourceShareActivity) type: VIRTUAL call: com.join.kotlin.base.activity.BaseVmDbActivity.getMDatabind():androidx.databinding.ViewDataBinding)
                                 com.join.android.app.mgsim.wufun.databinding.ActivitySourceShareBinding.d com.youth.banner.Banner)
                                  (r3v7 'arrayList2' java.util.ArrayList)
                                 type: VIRTUAL call: com.youth.banner.Banner.z(java.util.List):com.youth.banner.Banner)
                                  (2000 int)
                                 type: VIRTUAL call: com.youth.banner.Banner.x(int):com.youth.banner.Banner)
                                  (wrap: com.papa91.arc.view.GlideImageLoader : 0x0068: CONSTRUCTOR  (r4v12 com.papa91.arc.view.GlideImageLoader A[REMOVE]) =  call: com.papa91.arc.view.GlideImageLoader.<init>():void type: CONSTRUCTOR)
                                 type: VIRTUAL call: com.youth.banner.Banner.y(com.youth.banner.loader.ImageLoaderInterface):com.youth.banner.Banner)
                                  (wrap: m3.b : 0x0071: CONSTRUCTOR  (r4v13 m3.b A[REMOVE]) = 
                                  (r1v3 'sourceShareActivity' com.join.kotlin.quark.SourceShareActivity A[DONT_INLINE])
                                  (r2v0 'banner' java.util.List<com.join.mgps.dto.CommonGameInfoBean> A[DONT_INLINE])
                                 call: com.join.kotlin.quark.s.<init>(com.join.kotlin.quark.SourceShareActivity, java.util.List):void type: CONSTRUCTOR)
                                 type: VIRTUAL call: com.youth.banner.Banner.D(m3.b):com.youth.banner.Banner)
                                 type: VIRTUAL call: com.youth.banner.Banner.I():com.youth.banner.Banner in method: com.join.kotlin.quark.SourceShareActivity$createObserver$1$1.1.invoke(com.join.kotlin.quark.model.bean.SourceTabListBean):void, file: classes3.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.join.kotlin.quark.s, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:96)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:840)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                	... 29 more
                                */
                            /*
                                Method dump skipped, instructions count: 306
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.quark.SourceShareActivity$createObserver$1$1.AnonymousClass1.invoke2(com.join.kotlin.quark.model.bean.SourceTabListBean):void");
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ResultState<? extends SourceTabListBean> resultState) {
                        invoke2((ResultState<SourceTabListBean>) resultState);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable ResultState<SourceTabListBean> resultState) {
                        com.kingja.loadsir.core.b bVar;
                        if (resultState == null) {
                            bVar = SourceShareActivity.this.loadSir;
                            if (bVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                                bVar = null;
                            }
                            CustomViewExtKt.showError$default(bVar, null, 1, null);
                            return;
                        }
                        SourceShareActivity sourceShareActivity = SourceShareActivity.this;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(sourceShareActivity);
                        final SourceShareActivity sourceShareActivity2 = SourceShareActivity.this;
                        BaseViewModelExtKt.parseState$default(sourceShareActivity, resultState, anonymousClass1, new Function1<AppException, Unit>() { // from class: com.join.kotlin.quark.SourceShareActivity$createObserver$1$1.2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(AppException appException) {
                                invoke2(appException);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull AppException it2) {
                                com.kingja.loadsir.core.b bVar2;
                                Intrinsics.checkNotNullParameter(it2, "it");
                                ToastManager.show(it2.getErrorMsg());
                                bVar2 = SourceShareActivity.this.loadSir;
                                if (bVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                                    bVar2 = null;
                                }
                                CustomViewExtKt.showError$default(bVar2, null, 1, null);
                            }
                        }, (Function0) null, 8, (Object) null);
                    }
                };
                homeData.observe(this, new Observer() { // from class: com.join.kotlin.quark.r
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        SourceShareActivity.createObserver$lambda$3$lambda$2(Function1.this, obj);
                    }
                });
            }

            @Nullable
            public final FragmentPagerAdapter getAdapter() {
                return this.adapter;
            }

            @Nullable
            public final ExtBean getExtBean() {
                return this.extBean;
            }

            @NotNull
            public final ArrayList<FragmentPagerAdapter.a> getFragments() {
                return this.fragments;
            }

            @Override // com.join.kotlin.base.activity.BaseVmActivity
            public void initView(@Nullable Bundle bundle) {
                if (getIntent() != null && this.extBean != null) {
                    com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this);
                    Event event = Event.visitPCPageZone;
                    Ext ext = new Ext();
                    ExtBean extBean = this.extBean;
                    Intrinsics.checkNotNull(extBean);
                    l4.O1(event, ext.setFrom(extBean.getFrom()));
                }
                this.adapter = new FragmentPagerAdapter(getSupportFragmentManager());
                getMDatabind().f17049p.setAdapter(this.adapter);
                getMDatabind().f17046m.setupWithViewPager(getMDatabind().f17049p);
                getMDatabind().h((SourceShareViewModel) getMViewModel());
                getMDatabind().g(this);
                String uid = AccountUtil_.getInstance_(this).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getInstance_(this).uid");
                ((SourceShareViewModel) getMViewModel()).getWebDiskHome(uid);
                CoordinatorLayout coordinatorLayout = getMDatabind().f17043j;
                Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "mDatabind.mainContent");
                this.loadSir = CustomViewExtKt.loadServiceInit(coordinatorLayout, new Function0<Unit>() { // from class: com.join.kotlin.quark.SourceShareActivity$initView$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        String uid2 = AccountUtil_.getInstance_(SourceShareActivity.this).getUid();
                        Intrinsics.checkNotNullExpressionValue(uid2, "getInstance_(this).uid");
                        ((SourceShareViewModel) SourceShareActivity.this.getMViewModel()).getWebDiskHome(uid2);
                    }
                });
                com.papa.sim.statistic.p.l(this).O1(Event.clickSourceZone, new Ext());
                getMDatabind().f17045l.setOnKeyListener(new View.OnKeyListener() { // from class: com.join.kotlin.quark.q
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                        boolean initView$lambda$1;
                        initView$lambda$1 = SourceShareActivity.initView$lambda$1(SourceShareActivity.this, view, i4, keyEvent);
                        return initView$lambda$1;
                    }
                });
            }

            @Override // com.join.kotlin.quark.proxy.SourceShareClickProxy
            public void onBackClick() {
                finish();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
            public void onResume() {
                super.onResume();
                UtilsMy.q4(this);
            }

            @Override // com.join.kotlin.quark.proxy.SourceShareClickProxy
            public void onSaveClick() {
            }

            @Override // com.join.kotlin.quark.proxy.SourceShareClickProxy
            public void onSearchClick() {
                if (g2.i(((SourceShareViewModel) getMViewModel()).getSearchKeyword().getValue())) {
                    Intent intent = new Intent(this, QuarkSearchResultActivity.class);
                    MutableLiveData<String> searchKeyword = ((SourceShareViewModel) getMViewModel()).getSearchKeyword();
                    intent.putExtra("_keyword", searchKeyword != null ? searchKeyword.getValue() : null);
                    MutableLiveData<String> searchKeyword2 = ((SourceShareViewModel) getMViewModel()).getSearchKeyword();
                    intent.putExtra("_tab_id", searchKeyword2 != null ? searchKeyword2.getValue() : null);
                    startActivity(intent);
                    com.papa.sim.statistic.p.l(this).O1(Event.clickSearchBtn, new Ext());
                    return;
                }
                ToastManager.show(getMDatabind().f17045l.getHint());
            }

            @Override // com.join.kotlin.quark.proxy.SourceShareClickProxy
            public void onShareClick() {
                if (IntentUtil.getInstance().isNotLogin(this)) {
                    IntentUtil.getInstance().goLogin(this);
                } else {
                    startActivity(new Intent(this, UploadSourceHopeActivity.class));
                }
            }

            public final void setAdapter(@Nullable FragmentPagerAdapter fragmentPagerAdapter) {
                this.adapter = fragmentPagerAdapter;
            }

            public final void setExtBean(@Nullable ExtBean extBean) {
                this.extBean = extBean;
            }

            public final void setFragments(@NotNull ArrayList<FragmentPagerAdapter.a> arrayList) {
                Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
                this.fragments = arrayList;
            }
        }
