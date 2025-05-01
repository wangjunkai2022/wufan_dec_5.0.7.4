.class public Lcom/join/mgps/activity/PrivateDomainDownloadActivity;
.super Lcom/join/mgps/base/dialog/BaseDialogActivity;
.source "PrivateDomainDownloadActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0086
.end annotation


# instance fields
.field private b:Landroid/view/View;

.field c:Landroid/widget/TextView;

.field private d:Lcom/facebook/drawee/view/SimpleDraweeView;

.field e:Lcom/join/mgps/dto/WxProgram;

.field f:Lcom/join/mgps/pref/PrefDef_;

.field g:Lcom/join/mgps/dto/DomainInfoBean;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;-><init>()V

    return-void
.end method


# virtual methods
.method afterViews()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/c2;->s(Landroid/app/Activity;)V

    .line 2
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v0, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->f:Lcom/join/mgps/pref/PrefDef_;

    const v0, 0x7f090ea1

    .line 3
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->c:Landroid/widget/TextView;

    const v0, 0x7f09091d

    .line 4
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->b:Landroid/view/View;

    const v0, 0x7f09120b

    .line 5
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v1, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->b:Landroid/view/View;

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->g:Lcom/join/mgps/dto/DomainInfoBean;

    if-eqz v1, :cond_3

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-nez v1, :cond_0

    .line 10
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 11
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v0, :cond_1

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->g:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DomainInfoBean;->getPic()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 14
    :cond_1
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->pdGameDownload:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->g:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DomainInfoBean;->getGameId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->g:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->g:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DomainInfoBean;->getGameId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->g:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DomainInfoBean;->getLocation()I

    move-result v3

    const/4 v4, 0x6

    if-ne v3, v4, :cond_2

    const-string v3, "101"

    goto :goto_0

    :cond_2
    const-string v3, "102"

    :goto_0
    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    :cond_3
    return-void
.end method

.method public getContentView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f09091d

    if-ne p1, v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    goto/16 :goto_2

    :cond_0
    const v0, 0x7f09120b

    if-ne p1, v0, :cond_4

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->g:Lcom/join/mgps/dto/DomainInfoBean;

    if-eqz p1, :cond_2

    .line 4
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->pdGameDownloadedClick:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->g:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DomainInfoBean;->getGameId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->g:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->g:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->g:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DomainInfoBean;->getLocation()I

    move-result v2

    const/4 v3, 0x6

    if-ne v2, v3, :cond_1

    const-string v2, "101"

    goto :goto_0

    :cond_1
    const-string v2, "102"

    :goto_0
    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->g:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DomainInfoBean;->getInfo()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 6
    :try_start_0
    iget-object p1, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->g:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DomainInfoBean;->getInfo()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    const-class v1, Lcom/join/mgps/dto/WxProgram;

    invoke-virtual {v0, p1, v1}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/WxProgram;

    iput-object p1, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->e:Lcom/join/mgps/dto/WxProgram;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 9
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->e:Lcom/join/mgps/dto/WxProgram;

    if-eqz p1, :cond_3

    const-string v0, "game_download"

    .line 10
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/WxProgram;->setSceneType(Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/PrivateDomainDownloadActivity;->e:Lcom/join/mgps/dto/WxProgram;

    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->g4(Landroid/content/Context;Lcom/join/mgps/dto/WxProgram;)V

    .line 12
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    :cond_4
    :goto_2
    return-void
.end method
