package com.join.kotlin.ui.introduction;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.common.utils.j;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.customview.textview.MovementTextView;
import com.join.mgps.dto.BbsCommentListBean;
import com.join.mgps.dto.RequestBbsCommentListArgs;
import com.join.mgps.dto.RequestBbsDispraiseArgs;
import com.join.mgps.dto.RequestBbsPraiseArgs;
import com.join.mgps.dto.RequestBbsReplyArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.rpc.impl.i;
import com.join.mgps.rpc.k;
import com.kwad.sdk.core.response.model.SdkConfigData;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import com.wufan.user.service.protobuf.n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import w1.h;
@EFragment(R.layout.fragment_comment_list_introduction)
/* loaded from: classes3.dex */
public class IntroductionCommentListFragment extends Fragment implements View.OnClickListener {
    private int commentId;
    BbsCommentListBean commentListBean;
    Context context;
    private List<BbsCommentListBean> datas;
    int duration;
    @ViewById
    EditText et_content;
    String gameId;
    @ViewById
    ImageView iv_back;
    @ViewById
    LinearLayout ll_empty;
    @ViewById
    View loding_faile;
    @ViewById
    View loding_faile_detail;
    @ViewById
    View loding_layout;
    @ViewById
    View loding_layout_detail;
    h mFragmentCallback;
    private ItemAdapter mItemAdapter;
    private ItemDetailAdapter mItemDetailAdapter;
    int pid;
    int posterId;
    String reportUrl;
    @ViewById
    RelativeLayout rl_comment_detail;
    @ViewById
    RelativeLayout rl_comment_list;
    k rpcGameClient;
    @ViewById
    XRecyclerView rv_comment_detail_list;
    @ViewById
    RecyclerView rv_list_data;
    @ViewById
    TextView textView2;
    @ViewById
    TextView tv_title;
    private int page = 1;
    boolean isVideo = false;
    private boolean dataChanged = false;
    private int detailPage = 1;
    private boolean showDetail = false;
    private boolean fromNotice = false;
    String regText = "(\\d{0,2}:[0-5][0-9]:[0-5][0-9])|([0-5][0-9]:[0-5][0-9])";
    boolean isRequestPraise = false;
    boolean isRequestDisPraise = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class ItemAdapter extends BaseQuickAdapter<BbsCommentListBean, BaseViewHolder> {
        public ItemAdapter() {
            super((int) R.layout.item_introduction_commont);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        public void convert(BaseViewHolder baseViewHolder, final BbsCommentListBean bbsCommentListBean) {
            final BbsCommentListBean bbsCommentListBean2;
            View view;
            baseViewHolder.setText(R.id.userName, bbsCommentListBean.getNickname());
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.siv_head), bbsCommentListBean.getAvatar());
            int i4 = R.id.content;
            MovementTextView movementTextView = (MovementTextView) baseViewHolder.getView(R.id.content);
            movementTextView.setText(bbsCommentListBean.getMsg());
            IntroductionCommentListFragment introductionCommentListFragment = IntroductionCommentListFragment.this;
            if (introductionCommentListFragment.isVideo) {
                introductionCommentListFragment.matchText(movementTextView, movementTextView.getText().toString(), IntroductionCommentListFragment.this.regText, bbsCommentListBean.getNickname(), bbsCommentListBean.getRnickname(), false);
            }
            movementTextView.setClickTextListener(new MovementTextView.a() { // from class: com.join.kotlin.ui.introduction.IntroductionCommentListFragment.ItemAdapter.1
                @Override // com.join.mgps.customview.textview.MovementTextView.a
                public void onClickText() {
                    IntroductionCommentListFragment.this.showCommentDetail(bbsCommentListBean);
                }
            });
            baseViewHolder.setText(R.id.tv_star_num, String.valueOf(bbsCommentListBean.getLike()));
            if (bbsCommentListBean.getPraise().booleanValue()) {
                baseViewHolder.setImageResource(R.id.iv_praise, R.drawable.ic_introduction_star_blue_solid);
                baseViewHolder.setTextColor(R.id.tv_star_num, bbsCommentListBean.getPraise().booleanValue() ? Color.parseColor("#3392FF") : Color.parseColor("#575F79"));
            } else {
                baseViewHolder.setImageResource(R.id.iv_praise, R.drawable.ic_introduction_star_grey);
                baseViewHolder.setTextColor(R.id.tv_star_num, bbsCommentListBean.getPraise().booleanValue() ? Color.parseColor("#3392FF") : Color.parseColor("#575F79"));
            }
            baseViewHolder.addOnClickListener(R.id.iv_praise);
            baseViewHolder.addOnClickListener(R.id.iv_more);
            baseViewHolder.addOnClickListener(R.id.commentAllRootLl);
            LinearLayout linearLayout = (LinearLayout) baseViewHolder.getView(R.id.ll_replay);
            linearLayout.removeAllViews();
            if (bbsCommentListBean.getReplyList() != null && bbsCommentListBean.getReplyList().size() > 0) {
                baseViewHolder.setGone(R.id.cll_view, true);
                int i5 = 2;
                List<BbsCommentListBean> subList = bbsCommentListBean.getReplyList().subList(0, Math.min(2, bbsCommentListBean.getReplyList().size()));
                if (subList != null) {
                    int i6 = 0;
                    while (i6 < subList.size()) {
                        View inflate = View.inflate(IntroductionCommentListFragment.this.getContext(), R.layout.item_introduction_commont_list_replay, null);
                        MovementTextView movementTextView2 = (MovementTextView) inflate.findViewById(i4);
                        View findViewById = inflate.findViewById(R.id.layoutTop);
                        BbsCommentListBean bbsCommentListBean3 = subList.get(i6);
                        if (g2.h(bbsCommentListBean3.getRnickname())) {
                            String string = IntroductionCommentListFragment.this.getString(R.string.introduction_comment_replay);
                            Object[] objArr = new Object[i5];
                            objArr[0] = bbsCommentListBean3.getNickname();
                            objArr[1] = bbsCommentListBean3.getMsg();
                            movementTextView2.setText(Html.fromHtml(String.format(string, objArr)));
                        } else {
                            String string2 = IntroductionCommentListFragment.this.getString(R.string.introduction_comment_replay1);
                            Object[] objArr2 = new Object[3];
                            objArr2[0] = bbsCommentListBean3.getNickname();
                            objArr2[1] = bbsCommentListBean3.getRnickname();
                            objArr2[i5] = bbsCommentListBean3.getMsg();
                            movementTextView2.setText(Html.fromHtml(String.format(string2, objArr2)));
                        }
                        IntroductionCommentListFragment introductionCommentListFragment2 = IntroductionCommentListFragment.this;
                        if (introductionCommentListFragment2.isVideo) {
                            bbsCommentListBean2 = bbsCommentListBean3;
                            view = findViewById;
                            introductionCommentListFragment2.matchText(movementTextView2, movementTextView2.getText().toString(), IntroductionCommentListFragment.this.regText, bbsCommentListBean3.getNickname(), bbsCommentListBean3.getRnickname(), true);
                        } else {
                            bbsCommentListBean2 = bbsCommentListBean3;
                            view = findViewById;
                        }
                        movementTextView2.setClickTextListener(new MovementTextView.a() { // from class: com.join.kotlin.ui.introduction.IntroductionCommentListFragment.ItemAdapter.2
                            @Override // com.join.mgps.customview.textview.MovementTextView.a
                            public void onClickText() {
                                IntroductionCommentListFragment.this.showCommentDetail(bbsCommentListBean);
                            }
                        });
                        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.introduction.IntroductionCommentListFragment.ItemAdapter.3
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view2) {
                                IntroductionCommentListFragment introductionCommentListFragment3 = IntroductionCommentListFragment.this;
                                introductionCommentListFragment3.commentListBean = bbsCommentListBean2;
                                EditText editText = introductionCommentListFragment3.et_content;
                                editText.setHint("回复" + bbsCommentListBean2.getNickname());
                            }
                        });
                        if (i6 == subList.size() - 1 && subList.size() == 1) {
                            view.setVisibility(8);
                        } else {
                            view.setVisibility(0);
                        }
                        linearLayout.addView(inflate);
                        i6++;
                        i4 = R.id.content;
                        i5 = 2;
                    }
                }
                if (bbsCommentListBean.getReplies() > 2) {
                    baseViewHolder.setText(R.id.tv_replay_num, "查看更多" + bbsCommentListBean.getReplies() + "条回复");
                    baseViewHolder.setGone(R.id.tv_replay_num, true);
                    return;
                }
                baseViewHolder.setGone(R.id.tv_replay_num, false);
                return;
            }
            baseViewHolder.setGone(R.id.cll_view, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class ItemDetailAdapter extends RecyclerView.Adapter<BaseViewHolder> {
        List<BbsCommentListBean> mData;

        public ItemDetailAdapter() {
            if (this.mData == null) {
                this.mData = new ArrayList();
            }
        }

        public void addData(@Nullable List<BbsCommentListBean> list) {
            if (this.mData == null) {
                this.mData = new ArrayList();
            }
            this.mData.addAll(list);
            notifyDataSetChanged();
        }

        public void clear() {
            List<BbsCommentListBean> list = this.mData;
            if (list == null || list.size() <= 0) {
                return;
            }
            this.mData.clear();
            notifyDataSetChanged();
        }

        @Nullable
        public BbsCommentListBean getItem(@IntRange(from = 0) int i4) {
            if (i4 < 0 || i4 >= this.mData.size()) {
                return null;
            }
            return this.mData.get(i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<BbsCommentListBean> list = this.mData;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i4) {
            return getItem(i4).isReplay() ? 0 : 1;
        }

        public void setNewData(@Nullable List<BbsCommentListBean> list) {
            if (this.mData == null) {
                this.mData = new ArrayList();
            }
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull BaseViewHolder baseViewHolder, int i4) {
            final BbsCommentListBean item = getItem(i4);
            TextView textView = (TextView) baseViewHolder.getView(R.id.content);
            if (item.isReplay()) {
                baseViewHolder.setText(R.id.userName, item.getNickname());
                MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.siv_head), item.getAvatar());
                if (g2.h(item.getRnickname())) {
                    textView.setText(Html.fromHtml(String.format(IntroductionCommentListFragment.this.getString(R.string.introduction_comment_detail_replay), item.getMsg())));
                } else {
                    textView.setText(Html.fromHtml(String.format(IntroductionCommentListFragment.this.getString(R.string.introduction_comment_detail_replay1), item.getRnickname(), item.getMsg())));
                }
            } else {
                baseViewHolder.setText(R.id.userName, item.getNickname());
                MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.siv_head), item.getAvatar());
                textView.setText(item.getMsg());
                baseViewHolder.setText(R.id.tv_star_num, String.valueOf(item.getLike()));
                baseViewHolder.setImageResource(R.id.iv_praise, item.getPraise().booleanValue() ? R.drawable.ic_introduction_star_blue_solid : R.drawable.ic_introduction_star_grey);
                baseViewHolder.setTextColor(R.id.tv_star_num, Color.parseColor(item.getPraise().booleanValue() ? "#3392FF" : "#575F79"));
                baseViewHolder.getView(R.id.iv_praise).setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.introduction.IntroductionCommentListFragment.ItemDetailAdapter.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (item.getPraise().booleanValue()) {
                            IntroductionCommentListFragment.this.onBbsDisPraise(item.getId(), item);
                        } else {
                            IntroductionCommentListFragment.this.onBbsPraise(String.valueOf(item.getRuid()), item.getId(), item);
                        }
                    }
                });
                final ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_more);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.introduction.IntroductionCommentListFragment.ItemDetailAdapter.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.introduction.IntroductionCommentListFragment.ItemDetailAdapter.2.1
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view2) {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                IntroductionCommentListFragment.this.onClickMore(imageView, item);
                            }
                        });
                    }
                });
            }
            IntroductionCommentListFragment.this.matchText(textView, textView.getText().toString(), IntroductionCommentListFragment.this.regText, item.getNickname(), item.getRnickname(), item.isReplay());
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.introduction.IntroductionCommentListFragment.ItemDetailAdapter.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IntroductionCommentListFragment introductionCommentListFragment = IntroductionCommentListFragment.this;
                    introductionCommentListFragment.commentListBean = item;
                    EditText editText = introductionCommentListFragment.et_content;
                    editText.setHint("回复" + item.getNickname());
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            if (i4 == 0) {
                return new BaseViewHolder(View.inflate(IntroductionCommentListFragment.this.getContext(), R.layout.item_introduction_commont_detial_replay, null));
            }
            return new BaseViewHolder(View.inflate(IntroductionCommentListFragment.this.getContext(), R.layout.item_introduction_commont_detail, null));
        }

        public void addData(@Nullable BbsCommentListBean bbsCommentListBean) {
            if (this.mData == null) {
                this.mData = new ArrayList();
            }
            this.mData.add(bbsCommentListBean);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class TimeClickSpan extends z1.a {
        String clickStr;

        public TimeClickSpan(String str) {
            this.clickStr = str;
        }

        @Override // z1.a, android.text.style.ClickableSpan
        public void onClick(View view) {
            String[] split;
            int intValue;
            if (!g2.i(this.clickStr) || (split = this.clickStr.split(":")) == null) {
                return;
            }
            if (split.length == 2) {
                int intValue2 = g2.i(split[0]) ? Integer.valueOf(split[0]).intValue() * 60 : 0;
                intValue = g2.i(split[1]) ? Integer.valueOf(split[1]).intValue() : 0;
                IntroductionCommentListFragment introductionCommentListFragment = IntroductionCommentListFragment.this;
                h hVar = introductionCommentListFragment.mFragmentCallback;
                if (hVar != null) {
                    hVar.U(introductionCommentListFragment);
                    IntroductionCommentListFragment.this.mFragmentCallback.a0(intValue2 + intValue);
                }
            } else if (split.length == 3) {
                int intValue3 = g2.i(split[0]) ? Integer.valueOf(split[0]).intValue() * SdkConfigData.DEFAULT_REQUEST_INTERVAL : 0;
                int intValue4 = g2.i(split[1]) ? Integer.valueOf(split[1]).intValue() * 60 : 0;
                intValue = g2.i(split[2]) ? Integer.valueOf(split[2]).intValue() : 0;
                IntroductionCommentListFragment introductionCommentListFragment2 = IntroductionCommentListFragment.this;
                h hVar2 = introductionCommentListFragment2.mFragmentCallback;
                if (hVar2 != null) {
                    hVar2.U(introductionCommentListFragment2);
                    IntroductionCommentListFragment.this.mFragmentCallback.a0(intValue3 + intValue4 + intValue);
                }
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.bgColor = Color.parseColor("#00000000");
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    static /* synthetic */ int access$008(IntroductionCommentListFragment introductionCommentListFragment) {
        int i4 = introductionCommentListFragment.page;
        introductionCommentListFragment.page = i4 + 1;
        return i4;
    }

    static /* synthetic */ int access$208(IntroductionCommentListFragment introductionCommentListFragment) {
        int i4 = introductionCommentListFragment.detailPage;
        introductionCommentListFragment.detailPage = i4 + 1;
        return i4;
    }

    private int getUid() {
        n0 accountData = AccountUtil_.getInstance_(this.context).getAccountData();
        if (accountData != null) {
            return accountData.getUid();
        }
        return 0;
    }

    private boolean validTime(String str, int i4) {
        String[] split;
        int i5;
        int intValue;
        int i6;
        if (g2.h(str) || (split = str.split(":")) == null || split.length <= 0) {
            return false;
        }
        if (split.length == 2) {
            i6 = g2.i(split[0]) ? Integer.valueOf(split[0]).intValue() * 60 : 0;
            intValue = g2.i(split[1]) ? Integer.valueOf(split[1]).intValue() : 0;
        } else if (split.length != 3) {
            i5 = 0;
            return i5 > 0 && i5 <= i4;
        } else {
            int intValue2 = g2.i(split[0]) ? Integer.valueOf(split[0]).intValue() * SdkConfigData.DEFAULT_REQUEST_INTERVAL : 0;
            int intValue3 = g2.i(split[1]) ? Integer.valueOf(split[1]).intValue() * 60 : 0;
            intValue = g2.i(split[2]) ? Integer.valueOf(split[2]).intValue() : 0;
            i6 = intValue2 + intValue3;
        }
        i5 = i6 + intValue;
        if (i5 > 0) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void aftervidew() {
        this.context = getActivity();
        this.rpcGameClient = i.D0();
        this.rv_list_data.setLayoutManager(new LinearLayoutManager(this.context));
        if (this.mItemAdapter == null) {
            this.mItemAdapter = new ItemAdapter();
            final UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
            aVar.f46233f = 0;
            aVar.f46237d = (int) getResources().getDimension(R.dimen.wdp1);
            this.rv_list_data.addItemDecoration(new UniversalItemDecoration() { // from class: com.join.kotlin.ui.introduction.IntroductionCommentListFragment.1
                @Override // com.join.mgps.base.decoration.UniversalItemDecoration
                public UniversalItemDecoration.b getItemOffsets(int i4) {
                    return aVar;
                }
            });
            this.mItemAdapter.setOnLoadMoreListener(new BaseQuickAdapter.l() { // from class: com.join.kotlin.ui.introduction.IntroductionCommentListFragment.2
                @Override // com.join.mgps.base.BaseQuickAdapter.l
                public void onLoadMoreRequested() {
                    IntroductionCommentListFragment.access$008(IntroductionCommentListFragment.this);
                    IntroductionCommentListFragment introductionCommentListFragment = IntroductionCommentListFragment.this;
                    introductionCommentListFragment.loadData(introductionCommentListFragment.page);
                }
            }, this.rv_list_data);
        }
        this.rv_list_data.setAdapter(this.mItemAdapter);
        this.mItemAdapter.setOnItemChildClickListener(new BaseQuickAdapter.h() { // from class: com.join.kotlin.ui.introduction.IntroductionCommentListFragment.3
            @Override // com.join.mgps.base.BaseQuickAdapter.h
            public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                BbsCommentListBean item = IntroductionCommentListFragment.this.mItemAdapter.getItem(i4);
                if (view.getId() == R.id.iv_more) {
                    IntroductionCommentListFragment.this.onClickMore(view, item);
                } else if (view.getId() == R.id.iv_praise) {
                    if (item.getPraise().booleanValue()) {
                        IntroductionCommentListFragment introductionCommentListFragment = IntroductionCommentListFragment.this;
                        introductionCommentListFragment.onBbsDisPraise(Integer.valueOf(introductionCommentListFragment.pid), item);
                        return;
                    }
                    IntroductionCommentListFragment.this.onBbsPraise(String.valueOf(item.getRuid()), Integer.valueOf(IntroductionCommentListFragment.this.pid), item);
                } else if (view.getId() == R.id.commentAllRootLl) {
                    IntroductionCommentListFragment.this.showCommentDetail(item);
                }
            }
        });
        if (this.mItemDetailAdapter == null) {
            this.mItemDetailAdapter = new ItemDetailAdapter();
            this.rv_comment_detail_list.setLayoutManager(new LinearLayoutManager(getContext()));
            this.rv_comment_detail_list.setAdapter(this.mItemDetailAdapter);
            this.rv_comment_detail_list.setLoadingListener(new XRecyclerView.f() { // from class: com.join.kotlin.ui.introduction.IntroductionCommentListFragment.4
                @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
                public void onLoadMore() {
                    IntroductionCommentListFragment.access$208(IntroductionCommentListFragment.this);
                    if (IntroductionCommentListFragment.this.fromNotice) {
                        IntroductionCommentListFragment introductionCommentListFragment = IntroductionCommentListFragment.this;
                        introductionCommentListFragment.loadDataDetailFromNotice(introductionCommentListFragment.detailPage);
                        return;
                    }
                    IntroductionCommentListFragment introductionCommentListFragment2 = IntroductionCommentListFragment.this;
                    introductionCommentListFragment2.loadDataDetail(introductionCommentListFragment2.detailPage);
                }

                @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
                public void onRefresh() {
                }
            });
        }
        loadData(1);
        if (this.fromNotice) {
            this.et_content.setText("");
            this.et_content.setHint("请输入评论内容");
            this.iv_back.setVisibility(0);
            this.rl_comment_list.setVisibility(8);
            this.rl_comment_detail.setVisibility(0);
            this.showDetail = true;
            loadDataDetailFromNotice(this.detailPage);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void commitComment(String str) {
        if (j.j(this.context)) {
            try {
                RequestBbsReplyArgs requestBbsReplyArgs = new RequestBbsReplyArgs();
                requestBbsReplyArgs.setPid(Integer.valueOf(this.pid));
                requestBbsReplyArgs.setUid(Integer.valueOf(getUid()));
                requestBbsReplyArgs.setContent(str);
                requestBbsReplyArgs.setRuid(Integer.valueOf(this.posterId));
                BbsCommentListBean bbsCommentListBean = this.commentListBean;
                if (bbsCommentListBean != null) {
                    requestBbsReplyArgs.setCommentId(bbsCommentListBean.getId());
                    requestBbsReplyArgs.setRuid(this.commentListBean.getUid());
                }
                RequestModel requestModel = new RequestModel(this.context);
                requestModel.setArgs(requestBbsReplyArgs);
                ResponseModel<Boolean> l02 = this.rpcGameClient.l0(requestModel.makeSign());
                try {
                    hideLoading();
                    if (l02 != null && l02.getData() != null) {
                        updateCommentInput();
                    } else {
                        hideLoading();
                    }
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    hideLoading();
                    return;
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                hideLoading();
                return;
            }
        }
        hideLoading();
    }

    String getReportUrl(int i4, int i5) {
        if (g2.i(this.reportUrl)) {
            if (this.reportUrl.contains("?")) {
                return this.reportUrl + "&resourceType=COMMENT&ruid=" + i4 + "&resourceId=" + i5;
            }
            return this.reportUrl + "?resourceType=COMMENT&ruid=" + i4 + "&resourceId=" + i5;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void hideLoading() {
        View view = this.loding_layout;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.loding_faile;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        RecyclerView recyclerView = this.rv_list_data;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void hideLoadingDetail() {
        View view = this.loding_layout_detail;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.loding_faile_detail;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        RelativeLayout relativeLayout = this.rl_comment_detail;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        XRecyclerView xRecyclerView = this.rv_comment_detail_list;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(0);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0068 -> B:22:0x007a). Please submit an issue!!! */
    @Background
    public void loadCommentDetail(int i4) {
        showLoadingView();
        if (j.j(this.context)) {
            try {
                RequestBbsCommentListArgs requestBbsCommentListArgs = new RequestBbsCommentListArgs();
                requestBbsCommentListArgs.setPid(Integer.valueOf(this.pid));
                requestBbsCommentListArgs.setPage(Integer.valueOf(i4));
                requestBbsCommentListArgs.setUid(Integer.valueOf(getUid()));
                requestBbsCommentListArgs.setCommentId(Integer.valueOf(this.commentId));
                RequestModel requestModel = new RequestModel(this.context);
                requestModel.setArgs(requestBbsCommentListArgs);
                ResponseModel<List<BbsCommentListBean>> z02 = this.rpcGameClient.z0(requestModel.makeSign());
                try {
                    hideLoading();
                    if (z02 != null && z02.getData() != null) {
                        showDetail(z02.getData(), i4 > 1);
                    } else {
                        showDetail(null, false);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    showLoadFailed();
                }
                return;
            } catch (Exception e6) {
                e6.printStackTrace();
                showLoadFailed();
                return;
            }
        }
        showLoadFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void loadData(int i4) {
        showLoadingView();
        if (j.j(this.context)) {
            try {
                RequestBbsCommentListArgs requestBbsCommentListArgs = new RequestBbsCommentListArgs();
                requestBbsCommentListArgs.setPid(Integer.valueOf(this.pid));
                requestBbsCommentListArgs.setPage(Integer.valueOf(i4));
                requestBbsCommentListArgs.setUid(Integer.valueOf(getUid()));
                RequestModel requestModel = new RequestModel(this.context);
                requestModel.setArgs(requestBbsCommentListArgs);
                ResponseModel<List<BbsCommentListBean>> F = this.rpcGameClient.F(requestModel.makeSign());
                try {
                    hideLoading();
                    if (F != null && F.getData() != null) {
                        List<BbsCommentListBean> data = F.getData();
                        boolean z4 = true;
                        if (i4 <= 1) {
                            z4 = false;
                        }
                        showMain(data, z4);
                    } else {
                        showLoadFailed();
                    }
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    showLoadFailed();
                    return;
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                showLoadFailed();
                return;
            }
        }
        showLoadFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0068 -> B:22:0x007a). Please submit an issue!!! */
    @Background
    public void loadDataDetail(int i4) {
        showLoadingViewDetail();
        if (j.j(this.context)) {
            try {
                RequestBbsCommentListArgs requestBbsCommentListArgs = new RequestBbsCommentListArgs();
                requestBbsCommentListArgs.setPid(Integer.valueOf(this.pid));
                requestBbsCommentListArgs.setPage(Integer.valueOf(i4));
                requestBbsCommentListArgs.setUid(Integer.valueOf(getUid()));
                requestBbsCommentListArgs.setCommentId(Integer.valueOf(this.commentId));
                RequestModel requestModel = new RequestModel(this.context);
                requestModel.setArgs(requestBbsCommentListArgs);
                ResponseModel<List<BbsCommentListBean>> z02 = this.rpcGameClient.z0(requestModel.makeSign());
                try {
                    hideLoadingDetail();
                    if (z02 != null && z02.getData() != null) {
                        showDetail(z02.getData(), i4 > 1);
                    } else {
                        showDetail(null, false);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    showLoadFailedDetail();
                }
                return;
            } catch (Exception e6) {
                e6.printStackTrace();
                showLoadFailedDetail();
                return;
            }
        }
        showLoadFailedDetail();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void loadDataDetailFromNotice(int i4) {
        showLoadingViewDetail();
        if (j.j(this.context)) {
            try {
                RequestBbsCommentListArgs requestBbsCommentListArgs = new RequestBbsCommentListArgs();
                requestBbsCommentListArgs.setPid(Integer.valueOf(this.pid));
                requestBbsCommentListArgs.setPage(Integer.valueOf(i4));
                requestBbsCommentListArgs.setUid(Integer.valueOf(getUid()));
                requestBbsCommentListArgs.setCommentId(Integer.valueOf(this.commentId));
                RequestModel requestModel = new RequestModel(this.context);
                requestModel.setArgs(requestBbsCommentListArgs);
                ResponseModel<List<BbsCommentListBean>> U = this.rpcGameClient.U(requestModel.makeSign());
                try {
                    hideLoadingDetail();
                    if (U != null && U.getData() != null) {
                        showNoticeDetail(U.getData(), i4 > 1);
                    } else {
                        showNoticeDetail(U.getData(), false);
                    }
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    showLoadFailedDetail();
                    return;
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                showLoadFailedDetail();
                return;
            }
        }
        showLoadFailedDetail();
    }

    public void matchText(TextView textView, String str, String str2, String str3, String str4, boolean z4) {
        if (this.duration > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            Matcher matcher = Pattern.compile(str2, 2).matcher(str);
            while (matcher.find()) {
                int start = matcher.start(0);
                int end = matcher.end(0);
                String substring = str.substring(start, end);
                if (validTime(substring, this.duration)) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#3392FF")), start, end, 33);
                    spannableStringBuilder.setSpan(new TimeClickSpan(substring), start, end, 33);
                }
            }
            if (z4) {
                if (g2.i(str3)) {
                    int indexOf = str.indexOf(str3);
                    int length = str3.length() + indexOf;
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#82888E")), indexOf, length, 33);
                    }
                }
                if (g2.i(str4)) {
                    int indexOf2 = str.indexOf("回复 " + str4) + 3;
                    int length2 = str4.length() + indexOf2;
                    if (indexOf2 >= 0) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#82888E")), indexOf2, length2, 33);
                    }
                }
            }
            textView.setText(spannableStringBuilder);
        }
    }

    public void notifyDataChanged(int i4) {
        this.dataChanged = this.pid != i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.iv_back})
    public void onBackClick() {
        this.tv_title.setText("评论");
        this.iv_back.setVisibility(8);
        this.rl_comment_list.setVisibility(0);
        this.rv_list_data.setVisibility(0);
        this.rl_comment_detail.setVisibility(8);
        this.rv_comment_detail_list.setVisibility(8);
        this.ll_empty.setVisibility(8);
        ItemDetailAdapter itemDetailAdapter = this.mItemDetailAdapter;
        if (itemDetailAdapter != null) {
            itemDetailAdapter.clear();
            this.mItemDetailAdapter.notifyDataSetChanged();
        }
        this.detailPage = 1;
        this.fromNotice = false;
        this.showDetail = false;
        this.et_content.setText("");
        this.et_content.setHint("请输入评论内容");
        this.commentListBean = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void onBbsDisPraise(Integer num, BbsCommentListBean bbsCommentListBean) {
        try {
            if (this.isRequestDisPraise) {
                return;
            }
            if (j.j(getContext())) {
                if (IntentUtil.getInstance().goLogin(getContext())) {
                    showTost("您还未登录请先登录帐号！");
                    this.isRequestDisPraise = false;
                    return;
                }
                try {
                    this.isRequestDisPraise = true;
                    RequestBbsDispraiseArgs requestBbsDispraiseArgs = new RequestBbsDispraiseArgs();
                    requestBbsDispraiseArgs.setResourceType("COMMENT");
                    requestBbsDispraiseArgs.setResourceId(num);
                    requestBbsDispraiseArgs.setUid(Integer.valueOf(getUid()));
                    RequestModel requestModel = new RequestModel(getContext());
                    requestModel.setArgs(requestBbsDispraiseArgs);
                    ResponseModel<Boolean> v2 = this.rpcGameClient.v(requestModel.makeSign());
                    this.isRequestDisPraise = false;
                    if (v2 == null || !v2.getData().booleanValue()) {
                        return;
                    }
                    updatePraise(false, bbsCommentListBean);
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    this.isRequestDisPraise = false;
                    return;
                }
            }
            this.isRequestDisPraise = false;
            showTost(getResources().getString(R.string.net_connect_failed));
        } catch (Exception e6) {
            this.isRequestDisPraise = false;
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void onBbsPraise(String str, Integer num, BbsCommentListBean bbsCommentListBean) {
        try {
            if (this.isRequestPraise) {
                return;
            }
            if (j.j(getContext())) {
                if (IntentUtil.getInstance().goLogin(getContext())) {
                    showTost("您还未登录请先登录帐号！");
                    this.isRequestPraise = false;
                    return;
                }
                try {
                    this.isRequestPraise = true;
                    RequestBbsPraiseArgs requestBbsPraiseArgs = new RequestBbsPraiseArgs();
                    requestBbsPraiseArgs.setResourceType("COMMENT");
                    requestBbsPraiseArgs.setResourceId(num);
                    requestBbsPraiseArgs.setRuid(str);
                    requestBbsPraiseArgs.setUid(Integer.valueOf(getUid()));
                    RequestModel requestModel = new RequestModel(getContext());
                    requestModel.setArgs(requestBbsPraiseArgs);
                    ResponseModel<Boolean> d02 = this.rpcGameClient.d0(requestModel.makeSign());
                    this.isRequestPraise = false;
                    if (d02 == null || !d02.getData().booleanValue()) {
                        return;
                    }
                    updatePraise(true, bbsCommentListBean);
                    p.l(getContext()).q1(Event.singleStartGamePageDetail, Event.CommentClickLike, "", new Ext().setFrom("1").setArticleId(String.valueOf(this.pid)), new Data().setGameId(Long.parseLong(this.gameId)));
                    return;
                } catch (Exception e5) {
                    this.isRequestPraise = false;
                    e5.printStackTrace();
                    return;
                }
            }
            this.isRequestPraise = false;
            showTost(getResources().getString(R.string.net_connect_failed));
        } catch (Exception e6) {
            this.isRequestPraise = false;
            e6.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.tv_commit})
    public void onClickComment() {
        if (IntentUtil.getInstance().goLogin(getActivity())) {
            showTost("您还未登录请先登录帐号！");
            return;
        }
        String obj = this.et_content.getText().toString();
        if (g2.h(obj)) {
            showTost("请输入评论/回复内容");
        } else {
            commitComment(obj);
        }
    }

    void onClickMore(View view, final BbsCommentListBean bbsCommentListBean) {
        View inflate = getLayoutInflater().inflate(R.layout.introduction_comment_list_popwin, (ViewGroup) null);
        final PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
        popupWindow.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.update();
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        popupWindow.showAtLocation(view, 0, (int) (rect.left - getResources().getDimension(R.dimen.wdp159)), rect.bottom);
        ((TextView) inflate.findViewById(R.id.tv_pop_report)).setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.introduction.IntroductionCommentListFragment.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                popupWindow.dismiss();
                IntentUtil.getInstance().goShareWebActivity(IntroductionCommentListFragment.this.getActivity(), IntroductionCommentListFragment.this.getReportUrl(bbsCommentListBean.getUid().intValue(), bbsCommentListBean.getId().intValue()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.iv_close})
    public void onClockClick() {
        if (getActivity() instanceof h) {
            ((h) getActivity()).U(this);
        }
        this.et_content.setText("");
        this.et_content.setHint("请输入评论内容");
        this.iv_back.setVisibility(8);
        this.rl_comment_list.setVisibility(0);
        this.tv_title.setText("评论");
        this.fromNotice = false;
        this.showDetail = false;
        this.rl_comment_detail.setVisibility(8);
        ItemAdapter itemAdapter = this.mItemAdapter;
        if (itemAdapter != null && itemAdapter.getData() != null) {
            this.mItemAdapter.getData().clear();
            this.mItemAdapter.notifyDataSetChanged();
        }
        ItemDetailAdapter itemDetailAdapter = this.mItemDetailAdapter;
        if (itemDetailAdapter != null) {
            itemDetailAdapter.clear();
            this.mItemDetailAdapter.notifyDataSetChanged();
        }
        ((InputMethodManager) this.et_content.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.et_content.getWindowToken(), 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (z4) {
            return;
        }
        this.page = 1;
        loadData(1);
    }

    public void onShow() {
        loadData(1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        view.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        loadData(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.relodingimag_detail})
    public void relodingimagDetail() {
        if (this.fromNotice) {
            loadDataDetailFromNotice(this.detailPage);
        } else {
            loadDataDetail(this.detailPage);
        }
    }

    public void setCommentId(int i4) {
        this.commentId = i4;
    }

    public void setDuration(int i4) {
        this.duration = i4;
    }

    public void setFragmentCallback(h hVar) {
        this.mFragmentCallback = hVar;
    }

    public void setFromNotice(boolean z4) {
        this.fromNotice = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.setNetwork_detail})
    public void setNetworkDetail() {
        UtilsMy.w3(this.context);
    }

    public void setParams(int i4, int i5, String str, String str2) {
        this.pid = i4;
        this.posterId = i5;
        this.reportUrl = str;
        this.gameId = str2;
    }

    public void setVideo(boolean z4) {
        this.isVideo = z4;
    }

    public void showCommentDetail(BbsCommentListBean bbsCommentListBean) {
        this.commentListBean = bbsCommentListBean;
        this.et_content.setText("");
        this.et_content.setHint("请输入评论内容");
        this.iv_back.setVisibility(0);
        this.rl_comment_list.setVisibility(8);
        this.rl_comment_detail.setVisibility(0);
        TextView textView = this.tv_title;
        textView.setText(bbsCommentListBean.getReplies() + "回复");
        this.detailPage = 1;
        this.commentId = bbsCommentListBean.getId().intValue();
        bbsCommentListBean.setReplay(false);
        this.mItemDetailAdapter.addData(bbsCommentListBean);
        this.showDetail = true;
        loadDataDetail(this.detailPage);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showDetail(List<BbsCommentListBean> list, boolean z4) {
        if (list != null && list.size() > 0) {
            if (z4) {
                this.mItemDetailAdapter.addData(list);
            } else {
                this.mItemDetailAdapter.addData(list);
            }
            XRecyclerView xRecyclerView = this.rv_comment_detail_list;
            if (xRecyclerView != null) {
                xRecyclerView.loadMoreComplete();
                return;
            }
            return;
        }
        this.mItemDetailAdapter.addData(list);
        XRecyclerView xRecyclerView2 = this.rv_comment_detail_list;
        if (xRecyclerView2 != null) {
            xRecyclerView2.loadMoreComplete();
            this.rv_comment_detail_list.setNoMore();
        }
        if (z4) {
            return;
        }
        showEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showEmpty() {
        View view = this.loding_layout;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.loding_faile;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        RecyclerView recyclerView = this.rv_list_data;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        LinearLayout linearLayout = this.ll_empty;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    void showLoadFailed() {
        showLoadFailed("");
    }

    void showLoadFailedDetail() {
        showLoadFailedDetail("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoadingView() {
        ItemAdapter itemAdapter = this.mItemAdapter;
        if (itemAdapter != null && itemAdapter.getItemCount() > 0) {
            RecyclerView recyclerView = this.rv_list_data;
            if (recyclerView != null && recyclerView.getVisibility() == 8) {
                this.rv_list_data.setVisibility(0);
            }
            View view = this.loding_layout;
            if (view != null && view.getVisibility() == 0) {
                this.loding_layout.setVisibility(8);
            }
        } else {
            RecyclerView recyclerView2 = this.rv_list_data;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(8);
            }
            View view2 = this.loding_layout;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        View view3 = this.loding_faile;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        LinearLayout linearLayout = this.ll_empty;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoadingViewDetail() {
        ItemDetailAdapter itemDetailAdapter = this.mItemDetailAdapter;
        if (itemDetailAdapter != null && itemDetailAdapter.getItemCount() > 0) {
            RelativeLayout relativeLayout = this.rl_comment_detail;
            if (relativeLayout != null && relativeLayout.getVisibility() == 8) {
                this.rl_comment_detail.setVisibility(0);
            }
            View view = this.loding_layout_detail;
            if (view != null && view.getVisibility() == 0) {
                this.loding_layout_detail.setVisibility(8);
            }
        } else {
            RelativeLayout relativeLayout2 = this.rl_comment_detail;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
            View view2 = this.loding_layout_detail;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        View view3 = this.loding_faile_detail;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain(List<BbsCommentListBean> list, boolean z4) {
        this.datas = list;
        if (list != null && list.size() > 0) {
            if (z4) {
                this.mItemAdapter.addData((Collection) this.datas);
            } else {
                this.mItemAdapter.setNewData(this.datas);
            }
            this.mItemAdapter.loadMoreComplete();
            return;
        }
        this.mItemAdapter.loadMoreComplete();
        this.mItemAdapter.loadMoreEnd();
        if (z4) {
            return;
        }
        showEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showNoticeDetail(List<BbsCommentListBean> list, boolean z4) {
        BbsCommentListBean bbsCommentListBean;
        if (!z4 && list != null && list.size() > 0 && (bbsCommentListBean = list.get(0)) != null) {
            TextView textView = this.tv_title;
            textView.setText(bbsCommentListBean.getReplies() + "回复");
            this.detailPage = 1;
            this.commentId = bbsCommentListBean.getId().intValue();
            bbsCommentListBean.setReplay(false);
        }
        if (list != null && list.size() > 0) {
            if (z4) {
                this.mItemDetailAdapter.addData(list);
            } else {
                this.mItemDetailAdapter.addData(list);
            }
            XRecyclerView xRecyclerView = this.rv_comment_detail_list;
            if (xRecyclerView != null) {
                xRecyclerView.loadMoreComplete();
                return;
            }
            return;
        }
        this.mItemDetailAdapter.addData(list);
        XRecyclerView xRecyclerView2 = this.rv_comment_detail_list;
        if (xRecyclerView2 != null) {
            xRecyclerView2.loadMoreComplete();
            this.rv_comment_detail_list.setNoMore();
        }
        if (z4) {
            return;
        }
        showEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showTost(String str) {
        l2.a(getActivity()).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateCommentInput() {
        this.et_content.setText("");
        this.et_content.setHint("请输入评论内容");
        showTost("评论成功，内容将在将在审核后展示");
        h hVar = this.mFragmentCallback;
        if (hVar != null) {
            hVar.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updatePraise(boolean z4, BbsCommentListBean bbsCommentListBean) {
        if (z4) {
            bbsCommentListBean.setLike(Integer.valueOf(bbsCommentListBean.getLike().intValue() + 1));
        } else {
            bbsCommentListBean.setLike(Integer.valueOf(bbsCommentListBean.getLike().intValue() - 1));
        }
        bbsCommentListBean.setPraise(Boolean.valueOf(z4));
        ItemDetailAdapter itemDetailAdapter = this.mItemDetailAdapter;
        if (itemDetailAdapter != null) {
            itemDetailAdapter.notifyDataSetChanged();
        }
        ItemAdapter itemAdapter = this.mItemAdapter;
        if (itemAdapter != null) {
            itemAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoadFailed(String str) {
        RecyclerView recyclerView = this.rv_list_data;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        View view = this.loding_layout;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.loding_faile;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoadFailedDetail(String str) {
        View view = this.loding_layout_detail;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.loding_faile_detail;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        XRecyclerView xRecyclerView = this.rv_comment_detail_list;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(8);
        }
    }
}
