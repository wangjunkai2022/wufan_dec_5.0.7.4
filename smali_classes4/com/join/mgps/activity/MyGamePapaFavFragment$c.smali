.class Lcom/join/mgps/activity/MyGamePapaFavFragment$c;
.super Ljava/lang/Object;
.source "MyGamePapaFavFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/v$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MyGamePapaFavFragment;->Y(Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic c:Lcom/join/mgps/activity/MyGamePapaFavFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MyGamePapaFavFragment;Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$c;->c:Lcom/join/mgps/activity/MyGamePapaFavFragment;

    iput-object p2, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$c;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$c;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$c;->c:Lcom/join/mgps/activity/MyGamePapaFavFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->V(Lcom/join/mgps/activity/MyGamePapaFavFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 3
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getModInfoBean()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getModInfoBean()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getModInfoBean()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_2
    :goto_1
    move-object v1, v2

    goto :goto_0

    :cond_3
    if-eqz v1, :cond_4

    .line 5
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$c;->c:Lcom/join/mgps/activity/MyGamePapaFavFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goGameDetialActivityBYDownloadTaskForFav(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 6
    :cond_4
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$c;->c:Lcom/join/mgps/activity/MyGamePapaFavFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->W(Lcom/join/mgps/activity/MyGamePapaFavFragment;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$c;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lcom/join/mgps/Util/IntentUtil;->goGameDetialActivity(Landroid/content/Context;Ljava/lang/String;I)V

    :goto_2
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$c;->c:Lcom/join/mgps/activity/MyGamePapaFavFragment;

    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$c;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->m0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$c;->c:Lcom/join/mgps/activity/MyGamePapaFavFragment;

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->o0(Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/customview/n;

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$c;->c:Lcom/join/mgps/activity/MyGamePapaFavFragment;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/join/mgps/customview/n;-><init>(Landroid/content/Context;)V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$c;->c:Lcom/join/mgps/activity/MyGamePapaFavFragment;

    iget-object v1, v1, Lcom/join/mgps/activity/MyGamePapaFavFragment;->f:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Lcom/join/mgps/customview/n;->a(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$c;->c:Lcom/join/mgps/activity/MyGamePapaFavFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->W(Lcom/join/mgps/activity/MyGamePapaFavFragment;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "backup"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 3
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 4
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 5
    invoke-static {v3}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 6
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 7
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$c;->c:Lcom/join/mgps/activity/MyGamePapaFavFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->X(Lcom/join/mgps/activity/MyGamePapaFavFragment;)Lcom/join/mgps/activity/MyGamePapaFavVpFragment_;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->d0(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
