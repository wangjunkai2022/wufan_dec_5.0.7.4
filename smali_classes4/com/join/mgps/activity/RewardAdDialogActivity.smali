.class public Lcom/join/mgps/activity/RewardAdDialogActivity;
.super Lcom/join/mgps/base/dialog/BaseDialogActivity;
.source "RewardAdDialogActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/RewardAdDialogActivity$d;
    }
.end annotation


# static fields
.field public static final v:Ljava/lang/String; = "_RewardAdParams"


# instance fields
.field b:Landroid/widget/ImageView;

.field c:Landroid/widget/TextView;

.field d:Landroid/widget/RelativeLayout;

.field e:Landroid/widget/TextView;

.field f:Landroid/widget/TextView;

.field g:Landroid/widget/TextView;

.field h:Landroid/widget/TextView;

.field i:Lcom/facebook/drawee/view/SimpleDraweeView;

.field j:Lcom/join/mgps/broadcast/NetBroadcastReceiver;

.field private k:Z

.field private l:I

.field private m:Lcom/join/mgps/dto/SingleGameAdCfgBean;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:I

.field private q:Z

.field r:Lcom/join/mgps/ad/n;

.field s:Lcom/join/mgps/ad/RewardAdParams;

.field t:Z

.field u:Lcom/join/mgps/activity/RewardAdDialogActivity$d;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->k:Z

    .line 3
    iput v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->l:I

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->q:Z

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->t:Z

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/activity/RewardAdDialogActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/RewardAdDialogActivity;->s0()V

    return-void
.end method

