.class public Lcom/join/mgps/fragment/SearchGameListFragment;
.super Lcom/join/mgps/fragment/BaseFragment;
.source "SearchGameListFragment.java"

# interfaces
.implements Lcom/join/mgps/adapter/SearchGameListAdapter$f;
.implements Lw1/l;


# annotations
.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c0299
.end annotation


# instance fields
.field A:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field B:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field C:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field D:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field F:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field private G:I

.field private H:I

.field b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f0911d5
    .end annotation
.end field

.field c:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Lcom/join/mgps/rpc/k;

.field i:Lcom/join/mgps/adapter/SearchGameListAdapter;

.field j:Lcom/join/android/app/component/video/g;

.field k:I
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field l:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field m:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field n:I

.field o:I

.field p:I

.field q:I

.field r:I

.field s:I

.field private t:Landroid/content/Context;

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Ljava/lang/String;

.field y:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field z:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/BaseFragment;-><init>()V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->m:Ljava/lang/String;

    const/16 v1, 0x14

    .line 3
    iput v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->q:I

    const/4 v1, 0x1

    .line 4
    iput v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->s:I

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->u:Z

    .line 6
    iput-boolean v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->v:Z

    .line 7
    iput-boolean v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->w:Z

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->x:Ljava/lang/String;

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->E:Ljava/util/List;

    .line 10
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    .line 11
    iput v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->G:I

    .line 12
    iput v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->H:I

    return-void
.end method

