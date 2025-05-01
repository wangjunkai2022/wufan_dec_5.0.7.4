.class public Lcom/join/mgps/activity/GameMainActivity4;
.super Lcom/join/mgps/activity/FriendActivity;
.source "GameMainActivity4.java"

# interfaces
.implements Lcom/join/mgps/adapter/j1$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/GameMainActivity4$m;,
        Lcom/join/mgps/activity/GameMainActivity4$EmuOutResultReceiver;,
        Lcom/join/mgps/activity/GameMainActivity4$l;,
        Lcom/join/mgps/activity/GameMainActivity4$k;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0054
.end annotation

.annotation build Lorg/androidannotations/annotations/Fullscreen;
.end annotation

.annotation build Lorg/androidannotations/annotations/WindowFeature;
    value = {
        0x1
    }
.end annotation


# static fields
.field public static final E2:Ljava/lang/String; = "\u52a8\u6001"

.field public static final F2:Ljava/lang/String; = "\u6210\u5c31"

.field public static final G2:Ljava/lang/String; = "\u5b58\u6863\u5546\u5e97"

.field public static final H2:Ljava/lang/String; = "\u653b\u7565"

.field public static final I2:Ljava/lang/String; = "\u91d1\u624b\u6307"


# instance fields
.field A1:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field A2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RomArchived;",
            ">;"
        }
    .end annotation
.end field

.field B1:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field public B2:Z

.field C1:Landroid/widget/FrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field public C2:Z

.field private D1:Landroid/content/Context;

.field D2:Lcom/join/mgps/dto/ArchiveNumDataBean;

.field E1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/db/tables/PlayGameTimeTable;",
            ">;"
        }
    .end annotation
.end field

.field private F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field private G1:Ljava/lang/String;

.field H1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PspBattleServer;",
            ">;"
        }
    .end annotation
.end field

.field I1:Lcom/join/mgps/activity/GameMainActivity4$l;

.field J1:Lcom/join/mgps/rpc/l;

.field K1:Lcom/join/mgps/dto/GameMainV4DataBean;

.field private L1:Ljava/lang/String;

.field M1:Lcom/wufan/user/service/protobuf/n0;

.field N:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field N1:Lcom/join/mgps/rpc/k;

.field O:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field private O1:Ljava/lang/String;

.field P:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private P1:I

.field Q:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private Q1:Ljava/lang/String;

.field R:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private R1:Lcom/join/mgps/socket/fight/arena/b;

.field S:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private S1:Lcom/join/mgps/socket/fight/arena/a;

.field T:Landroid/view/View;

.field private T1:Lcom/join/mgps/adapter/j1;

.field U:Landroid/widget/GridView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private U1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/DynamicEntranceBean;",
            ">;"
        }
    .end annotation
.end field

.field V:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field V1:Lcom/join/mgps/rpc/f;

.field W:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field W1:Lcom/join/mgps/rpc/j;

.field X:Lcom/google/android/material/tabs/TabLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field X1:Lcom/join/mgps/rpc/d;

.field Y:Landroidx/viewpager/widget/ViewPager;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private Y1:Lcom/join/mgps/activity/GameMainActivity4$EmuOutResultReceiver;

.field Z:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private Z1:Landroidx/fragment/app/FragmentManager;

.field private a2:Lcom/join/mgps/fragment/SimulatorRecommendFragment_;

.field private b2:Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;

.field private c2:Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;

.field private d2:Lcom/join/mgps/adapter/c2;

.field private e2:Lcom/google/gson/Gson;

.field private f2:I

.field private g2:I

.field h2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/GameMainActivity4$m;",
            ">;"
        }
    .end annotation
.end field

.field private i2:Lcom/papa91/arc/dialog/AchievmentTipsDialog;

.field private j2:Lcom/join/mgps/dialog/c2;

.field private k2:Lcom/join/mgps/customview/NavigationAdapter;

.field private l2:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field private m2:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private n2:Lcom/join/mgps/recycler/ViewPager2SlowScrollHelper;

.field private o2:Z

.field p0:Lcom/join/mgps/customview/WrapContentGridView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field p1:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private p2:Z

.field q2:Ljava/lang/Runnable;

.field private r2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommentAllListBean$GeneralCommentBean;",
            ">;"
        }
    .end annotation
.end field

.field s2:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field t2:Lcom/join/mgps/rpc/i;

.field u2:I

.field v1:Landroid/widget/FrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field v2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;",
            ">;"
        }
    .end annotation
.end field

.field private w2:Landroid/os/CountDownTimer;

.field private final x2:Lcom/join/mgps/socket/fight/arena/b$b;

.field private final y2:Lapp/mgsim/arena/SocketListener$NotifyObserver;

