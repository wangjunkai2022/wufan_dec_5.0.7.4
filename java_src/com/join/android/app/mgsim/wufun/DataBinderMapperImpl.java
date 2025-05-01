package com.join.android.app.mgsim.wufun;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.databinding.ActivityCommonZoneBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityCouponlistActivityBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityCreateSourceHopeBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityDiscountCommonBottomDialogBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailCouponBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailGiftBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailInfoBottomDialogBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityDiscountGameDetailServerBookDialogBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityEndGameSlotListBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityGameDetailCommentDataBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityNoticelistActivityBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityQuarkInstallBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityQuarkSearchResultBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityQuarkSourceHopeListBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityShareSourceBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivitySourceSaveBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivitySourceShareBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivitySourceShareDetailBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityUploadSourceHopeBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityUserrecomActivityBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ActivityVasingleGameIndexBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.BinddingLoadLayoutIncludeBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.BtHrecyclerviewGamelistLayoutBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.BtListitemBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.BtReginActivityBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.BtSelectItemBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.BtTagRecycviewLayoutBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.BtVideoItemLayoutBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.BtViewpagerLayoutBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.CouponListItemLayoutBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.DatabBtHviewlistBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.DatabGamelistLayoutBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.DatabindingHgamelistItemBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.DatabindingHtaglistItemBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.DatabindingLineLayoutBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.DatabindingTitleLayoutBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.DownloadArchiveDialogBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.EmusArchiveGameDetailListItemBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.FragmentCommentStatisticDataBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.FragmentDiscountGameDetailV2BindingImpl;
import com.join.android.app.mgsim.wufun.databinding.FragmentGameDetailCommentListBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.FragmentSourceHopeBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.FragmentSourceShareBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.GameDetailEmusCloudListLayoutDatabindingBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.GameDetailModCloudListLayoutDatabindingBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ImageShowDialogBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemCommentStatisticDataLayoutBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneAdBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneDefaultBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneGameInfoBottomBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneGameInfoBottomCardBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneGameInfoBottomCardVideoBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneGameInfoInnerBottomCardBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneTitleBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemCouponBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemCouponGameDetailBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemDetailBannerIndicatorBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailBannerPicHBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailBannerPicVBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailBannerPicVSingleBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailBannerPlaceholderBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailBannerVideoBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailDialogInfoListBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailInfoListBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailServerListBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailSimilarGameBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGiftContentBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGiftTitleBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemEndGameSlotListBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemGameCommentSpinnerLayoutBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemGameDetailCommentLayoutBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemGameDetailReleaseWelfareListBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemQuarkSearchResultBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemQuarkSourceHopeBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemSourceHopeTagBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ItemSourceShareBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ModChoiceArchiveDialogBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ModChoiceDialogItemBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ModCommentlArchiveDialogBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ModDelArchiveDialogBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ModNoticeArchiveDialogBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ModRedownArchiveDialogBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ModUploadArchiveActivityBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ModarchiveGameDetailListItemBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ModarchiveListDomain2BindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ModarchiveListDomainBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ModarchiveListItem2BindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ModarchiveListItemBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ModarchiveListLocalItem2BindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ModarchiveListLocalItemBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.ModgameCloudArchiveFragmentBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.MustplayItemLayoutBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.MustplayReginActivityBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.NoticeItemItemBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.NoticeWhiteDialogBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.RecyclerviewLayoutDatabindingBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.UnbindThridpartActivityBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.UserRecomendListitemBindingImpl;
import com.join.android.app.mgsim.wufun.databinding.VideoDbsLayoutBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final int A = 27;
    private static final int A0 = 79;
    private static final int B = 28;
    private static final int B0 = 80;
    private static final int C = 29;
    private static final int C0 = 81;
    private static final int D = 30;
    private static final int D0 = 82;
    private static final int E = 31;
    private static final int E0 = 83;
    private static final int F = 32;
    private static final int F0 = 84;
    private static final int G = 33;
    private static final int G0 = 85;
    private static final int H = 34;
    private static final int H0 = 86;
    private static final int I = 35;
    private static final int I0 = 87;
    private static final int J = 36;
    private static final int J0 = 88;
    private static final int K = 37;
    private static final int K0 = 89;
    private static final int L = 38;
    private static final int L0 = 90;
    private static final int M = 39;
    private static final int M0 = 91;
    private static final int N = 40;
    private static final int N0 = 92;
    private static final int O = 41;
    private static final int O0 = 93;
    private static final int P = 42;
    private static final int P0 = 94;
    private static final int Q = 43;
    private static final int Q0 = 95;
    private static final int R = 44;
    private static final int R0 = 96;
    private static final int S = 45;
    private static final int S0 = 97;
    private static final int T = 46;
    private static final int T0 = 98;
    private static final int U = 47;
    private static final int U0 = 99;
    private static final int V = 48;
    private static final int V0 = 100;
    private static final int W = 49;
    private static final SparseIntArray W0;
    private static final int X = 50;
    private static final int Y = 51;
    private static final int Z = 52;

    /* renamed from: a  reason: collision with root package name */
    private static final int f15533a = 1;

    /* renamed from: a0  reason: collision with root package name */
    private static final int f15534a0 = 53;

    /* renamed from: b  reason: collision with root package name */
    private static final int f15535b = 2;

    /* renamed from: b0  reason: collision with root package name */
    private static final int f15536b0 = 54;

    /* renamed from: c  reason: collision with root package name */
    private static final int f15537c = 3;

    /* renamed from: c0  reason: collision with root package name */
    private static final int f15538c0 = 55;

    /* renamed from: d  reason: collision with root package name */
    private static final int f15539d = 4;

    /* renamed from: d0  reason: collision with root package name */
    private static final int f15540d0 = 56;

    /* renamed from: e  reason: collision with root package name */
    private static final int f15541e = 5;

    /* renamed from: e0  reason: collision with root package name */
    private static final int f15542e0 = 57;

    /* renamed from: f  reason: collision with root package name */
    private static final int f15543f = 6;

    /* renamed from: f0  reason: collision with root package name */
    private static final int f15544f0 = 58;

    /* renamed from: g  reason: collision with root package name */
    private static final int f15545g = 7;

    /* renamed from: g0  reason: collision with root package name */
    private static final int f15546g0 = 59;

    /* renamed from: h  reason: collision with root package name */
    private static final int f15547h = 8;

    /* renamed from: h0  reason: collision with root package name */
    private static final int f15548h0 = 60;

    /* renamed from: i  reason: collision with root package name */
    private static final int f15549i = 9;

    /* renamed from: i0  reason: collision with root package name */
    private static final int f15550i0 = 61;

    /* renamed from: j  reason: collision with root package name */
    private static final int f15551j = 10;

    /* renamed from: j0  reason: collision with root package name */
    private static final int f15552j0 = 62;

    /* renamed from: k  reason: collision with root package name */
    private static final int f15553k = 11;

    /* renamed from: k0  reason: collision with root package name */
    private static final int f15554k0 = 63;

    /* renamed from: l  reason: collision with root package name */
    private static final int f15555l = 12;

    /* renamed from: l0  reason: collision with root package name */
    private static final int f15556l0 = 64;

    /* renamed from: m  reason: collision with root package name */
    private static final int f15557m = 13;

    /* renamed from: m0  reason: collision with root package name */
    private static final int f15558m0 = 65;

    /* renamed from: n  reason: collision with root package name */
    private static final int f15559n = 14;

    /* renamed from: n0  reason: collision with root package name */
    private static final int f15560n0 = 66;

    /* renamed from: o  reason: collision with root package name */
    private static final int f15561o = 15;

    /* renamed from: o0  reason: collision with root package name */
    private static final int f15562o0 = 67;

    /* renamed from: p  reason: collision with root package name */
    private static final int f15563p = 16;

    /* renamed from: p0  reason: collision with root package name */
    private static final int f15564p0 = 68;

    /* renamed from: q  reason: collision with root package name */
    private static final int f15565q = 17;

    /* renamed from: q0  reason: collision with root package name */
    private static final int f15566q0 = 69;

    /* renamed from: r  reason: collision with root package name */
    private static final int f15567r = 18;

    /* renamed from: r0  reason: collision with root package name */
    private static final int f15568r0 = 70;

    /* renamed from: s  reason: collision with root package name */
    private static final int f15569s = 19;

    /* renamed from: s0  reason: collision with root package name */
    private static final int f15570s0 = 71;

    /* renamed from: t  reason: collision with root package name */
    private static final int f15571t = 20;

    /* renamed from: t0  reason: collision with root package name */
    private static final int f15572t0 = 72;

    /* renamed from: u  reason: collision with root package name */
    private static final int f15573u = 21;

    /* renamed from: u0  reason: collision with root package name */
    private static final int f15574u0 = 73;

    /* renamed from: v  reason: collision with root package name */
    private static final int f15575v = 22;

    /* renamed from: v0  reason: collision with root package name */
    private static final int f15576v0 = 74;

    /* renamed from: w  reason: collision with root package name */
    private static final int f15577w = 23;

    /* renamed from: w0  reason: collision with root package name */
    private static final int f15578w0 = 75;

    /* renamed from: x  reason: collision with root package name */
    private static final int f15579x = 24;

    /* renamed from: x0  reason: collision with root package name */
    private static final int f15580x0 = 76;

    /* renamed from: y  reason: collision with root package name */
    private static final int f15581y = 25;

    /* renamed from: y0  reason: collision with root package name */
    private static final int f15582y0 = 77;

    /* renamed from: z  reason: collision with root package name */
    private static final int f15583z = 26;

    /* renamed from: z0  reason: collision with root package name */
    private static final int f15584z0 = 78;

    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final SparseArray<String> f15585a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(37);
            f15585a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "adapter");
            sparseArray.put(2, "afterTextChange");
            sparseArray.put(3, "album");
            sparseArray.put(4, "archive");
            sparseArray.put(5, "beforTextChange");
            sparseArray.put(6, "bindingData");
            sparseArray.put(7, "click");
            sparseArray.put(8, "clickListener");
            sparseArray.put(9, "data");
            sparseArray.put(10, "emusClickListener");
            sparseArray.put(11, "fragmentManager");
            sparseArray.put(12, "fragments");
            sparseArray.put(13, "isChoice");
            sparseArray.put(14, "isSelected");
            sparseArray.put(15, "isShowName");
            sparseArray.put(16, "isdiscount");
            sparseArray.put(17, "isshowWhite");
            sparseArray.put(18, "itemData");
            sparseArray.put(19, "listBean");
            sparseArray.put(20, "listener");
            sparseArray.put(21, "loadBindProxy");
            sparseArray.put(22, "message");
            sparseArray.put(23, "onClickListener");
            sparseArray.put(24, "picUrl");
            sparseArray.put(25, "picUrl1");
            sparseArray.put(26, "picUrl2");
            sparseArray.put(27, "picUrl3");
            sparseArray.put(28, "recyclerviewDatas");
            sparseArray.put(29, "recycleviewListener");
            sparseArray.put(30, "title");
            sparseArray.put(31, "titles");
            sparseArray.put(32, "videoData");
            sparseArray.put(33, "videoHelper");
            sparseArray.put(34, "viewModle");
            sparseArray.put(35, "viewPager");
            sparseArray.put(36, "vm");
        }

        private a() {
        }
    }

    /* loaded from: classes3.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        static final HashMap<String, Integer> f15586a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(100);
            f15586a = hashMap;
            hashMap.put("layout/activity_common_zone_0", Integer.valueOf((int) R.layout.activity_common_zone));
            hashMap.put("layout/activity_couponlist_activity_0", Integer.valueOf((int) R.layout.activity_couponlist_activity));
            hashMap.put("layout/activity_create_source_hope_0", Integer.valueOf((int) R.layout.activity_create_source_hope));
            hashMap.put("layout/activity_discount_common_bottom_dialog_0", Integer.valueOf((int) R.layout.activity_discount_common_bottom_dialog));
            hashMap.put("layout/activity_discount_game_detail_0", Integer.valueOf((int) R.layout.activity_discount_game_detail));
            hashMap.put("layout/activity_discount_game_detail_coupon_0", Integer.valueOf((int) R.layout.activity_discount_game_detail_coupon));
            hashMap.put("layout/activity_discount_game_detail_gift_0", Integer.valueOf((int) R.layout.activity_discount_game_detail_gift));
            hashMap.put("layout/activity_discount_game_detail_info_bottom_dialog_0", Integer.valueOf((int) R.layout.activity_discount_game_detail_info_bottom_dialog));
            hashMap.put("layout/activity_discount_game_detail_server_book_dialog_0", Integer.valueOf((int) R.layout.activity_discount_game_detail_server_book_dialog));
            hashMap.put("layout/activity_end_game_slot_list_0", Integer.valueOf((int) R.layout.activity_end_game_slot_list));
            hashMap.put("layout/activity_game_detail_comment_data_0", Integer.valueOf((int) R.layout.activity_game_detail_comment_data));
            hashMap.put("layout/activity_noticelist_activity_0", Integer.valueOf((int) R.layout.activity_noticelist_activity));
            hashMap.put("layout/activity_quark_install_0", Integer.valueOf((int) R.layout.activity_quark_install));
            hashMap.put("layout/activity_quark_search_result_0", Integer.valueOf((int) R.layout.activity_quark_search_result));
            hashMap.put("layout/activity_quark_source_hope_list_0", Integer.valueOf((int) R.layout.activity_quark_source_hope_list));
            hashMap.put("layout/activity_share_source_0", Integer.valueOf((int) R.layout.activity_share_source));
            hashMap.put("layout/activity_source_save_0", Integer.valueOf((int) R.layout.activity_source_save));
            hashMap.put("layout/activity_source_share_0", Integer.valueOf((int) R.layout.activity_source_share));
            hashMap.put("layout/activity_source_share_detail_0", Integer.valueOf((int) R.layout.activity_source_share_detail));
            hashMap.put("layout/activity_upload_source_hope_0", Integer.valueOf((int) R.layout.activity_upload_source_hope));
            hashMap.put("layout/activity_userrecom_activity_0", Integer.valueOf((int) R.layout.activity_userrecom_activity));
            hashMap.put("layout/activity_vasingle_game_index_0", Integer.valueOf((int) R.layout.activity_vasingle_game_index));
            hashMap.put("layout/bindding_load_layout_include_0", Integer.valueOf((int) R.layout.bindding_load_layout_include));
            hashMap.put("layout/bt_hrecyclerview_gamelist_layout_0", Integer.valueOf((int) R.layout.bt_hrecyclerview_gamelist_layout));
            hashMap.put("layout/bt_listitem_0", Integer.valueOf((int) R.layout.bt_listitem));
            hashMap.put("layout/bt_regin_activity_0", Integer.valueOf((int) R.layout.bt_regin_activity));
            hashMap.put("layout/bt_select_item_0", Integer.valueOf((int) R.layout.bt_select_item));
            hashMap.put("layout/bt_tag_recycview_layout_0", Integer.valueOf((int) R.layout.bt_tag_recycview_layout));
            hashMap.put("layout/bt_video_item_layout_0", Integer.valueOf((int) R.layout.bt_video_item_layout));
            hashMap.put("layout/bt_viewpager_layout_0", Integer.valueOf((int) R.layout.bt_viewpager_layout));
            hashMap.put("layout/coupon_list_item_layout_0", Integer.valueOf((int) R.layout.coupon_list_item_layout));
            hashMap.put("layout/datab_bt_hviewlist_0", Integer.valueOf((int) R.layout.datab_bt_hviewlist));
            hashMap.put("layout/datab_gamelist_layout_0", Integer.valueOf((int) R.layout.datab_gamelist_layout));
            hashMap.put("layout/databinding_hgamelist_item_0", Integer.valueOf((int) R.layout.databinding_hgamelist_item));
            hashMap.put("layout/databinding_htaglist_item_0", Integer.valueOf((int) R.layout.databinding_htaglist_item));
            hashMap.put("layout/databinding_line_layout_0", Integer.valueOf((int) R.layout.databinding_line_layout));
            hashMap.put("layout/databinding_title_layout_0", Integer.valueOf((int) R.layout.databinding_title_layout));
            hashMap.put("layout/download_archive_dialog_0", Integer.valueOf((int) R.layout.download_archive_dialog));
            hashMap.put("layout/emus_archive_game_detail_list_item_0", Integer.valueOf((int) R.layout.emus_archive_game_detail_list_item));
            hashMap.put("layout/fragment_comment_statistic_data_0", Integer.valueOf((int) R.layout.fragment_comment_statistic_data));
            hashMap.put("layout/fragment_discount_game_detail_v2_0", Integer.valueOf((int) R.layout.fragment_discount_game_detail_v2));
            hashMap.put("layout/fragment_game_detail_comment_list_0", Integer.valueOf((int) R.layout.fragment_game_detail_comment_list));
            hashMap.put("layout/fragment_source_hope_0", Integer.valueOf((int) R.layout.fragment_source_hope));
            hashMap.put("layout/fragment_source_share_0", Integer.valueOf((int) R.layout.fragment_source_share));
            hashMap.put("layout/game_detail_emus_cloud_list_layout_databinding_0", Integer.valueOf((int) R.layout.game_detail_emus_cloud_list_layout_databinding));
            hashMap.put("layout/game_detail_mod_cloud_list_layout_databinding_0", Integer.valueOf((int) R.layout.game_detail_mod_cloud_list_layout_databinding));
            hashMap.put("layout/image_show_dialog_0", Integer.valueOf((int) R.layout.image_show_dialog));
            hashMap.put("layout/item_comment_statistic_data_layout_0", Integer.valueOf((int) R.layout.item_comment_statistic_data_layout));
            hashMap.put("layout/item_common_zone_ad_0", Integer.valueOf((int) R.layout.item_common_zone_ad));
            hashMap.put("layout/item_common_zone_default_0", Integer.valueOf((int) R.layout.item_common_zone_default));
            hashMap.put("layout/item_common_zone_game_info_bottom_0", Integer.valueOf((int) R.layout.item_common_zone_game_info_bottom));
            hashMap.put("layout/item_common_zone_game_info_bottom_card_0", Integer.valueOf((int) R.layout.item_common_zone_game_info_bottom_card));
            hashMap.put("layout/item_common_zone_game_info_bottom_card_video_0", Integer.valueOf((int) R.layout.item_common_zone_game_info_bottom_card_video));
            hashMap.put("layout/item_common_zone_game_info_inner_bottom_card_0", Integer.valueOf((int) R.layout.item_common_zone_game_info_inner_bottom_card));
            hashMap.put("layout/item_common_zone_title_0", Integer.valueOf((int) R.layout.item_common_zone_title));
            hashMap.put("layout/item_coupon_0", Integer.valueOf((int) R.layout.item_coupon));
            hashMap.put("layout/item_coupon_game_detail_0", Integer.valueOf((int) R.layout.item_coupon_game_detail));
            hashMap.put("layout/item_detail_banner_indicator_0", Integer.valueOf((int) R.layout.item_detail_banner_indicator));
            hashMap.put("layout/item_discount_game_detail_banner_pic_h_0", Integer.valueOf((int) R.layout.item_discount_game_detail_banner_pic_h));
            hashMap.put("layout/item_discount_game_detail_banner_pic_v_0", Integer.valueOf((int) R.layout.item_discount_game_detail_banner_pic_v));
            hashMap.put("layout/item_discount_game_detail_banner_pic_v_single_0", Integer.valueOf((int) R.layout.item_discount_game_detail_banner_pic_v_single));
            hashMap.put("layout/item_discount_game_detail_banner_placeholder_0", Integer.valueOf((int) R.layout.item_discount_game_detail_banner_placeholder));
            hashMap.put("layout/item_discount_game_detail_banner_video_0", Integer.valueOf((int) R.layout.item_discount_game_detail_banner_video));
            hashMap.put("layout/item_discount_game_detail_dialog_info_list_0", Integer.valueOf((int) R.layout.item_discount_game_detail_dialog_info_list));
            hashMap.put("layout/item_discount_game_detail_info_list_0", Integer.valueOf((int) R.layout.item_discount_game_detail_info_list));
            hashMap.put("layout/item_discount_game_detail_server_list_0", Integer.valueOf((int) R.layout.item_discount_game_detail_server_list));
            hashMap.put("layout/item_discount_game_detail_similar_game_0", Integer.valueOf((int) R.layout.item_discount_game_detail_similar_game));
            hashMap.put("layout/item_discount_gift_content_0", Integer.valueOf((int) R.layout.item_discount_gift_content));
            hashMap.put("layout/item_discount_gift_title_0", Integer.valueOf((int) R.layout.item_discount_gift_title));
            hashMap.put("layout/item_end_game_slot_list_0", Integer.valueOf((int) R.layout.item_end_game_slot_list));
            hashMap.put("layout/item_game_comment_spinner_layout_0", Integer.valueOf((int) R.layout.item_game_comment_spinner_layout));
            hashMap.put("layout/item_game_detail_comment_layout_0", Integer.valueOf((int) R.layout.item_game_detail_comment_layout));
            hashMap.put("layout/item_game_detail_release_welfare_list_0", Integer.valueOf((int) R.layout.item_game_detail_release_welfare_list));
            hashMap.put("layout/item_quark_search_result_0", Integer.valueOf((int) R.layout.item_quark_search_result));
            hashMap.put("layout/item_quark_source_hope_0", Integer.valueOf((int) R.layout.item_quark_source_hope));
            hashMap.put("layout/item_source_hope_tag_0", Integer.valueOf((int) R.layout.item_source_hope_tag));
            hashMap.put("layout/item_source_share_0", Integer.valueOf((int) R.layout.item_source_share));
            hashMap.put("layout/mod_choice_archive_dialog_0", Integer.valueOf((int) R.layout.mod_choice_archive_dialog));
            hashMap.put("layout/mod_choice_dialog_item_0", Integer.valueOf((int) R.layout.mod_choice_dialog_item));
            hashMap.put("layout/mod_commentl_archive_dialog_0", Integer.valueOf((int) R.layout.mod_commentl_archive_dialog));
            hashMap.put("layout/mod_del_archive_dialog_0", Integer.valueOf((int) R.layout.mod_del_archive_dialog));
            hashMap.put("layout/mod_notice_archive_dialog_0", Integer.valueOf((int) R.layout.mod_notice_archive_dialog));
            hashMap.put("layout/mod_redown_archive_dialog_0", Integer.valueOf((int) R.layout.mod_redown_archive_dialog));
            hashMap.put("layout/mod_upload_archive_activity_0", Integer.valueOf((int) R.layout.mod_upload_archive_activity));
            hashMap.put("layout/modarchive_game_detail_list_item_0", Integer.valueOf((int) R.layout.modarchive_game_detail_list_item));
            hashMap.put("layout/modarchive_list_domain_0", Integer.valueOf((int) R.layout.modarchive_list_domain));
            hashMap.put("layout/modarchive_list_domain2_0", Integer.valueOf((int) R.layout.modarchive_list_domain2));
            hashMap.put("layout/modarchive_list_item_0", Integer.valueOf((int) R.layout.modarchive_list_item));
            hashMap.put("layout/modarchive_list_item2_0", Integer.valueOf((int) R.layout.modarchive_list_item2));
            hashMap.put("layout/modarchive_list_local_item_0", Integer.valueOf((int) R.layout.modarchive_list_local_item));
            hashMap.put("layout/modarchive_list_local_item2_0", Integer.valueOf((int) R.layout.modarchive_list_local_item2));
            hashMap.put("layout/modgame_cloud_archive_fragment_0", Integer.valueOf((int) R.layout.modgame_cloud_archive_fragment));
            hashMap.put("layout/mustplay_item_layout_0", Integer.valueOf((int) R.layout.mustplay_item_layout));
            hashMap.put("layout/mustplay_regin_activity_0", Integer.valueOf((int) R.layout.mustplay_regin_activity));
            hashMap.put("layout/notice_item_item_0", Integer.valueOf((int) R.layout.notice_item_item));
            hashMap.put("layout/notice_white_dialog_0", Integer.valueOf((int) R.layout.notice_white_dialog));
            hashMap.put("layout/recyclerview_layout_databinding_0", Integer.valueOf((int) R.layout.recyclerview_layout_databinding));
            hashMap.put("layout/unbind_thridpart_activity_0", Integer.valueOf((int) R.layout.unbind_thridpart_activity));
            hashMap.put("layout/user_recomend_listitem_0", Integer.valueOf((int) R.layout.user_recomend_listitem));
            hashMap.put("layout/video_dbs_layout_0", Integer.valueOf((int) R.layout.video_dbs_layout));
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(100);
        W0 = sparseIntArray;
        sparseIntArray.put(R.layout.activity_common_zone, 1);
        sparseIntArray.put(R.layout.activity_couponlist_activity, 2);
        sparseIntArray.put(R.layout.activity_create_source_hope, 3);
        sparseIntArray.put(R.layout.activity_discount_common_bottom_dialog, 4);
        sparseIntArray.put(R.layout.activity_discount_game_detail, 5);
        sparseIntArray.put(R.layout.activity_discount_game_detail_coupon, 6);
        sparseIntArray.put(R.layout.activity_discount_game_detail_gift, 7);
        sparseIntArray.put(R.layout.activity_discount_game_detail_info_bottom_dialog, 8);
        sparseIntArray.put(R.layout.activity_discount_game_detail_server_book_dialog, 9);
        sparseIntArray.put(R.layout.activity_end_game_slot_list, 10);
        sparseIntArray.put(R.layout.activity_game_detail_comment_data, 11);
        sparseIntArray.put(R.layout.activity_noticelist_activity, 12);
        sparseIntArray.put(R.layout.activity_quark_install, 13);
        sparseIntArray.put(R.layout.activity_quark_search_result, 14);
        sparseIntArray.put(R.layout.activity_quark_source_hope_list, 15);
        sparseIntArray.put(R.layout.activity_share_source, 16);
        sparseIntArray.put(R.layout.activity_source_save, 17);
        sparseIntArray.put(R.layout.activity_source_share, 18);
        sparseIntArray.put(R.layout.activity_source_share_detail, 19);
        sparseIntArray.put(R.layout.activity_upload_source_hope, 20);
        sparseIntArray.put(R.layout.activity_userrecom_activity, 21);
        sparseIntArray.put(R.layout.activity_vasingle_game_index, 22);
        sparseIntArray.put(R.layout.bindding_load_layout_include, 23);
        sparseIntArray.put(R.layout.bt_hrecyclerview_gamelist_layout, 24);
        sparseIntArray.put(R.layout.bt_listitem, 25);
        sparseIntArray.put(R.layout.bt_regin_activity, 26);
        sparseIntArray.put(R.layout.bt_select_item, 27);
        sparseIntArray.put(R.layout.bt_tag_recycview_layout, 28);
        sparseIntArray.put(R.layout.bt_video_item_layout, 29);
        sparseIntArray.put(R.layout.bt_viewpager_layout, 30);
        sparseIntArray.put(R.layout.coupon_list_item_layout, 31);
        sparseIntArray.put(R.layout.datab_bt_hviewlist, 32);
        sparseIntArray.put(R.layout.datab_gamelist_layout, 33);
        sparseIntArray.put(R.layout.databinding_hgamelist_item, 34);
        sparseIntArray.put(R.layout.databinding_htaglist_item, 35);
        sparseIntArray.put(R.layout.databinding_line_layout, 36);
        sparseIntArray.put(R.layout.databinding_title_layout, 37);
        sparseIntArray.put(R.layout.download_archive_dialog, 38);
        sparseIntArray.put(R.layout.emus_archive_game_detail_list_item, 39);
        sparseIntArray.put(R.layout.fragment_comment_statistic_data, 40);
        sparseIntArray.put(R.layout.fragment_discount_game_detail_v2, 41);
        sparseIntArray.put(R.layout.fragment_game_detail_comment_list, 42);
        sparseIntArray.put(R.layout.fragment_source_hope, 43);
        sparseIntArray.put(R.layout.fragment_source_share, 44);
        sparseIntArray.put(R.layout.game_detail_emus_cloud_list_layout_databinding, 45);
        sparseIntArray.put(R.layout.game_detail_mod_cloud_list_layout_databinding, 46);
        sparseIntArray.put(R.layout.image_show_dialog, 47);
        sparseIntArray.put(R.layout.item_comment_statistic_data_layout, 48);
        sparseIntArray.put(R.layout.item_common_zone_ad, 49);
        sparseIntArray.put(R.layout.item_common_zone_default, 50);
        sparseIntArray.put(R.layout.item_common_zone_game_info_bottom, 51);
        sparseIntArray.put(R.layout.item_common_zone_game_info_bottom_card, 52);
        sparseIntArray.put(R.layout.item_common_zone_game_info_bottom_card_video, 53);
        sparseIntArray.put(R.layout.item_common_zone_game_info_inner_bottom_card, 54);
        sparseIntArray.put(R.layout.item_common_zone_title, 55);
        sparseIntArray.put(R.layout.item_coupon, 56);
        sparseIntArray.put(R.layout.item_coupon_game_detail, 57);
        sparseIntArray.put(R.layout.item_detail_banner_indicator, 58);
        sparseIntArray.put(R.layout.item_discount_game_detail_banner_pic_h, 59);
        sparseIntArray.put(R.layout.item_discount_game_detail_banner_pic_v, 60);
        sparseIntArray.put(R.layout.item_discount_game_detail_banner_pic_v_single, 61);
        sparseIntArray.put(R.layout.item_discount_game_detail_banner_placeholder, 62);
        sparseIntArray.put(R.layout.item_discount_game_detail_banner_video, 63);
        sparseIntArray.put(R.layout.item_discount_game_detail_dialog_info_list, 64);
        sparseIntArray.put(R.layout.item_discount_game_detail_info_list, 65);
        sparseIntArray.put(R.layout.item_discount_game_detail_server_list, 66);
        sparseIntArray.put(R.layout.item_discount_game_detail_similar_game, 67);
        sparseIntArray.put(R.layout.item_discount_gift_content, 68);
        sparseIntArray.put(R.layout.item_discount_gift_title, 69);
        sparseIntArray.put(R.layout.item_end_game_slot_list, 70);
        sparseIntArray.put(R.layout.item_game_comment_spinner_layout, 71);
        sparseIntArray.put(R.layout.item_game_detail_comment_layout, 72);
        sparseIntArray.put(R.layout.item_game_detail_release_welfare_list, 73);
        sparseIntArray.put(R.layout.item_quark_search_result, 74);
        sparseIntArray.put(R.layout.item_quark_source_hope, 75);
        sparseIntArray.put(R.layout.item_source_hope_tag, 76);
        sparseIntArray.put(R.layout.item_source_share, 77);
        sparseIntArray.put(R.layout.mod_choice_archive_dialog, 78);
        sparseIntArray.put(R.layout.mod_choice_dialog_item, 79);
        sparseIntArray.put(R.layout.mod_commentl_archive_dialog, 80);
        sparseIntArray.put(R.layout.mod_del_archive_dialog, 81);
        sparseIntArray.put(R.layout.mod_notice_archive_dialog, 82);
        sparseIntArray.put(R.layout.mod_redown_archive_dialog, 83);
        sparseIntArray.put(R.layout.mod_upload_archive_activity, 84);
        sparseIntArray.put(R.layout.modarchive_game_detail_list_item, 85);
        sparseIntArray.put(R.layout.modarchive_list_domain, 86);
        sparseIntArray.put(R.layout.modarchive_list_domain2, 87);
        sparseIntArray.put(R.layout.modarchive_list_item, 88);
        sparseIntArray.put(R.layout.modarchive_list_item2, 89);
        sparseIntArray.put(R.layout.modarchive_list_local_item, 90);
        sparseIntArray.put(R.layout.modarchive_list_local_item2, 91);
        sparseIntArray.put(R.layout.modgame_cloud_archive_fragment, 92);
        sparseIntArray.put(R.layout.mustplay_item_layout, 93);
        sparseIntArray.put(R.layout.mustplay_regin_activity, 94);
        sparseIntArray.put(R.layout.notice_item_item, 95);
        sparseIntArray.put(R.layout.notice_white_dialog, 96);
        sparseIntArray.put(R.layout.recyclerview_layout_databinding, 97);
        sparseIntArray.put(R.layout.unbind_thridpart_activity, 98);
        sparseIntArray.put(R.layout.user_recomend_listitem, 99);
        sparseIntArray.put(R.layout.video_dbs_layout, 100);
    }

    private final ViewDataBinding a(DataBindingComponent dataBindingComponent, View view, int i4, Object obj) {
        switch (i4) {
            case 1:
                if ("layout/activity_common_zone_0".equals(obj)) {
                    return new ActivityCommonZoneBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_common_zone is invalid. Received: " + obj);
            case 2:
                if ("layout/activity_couponlist_activity_0".equals(obj)) {
                    return new ActivityCouponlistActivityBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_couponlist_activity is invalid. Received: " + obj);
            case 3:
                if ("layout/activity_create_source_hope_0".equals(obj)) {
                    return new ActivityCreateSourceHopeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_create_source_hope is invalid. Received: " + obj);
            case 4:
                if ("layout/activity_discount_common_bottom_dialog_0".equals(obj)) {
                    return new ActivityDiscountCommonBottomDialogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_discount_common_bottom_dialog is invalid. Received: " + obj);
            case 5:
                if ("layout/activity_discount_game_detail_0".equals(obj)) {
                    return new ActivityDiscountGameDetailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_discount_game_detail is invalid. Received: " + obj);
            case 6:
                if ("layout/activity_discount_game_detail_coupon_0".equals(obj)) {
                    return new ActivityDiscountGameDetailCouponBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_discount_game_detail_coupon is invalid. Received: " + obj);
            case 7:
                if ("layout/activity_discount_game_detail_gift_0".equals(obj)) {
                    return new ActivityDiscountGameDetailGiftBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_discount_game_detail_gift is invalid. Received: " + obj);
            case 8:
                if ("layout/activity_discount_game_detail_info_bottom_dialog_0".equals(obj)) {
                    return new ActivityDiscountGameDetailInfoBottomDialogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_discount_game_detail_info_bottom_dialog is invalid. Received: " + obj);
            case 9:
                if ("layout/activity_discount_game_detail_server_book_dialog_0".equals(obj)) {
                    return new ActivityDiscountGameDetailServerBookDialogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_discount_game_detail_server_book_dialog is invalid. Received: " + obj);
            case 10:
                if ("layout/activity_end_game_slot_list_0".equals(obj)) {
                    return new ActivityEndGameSlotListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_end_game_slot_list is invalid. Received: " + obj);
            case 11:
                if ("layout/activity_game_detail_comment_data_0".equals(obj)) {
                    return new ActivityGameDetailCommentDataBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_game_detail_comment_data is invalid. Received: " + obj);
            case 12:
                if ("layout/activity_noticelist_activity_0".equals(obj)) {
                    return new ActivityNoticelistActivityBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_noticelist_activity is invalid. Received: " + obj);
            case 13:
                if ("layout/activity_quark_install_0".equals(obj)) {
                    return new ActivityQuarkInstallBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_quark_install is invalid. Received: " + obj);
            case 14:
                if ("layout/activity_quark_search_result_0".equals(obj)) {
                    return new ActivityQuarkSearchResultBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_quark_search_result is invalid. Received: " + obj);
            case 15:
                if ("layout/activity_quark_source_hope_list_0".equals(obj)) {
                    return new ActivityQuarkSourceHopeListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_quark_source_hope_list is invalid. Received: " + obj);
            case 16:
                if ("layout/activity_share_source_0".equals(obj)) {
                    return new ActivityShareSourceBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_share_source is invalid. Received: " + obj);
            case 17:
                if ("layout/activity_source_save_0".equals(obj)) {
                    return new ActivitySourceSaveBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_source_save is invalid. Received: " + obj);
            case 18:
                if ("layout/activity_source_share_0".equals(obj)) {
                    return new ActivitySourceShareBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_source_share is invalid. Received: " + obj);
            case 19:
                if ("layout/activity_source_share_detail_0".equals(obj)) {
                    return new ActivitySourceShareDetailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_source_share_detail is invalid. Received: " + obj);
            case 20:
                if ("layout/activity_upload_source_hope_0".equals(obj)) {
                    return new ActivityUploadSourceHopeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_upload_source_hope is invalid. Received: " + obj);
            case 21:
                if ("layout/activity_userrecom_activity_0".equals(obj)) {
                    return new ActivityUserrecomActivityBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_userrecom_activity is invalid. Received: " + obj);
            case 22:
                if ("layout/activity_vasingle_game_index_0".equals(obj)) {
                    return new ActivityVasingleGameIndexBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_vasingle_game_index is invalid. Received: " + obj);
            case 23:
                if ("layout/bindding_load_layout_include_0".equals(obj)) {
                    return new BinddingLoadLayoutIncludeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bindding_load_layout_include is invalid. Received: " + obj);
            case 24:
                if ("layout/bt_hrecyclerview_gamelist_layout_0".equals(obj)) {
                    return new BtHrecyclerviewGamelistLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bt_hrecyclerview_gamelist_layout is invalid. Received: " + obj);
            case 25:
                if ("layout/bt_listitem_0".equals(obj)) {
                    return new BtListitemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bt_listitem is invalid. Received: " + obj);
            case 26:
                if ("layout/bt_regin_activity_0".equals(obj)) {
                    return new BtReginActivityBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bt_regin_activity is invalid. Received: " + obj);
            case 27:
                if ("layout/bt_select_item_0".equals(obj)) {
                    return new BtSelectItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bt_select_item is invalid. Received: " + obj);
            case 28:
                if ("layout/bt_tag_recycview_layout_0".equals(obj)) {
                    return new BtTagRecycviewLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bt_tag_recycview_layout is invalid. Received: " + obj);
            case 29:
                if ("layout/bt_video_item_layout_0".equals(obj)) {
                    return new BtVideoItemLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bt_video_item_layout is invalid. Received: " + obj);
            case 30:
                if ("layout/bt_viewpager_layout_0".equals(obj)) {
                    return new BtViewpagerLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bt_viewpager_layout is invalid. Received: " + obj);
            case 31:
                if ("layout/coupon_list_item_layout_0".equals(obj)) {
                    return new CouponListItemLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for coupon_list_item_layout is invalid. Received: " + obj);
            case 32:
                if ("layout/datab_bt_hviewlist_0".equals(obj)) {
                    return new DatabBtHviewlistBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for datab_bt_hviewlist is invalid. Received: " + obj);
            case 33:
                if ("layout/datab_gamelist_layout_0".equals(obj)) {
                    return new DatabGamelistLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for datab_gamelist_layout is invalid. Received: " + obj);
            case 34:
                if ("layout/databinding_hgamelist_item_0".equals(obj)) {
                    return new DatabindingHgamelistItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for databinding_hgamelist_item is invalid. Received: " + obj);
            case 35:
                if ("layout/databinding_htaglist_item_0".equals(obj)) {
                    return new DatabindingHtaglistItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for databinding_htaglist_item is invalid. Received: " + obj);
            case 36:
                if ("layout/databinding_line_layout_0".equals(obj)) {
                    return new DatabindingLineLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for databinding_line_layout is invalid. Received: " + obj);
            case 37:
                if ("layout/databinding_title_layout_0".equals(obj)) {
                    return new DatabindingTitleLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for databinding_title_layout is invalid. Received: " + obj);
            case 38:
                if ("layout/download_archive_dialog_0".equals(obj)) {
                    return new DownloadArchiveDialogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for download_archive_dialog is invalid. Received: " + obj);
            case 39:
                if ("layout/emus_archive_game_detail_list_item_0".equals(obj)) {
                    return new EmusArchiveGameDetailListItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for emus_archive_game_detail_list_item is invalid. Received: " + obj);
            case 40:
                if ("layout/fragment_comment_statistic_data_0".equals(obj)) {
                    return new FragmentCommentStatisticDataBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_comment_statistic_data is invalid. Received: " + obj);
            case 41:
                if ("layout/fragment_discount_game_detail_v2_0".equals(obj)) {
                    return new FragmentDiscountGameDetailV2BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_discount_game_detail_v2 is invalid. Received: " + obj);
            case 42:
                if ("layout/fragment_game_detail_comment_list_0".equals(obj)) {
                    return new FragmentGameDetailCommentListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_game_detail_comment_list is invalid. Received: " + obj);
            case 43:
                if ("layout/fragment_source_hope_0".equals(obj)) {
                    return new FragmentSourceHopeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_source_hope is invalid. Received: " + obj);
            case 44:
                if ("layout/fragment_source_share_0".equals(obj)) {
                    return new FragmentSourceShareBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_source_share is invalid. Received: " + obj);
            case 45:
                if ("layout/game_detail_emus_cloud_list_layout_databinding_0".equals(obj)) {
                    return new GameDetailEmusCloudListLayoutDatabindingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for game_detail_emus_cloud_list_layout_databinding is invalid. Received: " + obj);
            case 46:
                if ("layout/game_detail_mod_cloud_list_layout_databinding_0".equals(obj)) {
                    return new GameDetailModCloudListLayoutDatabindingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for game_detail_mod_cloud_list_layout_databinding is invalid. Received: " + obj);
            case 47:
                if ("layout/image_show_dialog_0".equals(obj)) {
                    return new ImageShowDialogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for image_show_dialog is invalid. Received: " + obj);
            case 48:
                if ("layout/item_comment_statistic_data_layout_0".equals(obj)) {
                    return new ItemCommentStatisticDataLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_comment_statistic_data_layout is invalid. Received: " + obj);
            case 49:
                if ("layout/item_common_zone_ad_0".equals(obj)) {
                    return new ItemCommonZoneAdBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_common_zone_ad is invalid. Received: " + obj);
            case 50:
                if ("layout/item_common_zone_default_0".equals(obj)) {
                    return new ItemCommonZoneDefaultBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_common_zone_default is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i4, Object obj) {
        switch (i4) {
            case 51:
                if ("layout/item_common_zone_game_info_bottom_0".equals(obj)) {
                    return new ItemCommonZoneGameInfoBottomBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_common_zone_game_info_bottom is invalid. Received: " + obj);
            case 52:
                if ("layout/item_common_zone_game_info_bottom_card_0".equals(obj)) {
                    return new ItemCommonZoneGameInfoBottomCardBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_common_zone_game_info_bottom_card is invalid. Received: " + obj);
            case 53:
                if ("layout/item_common_zone_game_info_bottom_card_video_0".equals(obj)) {
                    return new ItemCommonZoneGameInfoBottomCardVideoBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_common_zone_game_info_bottom_card_video is invalid. Received: " + obj);
            case 54:
                if ("layout/item_common_zone_game_info_inner_bottom_card_0".equals(obj)) {
                    return new ItemCommonZoneGameInfoInnerBottomCardBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_common_zone_game_info_inner_bottom_card is invalid. Received: " + obj);
            case 55:
                if ("layout/item_common_zone_title_0".equals(obj)) {
                    return new ItemCommonZoneTitleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_common_zone_title is invalid. Received: " + obj);
            case 56:
                if ("layout/item_coupon_0".equals(obj)) {
                    return new ItemCouponBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_coupon is invalid. Received: " + obj);
            case 57:
                if ("layout/item_coupon_game_detail_0".equals(obj)) {
                    return new ItemCouponGameDetailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_coupon_game_detail is invalid. Received: " + obj);
            case 58:
                if ("layout/item_detail_banner_indicator_0".equals(obj)) {
                    return new ItemDetailBannerIndicatorBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_detail_banner_indicator is invalid. Received: " + obj);
            case 59:
                if ("layout/item_discount_game_detail_banner_pic_h_0".equals(obj)) {
                    return new ItemDiscountGameDetailBannerPicHBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_discount_game_detail_banner_pic_h is invalid. Received: " + obj);
            case 60:
                if ("layout/item_discount_game_detail_banner_pic_v_0".equals(obj)) {
                    return new ItemDiscountGameDetailBannerPicVBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_discount_game_detail_banner_pic_v is invalid. Received: " + obj);
            case 61:
                if ("layout/item_discount_game_detail_banner_pic_v_single_0".equals(obj)) {
                    return new ItemDiscountGameDetailBannerPicVSingleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_discount_game_detail_banner_pic_v_single is invalid. Received: " + obj);
            case 62:
                if ("layout/item_discount_game_detail_banner_placeholder_0".equals(obj)) {
                    return new ItemDiscountGameDetailBannerPlaceholderBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_discount_game_detail_banner_placeholder is invalid. Received: " + obj);
            case 63:
                if ("layout/item_discount_game_detail_banner_video_0".equals(obj)) {
                    return new ItemDiscountGameDetailBannerVideoBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_discount_game_detail_banner_video is invalid. Received: " + obj);
            case 64:
                if ("layout/item_discount_game_detail_dialog_info_list_0".equals(obj)) {
                    return new ItemDiscountGameDetailDialogInfoListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_discount_game_detail_dialog_info_list is invalid. Received: " + obj);
            case 65:
                if ("layout/item_discount_game_detail_info_list_0".equals(obj)) {
                    return new ItemDiscountGameDetailInfoListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_discount_game_detail_info_list is invalid. Received: " + obj);
            case 66:
                if ("layout/item_discount_game_detail_server_list_0".equals(obj)) {
                    return new ItemDiscountGameDetailServerListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_discount_game_detail_server_list is invalid. Received: " + obj);
            case 67:
                if ("layout/item_discount_game_detail_similar_game_0".equals(obj)) {
                    return new ItemDiscountGameDetailSimilarGameBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_discount_game_detail_similar_game is invalid. Received: " + obj);
            case 68:
                if ("layout/item_discount_gift_content_0".equals(obj)) {
                    return new ItemDiscountGiftContentBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_discount_gift_content is invalid. Received: " + obj);
            case 69:
                if ("layout/item_discount_gift_title_0".equals(obj)) {
                    return new ItemDiscountGiftTitleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_discount_gift_title is invalid. Received: " + obj);
            case 70:
                if ("layout/item_end_game_slot_list_0".equals(obj)) {
                    return new ItemEndGameSlotListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_end_game_slot_list is invalid. Received: " + obj);
            case 71:
                if ("layout/item_game_comment_spinner_layout_0".equals(obj)) {
                    return new ItemGameCommentSpinnerLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_game_comment_spinner_layout is invalid. Received: " + obj);
            case 72:
                if ("layout/item_game_detail_comment_layout_0".equals(obj)) {
                    return new ItemGameDetailCommentLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_game_detail_comment_layout is invalid. Received: " + obj);
            case 73:
                if ("layout/item_game_detail_release_welfare_list_0".equals(obj)) {
                    return new ItemGameDetailReleaseWelfareListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_game_detail_release_welfare_list is invalid. Received: " + obj);
            case 74:
                if ("layout/item_quark_search_result_0".equals(obj)) {
                    return new ItemQuarkSearchResultBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_quark_search_result is invalid. Received: " + obj);
            case 75:
                if ("layout/item_quark_source_hope_0".equals(obj)) {
                    return new ItemQuarkSourceHopeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_quark_source_hope is invalid. Received: " + obj);
            case 76:
                if ("layout/item_source_hope_tag_0".equals(obj)) {
                    return new ItemSourceHopeTagBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_source_hope_tag is invalid. Received: " + obj);
            case 77:
                if ("layout/item_source_share_0".equals(obj)) {
                    return new ItemSourceShareBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_source_share is invalid. Received: " + obj);
            case 78:
                if ("layout/mod_choice_archive_dialog_0".equals(obj)) {
                    return new ModChoiceArchiveDialogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for mod_choice_archive_dialog is invalid. Received: " + obj);
            case 79:
                if ("layout/mod_choice_dialog_item_0".equals(obj)) {
                    return new ModChoiceDialogItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for mod_choice_dialog_item is invalid. Received: " + obj);
            case 80:
                if ("layout/mod_commentl_archive_dialog_0".equals(obj)) {
                    return new ModCommentlArchiveDialogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for mod_commentl_archive_dialog is invalid. Received: " + obj);
            case 81:
                if ("layout/mod_del_archive_dialog_0".equals(obj)) {
                    return new ModDelArchiveDialogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for mod_del_archive_dialog is invalid. Received: " + obj);
            case 82:
                if ("layout/mod_notice_archive_dialog_0".equals(obj)) {
                    return new ModNoticeArchiveDialogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for mod_notice_archive_dialog is invalid. Received: " + obj);
            case 83:
                if ("layout/mod_redown_archive_dialog_0".equals(obj)) {
                    return new ModRedownArchiveDialogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for mod_redown_archive_dialog is invalid. Received: " + obj);
            case 84:
                if ("layout/mod_upload_archive_activity_0".equals(obj)) {
                    return new ModUploadArchiveActivityBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for mod_upload_archive_activity is invalid. Received: " + obj);
            case 85:
                if ("layout/modarchive_game_detail_list_item_0".equals(obj)) {
                    return new ModarchiveGameDetailListItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for modarchive_game_detail_list_item is invalid. Received: " + obj);
            case 86:
                if ("layout/modarchive_list_domain_0".equals(obj)) {
                    return new ModarchiveListDomainBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for modarchive_list_domain is invalid. Received: " + obj);
            case 87:
                if ("layout/modarchive_list_domain2_0".equals(obj)) {
                    return new ModarchiveListDomain2BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for modarchive_list_domain2 is invalid. Received: " + obj);
            case 88:
                if ("layout/modarchive_list_item_0".equals(obj)) {
                    return new ModarchiveListItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for modarchive_list_item is invalid. Received: " + obj);
            case 89:
                if ("layout/modarchive_list_item2_0".equals(obj)) {
                    return new ModarchiveListItem2BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for modarchive_list_item2 is invalid. Received: " + obj);
            case 90:
                if ("layout/modarchive_list_local_item_0".equals(obj)) {
                    return new ModarchiveListLocalItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for modarchive_list_local_item is invalid. Received: " + obj);
            case 91:
                if ("layout/modarchive_list_local_item2_0".equals(obj)) {
                    return new ModarchiveListLocalItem2BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for modarchive_list_local_item2 is invalid. Received: " + obj);
            case 92:
                if ("layout/modgame_cloud_archive_fragment_0".equals(obj)) {
                    return new ModgameCloudArchiveFragmentBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for modgame_cloud_archive_fragment is invalid. Received: " + obj);
            case 93:
                if ("layout/mustplay_item_layout_0".equals(obj)) {
                    return new MustplayItemLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for mustplay_item_layout is invalid. Received: " + obj);
            case 94:
                if ("layout/mustplay_regin_activity_0".equals(obj)) {
                    return new MustplayReginActivityBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for mustplay_regin_activity is invalid. Received: " + obj);
            case 95:
                if ("layout/notice_item_item_0".equals(obj)) {
                    return new NoticeItemItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for notice_item_item is invalid. Received: " + obj);
            case 96:
                if ("layout/notice_white_dialog_0".equals(obj)) {
                    return new NoticeWhiteDialogBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for notice_white_dialog is invalid. Received: " + obj);
            case 97:
                if ("layout/recyclerview_layout_databinding_0".equals(obj)) {
                    return new RecyclerviewLayoutDatabindingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for recyclerview_layout_databinding is invalid. Received: " + obj);
            case 98:
                if ("layout/unbind_thridpart_activity_0".equals(obj)) {
                    return new UnbindThridpartActivityBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for unbind_thridpart_activity is invalid. Received: " + obj);
            case 99:
                if ("layout/user_recomend_listitem_0".equals(obj)) {
                    return new UserRecomendListitemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for user_recomend_listitem is invalid. Received: " + obj);
            case 100:
                if ("layout/video_dbs_layout_0".equals(obj)) {
                    return new VideoDbsLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for video_dbs_layout is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i4) {
        return a.f15585a.get(i4);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i4) {
        int i5 = W0.get(i4);
        if (i5 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                int i6 = (i5 - 1) / 50;
                if (i6 != 0) {
                    if (i6 != 1) {
                        return null;
                    }
                    return b(dataBindingComponent, view, i5, tag);
                }
                return a(dataBindingComponent, view, i5, tag);
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f15586a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i4) {
        if (viewArr == null || viewArr.length == 0 || W0.get(i4) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
