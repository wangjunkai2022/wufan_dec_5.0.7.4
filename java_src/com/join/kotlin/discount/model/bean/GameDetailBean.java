package com.join.kotlin.discount.model.bean;

import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.DownloadPointBase;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailBean.kt */
/* loaded from: classes3.dex */
public final class GameDetailBean extends DownloadPointBase {
    @Nullable
    private List<? extends CommonGameInfoBean> ad;
    @Nullable
    private GameDetailBasicInfoBean basic_info;
    @Nullable
    private List<String> benefits;
    @Nullable
    private GameDetailBookingInfoBean booking_info;
    @Nullable
    private String comment_number;
    @Nullable
    private CommonComponentBean coupon_info;
    @Nullable
    private String game_icon;
    @Nullable
    private String game_id;
    @Nullable
    private String game_name;
    @Nullable
    private GameDetailNoticeBean game_notice_info;
    @Nullable
    private GameServerInfoBean game_server_info;
    @Nullable
    private CommonComponentBean gift_info;
    @Nullable
    private Integer has648;
    @Nullable
    private GameDetailPicAndVideoInfoBean pic_video_info;
    @Nullable
    private Integer recycle_number;
    @Nullable
    private Integer sell_number;
    @Nullable
    private List<SimilarGameBean> similarity_game_names;
    @Nullable
    private List<StreamingGameTagBean> sub_titles;
    @Nullable
    private String tagName;
    @Nullable
    private String top_bg_color;
    @Nullable
    private String trading_number;
    @Nullable
    private List<GameDetailSubAccountBean> transaction_info;

