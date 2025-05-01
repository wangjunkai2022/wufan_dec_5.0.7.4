package com.join.android.app.common.http;

import com.join.mgps.Util.g2;
import com.join.mgps.rpc.impl.i;
import com.join.mgps.rpc.impl.l;
import com.papa.sim.statistic.o;
import com.psk.eventmodule.net.api.RpcEventFactory;
/* loaded from: classes.dex */
public class DNSDataResult {
    private String account;
    private String accountCertification;
    private String accountV2;
    private String accountV3;
    private String appAnnUrl;
    private String appContent;
    private String archiveRoot;
    private String cdnImgUrl;
    private String chatV1;
    private String comment;
    private String consoleGame;
    private String copperH5;
    private String dataUrl;
    private String emuCheckToken;
    private String fightV3;
    private String fightV4;
    private String forum;
    private String forumPrplyurl;
    private String forumV5;
    private String friendV1;
    private String gameRankingMatch;
    private String gameUrl;
    private String infoStreamDataUrl;
    private String oemUrl;
    private String onlyGameSearchUrl;
    private String payCenter;
    private String payv1;
    private String quertionH5;
    private String reportH5;
    private String svrPostUrl;
    private String tuisDownLoadUrl;
    private String vipCDK;

    public String getAccount() {
        return this.account;
    }

    public String getAccountCertification() {
        return this.accountCertification;
    }

    public String getAccountV2() {
        return this.accountV2;
    }

    public String getAccountV3() {
        return this.accountV3;
    }

    public String getAppAnnUrl() {
        return this.appAnnUrl;
    }

    public String getAppContent() {
        return this.appContent;
    }

    public String getArchiveRoot() {
        return this.archiveRoot;
    }

    public String getCdnImgUrl() {
        return this.cdnImgUrl;
    }

    public String getChatV1() {
        return this.chatV1;
    }

    public String getComment() {
        return this.comment;
    }

    public String getConsoleGame() {
        return this.consoleGame;
    }

    public String getCopperH5() {
        return this.copperH5;
    }

    public String getDataUrl() {
        return this.dataUrl;
    }

    public String getEmuCheckToken() {
        return this.emuCheckToken;
    }

    public String getFightV3() {
        return this.fightV3;
    }

    public String getFightV4() {
        return this.fightV4;
    }

    public String getForum() {
        return this.forum;
    }

    public String getForumPrplyurl() {
        return this.forumPrplyurl;
    }

    public String getForumV5() {
        return this.forumV5;
    }

    public String getFriendV1() {
        return this.friendV1;
    }

    public String getGameRankingMatch() {
        return this.gameRankingMatch;
    }

    public String getGameUrl() {
        return this.gameUrl;
    }

    public String getInfoStreamDataUrl() {
        return this.infoStreamDataUrl;
    }

    public String getOemUrl() {
        return this.oemUrl;
    }

    public String getOnlyGameSearchUrl() {
        return this.onlyGameSearchUrl;
    }

    public String getPayCenter() {
        return this.payCenter;
    }

    public String getPayv1() {
        return this.payv1;
    }

    public String getQuertionH5() {
        return this.quertionH5;
    }

    public String getReportH5() {
        return this.reportH5;
    }

    public String getSvrPostUrl() {
        return this.svrPostUrl;
    }

    public String getTuisDownLoadUrl() {
        return this.tuisDownLoadUrl;
    }

    public String getVipCDK() {
        return this.vipCDK;
    }

    public void setAccount(String str) {
        this.account = str;
    }

    public void setAccountCertification(String str) {
        this.accountCertification = str;
    }

    public void setAccountV2(String str) {
        this.accountV2 = str;
    }

    public void setAccountV3(String str) {
        this.accountV3 = str;
    }

    public void setAppAnnUrl(String str) {
        this.appAnnUrl = str;
    }

    public void setAppContent(String str) {
        this.appContent = str;
    }

    public void setArchiveRoot(String str) {
        this.archiveRoot = str;
    }

    public void setCdnImgUrl(String str) {
        this.cdnImgUrl = str;
    }