.field public z2:Z


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/FriendActivity;-><init>()V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->G1:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->O1:Ljava/lang/String;

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->P1:I

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->Q1:Ljava/lang/String;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->U1:Ljava/util/List;

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->h2:Ljava/util/List;

    .line 8
    iput-boolean v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->p2:Z

    .line 9
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4$e;-><init>(Lcom/join/mgps/activity/GameMainActivity4;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->q2:Ljava/lang/Runnable;

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->r2:Ljava/util/List;

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->v2:Ljava/util/List;

    .line 12
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4$g;

    const-wide/16 v4, 0x2710

    const-wide/16 v6, 0x3e8

    move-object v2, v0

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/join/mgps/activity/GameMainActivity4$g;-><init>(Lcom/join/mgps/activity/GameMainActivity4;JJ)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->w2:Landroid/os/CountDownTimer;

    .line 13
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4$h;-><init>(Lcom/join/mgps/activity/GameMainActivity4;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->x2:Lcom/join/mgps/socket/fight/arena/b$b;

    .line 14
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4$i;-><init>(Lcom/join/mgps/activity/GameMainActivity4;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->y2:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    .line 15
    iput-boolean v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->z2:Z

    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->B2:Z

    .line 17
    iput-boolean v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->C2:Z

    return-void
.end method

.method private A1()Lcom/join/mgps/dto/ArchiveColudArgs;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->M1:Lcom/wufan/user/service/protobuf/n0;

    const-string v1, ""

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v0, v1, v1, v2}, Lcom/join/mgps/Util/RequestBeanUtil;->getArchiveNum(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ArchiveColudArgs;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity4;->M1:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->M1:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/join/mgps/Util/RequestBeanUtil;->getArchiveNum(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ArchiveColudArgs;

    move-result-object v0

    return-object v0
.end method

.method private M1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->Z1:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->c2:Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;

    if-eqz v1, :cond_0

    const v1, 0x7f010054

    const v2, 0x7f01005f

    .line 3
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->setCustomAnimations(II)Landroidx/fragment/app/FragmentTransaction;

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->c2:Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentTransaction;->hide(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 5
    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    return-void
.end method

.method private P1()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic Z0(Lcom/join/mgps/activity/GameMainActivity4;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainActivity4;->m2:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic a1(Lcom/join/mgps/activity/GameMainActivity4;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic b1(Lcom/join/mgps/activity/GameMainActivity4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity4;->i2()V

    return-void
.end method

.method static synthetic c1(Lcom/join/mgps/activity/GameMainActivity4;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/GameMainActivity4;->f2:I

    return p0
.end method

.method private c2()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->e2:Lcom/google/gson/Gson;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->e2:Lcom/google/gson/Gson;

    :cond_0
    const/4 v0, 0x4

    const-string v1, "Papa_Stat_SharedPreferences"

    .line 2
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "achievement_done"

    const-string v2, ""

    .line 3
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 6
    invoke-static {v0}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/google/gson/JsonArray;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/gson/JsonElement;

    .line 8
    iget-object v5, p0, Lcom/join/mgps/activity/GameMainActivity4;->e2:Lcom/google/gson/Gson;

    const-class v6, Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;

    invoke-virtual {v5, v4, v6}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;

    .line 9
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 11
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4$k;

    iget-object v4, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-direct {v0, p0, v4, v3}, Lcom/join/mgps/activity/GameMainActivity4$k;-><init>(Lcom/join/mgps/activity/GameMainActivity4;Landroid/content/Context;Ljava/util/ArrayList;)V

    .line 12
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa91/arc/http/utils/PrefUtil;->getInstance(Landroid/content/Context;)Lcom/papa91/arc/http/utils/PrefUtil;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lcom/papa91/arc/http/utils/PrefUtil;->save(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method static synthetic d1(Lcom/join/mgps/activity/GameMainActivity4;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->f2:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->f2:I

    return v0
.end method

.method static synthetic e1(Lcom/join/mgps/activity/GameMainActivity4;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainActivity4;->G1:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic f1(Lcom/join/mgps/activity/GameMainActivity4;)Lcom/github/snowdream/android/app/downloader/DownloadTask;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-object p0
.end method

.method static synthetic g1(Lcom/join/mgps/activity/GameMainActivity4;)Lcom/join/mgps/socket/fight/arena/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    return-object p0
.end method

.method static synthetic h1(Lcom/join/mgps/activity/GameMainActivity4;)Lapp/mgsim/arena/SocketListener$NotifyObserver;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainActivity4;->y2:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    return-object p0
.end method

.method static synthetic i1(Lcom/join/mgps/activity/GameMainActivity4;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity4;->P1()Z

    move-result p0

    return p0
.end method

.method private i2()V
    .locals 2

    :try_start_0
    const-string v0, "\u7f51\u7edc\u4e0d\u7a33\u5b9a\uff0c\u8bf7\u91cd\u8bd5"

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method static synthetic j1(Lcom/join/mgps/activity/GameMainActivity4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity4;->n1()V

    return-void
.end method

.method private l2(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->r2:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v0, p1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/activity/CommentDetailActivity_;->M1(Landroid/content/Context;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->d(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->r2:Ljava/util/List;

    add-int/lit8 p1, p1, -0x1

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/CommentAllListBean$GeneralCommentBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentBaseBean;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->b(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_plugin_num()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->f(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_bespeak_switch()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->a(I)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_is_started()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->e(I)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->h(I)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_package()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->g(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_comment_score_switch()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->c(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :cond_1
    return-void
.end method

.method private n1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->w2:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    :cond_0
    return-void
.end method

.method private n2(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->v2:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v0, p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->v2:Ljava/util/List;

    add-int/lit8 p1, p1, -0x1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;->getPid()I

    move-result p1

    .line 3
    new-instance v0, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;-><init>()V

    .line 4
    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setPid(I)V

    .line 5
    new-instance v1, Lcom/join/mgps/dto/ExtBean;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "0"

    const-string v3, "-1"

    invoke-direct {v1, v2, p1, v3}, Lcom/join/mgps/dto/ExtBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {p1, v0, v1}, Lcom/join/mgps/Util/j0;->w0(Landroid/content/Context;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;Lcom/join/mgps/dto/ExtBean;)V

    :cond_0
    return-void
.end method

.method public static q1(Ljava/lang/String;Ljava/lang/String;)J
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-direct {v0, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p0

    :catch_0
    move-exception p0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const-wide/16 p0, 0x0

    return-wide p0
.end method

.method private q2(Z)V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFight_fun()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    const-string v2, ""

    const/16 v3, 0x8

    const/4 v4, 0x4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_a

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->U1:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->T1:Lcom/join/mgps/adapter/j1;

    invoke-virtual {v1}, Lcom/join/mgps/adapter/j1;->b()V

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v7, 0x5

    const/4 v8, 0x2

    const/16 v9, 0x31

    if-lt v1, v8, :cond_5

    .line 6
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v10

    const/4 v11, 0x7

    const/16 v12, 0x30

    if-lt v10, v11, :cond_0

    const/4 v10, 0x6

    .line 8
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    .line 9
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-ne v11, v9, :cond_1

    const/16 v11, 0x31

    goto :goto_0

    :cond_0
    const/16 v10, 0x30

    :cond_1
    const/16 v11, 0x30

    :goto_0
    if-eq v9, v1, :cond_4

    if-ne v9, v10, :cond_2

    goto :goto_1

    :cond_2
    if-ne v12, v1, :cond_3

    if-ne v12, v10, :cond_3

    if-ne v11, v9, :cond_3

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->S:Landroid/view/View;

    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->R:Landroid/widget/TextView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 12
    :cond_3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->S:Landroid/view/View;

    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->R:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 14
    :cond_4
    :goto_1
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->S:Landroid/view/View;

    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 15
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->R:Landroid/widget/TextView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 16
    :cond_5
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const-string v10, "NEW"

    const-string v11, "\u6392\u4f4d\u8d5b"

    const/16 v12, 0xc

    if-le v1, v12, :cond_6

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, p0, v1}, Lcom/join/mgps/activity/GameMainActivity4;->Q1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 17
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v9, :cond_6

    .line 18
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->U1:Ljava/util/List;

    new-instance v12, Lcom/join/mgps/dto/DynamicEntranceBean;

    invoke-direct {v12, v11, v10, v5}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v1, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v12, 0xe

    if-le v1, v12, :cond_7

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, p0, v1}, Lcom/join/mgps/activity/GameMainActivity4;->Q1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 20
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v9, :cond_7

    .line 21
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->U1:Ljava/util/List;

    new-instance v13, Lcom/join/mgps/dto/DynamicEntranceBean;

    invoke-direct {v13, v11, v10, v12}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v1, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v4, :cond_8

    .line 23
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v9, :cond_8

    .line 24
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->U1:Ljava/util/List;

    new-instance v10, Lcom/join/mgps/dto/DynamicEntranceBean;

    const-string v11, "\u7ec3\u4e60\u6a21\u5f0f"

    invoke-direct {v10, v11, v2, v7}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    :cond_8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v7, 0x3

    if-lt v1, v4, :cond_9

    .line 26
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v9, :cond_9

    .line 27
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->U1:Ljava/util/List;

    new-instance v10, Lcom/join/mgps/dto/DynamicEntranceBean;

    const-string v11, "\u7ea6\u6218"

    invoke-direct {v10, v11, v2, v8}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    :cond_9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v5, :cond_a

    .line 29
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v9, v0, :cond_a

    .line 30
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->U1:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/dto/DynamicEntranceBean;

    const-string v8, "\u672c\u5730\u5bf9\u6218"

    invoke-direct {v1, v8, v2, v7}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    :cond_a
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    if-eqz v0, :cond_18

    if-eqz p1, :cond_c

    .line 32
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->Z1:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    .line 33
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->a2:Lcom/join/mgps/fragment/SimulatorRecommendFragment_;

    if-nez v1, :cond_b

    .line 34
    new-instance v1, Lcom/join/mgps/fragment/SimulatorRecommendFragment_;

    invoke-direct {v1}, Lcom/join/mgps/fragment/SimulatorRecommendFragment_;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->a2:Lcom/join/mgps/fragment/SimulatorRecommendFragment_;

    .line 35
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 36
    iget-object v7, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    const-string v8, "gameId"

    invoke-virtual {v1, v8, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    iget-object v7, p0, Lcom/join/mgps/activity/GameMainActivity4;->a2:Lcom/join/mgps/fragment/SimulatorRecommendFragment_;

    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    const v1, 0x7f09061d

    .line 38
    iget-object v7, p0, Lcom/join/mgps/activity/GameMainActivity4;->a2:Lcom/join/mgps/fragment/SimulatorRecommendFragment_;

    invoke-virtual {v0, v1, v7}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    goto :goto_3

    .line 39
    :cond_b
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentTransaction;->show(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 40
    :goto_3
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 41
    :cond_c
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getMemberInfo()Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 42
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->Z:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getMemberInfo()Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    :cond_d
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getMemberFun()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 44
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getMemberFun()Ljava/util/List;

    move-result-object v0

    .line 45
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->d2:Lcom/join/mgps/adapter/c2;

    if-nez v1, :cond_e

    .line 46
    new-instance v1, Lcom/join/mgps/adapter/c2;

    iget-object v7, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-direct {v1, p0, v7}, Lcom/join/mgps/adapter/c2;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->d2:Lcom/join/mgps/adapter/c2;

    .line 47
    :cond_e
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->p0:Lcom/join/mgps/customview/WrapContentGridView;

    iget-object v7, p0, Lcom/join/mgps/activity/GameMainActivity4;->d2:Lcom/join/mgps/adapter/c2;

    invoke-virtual {v1, v7}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    if-eqz v0, :cond_f

    .line 48
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_f

    .line 49
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->d2:Lcom/join/mgps/adapter/c2;

    invoke-virtual {v1, v0}, Lcom/join/mgps/adapter/c2;->d(Ljava/util/List;)V

    .line 50
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->d2:Lcom/join/mgps/adapter/c2;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 51
    :cond_f
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->T:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 52
    invoke-virtual {p0, v5}, Lcom/join/mgps/activity/GameMainActivity4;->Y1(Z)V

    .line 53
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 54
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_back_ground_img()Ljava/lang/String;

    move-result-object v1

    .line 55
    invoke-static {v1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_10

    .line 56
    iget-object v7, p0, Lcom/join/mgps/activity/GameMainActivity4;->V:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v7, v1}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageURI(Ljava/lang/String;)V

    .line 57
    :cond_10
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getCommunity_area_id()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->u2:I

    if-eqz p1, :cond_13

    .line 58
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->L1:Ljava/lang/String;

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_11

    .line 59
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->L1:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameMainActivity4;->G1(Ljava/lang/String;)V

    goto :goto_4

    .line 60
    :cond_11
    iget p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->u2:I

    if-eqz p1, :cond_12

    .line 61
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->D1()V

    goto :goto_4

    .line 62
    :cond_12
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->B1()V

    .line 63
    :cond_13
    :goto_4
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getNetBattle()Lcom/join/mgps/dto/GameMainNetBattle;

    move-result-object p1

    if-eqz p1, :cond_17

    .line 64
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainNetBattle;->getNumber()I

    move-result v7

    if-gez v7, :cond_14

    const/4 p1, 0x0

    goto :goto_5

    :cond_14
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainNetBattle;->getNumber()I

    move-result p1

    :goto_5
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\u623f"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz p1, :cond_16

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isFightFun()Z

    move-result p1

    if-eqz p1, :cond_15

    goto :goto_6

    .line 66
    :cond_15
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->R:Landroid/widget/TextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_7

    .line 67
    :cond_16
    :goto_6
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->R:Landroid/widget/TextView;

    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_7

    .line 68
    :cond_17
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->R:Landroid/widget/TextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 69
    :goto_7
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getPlayGameInfo()Lcom/join/mgps/dto/GameMainV4DataBean$PlayGameInfoBean;

    move-result-object p1

    if-eqz p1, :cond_19

    .line 70
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV4DataBean$PlayGameInfoBean;->getFile_save_count()I

    move-result v0

    .line 71
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV4DataBean$PlayGameInfoBean;->getFile_save_switch()I

    move-result p1

    if-ne p1, v5, :cond_19

    .line 72
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->U1:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/dto/DynamicEntranceBean;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "\u4e91\u5b58\u6863"

    invoke-direct {v1, v2, v0, v4}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 73
    :cond_18
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->T:Landroid/view/View;

    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 74
    invoke-virtual {p0, v6}, Lcom/join/mgps/activity/GameMainActivity4;->Y1(Z)V

    :cond_19
    :goto_8
    return-void
.end method

.method private s2()V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->l2:Ljava/util/ArrayList;

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->m2:Ljava/util/ArrayList;

    .line 3
    iget-boolean v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->o2:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 4
    new-instance v0, Lcom/join/mgps/fragment/CloudListFragmentV2_;

    invoke-direct {v0}, Lcom/join/mgps/fragment/CloudListFragmentV2_;-><init>()V

    .line 5
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "type"

    .line 6
    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 7
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    const-string v4, "gameid"

    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x3

    const-string v4, "typeIndex"

    .line 8
    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 9
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 10
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->l2:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->m2:Ljava/util/ArrayList;

    const-string v2, "\u5b58\u6863\u5546\u5e97"

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    :cond_0
    new-instance v0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_;

    invoke-direct {v0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_;-><init>()V

    .line 13
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 14
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    const-string v4, "gameId"

    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 16
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->l2:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->m2:Ljava/util/ArrayList;

    const-string v2, "\u52a8\u6001"

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    new-instance v0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment_;

    invoke-direct {v0}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment_;-><init>()V

    .line 19
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 20
    iget-object v5, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 22
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity4;->l2:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->m2:Ljava/util/ArrayList;

    const-string v3, "\u6210\u5c31"

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->isBbs_switch()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 25
    new-instance v0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;

    invoke-direct {v0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;-><init>()V

    .line 26
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 27
    iget-object v5, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    iget-object v4, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameMainV4DataBean;->getBbs_strategy_contribute_url()Ljava/lang/String;

    move-result-object v4

    const-string v5, "draftUrl"

    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "isExpand"

    .line 29
    invoke-virtual {v3, v4, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 30
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 31
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity4;->l2:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->m2:Ljava/util/ArrayList;

    const-string v3, "\u653b\u7565"

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getMemberFun()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 34
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getMemberFun()Ljava/util/List;

    move-result-object v0

    .line 35
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 36
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/GameMainV4DataBean$MemberFunBean;

    .line 37
    invoke-virtual {v4}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberFunBean;->getType()I

    move-result v5

    if-ne v5, v1, :cond_2

    .line 38
    invoke-virtual {v4}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberFunBean;->getContents()Ljava/util/List;

    move-result-object v3

    goto :goto_0

    .line 39
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->d2:Lcom/join/mgps/adapter/c2;

    if-nez v0, :cond_4

    .line 40
    new-instance v0, Lcom/join/mgps/adapter/c2;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/adapter/c2;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->d2:Lcom/join/mgps/adapter/c2;

    :cond_4
    if-eqz v3, :cond_5

    .line 41
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 42
    new-instance v0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment_;

    invoke-direct {v0}, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment_;-><init>()V

    .line 43
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 44
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v3, "contents"

    invoke-virtual {v1, v3, v4}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 45
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 46
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->l2:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->m2:Ljava/util/ArrayList;

    const-string v1, "\u91d1\u624b\u6307"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    :cond_5
    new-instance v0, Lcom/join/mgps/customview/NavigationAdapter;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->Z1:Landroidx/fragment/app/FragmentManager;

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity4;->l2:Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/join/mgps/activity/GameMainActivity4;->m2:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v3, v4}, Lcom/join/mgps/customview/NavigationAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->k2:Lcom/join/mgps/customview/NavigationAdapter;

    .line 49
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->Y:Landroidx/viewpager/widget/ViewPager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 50
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->Y:Landroidx/viewpager/widget/ViewPager;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->k2:Lcom/join/mgps/customview/NavigationAdapter;

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 51
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->Y:Landroidx/viewpager/widget/ViewPager;

    new-instance v1, Lcom/join/mgps/activity/GameMainActivity4$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameMainActivity4$d;-><init>(Lcom/join/mgps/activity/GameMainActivity4;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 52
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->X:Lcom/google/android/material/tabs/TabLayout;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->Y:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 53
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->A1:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 54
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->m2:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 55
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->B1:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 56
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->B1:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method private t1()V
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->startArchiveManagement:Lcom/papa/sim/statistic/Event;

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    const-string v4, "1"

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/papa/sim/statistic/p;->X0(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/DocumentManageActivity_;->S0(Landroid/content/Context;)Lcom/join/mgps/activity/DocumentManageActivity_$u;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/DocumentManageActivity_$u;->a(I)Lcom/join/mgps/activity/DocumentManageActivity_$u;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/DocumentManageActivity_$u;->b(Ljava/lang/String;)Lcom/join/mgps/activity/DocumentManageActivity_$u;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method private u1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/ApFightActivity_;->n0(Landroid/content/Context;)Lcom/join/mgps/activity/ApFightActivity_$r;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/ApFightActivity_$r;->a(Ljava/lang/String;)Lcom/join/mgps/activity/ApFightActivity_$r;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->M1:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->y0(Ljava/lang/String;I)V

    return-void
.end method

.method private v1(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    const-string v1, "onEnterQualifying"

    invoke-static {v0, v1}, Lcom/umeng/analytics/MobclickAgent;->onEvent(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->W(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x1

    const-string v0, "\u6b63\u5728\u4e0b\u8f7d\u63d2\u4ef6..."

    .line 4
    invoke-static {p0, v0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->N1()V

    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    if-nez v0, :cond_1

    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/GamePaiWeiActivty_;->o0(Landroid/content/Context;)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/GamePaiWeiActivty_$v;->a(Ljava/lang/String;)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMaingameinfo;->getMax_battle_count()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/GamePaiWeiActivty_$v;->b(I)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/GamePaiWeiActivty_$v;->c(I)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_0

    .line 8
    :cond_2
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private y1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v1, v0, p0, v2}, Lcom/join/mgps/Util/UtilsMy;->i(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;I)V

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->M1:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->T0(Ljava/lang/String;I)V

    .line 3
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->M1:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->A0(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method B1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->E1()Lcom/join/mgps/dto/RequestCommentAllListArgs;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->V1:Lcom/join/mgps/rpc/f;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/f;->b(Lcom/join/mgps/dto/RequestCommentAllListArgs;)Lcom/join/mgps/dto/CommentResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommentAllListBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentAllListBean;->getGeneral_comment()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->r2:Ljava/util/List;

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->W1()V

    :cond_0
    return-void
.end method

.method C1()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {}, Lb2/u;->n()Lb2/u;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lb2/u;->o(Ljava/lang/String;)Lcom/join/mgps/db/tables/GameMainTable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/db/tables/GameMainTable;->getGame_main_data()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameMainV4DataBean;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMaingameinfo;->getCommunity_multi_posts_id()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->L1:Ljava/lang/String;

    :cond_0
    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/GameMainActivity4;->r2(Lcom/join/mgps/dto/GameMainV4DataBean;Z)V

    :cond_1
    return-void
.end method

.method D1()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->t2:Lcom/join/mgps/rpc/i;

    iget v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->u2:I

    invoke-interface {v0, v1}, Lcom/join/mgps/rpc/i;->n(I)Lcom/join/mgps/dto/ResultResMainBean;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultResMainBean;->getError()I

    move-result v1

    if-nez v1, :cond_4

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultResMainBean;->getData()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultResMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameMainCommunityBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainCommunityBean;->getPosts()Ljava/util/List;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->v2:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    if-eqz v0, :cond_3

    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_3

    const/4 v1, 0x0

    .line 8
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;->getSubject()Ljava/lang/String;

    move-result-object v2

    .line 9
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 10
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;->getMessage()Ljava/lang/String;

    move-result-object v2

    .line 11
    :cond_1
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity4;->v2:Ljava/util/List;

    new-instance v4, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;->getPid()I

    move-result v1

    invoke-direct {v4, v2, v1}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;-><init>(Ljava/lang/String;I)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_3

    .line 13
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;->getSubject()Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-static {v1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 15
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;->getMessage()Ljava/lang/String;

    move-result-object v1

    .line 16
    :cond_2
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity4;->v2:Ljava/util/List;

    new-instance v4, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;->getPid()I

    move-result v0

    invoke-direct {v4, v1, v0}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;-><init>(Ljava/lang/String;I)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->X1()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_0
    return-void
.end method

.method public E1()Lcom/join/mgps/dto/RequestCommentAllListArgs;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->M1:Lcom/wufan/user/service/protobuf/n0;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->s2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->commentToken()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->M1:Lcom/wufan/user/service/protobuf/n0;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v5, 0x0

    .line 5
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v1

    const/4 v2, 0x1

    const/16 v3, 0xa

    iget-object v4, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual/range {v1 .. v6}, Lcom/join/mgps/Util/RequestBeanUtil;->getRequestCommentAllList(IILjava/lang/String;ILjava/lang/String;)Lcom/join/mgps/dto/RequestCommentAllListArgs;

    move-result-object v0

    return-object v0
.end method

.method F1()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->t2:Lcom/join/mgps/rpc/i;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-interface {v2, v4, v3, v0, v1}, Lcom/join/mgps/rpc/i;->O(IILjava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v1

    if-nez v1, :cond_2

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getPost_list()Ljava/util/List;

    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->v2:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    if-eqz v0, :cond_1

    .line 10
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->v2:Ljava/util/List;

    new-instance v2, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v4

    invoke-direct {v2, v5, v4}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;-><init>(Ljava/lang/String;I)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->v2:Ljava/util/List;

    new-instance v2, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v0

    invoke-direct {v2, v4, v0}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;-><init>(Ljava/lang/String;I)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->X1()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method G1(Ljava/lang/String;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->t2:Lcom/join/mgps/rpc/i;

    invoke-interface {v0, p1}, Lcom/join/mgps/rpc/i;->L(Ljava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v0

    if-nez v0, :cond_2

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/MulPostData;

    invoke-virtual {p1}, Lcom/join/mgps/dto/MulPostData;->getPosts_list()Ljava/util/List;

    move-result-object p1

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->v2:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_1

    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->v2:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v2

    invoke-direct {v1, v3, v2}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->v2:Ljava/util/List;

    new-instance v2, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result p1

    invoke-direct {v2, v3, p1}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->X1()V
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

.method H1()V
    .locals 12
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity4;->A1()Lcom/join/mgps/dto/ArchiveColudArgs;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->X1:Lcom/join/mgps/rpc/d;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ArchiveColudArgs;->getArgs()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/d;->f(Ljava/util/Map;)Lcom/join/mgps/dto/ArchiveNumDataBean;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D2:Lcom/join/mgps/dto/ArchiveNumDataBean;

    if-eqz v0, :cond_e

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/ArchiveNumDataBean;->getCode()I

    move-result v0

    const/16 v1, 0x258

    if-ne v0, v1, :cond_e

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->s2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->getArchiveCoinPref()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->D2:Lcom/join/mgps/dto/ArchiveNumDataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ArchiveNumDataBean;->getData_info()Lcom/join/mgps/dto/ArchiveNumDataBean$DataInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ArchiveNumDataBean$DataInfoBean;->getArchiveCoin()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->s2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->cloudVipLink()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->D2:Lcom/join/mgps/dto/ArchiveNumDataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ArchiveNumDataBean;->getData_info()Lcom/join/mgps/dto/ArchiveNumDataBean$DataInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ArchiveNumDataBean$DataInfoBean;->getVipLink()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 6
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_d

    .line 7
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/mgps/Util/g0;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->A2:Ljava/util/List;

    .line 8
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    const-string v3, "31"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_7

    .line 9
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->A2:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v7, "_v2"

    if-eqz v6, :cond_1

    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/RomArchived;

    .line 10
    invoke-virtual {v6}, Lcom/join/mgps/dto/RomArchived;->getFileName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x1

    goto :goto_0

    .line 11
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->A2:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 12
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    .line 13
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/RomArchived;

    if-eqz v5, :cond_4

    if-nez v4, :cond_4

    .line 14
    iput-boolean v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->B2:Z

    .line 15
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/l1;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_1

    .line 16
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_4
    if-eqz v5, :cond_2

    if-eqz v4, :cond_2

    .line 17
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/join/mgps/Util/l1;->a(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 18
    iput-boolean v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->C2:Z

    .line 19
    invoke-virtual {v6}, Lcom/join/mgps/dto/RomArchived;->getFileName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 20
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 21
    :cond_5
    invoke-virtual {v6}, Lcom/join/mgps/dto/RomArchived;->getFileName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_1

    .line 22
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 23
    :cond_7
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    const-string v2, "33"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const/4 v0, 0x0

    .line 24
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->A2:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-wide/16 v4, 0x0

    move-wide v6, v4

    :cond_8
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/join/mgps/dto/RomArchived;

    .line 25
    invoke-virtual {v8}, Lcom/join/mgps/dto/RomArchived;->getArchivedTime()Ljava/lang/String;

    move-result-object v9

    const-string v10, "MM\u6708dd\u65e5 HH:mm"

    invoke-static {v9, v10}, Lcom/join/mgps/activity/GameMainActivity4;->q1(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v9

    cmp-long v11, v6, v4

    if-nez v11, :cond_9

    move-object v0, v8

    move-wide v6, v9

    :cond_9
    cmp-long v11, v6, v9

    if-lez v11, :cond_8

    move-object v0, v8

    move-wide v6, v9

    goto :goto_2

    :cond_a
    if-eqz v0, :cond_b

    .line 26
    invoke-virtual {v0}, Lcom/join/mgps/dto/RomArchived;->getFileName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "vba"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 27
    invoke-virtual {p0, v3}, Lcom/join/mgps/activity/GameMainActivity4;->a2(Z)V

    .line 28
    :cond_b
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->A2:Ljava/util/List;

    if-eqz v0, :cond_c

    .line 29
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameMainActivity4;->p2(I)V

    goto :goto_3

    .line 30
    :cond_c
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameMainActivity4;->p2(I)V

    goto :goto_3

    .line 31
    :cond_d
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameMainActivity4;->p2(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_e
    :goto_3
    return-void
.end method

.method I1()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    return-void
.end method

.method public J(Lcom/join/mgps/dto/DynamicEntranceBean;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/DynamicEntranceBean;->getTypeId()I

    move-result p1

    const/16 v0, 0xe

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 2
    :pswitch_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->r1()V

    goto :goto_0

    .line 3
    :pswitch_1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity4;->y1()V

    goto :goto_0

    .line 4
    :pswitch_2
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity4;->t1()V

    goto :goto_0

    .line 5
    :pswitch_3
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity4;->u1()V

    goto :goto_0

    .line 6
    :pswitch_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->w1()V

    goto :goto_0

    :pswitch_5
    const/4 p1, 0x1

    .line 7
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameMainActivity4;->v1(I)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/GameMainActivity4;->v1(I)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method J1()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->J1:Lcom/join/mgps/rpc/l;

    invoke-interface {v0}, Lcom/join/mgps/rpc/l;->v()Lcom/join/mgps/dto/GameWorldResponse;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameWorldResponse;->getError()I

    move-result v1

    const/16 v2, 0x2bd

    if-ne v1, v2, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->p1()V

    return-void

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameWorldResponse;->getError()I

    move-result v1

    if-nez v1, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameWorldResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->H1:Ljava/util/List;

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->h2()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method K1()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Background;
        delay = 0x5dcL
    .end annotation

    return-void
.end method

.method L1(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    .line 2
    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/IntentDateBean;->setTpl_type(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0, p2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 4
    invoke-virtual {v0, p3}, Lcom/join/mgps/Util/IntentDateBean;->setJump_type(I)V

    .line 5
    invoke-virtual {v0, p4}, Lcom/join/mgps/Util/IntentDateBean;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, p5}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-virtual {p1, p2, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method N1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->P:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method O1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/login/LoginSplashActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;

    move-result-object v0

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method Q1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z
    .locals 3

    const/4 v0, 0x0

    .line 1
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

    if-eq v1, v2, :cond_0

    sget-object v2, Lcom/join/mgps/enums/ConstantIntEnum;->FC:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v2}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v2

    if-ne v1, v2, :cond_4

    .line 3
    :cond_0
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
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    if-eqz v1, :cond_2

    .line 7
    :try_start_2
    invoke-virtual {p2}, Lcom/join/mgps/db/tables/EMUApkTable;->getPackage_name()Ljava/lang/String;

    move-result-object p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 8
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    if-nez p1, :cond_1

    return v0

    .line 9
    :cond_1
    :try_start_4
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    const/16 p2, 0x14a

    if-gt p1, p2, :cond_4

    return v0

    :catch_1
    move-exception p1

    .line 10
    :try_start_5
    invoke-virtual {p1}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    return v0

    :catch_2
    move-exception p1

    .line 11
    :try_start_6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return v0

    .line 12
    :cond_2
    invoke-virtual {p2}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    .line 13
    invoke-virtual {p2}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    move-result v1

    if-ne v1, v2, :cond_3

    new-array v1, v0, [Ljava/lang/String;

    .line 14
    invoke-static {p1, p2, v0, v1}, Lcom/join/android/app/common/utils/l;->t(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;Z[Ljava/lang/String;)Z

    move-result p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    return p1

    :cond_3
    return v0

    :catch_3
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :catch_4
    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method R1()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->Y:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/NavigationAdapter;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->m2:Ljava/util/ArrayList;

    const-string v2, "\u52a8\u6001"

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/NavigationAdapter;->getItem(I)Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_;

    if-eqz v1, :cond_1

    .line 3
    move-object v1, v0

    check-cast v1, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_;

    invoke-virtual {v1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->b0()I

    move-result v1

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->j2:Lcom/join/mgps/dialog/c2;

    if-nez v2, :cond_0

    .line 5
    new-instance v2, Lcom/join/mgps/dialog/c2;

    invoke-direct {v2, p0, v1}, Lcom/join/mgps/dialog/c2;-><init>(Landroid/content/Context;I)V

    iput-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->j2:Lcom/join/mgps/dialog/c2;

    .line 6
    new-instance v1, Lcom/join/mgps/activity/GameMainActivity4$j;

    invoke-direct {v1, p0, v0}, Lcom/join/mgps/activity/GameMainActivity4$j;-><init>(Lcom/join/mgps/activity/GameMainActivity4;Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v2, v1}, Lcom/join/mgps/dialog/c2;->e(Lcom/join/mgps/dialog/c2$a;)V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->j2:Lcom/join/mgps/dialog/c2;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->j2:Lcom/join/mgps/dialog/c2;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->B1:Landroid/widget/ImageView;

    .line 9
    invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v2

    int-to-double v2, v2

    const-wide v4, 0x3fe999999999999aL    # 0.8

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v4

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0711ad

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v2, v4

    double-to-int v2, v2

    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07106c

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    neg-float v3, v3

    float-to-int v3, v3

    .line 11
    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    :cond_1
    return-void
.end method

.method S1()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->i2:Lcom/papa91/arc/dialog/AchievmentTipsDialog;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/papa91/arc/dialog/AchievmentTipsDialog;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/papa91/arc/dialog/AchievmentTipsDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->i2:Lcom/papa91/arc/dialog/AchievmentTipsDialog;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->i2:Lcom/papa91/arc/dialog/AchievmentTipsDialog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->i2:Lcom/papa91/arc/dialog/AchievmentTipsDialog;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->A1:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v2

    int-to-double v2, v2

    const-wide v4, 0x3fe999999999999aL    # 0.8

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v4

    iget-object v4, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f07128b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v2, v4

    double-to-int v2, v2

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07106c

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    neg-float v3, v3

    float-to-int v3, v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    return-void
.end method

.method T1()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/FriendActivity;->z0()V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity4;->M1()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->h:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->h:Landroid/os/Handler;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->h:Landroid/os/Handler;

    new-instance v1, Lcom/join/mgps/activity/GameMainActivity4$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameMainActivity4$a;-><init>(Lcom/join/mgps/activity/GameMainActivity4;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method U1()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->m2()V

    return-void
.end method

.method public V1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa91/arc/http/utils/PrefUtil;->getInstance(Landroid/content/Context;)Lcom/papa91/arc/http/utils/PrefUtil;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v2, "isHasAchievement"

    invoke-virtual {v0, v2, v1}, Lcom/papa91/arc/http/utils/PrefUtil;->save(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->B1:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->l2:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->k2:Lcom/join/mgps/customview/NavigationAdapter;

    if-eqz v0, :cond_2

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->l2:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 5
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 7
    instance-of v1, v1, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment_;

    if-eqz v1, :cond_0

    .line 8
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->m2:Ljava/util/ArrayList;

    const-string v2, "\u6210\u5c31"

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->k2:Lcom/join/mgps/customview/NavigationAdapter;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->l2:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->m2:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/customview/NavigationAdapter;->d(Ljava/util/List;Ljava/util/List;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->k2:Lcom/join/mgps/customview/NavigationAdapter;

    invoke-virtual {v0}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    :cond_2
    return-void
.end method

.method W1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->r2:Ljava/util/List;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->T:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameMainActivity4;->Y1(Z)V

    :cond_0
    return-void
.end method

.method X1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->v2:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->T:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameMainActivity4;->Y1(Z)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->T:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameMainActivity4;->Y1(Z)V

    :goto_0
    return-void
.end method

.method Y1(Z)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->U1:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x6

    if-ge v0, v1, :cond_1

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->U1:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/DynamicEntranceBean;

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/DynamicEntranceBean;->getTypeId()I

    move-result v3

    if-ne v3, v2, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->U1:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz p1, :cond_2

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->U1:Ljava/util/List;

    new-instance v0, Lcom/join/mgps/dto/DynamicEntranceBean;

    const-string v1, "\u793e\u533a"

    const-string v3, ""

    invoke-direct {v0, v1, v3, v2}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->T1:Lcom/join/mgps/adapter/j1;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public Z1(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public a2(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->z2:Z

    return-void
.end method

.method afterViews()V
    .locals 8
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iput-object p0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/BaseActivity;->setSystemUiHide(Z)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v1}, Lcom/papa91/arc/http/utils/PrefUtil;->getInstance(Landroid/content/Context;)Lcom/papa91/arc/http/utils/PrefUtil;

    move-result-object v1

    const-string v2, "achievement_done"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Lcom/papa91/arc/http/utils/PrefUtil;->save(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v1}, Lcom/papa91/arc/http/utils/PrefUtil;->getInstance(Landroid/content/Context;)Lcom/papa91/arc/http/utils/PrefUtil;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v3, "isHasAchievement"

    invoke-virtual {v1, v3, v2}, Lcom/papa91/arc/http/utils/PrefUtil;->save(Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->Z1:Landroidx/fragment/app/FragmentManager;

    .line 6
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->N1:Lcom/join/mgps/rpc/k;

    .line 7
    invoke-static {}, Lcom/join/mgps/rpc/impl/l;->n0()Lcom/join/mgps/rpc/impl/l;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->J1:Lcom/join/mgps/rpc/l;

    .line 8
    invoke-static {}, Lcom/join/mgps/rpc/impl/g;->A0()Lcom/join/mgps/rpc/impl/g;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->t2:Lcom/join/mgps/rpc/i;

    .line 9
    invoke-static {}, Lcom/join/mgps/rpc/impl/h;->p()Lcom/join/mgps/rpc/impl/h;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->W1:Lcom/join/mgps/rpc/j;

    .line 10
    invoke-static {}, Lcom/join/mgps/rpc/impl/c;->k()Lcom/join/mgps/rpc/impl/c;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->X1:Lcom/join/mgps/rpc/d;

    .line 11
    invoke-static {}, Lcom/join/mgps/rpc/impl/e;->m()Lcom/join/mgps/rpc/impl/e;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->V1:Lcom/join/mgps/rpc/f;

    .line 12
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_0

    .line 13
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/join/mgps/enums/ConstantIntEnum;->GBA:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v2}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 14
    iput-boolean v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->o2:Z

    .line 15
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->M1:Lcom/wufan/user/service/protobuf/n0;

    .line 16
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_1

    .line 17
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->Q:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    :cond_1
    new-instance v1, Landroid/view/View;

    invoke-direct {v1, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->T:Landroid/view/View;

    .line 19
    new-instance v1, Lcom/join/mgps/adapter/j1;

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->U1:Ljava/util/List;

    invoke-direct {v1, p0, v2, p0}, Lcom/join/mgps/adapter/j1;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/join/mgps/adapter/j1$a;)V

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->T1:Lcom/join/mgps/adapter/j1;

    .line 20
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->U:Landroid/widget/GridView;

    invoke-virtual {v2, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 21
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->U:Landroid/widget/GridView;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/widget/GridView;->setOverScrollMode(I)V

    .line 22
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07150f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 23
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0713fa

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 24
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 25
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    mul-int v1, v1, v3

    .line 26
    div-int/2addr v1, v2

    .line 27
    new-instance v2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v1, v3}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 28
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->V:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 29
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->C1()V

    .line 30
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->getData()V

    .line 31
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->z1()V

    .line 32
    iget-boolean v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->o2:Z

    if-eqz v1, :cond_2

    .line 33
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->H1()V

    .line 34
    :cond_2
    new-instance v1, Lcom/join/mgps/socket/fight/arena/a;

    new-instance v2, Lcom/join/mgps/activity/GameMainActivity4$c;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/GameMainActivity4$c;-><init>(Lcom/join/mgps/activity/GameMainActivity4;)V

    invoke-direct {v1, p0, v2}, Lcom/join/mgps/socket/fight/arena/a;-><init>(Landroid/app/Activity;Lcom/join/mgps/socket/fight/arena/a$y;)V

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->S1:Lcom/join/mgps/socket/fight/arena/a;

    .line 35
    invoke-static {}, Lnotchtools/geek/com/notchtools/b;->o()Lnotchtools/geek/com/notchtools/b;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnotchtools/geek/com/notchtools/b;->c(Landroid/view/Window;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 36
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->W:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 37
    invoke-static {}, Lnotchtools/geek/com/notchtools/b;->o()Lnotchtools/geek/com/notchtools/b;

    move-result-object v2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v2, v3}, Lnotchtools/geek/com/notchtools/b;->e(Landroid/view/Window;)I

    move-result v2

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07106c

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 38
    :cond_3
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 39
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    .line 40
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    sget-object v3, Lcom/papa/sim/statistic/Event;->indexGameStart:Lcom/papa/sim/statistic/Event;

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    iget-object v6, p0, Lcom/join/mgps/activity/GameMainActivity4;->O:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Lcom/papa/sim/statistic/p;->Z0(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 41
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->Y1:Lcom/join/mgps/activity/GameMainActivity4$EmuOutResultReceiver;

    if-nez v0, :cond_4

    .line 42
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4$EmuOutResultReceiver;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4$EmuOutResultReceiver;-><init>(Lcom/join/mgps/activity/GameMainActivity4;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->Y1:Lcom/join/mgps/activity/GameMainActivity4$EmuOutResultReceiver;

    .line 43
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.gameout"

    .line 44
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 45
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->Y1:Lcom/join/mgps/activity/GameMainActivity4$EmuOutResultReceiver;

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 46
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->X:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->clearOnTabSelectedListeners()V

    .line 47
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->X:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->removeAllTabs()V

    return-void
.end method

.method public b2(I)V
    .locals 0

    return-void
.end method

.method back()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public d2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->C1:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/FriendActivity;->y0(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->p1:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public e2()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->Z1:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f010054

    const v2, 0x7f01005f

    .line 2
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->setCustomAnimations(II)Landroidx/fragment/app/FragmentTransaction;

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->c2:Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;

    invoke-direct {v1}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->c2:Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;

    .line 5
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 6
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    const-string v3, "gameId"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameMainV4DataBean;->getBbs_strategy_contribute_url()Ljava/lang/String;

    move-result-object v2

    const-string v3, "draftUrl"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    const-string v3, "isExpand"

    .line 8
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 9
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->c2:Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;

    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    const v1, 0x7f090519

    .line 10
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->c2:Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentTransaction;->show(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 12
    :goto_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->v1:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->p1:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method f2(Lcom/join/mgps/dto/GameMainV4DataBean;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method g2(Lcom/join/mgps/dto/OnlineCouponConfigBean;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, p0, p1, v1}, Lcom/join/mgps/Util/a0;->V(Landroid/content/Context;Lcom/join/mgps/dto/OnlineCouponConfigBean;I)V

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->quitSingleSuccessUpRedBag:Lcom/papa/sim/statistic/Event;

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->Q1(Lcom/papa/sim/statistic/Event;I)V

    return-void
.end method

.method getData()V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 3
    new-instance v1, Lcom/join/mgps/dto/RequestGameIdArgs;

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity4;->M1:Lcom/wufan/user/service/protobuf/n0;

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    :goto_0
    invoke-direct {v1, v2, v4, v4, v3}, Lcom/join/mgps/dto/RequestGameIdArgs;-><init>(Ljava/lang/String;III)V

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestGameIdArgs;->setGameId(Ljava/lang/String;)V

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestGameIdArgs;->setToken(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->N1:Lcom/join/mgps/rpc/k;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/k;->j(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    .line 8
    iput-boolean v4, p0, Lcom/join/mgps/activity/GameMainActivity4;->p2:Z

    if-eqz v0, :cond_4

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getFlag()I

    move-result v1

    if-ne v1, v4, :cond_4

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameMainV4DataBean;

    .line 11
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameMainActivity4;->f2(Lcom/join/mgps/dto/GameMainV4DataBean;)V

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMaingameinfo;->getCommunity_multi_posts_id()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->L1:Ljava/lang/String;

    .line 14
    :cond_1
    invoke-static {}, Lb2/u;->n()Lb2/u;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lb2/u;->o(Ljava/lang/String;)Lcom/join/mgps/db/tables/GameMainTable;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 15
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getAchieve()Lcom/join/mgps/dto/GameMainachieve;

    move-result-object v2

    .line 16
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v3

    invoke-virtual {v1}, Lcom/join/mgps/db/tables/GameMainTable;->getGame_main_data()Ljava/lang/String;

    move-result-object v5

    const-class v6, Lcom/join/mgps/dto/GameMainDataBean;

    invoke-virtual {v3, v5, v6}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/GameMainDataBean;

    if-eqz v3, :cond_2

    .line 17
    invoke-virtual {v3}, Lcom/join/mgps/dto/GameMainDataBean;->getAchieve()Lcom/join/mgps/dto/GameMainachieve;

    move-result-object v3

    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    .line 18
    invoke-virtual {v3}, Lcom/join/mgps/dto/GameMainachieve;->getLastShowVerTime()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Lcom/join/mgps/dto/GameMainachieve;->setLastShowVerTime(J)V

    .line 19
    :cond_2
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 20
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/join/mgps/db/tables/GameMainTable;->setGameid(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v1, v2}, Lcom/join/mgps/db/tables/GameMainTable;->setGame_main_data(Ljava/lang/String;)V

    .line 22
    invoke-static {}, Lb2/u;->n()Lb2/u;

    move-result-object v2

    invoke-virtual {v2, v1}, Lp1/b;->update(Ljava/lang/Object;)I

    goto :goto_1

    .line 23
    :cond_3
    new-instance v1, Lcom/join/mgps/db/tables/GameMainTable;

    invoke-direct {v1}, Lcom/join/mgps/db/tables/GameMainTable;-><init>()V

    .line 24
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 25
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/join/mgps/db/tables/GameMainTable;->setGameid(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v1, v2}, Lcom/join/mgps/db/tables/GameMainTable;->setGame_main_data(Ljava/lang/String;)V

    .line 27
    invoke-static {}, Lb2/u;->n()Lb2/u;

    move-result-object v2

    invoke-virtual {v2, v1}, Lp1/b;->k(Ljava/lang/Object;)I

    .line 28
    :goto_1
    invoke-virtual {p0, v0, v4}, Lcom/join/mgps/activity/GameMainActivity4;->r2(Lcom/join/mgps/dto/GameMainV4DataBean;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_2
    return-void
.end method

.method h2()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->I1:Lcom/join/mgps/activity/GameMainActivity4$l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->I1:Lcom/join/mgps/activity/GameMainActivity4$l;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 3
    :cond_0
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4$l;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    const v2, 0x7f110165

    invoke-direct {v0, p0, v1, v2}, Lcom/join/mgps/activity/GameMainActivity4$l;-><init>(Lcom/join/mgps/activity/GameMainActivity4;Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->I1:Lcom/join/mgps/activity/GameMainActivity4$l;

    .line 4
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method handleFailure(Lapp/mgsim/arena/ArenaResponse;)V
    .locals 10
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->N1()V

    .line 2
    iget v0, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    const/16 v1, 0x101

    .line 3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "\u786e\u5b9a"

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x4

    const-string v8, "dialog_error_hint"

    const/16 v9, 0x10

    if-ne v0, v9, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->S1:Lcom/join/mgps/socket/fight/arena/a;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v1, v7, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v5

    const-string p1, "\u65e0\u6cd5\u52a0\u5165\uff0c\u4f60\u88ab\u7981\u6b62\u52a0\u5165\u8be5\u623f\u95f4"

    aput-object p1, v7, v4

    aput-object v2, v7, v3

    invoke-virtual {v0, v8, v7}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const/16 v9, 0x11

    if-ne v0, v9, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->S1:Lcom/join/mgps/socket/fight/arena/a;

    new-array v2, v7, [Ljava/lang/Object;

    aput-object v1, v2, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v5

    const-string p1, "\u8be5\u623f\u95f4\u4e3a\u6bd4\u8d5b\u4e13\u7528\u623f\u95f4,\u975e\u53c2\u8d5b\u9009\u624b\u65e0\u6cd5\u52a0\u5165"

    aput-object p1, v2, v4

    const-string p1, "\u6211\u77e5\u9053\u4e86"

    aput-object p1, v2, v3

    invoke-virtual {v0, v8, v2}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    const/16 v9, 0x9

    if-ne v0, v9, :cond_2

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->S1:Lcom/join/mgps/socket/fight/arena/a;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v1, v7, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v5

    const-string p1, "\u623f\u95f4\u4eba\u6570\u5df2\u6ee1\u4f60\u65e0\u6cd5\u52a0\u5165\u623f\u95f4!"

    aput-object p1, v7, v4

    aput-object v2, v7, v3

    invoke-virtual {v0, v8, v7}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    const/4 v9, 0x7

    if-ne v0, v9, :cond_3

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->S1:Lcom/join/mgps/socket/fight/arena/a;

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v9, 0x100

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v1, v6

    iget v6, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v5

    const-string v5, "\u5bc6\u7801\u8f93\u5165\u9519\u8bef\uff0c\u8bf7\u91cd\u8bd5!"

    aput-object v5, v1, v4

    const-string v4, "\u53d6\u6d88"

    aput-object v4, v1, v3

    aput-object v2, v1, v7

    const/4 v2, 0x5

    aput-object p1, v1, v2

    invoke-virtual {v0, v8, v1}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    const/16 v9, 0x8

    if-ne v0, v9, :cond_4

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->S1:Lcom/join/mgps/socket/fight/arena/a;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v1, v7, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v5

    const-string p1, "\u623f\u95f4\u5df2\u7ecf\u88ab\u89e3\u6563!"

    aput-object p1, v7, v4

    aput-object v2, v7, v3

    invoke-virtual {v0, v8, v7}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_4
    const/16 v9, 0xb

    if-ne v0, v9, :cond_5

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->S1:Lcom/join/mgps/socket/fight/arena/a;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v1, v7, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v5

    const-string p1, "\u94dc\u677f\u4e0d\u8db3\uff0c\u65e0\u6cd5\u521b\u5efa\u623f\u95f4!"

    aput-object p1, v7, v4

    aput-object v2, v7, v3

    invoke-virtual {v0, v8, v7}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_5
    const/16 v9, 0xd

    if-ne v0, v9, :cond_6

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->S1:Lcom/join/mgps/socket/fight/arena/a;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v1, v7, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v5

    const-string p1, "\u94dc\u677f\u4e0d\u8db3\uff0c\u65e0\u6cd5\u52a0\u5165\u623f\u95f4"

    aput-object p1, v7, v4

    aput-object v2, v7, v3

    invoke-virtual {v0, v8, v7}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_6
    const/16 v1, 0x3e9

    if-ne v0, v1, :cond_7

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->S1:Lcom/join/mgps/socket/fight/arena/a;

    new-array v1, v7, [Ljava/lang/Object;

    const/16 v7, 0x102

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v1, v6

    iget v6, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v5

    iget-object p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorInfo:Ljava/lang/String;

    aput-object p1, v1, v4

    aput-object v2, v1, v3

    invoke-virtual {v0, v8, v1}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_7
    return-void
.end method

.method public isLogined(Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method j2()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->Z1(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->k2()V

    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->launch_game_switch()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    new-instance v3, Lcom/join/mgps/activity/GameMainActivity4$f;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/GameMainActivity4$f;-><init>(Lcom/join/mgps/activity/GameMainActivity4;)V

    const-string v4, "RAW_SIMULATOR"

    invoke-static {v0, v1, v2, v4, v3}, Lcom/join/mgps/Util/UtilsMy;->z0(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lcom/join/mgps/activity/arena/GameRoomActivity$x;)V

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->k2()V

    :goto_0
    return-void
.end method

.method k1()V
    .locals 8
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/p;->R(Ljava/lang/String;)V

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    const-string v3, "game_main"

    invoke-virtual {v0, v1, v2, v3}, Lcom/papa/sim/statistic/p;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    :try_start_0
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->L0(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 4
    :goto_0
    new-instance v0, Lcom/join/mgps/dto/GameInfoBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/GameInfoBean;-><init>()V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameInfoBean;->setGame_id(Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameInfoBean;->setGame_name(Ljava/lang/String;)V

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFight_fun()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFight_fun()Ljava/lang/String;

    move-result-object v1

    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x7

    const/16 v6, 0x31

    const/16 v7, 0x30

    if-lt v4, v5, :cond_2

    const/4 v4, 0x6

    .line 12
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/4 v5, 0x5

    .line 13
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v6, :cond_1

    const/16 v1, 0x31

    goto :goto_1

    :cond_1
    const/16 v1, 0x30

    goto :goto_1

    :cond_2
    const/16 v1, 0x30

    const/16 v4, 0x30

    :goto_1
    if-ne v7, v3, :cond_3

    if-ne v7, v4, :cond_3

    if-ne v1, v6, :cond_3

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->J1()V

    return-void

    .line 15
    :cond_3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isFightFun()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->o1()V

    .line 17
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/activity/arena/GameRoomListActivity_;->W3(Landroid/content/Context;)Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;->b(Z)Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;->c(Lcom/join/mgps/dto/GameInfoBean;)Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_2

    .line 18
    :cond_4
    invoke-static {p0}, Lcom/join/mgps/activity/NewArenaMainActivty_;->g1(Landroid/content/Context;)Lcom/join/mgps/activity/NewArenaMainActivty_$h;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :goto_2
    return-void
.end method

.method k2()V
    .locals 16

    move-object/from16 v1, p0

    .line 1
    const-class v0, Ljava/lang/String;

    const-string v2, ""

    .line 2
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 3
    :try_start_0
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v7

    const-class v8, Ljava/util/HashMap;

    new-array v9, v4, [Ljava/lang/Class;

    aput-object v0, v9, v6

    aput-object v0, v9, v5

    invoke-virtual {v7, v8, v9}, Lcom/join/android/app/common/utils/JsonMapper;->createCollectionType(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    .line 4
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v7

    iget-object v8, v1, Lcom/join/mgps/activity/GameMainActivity4;->s2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v8}, Lcom/join/mgps/pref/PrefDef_;->lastStartSimulatorCore()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v8

    invoke-virtual {v8}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v7, v8, v0}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/HashMap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v7, :cond_0

    .line 5
    :try_start_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v3, v0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v3, v7

    goto :goto_1

    :cond_0
    move-object v3, v7

    .line 6
    :goto_0
    :try_start_2
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-object v2, v0

    goto :goto_2

    :catch_1
    move-exception v0

    .line 7
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 8
    :cond_1
    :goto_2
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    const/4 v7, 0x0

    if-eqz v0, :cond_b

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getNetBattle()Lcom/join/mgps/dto/GameMainNetBattle;

    move-result-object v0

    .line 10
    iget-object v8, v1, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/GameMainV4DataBean;->getSimulator_core()Lcom/join/mgps/dto/GameMainV4DataBean$SimulatorCoreBean;

    move-result-object v8

    if-eqz v8, :cond_2

    iget-object v8, v1, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/GameMainV4DataBean;->getSimulator_core()Lcom/join/mgps/dto/GameMainV4DataBean$SimulatorCoreBean;

    move-result-object v8

    invoke-virtual {v8}, Lcom/join/mgps/dto/GameMainV4DataBean$SimulatorCoreBean;->getCore()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_2

    .line 11
    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameMainV4DataBean;->getSimulator_core()Lcom/join/mgps/dto/GameMainV4DataBean$SimulatorCoreBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameMainV4DataBean$SimulatorCoreBean;->getCore()Ljava/lang/String;

    move-result-object v2

    :cond_2
    move-object v15, v2

    .line 12
    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v3, v2, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity4;->s2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->lastStartSimulatorCore()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-static {v3}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    if-eqz v0, :cond_3

    .line 14
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainNetBattle;->getSilence_room_switch()I

    move-result v0

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    if-nez v0, :cond_4

    .line 15
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v7, v0, v2, v6, v15}, Lcom/join/mgps/Util/UtilsMy;->j(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;)V

    goto/16 :goto_6

    .line 16
    :cond_4
    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFight_fun()Ljava/lang/String;

    move-result-object v2

    .line 17
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v8, 0x7

    if-lt v3, v8, :cond_5

    const/4 v3, 0x6

    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x31

    if-ne v3, v2, :cond_5

    const/4 v2, 0x1

    goto :goto_4

    :cond_5
    const/4 v2, 0x0

    .line 19
    :goto_4
    iget-object v3, v1, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 20
    iget-object v3, v1, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/GameMaingameinfo;->getMax_battle_count()I

    move-result v3

    move v14, v3

    goto :goto_5

    :cond_6
    const/4 v14, 0x0

    :goto_5
    if-ne v0, v5, :cond_8

    .line 21
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity4;->O1:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget v12, v1, Lcom/join/mgps/activity/GameMainActivity4;->P1:I

    if-eqz v12, :cond_7

    .line 22
    iget-object v8, v1, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v9, v1, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    const/4 v10, 0x1

    iget-object v11, v1, Lcom/join/mgps/activity/GameMainActivity4;->O1:Ljava/lang/String;

    iget-object v13, v1, Lcom/join/mgps/activity/GameMainActivity4;->Q1:Ljava/lang/String;

    invoke-static/range {v8 .. v15}, Lcom/join/mgps/Util/UtilsMy;->l(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V

    goto :goto_6

    .line 23
    :cond_7
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v7, v0, v2, v6, v15}, Lcom/join/mgps/Util/UtilsMy;->j(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;)V

    goto :goto_6

    :cond_8
    if-ne v0, v4, :cond_a

    if-eqz v2, :cond_a

    .line 24
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity4;->O1:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget v12, v1, Lcom/join/mgps/activity/GameMainActivity4;->P1:I

    if-eqz v12, :cond_9

    .line 25
    iget-object v8, v1, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v9, v1, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    const/4 v10, 0x1

    iget-object v11, v1, Lcom/join/mgps/activity/GameMainActivity4;->O1:Ljava/lang/String;

    iget-object v13, v1, Lcom/join/mgps/activity/GameMainActivity4;->Q1:Ljava/lang/String;

    invoke-static/range {v8 .. v15}, Lcom/join/mgps/Util/UtilsMy;->l(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V

    goto :goto_6

    .line 26
    :cond_9
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v7, v0, v2, v6, v15}, Lcom/join/mgps/Util/UtilsMy;->j(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;)V

    goto :goto_6

    .line 27
    :cond_a
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v7, v0, v2, v6, v15}, Lcom/join/mgps/Util/UtilsMy;->j(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;)V

    goto :goto_6

    .line 28
    :cond_b
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v3, v1, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v7, v0, v3, v6, v2}, Lcom/join/mgps/Util/UtilsMy;->j(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;)V

    .line 29
    :goto_6
    invoke-static/range {p0 .. p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Lcom/join/mgps/activity/GameMainActivity4;->M1:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/papa/sim/statistic/p;->I0(Ljava/lang/String;I)V

    return-void
.end method

.method l1()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getMemberInfo()Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getMemberInfo()Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->getLink_type()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v1

    const-string v2, "http"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v1

    const-string v2, "?"

    .line 6
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&game_id="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 8
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "?game_id="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 9
    :goto_0
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->setLink_type_val(Ljava/lang/String;)V

    .line 10
    :cond_1
    new-instance v1, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v1}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->getLink_type()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->getJump_type()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setJump_type(I)V

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 14
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-virtual {v0, v2, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    :cond_2
    return-void
.end method

.method m1()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameMasteryLevel()Lcom/join/mgps/dto/GameMasteryLevel;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_5

    .line 2
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameMasteryLevel()Lcom/join/mgps/dto/GameMasteryLevel;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [I

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMasteryLevel;->getCurrent_lv_times()I

    move-result v3

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMasteryLevel;->getNext_lv_times()I

    move-result v4

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMasteryLevel;->getLevel()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMasteryLevel;->getLevel()Ljava/lang/String;

    move-result-object v5

    const-string v6, "\u4f20\u8bf4"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMasteryLevel;->getLevel()Ljava/lang/String;

    move-result-object v5

    const-string v6, "\u5b97\u5e08"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMasteryLevel;->getLevel()Ljava/lang/String;

    move-result-object v5

    const-string v6, "\u7cbe\u82f1"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    .line 9
    :cond_3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMasteryLevel;->getLevel()Ljava/lang/String;

    move-result-object v0

    const-string v5, "\u8d44\u6df1"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->s2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->gameTimeLvCfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v5, 0x1

    .line 11
    :try_start_1
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v6

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v7

    const-class v8, Ljava/util/ArrayList;

    new-array v9, v5, [Ljava/lang/Class;

    const-class v10, Lcom/join/mgps/dto/GameTimeLevel;

    aput-object v10, v9, v1

    invoke-virtual {v7, v8, v9}, Lcom/join/android/app/common/utils/JsonMapper;->createCollectionType(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v7

    invoke-virtual {v6, v0, v7}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    new-array v2, v6, [I

    const/4 v6, 0x0

    .line 13
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v6, v7, :cond_5

    .line 14
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/join/mgps/dto/GameTimeLevel;

    invoke-virtual {v7}, Lcom/join/mgps/dto/GameTimeLevel;->getVal()I

    move-result v7

    aput v7, v2, v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    .line 15
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    add-int/2addr v3, v1

    const/4 v0, 0x0

    .line 16
    :goto_2
    array-length v6, v2

    if-ge v1, v6, :cond_8

    add-int/lit8 v4, v1, 0x1

    .line 17
    aget v6, v2, v1

    sub-int v0, v6, v0

    if-gt v3, v0, :cond_6

    goto :goto_3

    .line 18
    :cond_6
    array-length v6, v2

    sub-int/2addr v6, v5

    if-ne v1, v6, :cond_7

    :goto_3
    move v4, v0

    goto :goto_4

    :cond_7
    sub-int/2addr v3, v0

    .line 19
    aget v1, v2, v1

    move v11, v4

    move v4, v0

    move v0, v1

    move v1, v11

    goto :goto_2

    .line 20
    :cond_8
    :goto_4
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_5

    :catch_1
    move-exception v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_9
    :goto_5
    return-void
.end method

.method m2()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_comment_score_switch()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_comment_score_switch()Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/activity/CommentAllListActivity_;->H0(Landroid/content/Context;)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->f(Ljava/lang/String;)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_package()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->i(Ljava/lang/String;)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_plugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->h(Ljava/lang/String;)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_bespeak_switch()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->a(I)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_is_started()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->g(I)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->j(I)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_comment_score_switch()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->d(Ljava/lang/String;)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void

    .line 11
    :cond_2
    :goto_0
    invoke-static {p0}, Lcom/join/mgps/activity/ForumIndexActivity_;->i0(Landroid/content/Context;)Lcom/join/mgps/activity/ForumIndexActivity_$d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :cond_3
    :goto_1
    return-void
.end method

.method o1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->y2:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    invoke-virtual {v0, v1}, Lcom/join/mgps/socket/fight/arena/ArenaService;->A(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method o2()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->d2()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "GAME_HOME_PAGE"

    .line 1
    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->j:Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->i:Ljava/lang/String;

    .line 3
    invoke-super {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    new-instance p1, Lcom/join/mgps/activity/GameMainActivity4$b;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/GameMainActivity4$b;-><init>(Lcom/join/mgps/activity/GameMainActivity4;)V

    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentActivity;->setExitSharedElementCallback(Landroidx/core/app/SharedElementCallback;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->S1:Lcom/join/mgps/socket/fight/arena/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/a;->w()V

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->M1:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->z0(Ljava/lang/String;I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->y2:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    invoke-virtual {v0, v1}, Lcom/join/mgps/socket/fight/arena/ArenaService;->A(Ljava/lang/Object;)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->g()V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->stopService()V

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->Y1:Lcom/join/mgps/activity/GameMainActivity4$EmuOutResultReceiver;

    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 12
    :cond_3
    invoke-super {p0}, Lcom/join/mgps/activity/FriendActivity;->onDestroy()V

    return-void
.end method

.method protected onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/FriendActivity;->onResume()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->N1()V

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->M1:Lcom/wufan/user/service/protobuf/n0;

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Lcom/join/mgps/socket/fight/arena/b;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->x2:Lcom/join/mgps/socket/fight/arena/b$b;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/socket/fight/arena/b;-><init>(Landroid/content/Context;Lcom/join/mgps/socket/fight/arena/b$b;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->bindService()V

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->K1()V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_1

    .line 9
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v1, v2, p0}, Lp1/f;->L(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->d(Ljava/lang/String;I)V

    .line 10
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v1, v2, p0}, Lp1/f;->L(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->d(Ljava/lang/String;I)V

    .line 11
    :cond_1
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity4;->c2()V

    :cond_2
    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onStop()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->y2:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    invoke-virtual {v0, v1}, Lcom/join/mgps/socket/fight/arena/ArenaService;->A(Ljava/lang/Object;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->g()V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->stopService()V

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    :cond_1
    return-void
.end method

.method p1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u767b\u5f55\u5df2\u5931\u6548\u8bf7\u60a8\u91cd\u65b0\u767b\u5f55"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->O1()V

    return-void
.end method

.method p2(I)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method r1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->T:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->u2:I

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->u2:I

    invoke-virtual {v0, p0, v1}, Lcom/join/mgps/Util/IntentUtil;->goForumGroupActivity(Landroid/content/Context;I)V

    goto :goto_1

    .line 3
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->m2()V

    :goto_1
    return-void
.end method

.method r2(Lcom/join/mgps/dto/GameMainV4DataBean;Z)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->K1:Lcom/join/mgps/dto/GameMainV4DataBean;

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->Q:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    :cond_0
    invoke-direct {p0, p2}, Lcom/join/mgps/activity/GameMainActivity4;->q2(Z)V

    if-eqz p2, :cond_1

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity4;->s2()V

    :cond_1
    return-void
.end method

.method s1()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/activity/EndGameActivity_;->U0(Landroid/content/Context;)Lcom/join/mgps/activity/EndGameActivity_$t;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method w1()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->N1()V

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    .line 5
    invoke-static {}, Lcom/join/mgps/rpc/impl/l;->n0()Lcom/join/mgps/rpc/impl/l;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/join/mgps/rpc/impl/l;->P(ILjava/lang/String;)Lcom/join/mgps/dto/ResultArenaBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultArenaBean;->getError()I

    move-result v1

    if-nez v1, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultArenaBean;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultArenaBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lapp/mgsim/arena/ArenaLobbyServer;

    invoke-virtual {v0}, Lapp/mgsim/arena/ArenaLobbyServer;->getDisabled()I

    move-result v0

    if-eqz v0, :cond_1

    .line 9
    new-instance v0, Lapp/mgsim/arena/ArenaResponse;

    invoke-direct {v0}, Lapp/mgsim/arena/ArenaResponse;-><init>()V

    const/16 v1, 0x3e9

    .line 10
    iput v1, v0, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    const-string v1, "\u9080\u8bf7\u5931\u8d25\uff1a\u8be5\u73a9\u5bb6\u5df2\u88ab\u5c01\u7981\uff01"

    .line 11
    iput-object v1, v0, Lapp/mgsim/arena/ArenaResponse;->errorInfo:Ljava/lang/String;

    .line 12
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameMainActivity4;->handleFailure(Lapp/mgsim/arena/ArenaResponse;)V

    return-void

    .line 13
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->x1()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method x1()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/IntentUtil;->goLoginBattle(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity4;->n1()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->P:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->w2:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v2}, Lcom/join/mgps/Util/UtilsMy;->W(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    const-string v0, "\u6b63\u5728\u4e0b\u8f7d\u63d2\u4ef6..."

    .line 7
    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->N1()V

    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/ArenaService;->s()Z

    move-result v0

    const-string v3, "register_type_GameMainActivity"

    if-eqz v0, :cond_1

    .line 11
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Lcom/wufan/friend/chat/c;->V(Lcom/join/mgps/dto/FriendBean;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v4

    invoke-static {v3, v0, v1, v4, v2}, Lapp/mgsim/arena/ArenaRequestFactory;->createRoom(Ljava/lang/String;Ljava/lang/String;IIZ)Lapp/mgsim/arena/ArenaRequest;

    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v1, v0}, Lcom/join/mgps/socket/fight/arena/b;->f(Lapp/mgsim/arena/ArenaRequest;)V

    goto :goto_0

    .line 14
    :cond_1
    invoke-static {v3}, Lapp/mgsim/arena/ArenaRequestFactory;->login(Ljava/lang/String;)Lapp/mgsim/arena/ArenaRequest;

    move-result-object v0

    .line 15
    iput-boolean v2, v0, Lapp/mgsim/arena/ArenaRequest;->isRefreshing:Z

    .line 16
    iput-boolean v1, v0, Lapp/mgsim/arena/ArenaRequest;->isElite:Z

    .line 17
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->R1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v1, v0}, Lcom/join/mgps/socket/fight/arena/b;->f(Lapp/mgsim/arena/ArenaRequest;)V

    .line 18
    :cond_2
    :goto_0
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->F1:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->M1:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->N0(Ljava/lang/String;I)V

    goto :goto_1

    .line 19
    :cond_3
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method z1()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 3
    invoke-virtual {v0, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 4
    new-instance v1, Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;-><init>()V

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;->setGameId(Ljava/lang/String;)V

    .line 6
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;->setUid(Ljava/lang/String;)V

    .line 7
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;->setToken(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->N1:Lcom/join/mgps/rpc/k;

    invoke-virtual {v0}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/k;->c0(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getAllAchievementsData: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/SimulatorAllAchievementBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/SimulatorAllAchievementBean;->getAchievement_list()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->D1:Landroid/content/Context;

    invoke-static {v1}, Lcom/papa91/arc/http/utils/PrefUtil;->getInstance(Landroid/content/Context;)Lcom/papa91/arc/http/utils/PrefUtil;

    move-result-object v1

    const-string v2, "all_achievements"

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v3

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/SimulatorAllAchievementBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAllAchievementBean;->getAchievement_list()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/papa91/arc/http/utils/PrefUtil;->save(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