    public GameDetailBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    public /* synthetic */ GameDetailBean(GameDetailBasicInfoBean gameDetailBasicInfoBean, GameDetailBookingInfoBean gameDetailBookingInfoBean, CommonComponentBean commonComponentBean, String str, String str2, String str3, CommonComponentBean commonComponentBean2, GameDetailPicAndVideoInfoBean gameDetailPicAndVideoInfoBean, GameDetailNoticeBean gameDetailNoticeBean, GameServerInfoBean gameServerInfoBean, List list, List list2, Integer num, List list3, List list4, List list5, String str4, String str5, String str6, Integer num2, Integer num3, String str7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : gameDetailBasicInfoBean, (i4 & 2) != 0 ? null : gameDetailBookingInfoBean, (i4 & 4) != 0 ? null : commonComponentBean, (i4 & 8) != 0 ? "" : str, (i4 & 16) != 0 ? "" : str2, (i4 & 32) != 0 ? "" : str3, (i4 & 64) != 0 ? null : commonComponentBean2, (i4 & 128) != 0 ? null : gameDetailPicAndVideoInfoBean, (i4 & 256) != 0 ? null : gameDetailNoticeBean, (i4 & 512) != 0 ? null : gameServerInfoBean, (i4 & 1024) != 0 ? null : list, (i4 & 2048) != 0 ? null : list2, (i4 & 4096) != 0 ? 0 : num, (i4 & 8192) != 0 ? null : list3, (i4 & 16384) != 0 ? null : list4, (i4 & 32768) != 0 ? null : list5, (i4 & 65536) != 0 ? "" : str4, (i4 & 131072) != 0 ? "" : str5, (i4 & 262144) != 0 ? "" : str6, (i4 & 524288) != 0 ? 0 : num2, (i4 & 1048576) != 0 ? 0 : num3, (i4 & 2097152) != 0 ? "" : str7);
    }

    @NotNull
    public final String activeNoticeCountStr() {
        GameDetailNoticeBean gameDetailNoticeBean = this.game_notice_info;
        if (gameDetailNoticeBean != null) {
            String activeNoticeCount = gameDetailNoticeBean != null ? gameDetailNoticeBean.getActiveNoticeCount() : null;
            if (!(activeNoticeCount == null || activeNoticeCount.length() == 0)) {
                GameDetailNoticeBean gameDetailNoticeBean2 = this.game_notice_info;
                return String.valueOf(gameDetailNoticeBean2 != null ? gameDetailNoticeBean2.getActiveNoticeCount() : null);
            }
        }
        return "0";
    }

    @Nullable
    public final GameDetailBasicInfoBean component1() {
        return this.basic_info;
    }

    @Nullable
    public final GameServerInfoBean component10() {
        return this.game_server_info;
    }

    @Nullable
    public final List<GameDetailSubAccountBean> component11() {
        return this.transaction_info;
    }

    @Nullable
    public final List<String> component12() {
        return this.benefits;
    }

    @Nullable
    public final Integer component13() {
        return this.has648;
    }

    @Nullable
    public final List<CommonGameInfoBean> component14() {
        return this.ad;
    }

    @Nullable
    public final List<StreamingGameTagBean> component15() {
        return this.sub_titles;
    }

    @Nullable
    public final List<SimilarGameBean> component16() {
        return this.similarity_game_names;
    }

    @Nullable
    public final String component17() {
        return this.comment_number;
    }

    @Nullable
    public final String component18() {
        return this.trading_number;
    }

    @Nullable
    public final String component19() {
        return this.top_bg_color;
    }

    @Nullable
    public final GameDetailBookingInfoBean component2() {
        return this.booking_info;
    }

    @Nullable
    public final Integer component20() {
        return this.recycle_number;
    }

    @Nullable
    public final Integer component21() {
        return this.sell_number;
    }

    @Nullable
    public final String component22() {
        return this.tagName;
    }

    @Nullable
    public final CommonComponentBean component3() {
        return this.coupon_info;
    }

    @Nullable
    public final String component4() {
        return this.game_icon;
    }

    @Nullable
    public final String component5() {
        return this.game_id;
    }

    @Nullable
    public final String component6() {
        return this.game_name;
    }

    @Nullable
    public final CommonComponentBean component7() {
        return this.gift_info;
    }

    @Nullable
    public final GameDetailPicAndVideoInfoBean component8() {
        return this.pic_video_info;
    }

    @Nullable
    public final GameDetailNoticeBean component9() {
        return this.game_notice_info;
    }

    @NotNull
    public final GameDetailBean copy(@Nullable GameDetailBasicInfoBean gameDetailBasicInfoBean, @Nullable GameDetailBookingInfoBean gameDetailBookingInfoBean, @Nullable CommonComponentBean commonComponentBean, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable CommonComponentBean commonComponentBean2, @Nullable GameDetailPicAndVideoInfoBean gameDetailPicAndVideoInfoBean, @Nullable GameDetailNoticeBean gameDetailNoticeBean, @Nullable GameServerInfoBean gameServerInfoBean, @Nullable List<GameDetailSubAccountBean> list, @Nullable List<String> list2, @Nullable Integer num, @Nullable List<? extends CommonGameInfoBean> list3, @Nullable List<StreamingGameTagBean> list4, @Nullable List<SimilarGameBean> list5, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str7) {
        return new GameDetailBean(gameDetailBasicInfoBean, gameDetailBookingInfoBean, commonComponentBean, str, str2, str3, commonComponentBean2, gameDetailPicAndVideoInfoBean, gameDetailNoticeBean, gameServerInfoBean, list, list2, num, list3, list4, list5, str4, str5, str6, num2, num3, str7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameDetailBean) {
            GameDetailBean gameDetailBean = (GameDetailBean) obj;
            return Intrinsics.areEqual(this.basic_info, gameDetailBean.basic_info) && Intrinsics.areEqual(this.booking_info, gameDetailBean.booking_info) && Intrinsics.areEqual(this.coupon_info, gameDetailBean.coupon_info) && Intrinsics.areEqual(this.game_icon, gameDetailBean.game_icon) && Intrinsics.areEqual(this.game_id, gameDetailBean.game_id) && Intrinsics.areEqual(this.game_name, gameDetailBean.game_name) && Intrinsics.areEqual(this.gift_info, gameDetailBean.gift_info) && Intrinsics.areEqual(this.pic_video_info, gameDetailBean.pic_video_info) && Intrinsics.areEqual(this.game_notice_info, gameDetailBean.game_notice_info) && Intrinsics.areEqual(this.game_server_info, gameDetailBean.game_server_info) && Intrinsics.areEqual(this.transaction_info, gameDetailBean.transaction_info) && Intrinsics.areEqual(this.benefits, gameDetailBean.benefits) && Intrinsics.areEqual(this.has648, gameDetailBean.has648) && Intrinsics.areEqual(this.ad, gameDetailBean.ad) && Intrinsics.areEqual(this.sub_titles, gameDetailBean.sub_titles) && Intrinsics.areEqual(this.similarity_game_names, gameDetailBean.similarity_game_names) && Intrinsics.areEqual(this.comment_number, gameDetailBean.comment_number) && Intrinsics.areEqual(this.trading_number, gameDetailBean.trading_number) && Intrinsics.areEqual(this.top_bg_color, gameDetailBean.top_bg_color) && Intrinsics.areEqual(this.recycle_number, gameDetailBean.recycle_number) && Intrinsics.areEqual(this.sell_number, gameDetailBean.sell_number) && Intrinsics.areEqual(this.tagName, gameDetailBean.tagName);
        }
        return false;
    }

    @Nullable
    public final List<CommonGameInfoBean> getAd() {
        return this.ad;
    }

    @Nullable
    public final GameDetailBasicInfoBean getBasic_info() {
        return this.basic_info;
    }

    @Nullable
    public final List<String> getBenefits() {
        return this.benefits;
    }

    @Nullable
    public final GameDetailBookingInfoBean getBooking_info() {
        return this.booking_info;
    }

    @Nullable
    public final String getComment_number() {
        return this.comment_number;
    }

    @Nullable
    public final CommonComponentBean getCoupon_info() {
        return this.coupon_info;
    }

    @Nullable
    public final String getGame_icon() {
        return this.game_icon;
    }

    @Nullable
    public final String getGame_id() {
        return this.game_id;
    }

    @Nullable
    public final String getGame_name() {
        return this.game_name;
    }

    @Nullable
    public final GameDetailNoticeBean getGame_notice_info() {
        return this.game_notice_info;
    }

    @Nullable
    public final GameServerInfoBean getGame_server_info() {
        return this.game_server_info;
    }

    @Nullable
    public final CommonComponentBean getGift_info() {
        return this.gift_info;
    }

    @Nullable
    public final Integer getHas648() {
        return this.has648;
    }

    @Nullable
    public final GameDetailPicAndVideoInfoBean getPic_video_info() {
        return this.pic_video_info;
    }

    @Nullable
    public final Integer getRecycle_number() {
        return this.recycle_number;
    }

    @Nullable
    public final Integer getSell_number() {
        return this.sell_number;
    }

    @Nullable
    public final List<SimilarGameBean> getSimilarity_game_names() {
        return this.similarity_game_names;
    }

    @Nullable
    public final List<StreamingGameTagBean> getSub_titles() {
        return this.sub_titles;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: Exception -> 0x0075, TryCatch #0 {Exception -> 0x0075, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x0015, B:14:0x0019, B:16:0x001f, B:18:0x0023, B:20:0x0027, B:23:0x0031, B:25:0x0035, B:27:0x003d, B:32:0x0046, B:35:0x004c, B:37:0x0052, B:41:0x005b, B:43:0x005f, B:45:0x0065, B:47:0x006d), top: B:53:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getTagForAppDl(int r7) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            java.util.List<com.join.kotlin.discount.model.bean.StreamingGameTagBean> r1 = r6.sub_titles     // Catch: java.lang.Exception -> L75
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L11
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Exception -> L75
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            goto L12
        L11:
            r1 = 1
        L12:
            r4 = 0
            if (r1 != 0) goto L46
            java.util.List<com.join.kotlin.discount.model.bean.StreamingGameTagBean> r1 = r6.sub_titles     // Catch: java.lang.Exception -> L75
            if (r1 == 0) goto L1e
            int r1 = r1.size()     // Catch: java.lang.Exception -> L75
            goto L1f
        L1e:
            r1 = 0
        L1f:
            int r5 = r7 + 1
            if (r1 < r5) goto L46
            java.util.List<com.join.kotlin.discount.model.bean.StreamingGameTagBean> r1 = r6.sub_titles     // Catch: java.lang.Exception -> L75
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Exception -> L75
            com.join.kotlin.discount.model.bean.StreamingGameTagBean r1 = (com.join.kotlin.discount.model.bean.StreamingGameTagBean) r1     // Catch: java.lang.Exception -> L75
            goto L2f
        L2e:
            r1 = r4
        L2f:
            if (r1 == 0) goto L46
            java.util.List<com.join.kotlin.discount.model.bean.StreamingGameTagBean> r1 = r6.sub_titles     // Catch: java.lang.Exception -> L75
            if (r1 == 0) goto L45
            java.lang.Object r7 = r1.get(r7)     // Catch: java.lang.Exception -> L75
            com.join.kotlin.discount.model.bean.StreamingGameTagBean r7 = (com.join.kotlin.discount.model.bean.StreamingGameTagBean) r7     // Catch: java.lang.Exception -> L75
            if (r7 == 0) goto L45
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Exception -> L75
            if (r7 != 0) goto L44
            goto L45
        L44:
            r0 = r7
        L45:
            return r0
        L46:
            com.join.kotlin.discount.model.bean.GameDetailBasicInfoBean r1 = r6.basic_info     // Catch: java.lang.Exception -> L75
            if (r1 == 0) goto L75
            if (r1 == 0) goto L50
            java.util.List r4 = r1.getTags()     // Catch: java.lang.Exception -> L75
        L50:
            if (r4 == 0) goto L58
            boolean r1 = r4.isEmpty()     // Catch: java.lang.Exception -> L75
            if (r1 == 0) goto L59
        L58:
            r2 = 1
        L59:
            if (r2 != 0) goto L75
            com.join.kotlin.discount.model.bean.GameDetailBasicInfoBean r1 = r6.basic_info     // Catch: java.lang.Exception -> L75
            if (r1 == 0) goto L75
            java.util.List r1 = r1.getTags()     // Catch: java.lang.Exception -> L75
            if (r1 == 0) goto L75
            java.lang.Object r7 = r1.get(r7)     // Catch: java.lang.Exception -> L75
            com.join.kotlin.discount.model.bean.TagBean r7 = (com.join.kotlin.discount.model.bean.TagBean) r7     // Catch: java.lang.Exception -> L75
            if (r7 == 0) goto L75
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Exception -> L75
            if (r7 != 0) goto L74
            goto L75
        L74:
            r0 = r7
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.discount.model.bean.GameDetailBean.getTagForAppDl(int):java.lang.String");
    }

    @Nullable
    public final String getTagName() {
        return this.tagName;
    }

    @Nullable
    public final String getTop_bg_color() {
        return this.top_bg_color;
    }

    @Nullable
    public final String getTrading_number() {
        return this.trading_number;
    }

    @Nullable
    public final List<GameDetailSubAccountBean> getTransaction_info() {
        return this.transaction_info;
    }

    public int hashCode() {
        GameDetailBasicInfoBean gameDetailBasicInfoBean = this.basic_info;
        int hashCode = (gameDetailBasicInfoBean == null ? 0 : gameDetailBasicInfoBean.hashCode()) * 31;
        GameDetailBookingInfoBean gameDetailBookingInfoBean = this.booking_info;
        int hashCode2 = (hashCode + (gameDetailBookingInfoBean == null ? 0 : gameDetailBookingInfoBean.hashCode())) * 31;
        CommonComponentBean commonComponentBean = this.coupon_info;
        int hashCode3 = (hashCode2 + (commonComponentBean == null ? 0 : commonComponentBean.hashCode())) * 31;
        String str = this.game_icon;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.game_id;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.game_name;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CommonComponentBean commonComponentBean2 = this.gift_info;
        int hashCode7 = (hashCode6 + (commonComponentBean2 == null ? 0 : commonComponentBean2.hashCode())) * 31;
        GameDetailPicAndVideoInfoBean gameDetailPicAndVideoInfoBean = this.pic_video_info;
        int hashCode8 = (hashCode7 + (gameDetailPicAndVideoInfoBean == null ? 0 : gameDetailPicAndVideoInfoBean.hashCode())) * 31;
        GameDetailNoticeBean gameDetailNoticeBean = this.game_notice_info;
        int hashCode9 = (hashCode8 + (gameDetailNoticeBean == null ? 0 : gameDetailNoticeBean.hashCode())) * 31;
        GameServerInfoBean gameServerInfoBean = this.game_server_info;
        int hashCode10 = (hashCode9 + (gameServerInfoBean == null ? 0 : gameServerInfoBean.hashCode())) * 31;
        List<GameDetailSubAccountBean> list = this.transaction_info;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.benefits;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.has648;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        List<? extends CommonGameInfoBean> list3 = this.ad;
        int hashCode14 = (hashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<StreamingGameTagBean> list4 = this.sub_titles;
        int hashCode15 = (hashCode14 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<SimilarGameBean> list5 = this.similarity_game_names;
        int hashCode16 = (hashCode15 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str4 = this.comment_number;
        int hashCode17 = (hashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trading_number;
        int hashCode18 = (hashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.top_bg_color;
        int hashCode19 = (hashCode18 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.recycle_number;
        int hashCode20 = (hashCode19 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.sell_number;
        int hashCode21 = (hashCode20 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.tagName;
        return hashCode21 + (str7 != null ? str7.hashCode() : 0);
    }

    public final boolean serverInfoAvailable() {
        return this.game_server_info != null;
    }

    public final void setAd(@Nullable List<? extends CommonGameInfoBean> list) {
        this.ad = list;
    }

    public final void setBasic_info(@Nullable GameDetailBasicInfoBean gameDetailBasicInfoBean) {
        this.basic_info = gameDetailBasicInfoBean;
    }

    public final void setBenefits(@Nullable List<String> list) {
        this.benefits = list;
    }

    public final void setBooking_info(@Nullable GameDetailBookingInfoBean gameDetailBookingInfoBean) {
        this.booking_info = gameDetailBookingInfoBean;
    }

    public final void setComment_number(@Nullable String str) {
        this.comment_number = str;
    }

    public final void setCoupon_info(@Nullable CommonComponentBean commonComponentBean) {
        this.coupon_info = commonComponentBean;
    }

    public final void setGame_icon(@Nullable String str) {
        this.game_icon = str;
    }

    public final void setGame_id(@Nullable String str) {
        this.game_id = str;
    }

    public final void setGame_name(@Nullable String str) {
        this.game_name = str;
    }

    public final void setGame_notice_info(@Nullable GameDetailNoticeBean gameDetailNoticeBean) {
        this.game_notice_info = gameDetailNoticeBean;
    }

    public final void setGame_server_info(@Nullable GameServerInfoBean gameServerInfoBean) {
        this.game_server_info = gameServerInfoBean;
    }

    public final void setGift_info(@Nullable CommonComponentBean commonComponentBean) {
        this.gift_info = commonComponentBean;
    }

    public final void setHas648(@Nullable Integer num) {
        this.has648 = num;
    }

    public final void setPic_video_info(@Nullable GameDetailPicAndVideoInfoBean gameDetailPicAndVideoInfoBean) {
        this.pic_video_info = gameDetailPicAndVideoInfoBean;
    }

    public final void setRecycle_number(@Nullable Integer num) {
        this.recycle_number = num;
    }

    public final void setSell_number(@Nullable Integer num) {
        this.sell_number = num;
    }

    public final void setSimilarity_game_names(@Nullable List<SimilarGameBean> list) {
        this.similarity_game_names = list;
    }

    public final void setSub_titles(@Nullable List<StreamingGameTagBean> list) {
        this.sub_titles = list;
    }

    public final void setTagName(@Nullable String str) {
        this.tagName = str;
    }

    public final void setTop_bg_color(@Nullable String str) {
        this.top_bg_color = str;
    }

    public final void setTrading_number(@Nullable String str) {
        this.trading_number = str;
    }

    public final void setTransaction_info(@Nullable List<GameDetailSubAccountBean> list) {
        this.transaction_info = list;
    }

    public final boolean showAd() {
        List<? extends CommonGameInfoBean> list = this.ad;
        if (!(list == null || list.isEmpty())) {
            List<? extends CommonGameInfoBean> list2 = this.ad;
            Intrinsics.checkNotNull(list2);
            if (list2.get(0) != null) {
                List<? extends CommonGameInfoBean> list3 = this.ad;
                Intrinsics.checkNotNull(list3);
                CommonGameInfoBean commonGameInfoBean = list3.get(0);
                String big_pic = commonGameInfoBean != null ? commonGameInfoBean.getBig_pic() : null;
                if (!(big_pic == null || big_pic.length() == 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean showBenefits() {
        List<String> list = this.benefits;
        return !(list == null || list.isEmpty());
    }

    public final boolean showDiscount() {
        String str = this.tagName;
        return !(str == null || str.length() == 0);
    }

    public final boolean showEvent() {
        GameDetailNoticeBean gameDetailNoticeBean = this.game_notice_info;
        if (gameDetailNoticeBean != null) {
            Intrinsics.checkNotNull(gameDetailNoticeBean);
            String jumpListUrl = gameDetailNoticeBean.getJumpListUrl();
            if (!(jumpListUrl == null || jumpListUrl.length() == 0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean showNoticeCount() {
        GameDetailNoticeBean gameDetailNoticeBean = this.game_notice_info;
        if (gameDetailNoticeBean != null) {
            Intrinsics.checkNotNull(gameDetailNoticeBean);
            String activeNoticeCount = gameDetailNoticeBean.getActiveNoticeCount();
            if (!(activeNoticeCount == null || activeNoticeCount.length() == 0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean showSimilarGames() {
        List<SimilarGameBean> list = this.similarity_game_names;
        return !(list == null || list.isEmpty());
    }

    @NotNull
    public String toString() {
        return "GameDetailBean(basic_info=" + this.basic_info + ", booking_info=" + this.booking_info + ", coupon_info=" + this.coupon_info + ", game_icon=" + this.game_icon + ", game_id=" + this.game_id + ", game_name=" + this.game_name + ", gift_info=" + this.gift_info + ", pic_video_info=" + this.pic_video_info + ", game_notice_info=" + this.game_notice_info + ", game_server_info=" + this.game_server_info + ", transaction_info=" + this.transaction_info + ", benefits=" + this.benefits + ", has648=" + this.has648 + ", ad=" + this.ad + ", sub_titles=" + this.sub_titles + ", similarity_game_names=" + this.similarity_game_names + ", comment_number=" + this.comment_number + ", trading_number=" + this.trading_number + ", top_bg_color=" + this.top_bg_color + ", recycle_number=" + this.recycle_number + ", sell_number=" + this.sell_number + ", tagName=" + this.tagName + ')';
    }

    public GameDetailBean(@Nullable GameDetailBasicInfoBean gameDetailBasicInfoBean, @Nullable GameDetailBookingInfoBean gameDetailBookingInfoBean, @Nullable CommonComponentBean commonComponentBean, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable CommonComponentBean commonComponentBean2, @Nullable GameDetailPicAndVideoInfoBean gameDetailPicAndVideoInfoBean, @Nullable GameDetailNoticeBean gameDetailNoticeBean, @Nullable GameServerInfoBean gameServerInfoBean, @Nullable List<GameDetailSubAccountBean> list, @Nullable List<String> list2, @Nullable Integer num, @Nullable List<? extends CommonGameInfoBean> list3, @Nullable List<StreamingGameTagBean> list4, @Nullable List<SimilarGameBean> list5, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str7) {
        this.basic_info = gameDetailBasicInfoBean;
        this.booking_info = gameDetailBookingInfoBean;
        this.coupon_info = commonComponentBean;
        this.game_icon = str;
        this.game_id = str2;
        this.game_name = str3;
        this.gift_info = commonComponentBean2;
        this.pic_video_info = gameDetailPicAndVideoInfoBean;
        this.game_notice_info = gameDetailNoticeBean;
        this.game_server_info = gameServerInfoBean;
        this.transaction_info = list;
        this.benefits = list2;
        this.has648 = num;
        this.ad = list3;
        this.sub_titles = list4;
        this.similarity_game_names = list5;
        this.comment_number = str4;
        this.trading_number = str5;
        this.top_bg_color = str6;
        this.recycle_number = num2;
        this.sell_number = num3;
        this.tagName = str7;
    }
}
