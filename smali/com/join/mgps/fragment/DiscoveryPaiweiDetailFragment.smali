.class public Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;
.super Landroidx/fragment/app/Fragment;
.source "DiscoveryPaiweiDetailFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$b;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c04eb
.end annotation


# instance fields
.field b:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroidx/cardview/widget/CardView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroidx/constraintlayout/widget/Group;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroidx/cardview/widget/CardView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field o:I
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field private p:Landroid/content/Context;

.field private q:Lcom/join/mgps/Util/AccountUtil_;

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;",
            ">;"
        }
    .end annotation
.end field

.field private s:I

.field private t:Z

.field private final u:Ljava/lang/String;

.field private v:Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$b;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/join/mgps/rpc/h;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/game/discover/detail"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->u:Ljava/lang/String;

    return-void
.end method

.method private X(Z)V
    .locals 6

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->p:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v0, v2, v3}, Lcom/join/mgps/Util/UtilsMy;->V(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZZ)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFight_fun()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v4, 0x31

    const/16 v5, 0xc

    if-le v2, v5, :cond_1

    iget-object v2, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->p:Landroid/content/Context;

    invoke-virtual {p0, v2, v0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->a0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v4, :cond_1

    .line 6
    iput v3, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->s:I

    .line 7
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v5, 0xe

    if-le v2, v5, :cond_2

    iget-object v2, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->p:Landroid/content/Context;

    invoke-virtual {p0, v2, v0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->a0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 8
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v4, :cond_2

    .line 9
    iput v5, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->s:I

    .line 10
    :cond_2
    iget v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->s:I

    if-eq v1, v3, :cond_3

    if-eq v1, v5, :cond_3

    const-string p1, "\u8be5\u6e38\u620f\u6682\u4e0d\u652f\u6301\u6392\u4f4d\u8d5b"

    .line 11
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->showMessage(Ljava/lang/String;)V

    return-void

    .line 12
    :cond_3
    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->p:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 13
    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->p:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/join/mgps/Util/UtilsMy;->W(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v0

    if-nez v0, :cond_4

    if-nez p1, :cond_4

    .line 14
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->p:Landroid/content/Context;

    const-string v0, "\u6b63\u5728\u4e0b\u8f7d\u63d2\u4ef6..."

    invoke-static {p1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    .line 15
    :cond_4
    sget-object p1, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {p1}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object p1

    instance-of p1, p1, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;

    if-eqz p1, :cond_6

    .line 16
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->p:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/activity/GamePaiWeiActivty_;->o0(Landroid/content/Context;)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/GamePaiWeiActivty_$v;->a(Ljava/lang/String;)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object p1

    iget v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->o:I

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/GamePaiWeiActivty_$v;->b(I)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object p1

    iget v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->s:I

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/GamePaiWeiActivty_$v;->c(I)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_0

    :cond_5
    const-string p1, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    .line 17
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->showMessage(Ljava/lang/String;)V

    :cond_6
    :goto_0
    return-void
.end method


# virtual methods
.method V()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->p:Landroid/content/Context;

    .line 2
    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->q:Lcom/join/mgps/Util/AccountUtil_;

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->r:Ljava/util/List;

    .line 5
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$b;

    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->r:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$b;-><init>(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->v:Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$b;

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->p:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->v:Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$b;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->Z()V

    return-void
.end method

.method W()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->n:Ljava/lang/String;

    const-string v2, "gameDownloadDetail"

    invoke-virtual {v0, v2, v1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    const-string v1, "fromRecomDown"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Z)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    const/16 v1, 0x9b

    const-string v3, "_from"

    invoke-virtual {v0, v3, v1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;I)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    .line 3
    iput-boolean v2, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->t:Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->X(Z)V

    :goto_0
    return-void
.end method

.method Z()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->showLoding()V

    .line 2
    new-instance v0, Lcom/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/google/gson/JsonObject;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->n:Ljava/lang/String;

    const-string v2, "gameId"

    invoke-virtual {v0, v2, v1}, Lcom/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->q:Lcom/join/mgps/Util/AccountUtil_;

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v1

    const-string v2, "token"

    invoke-virtual {v0, v2, v1}, Lcom/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->q:Lcom/join/mgps/Util/AccountUtil_;

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    const-string v2, "uid "

    invoke-virtual {v0, v2, v1}, Lcom/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-static {v0}, Lcom/papa91/arc/util/SignUtils;->buildRequestSign(Lcom/google/gson/JsonObject;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sign"

    invoke-virtual {v0, v2, v1}, Lcom/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/join/android/app/common/http/d;->G()Lcom/join/android/app/common/http/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/android/app/common/http/d;->H()Lcom/join/android/app/common/http/d$o;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->u:Ljava/lang/String;

    new-instance v3, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$a;

    invoke-direct {v3, p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$a;-><init>(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;)V

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/join/android/app/common/http/d$o;->v(Ljava/lang/String;Lcom/google/gson/JsonObject;Lcom/join/android/app/common/http/d$p;Ljava/lang/Object;)V

    return-void
.end method

.method a0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    .line 2
    :goto_0
    :try_start_1
    sget-object v2, Lcom/join/mgps/enums/ConstantIntEnum;->FBA:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v2}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v2

    if-eq v1, v2, :cond_1

    sget-object v2, Lcom/join/mgps/enums/ConstantIntEnum;->FC:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v2}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v2

    if-ne v1, v2, :cond_5

    .line 3
    :cond_1
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v1

    invoke-virtual {v1, p2}, Lb2/o;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object p2

    .line 5
    new-instance v1, Lcom/join/android/app/common/utils/APKUtils;

    invoke-direct {v1}, Lcom/join/android/app/common/utils/APKUtils;-><init>()V

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/db/tables/EMUApkTable;->getPackage_name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    if-eqz v1, :cond_3

    .line 7
    :try_start_2
    invoke-virtual {p2}, Lcom/join/mgps/db/tables/EMUApkTable;->getPackage_name()Ljava/lang/String;

    move-result-object p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 8
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    if-nez p1, :cond_2

    return v0

    .line 9
    :cond_2
    :try_start_4
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    const/16 p2, 0x14a

    if-gt p1, p2, :cond_5

    return v0

    :catch_1
    move-exception p1

    .line 10
    :try_start_5
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    :catch_2
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    return v0

    :catch_3
    move-exception p1

    .line 12
    :try_start_6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return v0

    .line 13
    :cond_3
    invoke-virtual {p2}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_4

    .line 14
    invoke-virtual {p2}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    move-result v1

    if-ne v1, v2, :cond_4

    new-array v1, v0, [Ljava/lang/String;

    .line 15
    invoke-static {p1, p2, v0, v1}, Lcom/join/android/app/common/utils/l;->t(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;Z[Ljava/lang/String;)Z

    move-result p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    return p1

    :cond_4
    return v0

    :catch_4
    move-exception p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method b0(Ljava/lang/String;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "code"

    .line 2
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    const/16 v1, 0xc8

    if-ne p1, v1, :cond_4

    const-string p1, "data"

    .line 3
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    const-class v1, Lcom/join/mgps/dto/DiscoveryPaiweiGameBean;

    invoke-virtual {v0, p1, v1}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/DiscoveryPaiweiGameBean;

    if-eqz p1, :cond_3

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryPaiweiGameBean;->getDetail()Lcom/join/mgps/dto/DiscoveryPaiweiGameDetailBean;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->showMain()V

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryPaiweiGameBean;->getDetail()Lcom/join/mgps/dto/DiscoveryPaiweiGameDetailBean;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryPaiweiGameDetailBean;->getRank_list()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->r:Ljava/util/List;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryPaiweiGameDetailBean;->getRank_list()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->v:Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$b;

    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->r:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryPaiweiGameDetailBean;->getBig_img()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->f:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u4eca\u65e5"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryPaiweiGameDetailBean;->getNum()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\u4eba\u6311\u6218"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->d:Landroidx/cardview/widget/CardView;

    if-eqz v0, :cond_6

    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->e:Landroid/widget/TextView;

    if-eqz v1, :cond_6

    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 16
    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryPaiweiGameDetailBean;->getMonth_best()Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 17
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->e:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u7b2c"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryPaiweiGameDetailBean;->getMonth_best()Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;->getRank()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\u540d"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 18
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->e:Landroid/widget/TextView;

    const-string v0, "\u6682\u65e0\u6210\u7ee9"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 19
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->showEmpty()V

    goto :goto_0

    :cond_4
    const-string p1, "message"

    .line 20
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 21
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 22
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->showMessage(Ljava/lang/String;)V

    .line 23
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->showLodingFailed()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 24
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 25
    invoke-virtual {p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->showLodingFailed()V

    :cond_6
    :goto_0
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

    return-void
.end method

.method public onEventMainThread(Lcom/join/mgps/event/n;)V
    .locals 4
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq p1, v1, :cond_4

    const/4 v1, 0x5

    if-eq p1, v1, :cond_2

    const/16 v1, 0xb

    if-eq p1, v1, :cond_0

    const/16 v1, 0x30

    if-eq p1, v1, :cond_0

    goto/16 :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->n:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 4
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->n:Ljava/lang/String;

    invoke-static {v1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->t:Z

    if-eqz v1, :cond_6

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->k:Landroid/widget/TextView;

    const-string v0, "\u5b89\u88c5\u4e2d"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->l:Landroidx/cardview/widget/CardView;

    invoke-virtual {p1, v2}, Landroid/widget/FrameLayout;->setClickable(Z)V

    goto :goto_0

    .line 7
    :cond_2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->n:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 8
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->n:Ljava/lang/String;

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-boolean v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->t:Z

    if-eqz v1, :cond_6

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 9
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->k:Landroid/widget/TextView;

    const-string v0, "\u53bb\u6311\u6218"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->l:Landroidx/cardview/widget/CardView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setClickable(Z)V

    .line 11
    invoke-direct {p0, v0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->X(Z)V

    goto :goto_0

    .line 12
    :cond_4
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->n:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 13
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->n:Ljava/lang/String;

    invoke-static {v1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-boolean v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->t:Z

    if-eqz v1, :cond_6

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 14
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->k:Landroid/widget/TextView;

    const-string v0, "\u4e0b\u8f7d\u4e2d"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->l:Landroidx/cardview/widget/CardView;

    invoke-virtual {p1, v2}, Landroid/widget/FrameLayout;->setClickable(Z)V

    :cond_6
    :goto_0
    return-void
.end method

.method relodingimag()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->r:Ljava/util/List;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->r:Ljava/util/List;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->Z()V

    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showEmpty()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->j:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->h:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->g:Landroidx/constraintlayout/widget/Group;

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method showLoding()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "\u663e\u793a\u52a0\u8f7d\u4e2d"

    .line 1
    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->h:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    .line 5
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->i:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->g:Landroidx/constraintlayout/widget/Group;

    if-eqz v0, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method showLodingFailed()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->i:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    .line 4
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->h:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->g:Landroidx/constraintlayout/widget/Group;

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method showMain()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "\u663e\u793a\u4e3b\u754c\u9762main"

    .line 1
    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->i:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->h:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->g:Landroidx/constraintlayout/widget/Group;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method