.method static synthetic g0(Lcom/join/mgps/activity/RewardAdDialogActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->l:I

    return p0
.end method

.method static synthetic h0(Lcom/join/mgps/activity/RewardAdDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    return-object p0
.end method

.method static synthetic i0(Lcom/join/mgps/activity/RewardAdDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    return-object p0
.end method

.method static synthetic j0(Lcom/join/mgps/activity/RewardAdDialogActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/RewardAdDialogActivity;->u0()V

    return-void
.end method

.method static synthetic k0(Lcom/join/mgps/activity/RewardAdDialogActivity;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->o:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic l0(Lcom/join/mgps/activity/RewardAdDialogActivity;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->n:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic m0(Lcom/join/mgps/activity/RewardAdDialogActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/RewardAdDialogActivity;->v0()V

    return-void
.end method

.method static synthetic n0(Lcom/join/mgps/activity/RewardAdDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    return-object p0
.end method

.method static synthetic o0(Lcom/join/mgps/activity/RewardAdDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    return-object p0
.end method

.method static synthetic p0(Lcom/join/mgps/activity/RewardAdDialogActivity;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->q:Z

    return p1
.end method

.method static synthetic q0(Lcom/join/mgps/activity/RewardAdDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    return-object p0
.end method

.method static synthetic r0(Lcom/join/mgps/activity/RewardAdDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    return-object p0
.end method

.method private s0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->r:Lcom/join/mgps/ad/n;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/activity/RewardAdDialogActivity$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/RewardAdDialogActivity$c;-><init>(Lcom/join/mgps/activity/RewardAdDialogActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->r:Lcom/join/mgps/ad/n;

    :cond_0
    return-void
.end method

.method private u0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/dto/RequestInfoArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestInfoArgs;-><init>()V

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestInfoArgs;->setUid(I)V

    .line 3
    new-instance v1, Lcom/join/mgps/dto/RequestInfoArgs$RequestInfoinfo;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestInfoArgs$RequestInfoinfo;-><init>()V

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/join/mgps/dto/RequestInfoArgs$RequestInfoinfo;->setTime(J)V

    const/4 v2, 0x1

    .line 5
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestInfoArgs$RequestInfoinfo;->setType(I)V

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestInfoArgs$RequestInfoinfo;->setUid(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/papa/sim/statistic/http/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestInfoArgs;->setInfo(Ljava/lang/String;)V

    .line 8
    invoke-static {p0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getDefalutRequestBean(Ljava/lang/Object;)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v0

    .line 9
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/rpc/impl/d;->O1()Le2/d;

    move-result-object v1

    invoke-interface {v1, v0}, Le2/d;->L1(Lcom/join/mgps/dto/CommonRequestBean;)Lretrofit2/Call;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/RewardAdDialogActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/RewardAdDialogActivity$b;-><init>(Lcom/join/mgps/activity/RewardAdDialogActivity;)V

    invoke-interface {v0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    return-void
.end method

.method private v0()V
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->k:Z

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0710db

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 6
    iget-object v2, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->m:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {v1}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getFree_receive_vip()I

    move-result v1

    if-ne v1, v0, :cond_0

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->m:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getF_tip_text()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->m:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getF_btn_text()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->m:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getB_btn_text()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->m:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getF_ic_text()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->m:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getF_ic_text()Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 15
    new-instance v1, Lcom/papa91/wrapper/UserPrefs;

    invoke-direct {v1, p0}, Lcom/papa91/wrapper/UserPrefs;-><init>(Landroid/content/Context;)V

    .line 16
    invoke-virtual {v1}, Lcom/papa91/wrapper/UserPrefs;->getAdGamesHasSeeCount()I

    move-result v1

    sub-int/2addr v0, v1

    if-lez v0, :cond_1

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->g:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4ec5\u9700"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u6b21"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->m:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getTip_text()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->m:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getT_btn_text()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->m:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getB_btn_text()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    :catch_0
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->i:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v1, 0x7f080682

    iget-object v2, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->m:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getF_play_ic()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    goto :goto_1

    .line 22
    :cond_2
    iput-boolean v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->k:Z

    .line 23
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->g:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 25
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 26
    iget-object v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 27
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->c:Landroid/widget/TextView;

    const-string v1, "\u89c2\u770b\u89c6\u9891\u5e7f\u544a\u53ef\u4ee5\u652f\u6301\u609f\u996d\u66f4\u597d\n\u66f4\u5feb\u4e0a\u4f20\u5355\u673a\u6e38\u620f\u8d44\u6e90"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->f:Landroid/widget/TextView;

    const-string v1, "\u5f00\u542f\u7f51\u7edc\u770b\u5e7f\u544a"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->h:Landroid/widget/TextView;

    const-string v1, "\u72e0\u5fc3\u62d2\u7edd\uff0c\u79bb\u7ebf\u6e38\u620f"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->b:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    goto/16 :goto_2

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->d:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_4

    .line 4
    iget-boolean p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->k:Z

    if-eqz p1, :cond_3

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->m:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getFree_receive_vip()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 7
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->m:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getF_btn_url()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->m:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getT_btn_url()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 9
    new-instance p1, Landroid/content/Intent;

    const-string v0, "com.tools.AdBroadcast"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x3

    const-string v1, "action"

    .line 10
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->m:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getT_btn_url()Ljava/lang/String;

    move-result-object v0

    const-string v1, "url"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 12
    invoke-virtual {p0, p1}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V

    .line 13
    :cond_2
    :goto_0
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->onMemberAdvert23:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_2

    .line 14
    :cond_3
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->onAdvert23_offline:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 15
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    goto :goto_2

    .line 16
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->h:Landroid/widget/TextView;

    if-ne p1, v0, :cond_8

    .line 17
    iget-boolean p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->k:Z

    if-eqz p1, :cond_6

    iget-boolean v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->q:Z

    if-nez v0, :cond_6

    .line 18
    sget-object p1, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {p1}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 19
    invoke-static {p0}, Lcom/join/mgps/ad/a;->g(Landroid/content/Context;)Lcom/join/mgps/ad/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/ad/a;->i(Landroid/app/Activity;)V

    .line 20
    :cond_5
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->onAdvert23:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 21
    iget-object p1, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    instance-of v0, p1, Ls1/b;

    if-eqz v0, :cond_8

    .line 22
    check-cast p1, Ls1/b;

    .line 23
    invoke-interface {p1}, Ls1/b;->onAdShow()V

    goto :goto_2

    :cond_6
    if-eqz p1, :cond_7

    .line 24
    iget-boolean p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->q:Z

    if-eqz p1, :cond_7

    .line 25
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u89c6\u9891\u52a0\u8f7d\u5931\u8d25"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 26
    :cond_7
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->gameAdvert23_offline:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 27
    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    .line 28
    iget-object p1, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    instance-of v0, p1, Ls1/b;

    if-eqz v0, :cond_8

    .line 29
    check-cast p1, Ls1/b;

    .line 30
    invoke-interface {p1}, Ls1/b;->onAdClose()V

    :cond_8
    :goto_2
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0091

    .line 2
    invoke-virtual {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/c2;->s(Landroid/app/Activity;)V

    const p1, 0x7f09091d

    .line 4
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->b:Landroid/widget/ImageView;

    const p1, 0x7f091589

    .line 5
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->c:Landroid/widget/TextView;

    const p1, 0x7f09117f

    .line 6
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->d:Landroid/widget/RelativeLayout;

    const p1, 0x7f09164f

    .line 7
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->f:Landroid/widget/TextView;

    const p1, 0x7f09158a

    .line 8
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->g:Landroid/widget/TextView;

    const p1, 0x7f09164e

    .line 9
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->h:Landroid/widget/TextView;

    const p1, 0x7f09078d

    .line 10
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->i:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->b:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->g:Landroid/widget/TextView;

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "_RewardAdParams"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/ad/RewardAdParams;

    iput-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->s:Lcom/join/mgps/ad/RewardAdParams;

    if-eqz p1, :cond_0

    .line 17
    invoke-virtual {p1}, Lcom/join/mgps/ad/RewardAdParams;->b()I

    move-result p1

    iput p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->l:I

    .line 18
    iget-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->s:Lcom/join/mgps/ad/RewardAdParams;

    invoke-virtual {p1}, Lcom/join/mgps/ad/RewardAdParams;->d()Lcom/join/mgps/dto/SingleGameAdCfgBean;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->m:Lcom/join/mgps/dto/SingleGameAdCfgBean;

    .line 19
    iget-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->s:Lcom/join/mgps/ad/RewardAdParams;

    invoke-virtual {p1}, Lcom/join/mgps/ad/RewardAdParams;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->n:Ljava/lang/String;

    .line 20
    iget-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->s:Lcom/join/mgps/ad/RewardAdParams;

    invoke-virtual {p1}, Lcom/join/mgps/ad/RewardAdParams;->c()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->o:Ljava/lang/String;

    .line 21
    iget-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->s:Lcom/join/mgps/ad/RewardAdParams;

    invoke-virtual {p1}, Lcom/join/mgps/ad/RewardAdParams;->e()I

    move-result p1

    iput p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->p:I

    .line 22
    :cond_0
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 23
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->showAdvert23:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 24
    iput-boolean p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->t:Z

    .line 25
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->showAdvert23_offline:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 26
    :goto_0
    invoke-direct {p0}, Lcom/join/mgps/activity/RewardAdDialogActivity;->v0()V

    .line 27
    invoke-direct {p0}, Lcom/join/mgps/activity/RewardAdDialogActivity;->s0()V

    .line 28
    invoke-static {p0}, Lcom/join/mgps/ad/a;->g(Landroid/content/Context;)Lcom/join/mgps/ad/a;

    move-result-object p1

    iget v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->l:I

    iget-object v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->o:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->n:Ljava/lang/String;

    iget-object v3, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->r:Lcom/join/mgps/ad/n;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/join/mgps/ad/a;->h(ILjava/lang/String;Ljava/lang/String;Lcom/join/mgps/ad/n;)V

    .line 29
    new-instance p1, Lcom/join/mgps/broadcast/NetBroadcastReceiver;

    invoke-direct {p1}, Lcom/join/mgps/broadcast/NetBroadcastReceiver;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->j:Lcom/join/mgps/broadcast/NetBroadcastReceiver;

    .line 30
    new-instance v0, Lcom/join/mgps/activity/RewardAdDialogActivity$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/RewardAdDialogActivity$a;-><init>(Lcom/join/mgps/activity/RewardAdDialogActivity;)V

    invoke-virtual {p1, v0}, Lcom/join/mgps/broadcast/NetBroadcastReceiver;->a(Lcom/join/mgps/broadcast/NetBroadcastReceiver$a;)V

    .line 31
    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 32
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 33
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->j:Lcom/join/mgps/broadcast/NetBroadcastReceiver;

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 34
    invoke-virtual {p0}, Lcom/join/mgps/activity/RewardAdDialogActivity;->t0()V

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onDestroy()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->j:Lcom/join/mgps/broadcast/NetBroadcastReceiver;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 4
    iput-object v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->j:Lcom/join/mgps/broadcast/NetBroadcastReceiver;

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->u:Lcom/join/mgps/activity/RewardAdDialogActivity$d;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 7
    iput-object v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->u:Lcom/join/mgps/activity/RewardAdDialogActivity$d;

    .line 8
    :cond_1
    invoke-static {p0}, Lcom/join/mgps/ad/a;->g(Landroid/content/Context;)Lcom/join/mgps/ad/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/ad/a;->b()V

    return-void
.end method

.method t0()V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/activity/RewardAdDialogActivity$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/RewardAdDialogActivity$d;-><init>(Lcom/join/mgps/activity/RewardAdDialogActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->u:Lcom/join/mgps/activity/RewardAdDialogActivity$d;

    .line 2
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.action_raise_vip_success"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v1, "com.join.android.app.mgsim.wufan.mha.broadcast.action_raise_vip_success"

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity;->u:Lcom/join/mgps/activity/RewardAdDialogActivity$d;

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method
