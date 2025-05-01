.class public Lcom/join/mgps/activity/ModGameIndexActivity;
.super Lcom/BaseAppCompatActivity;
.source "ModGameIndexActivity.java"

# interfaces
.implements Landroid/view/View$OnSystemUiVisibilityChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/ModGameIndexActivity$y;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0075
.end annotation

.annotation build Lorg/androidannotations/annotations/Fullscreen;
.end annotation

.annotation build Lorg/androidannotations/annotations/WindowFeature;
    value = {
        0x1
    }
.end annotation


# static fields
.field private static U1:Lcom/github/snowdream/android/app/downloader/b; = null

.field static V1:Lcom/github/snowdream/android/app/downloader/b$b; = null

.field private static W1:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/github/snowdream/android/app/downloader/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final X1:I = 0x7


# instance fields
.field A:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private A1:J

.field B:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private B1:Z

.field C:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private C1:I

.field D:Lcom/join/mgps/customview/MyTouchFrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private D1:I

.field E:Lcom/join/mgps/customview/MyTouchFrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private E1:Z

.field F:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private F1:Z

.field G:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private G1:Lcom/join/mgps/dialog/l1;

.field H:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private H1:Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathDataV2;

.field I:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field private I1:Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;

.field J:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field private J1:Ljava/lang/Runnable;

.field K:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field private K1:Ljava/lang/Runnable;

.field private L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field private L1:I

.field private M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field private M1:J

.field N:Lcom/join/mgps/dto/ModGameDetailBean;

.field N1:Landroid/app/Dialog;

.field O:Lcom/join/mgps/dto/GamedetialModleFourBean;

.field O1:Lcom/join/kotlin/ui/cloudarchive/ModgameModTabFragment;

.field P:Lcom/join/mgps/dto/GamedetialModleFourBean;

.field P1:Lcom/join/kotlin/ui/cloudarchive/ModgameCloudListFragment;

.field private Q:Ljava/lang/String;

.field Q1:Lcom/join/kotlin/ui/introduction/ModIntroductionFragment;

.field R:Lcom/join/mgps/dto/ExtBean;

.field R1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/ModGameIndexActivity$y;",
            ">;"
        }
    .end annotation
.end field

.field S:Lcom/join/mgps/dialog/f1;

.field S1:Z

.field private T:I

.field T1:Landroid/app/Dialog;

.field private U:Z

.field V:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field private W:Lcom/join/mgps/adapter/ModGameRecomendShrinkAdapter;

.field private X:Lcom/join/mgps/adapter/ModGameRecommendExpandAdapter;

.field private Y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/business/CollectionBeanSubBusiness;",
            ">;"
        }
    .end annotation
.end field

.field private Z:Z

.field b:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f09090f
    .end annotation
.end field

.field c:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f0915de
    .end annotation
.end field

.field d:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f09120b
    .end annotation
.end field

.field e:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f090d0c
    .end annotation
.end field

.field f:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f090d2e
    .end annotation
.end field

.field g:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f09094e
    .end annotation
.end field

.field h:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f09162d
    .end annotation
.end field

.field i:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f09163d
    .end annotation
.end field

.field j:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f091687
    .end annotation
.end field

.field k:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f091685
    .end annotation
.end field

.field l:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f091648
    .end annotation
.end field

.field m:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field o:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field p:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private p0:Landroid/app/Activity;

.field private p1:I

.field q:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field r:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field s:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field t:Landroidx/viewpager/widget/ViewPager;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field u:Lcom/google/android/material/tabs/TabLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field v:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private v1:Z

.field w:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field x:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field y:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field z:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    sput-object v0, Lcom/join/mgps/activity/ModGameIndexActivity;->W1:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->T:I

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Y:Ljava/util/ArrayList;

    .line 5
    iput v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    .line 6
    iput-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->E1:Z

    .line 7
    iput-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->F1:Z

    .line 8
    new-instance v1, Lcom/join/mgps/activity/ModGameIndexActivity$q;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$q;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    iput-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->J1:Ljava/lang/Runnable;

    .line 9
    new-instance v1, Lcom/join/mgps/activity/ModGameIndexActivity$r;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$r;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    iput-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->K1:Ljava/lang/Runnable;

    .line 10
    iput v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L1:I

    const-wide/16 v1, 0x0

    .line 11
    iput-wide v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M1:J

    .line 12
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->R1:Ljava/util/List;

    .line 13
    iput-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S1:Z

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/ModGameIndexActivity;->z1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    return-void
.end method

.method private A1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 7

    .line 1
    new-instance p1, Lcom/join/kotlin/ui/cloudarchive/dialog/NoticeArchiveDialog;

    invoke-direct {p1}, Lcom/join/kotlin/ui/cloudarchive/dialog/NoticeArchiveDialog;-><init>()V

    .line 2
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$h;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/cloudarchive/dialog/NoticeArchiveDialog;->setClickDelDialogListener(Lcom/join/kotlin/ui/cloudarchive/dialog/ClickDelDialogListener;)V

    .line 3
    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;

    const-string v2, ""

    const-string v3, "\u7531\u4e8e\u5b89\u535311\u4ee5\u4e0a\u7cfb\u7edf\u9650\u5236\uff0c\u65e0\u6cd5\u540c\u6b65\u5b58\u6863\u81f3\u589e\u5f3a\u6a21\u5f0f\uff0c\u8bf7\u4f7f\u7528\u6807\u51c6\u6a21\u5f0f\u6e38\u73a9\u5df2\u4fdd\u5b58\u7684\u6e38\u620f\u5b58\u6863"

    const-string v4, "\u6211\u77e5\u9053\u4e86"

    const-string v5, ""

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4
    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/cloudarchive/dialog/NoticeArchiveDialog;->setDialogData(Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;)V

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lcom/join/kotlin/ui/cloudarchive/dialog/NoticeArchiveDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->V0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method private B1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/lang/String;)V
    .locals 7

    .line 1
    new-instance p1, Lcom/join/kotlin/ui/cloudarchive/dialog/NoticeArchiveDialog;

    invoke-direct {p1}, Lcom/join/kotlin/ui/cloudarchive/dialog/NoticeArchiveDialog;-><init>()V

    .line 2
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$g;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/cloudarchive/dialog/NoticeArchiveDialog;->setClickDelDialogListener(Lcom/join/kotlin/ui/cloudarchive/dialog/ClickDelDialogListener;)V

    .line 3
    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;

    const-string v2, ""

    const-string v4, "\u6211\u77e5\u9053\u4e86"

    const-string v5, ""

    const/4 v6, 0x0

    move-object v1, v0

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4
    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/cloudarchive/dialog/NoticeArchiveDialog;->setDialogData(Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;)V

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    const-string v0, ""

    invoke-virtual {p1, p2, v0}, Lcom/join/kotlin/ui/cloudarchive/dialog/NoticeArchiveDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/activity/ModGameIndexActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->r1()V

    return-void
.end method

