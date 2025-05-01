.class public Lcom/join/mgps/activity/MGChooseIconActivity;
.super Landroidx/fragment/app/FragmentActivity;
.source "MGChooseIconActivity.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c058e
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/join/mgps/adapter/a;

.field d:Landroid/widget/GridView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/db/tables/HeadPortraitTable;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/join/mgps/dialog/d1;

.field h:Lcom/wufan/user/service/protobuf/n0;

.field i:Lcom/join/mgps/rpc/b;

.field j:Lcom/MApplication;

.field k:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private m:Z

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/db/tables/HeadPortraitTable;",
            ">;"
        }
    .end annotation
.end field

.field o:I
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/FragmentActivity;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->f:Ljava/util/List;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->m:Z

    return-void
.end method

.method static synthetic e0(Lcom/join/mgps/activity/MGChooseIconActivity;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->b:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic f0(Lcom/join/mgps/activity/MGChooseIconActivity;)Lcom/join/mgps/adapter/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->c:Lcom/join/mgps/adapter/a;

    return-object p0
.end method

.method static synthetic g0(Lcom/join/mgps/activity/MGChooseIconActivity;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->f:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method afterViews()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/a;->c0()Lcom/join/mgps/rpc/b;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->i:Lcom/join/mgps/rpc/b;

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/MApplication;

    iput-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->j:Lcom/MApplication;

    .line 3
    invoke-virtual {v0, p0}, Lcom/MApplication;->e(Landroid/app/Activity;)V

    .line 4
    iput-object p0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->b:Landroid/content/Context;

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/a0;->x(Landroid/content/Context;)Lcom/join/mgps/dialog/d1;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->g:Lcom/join/mgps/dialog/d1;

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->e:Landroid/widget/TextView;

    const-string v1, "\u9009\u62e9\u56fe\u50cf"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->d:Landroid/widget/GridView;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 8
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->h:Lcom/wufan/user/service/protobuf/n0;

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->d:Landroid/widget/GridView;

    new-instance v1, Lcom/join/mgps/activity/MGChooseIconActivity$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/MGChooseIconActivity$a;-><init>(Lcom/join/mgps/activity/MGChooseIconActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 10
    invoke-static {}, Lb2/y;->n()Lb2/y;

    move-result-object v0

    invoke-virtual {v0}, Lp1/b;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->n:Ljava/util/List;

    .line 11
    new-instance v0, Lcom/join/mgps/adapter/a;

    iget-object v1, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->f:Ljava/util/List;

    iget-object v4, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->h:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v4}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/join/mgps/adapter/a;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->c:Lcom/join/mgps/adapter/a;

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->d:Landroid/widget/GridView;

    invoke-virtual {v1, v0}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 13
    new-instance v0, Lcom/join/mgps/db/tables/HeadPortraitTable;

    invoke-direct {v0}, Lcom/join/mgps/db/tables/HeadPortraitTable;-><init>()V

    const v1, 0x7f08030a

    .line 14
    invoke-virtual {v0, v1}, Lcom/join/mgps/db/tables/HeadPortraitTable;->setId(I)V

    const-string v1, "\u76f8\u673a"

    .line 15
    invoke-virtual {v0, v1}, Lcom/join/mgps/db/tables/HeadPortraitTable;->setHead_portrait_pic(Ljava/lang/String;)V

    .line 16
    iget-object v1, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->f:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->n:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->f:Ljava/util/List;

    iget-object v1, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->n:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->c:Lcom/join/mgps/adapter/a;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->m:Z

    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/MGChooseIconActivity;->l0()V

    .line 22
    invoke-virtual {p0}, Lcom/join/mgps/activity/MGChooseIconActivity;->i0()V

    return-void
.end method

.method back_image()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method error(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method h0()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getLocalUserIcon()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 6
    invoke-static {}, Lcom/facebook/drawee/backends/pipeline/Fresco;->getImagePipeline()Lcom/facebook/imagepipeline/core/g;

    move-result-object v0

    invoke-static {v1}, Lcom/join/android/app/common/utils/MyImageLoader;->G(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/imagepipeline/core/g;->e(Landroid/net/Uri;)V

    .line 7
    :cond_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/b;->setLocalUserIcon(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method i0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/HeadPicRequestBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/HeadPicRequestBean;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->h:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/HeadPicRequestBean;->setUid(I)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->h:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/HeadPicRequestBean;->setToken(Ljava/lang/String;)V

    .line 5
    invoke-static {v0}, Lcom/join/mgps/Util/x1;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/HeadPicRequestBean;->setSign(Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->i:Lcom/join/mgps/rpc/b;

    invoke-virtual {v0}, Lcom/join/mgps/dto/HeadPicRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/b;->t(Ljava/util/Map;)Lcom/join/mgps/dto/AccountResultMainBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getError()I

    move-result v1

    if-nez v1, :cond_0

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/UserHeadPortrait;

    invoke-virtual {v1}, Lcom/join/mgps/dto/UserHeadPortrait;->isIs_success()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->m:Z

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/UserHeadPortrait;

    invoke-virtual {v0}, Lcom/join/mgps/dto/UserHeadPortrait;->getHead_portrait_pic()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/MGChooseIconActivity;->k0(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->m:Z

    if-nez v0, :cond_3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 12
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    iget-boolean v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->m:Z

    if-nez v0, :cond_3

    .line 14
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/MGChooseIconActivity;->j0()V

    goto :goto_2

    .line 15
    :goto_1
    iget-boolean v1, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->m:Z

    if-nez v1, :cond_1

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/activity/MGChooseIconActivity;->j0()V

    .line 17
    :cond_1
    throw v0

    .line 18
    :cond_2
    iget-boolean v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->m:Z

    if-nez v0, :cond_3

    .line 19
    invoke-virtual {p0}, Lcom/join/mgps/activity/MGChooseIconActivity;->j0()V

    :cond_3
    :goto_2
    return-void
.end method

.method j0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->l:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->d:Landroid/widget/GridView;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setVisibility(I)V

    return-void
.end method

.method k0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->d:Landroid/widget/GridView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setVisibility(I)V

    .line 4
    invoke-static {}, Lb2/y;->n()Lb2/y;

    move-result-object v0

    invoke-virtual {v0}, Lp1/b;->a()I

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 6
    new-instance v0, Lcom/join/mgps/db/tables/HeadPortraitTable;

    invoke-direct {v0}, Lcom/join/mgps/db/tables/HeadPortraitTable;-><init>()V

    .line 7
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/join/mgps/db/tables/HeadPortraitTable;->setHead_portrait_pic(Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lb2/y;->n()Lb2/y;

    move-result-object v2

    invoke-virtual {v2, v0}, Lp1/b;->k(Ljava/lang/Object;)I

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Lb2/y;->n()Lb2/y;

    move-result-object p1

    invoke-virtual {p1}, Lp1/b;->d()Ljava/util/List;

    move-result-object p1

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->f:Ljava/util/List;

    iget-object v1, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->n:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->c:Lcom/join/mgps/adapter/a;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method l0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->m:Z

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->d:Landroid/widget/GridView;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->d:Landroid/widget/GridView;

    invoke-virtual {v0, v2}, Landroid/widget/GridView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method m0(Ljava/lang/String;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->h:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/wufan/user/service/protobuf/n0$b;

    .line 2
    invoke-virtual {v0, p1}, Lcom/wufan/user/service/protobuf/n0$b;->K3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object v0

    check-cast v0, Lcom/wufan/user/service/protobuf/n0;

    iput-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->h:Lcom/wufan/user/service/protobuf/n0;

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->h:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v0, v1, p0}, Lcom/join/mgps/Util/b;->saveAccountData(Lcom/wufan/user/service/protobuf/n0;Landroid/content/Context;)V

    .line 5
    invoke-static {}, Lcom/join/mgps/listener/a;->b()Lcom/join/mgps/listener/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/listener/a;->c()V

    .line 6
    :try_start_0
    invoke-static {p1}, Lcom/join/android/app/common/utils/MyImageLoader;->k(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/activity/MGChooseIconActivity;->h0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    const/16 p1, 0x2711

    .line 9
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method n0(Ljava/lang/String;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "\u8fde\u63a5\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002"

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/MGChooseIconActivity;->showLoading()V

    .line 3
    :try_start_0
    new-instance v1, Lcom/join/mgps/dto/AccountChangeUserinfoRequestBean;

    invoke-direct {v1}, Lcom/join/mgps/dto/AccountChangeUserinfoRequestBean;-><init>()V

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->h:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->v1()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/AccountChangeUserinfoRequestBean;->setGender(I)V

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->h:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getAccount()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/AccountChangeUserinfoRequestBean;->setAccount(Ljava/lang/String;)V

    .line 6
    iget-object v2, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->h:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getNickname()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/AccountChangeUserinfoRequestBean;->setNick_name(Ljava/lang/String;)V

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->h:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/AccountChangeUserinfoRequestBean;->setUid(I)V

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->h:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/AccountChangeUserinfoRequestBean;->setToken(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/AccountChangeUserinfoRequestBean;->setAvatar_src(Ljava/lang/String;)V

    .line 10
    invoke-static {v1}, Lcom/join/mgps/Util/x1;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/AccountChangeUserinfoRequestBean;->setSign(Ljava/lang/String;)V

    .line 11
    iget-object v2, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->i:Lcom/join/mgps/rpc/b;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AccountChangeUserinfoRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/join/mgps/rpc/b;->c(Ljava/util/Map;)Lcom/join/mgps/dto/AccountResultMainBean;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 12
    invoke-virtual {v1}, Lcom/join/mgps/dto/AccountResultMainBean;->getError()I

    move-result v2

    if-nez v2, :cond_1

    .line 13
    invoke-virtual {v1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/AccountTokenSuccess;

    invoke-virtual {v2}, Lcom/join/mgps/dto/AccountTokenSuccess;->is_success()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 14
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/MGChooseIconActivity;->m0(Ljava/lang/String;)V

    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v1}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/AccountTokenSuccess;

    invoke-virtual {p1}, Lcom/join/mgps/dto/AccountTokenSuccess;->getError_msg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/MGChooseIconActivity;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/MGChooseIconActivity;->error(Ljava/lang/String;)V

    .line 17
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/MGChooseIconActivity;->showLodingDismis()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 19
    invoke-virtual {p0}, Lcom/join/mgps/activity/MGChooseIconActivity;->showLodingDismis()V

    .line 20
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/MGChooseIconActivity;->error(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const-string p1, "\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u5148\u68c0\u67e5\u7f51\u7edc\u3002"

    .line 21
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/MGChooseIconActivity;->error(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->g:Lcom/join/mgps/dialog/d1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->g:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 3
    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onDestroy()V

    return-void
.end method

.method relodingimag()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/MGChooseIconActivity;->l0()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/MGChooseIconActivity;->i0()V

    return-void
.end method

.method setNetwork()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showLoading()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->g:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method showLodingDismis()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->g:Lcom/join/mgps/dialog/d1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MGChooseIconActivity;->g:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method
