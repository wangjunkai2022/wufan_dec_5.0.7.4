.class Lcom/join/mgps/activity/MyGamePapaLocalFragment$b;
.super Ljava/lang/Object;
.source "MyGamePapaLocalFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/v$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MyGamePapaLocalFragment;->Y(Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic c:Lcom/join/mgps/activity/MyGamePapaLocalFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment;Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$b;->c:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    iput-object p2, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$b;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$b;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$b;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$b;->c:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    invoke-static {v1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->V(Lcom/join/mgps/activity/MyGamePapaLocalFragment;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$b;->a:Ljava/lang/String;

    invoke-virtual {p1, v1, v2, v0}, Lcom/join/mgps/Util/IntentUtil;->goGameDetialActivity(Landroid/content/Context;Ljava/lang/String;I)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 4
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lcom/join/mgps/dto/ModInfoBean;

    invoke-virtual {v1, v2, v3}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ModInfoBean;

    if-eqz v1, :cond_1

    .line 5
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_2

    .line 6
    invoke-virtual {v1}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCrc_link_type_val(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object p1, v2

    :cond_3
    :goto_1
    const/16 v1, 0x7f

    .line 7
    invoke-virtual {p1, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    .line 8
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/TipNew;->getOut_game()Lcom/join/mgps/dto/TipBean;

    move-result-object v1

    if-eqz v1, :cond_4

    const/4 v0, 0x1

    .line 9
    :cond_4
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/join/mgps/enums/Dtype;->chajian:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    :cond_5
    if-eqz v0, :cond_6

    goto :goto_2

    .line 10
    :cond_6
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$b;->c:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/join/mgps/Util/IntentUtil;->goGameDetialActivityBYDownloadTAsk(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    :cond_7
    :goto_2
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$b;->c:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->W0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$b;->c:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$b;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->D0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$b;->c:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->F0(Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/customview/n;

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$b;->c:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/join/mgps/customview/n;-><init>(Landroid/content/Context;)V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$b;->c:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    iget-object v1, v1, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->d:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Lcom/join/mgps/customview/n;->a(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