.method private C1(Lcom/github/snowdream/android/app/downloader/DownloadTask;II)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->G1:Lcom/join/mgps/dialog/l1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->x1()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 3
    invoke-direct {p0, p1, p3}, Lcom/join/mgps/activity/ModGameIndexActivity;->z1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    :cond_1
    const/4 p3, 0x2

    if-ne p2, p3, :cond_2

    .line 4
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->V0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    :cond_2
    :goto_0
    return-void

    .line 5
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModGameDetailBean;->getPd_info()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    if-eqz v1, :cond_4

    if-eqz v0, :cond_4

    .line 7
    new-instance v7, Lcom/join/mgps/dialog/l1;

    invoke-direct {v7, p0, v0}, Lcom/join/mgps/dialog/l1;-><init>(Landroid/content/Context;Lcom/join/mgps/dto/DomainInfoBean;)V

    iput-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->G1:Lcom/join/mgps/dialog/l1;

    .line 8
    new-instance v8, Lcom/join/mgps/activity/ModGameIndexActivity$e;

    move-object v1, v8

    move-object v2, p0

    move v3, p2

    move-object v4, p1

    move v5, p3

    move-object v6, v0

    invoke-direct/range {v1 .. v6}, Lcom/join/mgps/activity/ModGameIndexActivity$e;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;ILcom/github/snowdream/android/app/downloader/DownloadTask;ILcom/join/mgps/dto/DomainInfoBean;)V

    invoke-virtual {v7, v8}, Lcom/join/mgps/dialog/l1;->t(Lcom/join/mgps/dialog/l1$a;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->G1:Lcom/join/mgps/dialog/l1;

    invoke-virtual {p1}, Lcom/join/mgps/dialog/l1;->show()V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object p2, Lcom/papa/sim/statistic/Event;->pdSingleStartDetails:Lcom/papa/sim/statistic/Event;

    new-instance p3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {p3, v1}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object p3

    invoke-virtual {v0}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object p3

    invoke-virtual {v0}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    :cond_4
    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/activity/ModGameIndexActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    return p0
.end method

.method private D1()V
    .locals 8

    .line 1
    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/dialog/NoticeArchiveDialog;

    invoke-direct {v0}, Lcom/join/kotlin/ui/cloudarchive/dialog/NoticeArchiveDialog;-><init>()V

    .line 2
    new-instance v1, Lcom/join/mgps/activity/ModGameIndexActivity$f;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$f;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/cloudarchive/dialog/NoticeArchiveDialog;->setClickDelDialogListener(Lcom/join/kotlin/ui/cloudarchive/dialog/ClickDelDialogListener;)V

    .line 3
    new-instance v1, Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;

    const-string v3, ""

    const-string v4, "\u5df2\u6210\u529f\u540c\u6b65\u5b58\u6863\u81f3\u589e\u5f3a\u6a21\u5f0f"

    const-string v5, "\u6211\u77e5\u9053\u4e86"

    const-string v6, ""

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/cloudarchive/dialog/NoticeArchiveDialog;->setDialogData(Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;)V

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/join/kotlin/ui/cloudarchive/dialog/NoticeArchiveDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic E0(Lcom/join/mgps/activity/ModGameIndexActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->T:I

    return p0
.end method

.method static synthetic F0(Lcom/join/mgps/activity/ModGameIndexActivity;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->T:I

    return p1
.end method

.method static synthetic G0(Lcom/join/mgps/activity/ModGameIndexActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->o1()V

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/activity/ModGameIndexActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->p1()V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/activity/ModGameIndexActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->v1:Z

    return p0
.end method

.method private I1(Lcom/join/mgps/dto/ModGameDetailBean;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getCloud_archive_local_path()Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    .line 2
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getCloud_archive_local_path()Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getMod_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;->setModPackageName(Ljava/lang/String;)V

    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getCloud_archive_local_path()Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getMain_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;->setMainGamePackageName(Ljava/lang/String;)V

    .line 4
    iget-object v2, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->I1:Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getCloud_archive_local_path()Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;->setModGameArchivePathData(Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;)V

    .line 5
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getMod_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 6
    iget-object v2, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->I1:Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;

    invoke-virtual {v2, v3}, Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;->setInstallInExtPlug(Z)V

    .line 7
    :cond_0
    iget-object v2, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->I1:Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;

    invoke-virtual {v2, v0}, Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;->loadLocalArchiveDatas(Landroid/content/Context;)V

    .line 8
    :cond_1
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 9
    sget-object v2, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getMod_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/join/mgps/va/overmind/f;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 10
    invoke-static {v2}, Lcom/join/mgps/mod/utils/PluginConfig;->getArchiveSection(Ljava/lang/String;)Lcom/join/mgps/Util/u$c;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v4, "archiveId"

    .line 11
    invoke-virtual {v2, v4}, Lcom/join/mgps/Util/u$c;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 12
    iget-object v4, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->I1:Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;

    invoke-virtual {v4}, Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;->getRunIngArchiveId()Landroidx/lifecycle/MutableLiveData;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 13
    :cond_2
    iget-object v2, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->u:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v2}, Lcom/google/android/material/tabs/TabLayout;->clearOnTabSelectedListeners()V

    .line 14
    iget-object v2, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->u:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v2}, Lcom/google/android/material/tabs/TabLayout;->removeAllTabs()V

    .line 15
    iget-object v2, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->I1:Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;->getShowDownlloadDialog()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    new-instance v4, Lcom/join/mgps/activity/r1;

    invoke-direct {v4, v0}, Lcom/join/mgps/activity/r1;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-virtual {v2, v0, v4}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 16
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 17
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 18
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getMod_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v5

    const-string v6, "gameId"

    const-string v7, "\u653b\u7565"

    if-eqz v5, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getMod_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBbs_strategy_switch()I

    move-result v5

    if-ne v5, v3, :cond_3

    .line 19
    iget-object v5, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->Q1:Lcom/join/kotlin/ui/introduction/ModIntroductionFragment;

    if-nez v5, :cond_3

    .line 20
    new-instance v5, Lcom/join/kotlin/ui/introduction/ModIntroductionFragment_;

    invoke-direct {v5}, Lcom/join/kotlin/ui/introduction/ModIntroductionFragment_;-><init>()V

    iput-object v5, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->Q1:Lcom/join/kotlin/ui/introduction/ModIntroductionFragment;

    .line 21
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 22
    iget-object v8, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {v5, v6, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getMod_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v8

    invoke-virtual {v8}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBbs_strategy_contribute_url()Ljava/lang/String;

    move-result-object v8

    const-string v9, "draftUrl"

    invoke-virtual {v5, v9, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    iget-object v8, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->Q1:Lcom/join/kotlin/ui/introduction/ModIntroductionFragment;

    invoke-virtual {v8, v5}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 25
    new-instance v5, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    iget-object v8, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->Q1:Lcom/join/kotlin/ui/introduction/ModIntroductionFragment;

    invoke-direct {v5, v7, v8}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getCloud_archive_local_path()Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    move-result-object v5

    const-string v8, "\u6211\u7684\u5b58\u6863"

    const-string v9, "\u5b58\u6863\u793e\u533a"

    const-string v10, "datas"

    const-string v11, "type"

    const/4 v12, 0x0

    if-eqz v5, :cond_4

    .line 27
    new-instance v5, Lcom/join/kotlin/ui/cloudarchive/ModgameCloudListFragment;

    invoke-direct {v5}, Lcom/join/kotlin/ui/cloudarchive/ModgameCloudListFragment;-><init>()V

    iput-object v5, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->P1:Lcom/join/kotlin/ui/cloudarchive/ModgameCloudListFragment;

    .line 28
    iget-object v5, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {v2, v6, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    invoke-virtual {v2, v11, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 30
    invoke-virtual {v2, v10, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 31
    iget-object v5, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->P1:Lcom/join/kotlin/ui/cloudarchive/ModgameCloudListFragment;

    invoke-virtual {v5, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 32
    new-instance v2, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    iget-object v5, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->P1:Lcom/join/kotlin/ui/cloudarchive/ModgameCloudListFragment;

    invoke-direct {v2, v9, v5}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 34
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getMod_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v13

    invoke-virtual {v13}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPackageName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v5, v13, v12}, Lcom/join/mgps/va/overmind/d;->f(Ljava/lang/String;I)Z

    .line 35
    iget-object v5, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {v2, v6, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    invoke-virtual {v2, v11, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 37
    invoke-virtual {v2, v10, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 38
    new-instance v5, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    const-class v13, Lcom/join/kotlin/ui/cloudarchive/ModGameCloudArchiveFragment;

    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v0, v13, v2}, Landroidx/fragment/app/Fragment;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;

    move-result-object v2

    invoke-direct {v5, v8, v2}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    :cond_4
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 40
    iget-object v5, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {v2, v6, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v5, 0x2

    .line 41
    invoke-virtual {v2, v11, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 42
    iget-object v6, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-static {v6}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 43
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v6

    iget-object v11, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {v6, v11}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v6

    iput-object v6, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 44
    :cond_5
    iget-object v6, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v6, :cond_6

    .line 45
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getMod_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v6

    iput-object v6, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 46
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getGold_finger()Ljava/util/List;

    move-result-object v6

    const-string v11, "MOD"

    if-eqz v6, :cond_7

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getGold_finger()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_7

    .line 47
    new-instance v6, Lcom/join/kotlin/ui/cloudarchive/ModgameModTabFragment_;

    invoke-direct {v6}, Lcom/join/kotlin/ui/cloudarchive/ModgameModTabFragment_;-><init>()V

    iput-object v6, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->O1:Lcom/join/kotlin/ui/cloudarchive/ModgameModTabFragment;

    .line 48
    invoke-virtual {v2, v10, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 49
    iget-object v6, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->O1:Lcom/join/kotlin/ui/cloudarchive/ModgameModTabFragment;

    invoke-virtual {v6, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 50
    new-instance v2, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    iget-object v6, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->O1:Lcom/join/kotlin/ui/cloudarchive/ModgameModTabFragment;

    invoke-direct {v2, v11, v6}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    :cond_7
    new-instance v2, Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v6

    invoke-direct {v2, v6, v4}, Lcom/join/mgps/adapter/FragmentPagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V

    .line 52
    iget-object v4, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->t:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v4, v2}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 53
    iget-object v2, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->u:Lcom/google/android/material/tabs/TabLayout;

    iget-object v4, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->t:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2, v4}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 54
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getMod_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getMod_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBbs_strategy_switch()I

    move-result v2

    if-ne v2, v3, :cond_8

    const/4 v2, 0x1

    goto :goto_0

    :cond_8
    const/4 v2, 0x0

    :goto_0
    const/16 v6, 0x8

    const-string v10, "#FFFFFF"

    const v14, 0x7f09078d

    const v15, 0x7f0c0640

    const v5, 0x7f0806ac

    const v3, 0x7f080edf

    if-eqz v2, :cond_9

    .line 55
    new-instance v4, Lcom/join/mgps/activity/ModGameIndexActivity$y;

    invoke-direct {v4, v0}, Lcom/join/mgps/activity/ModGameIndexActivity$y;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    .line 56
    iput v5, v4, Lcom/join/mgps/activity/ModGameIndexActivity$y;->a:I

    .line 57
    iput v5, v4, Lcom/join/mgps/activity/ModGameIndexActivity$y;->d:I

    .line 58
    iput-object v7, v4, Lcom/join/mgps/activity/ModGameIndexActivity$y;->f:Ljava/lang/String;

    .line 59
    iput v3, v4, Lcom/join/mgps/activity/ModGameIndexActivity$y;->b:I

    .line 60
    iget-object v13, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->R1:Ljava/util/List;

    invoke-interface {v13, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    iget-object v4, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->u:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v4, v12}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 62
    invoke-virtual {v4, v15}, Lcom/google/android/material/tabs/TabLayout$Tab;->setCustomView(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    .line 63
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v13

    invoke-virtual {v13, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/ImageView;

    .line 64
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v14

    invoke-virtual {v14, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 65
    invoke-virtual {v13, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 66
    invoke-virtual {v13, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 67
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v13

    const v14, 0x7f090ea1

    invoke-virtual {v13, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/TextView;

    .line 68
    invoke-virtual {v13, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 70
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v13

    const v14, 0x7f091556

    invoke-virtual {v13, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/TextView;

    .line 71
    invoke-virtual {v13, v12}, Landroid/widget/TextView;->setVisibility(I)V

    const-string v14, "\u65b0"

    .line 72
    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v4

    const v13, 0x7f090799

    invoke-virtual {v4, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 74
    invoke-virtual {v4, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    const-string v13, "res:///2131232418"

    .line 75
    invoke-static {v13}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v13

    invoke-static {v4, v13}, Lcom/join/android/app/common/utils/MyImageLoader;->m(Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/net/Uri;)V

    .line 76
    :cond_9
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getCloud_archive_local_path()Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    move-result-object v4

    const-string v14, "#C1D0DD"

    if-eqz v4, :cond_12

    .line 77
    new-instance v4, Lcom/join/mgps/activity/ModGameIndexActivity$y;

    invoke-direct {v4, v0}, Lcom/join/mgps/activity/ModGameIndexActivity$y;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    const v5, 0x7f0809e9

    .line 78
    iput v5, v4, Lcom/join/mgps/activity/ModGameIndexActivity$y;->a:I

    const v6, 0x7f0809ea

    .line 79
    iput v6, v4, Lcom/join/mgps/activity/ModGameIndexActivity$y;->d:I

    const v6, 0x7f080ee0

    .line 80
    iput v6, v4, Lcom/join/mgps/activity/ModGameIndexActivity$y;->b:I

    .line 81
    iput-object v9, v4, Lcom/join/mgps/activity/ModGameIndexActivity$y;->f:Ljava/lang/String;

    .line 82
    iget-object v7, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->R1:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v2, :cond_a

    .line 83
    iget-object v4, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->u:Lcom/google/android/material/tabs/TabLayout;

    const/4 v7, 0x1

    invoke-virtual {v4, v7}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v4

    goto :goto_1

    .line 84
    :cond_a
    iget-object v4, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->u:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v4, v12}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v4

    :goto_1
    if-eqz v4, :cond_d

    .line 85
    invoke-virtual {v4, v15}, Lcom/google/android/material/tabs/TabLayout$Tab;->setCustomView(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    .line 86
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v7

    const v13, 0x7f09078d

    invoke-virtual {v7, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/ImageView;

    .line 87
    invoke-virtual {v7, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    if-nez v2, :cond_b

    .line 88
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v13

    invoke-virtual {v13, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 89
    :cond_b
    invoke-virtual {v7, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 90
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v3

    const v4, 0x7f090ea1

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz v2, :cond_c

    .line 91
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2

    .line 92
    :cond_c
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 93
    :goto_2
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    new-instance v3, Lcom/join/mgps/activity/ModGameIndexActivity$y;

    invoke-direct {v3, v0}, Lcom/join/mgps/activity/ModGameIndexActivity$y;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    const v4, 0x7f080f43

    .line 95
    iput v4, v3, Lcom/join/mgps/activity/ModGameIndexActivity$y;->a:I

    const v4, 0x7f080f44

    .line 96
    iput v4, v3, Lcom/join/mgps/activity/ModGameIndexActivity$y;->d:I

    .line 97
    iput v6, v3, Lcom/join/mgps/activity/ModGameIndexActivity$y;->b:I

    .line 98
    iput-object v8, v3, Lcom/join/mgps/activity/ModGameIndexActivity$y;->f:Ljava/lang/String;

    .line 99
    iget-object v4, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->R1:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_d
    if-eqz v2, :cond_e

    .line 100
    iget-object v3, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->u:Lcom/google/android/material/tabs/TabLayout;

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v3

    goto :goto_3

    .line 101
    :cond_e
    iget-object v3, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->u:Lcom/google/android/material/tabs/TabLayout;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v3

    :goto_3
    if-eqz v3, :cond_f

    .line 102
    invoke-virtual {v3, v15}, Lcom/google/android/material/tabs/TabLayout$Tab;->setCustomView(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    .line 103
    invoke-virtual {v3}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v4

    const v5, 0x7f09078d

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    .line 104
    invoke-virtual {v4, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    const v5, 0x7f080f43

    .line 105
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 106
    invoke-virtual {v3}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v3

    const v4, 0x7f090ea1

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 107
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 108
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    :cond_f
    iget-object v3, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v3, :cond_10

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getGold_finger()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_10

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getGold_finger()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_10

    const/4 v7, 0x1

    goto :goto_4

    :cond_10
    const/4 v7, 0x0

    :goto_4
    if-eqz v7, :cond_18

    .line 110
    new-instance v1, Lcom/join/mgps/activity/ModGameIndexActivity$y;

    invoke-direct {v1, v0}, Lcom/join/mgps/activity/ModGameIndexActivity$y;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    const v3, 0x7f080a1f

    .line 111
    iput v3, v1, Lcom/join/mgps/activity/ModGameIndexActivity$y;->a:I

    const v3, 0x7f080a20

    .line 112
    iput v3, v1, Lcom/join/mgps/activity/ModGameIndexActivity$y;->d:I

    .line 113
    iput-object v11, v1, Lcom/join/mgps/activity/ModGameIndexActivity$y;->f:Ljava/lang/String;

    .line 114
    iput v6, v1, Lcom/join/mgps/activity/ModGameIndexActivity$y;->b:I

    .line 115
    iget-object v3, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->R1:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v2, :cond_11

    .line 116
    iget-object v1, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->u:Lcom/google/android/material/tabs/TabLayout;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v1

    goto :goto_5

    .line 117
    :cond_11
    iget-object v1, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->u:Lcom/google/android/material/tabs/TabLayout;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v1

    :goto_5
    if-eqz v1, :cond_18

    .line 118
    invoke-virtual {v1, v15}, Lcom/google/android/material/tabs/TabLayout$Tab;->setCustomView(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    .line 119
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v2

    const v3, 0x7f09078d

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 120
    invoke-virtual {v2, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    const v3, 0x7f080a1f

    .line 121
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 122
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v1

    const v2, 0x7f090ea1

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 123
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 124
    invoke-virtual {v1, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_8

    :cond_12
    if-eqz v2, :cond_13

    .line 125
    new-instance v4, Lcom/join/mgps/activity/ModGameIndexActivity$y;

    invoke-direct {v4, v0}, Lcom/join/mgps/activity/ModGameIndexActivity$y;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    .line 126
    iput v5, v4, Lcom/join/mgps/activity/ModGameIndexActivity$y;->a:I

    .line 127
    iput v5, v4, Lcom/join/mgps/activity/ModGameIndexActivity$y;->d:I

    .line 128
    iput-object v7, v4, Lcom/join/mgps/activity/ModGameIndexActivity$y;->f:Ljava/lang/String;

    .line 129
    iput v3, v4, Lcom/join/mgps/activity/ModGameIndexActivity$y;->b:I

    .line 130
    iget-object v8, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->R1:Ljava/util/List;

    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    iget-object v4, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->u:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v4, v12}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v4

    if-eqz v4, :cond_13

    .line 132
    invoke-virtual {v4, v15}, Lcom/google/android/material/tabs/TabLayout$Tab;->setCustomView(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    .line 133
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v8

    const v9, 0x7f09078d

    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/ImageView;

    .line 134
    invoke-virtual {v8, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 135
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 136
    invoke-virtual {v8, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 137
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v5

    const v6, 0x7f090ea1

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 138
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 139
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 140
    invoke-virtual {v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v4

    const v5, 0x7f090799

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 141
    invoke-virtual {v4, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    const-string v5, "res:///2131232418"

    .line 142
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/join/android/app/common/utils/MyImageLoader;->m(Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/net/Uri;)V

    .line 143
    :cond_13
    iget-object v4, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v4, :cond_14

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getGold_finger()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_14

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getGold_finger()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_14

    const/4 v7, 0x1

    goto :goto_6

    :cond_14
    const/4 v7, 0x0

    :goto_6
    if-eqz v7, :cond_18

    .line 144
    new-instance v1, Lcom/join/mgps/activity/ModGameIndexActivity$y;

    invoke-direct {v1, v0}, Lcom/join/mgps/activity/ModGameIndexActivity$y;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    const v4, 0x7f080a1f

    .line 145
    iput v4, v1, Lcom/join/mgps/activity/ModGameIndexActivity$y;->a:I

    const v4, 0x7f080a20

    .line 146
    iput v4, v1, Lcom/join/mgps/activity/ModGameIndexActivity$y;->d:I

    .line 147
    iput-object v11, v1, Lcom/join/mgps/activity/ModGameIndexActivity$y;->f:Ljava/lang/String;

    .line 148
    iput v3, v1, Lcom/join/mgps/activity/ModGameIndexActivity$y;->b:I

    .line 149
    iget-object v4, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->R1:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v2, :cond_15

    .line 150
    iget-object v1, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->u:Lcom/google/android/material/tabs/TabLayout;

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v1

    goto :goto_7

    :cond_15
    const/4 v4, 0x1

    .line 151
    iget-object v1, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->u:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v1, v12}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v1

    :goto_7
    if-eqz v1, :cond_19

    .line 152
    invoke-virtual {v1, v15}, Lcom/google/android/material/tabs/TabLayout$Tab;->setCustomView(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    if-nez v2, :cond_16

    .line 153
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 154
    :cond_16
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v3

    const v5, 0x7f09078d

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 155
    invoke-virtual {v3, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    const v5, 0x7f080a1f

    .line 156
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 157
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v3

    const v5, 0x7f090ea1

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 158
    iget-object v5, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->R1:Ljava/util/List;

    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result v1

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/activity/ModGameIndexActivity$y;

    iget-object v1, v1, Lcom/join/mgps/activity/ModGameIndexActivity$y;->c:Ljava/lang/String;

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 159
    invoke-virtual {v3, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v2, :cond_17

    .line 160
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_9

    .line 161
    :cond_17
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_9

    :cond_18
    :goto_8
    const/4 v4, 0x1

    .line 162
    :cond_19
    :goto_9
    iget-object v1, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->u:Lcom/google/android/material/tabs/TabLayout;

    new-instance v2, Lcom/join/mgps/activity/ModGameIndexActivity$j;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/ModGameIndexActivity$j;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-virtual {v1, v2}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    .line 163
    iget-object v1, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->P1:Lcom/join/kotlin/ui/cloudarchive/ModgameCloudListFragment;

    if-eqz v1, :cond_1b

    .line 164
    iget-object v1, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->t:Landroidx/viewpager/widget/ViewPager;

    iget-object v2, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->Q1:Lcom/join/kotlin/ui/introduction/ModIntroductionFragment;

    if-nez v2, :cond_1a

    const/4 v3, 0x0

    goto :goto_a

    :cond_1a
    const/4 v3, 0x1

    :goto_a
    invoke-virtual {v1, v3}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    :cond_1b
    return-void
.end method

.method static synthetic J0(Lcom/join/mgps/activity/ModGameIndexActivity;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Y:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic K0(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/join/mgps/business/CollectionBeanSubBusiness;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/activity/ModGameIndexActivity;->u1(Lcom/join/mgps/business/CollectionBeanSubBusiness;IZ)V

    return-void
.end method

.method private K1(Landroid/content/Context;ILjava/lang/String;)V
    .locals 15

    move-object/from16 v1, p1

    move/from16 v4, p2

    const-string v0, "adCount"

    const-string v2, "lastTime"

    .line 1
    invoke-static/range {p3 .. p3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    const/4 v5, 0x1

    if-eqz v3, :cond_d

    .line 2
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v3

    const-class v6, Lcom/join/mgps/dto/SingleGameAdCfgBean;

    move-object/from16 v7, p3

    invoke-virtual {v3, v7, v6}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Lcom/join/mgps/dto/SingleGameAdCfgBean;

    if-eqz v11, :cond_b

    .line 3
    invoke-virtual {v11}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getSwitch_state()I

    move-result v3

    if-ne v3, v5, :cond_b

    .line 4
    invoke-virtual {v11}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getSwitch_state()I

    move-result v3

    if-ne v3, v5, :cond_9

    .line 5
    new-instance v12, Lcom/papa91/wrapper/UserPrefs;

    invoke-direct {v12, v1}, Lcom/papa91/wrapper/UserPrefs;-><init>(Landroid/content/Context;)V

    const-wide/16 v6, 0x0

    .line 6
    invoke-static/range {p1 .. p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v3

    const/4 v8, 0x0

    if-eqz v3, :cond_0

    .line 7
    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v9

    move v13, v9

    goto :goto_0

    :cond_0
    const/4 v13, 0x0

    .line 8
    :goto_0
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, ""

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v12, v9}, Lcom/papa91/wrapper/UserPrefs;->getAdGamesConfig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 9
    invoke-static {v9}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_2

    .line 10
    :try_start_0
    new-instance v14, Lorg/json/JSONObject;

    invoke-direct {v14, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v14, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 12
    invoke-virtual {v14, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    goto :goto_1

    .line 13
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 14
    :goto_1
    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 15
    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    const/4 v0, 0x0

    .line 17
    :goto_2
    invoke-static {v6, v7}, Lcom/join/mgps/Util/y;->u(J)Z

    move-result v2

    if-nez v2, :cond_3

    const/4 v0, 0x0

    .line 18
    :cond_3
    invoke-virtual {v11}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getDaily_times()I

    move-result v2

    if-ge v0, v2, :cond_4

    invoke-static {v3}, Lcom/join/mgps/Util/b;->piv(Lcom/wufan/user/service/protobuf/n0;)Z

    move-result v2

    if-nez v2, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    if-eqz v2, :cond_7

    .line 19
    invoke-virtual {v11}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getPlay_cfg()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v11}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getPlay_cfg()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_6

    .line 20
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    invoke-virtual {v11}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getPlay_cfg()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/PlayCfgBean;

    .line 22
    invoke-virtual {v6}, Lcom/join/mgps/dto/PlayCfgBean;->getProbability()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 23
    :cond_5
    invoke-static {v2}, Lcom/join/mgps/ad/p;->b(Ljava/util/List;)I

    move-result v8

    .line 24
    :cond_6
    invoke-virtual {v11}, Lcom/join/mgps/dto/SingleGameAdCfgBean;->getPlay_cfg()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/PlayCfgBean;

    .line 25
    invoke-virtual {v2}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object v8

    add-int/2addr v0, v5

    .line 26
    new-instance v3, Lcom/join/mgps/ad/RewardAdParams;

    invoke-virtual {v2}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v9

    invoke-virtual {v2}, Lcom/join/mgps/dto/PlayCfgBean;->getReward_time()I

    move-result v10

    move-object v6, v3

    invoke-direct/range {v6 .. v11}, Lcom/join/mgps/ad/RewardAdParams;-><init>(Ljava/lang/String;Ljava/lang/String;IILcom/join/mgps/dto/SingleGameAdCfgBean;)V

    .line 27
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    const-string v2, "_RewardAdParams"

    .line 28
    invoke-virtual {v8, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 29
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v9

    const-class v10, Lcom/join/mgps/activity/RewardAdDialogActivity;

    new-instance v11, Lcom/join/mgps/activity/ModGameIndexActivity$p;

    move-object v2, v11

    move-object v3, p0

    move/from16 v4, p2

    move-object v5, v12

    move v6, v13

    move v7, v0

    invoke-direct/range {v2 .. v7}, Lcom/join/mgps/activity/ModGameIndexActivity$p;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;ILcom/papa91/wrapper/UserPrefs;II)V

    invoke-virtual {v9, v1, v10, v8, v11}, Lcom/join/mgps/Util/IntentUtil;->startActivityWithCallback(Landroid/content/Context;Ljava/lang/Class;Landroid/content/Intent;Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;)V

    goto :goto_6

    :cond_7
    if-ne v4, v5, :cond_8

    .line 30
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->o1()V

    goto :goto_5

    .line 31
    :cond_8
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->p1()V

    .line 32
    :goto_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v1, v0}, Lcom/papa91/wrapper/UserPrefs;->setAdGamesConfig(Ljava/lang/String;I)V

    goto :goto_6

    :cond_9
    if-ne v4, v5, :cond_a

    .line 33
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->o1()V

    goto :goto_6

    .line 34
    :cond_a
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->p1()V

    goto :goto_6

    :cond_b
    if-ne v4, v5, :cond_c

    .line 35
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->o1()V

    goto :goto_6

    .line 36
    :cond_c
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->p1()V

    goto :goto_6

    :cond_d
    if-ne v4, v5, :cond_e

    .line 37
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->o1()V

    goto :goto_6

    .line 38
    :cond_e
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->p1()V

    :goto_6
    return-void
.end method

.method static synthetic L0(Lcom/join/mgps/activity/ModGameIndexActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->b1()V

    return-void
.end method

.method static synthetic M0(Lcom/join/mgps/activity/ModGameIndexActivity;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->s1(I)V

    return-void
.end method

.method static synthetic N0(Lcom/join/mgps/activity/ModGameIndexActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->B1:Z

    return p0
.end method

.method static synthetic O0(Lcom/join/mgps/activity/ModGameIndexActivity;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->B1:Z

    return p1
.end method

.method static synthetic P0(Lcom/join/mgps/activity/ModGameIndexActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->C1:I

    return p0
.end method

.method private P1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I1:Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;->getArchiveData()Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getUid()I

    move-result v1

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getUid()I

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5f53\u524d\u6b63\u5728\u4f7f\u7528 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getNickname()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " \u7684\u5b58\u6863"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 5
    :cond_0
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    .line 6
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lcom/join/mgps/dto/ModInfoBean;

    invoke-virtual {v0, v2, v3}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ModInfoBean;

    .line 7
    new-instance v2, Lcom/join/mgps/mod/bean/ModMeta;

    invoke-direct {v2}, Lcom/join/mgps/mod/bean/ModMeta;-><init>()V

    .line 8
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/mod/bean/ModMeta;->setPackageName(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_path()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/mod/bean/ModMeta;->setModPath(Ljava/lang/String;)V

    .line 10
    iget-object v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    const-string v4, "0"

    if-eqz v3, :cond_4

    .line 11
    invoke-virtual {v3}, Lcom/join/mgps/dto/ModGameDetailBean;->getGold_finger()Ljava/util/List;

    move-result-object v3

    const-string v5, "1"

    if-nez v3, :cond_1

    move-object v3, v4

    goto :goto_0

    :cond_1
    move-object v3, v5

    :goto_0
    invoke-virtual {v2, v3}, Lcom/join/mgps/mod/bean/ModMeta;->setGoldFingerSwitch(Ljava/lang/String;)V

    .line 12
    iget-object v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModGameDetailBean;->getCloud_archive_local_path()Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    move-result-object v3

    if-nez v3, :cond_2

    move-object v5, v4

    :cond_2
    invoke-virtual {v2, v5}, Lcom/join/mgps/mod/bean/ModMeta;->setArchiveCloudSwitch(Ljava/lang/String;)V

    .line 13
    iget-object v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModGameDetailBean;->getMod_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    iget-object v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModGameDetailBean;->getMod_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBbs_strategy_switch()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-virtual {v2, v4}, Lcom/join/mgps/mod/bean/ModMeta;->setIntroductionSwitch(Ljava/lang/String;)V

    goto :goto_2

    .line 14
    :cond_4
    invoke-virtual {v2, v4}, Lcom/join/mgps/mod/bean/ModMeta;->setGoldFingerSwitch(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v2, v4}, Lcom/join/mgps/mod/bean/ModMeta;->setArchiveCloudSwitch(Ljava/lang/String;)V

    .line 16
    invoke-virtual {v2, v4}, Lcom/join/mgps/mod/bean/ModMeta;->setIntroductionSwitch(Ljava/lang/String;)V

    :goto_2
    const-string v3, ""

    if-eqz v0, :cond_5

    .line 17
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModInfoBean;->getVer()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/join/mgps/mod/bean/ModMeta;->setModVersion(Ljava/lang/String;)V

    .line 18
    invoke-virtual {v0}, Lcom/join/mgps/dto/ModInfoBean;->getVer()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/mod/bean/ModMeta;->setModCode(I)V

    .line 19
    :cond_5
    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->a2(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/mod/bean/ModMeta;->setTypeId(Ljava/lang/String;)V

    .line 20
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/mod/bean/ModMeta;->setGameId(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v2, v1}, Lcom/join/mgps/mod/bean/ModMeta;->setModType(I)V

    .line 22
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v0}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v0

    sget-object v4, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0, v4}, Lcom/join/android/app/common/utils/n;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/mod/bean/ModMeta;->setAndroidId(Ljava/lang/String;)V

    const-string v0, "wufun"

    .line 23
    invoke-virtual {v2, v0}, Lcom/join/mgps/mod/bean/ModMeta;->setPlatform(Ljava/lang/String;)V

    .line 24
    invoke-virtual {v2, v0}, Lcom/join/mgps/mod/bean/ModMeta;->setPackage_type(Ljava/lang/String;)V

    .line 25
    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->a2(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/mod/bean/ModMeta;->setTypeId(Ljava/lang/String;)V

    .line 26
    :try_start_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_path()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/join/mgps/va/overmind/d;->b0(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 28
    :goto_3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModGameDetailBean;->getMod_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 29
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModGameDetailBean;->getMod_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 30
    :cond_6
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {v0, p0, v2, v1, v3}, Lcom/join/mgps/va/overmind/d;->V(Landroid/content/Context;Lcom/join/mgps/mod/bean/ModMeta;ILjava/lang/String;)V

    .line 31
    invoke-static {p1}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_7

    const/4 v6, 0x1

    goto :goto_4

    .line 32
    :cond_7
    invoke-static {p1}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v1, 0x2

    const/4 v6, 0x2

    goto :goto_4

    :cond_8
    const/4 v6, 0x0

    .line 33
    :goto_4
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from()I

    move-result v7

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from_type()I

    move-result v8

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {v3 .. v9}, Lcom/papa/sim/statistic/p;->h1(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V

    .line 34
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->t4(Landroid/content/Context;Ljava/lang/String;)V

    return v2

    :cond_9
    return v1
.end method

.method static synthetic Q0(Lcom/join/mgps/activity/ModGameIndexActivity;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->C1:I

    return p1
.end method

.method static synthetic R0(Lcom/join/mgps/activity/ModGameIndexActivity;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->C1:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->C1:I

    return v0
.end method

.method private R1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v2

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v2, 0x5

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_4

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 6
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->r:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    const-string v2, "\u5df2\u5b89\u88c5"

    .line 7
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->r:Landroid/widget/TextView;

    const-string v2, "#FFDDEBFF"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->s:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v0, :cond_6

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 11
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->r:Landroid/widget/TextView;

    if-eqz v0, :cond_5

    const-string v2, "\u672a\u5b89\u88c5"

    .line 12
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->r:Landroid/widget/TextView;

    const-string v2, "#FF9DC7FF"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 14
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->s:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v0, :cond_6

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_6
    :goto_1
    return-void
.end method

.method private U0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_8

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_8

    .line 5
    :try_start_0
    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 6
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/join/mgps/enums/Dtype;->MOD:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_7

    .line 7
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/16 v1, 0x2a

    const/16 v3, 0x9

    if-eqz v0, :cond_3

    .line 9
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v4, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 10
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v4

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v0

    const-class v5, Lcom/join/mgps/dto/ModInfoBean;

    invoke-virtual {v4, v0, v5}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ModInfoBean;

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/ModInfoBean;->getVer()I

    move-result v0

    iget-object v4, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/ModInfoBean;->getVer()I

    move-result v4

    if-ge v0, v4, :cond_1

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-ne v0, v2, :cond_1

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 14
    :cond_1
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    iget-object v4, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/join/mgps/va/overmind/d;->s(Ljava/lang/String;)Lf2/a;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 15
    iget-object v4, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVer()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget v0, v0, Lf2/a;->k:I

    iget-object v4, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVer()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    if-ge v0, v4, :cond_4

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-ne v0, v2, :cond_4

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_upgrade_state()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_0

    .line 19
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/16 v2, 0xb

    invoke-virtual {v0, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 20
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eq v0, v3, :cond_6

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-ne v0, v1, :cond_5

    goto :goto_1

    .line 21
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 22
    :cond_6
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 23
    :cond_7
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    :goto_2
    return-void
.end method

.method private U1(Lcom/join/mgps/event/n;)V
    .locals 2

    const/4 p1, 0x0

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRef_crc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    goto :goto_1

    .line 5
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    :goto_1
    if-nez v0, :cond_1

    goto :goto_2

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->X:Lcom/join/mgps/adapter/ModGameRecommendExpandAdapter;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    :goto_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private V0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_3

    .line 2
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isOpen()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_3

    .line 3
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModGameDetailBean;->getCloud_archive_local_path()Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 4
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/join/mgps/Util/UtilsMy;->t4(Landroid/content/Context;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModGameDetailBean;->getCloud_archive_local_path()Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;->getMainArchiveLocalPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/Android/data"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-le v0, v1, :cond_0

    .line 7
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->A1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N1:Landroid/app/Dialog;

    if-nez v0, :cond_1

    .line 9
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    const-string v1, "\u5b58\u6863\u62f7\u8d1d\u4e2d"

    invoke-virtual {v0, p0, v1}, Lcom/join/mgps/Util/a0;->y(Landroid/content/Context;Ljava/lang/String;)Lcom/join/mgps/dialog/d1;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N1:Landroid/app/Dialog;

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N1:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 11
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->X0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModGameDetailBean;->getCloud_archive_local_path()Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;->getMainArchiveLocalPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/data/data"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 13
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->A1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    :cond_3
    :goto_0
    return-void
.end method

.method private W0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->J:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->J:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 6
    sget-object v2, Lcom/join/mgps/enums/Dtype;->android:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFileType(Ljava/lang/String;)V

    :cond_1
    if-eqz v0, :cond_8

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_8

    .line 9
    :try_start_0
    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 10
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/join/mgps/enums/Dtype;->android:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0x2a

    const/16 v3, 0x9

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    const/4 v4, 0x5

    if-ne v1, v4, :cond_4

    .line 11
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 13
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    if-ge v0, v1, :cond_5

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-ne v0, v4, :cond_5

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_upgrade_state()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_0

    .line 17
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_0

    .line 18
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_0

    .line 19
    :cond_4
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 20
    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eq v0, v3, :cond_7

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-ne v0, v2, :cond_6

    goto :goto_1

    .line 21
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->k:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 22
    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    :goto_2
    return-void
.end method

.method private b1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/BaseAppCompatActivity;->mHandler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->K1:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public static synthetic f0(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/pref/PrefDef_;)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/ModGameIndexActivity;->n1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/pref/PrefDef_;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g0(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/activity/ModGameIndexActivity;->j1(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic h0(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->l1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private h1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->z:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 2
    new-instance v0, Lcom/join/mgps/adapter/ModGameRecomendShrinkAdapter;

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Y:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lcom/join/mgps/adapter/ModGameRecomendShrinkAdapter;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->W:Lcom/join/mgps/adapter/ModGameRecomendShrinkAdapter;

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->W:Lcom/join/mgps/adapter/ModGameRecomendShrinkAdapter;

    new-instance v1, Lcom/join/mgps/activity/u1;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/u1;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 6
    new-instance v0, Lcom/join/mgps/adapter/ModGameRecommendExpandAdapter;

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Y:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lcom/join/mgps/adapter/ModGameRecommendExpandAdapter;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->X:Lcom/join/mgps/adapter/ModGameRecommendExpandAdapter;

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->X:Lcom/join/mgps/adapter/ModGameRecommendExpandAdapter;

    new-instance v1, Lcom/join/mgps/activity/t1;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/t1;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->X:Lcom/join/mgps/adapter/ModGameRecommendExpandAdapter;

    new-instance v1, Lcom/join/mgps/activity/s1;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/s1;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemChildClickListener(Lcom/join/mgps/base/BaseQuickAdapter$h;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/join/mgps/activity/ModGameIndexActivity$s;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$s;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->z:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/join/mgps/activity/ModGameIndexActivity$t;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$t;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 13
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/join/mgps/activity/ModGameIndexActivity$u;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$u;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-direct {v0, p0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 14
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->E:Lcom/join/mgps/customview/MyTouchFrameLayout;

    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/MyTouchFrameLayout;->setDetector(Landroid/view/GestureDetector;)V

    .line 15
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D:Lcom/join/mgps/customview/MyTouchFrameLayout;

    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/MyTouchFrameLayout;->setDetector(Landroid/view/GestureDetector;)V

    return-void
.end method

.method public static synthetic i0(Lcom/join/mgps/activity/ModGameIndexActivity;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->m1(Ljava/lang/Integer;)V

    return-void
.end method

.method private synthetic i1(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 7

    const/4 p1, 0x1

    .line 1
    invoke-direct {p0, p1, p3}, Lcom/join/mgps/activity/ModGameIndexActivity;->w1(II)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->r1()V

    .line 3
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->listClickIconStatus:Lcom/papa/sim/statistic/Event;

    iget v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p1:I

    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->d1()Ljava/lang/String;

    move-result-object v3

    iget v5, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    const/4 v4, 0x2

    invoke-virtual/range {v0 .. v5}, Lcom/papa/sim/statistic/p;->P1(Lcom/papa/sim/statistic/Event;ILjava/lang/String;II)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->gameClickIconModelClick:Lcom/papa/sim/statistic/Event;

    iget v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p1:I

    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Y:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->d1()Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v5, p3, 0x1

    iget v6, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    invoke-virtual/range {v0 .. v6}, Lcom/papa/sim/statistic/p;->z1(Lcom/papa/sim/statistic/Event;ILjava/lang/String;Ljava/lang/String;II)V

    .line 5
    invoke-direct {p0, p3}, Lcom/join/mgps/activity/ModGameIndexActivity;->s1(I)V

    return-void
.end method

.method private isModMainGame(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/ModInfoBean;

    invoke-virtual {v0, v1, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ModInfoBean;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public static synthetic j0(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/activity/ModGameIndexActivity;->k1(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method private synthetic j1(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 7

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Y:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    if-eqz p1, :cond_0

    .line 2
    iget-object p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->gameClickBigPicGoDetail:Lcom/papa/sim/statistic/Event;

    iget v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p1:I

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->d1()Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v5, p3, 0x1

    iget v6, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    invoke-virtual/range {v0 .. v6}, Lcom/papa/sim/statistic/p;->z1(Lcom/papa/sim/statistic/Event;ILjava/lang/String;Ljava/lang/String;II)V

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p2

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object p3

    const-string v0, "148"

    .line 5
    invoke-virtual {p3, v0}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p2, p3}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    iget-object p3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->R:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {p1, p3}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    .line 8
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    invoke-virtual {p1, p0, p2}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    :cond_0
    return-void
.end method

.method public static synthetic k0(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/activity/ModGameIndexActivity;->i1(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method private synthetic k1(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 7

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Y:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p2

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRef_crc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p2

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p2

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p2

    :goto_0
    if-eqz p2, :cond_7

    const/16 v0, 0x65

    .line 5
    invoke-virtual {p2, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from(I)V

    const/16 v0, 0x94

    .line 6
    invoke-virtual {p2, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    .line 7
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eqz v0, :cond_6

    const/16 v1, 0xb

    if-eq v0, v1, :cond_5

    const/16 v1, 0xd

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    const/4 v1, 0x7

    if-eq v0, v1, :cond_6

    const/16 v1, 0x2a

    if-eq v0, v1, :cond_1

    const/16 p2, 0x2b

    if-eq v0, p2, :cond_6

    goto :goto_1

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    invoke-static {p1, p2}, Lcom/join/mgps/Util/UtilsMy;->T3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    .line 9
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    invoke-static {p2, p1}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_1

    .line 10
    :cond_3
    invoke-static {p2}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    sget-object p3, Lcom/papa/sim/statistic/Event;->downloadStop:Lcom/papa/sim/statistic/Event;

    invoke-static {p1, p2, p3}, Lcom/join/android/app/common/servcie/r;->b(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/papa/sim/statistic/Event;)V

    goto :goto_1

    .line 12
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    invoke-static {p1, p2}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    .line 13
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    invoke-static {p2, p1}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_1

    .line 14
    :cond_6
    iget-object p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    invoke-static {p2, p1}, Lcom/join/mgps/Util/UtilsMy;->Y0(Landroid/content/Context;Lcom/join/mgps/dto/CollectionBeanSub;)V

    .line 15
    iget-object p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->gameClickBigModelGet:Lcom/papa/sim/statistic/Event;

    iget v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p1:I

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->d1()Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v5, p3, 0x1

    iget v6, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    invoke-virtual/range {v0 .. v6}, Lcom/papa/sim/statistic/p;->z1(Lcom/papa/sim/statistic/Event;ILjava/lang/String;Ljava/lang/String;II)V

    goto :goto_1

    .line 16
    :cond_7
    iget-object p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    invoke-static {p2, p1}, Lcom/join/mgps/Util/UtilsMy;->Y0(Landroid/content/Context;Lcom/join/mgps/dto/CollectionBeanSub;)V

    .line 17
    iget-object p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->gameClickBigModelGet:Lcom/papa/sim/statistic/Event;

    iget v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p1:I

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->d1()Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v5, p3, 0x1

    iget v6, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    invoke-virtual/range {v0 .. v6}, Lcom/papa/sim/statistic/p;->z1(Lcom/papa/sim/statistic/Event;ILjava/lang/String;Ljava/lang/String;II)V

    :goto_1
    return-void
.end method

.method private synthetic l1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lkotlin/Unit;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getModInfoBean()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getModInfoBean()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModInfoBean;->isIncompatible()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSingleGameModInfoBean()Lcom/join/mgps/dto/SingleGameModInfoBean;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSingleGameModInfoBean()Lcom/join/mgps/dto/SingleGameModInfoBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/SingleGameModInfoBean;->isIncompatible()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    :cond_1
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->E1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-object v1

    .line 4
    :cond_2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->P1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    return-object v1
.end method

.method private synthetic m1(Ljava/lang/Integer;)V
    .locals 2

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/16 v1, 0x30

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->z1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    :goto_0
    return-void
.end method

.method private synthetic n1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/pref/PrefDef_;)Lkotlin/Unit;
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/pref/PrefDef_;->mod_enhance_ad_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object p2

    invoke-virtual {p2}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p0, p0, p1, p2}, Lcom/join/mgps/activity/ModGameIndexActivity;->K1(Landroid/content/Context;ILjava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {p1, p0}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private o1()V
    .locals 5

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "start111 time:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 4
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 5
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    invoke-static {p0, v0}, Lcom/join/android/app/common/utils/APKUtils;->b(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 7
    :cond_0
    new-instance v1, Lcom/join/mgps/activity/v1;

    invoke-direct {v1, p0, v0}, Lcom/join/mgps/activity/v1;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    invoke-static {p0, v1}, Lcom/join/android/app/common/utils/APKUtils;->g(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 8
    :cond_1
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getModInfoBean()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getModInfoBean()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModInfoBean;->isIncompatible()Z

    move-result v1

    if-nez v1, :cond_3

    .line 9
    :cond_2
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSingleGameModInfoBean()Lcom/join/mgps/dto/SingleGameModInfoBean;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSingleGameModInfoBean()Lcom/join/mgps/dto/SingleGameModInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/SingleGameModInfoBean;->isIncompatible()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 10
    :cond_3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ModGameIndexActivity;->E1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void

    .line 11
    :cond_4
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/ModGameIndexActivity;->P1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    :cond_5
    return-void
.end method

.method static synthetic p0(Lcom/join/mgps/activity/ModGameIndexActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-object p0
.end method

.method private p1()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->J:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->J:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 3
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 4
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTipBeans()Ljava/util/ArrayList;

    move-result-object v1

    .line 5
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/TipBean;

    .line 6
    invoke-virtual {v4}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v4

    const-string v6, "23"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    .line 7
    :cond_1
    new-instance v1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->launch_game_switch()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v1

    invoke-virtual {v1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v3, :cond_2

    if-eqz v1, :cond_2

    .line 8
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/join/mgps/activity/ModGameIndexActivity$i;

    invoke-direct {v3, p0, p0, v0}, Lcom/join/mgps/activity/ModGameIndexActivity$i;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const-string v4, "ANDROID_SINGLE"

    invoke-static {p0, v5, v1, v4, v3}, Lcom/join/mgps/Util/UtilsMy;->z0(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lcom/join/mgps/activity/arena/GameRoomActivity$x;)V

    goto :goto_1

    .line 9
    :cond_2
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/join/android/app/common/utils/APKUtils;->a0(Landroid/content/Context;Ljava/lang/String;)Z

    .line 10
    :goto_1
    invoke-static {v0}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v6, 0x1

    goto :goto_2

    .line 11
    :cond_3
    invoke-static {v0}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v2, 0x2

    const/4 v6, 0x2

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    .line 12
    :goto_2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from()I

    move-result v7

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from_type()I

    move-result v8

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {v3 .. v9}, Lcom/papa/sim/statistic/p;->h1(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V

    .line 13
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/join/mgps/Util/UtilsMy;->t4(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    .line 14
    :cond_5
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    const/16 v2, 0xb

    if-ne v1, v2, :cond_6

    .line 15
    invoke-static {v0, p0}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    return-void

    .line 16
    :cond_6
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u8bf7\u8fde\u63a5\u7f51\u7edc\u540e\u91cd\u8bd5!"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic q0(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->y1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic r0(Lcom/join/mgps/activity/ModGameIndexActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p1:I

    return p0
.end method

.method private r1()V
    .locals 12

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->B1:Z

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->C1:I

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 4
    iget-wide v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M1:J

    sub-long v3, v1, v3

    const-wide/16 v5, 0x1f4

    cmp-long v7, v3, v5

    if-gez v7, :cond_0

    return-void

    .line 5
    :cond_0
    iput-wide v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M1:J

    const/4 v1, -0x1

    .line 6
    invoke-direct {p0, v1}, Lcom/join/mgps/activity/ModGameIndexActivity;->s1(I)V

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->E:Lcom/join/mgps/customview/MyTouchFrameLayout;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v2

    const-wide/16 v3, 0xc8

    const/4 v5, 0x0

    const v6, 0x7f071277

    const-string v7, "translationX"

    const/4 v8, 0x1

    const-string v9, "alpha"

    const/4 v10, 0x2

    if-nez v2, :cond_1

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->F:Landroid/view/View;

    const/16 v11, 0x8

    invoke-virtual {v2, v11}, Landroid/view/View;->setVisibility(I)V

    .line 9
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->E:Lcom/join/mgps/customview/MyTouchFrameLayout;

    new-array v11, v10, [F

    aput v5, v11, v0

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    aput v5, v11, v8

    invoke-static {v2, v7, v11}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    .line 10
    iget-object v5, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->E:Lcom/join/mgps/customview/MyTouchFrameLayout;

    new-array v6, v10, [F

    fill-array-data v6, :array_0

    invoke-static {v5, v9, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 11
    iget-object v6, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D:Lcom/join/mgps/customview/MyTouchFrameLayout;

    new-array v7, v10, [F

    fill-array-data v7, :array_1

    invoke-static {v6, v9, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v6

    .line 12
    new-instance v7, Landroid/animation/AnimatorSet;

    invoke-direct {v7}, Landroid/animation/AnimatorSet;-><init>()V

    .line 13
    invoke-virtual {v7, v2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 14
    invoke-virtual {v7, v5}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 15
    invoke-virtual {v7, v6}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 16
    invoke-virtual {v7, v3, v4}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 17
    new-instance v2, Lcom/join/mgps/activity/ModGameIndexActivity$a;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$a;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-virtual {v7, v2}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 18
    invoke-virtual {v7}, Landroid/animation/AnimatorSet;->start()V

    .line 19
    iput-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->v1:Z

    .line 20
    invoke-direct {p0, v10, v1}, Lcom/join/mgps/activity/ModGameIndexActivity;->w1(II)V

    goto :goto_0

    .line 21
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->E:Lcom/join/mgps/customview/MyTouchFrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 22
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->F:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 23
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->E:Lcom/join/mgps/customview/MyTouchFrameLayout;

    new-array v2, v10, [F

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v11, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    aput v6, v2, v0

    aput v5, v2, v8

    invoke-static {v1, v7, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 24
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->E:Lcom/join/mgps/customview/MyTouchFrameLayout;

    new-array v2, v10, [F

    fill-array-data v2, :array_2

    invoke-static {v1, v9, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 25
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D:Lcom/join/mgps/customview/MyTouchFrameLayout;

    new-array v5, v10, [F

    fill-array-data v5, :array_3

    invoke-static {v2, v9, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    .line 26
    new-instance v5, Landroid/animation/AnimatorSet;

    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    .line 27
    invoke-virtual {v5, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 28
    invoke-virtual {v5, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 29
    invoke-virtual {v5, v2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 30
    invoke-virtual {v5, v3, v4}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 31
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$b;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-virtual {v5, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 32
    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->start()V

    .line 33
    iput-boolean v8, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->v1:Z

    .line 34
    :goto_0
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->b1()V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f000000    # 0.5f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x3f4ccccd    # 0.8f
        0x3f800000    # 1.0f
    .end array-data

    :array_3
    .array-data 4
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method static synthetic s0(Lcom/join/mgps/activity/ModGameIndexActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    return p0
.end method

.method private s1(I)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L1:I

    if-gez v0, :cond_0

    if-gez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L1:I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Y:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt v0, p1, :cond_1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 4
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Y:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    if-ne v1, p1, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v2, v3}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->b(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 6
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->X:Lcom/join/mgps/adapter/ModGameRecommendExpandAdapter;

    if-eqz p1, :cond_4

    .line 7
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_4
    :goto_2
    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/activity/ModGameIndexActivity;)Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic u0(Lcom/join/mgps/activity/ModGameIndexActivity;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->A1:J

    return-wide v0
.end method

.method private u1(Lcom/join/mgps/business/CollectionBeanSubBusiness;IZ)V
    .locals 7

    .line 1
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    if-eqz p3, :cond_0

    sget-object p3, Lcom/papa/sim/statistic/Event;->gameClickBigPicGoWYDetail:Lcom/papa/sim/statistic/Event;

    goto :goto_0

    :cond_0
    sget-object p3, Lcom/papa/sim/statistic/Event;->gameClickIconModelWYClick:Lcom/papa/sim/statistic/Event;

    :goto_0
    move-object v1, p3

    iget v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p1:I

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->d1()Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v5, p2, 0x1

    iget v6, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    invoke-virtual/range {v0 .. v6}, Lcom/papa/sim/statistic/p;->z1(Lcom/papa/sim/statistic/Event;ILjava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/activity/ModGameIndexActivity;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->A1:J

    return-wide p1
.end method

.method static synthetic w0()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lcom/join/mgps/activity/ModGameIndexActivity;->W1:Ljava/util/Map;

    return-object v0
.end method

.method private w1(II)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    if-ne p1, v2, :cond_0

    .line 3
    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v3

    .line 4
    :goto_0
    new-instance v4, Lcom/join/mgps/activity/ModGameIndexActivity$c;

    invoke-direct {v4, p0, p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity$c;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;Landroid/content/Context;I)V

    if-gez p2, :cond_1

    move p2, v3

    .line 5
    :cond_1
    invoke-virtual {v4, p2}, Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;->setTargetPosition(I)V

    if-ne p1, v2, :cond_2

    .line 6
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->startSmoothScroll(Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;)V

    goto :goto_1

    .line 7
    :cond_2
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->startSmoothScroll(Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;)V

    :cond_3
    :goto_1
    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/activity/ModGameIndexActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-object p0
.end method

.method private x1()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->V:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->pd_ad_config()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2
    invoke-static {v0}, Lcom/join/mgps/dto/PdAdCfgBean;->convertStr2Bean(Ljava/lang/String;)Lcom/join/mgps/dto/PdAdCfgBean;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/PdAdCfgBean;->canShowSingleStartUp()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/PdAdCfgBean;->updateSingleShowTimes()V

    :cond_1
    return v1

    :cond_2
    return v2
.end method

.method static synthetic y0(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->P1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result p0

    return p0
.end method

.method private y1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/activity/ModGameIndexActivity;->z1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/activity/ModGameIndexActivity;)Lcom/join/mgps/dialog/l1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->G1:Lcom/join/mgps/dialog/l1;

    return-object p0
.end method

.method private z1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 2

    if-eqz p1, :cond_4

    .line 1
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eqz v0, :cond_2

    const/16 v1, 0x1b

    if-eq v0, v1, :cond_2

    const/16 v1, 0x2a

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    const/16 v1, 0xb

    if-eq v0, v1, :cond_2

    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->T:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    .line 3
    iput v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->T:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->T:I

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->T:I

    .line 6
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {v0}, Lcom/join/mgps/dialog/p;->dismiss()V

    .line 8
    :cond_3
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity$l;

    invoke-direct {v0, p0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$l;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModGameDetailBean;->getCloud_archive_local_path()Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/f1;->p(Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/dialog/f1;->r(Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$m;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-virtual {p1, v0}, Lcom/join/mgps/dialog/p;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$n;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-virtual {p1, v0}, Lcom/join/mgps/dialog/f1;->u(Lcom/join/mgps/dialog/f1$a;)V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {p1, p2}, Lcom/join/mgps/dialog/f1;->v(I)V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_4

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {p1}, Lcom/join/mgps/dialog/p;->show()V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    iget p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->T:I

    iget-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    iget-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S1:Z

    invoke-virtual {p1, p2, v0, v1}, Lcom/join/mgps/dialog/f1;->C(IZZ)V

    :cond_4
    return-void
.end method


# virtual methods
.method E1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/dialog/ModPromptDialog;

    invoke-direct {v0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ModPromptDialog;-><init>()V

    .line 2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 3
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "gameName"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 5
    new-instance v1, Lcom/join/mgps/activity/ModGameIndexActivity$d;

    invoke-direct {v1, p0, v0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity$d;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/join/kotlin/ui/cloudarchive/dialog/ModPromptDialog;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/cloudarchive/dialog/ModPromptDialog;->setListener(Lcom/join/kotlin/ui/cloudarchive/dialog/ModPromptCallback;)V

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/kotlin/ui/cloudarchive/dialog/ModPromptDialog;->show(Landroidx/fragment/app/FragmentManager;)V

    return-void
.end method

.method F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 16
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    move-object/from16 v1, p0

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 1
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 2
    :goto_0
    invoke-direct/range {p0 .. p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->isModMainGame(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, "\u91cd\u65b0\u89e3\u538b"

    const-string v5, "\u89e3\u538b\u4e2d"

    const-string v6, "\u5b89\u88c5\u4e2d"

    const-string v7, "\u5f85\u5b89\u88c5"

    const/16 v8, 0xc

    const/16 v9, 0x30

    const/16 v10, 0xb

    const/16 v11, 0x2a

    const/16 v12, 0x9

    const/16 v13, 0xd

    const/16 v14, 0x8

    if-eqz v3, :cond_8

    .line 3
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v3

    if-ne v3, v13, :cond_1

    .line 4
    iget-object v3, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->o:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    const v13, 0x7f100260

    invoke-virtual {v15, v13}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v13

    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    if-eq v2, v12, :cond_7

    if-ne v2, v11, :cond_2

    goto :goto_1

    :cond_2
    if-ne v2, v10, :cond_3

    .line 5
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setVisibility(I)V

    .line 6
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->m:Landroid/widget/ImageView;

    invoke-virtual {v2, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    :cond_3
    if-ne v2, v9, :cond_4

    .line 9
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->m:Landroid/widget/ImageView;

    invoke-virtual {v2, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 11
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    :cond_4
    if-ne v2, v8, :cond_5

    .line 13
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->m:Landroid/widget/ImageView;

    invoke-virtual {v2, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 15
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 16
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    :cond_5
    const/16 v3, 0xd

    if-ne v2, v3, :cond_6

    .line 17
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setVisibility(I)V

    .line 18
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->m:Landroid/widget/ImageView;

    invoke-virtual {v2, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 19
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 20
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 21
    :cond_6
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setVisibility(I)V

    .line 22
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->m:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 23
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_4

    .line 24
    :cond_7
    :goto_1
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 25
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->m:Landroid/widget/ImageView;

    invoke-virtual {v0, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 26
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_4

    .line 27
    :cond_8
    iget-object v3, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->h:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    const v15, 0x7f100257

    invoke-virtual {v13, v15}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v13

    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    iget-object v3, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->r:Landroid/widget/TextView;

    invoke-virtual {v3, v14}, Landroid/widget/TextView;->setVisibility(I)V

    .line 29
    iget-object v3, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->s:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v3, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    const v3, 0x7f080227

    if-eq v2, v12, :cond_f

    if-ne v2, v11, :cond_9

    goto/16 :goto_3

    :cond_9
    if-ne v2, v10, :cond_a

    .line 30
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setVisibility(I)V

    .line 31
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {v2, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 32
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 33
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->q:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    goto/16 :goto_4

    :cond_a
    if-ne v2, v9, :cond_b

    .line 35
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setVisibility(I)V

    .line 36
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {v2, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 37
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 38
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->q:Landroidx/constraintlayout/widget/ConstraintLayout;

    const v2, 0x7f080228

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    goto/16 :goto_4

    :cond_b
    if-ne v2, v8, :cond_c

    .line 40
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setVisibility(I)V

    .line 41
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {v2, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 42
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 43
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->q:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    goto :goto_4

    :cond_c
    const/16 v5, 0xd

    if-ne v2, v5, :cond_d

    .line 45
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setVisibility(I)V

    .line 46
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {v2, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 47
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 48
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->q:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    goto :goto_4

    .line 50
    :cond_d
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setVisibility(I)V

    .line 51
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 52
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz p1, :cond_e

    .line 53
    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    const/4 v4, 0x5

    if-ne v2, v4, :cond_e

    .line 54
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->s:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 55
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 56
    :cond_e
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->s:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 57
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->r:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 58
    :goto_2
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->q:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    goto :goto_4

    .line 59
    :cond_f
    :goto_3
    iget-object v2, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 60
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {v0, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 61
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setVisibility(I)V

    .line 62
    iget-object v0, v1, Lcom/join/mgps/activity/ModGameIndexActivity;->q:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setBackgroundResource(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_4
    return-void
.end method

.method G1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->isModMainGame(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "%"

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-eqz v0, :cond_0

    .line 2
    :try_start_1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->m:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->o:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->s:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f100259

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method H1()V
    .locals 13
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->E:Lcom/join/mgps/customview/MyTouchFrameLayout;

    iget-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Z:Z

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->F:Landroid/view/View;

    iget-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Z:Z

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D:Lcom/join/mgps/customview/MyTouchFrameLayout;

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->G:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0711f7

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v3, v3, v1, v3}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 5
    iget-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Z:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->v1:Z

    .line 7
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->listShowBigPicUPPage:Lcom/papa/sim/statistic/Event;

    iget v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p1:I

    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->d1()Ljava/lang/String;

    move-result-object v4

    const/4 v5, -0x1

    iget v6, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    invoke-virtual/range {v1 .. v6}, Lcom/papa/sim/statistic/p;->P1(Lcom/papa/sim/statistic/Event;ILjava/lang/String;II)V

    goto :goto_1

    .line 8
    :cond_2
    iput-boolean v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->v1:Z

    .line 9
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v7

    sget-object v8, Lcom/papa/sim/statistic/Event;->listShowIconHotList:Lcom/papa/sim/statistic/Event;

    iget v9, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p1:I

    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->d1()Ljava/lang/String;

    move-result-object v10

    const/4 v11, -0x1

    iget v12, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    invoke-virtual/range {v7 .. v12}, Lcom/papa/sim/statistic/p;->P1(Lcom/papa/sim/statistic/Event;ILjava/lang/String;II)V

    .line 10
    :goto_1
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->b1()V

    return-void
.end method

.method J1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V
    .locals 7

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string p2, "\u8bf7\u68c0\u67e5\u7f51\u7edc\uff01"

    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/16 v1, 0x83

    .line 4
    invoke-virtual {p1, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from(I)V

    :cond_1
    const/16 v1, 0x2b

    if-eqz p1, :cond_2

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_2

    const/16 v0, 0x2b

    :cond_2
    const/4 v2, 0x2

    if-eqz p1, :cond_4

    if-eq v0, v2, :cond_3

    const/16 v3, 0xa

    if-ne v0, v3, :cond_4

    .line 6
    :cond_3
    invoke-static {p1}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    :cond_4
    const/16 v3, 0xd

    if-ne v0, v3, :cond_5

    .line 7
    invoke-static {p0, p1}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    :cond_5
    const/16 v4, 0x1b

    if-eq v0, v4, :cond_24

    const/4 v4, 0x3

    if-ne v0, v4, :cond_6

    goto/16 :goto_1

    :cond_6
    if-ne v0, v3, :cond_7

    .line 8
    invoke-static {p0, p1}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void

    :cond_7
    const/4 v3, 0x5

    if-ne v0, v3, :cond_e

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {v0}, Lcom/join/mgps/dialog/p;->dismiss()V

    .line 11
    :cond_8
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v0, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    .line 12
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->isModMainGame(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 13
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, p0, v3}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 14
    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->mod_normal_ad_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, p0, v2, v0}, Lcom/join/mgps/activity/ModGameIndexActivity;->K1(Landroid/content/Context;ILjava/lang/String;)V

    goto/16 :goto_2

    .line 15
    :cond_9
    invoke-static {p1, p0}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_2

    .line 16
    :cond_a
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 17
    sget-object v1, Lcom/join/android/app/common/utils/APKUtils;->a:Lcom/join/android/app/common/utils/APKUtils$Companion;

    invoke-virtual {v1, p0, p1}, Lcom/join/android/app/common/utils/APKUtils$Companion;->e(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    if-eqz v2, :cond_b

    return-void

    .line 18
    :cond_b
    new-instance v2, Lcom/join/mgps/activity/w1;

    invoke-direct {v2, p0, p1, v0}, Lcom/join/mgps/activity/w1;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/pref/PrefDef_;)V

    invoke-virtual {v1, p0, v2}, Lcom/join/android/app/common/utils/APKUtils$Companion;->g(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)Z

    move-result v1

    if-eqz v1, :cond_c

    return-void

    .line 19
    :cond_c
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->mod_enhance_ad_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, p0, v1, v0}, Lcom/join/mgps/activity/ModGameIndexActivity;->K1(Landroid/content/Context;ILjava/lang/String;)V

    goto/16 :goto_2

    .line 21
    :cond_d
    invoke-static {p1, p0}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_2

    :cond_e
    const/16 v2, 0xb

    if-ne v2, v0, :cond_10

    .line 22
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 23
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {v0}, Lcom/join/mgps/dialog/p;->dismiss()V

    .line 24
    :cond_f
    invoke-static {p1, p0}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_2

    :cond_10
    const-string v2, "checkgame"

    if-eq v1, v0, :cond_1b

    const/4 v1, 0x7

    if-eq v1, v0, :cond_1b

    if-nez v0, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v1, 0x30

    if-ne v1, v0, :cond_12

    .line 25
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u5b89\u88c5\u4e2d\uff0c\u8bf7\u7a0d\u540e..."

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_12
    if-eqz p2, :cond_25

    .line 26
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->S0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 27
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v0

    if-eqz v0, :cond_13

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 28
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq_key()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/GamedetialMoreBean;->getAd_pic_qq()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, p0, v1, v5, v6}, Lcom/join/mgps/Util/a0;->b0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    :cond_13
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_17

    .line 30
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->R:Lcom/join/mgps/dto/ExtBean;

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 31
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->R:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ExtBean;->getFrom_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/join/mgps/Util/UtilsMy;->e4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 32
    :cond_14
    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_15

    goto/16 :goto_2

    .line 33
    :cond_15
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v0

    if-ne v0, v3, :cond_16

    .line 34
    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    .line 35
    :cond_16
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 36
    :cond_17
    invoke-static {p1, p2}, Lcom/join/mgps/Util/UtilsMy;->C1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    .line 37
    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_18

    goto/16 :goto_2

    .line 38
    :cond_18
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v0

    if-ne v0, v3, :cond_1a

    .line 39
    invoke-static {p1}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v0

    if-ne v0, v4, :cond_19

    .line 40
    invoke-static {p1, p0}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_2

    .line 41
    :cond_19
    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    .line 42
    :cond_1a
    invoke-static {p1, p0}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_2

    :cond_1b
    :goto_0
    if-eqz p2, :cond_25

    .line 43
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->S0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 44
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 45
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq_key()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/GamedetialMoreBean;->getAd_pic_qq()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, p0, v1, v5, v6}, Lcom/join/mgps/Util/a0;->b0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    :cond_1c
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_20

    .line 47
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->R:Lcom/join/mgps/dto/ExtBean;

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 48
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->R:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ExtBean;->getFrom_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/join/mgps/Util/UtilsMy;->e4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 49
    :cond_1d
    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_1e

    goto :goto_2

    .line 50
    :cond_1e
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v0

    if-ne v0, v3, :cond_1f

    .line 51
    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 52
    :cond_1f
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2

    .line 53
    :cond_20
    invoke-static {p1, p2}, Lcom/join/mgps/Util/UtilsMy;->C1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    .line 54
    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_21

    goto :goto_2

    .line 55
    :cond_21
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v0

    if-ne v0, v3, :cond_23

    .line 56
    invoke-static {p1}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_22

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v0

    if-ne v0, v4, :cond_22

    .line 57
    invoke-static {p1, p0}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_2

    .line 58
    :cond_22
    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 59
    :cond_23
    invoke-static {p1, p0}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_2

    .line 60
    :cond_24
    :goto_1
    invoke-static {p1, p0}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    .line 61
    :cond_25
    :goto_2
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/ModGameIndexActivity;->Q1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    return-void
.end method

.method L1()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f090d0c
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/16 v1, 0x30

    if-ne v0, v1, :cond_1

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u5b89\u88c5\u4e2d\uff0c\u8bf7\u7a0d\u540e..."

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v1, 0x3

    const/16 v2, 0x9

    const/4 v3, 0x2

    if-eqz v0, :cond_2

    .line 7
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    iget-object v4, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 8
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 9
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eq v0, v2, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 10
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/16 v4, 0x2a

    if-eq v0, v4, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 11
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eq v0, v3, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 12
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eq v0, v1, :cond_2

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/ModGameIndexActivity;->J1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    goto/16 :goto_1

    .line 14
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_3

    .line 15
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 16
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eq v0, v3, :cond_3

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 17
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eq v0, v1, :cond_3

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/ModGameIndexActivity;->O1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/ModGameIndexActivity;->y1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    .line 20
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_4

    .line 21
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u89e3\u538b\u4e2d\uff0c\u8bf7\u7a0d\u540e..."

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 22
    :cond_4
    :try_start_0
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v0, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->androidIdNullsKey()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 23
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 24
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Ljava/util/List;

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 25
    sget-object v1, Lcom/MApplication;->H:Ljava/lang/String;

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lcom/MApplication;->H:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 26
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_5

    return-void

    .line 27
    :catch_0
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/ModGameIndexActivity$w;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$w;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    const-string v2, "VIRTUAL_SINGLE"

    invoke-static {p0, v3, v0, v2, v1}, Lcom/join/mgps/Util/UtilsMy;->z0(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lcom/join/mgps/activity/arena/GameRoomActivity$x;)V

    goto :goto_1

    .line 28
    :cond_6
    :goto_0
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->o1()V

    return-void

    .line 29
    :cond_7
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->o1()V

    :goto_1
    return-void
.end method

.method M1()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f090d2e
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_6

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 3
    iput-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    const/4 v1, 0x3

    const/16 v2, 0x9

    const/4 v3, 0x2

    if-eqz v0, :cond_1

    .line 4
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v4, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, p0, v4}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 5
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 6
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 7
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/16 v4, 0x2a

    if-eq v0, v4, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 8
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eq v0, v3, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 9
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eq v0, v1, :cond_1

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/ModGameIndexActivity;->J1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    goto/16 :goto_1

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 12
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eq v0, v3, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 13
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eq v0, v1, :cond_2

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/ModGameIndexActivity;->O1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/ModGameIndexActivity;->y1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_1

    .line 16
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_3

    .line 17
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u89e3\u538b\u4e2d,\u8bf7\u7a0d\u540e!"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 18
    :cond_3
    :try_start_0
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v0, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->androidIdNullsKey()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 19
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 20
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Ljava/util/List;

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 21
    sget-object v1, Lcom/MApplication;->H:Ljava/lang/String;

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Lcom/MApplication;->H:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 22
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_4

    return-void

    :catch_0
    nop

    .line 23
    :cond_4
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v0, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->download_game_switch()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/ModGameIndexActivity$x;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$x;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    const-string v2, "VIRTUAL_SINGLE"

    invoke-static {p0, v3, v0, v2, v1}, Lcom/join/mgps/Util/UtilsMy;->z0(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lcom/join/mgps/activity/arena/GameRoomActivity$x;)V

    goto :goto_1

    .line 25
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/ModGameIndexActivity;->y1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    .line 26
    :cond_6
    :goto_0
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->p1()V

    return-void

    .line 27
    :cond_7
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->p1()V

    :goto_1
    return-void
.end method

.method N1(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.wufun.game.start.std.game"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "modStdDialog"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->M1()V

    :cond_0
    return-void
.end method

.method O1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V
    .locals 8

    const-string v0, ""

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string p2, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v1

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq_key()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/GamedetialMoreBean;->getAd_pic_qq()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, p0, v2, v3, v4}, Lcom/join/mgps/Util/a0;->b0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    :cond_1
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDownloadType()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_3

    if-eq v1, v2, :cond_2

    goto/16 :goto_7

    .line 6
    :cond_2
    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->u4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_7

    .line 7
    :cond_3
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_17

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_6

    .line 8
    :cond_4
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->S0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 9
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->isModMainGame(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-nez v1, :cond_a

    .line 10
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 11
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 12
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v6

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v1

    const-class v7, Lcom/join/mgps/dto/ModInfoBean;

    invoke-virtual {v6, v1, v7}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ModInfoBean;

    if-eqz v1, :cond_5

    .line 13
    iget-object v6, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModInfoBean;->getVer()I

    move-result v1

    iget-object v6, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/ModInfoBean;->getVer()I

    move-result v6

    if-ge v1, v6, :cond_6

    :cond_5
    const/4 v1, 0x1

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    .line 14
    :goto_0
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v6

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/join/mgps/va/overmind/d;->s(Ljava/lang/String;)Lf2/a;

    move-result-object v6

    if-eqz v6, :cond_9

    .line 15
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVer()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_9

    iget v6, v6, Lf2/a;->k:I

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVer()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    if-ge v6, v7, :cond_9

    if-eqz v1, :cond_7

    .line 16
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_upgrade_state()I

    move-result v6

    if-eq v6, v3, :cond_7

    goto :goto_1

    :cond_7
    const/4 v6, 0x1

    goto :goto_2

    :cond_8
    const/4 v1, 0x0

    :cond_9
    :goto_1
    const/4 v6, 0x0

    .line 17
    :goto_2
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    :cond_a
    const/4 v1, 0x0

    const/4 v6, 0x0

    .line 18
    :goto_3
    invoke-static {p1}, Lcom/php25/PDownload/d;->b(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 19
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVer()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer(Ljava/lang/String;)V

    .line 20
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVer_name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer_name(Ljava/lang/String;)V

    .line 21
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_url_remote()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setUrl(Ljava/lang/String;)V

    .line 22
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCfg_ver()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCfg_ver_name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver_name(Ljava/lang/String;)V

    .line 24
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCfg_down_url()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_down_url(Ljava/lang/String;)V

    .line 25
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v7

    if-eqz v7, :cond_b

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v7

    invoke-virtual {v7}, Lcom/join/mgps/dto/PayTagInfo;->getPay_game_amount()I

    move-result v7

    goto :goto_4

    :cond_b
    const/4 v7, 0x0

    :goto_4
    invoke-virtual {p1, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setPay_game_amount(I)V

    .line 26
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v7

    invoke-static {v7}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setMod_info(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setPath(Ljava/lang/String;)V

    .line 28
    invoke-virtual {p1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setGameZipPath(Ljava/lang/String;)V

    if-eqz v6, :cond_c

    if-eqz v1, :cond_c

    .line 29
    invoke-virtual {p1, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setTask_down_type(I)V

    goto :goto_5

    :cond_c
    if-eqz v1, :cond_d

    .line 30
    invoke-virtual {p1, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setTask_down_type(I)V

    goto :goto_5

    :cond_d
    if-eqz v6, :cond_e

    .line 31
    invoke-virtual {p1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setTask_down_type(I)V

    goto :goto_5

    .line 32
    :cond_e
    invoke-virtual {p1, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setTask_down_type(I)V

    .line 33
    :goto_5
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->L0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 35
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->isModMainGame(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 36
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 37
    :cond_f
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x5

    if-lez v0, :cond_13

    .line 38
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->R:Lcom/join/mgps/dto/ExtBean;

    if-eqz v0, :cond_10

    const-string v2, "checkgame"

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 39
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->R:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {p2}, Lcom/join/mgps/dto/ExtBean;->getFrom_id()Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lcom/join/mgps/Util/UtilsMy;->e4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    .line 40
    :cond_10
    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_7

    .line 41
    :cond_11
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v0

    if-ne v0, v1, :cond_12

    .line 42
    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_7

    .line 43
    :cond_12
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_7

    .line 44
    :cond_13
    invoke-static {p1, p2}, Lcom/join/mgps/Util/UtilsMy;->C1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    .line 45
    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_7

    .line 46
    :cond_14
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result p2

    if-ne p2, v1, :cond_16

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result p2

    if-eqz p2, :cond_15

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result p2

    if-ne p2, v2, :cond_16

    .line 47
    :cond_15
    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_7

    .line 48
    :cond_16
    invoke-static {p1, p0}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    :cond_17
    :goto_6
    return-void

    :catch_0
    move-exception p1

    .line 49
    invoke-virtual {p1}, Ljava/lang/NumberFormatException;->printStackTrace()V

    :goto_7
    return-void
.end method

.method Q1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V
    .locals 11
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-eqz p2, :cond_23

    if-nez p1, :cond_0

    goto/16 :goto_6

    .line 1
    :cond_0
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->isModMainGame(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v6

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v2}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void

    .line 4
    :cond_1
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x2b

    if-lez v1, :cond_2

    const/16 v0, 0x2b

    :cond_2
    const/16 v1, 0x9

    if-eq v0, v1, :cond_22

    const/16 v3, 0x2a

    if-ne v0, v3, :cond_3

    goto/16 :goto_5

    :cond_3
    const/16 v3, 0xc

    if-ne v0, v3, :cond_4

    .line 6
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_6

    :cond_4
    const/16 v3, 0xd

    if-ne v0, v3, :cond_5

    .line 7
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_6

    :cond_5
    const/16 v3, 0xb

    if-ne v0, v3, :cond_6

    .line 8
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_6

    :cond_6
    const/4 v3, 0x5

    const/4 v4, 0x1

    if-ne v0, v3, :cond_7

    .line 9
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 10
    invoke-virtual {p0, v4}, Lcom/join/mgps/activity/ModGameIndexActivity;->T1(Z)V

    goto/16 :goto_6

    :cond_7
    const/4 v3, 0x2

    if-ne v0, v3, :cond_9

    .line 11
    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 12
    iget-object p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Landroid/app/Dialog;->isShowing()Z

    move-result p2

    if-eqz p2, :cond_8

    .line 13
    iget-object p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    iget-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    iget-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S1:Z

    invoke-virtual {p2, v3, v0, v1}, Lcom/join/mgps/dialog/f1;->C(IZZ)V

    .line 14
    iget-object p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {p2, p1}, Lcom/join/mgps/dialog/f1;->D(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_6

    .line 15
    :cond_8
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->G1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_6

    :cond_9
    const/4 v5, 0x3

    if-eq v0, v5, :cond_21

    const/4 v5, 0x6

    if-eq v0, v5, :cond_21

    const/16 v7, 0x1b

    if-ne v0, v7, :cond_a

    goto/16 :goto_4

    :cond_a
    const/16 v7, 0xa

    if-ne v0, v7, :cond_b

    .line 16
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 17
    iget-object p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz p2, :cond_23

    .line 18
    iget-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    iget-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S1:Z

    invoke-virtual {p2, v3, v0, v1}, Lcom/join/mgps/dialog/f1;->C(IZZ)V

    .line 19
    iget-object p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {p2, p1}, Lcom/join/mgps/dialog/f1;->D(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_6

    :cond_b
    if-ne v0, v4, :cond_c

    goto/16 :goto_6

    :cond_c
    const-string v7, "\u5df2\u9884\u7ea6"

    const-string v8, "\u9884\u7ea6"

    const/4 v9, 0x0

    const v10, 0x7f100305

    if-ne v0, v2, :cond_14

    .line 20
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 21
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object p1

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_e

    if-eqz v6, :cond_d

    .line 22
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-array v1, v4, [Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PayTagInfo;->getPayGameAmount()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v9

    invoke-virtual {v0, v10, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 23
    :cond_d
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-array v1, v4, [Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PayTagInfo;->getPayGameAmount()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v9

    invoke-virtual {v0, v10, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    :cond_e
    :goto_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBespeak_switch()I

    move-result p1

    if-ne p1, v4, :cond_12

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result p1

    if-ne p1, v3, :cond_12

    .line 25
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_book()I

    move-result p1

    if-ne p1, v4, :cond_10

    if-eqz v6, :cond_f

    .line 26
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 27
    :cond_f
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    :goto_1
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object p1

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v4

    .line 29
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v2

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSize()Ljava/lang/String;

    move-result-object v3

    .line 30
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    .line 31
    invoke-virtual/range {v0 .. v6}, Lcom/join/mgps/activity/ModGameIndexActivity;->v1(Landroid/widget/TextView;ILjava/lang/String;ILjava/lang/String;Z)V

    goto/16 :goto_6

    :cond_10
    if-eqz v6, :cond_11

    .line 32
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    .line 33
    :cond_11
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    .line 34
    :cond_12
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object p1

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v4

    if-eqz v6, :cond_13

    .line 35
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v2

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSize()Ljava/lang/String;

    move-result-object v3

    .line 36
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    .line 37
    invoke-virtual/range {v0 .. v6}, Lcom/join/mgps/activity/ModGameIndexActivity;->v1(Landroid/widget/TextView;ILjava/lang/String;ILjava/lang/String;Z)V

    goto/16 :goto_6

    .line 38
    :cond_13
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v2

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSize()Ljava/lang/String;

    move-result-object v3

    .line 39
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    .line 40
    invoke-virtual/range {v0 .. v6}, Lcom/join/mgps/activity/ModGameIndexActivity;->v1(Landroid/widget/TextView;ILjava/lang/String;ILjava/lang/String;Z)V

    goto/16 :goto_6

    :cond_14
    const/16 v2, 0x30

    if-ne v0, v2, :cond_15

    .line 41
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 42
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->i:Landroid/widget/TextView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_6

    :cond_15
    if-ne v0, v1, :cond_16

    goto/16 :goto_6

    .line 43
    :cond_16
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 44
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object p1

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_18

    if-eqz v6, :cond_17

    .line 45
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-array v1, v4, [Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PayTagInfo;->getPayGameAmount()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v9

    invoke-virtual {v0, v10, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 46
    :cond_17
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-array v1, v4, [Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PayTagInfo;->getPayGameAmount()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v9

    invoke-virtual {v0, v10, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_18
    const p1, 0x7f1000f6

    if-eqz v6, :cond_19

    .line 47
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 48
    :cond_19
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    :goto_2
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBespeak_switch()I

    move-result p1

    if-ne p1, v4, :cond_1f

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result p1

    if-eq p1, v3, :cond_1a

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result p1

    if-ne p1, v5, :cond_1f

    .line 50
    :cond_1a
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_book()I

    move-result p1

    if-ne p1, v4, :cond_1d

    if-eqz v6, :cond_1b

    .line 51
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 52
    :cond_1b
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    :goto_3
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object p1

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v4

    if-eqz v6, :cond_1c

    .line 54
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->j:Landroid/widget/TextView;

    const/4 v2, 0x2

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSize()Ljava/lang/String;

    move-result-object v3

    .line 55
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    .line 56
    invoke-virtual/range {v0 .. v6}, Lcom/join/mgps/activity/ModGameIndexActivity;->v1(Landroid/widget/TextView;ILjava/lang/String;ILjava/lang/String;Z)V

    goto/16 :goto_6

    .line 57
    :cond_1c
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->h:Landroid/widget/TextView;

    const/4 v2, 0x2

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSize()Ljava/lang/String;

    move-result-object v3

    .line 58
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    .line 59
    invoke-virtual/range {v0 .. v6}, Lcom/join/mgps/activity/ModGameIndexActivity;->v1(Landroid/widget/TextView;ILjava/lang/String;ILjava/lang/String;Z)V

    goto :goto_6

    :cond_1d
    if-eqz v6, :cond_1e

    .line 60
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 61
    :cond_1e
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 62
    :cond_1f
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object p1

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v4

    if-eqz v6, :cond_20

    .line 63
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v2

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSize()Ljava/lang/String;

    move-result-object v3

    .line 64
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    .line 65
    invoke-virtual/range {v0 .. v6}, Lcom/join/mgps/activity/ModGameIndexActivity;->v1(Landroid/widget/TextView;ILjava/lang/String;ILjava/lang/String;Z)V

    goto :goto_6

    .line 66
    :cond_20
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v2

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSize()Ljava/lang/String;

    move-result-object v3

    .line 67
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    .line 68
    invoke-virtual/range {v0 .. v6}, Lcom/join/mgps/activity/ModGameIndexActivity;->v1(Landroid/widget/TextView;ILjava/lang/String;ILjava/lang/String;Z)V

    goto :goto_6

    .line 69
    :cond_21
    :goto_4
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 70
    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 71
    iget-object p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz p2, :cond_23

    .line 72
    iget-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    iget-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S1:Z

    invoke-virtual {p2, v3, v0, v1}, Lcom/join/mgps/dialog/f1;->C(IZZ)V

    .line 73
    iget-object p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {p2, p1}, Lcom/join/mgps/dialog/f1;->D(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_6

    .line 74
    :cond_22
    :goto_5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    :cond_23
    :goto_6
    return-void
.end method

.method S0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->R:Lcom/join/mgps/dto/ExtBean;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->R:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v0

    const-string v1, "112"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    new-instance v0, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    const-string v2, "101"

    .line 4
    invoke-virtual {v0, v2}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->setPosition(Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->R:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ExtBean;->getLocation()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->setLocation(Ljava/lang/String;)V

    .line 7
    invoke-static {v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-virtual {p1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method S1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I1:Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;

    invoke-virtual {v0, p0}, Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;->loadLocalArchiveDatas(Landroid/content/Context;)V

    return-void
.end method

.method T0()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->H1:Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathDataV2;

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "backup"

    invoke-virtual {p0, v2}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    array-length v1, v1

    if-lez v1, :cond_2

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->H1:Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathDataV2;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathDataV2;->getMainLocalPath()Ljava/lang/String;

    move-result-object v1

    .line 5
    sget-object v2, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    invoke-virtual {v2}, Lcom/join/mgps/va/overmind/f;->b0()Ljava/lang/String;

    move-result-object v2

    const-string v3, "/data/data"

    .line 6
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "/data/user/0"

    .line 7
    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "/sdcard"

    const-string v4, ""

    .line 8
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    :cond_1
    const-string v3, "/"

    .line 9
    invoke-virtual {v1, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    .line 10
    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    .line 11
    invoke-virtual {v1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 12
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/join/mgps/Util/h0;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/h0;->h(Ljava/lang/String;Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method T1(Z)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x3e8L
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->R:Lcom/join/mgps/dto/ExtBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v0

    const-string v1, "checkgame"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/m1;->c()Lcom/join/mgps/Util/m1;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->R:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ExtBean;->getFrom_id()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/join/mgps/activity/ModGameIndexActivity$o;

    invoke-direct {v2, p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity$o;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;Z)V

    invoke-virtual {v0, p0, v1, v2}, Lcom/join/mgps/Util/m1;->b(Landroid/content/Context;Ljava/lang/String;Lcom/join/mgps/Util/m1$b;)V

    :cond_0
    return-void
.end method

.method V1(Lcom/join/mgps/dto/ModGameDetailBean;)V
    .locals 11
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    if-eqz p1, :cond_2a

    const/16 v0, 0x8

    const/4 v1, 0x0

    .line 2
    :try_start_0
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->w:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->x:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->v:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 5
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 6
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModGameDetailBean;->getGold_finger()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I1:Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;

    iget-object v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModGameDetailBean;->getGold_finger()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;->setGoldFingerBean(Ljava/util/List;)V

    .line 8
    :cond_0
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->I1(Lcom/join/mgps/dto/ModGameDetailBean;)V

    .line 9
    invoke-virtual {p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getCloud_archive_local_path()Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    move-result-object v2

    const-string v3, ""

    if-eqz v2, :cond_1

    const-string v2, "1"

    move-object v10, v2

    goto :goto_1

    :cond_1
    move-object v10, v3

    .line 10
    :goto_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getMain_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getMod_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    .line 12
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v4

    sget-object v5, Lcom/papa/sim/statistic/Event;->indexGameStart:Lcom/papa/sim/statistic/Event;

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v6

    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_id()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->K:Ljava/lang/String;

    const/4 v9, 0x1

    invoke-virtual/range {v4 .. v10}, Lcom/papa/sim/statistic/p;->a1(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 13
    invoke-virtual {p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getAd_info()Lcom/join/mgps/dto/RecomDatabean;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 14
    invoke-virtual {p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getAd_info()Lcom/join/mgps/dto/RecomDatabean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 15
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->l:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getAd_info()Lcom/join/mgps/dto/RecomDatabean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 16
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz p1, :cond_4

    .line 17
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_screen_shot()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_screen_shot()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_3

    .line 18
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_screen_shot()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/screenshot/ScreenshotGamedetialBean;

    if-eqz p1, :cond_4

    .line 19
    invoke-virtual {p1}, Lcom/join/mgps/activity/screenshot/ScreenshotGamedetialBean;->getPic()Ljava/lang/String;

    move-result-object p1

    .line 20
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 21
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v2, p1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    goto :goto_2

    .line 22
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPic_info()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPic_info()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_4

    .line 23
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPic_info()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/DetialShowImageBean;

    if-eqz p1, :cond_4

    .line 24
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetialShowImageBean;->getRemote()Lcom/join/mgps/dto/DetialShowImageSingBean;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 25
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetialShowImageSingBean;->getPath()Ljava/lang/String;

    move-result-object p1

    .line 26
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 27
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v2, p1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 28
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-nez p1, :cond_6

    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz p1, :cond_6

    .line 29
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_screen_shot()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_screen_shot()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_5

    .line 30
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_screen_shot()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/screenshot/ScreenshotGamedetialBean;

    if-eqz p1, :cond_6

    .line 31
    invoke-virtual {p1}, Lcom/join/mgps/activity/screenshot/ScreenshotGamedetialBean;->getPic()Ljava/lang/String;

    move-result-object p1

    .line 32
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 33
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v2, p1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    goto :goto_3

    .line 34
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPic_info()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPic_info()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_6

    .line 35
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPic_info()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/DetialShowImageBean;

    if-eqz p1, :cond_6

    .line 36
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetialShowImageBean;->getRemote()Lcom/join/mgps/dto/DetialShowImageSingBean;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 37
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetialShowImageSingBean;->getPath()Ljava/lang/String;

    move-result-object p1

    .line 38
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 39
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v2, p1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 40
    :cond_6
    :goto_3
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz p1, :cond_7

    .line 41
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 42
    :cond_7
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz p1, :cond_8

    .line 43
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    :cond_8
    :goto_4
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getGeneral_cfg()Lcom/join/mgps/dto/GeneralCfgBean;

    move-result-object p1

    if-eqz p1, :cond_a

    .line 45
    invoke-virtual {p1}, Lcom/join/mgps/dto/GeneralCfgBean;->getMemberUrl()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Q:Ljava/lang/String;

    .line 46
    invoke-virtual {p1}, Lcom/join/mgps/dto/GeneralCfgBean;->getStrongMode()Lcom/join/mgps/dto/GeneralCfgBean$StrongModeBean;

    move-result-object v2

    if-eqz v2, :cond_9

    .line 47
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GeneralCfgBean;->getStrongMode()Lcom/join/mgps/dto/GeneralCfgBean$StrongModeBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GeneralCfgBean$StrongModeBean;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    :cond_9
    invoke-virtual {p1}, Lcom/join/mgps/dto/GeneralCfgBean;->getNormalMode()Lcom/join/mgps/dto/GeneralCfgBean$NormalModeBean;

    move-result-object v2

    if-eqz v2, :cond_a

    .line 49
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GeneralCfgBean;->getNormalMode()Lcom/join/mgps/dto/GeneralCfgBean$NormalModeBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/GeneralCfgBean$NormalModeBean;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    :cond_a
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 51
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 52
    :cond_b
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez p1, :cond_1d

    .line 53
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 54
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    const/4 v2, 0x1

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getPd_info()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object p1

    if-eqz p1, :cond_c

    .line 55
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0, p1, v2, v2}, Lcom/join/mgps/activity/ModGameIndexActivity;->C1(Lcom/github/snowdream/android/app/downloader/DownloadTask;II)V

    goto :goto_5

    .line 56
    :cond_c
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->y1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 57
    :goto_5
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    const-string v4, ","

    if-eqz p1, :cond_18

    .line 58
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object p1

    iget-object v5, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v5

    const-class v6, Lcom/join/mgps/dto/ModInfoBean;

    invoke-virtual {p1, v5, v6}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ModInfoBean;

    if-eqz p1, :cond_18

    .line 59
    iget-object v5, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_18

    .line 60
    iget-object v5, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ModInfoBean;->getDown_url()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setResource_url_remote(Ljava/lang/String;)V

    .line 61
    iget-object v5, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    sget-object v6, Lcom/join/mgps/enums/Dtype;->MOD:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFileType(Ljava/lang/String;)V

    .line 62
    iget-object v5, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 63
    iget-object v5, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTipBeans()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/TipBean;

    .line 64
    invoke-virtual {v6}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v9, Lcom/join/mgps/enums/ConstantIntEnum;->DATA:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v9}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_e

    .line 65
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    sget-object v8, Lcom/join/mgps/enums/Dtype;->androiddata:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    goto :goto_6

    .line 66
    :cond_e
    invoke-virtual {v6}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v9, Lcom/join/mgps/enums/ConstantIntEnum;->OBB:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v9}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_f

    .line 67
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    sget-object v8, Lcom/join/mgps/enums/Dtype;->androidobb:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 68
    :cond_f
    :goto_6
    invoke-virtual {v6}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lcom/join/mgps/enums/ConstantIntEnum;->OBBDATA:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v8}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 69
    iget-object v5, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    sget-object v6, Lcom/join/mgps/enums/Dtype;->androidobbdata:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 70
    :cond_10
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v5

    iget-object v6, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, p0, v6}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_18

    iget-object v5, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTask_down_type()I

    move-result v5

    if-nez v5, :cond_18

    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v5

    iget-object v6, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_18

    .line 71
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v5

    iget-object v6, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, p0, v6}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v5

    .line 72
    invoke-virtual {p1}, Lcom/join/mgps/dto/ModInfoBean;->getCompatible_version()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_12

    .line 73
    invoke-virtual {p1}, Lcom/join/mgps/dto/ModInfoBean;->getCompatible_version()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_12

    .line 74
    invoke-virtual {p1}, Lcom/join/mgps/dto/ModInfoBean;->getCompatible_version()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 75
    array-length v6, p1

    const/4 v7, 0x0

    :goto_7
    if-ge v7, v6, :cond_12

    aget-object v8, p1, v7

    .line 76
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lcom/join/android/app/common/utils/APKUtils$a;->e()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "_"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_11

    .line 77
    iput-boolean v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S1:Z

    goto :goto_8

    :cond_11
    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    .line 78
    :cond_12
    :goto_8
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTipBeans()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v5, 0x0

    :cond_13
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/TipBean;

    .line 79
    invoke-virtual {v6}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v9, Lcom/join/mgps/enums/ConstantIntEnum;->DATA:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v9}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_14

    .line 80
    invoke-virtual {v6}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v9, Lcom/join/mgps/enums/ConstantIntEnum;->OBB:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v9}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_14

    invoke-virtual {v6}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lcom/join/mgps/enums/ConstantIntEnum;->OBBDATA:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v8}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    :cond_14
    const/4 v5, 0x1

    goto :goto_9

    .line 81
    :cond_15
    iget-boolean p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S1:Z

    if-eqz p1, :cond_16

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1e

    if-lt v3, v6, :cond_17

    :cond_16
    if-eqz p1, :cond_18

    if-nez v5, :cond_18

    .line 82
    :cond_17
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v3, 0x3

    invoke-virtual {p1, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setTask_down_type(I)V

    .line 83
    :cond_18
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setDownloadType(I)V

    .line 84
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getScreenshot_pic()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setScreenshot_pic(Ljava/lang/String;)V

    .line 85
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->V:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->hasShowModInstallGames()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 86
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1a

    iget-object v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 87
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_19

    goto :goto_a

    :cond_19
    const/4 v3, 0x0

    goto :goto_b

    :cond_1a
    :goto_a
    const/4 v3, 0x1

    :goto_b
    if-eqz v3, :cond_1c

    .line 88
    iget-object v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    if-eqz v3, :cond_1b

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModGameDetailBean;->getPd_info()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v3

    if-eqz v3, :cond_1b

    .line 89
    iget-object v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0, v3, v2, v1}, Lcom/join/mgps/activity/ModGameIndexActivity;->C1(Lcom/github/snowdream/android/app/downloader/DownloadTask;II)V

    goto :goto_c

    .line 90
    :cond_1b
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0, v2, v1}, Lcom/join/mgps/activity/ModGameIndexActivity;->z1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 91
    :goto_c
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 92
    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->V:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->hasShowModInstallGames()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v2, p1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 93
    :cond_1c
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->y1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_e

    .line 94
    :cond_1d
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPlugin_num()Ljava/lang/String;

    move-result-object p1

    const-string v2, "46"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_21

    .line 95
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    sget-object v2, Lcom/join/mgps/enums/Dtype;->MOD:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFileType(Ljava/lang/String;)V

    .line 96
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 97
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTipBeans()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_21

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/TipBean;

    .line 98
    invoke-virtual {v2}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/join/mgps/enums/ConstantIntEnum;->DATA:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v6}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1f

    .line 99
    iget-object v4, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    sget-object v5, Lcom/join/mgps/enums/Dtype;->androiddata:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    goto :goto_d

    .line 100
    :cond_1f
    invoke-virtual {v2}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/join/mgps/enums/ConstantIntEnum;->OBB:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v6}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_20

    .line 101
    iget-object v4, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    sget-object v5, Lcom/join/mgps/enums/Dtype;->androidobb:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 102
    :cond_20
    :goto_d
    invoke-virtual {v2}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/join/mgps/enums/ConstantIntEnum;->OBBDATA:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v5}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1e

    .line 103
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    sget-object v2, Lcom/join/mgps/enums/Dtype;->androidobbdata:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 104
    :cond_21
    :goto_e
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->U0()V

    .line 105
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p1

    const/16 v2, 0x9

    if-eq p1, v2, :cond_23

    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p1

    const/16 v2, 0x2a

    if-ne p1, v2, :cond_22

    goto :goto_f

    .line 106
    :cond_22
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->i:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_10

    .line 107
    :cond_23
    :goto_f
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->i:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 108
    :goto_10
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/activity/ModGameIndexActivity;->Q1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    .line 109
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz p1, :cond_24

    .line 110
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_id()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->J:Ljava/lang/String;

    .line 111
    :cond_24
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->J:Ljava/lang/String;

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_25

    .line 112
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->J:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 113
    :cond_25
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez p1, :cond_26

    .line 114
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz p1, :cond_27

    .line 115
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 116
    sget-object v0, Lcom/join/mgps/enums/Dtype;->android:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFileType(Ljava/lang/String;)V

    .line 117
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    goto :goto_11

    .line 118
    :cond_26
    invoke-virtual {p1, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setDownloadType(I)V

    .line 119
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getScreenshot_pic()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setScreenshot_pic(Ljava/lang/String;)V

    .line 120
    :cond_27
    :goto_11
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->W0()V

    .line 121
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz p1, :cond_28

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_28

    .line 122
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->Q1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    .line 123
    :cond_28
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->K:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->N1(Ljava/lang/String;)V

    .line 124
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    if-eqz p1, :cond_29

    invoke-virtual {p1}, Lcom/join/mgps/dto/ModGameDetailBean;->getPd_info()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object p1

    if-eqz p1, :cond_29

    .line 125
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0, v1}, Lcom/join/mgps/activity/ModGameIndexActivity;->C1(Lcom/github/snowdream/android/app/downloader/DownloadTask;II)V

    goto :goto_12

    .line 126
    :cond_29
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->V0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 127
    :goto_12
    new-instance p1, Lcom/join/mgps/activity/ModGameIndexActivity$20;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$20;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->c1(Ljava/util/List;)V

    .line 128
    :cond_2a
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->R1()V

    return-void
.end method

.method X0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVer()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 2
    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const-string v2, "android.permission.READ_EXTERNAL_STORAGE"

    if-nez v1, :cond_3

    .line 3
    invoke-static {p0, v2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_1

    .line 4
    :cond_1
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 5
    sget-object v0, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/f;->b0()Ljava/lang/String;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModGameDetailBean;->getCloud_archive_local_path()Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;->getMainArchiveLocalPath()Ljava/lang/String;

    move-result-object v1

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModGameDetailBean;->getMod_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/ModGameDetailBean;->getMain_game_info()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 9
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    array-length v2, v2

    if-lez v2, :cond_2

    .line 11
    :try_start_0
    invoke-static {v1, v0}, Lcom/join/mgps/Util/g0;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    :goto_0
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->Z0(ZLcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->Z0(ZLcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 15
    :cond_3
    :goto_1
    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x7

    invoke-static {p0, p1, v0}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    :cond_4
    :goto_2
    return-void

    .line 16
    :cond_5
    :goto_3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N1:Landroid/app/Dialog;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N1:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 18
    :cond_6
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->A1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method Y0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/join/mgps/enums/Dtype;->MOD:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/Util/v;->q:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    new-instance v1, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lcom/join/mgps/va/overmind/d;->q(Z)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "data"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_0

    .line 6
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/h0;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 8
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->a1()V

    return-void

    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->a1()V

    .line 10
    throw p1
.end method

.method Z0(ZLcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N1:Landroid/app/Dialog;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/app/Dialog;->isShowing()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2
    iget-object p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N1:Landroid/app/Dialog;

    invoke-virtual {p2}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    if-eqz p1, :cond_2

    .line 3
    iget-boolean p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->E1:Z

    if-nez p1, :cond_1

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->F1:Z

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->D1()V

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->F1:Z

    :cond_2
    :goto_0
    return-void
.end method

.method a1()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->T1:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->T1:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method afterViews()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iput-object p0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    .line 2
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    new-instance v1, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;

    invoke-direct {v1}, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;-><init>()V

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class v1, Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I1:Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;

    .line 3
    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;->getEvent()Lcom/join/kotlin/domain/common/SingleLiveEvent;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/ModGameIndexActivity$k;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$k;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    invoke-virtual {v0, p0, v1}, Lcom/join/kotlin/domain/common/SingleLiveEvent;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->h1()V

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->getDetialData()V

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->e1()V

    return-void
.end method

.method c1(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lcom/wufan/user/service/protobuf/n0;->b5()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    .line 4
    :cond_0
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 5
    new-instance v2, Lcom/join/mgps/dto/ArchievePathMultiArgs;

    invoke-direct {v2}, Lcom/join/mgps/dto/ArchievePathMultiArgs;-><init>()V

    .line 6
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/dto/ArchievePathMultiArgs;->setUid(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/ArchievePathMultiArgs;->setDownloadedGameIdList(Ljava/util/List;)V

    .line 8
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 9
    invoke-virtual {v1, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 10
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object p1

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/rpc/impl/i;->r(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ArchievePathMultiBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ArchievePathMultiBean;->getCloud_archive_path_list()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ArchievePathMultiBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ArchievePathMultiBean;->getCloud_archive_path_list()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 13
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ArchievePathMultiBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ArchievePathMultiBean;->getCloud_archive_path_list()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathDataV2;

    iput-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->H1:Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathDataV2;

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->T0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method public d1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_id()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_id()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method e1()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lcom/wufan/user/service/protobuf/n0;->f5()Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object v0

    check-cast v0, Lcom/wufan/user/service/protobuf/n0;

    .line 4
    :cond_0
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 5
    new-instance v2, Lcom/join/mgps/dto/RequestModGameRecommendAdArgs;

    invoke-direct {v2}, Lcom/join/mgps/dto/RequestModGameRecommendAdArgs;-><init>()V

    .line 6
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/dto/RequestModGameRecommendAdArgs;->setUid(I)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/join/mgps/dto/RequestModGameRecommendAdArgs;->setGameId(J)V

    .line 8
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->A()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/dto/RequestModGameRecommendAdArgs;->setDownloadedGameIdList(Ljava/util/List;)V

    .line 9
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 10
    invoke-virtual {v1, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 11
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v0

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-interface {v0, v1}, Le2/i;->s1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object v0

    invoke-interface {v0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ResponseModel;

    if-eqz v0, :cond_4

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_4

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ModGameRecommendAdBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModGameRecommendAdBean;->getRec_game_list()Ljava/util/List;

    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    .line 15
    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/DownloadPointBase;->setFromRecomDown(Z)V

    const/16 v4, 0x65

    .line 16
    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    const/16 v4, 0x94

    .line 17
    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    goto :goto_0

    .line 18
    :cond_1
    check-cast v1, Ljava/util/ArrayList;

    iput-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Y:Ljava/util/ArrayList;

    .line 19
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ModGameRecommendAdBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModGameRecommendAdBean;->isPopup()Z

    move-result v1

    iput-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Z:Z

    const-string v1, "A"

    .line 20
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/ModGameRecommendAdBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModGameRecommendAdBean;->getPanel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 21
    iput v4, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    goto :goto_1

    :cond_2
    const-string v1, "B"

    .line 22
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ModGameRecommendAdBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModGameRecommendAdBean;->getPanel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x2

    .line 23
    iput v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    .line 24
    :cond_3
    :goto_1
    iget v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    add-int/2addr v0, v4

    iput v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    .line 25
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->H1()V

    .line 26
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->t1()V

    return-void

    .line 27
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->g1()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 29
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->g1()V

    goto :goto_2

    .line 30
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->g1()V

    :goto_2
    return-void
.end method

.method public f1(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    :goto_0
    if-nez p2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    .line 2
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    :goto_1
    if-nez p1, :cond_2

    const/4 p1, 0x0

    goto :goto_2

    .line 3
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    :goto_2
    if-nez p2, :cond_3

    const/4 p2, 0x0

    goto :goto_3

    .line 4
    :cond_3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    :goto_3
    sub-float v3, v1, v2

    .line 5
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v4

    sub-float/2addr p1, p2

    .line 6
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    .line 7
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onFling: "

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v5, "  "

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    cmpl-float p2, p1, v0

    if-nez p2, :cond_4

    const/high16 p1, 0x42c80000    # 100.0f

    goto :goto_4

    :cond_4
    div-float p1, v4, p1

    .line 8
    :goto_4
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpl-float p1, p1, p2

    if-lez p1, :cond_7

    sub-float/2addr v2, v1

    const/high16 p1, 0x43160000    # 150.0f

    cmpl-float p2, v2, p1

    if-lez p2, :cond_5

    .line 9
    iget-boolean p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->v1:Z

    if-eqz p1, :cond_6

    .line 10
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->r1()V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->listClickBigPicStaus:Lcom/papa/sim/statistic/Event;

    iget v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p1:I

    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->d1()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    iget v5, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    invoke-virtual/range {v0 .. v5}, Lcom/papa/sim/statistic/p;->P1(Lcom/papa/sim/statistic/Event;ILjava/lang/String;II)V

    goto :goto_5

    :cond_5
    cmpl-float p1, v3, p1

    if-lez p1, :cond_6

    .line 12
    iget-boolean p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->v1:Z

    if-nez p1, :cond_6

    .line 13
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->r1()V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->listClickIconStatus:Lcom/papa/sim/statistic/Event;

    iget v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p1:I

    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->d1()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    iget v5, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    invoke-virtual/range {v0 .. v5}, Lcom/papa/sim/statistic/p;->P1(Lcom/papa/sim/statistic/Event;ILjava/lang/String;II)V

    :cond_6
    :goto_5
    const/4 p1, 0x1

    return p1

    :cond_7
    const/4 p1, 0x0

    return p1
.end method

.method g1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->E:Lcom/join/mgps/customview/MyTouchFrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D:Lcom/join/mgps/customview/MyTouchFrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->G:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    return-void
.end method

.method getDetialData()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lcom/wufan/user/service/protobuf/n0;->b5()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    .line 4
    :cond_0
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 5
    new-instance v2, Lcom/join/mgps/dto/RequestModGameArgs;

    invoke-direct {v2}, Lcom/join/mgps/dto/RequestModGameArgs;-><init>()V

    .line 6
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestModGameArgs;->setUid(I)V

    .line 7
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/dto/RequestModGameArgs;->setUserToken(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/join/mgps/dto/RequestModGameArgs;->setGameId(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 10
    invoke-virtual {v1, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 11
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/join/mgps/rpc/impl/i;->B(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_1

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ModGameIndexActivity;->V1(Lcom/join/mgps/dto/ModGameDetailBean;)V

    return-void

    .line 14
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->showLodingFailed()V

    goto :goto_0

    .line 17
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->showLodingFailed()V

    :goto_0
    return-void
.end method

.method hideNavigationBar()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->setSystemUiVisibility()V

    :cond_0
    return-void
.end method

.method public initPreDownloadFactory()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/github/snowdream/android/app/downloader/b;->e()Lcom/github/snowdream/android/app/downloader/b;

    move-result-object v0

    sput-object v0, Lcom/join/mgps/activity/ModGameIndexActivity;->U1:Lcom/github/snowdream/android/app/downloader/b;

    .line 2
    new-instance v0, Lcom/join/mgps/activity/ModGameIndexActivity$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ModGameIndexActivity$v;-><init>(Lcom/join/mgps/activity/ModGameIndexActivity;)V

    sput-object v0, Lcom/join/mgps/activity/ModGameIndexActivity;->V1:Lcom/github/snowdream/android/app/downloader/b$b;

    .line 3
    sget-object v1, Lcom/join/mgps/activity/ModGameIndexActivity;->U1:Lcom/github/snowdream/android/app/downloader/b;

    invoke-virtual {v1, v0}, Lcom/github/snowdream/android/app/downloader/b;->m(Lcom/github/snowdream/android/app/downloader/b$b;)V

    return-void
.end method

.method l0()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f0901c2
        }
    .end annotation

    return-void
.end method

.method m0()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f09051a
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->r1()V

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->listClickBigPicStaus:Lcom/papa/sim/statistic/Event;

    iget v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p1:I

    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->d1()Ljava/lang/String;

    move-result-object v3

    iget v5, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    const/4 v4, 0x2

    invoke-virtual/range {v0 .. v5}, Lcom/papa/sim/statistic/p;->P1(Lcom/papa/sim/statistic/Event;ILjava/lang/String;II)V

    return-void
.end method

.method n0()V
    .locals 8
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f090217
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, -0x1

    .line 1
    invoke-direct {p0, v0, v1}, Lcom/join/mgps/activity/ModGameIndexActivity;->w1(II)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->r1()V

    .line 3
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    sget-object v3, Lcom/papa/sim/statistic/Event;->listClickIconStatus:Lcom/papa/sim/statistic/Event;

    iget v4, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p1:I

    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->d1()Ljava/lang/String;

    move-result-object v5

    iget v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    const/4 v6, 0x1

    invoke-virtual/range {v2 .. v7}, Lcom/papa/sim/statistic/p;->P1(Lcom/papa/sim/statistic/Event;ILjava/lang/String;II)V

    return-void
.end method

.method o0()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f090218
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->r1()V

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->listClickBigPicStaus:Lcom/papa/sim/statistic/Event;

    iget v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p1:I

    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->d1()Ljava/lang/String;

    move-result-object v3

    iget v5, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->D1:I

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/papa/sim/statistic/p;->P1(Lcom/papa/sim/statistic/Event;ILjava/lang/String;II)V

    return-void
.end method

.method onBack()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f09090f
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onDestroy()V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public onEventMainThread(Lcom/join/mgps/event/n;)V
    .locals 10
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->U1(Lcom/join/mgps/event/n;)V

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result v1

    const/16 v2, 0x8

    const-string v3, "%"

    const/4 v4, 0x2

    if-ne v1, v2, :cond_4

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p1

    if-ne p1, v4, :cond_1

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz p1, :cond_0

    .line 8
    iget-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    iget-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S1:Z

    invoke-virtual {p1, v4, v0, v1}, Lcom/join/mgps/dialog/f1;->C(IZZ)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1, v0}, Lcom/join/mgps/dialog/f1;->D(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz p1, :cond_3

    .line 12
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p1

    if-ne p1, v4, :cond_3

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz p1, :cond_2

    .line 15
    iget-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    iget-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S1:Z

    invoke-virtual {p1, v4, v0, v1}, Lcom/join/mgps/dialog/f1;->C(IZZ)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1, v0}, Lcom/join/mgps/dialog/f1;->D(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 17
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->o:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    return-void

    :cond_4
    const-string v1, "\u89e3\u538b\u5931\u8d25"

    const/4 v5, 0x3

    const/4 v6, 0x5

    if-eqz v0, :cond_12

    .line 18
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v7, :cond_12

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_12

    .line 19
    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 20
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 21
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result v7

    if-eqz v7, :cond_11

    if-eq v7, v2, :cond_e

    const/16 v8, 0x30

    if-eq v7, v8, :cond_8

    if-eq v7, v6, :cond_8

    const/4 v8, 0x6

    if-eq v7, v8, :cond_7

    packed-switch v7, :pswitch_data_0

    goto/16 :goto_1

    .line 22
    :pswitch_0
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Landroid/app/Dialog;->isShowing()Z

    move-result v7

    if-eqz v7, :cond_5

    .line 23
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {v7}, Lcom/join/mgps/dialog/p;->dismiss()V

    .line 24
    :cond_5
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v7

    invoke-virtual {v7, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 25
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, v7}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_1

    .line 26
    :pswitch_1
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz v7, :cond_6

    invoke-virtual {v7}, Landroid/app/Dialog;->isShowing()Z

    move-result v7

    if-eqz v7, :cond_6

    .line 27
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {v7}, Lcom/join/mgps/dialog/p;->dismiss()V

    .line 28
    :cond_6
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, v7}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_1

    .line 29
    :pswitch_2
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz v7, :cond_12

    .line 30
    iget-boolean v8, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    iget-boolean v9, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S1:Z

    invoke-virtual {v7, v5, v8, v9}, Lcom/join/mgps/dialog/f1;->C(IZZ)V

    .line 31
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    iget-object v8, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v7, v8}, Lcom/join/mgps/dialog/f1;->D(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_1

    .line 32
    :cond_7
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz v7, :cond_12

    invoke-virtual {v7}, Landroid/app/Dialog;->isShowing()Z

    move-result v7

    if-eqz v7, :cond_12

    .line 33
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {v7}, Lcom/join/mgps/dialog/p;->dismiss()V

    goto/16 :goto_1

    .line 34
    :cond_8
    :pswitch_3
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz v7, :cond_9

    invoke-virtual {v7}, Landroid/app/Dialog;->isShowing()Z

    move-result v7

    if-eqz v7, :cond_9

    .line 35
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {v7}, Lcom/join/mgps/dialog/p;->dismiss()V

    .line 36
    :cond_9
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->U0()V

    .line 37
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result v7

    if-ne v7, v6, :cond_a

    .line 38
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0, v7}, Lcom/join/mgps/activity/ModGameIndexActivity;->V0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 39
    :cond_a
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, v7}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 40
    invoke-static {v0}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v7

    if-eqz v7, :cond_d

    .line 41
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v7, :cond_d

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v7

    if-ne v7, v6, :cond_d

    .line 42
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->T1:Landroid/app/Dialog;

    if-nez v7, :cond_b

    .line 43
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v7

    invoke-virtual {v7, p0}, Lcom/join/mgps/Util/a0;->x(Landroid/content/Context;)Lcom/join/mgps/dialog/d1;

    move-result-object v7

    const-string v8, "\u62f7\u8d1d\u4e2d\u3002\u3002\u3002"

    invoke-virtual {v7, v8}, Lcom/join/mgps/dialog/d1;->a(Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object v7

    iput-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->T1:Landroid/app/Dialog;

    goto :goto_0

    .line 44
    :cond_b
    invoke-virtual {v7}, Landroid/app/Dialog;->isShowing()Z

    move-result v7

    if-eqz v7, :cond_c

    .line 45
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->T1:Landroid/app/Dialog;

    invoke-virtual {v7}, Landroid/app/Dialog;->dismiss()V

    .line 46
    :cond_c
    :goto_0
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->T1:Landroid/app/Dialog;

    invoke-virtual {v7}, Landroid/app/Dialog;->show()V

    .line 47
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ModGameIndexActivity;->Y0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 48
    :cond_d
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->R1()V

    goto :goto_1

    .line 49
    :cond_e
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz p1, :cond_10

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_10

    .line 50
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz p1, :cond_10

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_10

    .line 51
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 52
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz p1, :cond_f

    .line 53
    iget-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    iget-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S1:Z

    invoke-virtual {p1, v4, v0, v1}, Lcom/join/mgps/dialog/f1;->C(IZZ)V

    .line 54
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1, v0}, Lcom/join/mgps/dialog/f1;->D(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 55
    :cond_f
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_10
    return-void

    .line 56
    :cond_11
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->R1()V

    :cond_12
    :goto_1
    if-eqz v0, :cond_1a

    .line 57
    iget-object v7, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v7, :cond_1a

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1a

    .line 58
    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 59
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 60
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result p1

    if-eq p1, v6, :cond_18

    if-eq p1, v2, :cond_15

    packed-switch p1, :pswitch_data_1

    goto/16 :goto_2

    .line 61
    :pswitch_4
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_13

    .line 62
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {p1}, Lcom/join/mgps/dialog/p;->dismiss()V

    .line 63
    :cond_13
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 64
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    .line 65
    :pswitch_5
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz p1, :cond_14

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_14

    .line 66
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {p1}, Lcom/join/mgps/dialog/p;->dismiss()V

    .line 67
    :cond_14
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    .line 68
    :pswitch_6
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz p1, :cond_1a

    .line 69
    iget-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    iget-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S1:Z

    invoke-virtual {p1, v5, v0, v1}, Lcom/join/mgps/dialog/f1;->C(IZZ)V

    .line 70
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1, v0}, Lcom/join/mgps/dialog/f1;->D(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 71
    :cond_15
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz p1, :cond_17

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_17

    .line 72
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz p1, :cond_17

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_17

    .line 73
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 74
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz p1, :cond_16

    .line 75
    iget-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    iget-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S1:Z

    invoke-virtual {p1, v4, v0, v1}, Lcom/join/mgps/dialog/f1;->C(IZZ)V

    .line 76
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1, v0}, Lcom/join/mgps/dialog/f1;->D(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 77
    :cond_16
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->o:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_17
    return-void

    .line 78
    :cond_18
    :pswitch_7
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz p1, :cond_19

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_19

    .line 79
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {p1}, Lcom/join/mgps/dialog/p;->dismiss()V

    .line 80
    :cond_19
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->W0()V

    .line 81
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->F1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 82
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->R1()V

    :cond_1a
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xa
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method public onLocalArchiveUpdate(Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog$UpdateLocalArchiveEvent;)V
    .locals 0
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I1:Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;

    invoke-virtual {p1, p0}, Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;->loadLocalArchiveDatas(Landroid/content/Context;)V

    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onNewIntent(Landroid/content/Intent;)V

    const-string v0, "gameId"

    .line 2
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    const-string v0, "standGameId"

    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->J:Ljava/lang/String;

    const-string v0, "from"

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->K:Ljava/lang/String;

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->getDetialData()V

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->e1()V

    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onPause()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->E1:Z

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1
    .param p2    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/BaseAppCompatActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    const/4 p2, 0x7

    if-eq p1, p2, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    array-length p1, p3

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_2

    aget v0, p3, p2

    if-eqz v0, :cond_1

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const-string p2, "\u7531\u4e8e\u5b89\u5353\u7cfb\u7edf\u76ee\u5f55\u9650\u5236,\u65e0\u6cd5\u540c\u6b65\u5b58\u6863\u81f3\u589e\u5f3a\u6a21\u5f0f"

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/ModGameIndexActivity;->B1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/lang/String;)V

    return-void

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 4
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz p1, :cond_3

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->X0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    :cond_3
    :goto_1
    return-void
.end method

.method protected onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onResume()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->E1:Z

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    iput v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p1:I

    .line 5
    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->U0()V

    .line 6
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->W0()V

    .line 7
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->R1()V

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->hideNavigationBar()V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->p0:Landroid/app/Activity;

    invoke-static {v1}, Lcom/join/mgps/Util/UtilsMy;->q4(Landroid/content/Context;)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    if-eqz v1, :cond_1

    .line 11
    invoke-virtual {v1}, Lcom/join/mgps/dto/ModGameDetailBean;->getCloud_archive_local_path()Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 12
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->S1()V

    .line 13
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 14
    iget-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_2

    .line 15
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->M:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    if-nez v1, :cond_2

    .line 16
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {v1}, Lcom/join/mgps/dialog/p;->dismiss()V

    .line 17
    :cond_2
    iget-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->U:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_3

    .line 18
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->L:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    if-nez v1, :cond_3

    .line 19
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->S:Lcom/join/mgps/dialog/f1;

    invoke-virtual {v1}, Lcom/join/mgps/dialog/p;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 21
    :cond_3
    :goto_0
    iget-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->F1:Z

    if-eqz v1, :cond_4

    .line 22
    iput-boolean v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->F1:Z

    .line 23
    invoke-direct {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->D1()V

    :cond_4
    return-void
.end method

.method public onStartGame(Lcom/join/mgps/event/s;)V
    .locals 0
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->M1()V

    return-void
.end method

.method public onSystemUiVisibilityChange(I)V
    .locals 0

    if-nez p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->hideNavigationBar()V

    :cond_0
    return-void
.end method

.method q1()V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f091648
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->clickLeftCloudAd:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    const-string v1, "&gameid="

    const-string v2, "?gameid="

    const-string v3, "?"

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModGameDetailBean;->getAd_info()Lcom/join/mgps/dto/RecomDatabean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModGameDetailBean;->getAd_info()Lcom/join/mgps/dto/RecomDatabean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModGameDetailBean;->getAd_info()Lcom/join/mgps/dto/RecomDatabean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->N:Lcom/join/mgps/dto/ModGameDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModGameDetailBean;->getAd_info()Lcom/join/mgps/dto/RecomDatabean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v0

    const/4 v4, 0x0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBeanMain;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type()I

    move-result v4

    const/4 v5, 0x4

    if-ne v4, v5, :cond_1

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 9
    :cond_1
    :goto_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    goto :goto_1

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Q:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 11
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v4, Lcom/papa/sim/statistic/Event;->onclickVipMod:Lcom/papa/sim/statistic/Event;

    new-instance v5, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v5}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v6, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Q:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 13
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Q:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 14
    :cond_3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Q:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    :cond_4
    :goto_1
    return-void
.end method

.method relodingimag()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->showLoding()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->getDetialData()V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/ModGameIndexActivity;->e1()V

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

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->w:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->x:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->v:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method showLodingFailed()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->w:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->x:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->v:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method t1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->H:Landroid/widget/TextView;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->W:Lcom/join/mgps/adapter/ModGameRecomendShrinkAdapter;

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->X:Lcom/join/mgps/adapter/ModGameRecommendExpandAdapter;

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/ModGameRecommendExpandAdapter;->setNewData(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public v1(Landroid/widget/TextView;ILjava/lang/String;ILjava/lang/String;Z)V
    .locals 4

    const/4 p3, 0x1

    .line 1
    :try_start_0
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 2
    invoke-static {p4, p5}, Lcom/join/mgps/Util/UtilsMy;->v0(ILjava/lang/String;)I

    move-result p5

    const/4 v0, 0x0

    if-lez p5, :cond_0

    const/4 p5, 0x1

    goto :goto_0

    :cond_0
    const/4 p5, 0x0

    :goto_0
    const/4 v1, 0x3

    const v2, 0x7f100258

    const v3, 0x7f100257

    if-ne p2, v1, :cond_2

    if-nez p5, :cond_2

    if-eqz p6, :cond_1

    .line 3
    invoke-virtual {p1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 4
    :cond_1
    invoke-virtual {p1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_2
    const/4 v1, 0x2

    if-ne p2, v1, :cond_3

    if-nez p5, :cond_3

    const-string p2, "\u5373\u5c06\u5f00\u653e"

    .line 5
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    goto :goto_2

    :cond_3
    const/4 v1, 0x6

    if-ne p2, v1, :cond_4

    if-nez p5, :cond_4

    const-string p2, "\u9884\u7ea6"

    .line 7
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_4
    if-eqz p6, :cond_5

    .line 8
    invoke-virtual {p1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 9
    :cond_5
    invoke-virtual {p1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    if-lez p4, :cond_6

    .line 10
    invoke-virtual {p1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p5, 0x7f100305

    new-array p3, p3, [Ljava/lang/Object;

    int-to-double v1, p4

    invoke-static {v1, v2}, Lcom/join/mgps/Util/g2;->m(D)Ljava/lang/String;

    move-result-object p4

    aput-object p4, p3, v0

    invoke-virtual {p2, p5, p3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_6
    :goto_2
    return-void
.end method