.method private A0()V
    .locals 15

    .line 1
    iget v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->H:I

    if-ltz v0, :cond_7

    iget v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->G:I

    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {v1}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v1

    if-ge v0, v1, :cond_7

    .line 2
    iget v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->H:I

    :goto_0
    iget v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->G:I

    if-gt v0, v1, :cond_7

    const/4 v1, 0x0

    .line 3
    :try_start_0
    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    invoke-virtual {v2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object v2

    .line 4
    const-class v3, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v3, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_4

    .line 5
    :cond_0
    check-cast v2, Lcom/join/mgps/dto/CommonGameInfoBean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v2

    goto :goto_1

    :catch_0
    move-exception v2

    .line 6
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    if-nez v1, :cond_1

    goto/16 :goto_4

    .line 7
    :cond_1
    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 8
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    const/16 v3, 0xc

    const/4 v4, 0x2

    if-eq v2, v4, :cond_2

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    if-ne v2, v3, :cond_6

    .line 9
    :cond_2
    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    iget v5, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->H:I

    sub-int v5, v0, v5

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 10
    iget-object v5, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {v5, v2}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v2

    .line 11
    instance-of v5, v2, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v5, :cond_6

    .line 12
    check-cast v2, Lcom/join/mgps/base/BaseViewHolder;

    .line 13
    :try_start_1
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v5

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v5

    if-nez v5, :cond_3

    return-void

    .line 14
    :cond_3
    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowSize()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    const-wide/high16 v8, 0x4090000000000000L    # 1024.0

    mul-double v6, v6, v8

    mul-double v6, v6, v8

    double-to-long v6, v6

    .line 15
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v8
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const-wide/16 v10, 0x0

    const-string v12, "/"

    const v13, 0x7f0900f1

    cmp-long v14, v8, v10

    if-nez v14, :cond_4

    .line 16
    :try_start_2
    invoke-virtual {v2, v13}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v10

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 17
    :cond_4
    invoke-virtual {v2, v13}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v10

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    :goto_2
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v6

    if-ne v6, v3, :cond_5

    const v3, 0x7f091051

    .line 19
    invoke-virtual {v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ProgressBar;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v6

    long-to-int v7, v6

    invoke-virtual {v3, v7}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto :goto_3

    :cond_5
    const v3, 0x7f09104a

    .line 20
    invoke-virtual {v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ProgressBar;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v6

    long-to-int v7, v6

    invoke-virtual {v3, v7}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 21
    :goto_3
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    if-ne v1, v4, :cond_6

    const v1, 0x7f090d81

    .line 22
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/S"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :catch_1
    move-exception v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_6
    :goto_4
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_7
    return-void
.end method

.method static synthetic W(Lcom/join/mgps/fragment/SearchGameListFragment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->G:I

    return p1
.end method

.method static synthetic X(Lcom/join/mgps/fragment/SearchGameListFragment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->H:I

    return p1
.end method

.method static synthetic Z(Lcom/join/mgps/fragment/SearchGameListFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->r0()V

    return-void
.end method

.method static synthetic a0(Lcom/join/mgps/fragment/SearchGameListFragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->w:Z

    return p0
.end method

.method static synthetic b0(Lcom/join/mgps/fragment/SearchGameListFragment;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->w:Z

    return p1
.end method

.method static synthetic c0(Lcom/join/mgps/fragment/SearchGameListFragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->v:Z

    return p0
.end method

.method static synthetic d0(Lcom/join/mgps/fragment/SearchGameListFragment;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    return-object p0
.end method

.method private l0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 4
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {v1}, Lcom/join/mgps/base/BaseQuickAdapter;->getData()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    .line 8
    iget v3, v2, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->b:I

    const/4 v4, 0x7

    if-eq v3, v4, :cond_2

    goto :goto_0

    .line 9
    :cond_2
    iget-object v2, v2, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->c:Ljava/lang/Object;

    check-cast v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 10
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 11
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->isModGameVm()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_6

    .line 12
    iget-object v4, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 13
    iget-object v6, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v4, :cond_3

    if-nez v6, :cond_3

    .line 14
    invoke-virtual {v2, v5}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    :cond_3
    if-eqz v4, :cond_4

    .line 15
    invoke-virtual {v2, v4}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    :cond_4
    if-eqz v6, :cond_5

    .line 16
    invoke-virtual {v2, v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 17
    :cond_5
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 18
    invoke-virtual {v2, v5}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 19
    :cond_6
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 20
    invoke-virtual {v2, v5}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 21
    :cond_7
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->k0()V

    return-void
.end method

.method private m0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 3
    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->k0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method private n0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->E:Ljava/util/List;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->A4(Ljava/util/List;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->E:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/SearchGameListFragment;->x0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->k0()V

    return-void
.end method

.method private o0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    if-eqz v0, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->E:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/SearchGameListFragment;->x0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v0, :cond_2

    return-void

    .line 7
    :cond_2
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 8
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCfg_ver()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSource_ver()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSource_ver(Ljava/lang/String;)V

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->k0()V

    :cond_3
    :goto_0
    return-void
.end method

.method private r0()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v0

    if-lez v0, :cond_4

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->getFirstCompletelyVisiblePosition()I

    move-result v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {v1}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->getLastCompletelyVisiblePosition()I

    move-result v1

    :goto_0
    if-gt v0, v1, :cond_4

    .line 4
    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    if-eqz v2, :cond_3

    .line 5
    invoke-virtual {v2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v3, :cond_3

    .line 6
    invoke-virtual {v2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->isMiniGame()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getStatistics()Lcom/join/mgps/dto/StatisticsBean;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getStatistics()Lcom/join/mgps/dto/StatisticsBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/StatisticsBean;->getMin_game_search_source()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eq v3, v4, :cond_0

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getStatistics()Lcom/join/mgps/dto/StatisticsBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/StatisticsBean;->getMin_game_search_source()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v5, 0x2

    if-ne v3, v5, :cond_2

    :cond_0
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->isHasExposure()Z

    move-result v3

    if-nez v3, :cond_2

    .line 8
    new-instance v3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v5, ""

    .line 9
    invoke-virtual {v3, v5}, Lcom/papa/sim/statistic/Ext;->setPage(Ljava/lang/String;)V

    const-string v6, "101"

    .line 10
    invoke-virtual {v3, v6}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 11
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 12
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getStatistics()Lcom/join/mgps/dto/StatisticsBean;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 13
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getStatistics()Lcom/join/mgps/dto/StatisticsBean;

    move-result-object v7

    invoke-virtual {v7}, Lcom/join/mgps/dto/StatisticsBean;->getMin_game_search_source()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/papa/sim/statistic/Ext;->setDataFlag(Ljava/lang/String;)V

    .line 14
    :cond_1
    sget-object v5, Lcom/papa/sim/statistic/Where;->search:Lcom/papa/sim/statistic/Where;

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/papa/sim/statistic/Ext;->setWhere(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v2, v4}, Lcom/join/mgps/dto/CommonGameInfoBean;->setHasExposure(Z)V

    .line 16
    iget-object v4, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    invoke-static {v4}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v4

    sget-object v5, Lcom/papa/sim/statistic/Event;->expSmallGameAdPage:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v3, v6}, Lcom/papa/sim/statistic/p;->k0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Ljava/lang/String;)V

    .line 17
    :cond_2
    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->g2(Lcom/join/mgps/dto/CommonGameInfoBean;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 18
    :try_start_0
    new-instance v3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v4, "discount_game"

    .line 19
    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setResultCode(Ljava/lang/String;)V

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setScenesCode(Ljava/lang/String;)V

    .line 21
    new-instance v4, Lcom/papa/sim/statistic/Data;

    invoke-direct {v4}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 22
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    .line 23
    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    invoke-static {v2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    sget-object v5, Lcom/papa/sim/statistic/Event;->expGameAdPage:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v2, v5, v3, v4}, Lcom/papa/sim/statistic/p;->Y(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    .line 24
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_4
    return-void
.end method

.method private x0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    :try_start_0
    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {v2}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v2

    if-ge v1, v2, :cond_8

    .line 2
    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {v2, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    .line 3
    iget-object v2, v2, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->c:Ljava/lang/Object;

    instance-of v3, v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v3, :cond_7

    .line 4
    check-cast v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 5
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 6
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->isModGameVm()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 7
    iget-object v4, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v5, 0x5

    const/4 v6, 0x1

    if-eqz v4, :cond_0

    .line 8
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v4

    if-ne v4, v5, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 9
    :goto_1
    iget-object v7, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v7, :cond_1

    .line 10
    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v7

    if-ne v7, v5, :cond_1

    goto :goto_2

    :cond_1
    const/4 v6, 0x0

    :goto_2
    if-eqz v6, :cond_2

    if-eqz v4, :cond_2

    .line 11
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 12
    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    :cond_2
    if-eqz v6, :cond_3

    .line 13
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 14
    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    :cond_3
    if-eqz v4, :cond_4

    .line 15
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 16
    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    .line 17
    :cond_4
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    if-nez v4, :cond_5

    .line 18
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    :cond_5
    if-eqz v4, :cond_7

    .line 19
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 20
    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    .line 21
    :cond_6
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 22
    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_7
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :catch_0
    move-exception p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    return-void
.end method

.method private y0(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->E:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 4
    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->E:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->isModGameVm()Z

    move-result v4

    if-eqz v4, :cond_9

    .line 6
    iget-object v4, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v5, 0x1

    const/4 v6, 0x5

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    .line 7
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v4

    if-ne v4, v6, :cond_3

    const/4 v4, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    .line 8
    :goto_1
    iget-object v8, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v8, :cond_4

    .line 9
    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v8

    if-ne v8, v6, :cond_4

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    :goto_2
    if-eqz v5, :cond_5

    if-eqz v4, :cond_5

    .line 10
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 11
    invoke-virtual {v0, v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    :cond_5
    if-eqz v5, :cond_6

    .line 12
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 13
    invoke-virtual {v0, v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    :cond_6
    if-eqz v4, :cond_7

    .line 14
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 15
    invoke-virtual {v0, v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 16
    :cond_7
    iget-object v4, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v4, :cond_8

    .line 17
    iget-object v4, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    :cond_8
    if-eqz v4, :cond_2

    .line 18
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 19
    invoke-virtual {v0, v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_0

    .line 20
    :cond_9
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 21
    invoke-virtual {v0, v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method private z0(Ljava/lang/String;I)V
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {v1}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {v1, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    .line 4
    iget-object v1, v1, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->c:Ljava/lang/Object;

    instance-of v2, v1, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v2, :cond_2

    .line 5
    check-cast v1, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 6
    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 8
    :cond_1
    invoke-virtual {v1, p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->setRequestStatus(I)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method B0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    if-eqz p1, :cond_0

    packed-switch p2, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 1
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/SearchGameListFragment;->m0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 2
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/SearchGameListFragment;->o0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 3
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/SearchGameListFragment;->l0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 4
    :pswitch_4
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/SearchGameListFragment;->n0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public R()V
    .locals 4

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->p:I

    .line 2
    iput v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->r:I

    const/4 v1, 0x1

    .line 3
    iput v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->s:I

    .line 4
    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    if-eqz v2, :cond_0

    instance-of v3, v2, Lcom/join/mgps/activity/SearchListActivity1;

    if-eqz v3, :cond_0

    .line 5
    check-cast v2, Lcom/join/mgps/activity/SearchListActivity1;

    invoke-virtual {v2}, Lcom/join/mgps/activity/SearchListActivity1;->q0()I

    move-result v2

    iput v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->n:I

    .line 6
    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    check-cast v2, Lcom/join/mgps/activity/SearchListActivity1;

    invoke-virtual {v2}, Lcom/join/mgps/activity/SearchListActivity1;->p0()I

    move-result v2

    iput v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->o:I

    .line 7
    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    check-cast v2, Lcom/join/mgps/activity/SearchListActivity1;

    invoke-virtual {v2}, Lcom/join/mgps/activity/SearchListActivity1;->getGameId()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->l:Ljava/lang/String;

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->showLoadingView()V

    .line 9
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->h0()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->m:Ljava/lang/String;

    .line 10
    iput-boolean v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->v:Z

    .line 11
    iput-boolean v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->w:Z

    .line 12
    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->reset()V

    .line 13
    :cond_1
    invoke-virtual {p0, v1, v0}, Lcom/join/mgps/fragment/SearchGameListFragment;->j0(IZ)V

    return-void
.end method

.method T(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method V(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/join/mgps/activity/GameDetailActivity_;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "fromid"

    .line 2
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/16 p2, 0x2b5e

    const-string v1, "_from"

    .line 3
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 p2, 0x0

    .line 4
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    :cond_1
    const-string p3, "groupuid"

    .line 5
    invoke-virtual {v0, p3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p2, "gameid"

    .line 6
    invoke-virtual {v0, p2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "company_id"

    .line 7
    invoke-virtual {v0, p2, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 8
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method afterViews()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    .line 2
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->E0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->h:Lcom/join/mgps/rpc/k;

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    .line 4
    new-instance v0, Lcom/join/android/app/component/video/g;

    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    const-string v2, "SearchGameListFragmentVideoHelper"

    invoke-direct {v0, v1, v2}, Lcom/join/android/app/component/video/g;-><init>(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->j:Lcom/join/android/app/component/video/g;

    .line 5
    new-instance v0, Lcom/join/mgps/adapter/SearchGameListAdapter;

    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->j:Lcom/join/android/app/component/video/g;

    invoke-direct {v0, v1, v2}, Lcom/join/mgps/adapter/SearchGameListAdapter;-><init>(Landroid/content/Context;Lcom/join/android/app/component/video/g;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    .line 6
    invoke-virtual {v0, p0}, Lcom/join/mgps/adapter/SearchGameListAdapter;->Y(Lcom/join/mgps/adapter/SearchGameListAdapter$f;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->h0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/SearchGameListAdapter;->b0(Ljava/lang/String;)V

    .line 8
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;-><init>(II)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    move-result-object v0

    .line 11
    instance-of v1, v0, Landroidx/recyclerview/widget/SimpleItemAnimator;

    if-eqz v1, :cond_0

    .line 12
    check-cast v0, Landroidx/recyclerview/widget/SimpleItemAnimator;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/SimpleItemAnimator;->setSupportsChangeAnimations(Z)V

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    new-instance v1, Lcom/join/mgps/fragment/SearchGameListFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/SearchGameListFragment$a;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    new-instance v1, Lcom/join/mgps/fragment/SearchGameListFragment$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/SearchGameListFragment$b;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    if-eqz v0, :cond_1

    .line 16
    new-instance v1, Lcom/join/mgps/fragment/SearchGameListFragment$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/SearchGameListFragment$c;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->setLoadingListener(Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView$g;)V

    .line 17
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 18
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->q0()V

    .line 19
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->R()V

    .line 20
    iput-boolean v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->u:Z

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method e0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x1f4L
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->j:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    const/4 v1, 0x2

    .line 2
    invoke-virtual {v0, v1}, Lcom/join/android/app/component/video/g;->g(I)V

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->r0()V

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;-><init>()V

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setPid(I)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/j0;->v0(Landroid/content/Context;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;)V

    return-void
.end method

.method f0(Ljava/util/List;Lcom/join/mgps/dto/SearchGameListBean;Z)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;",
            "Lcom/join/mgps/dto/SearchGameListBean;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    if-eqz p2, :cond_3

    .line 3
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/SearchGameListBean;->getAd_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object p1

    const/4 v1, 0x1

    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setAdInfo(Z)V

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->isIs_head()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getPosition()I

    move-result v2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v1

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    :goto_0
    invoke-interface {v0, v3, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_2
    if-eqz p3, :cond_3

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/dto/SearchGameListBean;->getPd_info()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 7
    new-instance p2, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-direct {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;-><init>()V

    .line 8
    invoke-virtual {p2, p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setPd_info(Lcom/join/mgps/dto/DomainInfoBean;)V

    .line 9
    invoke-virtual {p2, v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setIsPrivateDomain(Z)V

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/DomainInfoBean;->getIndex()I

    move-result p1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p3

    sub-int/2addr p3, v1

    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_1
    return-object v0
.end method

.method g0(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/join/mgps/activity/SearchListActivity1;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lcom/join/mgps/activity/SearchListActivity1;

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/SearchListActivity1;->x0(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method h0()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/join/mgps/activity/SearchListActivity1;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lcom/join/mgps/activity/SearchListActivity1;

    invoke-virtual {v0}, Lcom/join/mgps/activity/SearchListActivity1;->y0()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method hideLoading()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->y:Landroid/view/View;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->z:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method i0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/join/mgps/activity/SearchListActivity1;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lcom/join/mgps/activity/SearchListActivity1;

    invoke-virtual {v0}, Lcom/join/mgps/activity/SearchListActivity1;->q0()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->n:I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    check-cast v0, Lcom/join/mgps/activity/SearchListActivity1;

    invoke-virtual {v0}, Lcom/join/mgps/activity/SearchListActivity1;->p0()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->o:I

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->v:Z

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/fragment/SearchGameListFragment;->j0(IZ)V

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->k:I

    if-nez v0, :cond_0

    const-string v0, "searchTotalList"

    goto :goto_0

    :cond_0
    const-string v0, "searchGameList"

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    invoke-static {v2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    invoke-virtual {v2, v0, p1, v1}, Lcom/papa/sim/statistic/p;->d0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method j0(IZ)V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_19

    .line 2
    iget v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->r:I

    if-eq p1, v0, :cond_18

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    goto/16 :goto_14

    .line 3
    :cond_0
    iput p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->r:I

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->showLoadingView()V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    const/4 v3, 0x0

    .line 6
    :try_start_0
    new-instance v4, Lcom/join/mgps/dto/RequestSearchGameArgs;

    invoke-direct {v4}, Lcom/join/mgps/dto/RequestSearchGameArgs;-><init>()V

    .line 7
    iget-object v5, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->l:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/RequestSearchGameArgs;->setGameId(Ljava/lang/String;)V

    .line 8
    iget v5, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->o:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/RequestSearchGameArgs;->setLangId(Ljava/lang/Integer;)V

    .line 9
    iget v5, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->q:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/RequestSearchGameArgs;->setPc(Ljava/lang/Integer;)V

    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/RequestSearchGameArgs;->setPn(Ljava/lang/Integer;)V

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->h0()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/RequestSearchGameArgs;->setKeyword(Ljava/lang/String;)V

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/join/mgps/dto/RequestSearchGameArgs;->setUid(Ljava/lang/Integer;)V

    goto :goto_0

    .line 13
    :cond_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/join/mgps/dto/RequestSearchGameArgs;->setUid(Ljava/lang/Integer;)V

    .line 14
    :goto_0
    iget v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->n:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/join/mgps/dto/RequestSearchGameArgs;->setPluginNum(Ljava/lang/Integer;)V

    if-eqz p2, :cond_2

    .line 15
    iget v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->s:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/join/mgps/dto/RequestSearchGameArgs;->setRec_pn(Ljava/lang/Integer;)V

    goto :goto_1

    .line 16
    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/join/mgps/dto/RequestSearchGameArgs;->setRec_pn(Ljava/lang/Integer;)V

    :goto_1
    if-eqz p2, :cond_3

    const/4 p2, 0x1

    goto :goto_2

    :cond_3
    const/4 p2, 0x0

    .line 17
    :goto_2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v4, p2}, Lcom/join/mgps/dto/RequestSearchGameArgs;->setIsRecommend(Ljava/lang/Integer;)V

    .line 18
    iget-object p2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->x:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_4

    if-eq p1, v1, :cond_4

    .line 19
    iget-object p2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->x:Ljava/lang/String;

    invoke-virtual {v4, p2}, Lcom/join/mgps/dto/RequestSearchGameArgs;->setPageOfFirstGameId(Ljava/lang/String;)V

    .line 20
    :cond_4
    new-instance p2, Lcom/join/mgps/dto/RequestModel;

    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/join/mgps/dto/RequestModel;-><init>(Landroid/content/Context;)V

    .line 21
    invoke-virtual {p2, v4}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 22
    invoke-virtual {p2}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    :try_start_1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->h:Lcom/join/mgps/rpc/k;

    invoke-virtual {p2}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object p2

    invoke-interface {v0, p2}, Lcom/join/mgps/rpc/k;->J(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object p2

    if-eqz p2, :cond_12

    .line 24
    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 25
    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/SearchGameListBean;

    .line 26
    invoke-virtual {v0}, Lcom/join/mgps/dto/SearchGameListBean;->getPage_first_gid()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->x:Ljava/lang/String;

    .line 27
    iget-boolean v4, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->v:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v4, :cond_6

    .line 28
    :try_start_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/SearchGameListBean;->getRecommend_list()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_13

    invoke-virtual {v0}, Lcom/join/mgps/dto/SearchGameListBean;->getRecommend_list()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_13

    .line 29
    invoke-virtual {v0}, Lcom/join/mgps/dto/SearchGameListBean;->getRecommend_list()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_13

    .line 30
    invoke-virtual {v0}, Lcom/join/mgps/dto/SearchGameListBean;->getRecommend_list()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SearchGameListBean;->getList()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_5

    const/4 p2, 0x1

    goto :goto_3

    :cond_5
    const/4 p2, 0x0

    :goto_3
    invoke-virtual {p0, v4, v0, p2}, Lcom/join/mgps/fragment/SearchGameListFragment;->f0(Ljava/util/List;Lcom/join/mgps/dto/SearchGameListBean;Z)Ljava/util/List;

    move-result-object p2

    .line 31
    invoke-virtual {p0, p2, v3, v3}, Lcom/join/mgps/fragment/SearchGameListFragment;->t0(Ljava/util/List;ZZ)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto/16 :goto_b

    .line 32
    :cond_6
    :try_start_3
    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/SearchGameListBean;->getList()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/SearchGameListBean;->getList()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-gtz v4, :cond_7

    goto :goto_4

    :cond_7
    const/4 v4, 0x0

    goto :goto_5

    :cond_8
    :goto_4
    const/4 v4, 0x1

    .line 33
    :goto_5
    :try_start_4
    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_9

    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/SearchGameListBean;->getList()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_9

    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/SearchGameListBean;->getList()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_9

    .line 34
    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {p0, v5, p1}, Lcom/join/mgps/fragment/SearchGameListFragment;->s0(Lcom/join/mgps/dto/SearchGameListBean;I)V

    .line 35
    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/SearchGameListBean;->getRecommend_list()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_9

    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/SearchGameListBean;->getRecommend_list()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_9

    const/4 v4, 0x1

    :cond_9
    if-eqz v4, :cond_b

    if-ne p1, v1, :cond_b

    .line 36
    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/SearchGameListBean;->getList()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/SearchGameListBean;->getList()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-gtz v5, :cond_b

    .line 37
    :cond_a
    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/SearchGameListBean;->getPd_info()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v5

    invoke-virtual {p0, v1, v5}, Lcom/join/mgps/fragment/SearchGameListFragment;->u0(ZLcom/join/mgps/dto/DomainInfoBean;)V

    .line 38
    :cond_b
    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/SearchGameListBean;->getRecommend_list()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_c

    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/SearchGameListBean;->getRecommend_list()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_c

    .line 39
    iput-boolean v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->v:Z

    .line 40
    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/SearchGameListBean;->getRecommend_list()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v4

    move v5, v4

    const/4 v4, 0x0

    goto :goto_6

    :cond_c
    const/4 v5, 0x0

    :goto_6
    if-eqz v4, :cond_d

    if-gtz v5, :cond_d

    goto :goto_a

    .line 41
    :cond_d
    invoke-virtual {v0}, Lcom/join/mgps/dto/SearchGameListBean;->getRecommend_list()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/SearchGameListBean;->getList()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_e

    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/SearchGameListBean;->getList()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_e

    const/4 v6, 0x1

    goto :goto_7

    :cond_e
    const/4 v6, 0x0

    :goto_7
    invoke-virtual {p0, v5, v0, v6}, Lcom/join/mgps/fragment/SearchGameListFragment;->f0(Ljava/util/List;Lcom/join/mgps/dto/SearchGameListBean;Z)Ljava/util/List;

    move-result-object v0

    .line 42
    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/SearchGameListBean;->getList()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_f

    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/SearchGameListBean;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SearchGameListBean;->getList()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-gtz p2, :cond_10

    :cond_f
    if-ne p1, v1, :cond_10

    const/4 p2, 0x1

    goto :goto_8

    :cond_10
    const/4 p2, 0x0

    :goto_8
    iget-boolean v5, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->v:Z

    if-eqz v5, :cond_11

    if-eq p1, v1, :cond_11

    goto :goto_9

    :cond_11
    const/4 v1, 0x0

    :goto_9
    invoke-virtual {p0, v0, p2, v1}, Lcom/join/mgps/fragment/SearchGameListFragment;->t0(Ljava/util/List;ZZ)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_a
    move v1, v4

    goto :goto_c

    :catchall_0
    move-exception p2

    move v1, v4

    goto :goto_12

    :catch_0
    move-exception p2

    move v1, v4

    goto :goto_d

    :cond_12
    :goto_b
    const/4 v1, 0x0

    .line 43
    :cond_13
    :goto_c
    :try_start_5
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->hideLoading()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_e

    :catch_1
    move-exception p2

    goto :goto_d

    :catch_2
    move-exception p2

    const/4 v1, 0x0

    .line 44
    :goto_d
    :try_start_6
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    .line 45
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->showLoadFailed()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_e
    if-eqz v1, :cond_15

    .line 46
    iget-boolean p2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->v:Z

    if-eqz p2, :cond_14

    goto :goto_10

    :catch_3
    move-exception p2

    goto :goto_f

    :catchall_1
    move-exception p2

    const/4 v1, 0x0

    goto :goto_12

    :catch_4
    move-exception p2

    const/4 v1, 0x0

    .line 47
    :goto_f
    :try_start_7
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-eqz v1, :cond_15

    .line 48
    iget-boolean p2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->v:Z

    if-eqz p2, :cond_14

    .line 49
    :goto_10
    iput v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->r:I

    goto :goto_11

    .line 50
    :cond_14
    iput p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->p:I

    goto :goto_11

    .line 51
    :cond_15
    iput p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->p:I

    .line 52
    iput v3, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->r:I

    .line 53
    :goto_11
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->v0()V

    goto :goto_15

    :catchall_2
    move-exception p2

    :goto_12
    if-eqz v1, :cond_17

    .line 54
    iget-boolean v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->v:Z

    if-eqz v0, :cond_16

    .line 55
    iput v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->r:I

    goto :goto_13

    .line 56
    :cond_16
    iput p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->p:I

    goto :goto_13

    .line 57
    :cond_17
    iput p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->p:I

    .line 58
    iput v3, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->r:I

    .line 59
    :goto_13
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->v0()V

    .line 60
    throw p2

    :cond_18
    :goto_14
    return-void

    :cond_19
    if-ne p1, v1, :cond_1a

    .line 61
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    if-eqz p1, :cond_1a

    invoke-virtual {p1}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result p1

    if-nez p1, :cond_1a

    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->showLoadFailed()V

    .line 62
    :cond_1a
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    if-eqz p1, :cond_1b

    .line 63
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f100299

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/SearchGameListFragment;->T(Ljava/lang/String;)V

    :cond_1b
    :goto_15
    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->k:I

    if-nez v0, :cond_0

    const-string v0, "searchTotalList"

    goto :goto_0

    :cond_0
    const-string v0, "searchGameList"

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    invoke-static {v2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    invoke-virtual {v2, v0, p1, v1}, Lcom/papa/sim/statistic/p;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method k0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->h0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/SearchGameListAdapter;->b0(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method protected lazyLoad()V
    .locals 0

    return-void
.end method

.method public n(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->l:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "fromSearchP2"

    goto :goto_0

    :cond_0
    const-string v0, "fromSearchP3"

    .line 2
    :goto_0
    iget v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->k:I

    if-nez v1, :cond_1

    const-string v0, "fromSearchP4"

    .line 3
    :cond_1
    invoke-virtual/range {p0 .. p5}, Lcom/join/mgps/fragment/SearchGameListFragment;->V(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, v0, p2, p3}, Lcom/papa/sim/statistic/p;->j0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->e(Ljava/lang/Object;)V

    .line 2
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->j:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->t()V

    :cond_0
    return-void
.end method

.method public onEventMainThread(Lcom/join/mgps/event/n;)V
    .locals 5
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_6

    const/4 v3, 0x3

    if-eq v1, v3, :cond_5

    const/4 v2, 0x5

    if-eq v1, v2, :cond_4

    const/4 v4, 0x6

    if-eq v1, v4, :cond_3

    const/4 v4, 0x7

    if-eq v1, v4, :cond_2

    const/16 v3, 0x8

    if-eq v1, v3, :cond_1

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    goto :goto_0

    .line 3
    :pswitch_0
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/fragment/SearchGameListFragment;->z0(Ljava/lang/String;I)V

    goto :goto_0

    :pswitch_1
    const/16 p1, 0x9

    .line 4
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/fragment/SearchGameListFragment;->B0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 5
    :pswitch_2
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/fragment/SearchGameListFragment;->B0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    :pswitch_3
    if-nez v0, :cond_0

    return-void

    .line 6
    :cond_0
    invoke-virtual {p0, v0, v4}, Lcom/join/mgps/fragment/SearchGameListFragment;->B0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    if-eqz p1, :cond_7

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_7

    .line 8
    invoke-direct {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->A0()V

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {v0, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 10
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/fragment/SearchGameListFragment;->B0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 11
    :cond_3
    invoke-virtual {p0, v0, v4}, Lcom/join/mgps/fragment/SearchGameListFragment;->B0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 12
    :cond_4
    :pswitch_4
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/fragment/SearchGameListFragment;->B0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 13
    :cond_5
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/fragment/SearchGameListFragment;->B0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    :cond_6
    const/4 p1, 0x1

    .line 14
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/fragment/SearchGameListFragment;->B0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    :cond_7
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x30
        :pswitch_4
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->j:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->u()V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->j:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->A()V

    :cond_0
    return-void
.end method

.method protected onVisible()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/BaseFragment;->onVisible()V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->u:Z

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->m:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/SearchGameListFragment;->g0(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->R()V

    :cond_0
    return-void
.end method

.method p0(Landroid/content/Intent;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.broadcast.bespeak.sussess"
        }
    .end annotation

    if-eqz p1, :cond_1

    const-string v0, "gameid"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "game_book"

    .line 2
    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    const-string v2, "message"

    .line 3
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "pd_info"

    .line 4
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/DomainInfoBean;

    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/fragment/SearchGameListFragment;->w0(Ljava/lang/String;I)V

    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/DomainInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v1

    const-string v3, "game_search_subscribe"

    invoke-static {v0, v1, v3}, Lcom/join/mgps/Util/UtilsMy;->h4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1, v2}, Lcom/join/mgps/Util/a0;->J(Landroid/content/Context;Lcom/join/mgps/dto/DomainInfoBean;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method q0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->E:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 4
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 5
    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->F:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method relodingimag()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->R()V

    return-void
.end method

.method s0(Lcom/join/mgps/dto/SearchGameListBean;I)V
    .locals 17
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    if-nez v1, :cond_0

    return-void

    :cond_0
    const-string v3, "1"

    const/4 v4, 0x1

    if-ne v2, v4, :cond_1

    .line 1
    iget-object v5, v0, Lcom/join/mgps/fragment/SearchGameListFragment;->m:Ljava/lang/String;

    invoke-virtual {v1, v5}, Lcom/join/mgps/dto/SearchGameListBean;->setKeyword(Ljava/lang/String;)V

    .line 2
    invoke-static/range {p1 .. p1}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/join/mgps/Util/j0;->t1(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/SearchGameListBean;->getList()Ljava/util/List;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/SearchGameListBean;->getList()Ljava/util/List;

    move-result-object v7

    const/4 v8, 0x0

    if-eqz v7, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/SearchGameListBean;->getList()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-lez v7, :cond_2

    const/4 v7, 0x1

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v0, v6, v1, v7}, Lcom/join/mgps/fragment/SearchGameListFragment;->f0(Ljava/util/List;Lcom/join/mgps/dto/SearchGameListBean;Z)Ljava/util/List;

    move-result-object v6

    const/16 v9, 0x10

    const/4 v10, 0x2

    const/16 v11, 0xc

    const/16 v12, 0xb

    const/4 v13, 0x7

    const-string v14, "2"

    const/16 v15, 0x70

    if-eqz v6, :cond_d

    .line 5
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v16

    if-eqz v16, :cond_d

    .line 6
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/SearchGameListBean;->getPd_info()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v1

    invoke-virtual {v0, v8, v1}, Lcom/join/mgps/fragment/SearchGameListFragment;->u0(ZLcom/join/mgps/dto/DomainInfoBean;)V

    .line 7
    invoke-direct {v0, v6}, Lcom/join/mgps/fragment/SearchGameListFragment;->y0(Ljava/util/List;)V

    .line 8
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 9
    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->isAdInfo()Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x93

    .line 10
    invoke-virtual {v6, v8}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 11
    invoke-virtual {v6, v8}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    goto :goto_2

    .line 12
    :cond_3
    invoke-virtual {v6, v15}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 13
    invoke-virtual {v6, v15}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 14
    :goto_2
    iget v8, v0, Lcom/join/mgps/fragment/SearchGameListFragment;->k:I

    if-nez v8, :cond_4

    .line 15
    invoke-virtual {v6, v3}, Lcom/join/mgps/dto/DownloadPointBase;->setReMarks(Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    if-ne v8, v4, :cond_5

    .line 16
    invoke-virtual {v6, v14}, Lcom/join/mgps/dto/DownloadPointBase;->setReMarks(Ljava/lang/String;)V

    .line 17
    :cond_5
    :goto_3
    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->isMiniGame()Z

    move-result v8

    if-eqz v8, :cond_7

    .line 18
    new-instance v8, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->getV_url()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v16

    if-eqz v16, :cond_6

    const/16 v7, 0xc

    goto :goto_4

    :cond_6
    const/16 v7, 0xb

    :goto_4
    invoke-direct {v8, v7, v6}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;-><init>(ILjava/lang/Object;)V

    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 19
    :cond_7
    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->getStatistics()Lcom/join/mgps/dto/StatisticsBean;

    move-result-object v7

    if-eqz v7, :cond_a

    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->getStatistics()Lcom/join/mgps/dto/StatisticsBean;

    move-result-object v7

    invoke-virtual {v7}, Lcom/join/mgps/dto/StatisticsBean;->getMin_game_search_source()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-eq v7, v4, :cond_8

    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->getStatistics()Lcom/join/mgps/dto/StatisticsBean;

    move-result-object v7

    invoke-virtual {v7}, Lcom/join/mgps/dto/StatisticsBean;->getMin_game_search_source()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v10, :cond_a

    .line 20
    :cond_8
    new-instance v7, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->getOnlineGameAdVideoUrl()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x11

    goto :goto_5

    :cond_9
    const/16 v8, 0x10

    :goto_5
    invoke-direct {v7, v8, v6}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;-><init>(ILjava/lang/Object;)V

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 21
    :cond_a
    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->isAdInfo()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->isIs_head()Z

    move-result v7

    if-eqz v7, :cond_b

    .line 22
    new-instance v7, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    const/16 v8, 0xe

    invoke-direct {v7, v8, v6}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;-><init>(ILjava/lang/Object;)V

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 23
    :cond_b
    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->isPrivateDomain()Z

    move-result v7

    if-eqz v7, :cond_c

    .line 24
    new-instance v7, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    const/16 v8, 0xf

    invoke-direct {v7, v8, v6}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;-><init>(ILjava/lang/Object;)V

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 25
    :cond_c
    new-instance v7, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    invoke-direct {v7, v13, v6}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;-><init>(ILjava/lang/Object;)V

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 26
    :cond_d
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/SearchGameListBean;->getPd_info()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v6

    invoke-virtual {v0, v4, v6}, Lcom/join/mgps/fragment/SearchGameListFragment;->u0(ZLcom/join/mgps/dto/DomainInfoBean;)V

    .line 27
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/SearchGameListBean;->getRecommend_list()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_15

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/SearchGameListBean;->getRecommend_list()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-eqz v6, :cond_15

    .line 28
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/SearchGameListBean;->getRecommend_list()Ljava/util/List;

    move-result-object v6

    invoke-direct {v0, v6}, Lcom/join/mgps/fragment/SearchGameListFragment;->y0(Ljava/util/List;)V

    .line 29
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/SearchGameListBean;->getRecommend_list()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 30
    invoke-virtual {v6, v15}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 31
    invoke-virtual {v6, v15}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 32
    iget v7, v0, Lcom/join/mgps/fragment/SearchGameListFragment;->k:I

    if-nez v7, :cond_e

    .line 33
    invoke-virtual {v6, v3}, Lcom/join/mgps/dto/DownloadPointBase;->setReMarks(Ljava/lang/String;)V

    goto :goto_7

    :cond_e
    if-ne v7, v4, :cond_f

    .line 34
    invoke-virtual {v6, v14}, Lcom/join/mgps/dto/DownloadPointBase;->setReMarks(Ljava/lang/String;)V

    .line 35
    :cond_f
    :goto_7
    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->isMiniGame()Z

    move-result v7

    if-eqz v7, :cond_11

    .line 36
    new-instance v7, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->getV_url()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_10

    const/16 v8, 0xc

    goto :goto_8

    :cond_10
    const/16 v8, 0xb

    :goto_8
    invoke-direct {v7, v8, v6}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;-><init>(ILjava/lang/Object;)V

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 37
    :cond_11
    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->getStatistics()Lcom/join/mgps/dto/StatisticsBean;

    move-result-object v7

    if-eqz v7, :cond_14

    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->getStatistics()Lcom/join/mgps/dto/StatisticsBean;

    move-result-object v7

    invoke-virtual {v7}, Lcom/join/mgps/dto/StatisticsBean;->getMin_game_search_source()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-eq v7, v4, :cond_12

    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->getStatistics()Lcom/join/mgps/dto/StatisticsBean;

    move-result-object v7

    invoke-virtual {v7}, Lcom/join/mgps/dto/StatisticsBean;->getMin_game_search_source()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v10, :cond_14

    .line 38
    :cond_12
    new-instance v7, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->getOnlineGameAdVideoUrl()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_13

    const/16 v8, 0x11

    goto :goto_9

    :cond_13
    const/16 v8, 0x10

    :goto_9
    invoke-direct {v7, v8, v6}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;-><init>(ILjava/lang/Object;)V

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 39
    :cond_14
    new-instance v7, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    invoke-direct {v7, v13, v6}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;-><init>(ILjava/lang/Object;)V

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_15
    if-ne v2, v4, :cond_17

    .line 40
    new-instance v1, Lcom/join/mgps/adapter/SearchGameListAdapter;

    iget-object v2, v0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    iget-object v3, v0, Lcom/join/mgps/fragment/SearchGameListFragment;->j:Lcom/join/android/app/component/video/g;

    invoke-direct {v1, v2, v3}, Lcom/join/mgps/adapter/SearchGameListAdapter;-><init>(Landroid/content/Context;Lcom/join/android/app/component/video/g;)V

    iput-object v1, v0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    .line 41
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->h0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->b0(Ljava/lang/String;)V

    .line 42
    iget-object v1, v0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    if-eqz v1, :cond_16

    .line 43
    iget-object v2, v0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {v1, v2}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 44
    :cond_16
    iget-object v1, v0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {v1, v5}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    .line 45
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->e0()V

    goto :goto_a

    .line 46
    :cond_17
    iget-object v1, v0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {v1, v5}, Lcom/join/mgps/base/BaseQuickAdapter;->addData(Ljava/util/Collection;)V

    :goto_a
    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/BaseFragment;->setUserVisibleHint(Z)V

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->j:Lcom/join/android/app/component/video/g;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/join/android/app/component/video/g;->A()V

    :cond_0
    return-void
.end method

.method showLoadFailed()V
    .locals 1

    const-string v0, ""

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/SearchGameListFragment;->showLoadFailed(Ljava/lang/String;)V

    return-void
.end method

.method showLoadFailed(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    const/16 v0, 0x8

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->y:Landroid/view/View;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->z:Landroid/view/View;

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method showLoadingView()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-ne v0, v2, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->y:Landroid/view/View;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_3

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->y:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->y:Landroid/view/View;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->z:Landroid/view/View;

    if-eqz v0, :cond_4

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    return-void
.end method

.method t0(Ljava/util/List;ZZ)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;ZZ)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x1

    if-eqz p3, :cond_1

    .line 2
    new-instance p3, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    const/16 v2, 0xd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {p3, v2, v3}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p3

    if-eqz p3, :cond_b

    .line 4
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    const/16 v3, 0x67

    .line 5
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    const/16 v3, 0x70

    .line 6
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 7
    invoke-virtual {v2, v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setRecommend(Z)V

    .line 8
    iget v3, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->k:I

    if-nez v3, :cond_2

    const-string v3, "1"

    .line 9
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/DownloadPointBase;->setReMarks(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    if-ne v3, v1, :cond_3

    const-string v3, "2"

    .line 10
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/DownloadPointBase;->setReMarks(Ljava/lang/String;)V

    .line 11
    :cond_3
    :goto_1
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->isMiniGame()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 12
    new-instance v3, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getV_url()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0xc

    goto :goto_2

    :cond_4
    const/16 v4, 0xb

    :goto_2
    invoke-direct {v3, v4, v2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 13
    :cond_5
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getStatistics()Lcom/join/mgps/dto/StatisticsBean;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getStatistics()Lcom/join/mgps/dto/StatisticsBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/StatisticsBean;->getMin_game_search_source()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eq v3, v1, :cond_6

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getStatistics()Lcom/join/mgps/dto/StatisticsBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/StatisticsBean;->getMin_game_search_source()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_8

    .line 14
    :cond_6
    new-instance v3, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getOnlineGameAdVideoUrl()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x11

    goto :goto_3

    :cond_7
    const/16 v4, 0x10

    :goto_3
    invoke-direct {v3, v4, v2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 15
    :cond_8
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->isPrivateDomain()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 16
    new-instance v3, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    const/16 v4, 0xf

    invoke-direct {v3, v4, v2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 17
    :cond_9
    new-instance v3, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    const/4 v4, 0x7

    invoke-direct {v3, v4, v2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 18
    :cond_a
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/SearchGameListFragment;->y0(Ljava/util/List;)V

    :cond_b
    if-eqz p2, :cond_d

    .line 19
    new-instance p1, Lcom/join/mgps/adapter/SearchGameListAdapter;

    iget-object p2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    iget-object p3, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->j:Lcom/join/android/app/component/video/g;

    invoke-direct {p1, p2, p3}, Lcom/join/mgps/adapter/SearchGameListAdapter;-><init>(Landroid/content/Context;Lcom/join/android/app/component/video/g;)V

    iput-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    .line 20
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->h0()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->b0(Ljava/lang/String;)V

    .line 21
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    if-eqz p1, :cond_c

    .line 22
    iget-object p2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {p1, p2}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 23
    :cond_c
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    .line 24
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->e0()V

    goto :goto_4

    .line 25
    :cond_d
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->addData(Ljava/util/Collection;)V

    :goto_4
    return-void
.end method

.method u0(ZLcom/join/mgps/dto/DomainInfoBean;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/16 v0, 0x8

    if-eqz p1, :cond_7

    const/4 p1, 0x0

    if-eqz p2, :cond_3

    .line 1
    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->d:Landroid/view/View;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->c:Landroid/view/View;

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->e:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/dto/DomainInfoBean;->getPic()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->e:Lcom/facebook/drawee/view/SimpleDraweeView;

    new-instance v0, Lcom/join/mgps/fragment/SearchGameListFragment$d;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/fragment/SearchGameListFragment$d;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment;Lcom/join/mgps/dto/DomainInfoBean;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->t:Landroid/content/Context;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->pdGameWish:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p2}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {p2}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object p2

    const-string v1, "0"

    invoke-virtual {p2, v1}, Lcom/papa/sim/statistic/Ext;->setIsResultPage(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto :goto_0

    .line 9
    :cond_3
    iget-object p2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->d:Landroid/view/View;

    if-eqz p2, :cond_4

    .line 10
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 11
    :cond_4
    iget-object p2, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->c:Landroid/view/View;

    if-eqz p2, :cond_5

    .line 12
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->f:Landroid/widget/ImageView;

    if-eqz p1, :cond_6

    const p2, 0x7f0807e7

    .line 14
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 15
    :cond_6
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->g:Landroid/widget/TextView;

    if-eqz p1, :cond_9

    const-string p2, "\u672a\u641c\u7d22\u5230\u76f8\u5e94\u6e38\u620f\n\u5df2\u4e3a\u60a8\u63a8\u8350\u5176\u5b83\u6e38\u620f"

    .line 16
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 17
    :cond_7
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->c:Landroid/view/View;

    if-eqz p1, :cond_8

    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 19
    :cond_8
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->d:Landroid/view/View;

    if-eqz p1, :cond_9

    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_9
    :goto_0
    return-void
.end method

.method v0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->r:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->setNoMore()V

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->stopLoadMore()V

    :goto_0
    return-void
.end method

.method w0(Ljava/lang/String;I)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->i:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-virtual {v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getData()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v3, :cond_2

    .line 4
    invoke-virtual {v1}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    :cond_2
    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 7
    invoke-virtual {v1, p2}, Lcom/join/mgps/dto/GInfoBean;->setGame_book(I)V

    .line 8
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->k0()V

    return-void
.end method
