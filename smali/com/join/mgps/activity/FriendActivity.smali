.class public Lcom/join/mgps/activity/FriendActivity;
.super Lcom/BaseActivity;
.source "FriendActivity.java"

# interfaces
.implements Lcom/join/mgps/adapter/FriendListAdapter$b;
.implements Landroid/view/View$OnSystemUiVisibilityChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/FriendActivity$g;,
        Lcom/join/mgps/activity/FriendActivity$j;,
        Lcom/join/mgps/activity/FriendActivity$i;,
        Lcom/join/mgps/activity/FriendActivity$h;
    }
.end annotation


# instance fields
.field A:Landroidx/recyclerview/widget/RecyclerView;

.field B:Landroidx/recyclerview/widget/RecyclerView;

.field C:Lcom/join/mgps/activity/FriendActivity$j;

.field D:Lcom/join/mgps/activity/FriendActivity$g;

.field private E:I

.field F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameInfoBean;",
            ">;"
        }
    .end annotation
.end field

.field G:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameInfoBean;",
            ">;"
        }
    .end annotation
.end field

.field H:Lcom/join/mgps/dto/GameInfoBean;

.field I:Z

.field J:Landroid/view/View;

.field K:Landroidx/recyclerview/widget/RecyclerView;

.field L:Lcom/join/mgps/activity/FriendActivity$g;

.field M:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameInfoBean;",
            ">;"
        }
    .end annotation
.end field

.field b:Landroidx/fragment/app/FragmentManager;

.field protected c:Lcom/join/mgps/fragment/FriendFragment;

.field private d:Lcom/join/mgps/fragment/FriendAddFragment;

.field private e:Lcom/join/mgps/fragment/FriendMessageFragment;

.field private f:Lcom/join/mgps/fragment/FriendCardFragment;

.field private g:Lcom/join/mgps/fragment/CloudListFragment;

.field h:Landroid/os/Handler;

.field protected i:Ljava/lang/String;

.field protected j:Ljava/lang/String;

.field protected k:Ljava/lang/String;

.field l:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field protected m:Z

.field n:Lcom/join/mgps/dialog/i;

.field o:Lcom/join/mgps/dialog/m;

.field p:Lcom/join/mgps/dto/FriendBean;

.field q:Z

.field r:Z

.field s:Landroid/content/BroadcastReceiver;

.field t:Landroid/app/Dialog;

.field u:Lcom/facebook/drawee/view/SimpleDraweeView;

.field v:Landroid/view/View;

.field w:Landroid/view/View;

.field x:Landroid/widget/TextView;

.field y:Landroid/widget/TextView;

.field z:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/BaseActivity;-><init>()V

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->h:Landroid/os/Handler;

    .line 3
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->l:Ljava/util/LinkedList;

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->m:Z

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, Lcom/join/mgps/activity/FriendActivity;->q:Z

    .line 7
    iput-boolean v1, p0, Lcom/join/mgps/activity/FriendActivity;->r:Z

    .line 8
    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->C:Lcom/join/mgps/activity/FriendActivity$j;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->D:Lcom/join/mgps/activity/FriendActivity$g;

    const/16 v2, -0x400

    .line 10
    iput v2, p0, Lcom/join/mgps/activity/FriendActivity;->E:I

    .line 11
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->F:Ljava/util/List;

    .line 12
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->G:Ljava/util/List;

    .line 13
    iput-boolean v1, p0, Lcom/join/mgps/activity/FriendActivity;->I:Z

    .line 14
    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->L:Lcom/join/mgps/activity/FriendActivity$g;

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->M:Ljava/util/List;

    return-void
.end method

.method private synthetic F0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->checkClipboard()V

    return-void
.end method