    public void setChatV1(String str) {
        this.chatV1 = str;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setConsoleGame(String str) {
        this.consoleGame = str;
    }

    public void setCopperH5(String str) {
        this.copperH5 = str;
    }

    public void setDataUrl(String str) {
        this.dataUrl = str;
    }

    public void setEmuCheckToken(String str) {
        this.emuCheckToken = str;
    }

    public void setFightV3(String str) {
        this.fightV3 = str;
    }

    public void setFightV4(String str) {
        this.fightV4 = str;
    }

    public void setForum(String str) {
        this.forum = str;
    }

    public void setForumPrplyurl(String str) {
        this.forumPrplyurl = str;
    }

    public void setForumV5(String str) {
        this.forumV5 = str;
    }

    public void setFriendV1(String str) {
        this.friendV1 = str;
    }

    public void setGameRankingMatch(String str) {
        this.gameRankingMatch = str;
    }

    public void setGameUrl(String str) {
        this.gameUrl = str;
    }

    public void setInfoStreamDataUrl(String str) {
        this.infoStreamDataUrl = str;
    }

    public void setOemUrl(String str) {
        this.oemUrl = str;
    }

    public void setOnlyGameSearchUrl(String str) {
        this.onlyGameSearchUrl = str;
    }

    public void setPayCenter(String str) {
        this.payCenter = str;
    }

    public void setPayv1(String str) {
        this.payv1 = str;
    }

    public void setQuertionH5(String str) {
        this.quertionH5 = str;
    }

    public void setReportH5(String str) {
        this.reportH5 = str;
    }

    public void setSvrPostUrl(String str) {
        this.svrPostUrl = str;
    }

    public void setTuisDownLoadUrl(String str) {
        this.tuisDownLoadUrl = str;
    }

    public void setVipCDK(String str) {
        this.vipCDK = str;
    }

    public void updateRpcConstant() {
        if (g2.i(this.appContent)) {
            if (!com.join.mgps.rpc.h.f54053i.equals(this.appContent)) {
                com.join.mgps.rpc.h.f54053i = this.appContent;
                com.join.mgps.rpc.impl.d.Q1();
            }
            String str = this.appContent;
            com.join.mgps.rpc.h.f54053i = str;
            o.f58851n = str;
            o.f58852o = this.fightV4;
        }
        if (g2.i(this.account)) {
            String str2 = this.account;
            o.f58850m = str2;
            if (!com.join.mgps.rpc.h.f54056j.equals(str2)) {
                com.join.mgps.rpc.h.f54056j = this.account;
                com.join.mgps.rpc.impl.a.d0();
            }
            com.join.mgps.rpc.h.f54056j = this.account;
        }
        if (g2.i(this.forum)) {
            com.join.mgps.rpc.h.f54059k = this.forum;
        }
        if (g2.i(this.fightV3)) {
            if (!com.join.mgps.rpc.h.f54062l.equals(this.fightV3)) {
                com.join.mgps.rpc.h.f54062l = this.fightV3;
                l.p0();
            }
            com.join.mgps.rpc.h.f54062l = this.fightV3;
        }
        if (g2.i(this.gameRankingMatch)) {
            com.join.mgps.rpc.h.f54065m = this.gameRankingMatch;
        }
        if (g2.i(this.fightV4)) {
            com.join.mgps.rpc.h.f54068n = this.fightV4;
        }
        if (g2.i(this.payv1)) {
            com.join.mgps.rpc.h.f54071o = this.payv1;
        }
        if (g2.i(this.oemUrl)) {
            com.join.mgps.rpc.h.f54074p = this.oemUrl;
        }
        if (g2.i(this.payCenter)) {
            com.join.mgps.rpc.h.f54077q = this.payCenter;
        }
        if (g2.i(this.copperH5)) {
            com.join.mgps.rpc.h.f54080r = this.copperH5;
        }
        if (g2.i(this.quertionH5)) {
            com.join.mgps.rpc.h.f54083s = this.quertionH5;
        }
        if (g2.i(this.reportH5)) {
            com.join.mgps.rpc.h.f54086t = this.reportH5;
        }
        if (g2.i(this.comment)) {
            com.join.mgps.rpc.h.f54089u = this.comment;
        }
        if (g2.i(this.svrPostUrl)) {
            com.join.mgps.rpc.h.f54092v = this.svrPostUrl;
        }
        if (g2.i(this.appAnnUrl)) {
            com.join.mgps.rpc.h.f54095w = this.appAnnUrl;
        }
        if (g2.i(this.consoleGame)) {
            if (!com.join.mgps.rpc.h.f54098x.equals(this.consoleGame)) {
                com.join.mgps.rpc.h.f54098x = this.consoleGame;
                com.join.mgps.rpc.impl.f.c();
            }
            com.join.mgps.rpc.h.f54098x = this.consoleGame;
        }
        if (g2.i(this.archiveRoot)) {
            com.join.mgps.rpc.h.f54101y = this.archiveRoot;
        }
        if (g2.i(this.gameUrl)) {
            com.join.mgps.rpc.h.A = this.gameUrl;
            i.F0();
        }
        if (g2.i(this.dataUrl)) {
            o.f58849l = this.dataUrl;
            RpcEventFactory.Companion.getInstance().resetUrl(this.dataUrl);
        }
        if (g2.i(this.vipCDK)) {
            com.join.mgps.rpc.h.C = this.vipCDK;
        }
        if (g2.i(this.forumV5)) {
            com.join.mgps.rpc.h.D = this.forumV5;
        }
        if (g2.i(this.accountV2)) {
            com.join.mgps.rpc.h.E = this.accountV2;
        }
        if (g2.i(this.accountV3)) {
            com.join.mgps.rpc.h.F = this.accountV3;
        }
        if (g2.i(this.accountCertification)) {
            com.join.mgps.rpc.h.G = this.accountCertification;
        }
        if (g2.i(this.friendV1)) {
            if (!com.join.mgps.rpc.h.H.equals(this.friendV1)) {
                com.join.mgps.rpc.h.H = this.friendV1;
                com.join.mgps.rpc.impl.h.q();
            }
            com.join.mgps.rpc.h.H = this.friendV1;
        }
        if (g2.i(this.infoStreamDataUrl)) {
            com.join.mgps.rpc.h.I = this.infoStreamDataUrl;
        }
        if (g2.i(this.chatV1) && this.chatV1.contains(":")) {
            try {
                String[] split = this.chatV1.split(":");
                com.join.mgps.rpc.h.J = split[0];
                com.join.mgps.rpc.h.K = Integer.parseInt(split[1]);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        g2.i(this.emuCheckToken);
        if (g2.i(this.cdnImgUrl)) {
            com.join.mgps.rpc.h.L = this.cdnImgUrl;
        }
        if (g2.i(this.tuisDownLoadUrl)) {
            com.join.mgps.rpc.h.M = this.tuisDownLoadUrl;
        }
        if (g2.i(this.onlyGameSearchUrl)) {
            com.join.mgps.rpc.h.B = this.onlyGameSearchUrl;
        }
    }
}