.method private synthetic G0(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->t:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method private synthetic H0(ILandroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->isLogined(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->isTourist(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->add(I)V

    .line 3
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v0, "3"

    .line 4
    invoke-virtual {p1, v0}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object v0, Lcom/papa/sim/statistic/Event;->addFriends:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2, v0, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->t:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void

    .line 7
    :cond_1
    :goto_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/IntentUtil;->goMyAccountLoginActivity(Landroid/content/Context;)V

    return-void
.end method

.method private synthetic I0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p2

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    invoke-virtual {v0, p2}, Lcom/join/mgps/dto/FriendBean;->setGameId(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/FriendBean;->setElite(Z)V

    .line 4
    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/FriendActivity;->D0(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, p2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p2

    .line 6
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v0

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb2/o;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v0

    .line 7
    invoke-static {p1}, Lcom/join/mgps/dialog/PlugInstallDialog_;->k0(Landroid/content/Context;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->c(Lcom/join/mgps/db/tables/EMUApkTable;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->a(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object p1

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->b(I)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/FriendActivity;->checkGameIsInstall(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 9
    invoke-direct {p0, p2}, Lcom/join/mgps/activity/FriendActivity;->R0(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 10
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    invoke-virtual {p1, p2}, Lcom/wufan/friend/chat/c;->o(Lcom/join/mgps/dto/FriendBean;)V

    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    goto :goto_0

    :cond_1
    const/16 p1, 0x2710

    .line 12
    invoke-virtual {p0, p2, p1}, Lcom/join/mgps/activity/FriendActivity;->startDownloadActivity(Ljava/lang/String;I)V

    :cond_2
    :goto_0
    return-void
.end method

.method private synthetic J0(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->z:Landroid/view/View;

    if-eqz p1, :cond_0

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private synthetic K0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->F:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/GameInfoBean;

    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->H:Lcom/join/mgps/dto/GameInfoBean;

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/FriendActivity;->w0()V

    return-void
.end method

.method private synthetic L0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->G:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/GameInfoBean;

    .line 2
    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->H:Lcom/join/mgps/dto/GameInfoBean;

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameInfoBean;->getGame_id()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->S0(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->A0()V

    return-void
.end method

.method private synthetic M0(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->J:Landroid/view/View;

    if-eqz p1, :cond_0

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private synthetic N0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->M:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/GameInfoBean;

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameInfoBean;->getGame_id()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->S0(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->B0()V

    return-void
.end method

.method private synthetic O0(Lapp/mgsim/arena/ArenaRequest;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/customview/input/a;

    const-string v1, "\u8bf7\u8f93\u5165\u623f\u95f4\u5bc6\u7801"

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/join/mgps/customview/input/a;-><init>(Landroid/content/Context;Ljava/lang/String;IZ)V

    .line 2
    new-instance v1, Lcom/join/mgps/activity/FriendActivity$f;

    invoke-direct {v1, p0, v0, p1}, Lcom/join/mgps/activity/FriendActivity$f;-><init>(Lcom/join/mgps/activity/FriendActivity;Lcom/join/mgps/customview/input/a;Lapp/mgsim/arena/ArenaRequest;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/input/a;->g(Lcom/join/mgps/customview/input/InputNumView$d;)V

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/customview/input/a;->h()V

    return-void
.end method

.method private synthetic P0(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method private R0(Ljava/lang/String;)Z
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 2
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb2/o;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v1

    const/4 v2, 0x1

    .line 3
    invoke-static {p0, p1, v0, v1, v2}, Lcom/join/mgps/Util/UtilsMy;->V1(Landroid/content/Context;Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/db/tables/EMUApkTable;Z)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method private V0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->g:Lcom/join/mgps/fragment/CloudListFragment;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragment_;

    invoke-direct {v0}, Lcom/join/mgps/fragment/CloudListFragment_;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->g:Lcom/join/mgps/fragment/CloudListFragment;

    .line 3
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const/4 v1, 0x1

    const-string v2, "type"

    .line 4
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->i:Ljava/lang/String;

    const-string v2, "gameid"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x3

    const-string v2, "typeIndex"

    .line 6
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->g:Lcom/join/mgps/fragment/CloudListFragment;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->b:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f09061d

    iget-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->g:Lcom/join/mgps/fragment/CloudListFragment;

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    :cond_0
    return-void
.end method

.method public static synthetic g0(Lcom/join/mgps/activity/FriendActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->N0(I)V

    return-void
.end method

.method public static synthetic h0(Lcom/join/mgps/activity/FriendActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->P0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic i0(Lcom/join/mgps/activity/FriendActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->J0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j0(Lcom/join/mgps/activity/FriendActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->M0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k0(Lcom/join/mgps/activity/FriendActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->L0(I)V

    return-void
.end method

.method public static synthetic l0(Lcom/join/mgps/activity/FriendActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->K0(I)V

    return-void
.end method

.method public static synthetic m0(Lcom/join/mgps/activity/FriendActivity;ILandroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/FriendActivity;->H0(ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic n0(Lcom/join/mgps/activity/FriendActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->G0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o0(Lcom/join/mgps/activity/FriendActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/mgps/activity/FriendActivity;->F0()V

    return-void
.end method

.method public static synthetic p0(Lcom/join/mgps/activity/FriendActivity;Lapp/mgsim/arena/ArenaRequest;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->O0(Lapp/mgsim/arena/ArenaRequest;)V

    return-void
.end method

.method public static synthetic q0(Lcom/join/mgps/activity/FriendActivity;Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/FriendActivity;->I0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic r0(Lcom/join/mgps/activity/FriendActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/FriendActivity;->E:I

    return p0
.end method

.method static synthetic s0(Lcom/join/mgps/activity/FriendActivity;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/FriendActivity;->E:I

    return p1
.end method

.method static synthetic t0(Lcom/join/mgps/activity/FriendActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/FriendActivity;->w0()V

    return-void
.end method

.method private w0()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->H:Lcom/join/mgps/dto/GameInfoBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameInfoBean;->getCollection_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->H:Lcom/join/mgps/dto/GameInfoBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameInfoBean;->getGame_id()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->H:Lcom/join/mgps/dto/GameInfoBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameInfoBean;->getCollection_id()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    .line 4
    :goto_0
    invoke-static {p0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/join/mgps/Util/RequestBeanUtil;->getRequestArenaRoomListArgs(Ljava/lang/String;I)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v0

    .line 5
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/rpc/impl/d;->O1()Le2/d;

    move-result-object v1

    invoke-interface {v1, v0}, Le2/d;->q(Lcom/join/mgps/dto/CommonRequestBean;)Lretrofit2/Call;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/FriendActivity$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/FriendActivity$e;-><init>(Lcom/join/mgps/activity/FriendActivity;)V

    invoke-interface {v0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method private x0()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/l;->n0()Lcom/join/mgps/rpc/impl/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/rpc/impl/l;->m0()Le2/k;

    move-result-object v0

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Le2/k;->u(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/FriendActivity$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/FriendActivity$d;-><init>(Lcom/join/mgps/activity/FriendActivity;)V

    invoke-interface {v0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    return-void
.end method


# virtual methods
.method public A0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->z:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public B0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->J:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method C0(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/FriendBean;->getGameId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/FriendBean;->getGameId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public D0(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDown_type()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    .line 3
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb2/o;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p1

    const/16 v2, 0xb

    if-eq p1, v2, :cond_3

    :cond_2
    if-eqz v1, :cond_4

    invoke-static {v1}, Lcom/join/android/app/common/utils/l;->i(Lcom/join/mgps/db/tables/EMUApkTable;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    return v0
.end method

.method protected E0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public K(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->l:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->k:Ljava/lang/String;

    .line 3
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/FriendActivity;->y0(I)V

    return-void
.end method

.method public O(Lcom/join/mgps/dto/FriendBean;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    .line 2
    :cond_1
    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/FriendBean;->getGameId()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->D0(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 5
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    invoke-virtual {p1, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 6
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb2/o;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v0

    .line 7
    invoke-static {p0}, Lcom/join/mgps/dialog/PlugInstallDialog_;->k0(Landroid/content/Context;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->c(Lcom/join/mgps/db/tables/EMUApkTable;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->a(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->b(I)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void

    .line 8
    :cond_2
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->checkGameIsInstall(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 9
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->R0(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 10
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/wufan/friend/chat/c;->p(Lcom/join/mgps/dto/FriendBean;)V

    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    goto :goto_0

    :cond_3
    const/16 p1, 0x2711

    .line 12
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/activity/FriendActivity;->startDownloadActivity(Ljava/lang/String;I)V

    :cond_4
    :goto_0
    return-void
.end method

.method Q0(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->b:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->c:Lcom/join/mgps/fragment/FriendFragment;

    if-eqz v1, :cond_1

    .line 3
    instance-of v1, p0, Lcom/join/mgps/activity/GameMainActivity4_;

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->u0(Landroidx/fragment/app/FragmentTransaction;)V

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->c:Lcom/join/mgps/fragment/FriendFragment;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentTransaction;->hide(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 5
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->d:Lcom/join/mgps/fragment/FriendAddFragment;

    if-eqz v1, :cond_2

    .line 6
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->u0(Landroidx/fragment/app/FragmentTransaction;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->d:Lcom/join/mgps/fragment/FriendAddFragment;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentTransaction;->hide(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 8
    :cond_2
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->e:Lcom/join/mgps/fragment/FriendMessageFragment;

    if-eqz v1, :cond_3

    .line 9
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->u0(Landroidx/fragment/app/FragmentTransaction;)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->e:Lcom/join/mgps/fragment/FriendMessageFragment;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentTransaction;->hide(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 11
    :cond_3
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->f:Lcom/join/mgps/fragment/FriendCardFragment;

    if-eqz v1, :cond_4

    .line 12
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->u0(Landroidx/fragment/app/FragmentTransaction;)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->f:Lcom/join/mgps/fragment/FriendCardFragment;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentTransaction;->hide(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 14
    :cond_4
    :try_start_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 16
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->b:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    if-nez p1, :cond_7

    .line 17
    instance-of p1, p0, Lcom/join/mgps/activity/GameMainActivity4_;

    if-eqz p1, :cond_5

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->u0(Landroidx/fragment/app/FragmentTransaction;)V

    .line 18
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->c:Lcom/join/mgps/fragment/FriendFragment;

    if-nez p1, :cond_6

    .line 19
    new-instance p1, Lcom/join/mgps/fragment/FriendFragment_;

    invoke-direct {p1}, Lcom/join/mgps/fragment/FriendFragment_;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->c:Lcom/join/mgps/fragment/FriendFragment;

    .line 20
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 21
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->i:Ljava/lang/String;

    const-string v2, "gameId"

    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->j:Ljava/lang/String;

    const-string v2, "type"

    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->c:Lcom/join/mgps/fragment/FriendFragment;

    invoke-virtual {v1, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 24
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->v0()I

    move-result p1

    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->c:Lcom/join/mgps/fragment/FriendFragment;

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    goto/16 :goto_1

    .line 25
    :cond_6
    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentTransaction;->show(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    goto/16 :goto_1

    :cond_7
    const/4 v1, 0x1

    if-ne p1, v1, :cond_9

    .line 26
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->u0(Landroidx/fragment/app/FragmentTransaction;)V

    .line 27
    iget-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->d:Lcom/join/mgps/fragment/FriendAddFragment;

    if-nez p1, :cond_8

    .line 28
    new-instance p1, Lcom/join/mgps/fragment/FriendAddFragment_;

    invoke-direct {p1}, Lcom/join/mgps/fragment/FriendAddFragment_;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->d:Lcom/join/mgps/fragment/FriendAddFragment;

    .line 29
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->v0()I

    move-result p1

    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->d:Lcom/join/mgps/fragment/FriendAddFragment;

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    goto :goto_1

    .line 30
    :cond_8
    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentTransaction;->show(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    goto :goto_1

    :cond_9
    const/4 v1, 0x2

    if-ne p1, v1, :cond_b

    .line 31
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->u0(Landroidx/fragment/app/FragmentTransaction;)V

    .line 32
    iget-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->e:Lcom/join/mgps/fragment/FriendMessageFragment;

    if-nez p1, :cond_a

    .line 33
    new-instance p1, Lcom/join/mgps/fragment/FriendMessageFragment_;

    invoke-direct {p1}, Lcom/join/mgps/fragment/FriendMessageFragment_;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->e:Lcom/join/mgps/fragment/FriendMessageFragment;

    .line 34
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->v0()I

    move-result p1

    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->e:Lcom/join/mgps/fragment/FriendMessageFragment;

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    goto :goto_1

    .line 35
    :cond_a
    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentTransaction;->show(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    goto :goto_1

    :cond_b
    const/4 v1, 0x3

    if-ne p1, v1, :cond_d

    .line 36
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->u0(Landroidx/fragment/app/FragmentTransaction;)V

    .line 37
    iget-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->f:Lcom/join/mgps/fragment/FriendCardFragment;

    if-nez p1, :cond_c

    .line 38
    new-instance p1, Lcom/join/mgps/fragment/FriendCardFragment_;

    invoke-direct {p1}, Lcom/join/mgps/fragment/FriendCardFragment_;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->f:Lcom/join/mgps/fragment/FriendCardFragment;

    .line 39
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 40
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->k:Ljava/lang/String;

    const-string v2, "ruid"

    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->f:Lcom/join/mgps/fragment/FriendCardFragment;

    invoke-virtual {v1, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 42
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->v0()I

    move-result p1

    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->f:Lcom/join/mgps/fragment/FriendCardFragment;

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    goto :goto_1

    .line 43
    :cond_c
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->k:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/join/mgps/fragment/FriendCardFragment;->z0(Ljava/lang/String;)V

    .line 44
    iget-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->f:Lcom/join/mgps/fragment/FriendCardFragment;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentTransaction;->show(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 45
    :cond_d
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-void
.end method

.method S0(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/FriendBean;->setGameId(Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/FriendBean;->setElite(Z)V

    .line 3
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->D0(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 5
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb2/o;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v0

    .line 6
    invoke-static {p0}, Lcom/join/mgps/dialog/PlugInstallDialog_;->k0(Landroid/content/Context;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->c(Lcom/join/mgps/db/tables/EMUApkTable;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->a(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/join/mgps/dialog/PlugInstallDialog_$a;->b(I)Lcom/join/mgps/dialog/PlugInstallDialog_$a;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void

    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->checkGameIsInstall(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->R0(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 9
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    invoke-virtual {p1, v0}, Lcom/wufan/friend/chat/c;->o(Lcom/join/mgps/dto/FriendBean;)V

    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    goto :goto_0

    :cond_1
    const/16 v0, 0x2710

    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/activity/FriendActivity;->startDownloadActivity(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method public T0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->l:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->l:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->pop()Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->l:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->Q0(I)V

    return-void
.end method

.method U0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->o:Lcom/join/mgps/dialog/m;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/dialog/m;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/m;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->o:Lcom/join/mgps/dialog/m;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->o:Lcom/join/mgps/dialog/m;

    invoke-virtual {v0}, Lcom/join/mgps/dialog/m;->g()V

    return-void
.end method

.method W0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->n:Lcom/join/mgps/dialog/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dialog/i;->c()V

    .line 2
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->s()Ljava/util/List;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/join/mgps/activity/z;

    invoke-direct {v1, p0, p0}, Lcom/join/mgps/activity/z;-><init>(Lcom/join/mgps/activity/FriendActivity;Landroid/content/Context;)V

    .line 4
    new-instance v2, Lcom/join/mgps/dialog/i;

    invoke-direct {v2, p0, v1}, Lcom/join/mgps/dialog/i;-><init>(Landroid/app/Activity;Lcom/join/mgps/dialog/i$c;)V

    iput-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->n:Lcom/join/mgps/dialog/i;

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v2, v0, v1}, Lcom/join/mgps/dialog/i;->h(Ljava/util/List;Z)V

    if-eqz v0, :cond_2

    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->n:Lcom/join/mgps/dialog/i;

    invoke-virtual {v0}, Lcom/join/mgps/dialog/i;->j()V

    goto :goto_1

    .line 8
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->U0()V

    .line 9
    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->hideNavigationBar()V

    return-void
.end method

.method public X0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->z:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 3
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0c0690

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v2, v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->z:Landroid/view/View;

    const v3, 0x7f0910e9

    .line 4
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->B:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->z:Landroid/view/View;

    const v3, 0x7f0910ea

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    iget-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->z:Landroid/view/View;

    const v3, 0x7f09032d

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->v:Landroid/view/View;

    .line 7
    new-instance v3, Lcom/join/mgps/activity/r;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/r;-><init>(Lcom/join/mgps/activity/FriendActivity;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->B:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v3, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 9
    new-instance v2, Lcom/join/mgps/activity/FriendActivity$j;

    invoke-direct {v2, p0, p0}, Lcom/join/mgps/activity/FriendActivity$j;-><init>(Lcom/join/mgps/activity/FriendActivity;Landroid/content/Context;)V

    iput-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->C:Lcom/join/mgps/activity/FriendActivity$j;

    .line 10
    iget-object v3, p0, Lcom/join/mgps/activity/FriendActivity;->B:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 11
    iget-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v4, 0x3

    invoke-direct {v3, p0, v4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 12
    new-instance v2, Lcom/join/mgps/activity/FriendActivity$g;

    invoke-direct {v2, p0, p0, v1}, Lcom/join/mgps/activity/FriendActivity$g;-><init>(Lcom/join/mgps/activity/FriendActivity;Landroid/content/Context;Z)V

    iput-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->D:Lcom/join/mgps/activity/FriendActivity$g;

    .line 13
    invoke-virtual {v2}, Lcom/join/mgps/activity/FriendActivity$g;->b()Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->G:Ljava/util/List;

    .line 14
    iget-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, p0, Lcom/join/mgps/activity/FriendActivity;->D:Lcom/join/mgps/activity/FriendActivity$g;

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 15
    iget-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->C:Lcom/join/mgps/activity/FriendActivity$j;

    new-instance v3, Lcom/join/mgps/activity/y;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/y;-><init>(Lcom/join/mgps/activity/FriendActivity;)V

    invoke-virtual {v2, v3}, Lcom/join/mgps/activity/FriendActivity$j;->f(Lcom/join/mgps/activity/FriendActivity$h;)V

    .line 16
    iget-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->D:Lcom/join/mgps/activity/FriendActivity$g;

    new-instance v3, Lcom/join/mgps/activity/x;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/x;-><init>(Lcom/join/mgps/activity/FriendActivity;)V

    invoke-virtual {v2, v3}, Lcom/join/mgps/activity/FriendActivity$g;->g(Lcom/join/mgps/activity/FriendActivity$h;)V

    .line 17
    iget-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->z:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/FriendBean;->getSource()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->D:Lcom/join/mgps/activity/FriendActivity$g;

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/FriendActivity$g;->f(Z)V

    goto :goto_0

    .line 20
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->D:Lcom/join/mgps/activity/FriendActivity$g;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/FriendActivity$g;->f(Z)V

    .line 21
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->D:Lcom/join/mgps/activity/FriendActivity$g;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/FriendActivity$g;->h(Z)V

    .line 22
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->z:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 23
    invoke-direct {p0}, Lcom/join/mgps/activity/FriendActivity;->x0()V

    return-void
.end method

.method public Y0(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/wufan/friend/chat/protocol/r0;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->J:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 3
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0c0691

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v2, v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->J:Landroid/view/View;

    const v3, 0x7f0910ea

    .line 4
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->K:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->J:Landroid/view/View;

    const v3, 0x7f09032d

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 6
    new-instance v3, Lcom/join/mgps/activity/t;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/t;-><init>(Lcom/join/mgps/activity/FriendActivity;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->K:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v4, 0x3

    invoke-direct {v3, p0, v4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 8
    new-instance v2, Lcom/join/mgps/activity/FriendActivity$g;

    invoke-direct {v2, p0, p0, v1}, Lcom/join/mgps/activity/FriendActivity$g;-><init>(Lcom/join/mgps/activity/FriendActivity;Landroid/content/Context;Z)V

    iput-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->L:Lcom/join/mgps/activity/FriendActivity$g;

    .line 9
    invoke-virtual {v2}, Lcom/join/mgps/activity/FriendActivity$g;->b()Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->M:Ljava/util/List;

    .line 10
    iget-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->K:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, p0, Lcom/join/mgps/activity/FriendActivity;->L:Lcom/join/mgps/activity/FriendActivity$g;

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 11
    iget-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->L:Lcom/join/mgps/activity/FriendActivity$g;

    new-instance v3, Lcom/join/mgps/activity/w;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/w;-><init>(Lcom/join/mgps/activity/FriendActivity;)V

    invoke-virtual {v2, v3}, Lcom/join/mgps/activity/FriendActivity$g;->g(Lcom/join/mgps/activity/FriendActivity$h;)V

    .line 12
    iget-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->J:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->L:Lcom/join/mgps/activity/FriendActivity$g;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/FriendActivity$g;->h(Z)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->J:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 16
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/wufan/friend/chat/protocol/r0;

    .line 17
    new-instance v1, Lcom/join/mgps/dto/GameInfoBean;

    invoke-direct {v1}, Lcom/join/mgps/dto/GameInfoBean;-><init>()V

    .line 18
    invoke-virtual {v0}, Lcom/wufan/friend/chat/protocol/r0;->J1()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/GameInfoBean;->setPic_cover(Ljava/lang/String;)V

    .line 19
    invoke-virtual {v0}, Lcom/wufan/friend/chat/protocol/r0;->getGameName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/GameInfoBean;->setTitle(Ljava/lang/String;)V

    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/wufan/friend/chat/protocol/r0;->getGameId()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/GameInfoBean;->setGame_id(Ljava/lang/String;)V

    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/wufan/friend/chat/protocol/r0;->getGameName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/GameInfoBean;->setGame_name(Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->M:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 23
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->L:Lcom/join/mgps/activity/FriendActivity$g;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method add(I)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/join/mgps/dto/FriendReqBean;

    invoke-direct {v1}, Lcom/join/mgps/dto/FriendReqBean;-><init>()V

    .line 3
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/FriendReqBean;->setUid(I)V

    .line 4
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/FriendReqBean;->setToken(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/FriendReqBean;->setRuid(I)V

    const-string p1, "\u563f\uff0c\u4ea4\u4e2a\u670b\u53cb\uff0c\u5c11\u5e74~(*^\u25bd^*)"

    .line 6
    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/FriendReqBean;->setRequestInfo(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/join/mgps/rpc/impl/h;->p()Lcom/join/mgps/rpc/impl/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/rpc/impl/h;->o()Le2/h;

    move-result-object p1

    invoke-interface {p1, v1}, Le2/h;->b(Lcom/join/mgps/dto/FriendReqBean;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/join/mgps/activity/FriendActivity$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/FriendActivity$b;-><init>(Lcom/join/mgps/activity/FriendActivity;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method addSuccess(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "\u5df2\u53d1\u9001\u52a0\u597d\u53cb\u7533\u8bf7"

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->toast(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method autoSendAdd()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->w:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->t:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->w:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->performClick()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method checkClipboard()V
    .locals 3

    :try_start_0
    const-string v0, "clipboard"

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    .line 2
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v1

    const/4 v2, 0x0

    .line 4
    invoke-virtual {v1, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v1

    .line 5
    invoke-virtual {v1}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 6
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object v2

    invoke-virtual {v1}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/wufan/friend/chat/c;->l(Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/FriendActivity;->showAddFriend(I)V

    const-string v1, ""

    .line 8
    invoke-virtual {v0, v1}, Landroid/content/ClipboardManager;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method protected checkGameIsInstall(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->q:Z

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->r:Z

    .line 3
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v1, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    .line 4
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    const/4 v3, 0x5

    if-ne v2, v3, :cond_3

    .line 5
    iput-boolean v1, p0, Lcom/join/mgps/activity/FriendActivity;->q:Z

    .line 6
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lb2/o;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object p1

    if-eqz p1, :cond_2

    new-array v2, v0, [Ljava/lang/String;

    .line 7
    invoke-static {p0, p1, v0, v2}, Lcom/join/android/app/common/utils/l;->t(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;Z[Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->B0(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    iput-boolean v1, p0, Lcom/join/mgps/activity/FriendActivity;->r:Z

    goto :goto_1

    .line 9
    :cond_1
    :goto_0
    iput-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->r:Z

    goto :goto_1

    .line 10
    :cond_2
    iput-boolean v1, p0, Lcom/join/mgps/activity/FriendActivity;->r:Z

    goto :goto_1

    .line 11
    :cond_3
    iput-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->q:Z

    .line 12
    :goto_1
    iget-boolean p1, p0, Lcom/join/mgps/activity/FriendActivity;->r:Z

    if-eqz p1, :cond_4

    iget-boolean p1, p0, Lcom/join/mgps/activity/FriendActivity;->q:Z

    if-eqz p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method getFriendInfo(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/FriendActivity$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/FriendActivity$c;-><init>(Lcom/join/mgps/activity/FriendActivity;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Integer;

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public getGameId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->i:Ljava/lang/String;

    return-object v0
.end method

.method hideNavigationBar()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->setSystemUiVisibility()V

    :cond_0
    return-void
.end method

.method public n(Lcom/join/mgps/dto/FriendBean;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    .line 2
    :cond_1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    const p1, 0x7f100299

    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->toast(Ljava/lang/String;)V

    return-void

    .line 4
    :cond_2
    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/FriendBean;->isRecommend()Z

    move-result p1

    if-nez p1, :cond_3

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->X0()V

    goto :goto_0

    .line 7
    :cond_3
    :try_start_0
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/FriendBean;->getUid()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/FriendBean;->getGameId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lcom/wufan/friend/chat/c;->v(IJ)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/NumberFormatException;->printStackTrace()V

    :goto_0
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0
    .param p3    # Landroid/content/Intent;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/BaseFragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p3, -0x1

    if-ne p2, p3, :cond_1

    const/16 p2, 0x2710

    const/4 p3, 0x0

    if-ne p1, p2, :cond_0

    .line 2
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    invoke-virtual {p1, p2}, Lcom/wufan/friend/chat/c;->o(Lcom/join/mgps/dto/FriendBean;)V

    .line 3
    iput-object p3, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    goto :goto_0

    :cond_0
    const/16 p2, 0x2711

    if-ne p1, p2, :cond_1

    .line 4
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    invoke-virtual {p1, p2}, Lcom/wufan/friend/chat/c;->p(Lcom/join/mgps/dto/FriendBean;)V

    .line 5
    iput-object p3, p0, Lcom/join/mgps/activity/FriendActivity;->p:Lcom/join/mgps/dto/FriendBean;

    :cond_1
    :goto_0
    return-void
.end method

.method public onArenaResponse(Lapp/mgsim/arena/ArenaResponse;)V
    .locals 2
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget v0, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    .line 2
    iget-object p1, p1, Lapp/mgsim/arena/ArenaResponse;->request:Lapp/mgsim/arena/ArenaRequest;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->showInputRoomPwdDialog(Lapp/mgsim/arena/ArenaRequest;)V

    :cond_1
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->l:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->m:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->T0()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/greenrobot/eventbus/c;->m(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/greenrobot/eventbus/c;->t(Ljava/lang/Object;)V

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->registerReceiver()V

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->b:Landroidx/fragment/app/FragmentManager;

    .line 6
    instance-of p1, p0, Lcom/join/mgps/activity/FriendInviteActivity;

    if-eqz p1, :cond_1

    return-void

    .line 7
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->E0()Z

    move-result p1

    iput-boolean p1, p0, Lcom/join/mgps/activity/FriendActivity;->m:Z

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->y0(I)V

    goto :goto_0

    .line 9
    :cond_2
    invoke-direct {p0}, Lcom/join/mgps/activity/FriendActivity;->V0()V

    .line 10
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onDestroy()V

    .line 2
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->m(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->y(Ljava/lang/Object;)V

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->m:Z

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->unregisterReceiver()V

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->I:Z

    :cond_1
    return-void
.end method

.method public onFriendEvent(Lcom/wufan/friend/chat/protocol/w1;)V
    .locals 2
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/w1;->C()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 2
    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/w1;->I()I

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_3

    .line 3
    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/w1;->getData()Lcom/wufan/friend/chat/protocol/x1;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 4
    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/w1;->getData()Lcom/wufan/friend/chat/protocol/x1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/protocol/x1;->W0()Lcom/wufan/friend/chat/protocol/p0;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 5
    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/w1;->getData()Lcom/wufan/friend/chat/protocol/x1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/protocol/x1;->W0()Lcom/wufan/friend/chat/protocol/p0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/protocol/p0;->b1()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 6
    iget-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->I:Z

    if-nez v0, :cond_1

    return-void

    .line 7
    :cond_1
    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/w1;->getData()Lcom/wufan/friend/chat/protocol/x1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/x1;->W0()Lcom/wufan/friend/chat/protocol/p0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/p0;->b1()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 8
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->Y0(Ljava/util/List;)V

    nop

    :cond_3
    :goto_0
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseFragmentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->l:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->c:Lcom/join/mgps/fragment/FriendFragment;

    .line 4
    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->d:Lcom/join/mgps/fragment/FriendAddFragment;

    .line 5
    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->e:Lcom/join/mgps/fragment/FriendMessageFragment;

    .line 6
    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->f:Lcom/join/mgps/fragment/FriendCardFragment;

    .line 7
    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->g:Lcom/join/mgps/fragment/CloudListFragment;

    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->b:Landroidx/fragment/app/FragmentManager;

    .line 9
    instance-of p1, p0, Lcom/join/mgps/activity/FriendInviteActivity;

    if-eqz p1, :cond_0

    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->E0()Z

    move-result p1

    iput-boolean p1, p0, Lcom/join/mgps/activity/FriendActivity;->m:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->y0(I)V

    goto :goto_0

    .line 12
    :cond_1
    invoke-direct {p0}, Lcom/join/mgps/activity/FriendActivity;->V0()V

    :goto_0
    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onPause()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->I:Z

    return-void
.end method

.method protected onResume()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onResume()V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->m:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->I:Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->c:Lcom/join/mgps/fragment/FriendFragment;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/fragment/FriendFragment;->W0()V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->h:Landroid/os/Handler;

    new-instance v1, Lcom/join/mgps/activity/a0;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/a0;-><init>(Lcom/join/mgps/activity/FriendActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method

.method public onSystemUiVisibilityChange(I)V
    .locals 0

    if-nez p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->hideNavigationBar()V

    :cond_0
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseActivity;->onWindowFocusChanged(Z)V

    return-void
.end method

.method registerReceiver()V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/activity/FriendActivity$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/FriendActivity$a;-><init>(Lcom/join/mgps/activity/FriendActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->s:Landroid/content/BroadcastReceiver;

    .line 2
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.action_login_success"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->s:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method setSystemUiVisibility()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    const/16 v0, 0x1706

    goto :goto_0

    :cond_0
    const/16 v0, 0x707

    .line 2
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method

.method showAddFriend(I)V
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 2
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    if-eq v1, p1, :cond_6

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->t:Landroid/app/Dialog;

    if-nez v0, :cond_4

    .line 4
    new-instance v0, Landroid/app/Dialog;

    const v1, 0x7f110512

    invoke-direct {v0, p0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->t:Landroid/app/Dialog;

    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_1

    .line 6
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const/4 v1, 0x1

    .line 7
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->t:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 9
    :cond_1
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01bb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09032d

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->v:Landroid/view/View;

    const v1, 0x7f09027f

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->w:Landroid/view/View;

    const v1, 0x7f090ea1

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->x:Landroid/widget/TextView;

    const v1, 0x7f090063

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->y:Landroid/widget/TextView;

    const v1, 0x7f09012d

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->u:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 15
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->t:Landroid/app/Dialog;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 16
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07135e

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    .line 17
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07134b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    .line 18
    iget-object v2, p0, Lcom/join/mgps/activity/FriendActivity;->t:Landroid/app/Dialog;

    invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 19
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    const/4 v4, -0x1

    if-nez v0, :cond_2

    const/4 v0, -0x1

    .line 20
    :cond_2
    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->width:I

    if-nez v1, :cond_3

    const/4 v1, -0x1

    .line 21
    :cond_3
    iput v1, v3, Landroid/view/WindowManager$LayoutParams;->height:I

    const/16 v0, 0x11

    .line 22
    invoke-virtual {v2, v0}, Landroid/view/Window;->setGravity(I)V

    .line 23
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->v:Landroid/view/View;

    new-instance v1, Lcom/join/mgps/activity/u;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/u;-><init>(Lcom/join/mgps/activity/FriendActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->w:Landroid/view/View;

    new-instance v1, Lcom/join/mgps/activity/v;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/activity/v;-><init>(Lcom/join/mgps/activity/FriendActivity;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->getFriendInfo(I)V

    .line 26
    iget-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->t:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->t:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 27
    :cond_5
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->showInviteCode:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    :cond_6
    :goto_0
    return-void
.end method

.method showInputRoomPwdDialog(Lapp/mgsim/arena/ArenaRequest;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->I:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->h:Landroid/os/Handler;

    new-instance v1, Lcom/join/mgps/activity/b0;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/activity/b0;-><init>(Lcom/join/mgps/activity/FriendActivity;Lapp/mgsim/arena/ArenaRequest;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public startDownloadActivity(Ljava/lang/String;I)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/join/mgps/activity/arena/NewArenaDownloadActivity_;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "gameId"

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    iget-boolean p1, p0, Lcom/join/mgps/activity/FriendActivity;->r:Z

    const-string v1, "hasPlug"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 4
    iget-boolean p1, p0, Lcom/join/mgps/activity/FriendActivity;->q:Z

    const-string v1, "hasRom"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0, v0, p2}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method toast(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->h:Landroid/os/Handler;

    new-instance v1, Lcom/join/mgps/activity/s;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/activity/s;-><init>(Lcom/join/mgps/activity/FriendActivity;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public u()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/IntentUtil;->isLogined(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/IntentUtil;->isTourist(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->y0(I)V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {p0}, Lcom/join/mgps/activity/login/LoginSplashActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;

    move-result-object v0

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method u0(Landroidx/fragment/app/FragmentTransaction;)V
    .locals 2

    const v0, 0x7f010054

    const v1, 0x7f01005f

    .line 1
    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/FragmentTransaction;->setCustomAnimations(II)Landroidx/fragment/app/FragmentTransaction;

    return-void
.end method

.method unregisterReceiver()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->s:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_0
    return-void
.end method

.method protected v0()I
    .locals 1

    .line 1
    instance-of v0, p0, Lcom/join/mgps/activity/GameMainActivity4_;

    if-eqz v0, :cond_0

    const v0, 0x7f09061e

    return v0

    :cond_0
    const v0, 0x7f09061d

    return v0
.end method

.method public y0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->l:Ljava/util/LinkedList;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->l:Ljava/util/LinkedList;

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->l:Ljava/util/LinkedList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->push(Ljava/lang/Object;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->l:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->size()I

    move-result p1

    if-lez p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/FriendActivity;->l:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->Q0(I)V

    :cond_1
    return-void
.end method

.method public z0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->b:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->c:Lcom/join/mgps/fragment/FriendFragment;

    if-eqz v1, :cond_1

    .line 3
    instance-of v1, p0, Lcom/join/mgps/activity/GameMainActivity4_;

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->u0(Landroidx/fragment/app/FragmentTransaction;)V

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->c:Lcom/join/mgps/fragment/FriendFragment;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentTransaction;->hide(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 5
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->d:Lcom/join/mgps/fragment/FriendAddFragment;

    if-eqz v1, :cond_2

    .line 6
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->u0(Landroidx/fragment/app/FragmentTransaction;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->d:Lcom/join/mgps/fragment/FriendAddFragment;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentTransaction;->hide(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 8
    :cond_2
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->e:Lcom/join/mgps/fragment/FriendMessageFragment;

    if-eqz v1, :cond_3

    .line 9
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->u0(Landroidx/fragment/app/FragmentTransaction;)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->e:Lcom/join/mgps/fragment/FriendMessageFragment;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentTransaction;->hide(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 11
    :cond_3
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->f:Lcom/join/mgps/fragment/FriendCardFragment;

    if-eqz v1, :cond_4

    .line 12
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/FriendActivity;->u0(Landroidx/fragment/app/FragmentTransaction;)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/FriendActivity;->f:Lcom/join/mgps/fragment/FriendCardFragment;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentTransaction;->hide(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 14
    :cond_4
    :try_start_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
