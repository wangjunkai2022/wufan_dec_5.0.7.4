.class public Lcom/join/mgps/activity/PapaMainV3Fragment;
.super Lcom/join/mgps/Util/ImageHandler$AdFragment;
.source "PapaMainV3Fragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/PapaMainV3Fragment$o;,
        Lcom/join/mgps/activity/PapaMainV3Fragment$n;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c0634
.end annotation


# static fields
.field private static final c2:Ljava/lang/String; = "MGPapaMainFragmentNewV2"


# instance fields
.field private A:Landroid/widget/LinearLayout;

.field private A1:Z

.field private B:Landroid/widget/LinearLayout;

.field private B1:Z

.field private C:Lcom/join/mgps/adapter/PapaMainV2Adapter;

.field private C1:J

.field private D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/MgpapaMainItemBean;",
            ">;"
        }
    .end annotation
.end field

.field private D1:Z

.field private E:I

.field private E1:Z

.field private F:I

.field F1:I

.field private G:J

.field G1:Z

.field private H:Z

.field private H1:Ljava/lang/String;

.field I:Lcom/join/mgps/pref/f;

.field I1:Lcom/join/mgps/customview/o;

.field J:Lcom/join/mgps/ptr/PtrClassicFrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private J1:I

.field K:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private K1:I

.field private L:Z

.field private L1:I

.field private M:Z

.field private M1:I

.field private N:Ljava/lang/String;

.field private N1:Lcom/join/mgps/dto/RecomDatabean;

.field private O:I

.field private O1:Lcom/join/mgps/dto/RecomDatabean;

.field private P:I

.field private P1:Ljava/lang/String;

.field Q:Lcom/join/android/app/component/video/g;

.field Q1:J

.field R:Lcom/join/mgps/activity/MGMainActivity;

.field R1:J

.field S:Lcom/join/kotlin/presenter/HomeViewModle;

.field S1:Z

.field private T:Ljava/lang/String;

.field private T1:Z

.field private U:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;",
            ">;"
        }
    .end annotation
.end field

.field private U1:Landroid/util/SparseArray;

.field private V:Landroid/os/Handler;

.field V1:Landroid/view/GestureDetector;

.field private W:Z

.field private W1:J

.field private X:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private X1:I

.field private Y:Ljava/lang/String;

.field Y1:Ljava/lang/Runnable;

.field private Z:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/SScrollingTxtBeanV2;",
            ">;"
        }
    .end annotation
.end field

.field private Z1:Ljava/lang/String;

.field private a2:Z

.field private b2:Z

.field d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/res/StringRes;
        resName = "net_excption"
    .end annotation
.end field

.field f:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/res/StringRes;
        resName = "connect_server_excption"
    .end annotation
.end field

.field g:Lcom/join/mgps/rpc/e;

.field h:Landroid/widget/TextView;
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

.field k:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field o:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field p:Landroid/widget/FrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private p0:I

.field private p1:Z

.field q:Landroid/widget/ViewFlipper;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field r:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field s:Lcom/google/android/material/appbar/AppBarLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field t:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field private u:Landroid/content/Context;

.field private v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field private v1:I

.field private w:Z

.field x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/business/RecomDatabeanBusiness;",
            ">;"
        }
    .end annotation
.end field

.field private y:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field z:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/Util/ImageHandler$AdFragment;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->x:Ljava/util/List;

    .line 3
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->y:Ljava/util/Map;

    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->H:Z

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->I:Lcom/join/mgps/pref/f;

    .line 6
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->L:Z

    .line 7
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->M:Z

    const-string v2, "m1"

    .line 8
    iput-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->N:Ljava/lang/String;

    const/4 v2, 0x1

    .line 9
    iput v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->O:I

    .line 10
    iput v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->P:I

    .line 11
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->U:Ljava/util/List;

    .line 12
    iput-boolean v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->W:Z

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->X:Ljava/util/List;

    .line 14
    iput v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->F1:I

    .line 15
    iput-boolean v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->G1:Z

    const-string v0, "28"

    .line 16
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->H1:Ljava/lang/String;

    .line 17
    iput v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->J1:I

    .line 18
    iput v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->K1:I

    const-string v0, ""

    .line 19
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->P1:Ljava/lang/String;

    const-wide/16 v3, 0x0

    .line 20
    iput-wide v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Q1:J

    .line 21
    iput-wide v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->R1:J

    .line 22
    iput-boolean v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->S1:Z

    .line 23
    iput-boolean v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->T1:Z

    .line 24
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->U1:Landroid/util/SparseArray;

    .line 25
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/join/mgps/activity/PapaMainV3Fragment$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment$b;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V

    invoke-direct {v0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->V1:Landroid/view/GestureDetector;

    .line 26
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment$c;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Y1:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    return-object p0
.end method

.method private A1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->U:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 2
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 4
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getMod_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    :cond_1
    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->s1()V

    .line 7
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->e2(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/activity/PapaMainV3Fragment;Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->w1(Landroidx/recyclerview/widget/RecyclerView;I)V

    return-void
.end method

.method private B1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->U:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 2
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 4
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getMod_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    :cond_1
    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->s1()V

    .line 7
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->e2(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method private C1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->U:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 2
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 4
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getMod_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    :cond_1
    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->s1()V

    .line 7
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->e2(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method private D0()V
    .locals 0

    return-void
.end method

.method private E1()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->H:Z

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->getFirstVisiblePosition()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->o1()V

    :cond_0
    const-string v0, "m1"

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->N:Ljava/lang/String;

    .line 5
    iput v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->O:I

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->P:I

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {v2, v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->setNoMoreView(Z)V

    .line 8
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->W:Z

    .line 9
    iget v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->O:I

    const-string v1, "refresh"

    invoke-virtual {p0, v1, v0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l1(Ljava/lang/String;I)V

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->W0()V

    :cond_1
    return-void
.end method

.method private G0()V
    .locals 0

    return-void
.end method

.method private J1(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v1, "home"

    .line 2
    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setPage(Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setReMarks(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sendExposurePoint: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v1, Lcom/papa/sim/statistic/Event;->pullDownModelExp:Lcom/papa/sim/statistic/Event;

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v0, v2}, Lcom/papa/sim/statistic/p;->k0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Ljava/lang/String;)V

    return-void
.end method

.method private K0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->V:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->V:Landroid/os/Handler;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->V:Landroid/os/Handler;

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Y1:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private K1(Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 5

    .line 1
    invoke-direct {p0, p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->c1(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)Z

    move-result v0

    .line 2
    invoke-direct {p0, p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->T0(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v3, "home"

    .line 4
    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setPage(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v2, p1}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 7
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;->getLink_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/papa/sim/statistic/Ext;->setReMarks(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {v2, v1}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 9
    :cond_2
    :goto_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 10
    new-instance p1, Lcom/papa/sim/statistic/Data;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 11
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/papa/sim/statistic/Data;->setWhere(Ljava/lang/String;)Lcom/papa/sim/statistic/Data;

    .line 12
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 13
    :try_start_0
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    .line 14
    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    if-eqz v0, :cond_4

    sget-object v0, Lcom/papa/sim/statistic/Event;->expH5AndCollGameAdPicPage:Lcom/papa/sim/statistic/Event;

    goto :goto_2

    :cond_4
    sget-object v0, Lcom/papa/sim/statistic/Event;->expGameAdPage:Lcom/papa/sim/statistic/Event;

    :goto_2
    invoke-virtual {v1, v0, v2, p1}, Lcom/papa/sim/statistic/p;->T1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V

    .line 15
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->isMiniGame()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 16
    invoke-direct {p0, p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->N1(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    :cond_5
    return-void
.end method

.method private L0(ILjava/util/List;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;",
            ">;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->X:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_1

    .line 2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gt p1, v0, :cond_1

    .line 3
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 4
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 5
    invoke-direct {p0, p3, v0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->K1(Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->X:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method private L1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v1, "home"

    .line 2
    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setPage(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0, p1}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 4
    invoke-virtual {v0, p3}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    invoke-virtual {v0, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object p2, Lcom/papa/sim/statistic/Event;->expGameAdPage:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p1, p2, v0, p3}, Lcom/papa/sim/statistic/p;->k0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Ljava/lang/String;)V

    return-void
.end method

.method private M1(Z)V
    .locals 2

    .line 1
    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 2
    sget-object v1, Lcom/papa/sim/statistic/ExtFrom;->home:Lcom/papa/sim/statistic/ExtFrom;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setPage(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z1:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v1, Lcom/papa/sim/statistic/Event;->appPageVisit:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p1, v1, v0}, Lcom/papa/sim/statistic/p;->m1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method private N1(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v1, "home"

    .line 2
    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setPage(Ljava/lang/String;)V

    const-string v1, "106"

    .line 3
    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 4
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->T0(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v1, Lcom/papa/sim/statistic/Event;->expSmallGameAdPage:Lcom/papa/sim/statistic/Event;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->t:Ljava/lang/String;

    invoke-virtual {p1, v1, v0, v2}, Lcom/papa/sim/statistic/p;->k0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Ljava/lang/String;)V

    return-void
.end method

.method private O1(Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "22-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v2, Lcom/papa/sim/statistic/ExtFrom;->home:Lcom/papa/sim/statistic/ExtFrom;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, p1, v1}, Lcom/papa/sim/statistic/p;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private P1(Lcom/psk/eventmodule/Event;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 13

    if-eqz p2, :cond_7

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getPosition_path()Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    .line 3
    array-length v2, v0

    const/4 v3, 0x2

    if-le v2, v3, :cond_4

    const/4 v2, 0x0

    .line 4
    aget-object v2, v0, v2

    const-string v4, "22"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    return-void

    :cond_1
    const/4 v2, 0x1

    .line 5
    aget-object v4, v0, v2

    const-string v5, "4"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v1, "\u5927\u5bb6\u90fd\u5728\u73a9"

    goto :goto_0

    .line 6
    :cond_2
    aget-object v2, v0, v2

    const-string v4, "13"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v1, "\u6700\u65b0\u7f51\u6e38"

    .line 7
    :cond_3
    :goto_0
    aget-object v0, v0, v3

    goto :goto_1

    :cond_4
    const-string v0, "0"

    :goto_1
    move-object v6, v0

    move-object v5, v1

    .line 8
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    return-void

    .line 9
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/psk/eventmodule/Event;->exposure:Lcom/psk/eventmodule/Event;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->S:Lcom/join/kotlin/presenter/HomeViewModle;

    invoke-virtual {v1}, Lcom/join/kotlin/presenter/HomeViewModle;->getLists()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 12
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "hasSend= "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "  "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "volcannoEvent"

    invoke-static {p2, p1}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 13
    :cond_6
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->S:Lcom/join/kotlin/presenter/HomeViewModle;

    invoke-virtual {v1}, Lcom/join/kotlin/presenter/HomeViewModle;->getLists()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    sget-object v0, Lcom/psk/eventmodule/StatFactory;->Companion:Lcom/psk/eventmodule/StatFactory$Companion;

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/psk/eventmodule/StatFactory$Companion;->getInstance(Landroid/content/Context;)Lcom/psk/eventmodule/StatFactory;

    move-result-object v0

    new-instance v1, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;

    .line 15
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lcom/psk/eventmodule/StatFactory$SpmData;

    const/4 v7, 0x0

    const-string v3, "wufun"

    const-string v4, "home"

    move-object v2, v10

    invoke-direct/range {v2 .. v7}, Lcom/psk/eventmodule/StatFactory$SpmData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 16
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getPosition_path()Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    move-result-object v11

    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getTag_id()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lcom/join/mgps/Util/UtilsMy;->l2(Ljava/util/List;)Z

    move-result v12

    move-object v7, v1

    move-object v8, p1

    invoke-direct/range {v7 .. v12}, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;-><init>(Lcom/psk/eventmodule/Event;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$SpmData;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)V

    .line 17
    invoke-virtual {v0, v1}, Lcom/psk/eventmodule/StatFactory;->sendEvent(Lcom/psk/eventmodule/StatFactory$VolcanoEvent;)V

    :cond_7
    :goto_2
    return-void
.end method

.method private R1(Ljava/util/List;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecomDatabean;",
            ">;II)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/RecomDatabean;

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p2}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 5
    invoke-virtual {v0, p3}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private S0()V
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "localType"

    const/4 v2, 0x1

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->I:Lcom/join/mgps/pref/f;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/join/mgps/pref/f;->callOnlineCoupon(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method private T0(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    .line 2
    :cond_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 4
    :cond_2
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getMod_id()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private U1(Lcom/join/mgps/dto/MgpapaMainItemBean;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getShowtype()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/16 v2, 0xd

    if-eq v0, v2, :cond_0

    goto/16 :goto_1

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeanLeft()Lcom/join/mgps/business/RecomDatabeanBusiness;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_a

    const/4 v2, 0x0

    .line 5
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AppBeanMain;

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType2()Ljava/lang/String;

    move-result-object p1

    const-string v3, "-"

    .line 8
    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const-string v4, "0"

    .line 9
    array-length v5, p1

    const-string v6, "\u6a21\u5757"

    const-string v7, "\u5927\u5bb6\u90fd\u5728\u73a9"

    const-string v8, "\u7f51\u6e38\u63a8\u8350"

    const-string v9, "\u6700\u65b0\u7f51\u6e38"

    if-lez v5, :cond_8

    .line 10
    aget-object v5, p1, v2

    const-string v10, "4"

    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v10, 0x1

    if-eqz v5, :cond_2

    .line 11
    array-length v1, p1

    if-le v1, v10, :cond_1

    aget-object v4, p1, v10

    :cond_1
    move-object v6, v7

    goto :goto_0

    .line 12
    :cond_2
    aget-object v5, p1, v2

    const-string v7, "7"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 13
    array-length v1, p1

    if-le v1, v10, :cond_3

    aget-object v4, p1, v10

    :cond_3
    move-object v6, v8

    goto :goto_0

    .line 14
    :cond_4
    aget-object v2, p1, v2

    const-string v5, "5"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 15
    array-length v1, p1

    if-le v1, v10, :cond_5

    aget-object v4, p1, v10

    :cond_5
    move-object v6, v9

    goto :goto_0

    .line 16
    :cond_6
    array-length v2, p1

    const/4 v5, 0x2

    if-le v2, v5, :cond_7

    .line 17
    aget-object v4, p1, v5

    .line 18
    :cond_7
    array-length v2, p1

    if-le v2, v1, :cond_9

    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v4, p1, v10

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 20
    aget-object v4, p1, v1

    goto :goto_0

    :cond_8
    const-string v6, ""

    .line 21
    :cond_9
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "home-"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 22
    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/DownloadPointBase;->setRecPosition(Ljava/lang/String;)V

    :cond_a
    :goto_1
    return-void
.end method

.method public static synthetic V(Lcom/join/mgps/activity/PapaMainV3Fragment;Lcom/google/android/material/appbar/AppBarLayout;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->i1(Lcom/google/android/material/appbar/AppBarLayout;I)V

    return-void
.end method

.method private V0()I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->F:I

    if-ge v0, v2, :cond_1

    .line 2
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->U1:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/activity/PapaMainV3Fragment$n;

    if-eqz v2, :cond_0

    .line 3
    iget v2, v2, Lcom/join/mgps/activity/PapaMainV3Fragment$n;->a:I

    add-int/2addr v1, v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->U1:Landroid/util/SparseArray;

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/PapaMainV3Fragment$n;

    if-nez v0, :cond_2

    .line 5
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment$n;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V

    .line 6
    :cond_2
    iget v0, v0, Lcom/join/mgps/activity/PapaMainV3Fragment$n;->b:I

    sub-int/2addr v1, v0

    return v1
.end method

.method private V1(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecomDatabean;",
            ">;",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecomDatabean;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->y1(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->x:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    if-eqz p1, :cond_2

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 4
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 5
    new-instance v2, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    if-nez v1, :cond_1

    if-nez p2, :cond_0

    goto/16 :goto_2

    .line 6
    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/RecomDatabean;

    const/16 v4, 0xd

    .line 7
    invoke-virtual {v2, v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 8
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/business/RecomDatabeanBusiness;

    invoke-virtual {v4}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/ModleBean;->setPic_remote(Ljava/lang/String;)V

    .line 9
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/business/RecomDatabeanBusiness;

    invoke-virtual {v4}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModleBean;->getVedio_url()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/join/mgps/dto/ModleBean;->setVedio_url(Ljava/lang/String;)V

    .line 10
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "x"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setMoreType2(Ljava/lang/String;)V

    goto :goto_1

    .line 11
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v1, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setMoreType2(Ljava/lang/String;)V

    const/4 v3, 0x3

    .line 12
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 13
    :goto_1
    invoke-virtual {v2, v1}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setMoreType(I)V

    .line 14
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/business/RecomDatabeanBusiness;

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setRecomDatabeanLeft(Lcom/join/mgps/business/RecomDatabeanBusiness;)V

    .line 15
    invoke-direct {p0, v2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->U1(Lcom/join/mgps/dto/MgpapaMainItemBean;)V

    .line 16
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_2
    return-void
.end method

.method public static synthetic W(Lcom/join/mgps/activity/PapaMainV3Fragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->h1()V

    return-void
.end method

.method public static synthetic X(Lcom/join/mgps/activity/PapaMainV3Fragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->j1()V

    return-void
.end method

.method static synthetic a0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    return-object p0
.end method

.method private a1()V
    .locals 9

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->k:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->A1:Z

    .line 4
    new-instance v1, Landroidx/lifecycle/ViewModelProvider;

    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {v2}, Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;->getInstance(Landroid/app/Application;)Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class v2, Lcom/join/kotlin/presenter/HomeViewModle;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/presenter/HomeViewModle;

    iput-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->S:Lcom/join/kotlin/presenter/HomeViewModle;

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/join/kotlin/presenter/HomeViewModle;->initStat(Landroid/content/Context;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->S:Lcom/join/kotlin/presenter/HomeViewModle;

    invoke-virtual {v1}, Lcom/join/kotlin/presenter/HomeViewModle;->getLists()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    const/16 v1, 0x15

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/n;->v(Landroid/content/Context;)I

    move-result v0

    int-to-float v1, v0

    .line 8
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0713c6

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    cmpl-float v1, v1, v3

    if-lez v1, :cond_1

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->p:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v2, v0, v2, v2}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    .line 10
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->x:Ljava/util/List;

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->U:Ljava/util/List;

    .line 12
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    .line 13
    new-instance v0, Lcom/join/mgps/adapter/PapaMainV2Adapter;

    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    iget-object v7, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Q:Lcom/join/android/app/component/video/g;

    new-instance v8, Lcom/join/mgps/activity/PapaMainV3Fragment$g;

    invoke-direct {v8, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment$g;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V

    move-object v3, v0

    move-object v5, p0

    invoke-direct/range {v3 .. v8}, Lcom/join/mgps/adapter/PapaMainV2Adapter;-><init>(Landroid/content/Context;Landroidx/fragment/app/Fragment;Ljava/util/List;Lcom/join/android/app/component/video/g;Lc2/f;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->C:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    const/4 v1, 0x1

    .line 14
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->setHasStableIds(Z)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v3, 0x7f0c0621

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    new-instance v2, Lcom/join/mgps/activity/PapaMainV3Fragment$h;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment$h;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V

    invoke-virtual {v0, v2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->setLoadingListener(Lcom/join/android/app/component/xrecyclerview/XRecyclerView2$g;)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->J:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    invoke-virtual {v0, v2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->setPtrFrameLayout(Lcom/join/mgps/ptr/PtrFrameLayout;)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->setPreLoadCount(I)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->C:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    new-instance v2, Lcom/join/mgps/activity/PapaMainV3Fragment$i;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment$i;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V

    invoke-virtual {v0, v2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->T(Lcom/join/mgps/adapter/PapaMainV2Adapter$h;)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->C:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    invoke-virtual {v0, v2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 21
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 22
    new-instance v2, Lcom/join/mgps/activity/PapaMainV3Fragment$j;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment$j;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    .line 23
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    new-instance v2, Lcom/join/mgps/activity/PapaMainV3Fragment$k;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment$k;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 25
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    new-instance v2, Lcom/join/mgps/activity/PapaMainV3Fragment$l;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment$l;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 26
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->J:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    invoke-virtual {v0, v1}, Lcom/join/mgps/ptr/PtrFrameLayout;->j(Z)V

    .line 27
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->s:Lcom/google/android/material/appbar/AppBarLayout;

    new-instance v1, Lcom/join/mgps/activity/n2;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/n2;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/appbar/AppBarLayout;->addOnOffsetChangedListener(Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;)V

    return-void
.end method

.method static synthetic b0(Lcom/join/mgps/activity/PapaMainV3Fragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->E1()V

    return-void
.end method

.method private b1(Lcom/join/mgps/dto/SScrollingTxtDTOV2;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lcom/join/mgps/dto/SScrollingTxtDTOV2;->getText()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z:Ljava/util/ArrayList;

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z:Ljava/util/ArrayList;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->q:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->stopFlipping()V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->q:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->removeAllViews()V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/SScrollingTxtBeanV2;

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0c0402

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 8
    invoke-virtual {v1}, Lcom/join/mgps/dto/SScrollingTxtBeanV2;->getWord()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->q:Landroid/widget/ViewFlipper;

    invoke-virtual {v1, v2}, Landroid/widget/ViewFlipper;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {p1}, Lcom/join/mgps/dto/SScrollingTxtDTOV2;->getInterval()I

    move-result p1

    iput p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->p0:I

    const/4 v0, 0x1

    if-ge p1, v0, :cond_3

    .line 11
    iput v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->p0:I

    .line 12
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->q:Landroid/widget/ViewFlipper;

    iget v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->p0:I

    mul-int/lit16 v0, v0, 0x3e8

    invoke-virtual {p1, v0}, Landroid/widget/ViewFlipper;->setFlipInterval(I)V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->q:Landroid/widget/ViewFlipper;

    invoke-virtual {p1}, Landroid/widget/ViewFlipper;->startFlipping()V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z:Ljava/util/ArrayList;

    sput-object p1, Lcom/MApplication;->G1:Ljava/util/ArrayList;

    .line 15
    iget p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->p0:I

    sput p1, Lcom/MApplication;->H1:I

    return-void
.end method

.method static synthetic c0(Lcom/join/mgps/activity/PapaMainV3Fragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->E:I

    return p0
.end method

.method private c1(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;->getLink_type()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq p1, v2, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method static synthetic d0(Lcom/join/mgps/activity/PapaMainV3Fragment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->E:I

    return p1
.end method

.method static synthetic e0(Lcom/join/mgps/activity/PapaMainV3Fragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->F:I

    return p0
.end method

.method private e2(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 15

    move-object v13, p0

    .line 1
    iget v0, v13, Lcom/join/mgps/activity/PapaMainV3Fragment;->F:I

    if-ltz v0, :cond_9

    move v14, v0

    .line 2
    :goto_0
    iget v0, v13, Lcom/join/mgps/activity/PapaMainV3Fragment;->E:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, v13, Lcom/join/mgps/activity/PapaMainV3Fragment;->C:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    invoke-virtual {v1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->getItemCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-gt v14, v0, :cond_9

    .line 3
    iget-object v0, v13, Lcom/join/mgps/activity/PapaMainV3Fragment;->C:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    invoke-virtual {v0, v14}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->v(I)Lcom/join/mgps/dto/MgpapaMainItemBean;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getShowtype()I

    move-result v1

    const/16 v2, 0x1c

    const/4 v3, 0x0

    if-eq v1, v2, :cond_5

    const/16 v2, 0x1d

    if-eq v1, v2, :cond_3

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_2

    .line 5
    :pswitch_0
    :try_start_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 6
    iget-object v1, v13, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    iget v2, v13, Lcom/join/mgps/activity/PapaMainV3Fragment;->F:I

    sub-int v2, v14, v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 7
    iget-object v2, v13, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v1

    .line 8
    instance-of v2, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;

    if-eqz v2, :cond_8

    .line 9
    check-cast v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;

    if-eqz v0, :cond_8

    .line 10
    iget-object v1, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;->a:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_8

    .line 11
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/adapter/HomeRecommendAdapter;

    if-eqz v1, :cond_8

    .line 12
    invoke-virtual {v1}, Lcom/join/mgps/base/BaseQuickAdapter;->getData()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    if-eqz v3, :cond_1

    .line 14
    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v5

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 15
    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    .line 16
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v5

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 17
    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    .line 18
    :cond_2
    invoke-virtual {v1, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_2

    .line 20
    :cond_3
    :pswitch_1
    :try_start_1
    invoke-virtual {v0}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 21
    iget-object v0, v13, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    iget v1, v13, Lcom/join/mgps/activity/PapaMainV3Fragment;->F:I

    sub-int v1, v14, v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 22
    iget-object v1, v13, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v0

    .line 23
    instance-of v1, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;

    if-eqz v1, :cond_8

    .line 24
    check-cast v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;

    if-eqz v2, :cond_8

    .line 25
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 26
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setRequesting(Z)V

    .line 27
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object v1

    .line 28
    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 29
    :cond_4
    iget-object v3, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->c:Landroid/widget/TextView;

    iget-object v4, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->i:Landroid/widget/TextView;

    iget-object v5, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->j:Landroid/widget/FrameLayout;

    iget-object v6, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->k:Landroid/widget/TextView;

    iget-object v7, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->d:Landroid/widget/LinearLayout;

    iget-object v8, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->e:Landroid/widget/TextView;

    iget-object v9, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->f:Landroid/widget/TextView;

    iget-object v10, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->g:Landroid/widget/ProgressBar;

    iget-object v11, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->h:Landroid/widget/ProgressBar;

    iget-object v12, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->n:Landroid/widget/ProgressBar;

    move-object v1, p0

    invoke-direct/range {v1 .. v12}, Lcom/join/mgps/activity/PapaMainV3Fragment;->update(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_2

    :catch_1
    move-exception v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2

    .line 31
    :cond_5
    :pswitch_2
    :try_start_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 32
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setRequesting(Z)V

    .line 33
    iget-object v0, v13, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    iget v1, v13, Lcom/join/mgps/activity/PapaMainV3Fragment;->F:I

    sub-int v1, v14, v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_6

    goto :goto_2

    .line 34
    :cond_6
    iget-object v1, v13, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v0

    .line 35
    instance-of v1, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;

    if-eqz v1, :cond_8

    .line 36
    check-cast v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;

    .line 37
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 38
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object v1

    .line 39
    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 40
    :cond_7
    iget-object v3, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->c:Landroid/widget/TextView;

    iget-object v4, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->i:Landroid/widget/TextView;

    iget-object v5, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->j:Landroid/widget/FrameLayout;

    iget-object v6, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->k:Landroid/widget/TextView;

    iget-object v7, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->d:Landroid/widget/LinearLayout;

    iget-object v8, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->e:Landroid/widget/TextView;

    iget-object v9, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->f:Landroid/widget/TextView;

    iget-object v10, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->g:Landroid/widget/ProgressBar;

    iget-object v11, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->h:Landroid/widget/ProgressBar;

    iget-object v12, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->l:Landroid/widget/ProgressBar;

    move-object v1, p0

    invoke-direct/range {v1 .. v12}, Lcom/join/mgps/activity/PapaMainV3Fragment;->update(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    :goto_2
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_0

    :cond_9
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x22
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic f0(Lcom/join/mgps/activity/PapaMainV3Fragment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->F:I

    return p1
.end method

.method static synthetic g0(Lcom/join/mgps/activity/PapaMainV3Fragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->P:I

    return p0
.end method

.method private g2(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->x:Ljava/util/List;

    if-eqz v0, :cond_a

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_a

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->x:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_a

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->x:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/business/RecomDatabeanBusiness;

    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/AppBeanMain;

    .line 4
    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v2

    if-nez v2, :cond_0

    goto/16 :goto_3

    .line 5
    :cond_0
    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v3

    if-eqz v3, :cond_8

    .line 6
    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v3

    .line 7
    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->y:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v5, 0x5

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    .line 8
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v4

    if-ne v4, v5, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    .line 9
    :goto_1
    iget-object v7, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->y:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v3, :cond_2

    .line 10
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v3

    if-ne v3, v5, :cond_2

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    if-eqz v6, :cond_3

    if-eqz v4, :cond_3

    .line 11
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 12
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->x:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/business/RecomDatabeanBusiness;

    invoke-virtual {v2, p1}, Lcom/join/mgps/business/RecomDatabeanBusiness;->d(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    :cond_3
    if-eqz v6, :cond_4

    .line 13
    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 14
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->x:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/business/RecomDatabeanBusiness;

    invoke-virtual {v2, p1}, Lcom/join/mgps/business/RecomDatabeanBusiness;->d(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    :cond_4
    if-eqz v4, :cond_5

    .line 15
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 16
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->x:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/business/RecomDatabeanBusiness;

    invoke-virtual {v2, p1}, Lcom/join/mgps/business/RecomDatabeanBusiness;->d(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 18
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->y:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    :cond_6
    if-nez v3, :cond_7

    .line 19
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->y:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    :cond_7
    if-eqz v3, :cond_9

    .line 20
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 21
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->x:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/business/RecomDatabeanBusiness;

    invoke-virtual {v2, p1}, Lcom/join/mgps/business/RecomDatabeanBusiness;->d(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    .line 22
    :cond_8
    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 23
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->x:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/business/RecomDatabeanBusiness;

    invoke-virtual {v2, p1}, Lcom/join/mgps/business/RecomDatabeanBusiness;->d(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 24
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->y:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_9
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :catch_0
    move-exception p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_a
    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->T1:Z

    return p0
.end method

.method private synthetic h1()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->E1:Z

    const/4 v1, 0x1

    .line 2
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->W:Z

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1, v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->setNoMoreView(Z)V

    :cond_0
    const/4 v0, 0x2

    .line 5
    iput v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->O:I

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->N:Ljava/lang/String;

    invoke-virtual {p0, v1, v0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l1(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic i0(Lcom/join/mgps/activity/PapaMainV3Fragment;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->T1:Z

    return p1
.end method

.method private synthetic i1(Lcom/google/android/material/appbar/AppBarLayout;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->J:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    if-ltz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setEnabled(Z)V

    return-void
.end method

.method static synthetic j0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Lcom/join/mgps/adapter/PapaMainV2Adapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->C:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    return-object p0
.end method

.method private synthetic j1()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->a2:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->b2:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0710fd

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    aput v3, v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    aput v3, v1, v2

    const-string v2, "translationX"

    invoke-static {v0, v2, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0x96

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/join/mgps/activity/PapaMainV3Fragment$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment$e;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 4
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :cond_1
    :goto_0
    return-void
.end method

.method private j2(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p5, :cond_0

    .line 1
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    invoke-virtual {p3, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 4
    invoke-virtual {p4, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz p6, :cond_1

    .line 7
    invoke-virtual {p4, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 8
    invoke-virtual {p3, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p3, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 10
    invoke-virtual {p4, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method static synthetic k0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->p1:Z

    return p0
.end method

.method private k2()V
    .locals 15

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->F:I

    if-ltz v0, :cond_a

    .line 2
    :goto_0
    iget v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->E:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->C:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    invoke-virtual {v2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->getItemCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-gt v0, v1, :cond_a

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->C:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    invoke-virtual {v1, v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->v(I)Lcom/join/mgps/dto/MgpapaMainItemBean;

    move-result-object v1

    if-nez v1, :cond_0

    goto/16 :goto_6

    .line 4
    :cond_0
    invoke-virtual {v1}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getShowtype()I

    move-result v2

    const/16 v3, 0x1c

    const-string v4, "/S"

    const/4 v5, 0x2

    const/16 v6, 0xc

    const-wide/16 v7, 0x0

    const-string v9, "/"

    const-wide/high16 v10, 0x4090000000000000L    # 1024.0

    if-eq v2, v3, :cond_6

    const/16 v3, 0x1d

    if-eq v2, v3, :cond_3

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_6

    .line 5
    :pswitch_0
    :try_start_0
    invoke-virtual {v1}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 6
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    iget v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->F:I

    sub-int v3, v0, v3

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 7
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v2

    .line 8
    instance-of v3, v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;

    if-eqz v3, :cond_9

    .line 9
    check-cast v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;

    if-eqz v1, :cond_9

    .line 10
    iget-object v2, v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;->a:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v2, :cond_9

    .line 11
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/adapter/HomeRecommendAdapter;

    if-eqz v2, :cond_9

    .line 12
    invoke-virtual {v2}, Lcom/join/mgps/base/BaseQuickAdapter;->getData()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_9

    .line 13
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    if-eqz v4, :cond_1

    .line 14
    invoke-virtual {v4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 15
    invoke-virtual {v4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v5

    .line 16
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v6

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 17
    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    .line 18
    :cond_2
    invoke-virtual {v2, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_6

    :catch_0
    move-exception v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_6

    .line 20
    :cond_3
    :pswitch_1
    :try_start_1
    invoke-virtual {v1}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 21
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    iget v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->F:I

    sub-int v3, v0, v3

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 22
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v2

    .line 23
    instance-of v3, v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;

    if-eqz v3, :cond_9

    .line 24
    check-cast v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;

    if-eqz v1, :cond_9

    .line 25
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    if-eqz v3, :cond_9

    .line 26
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    .line 27
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v3

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    if-eqz v3, :cond_9

    .line 28
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowSize()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v12

    mul-double v12, v12, v10

    mul-double v12, v12, v10

    double-to-long v10, v12

    .line 29
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v12

    cmp-long v14, v12, v7

    if-nez v14, :cond_4

    .line 30
    iget-object v7, v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->e:Landroid/widget/TextView;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v12

    invoke-static {v12, v13}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 31
    :cond_4
    iget-object v7, v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->e:Landroid/widget/TextView;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v12

    invoke-static {v12, v13}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    :goto_2
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v7

    if-ne v7, v6, :cond_5

    .line 33
    iget-object v6, v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->g:Landroid/widget/ProgressBar;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v7

    long-to-int v8, v7

    invoke-virtual {v6, v8}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto :goto_3

    .line 34
    :cond_5
    iget-object v6, v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->h:Landroid/widget/ProgressBar;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v7

    long-to-int v8, v7

    invoke-virtual {v6, v8}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 35
    :goto_3
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    if-ne v1, v5, :cond_9

    .line 36
    iget-object v1, v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->f:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_6

    :catch_1
    move-exception v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_6

    .line 38
    :cond_6
    :pswitch_2
    :try_start_2
    invoke-virtual {v1}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 39
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    iget v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->F:I

    sub-int v3, v0, v3

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 40
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v2

    .line 41
    instance-of v3, v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;

    if-eqz v3, :cond_9

    .line 42
    check-cast v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;

    if-eqz v1, :cond_9

    .line 43
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    if-eqz v3, :cond_9

    .line 44
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    .line 45
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v3

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    if-eqz v3, :cond_9

    .line 46
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowSize()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v12

    mul-double v12, v12, v10

    mul-double v12, v12, v10

    double-to-long v10, v12

    .line 47
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v12

    cmp-long v14, v12, v7

    if-nez v14, :cond_7

    .line 48
    iget-object v7, v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->e:Landroid/widget/TextView;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v12

    invoke-static {v12, v13}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 49
    :cond_7
    iget-object v7, v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->e:Landroid/widget/TextView;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v12

    invoke-static {v12, v13}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    :goto_4
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v7

    if-ne v7, v6, :cond_8

    .line 51
    iget-object v6, v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->g:Landroid/widget/ProgressBar;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v7

    long-to-int v8, v7

    invoke-virtual {v6, v8}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto :goto_5

    .line 52
    :cond_8
    iget-object v6, v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->h:Landroid/widget/ProgressBar;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v7

    long-to-int v8, v7

    invoke-virtual {v6, v8}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 53
    :goto_5
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    if-ne v1, v5, :cond_9

    .line 54
    iget-object v1, v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->f:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_6

    :catch_2
    move-exception v1

    .line 55
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_9
    :goto_6
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_a
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x22
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic l0(Lcom/join/mgps/activity/PapaMainV3Fragment;Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->K1(Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    return-void
.end method

.method static synthetic m0(Lcom/join/mgps/activity/PapaMainV3Fragment;Lcom/psk/eventmodule/Event;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->P1(Lcom/psk/eventmodule/Event;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    return-void
.end method

.method static synthetic n0(Lcom/join/mgps/activity/PapaMainV3Fragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->L1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private n2(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;II)Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment$9;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment$9;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-direct {p0, v0, p2, p3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->o2(Ljava/util/List;II)Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-lez p3, :cond_0

    const/4 p1, 0x0

    .line 3
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    :cond_0
    return-object p1
.end method

.method static synthetic o0(Lcom/join/mgps/activity/PapaMainV3Fragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->X1:I

    return p0
.end method

.method private o2(Ljava/util/List;II)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;",
            ">;II)",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_4

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_3

    .line 2
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->d()Ljava/util/List;

    move-result-object v0

    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 4
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 5
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getMod_id()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 6
    invoke-virtual {v2, v4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 7
    :cond_2
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 8
    invoke-virtual {v2, v4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    .line 9
    :cond_3
    :goto_2
    invoke-virtual {v2, p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->set_from(I)V

    .line 10
    invoke-virtual {v2, p3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->set_from_type(I)V

    goto :goto_0

    :cond_4
    :goto_3
    return-object p1
.end method

.method static synthetic p0(Lcom/join/mgps/activity/PapaMainV3Fragment;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->X1:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->X1:I

    return v0
.end method

.method private p2(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 3
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setPosition(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-object p1
.end method

.method static synthetic q0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->D1:Z

    return p0
.end method

.method private q2(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 3
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "22-18-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->v1:I

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setPosition(Ljava/lang/String;)V

    .line 4
    iget v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->v1:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->v1:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object p1
.end method

.method static synthetic r0(Lcom/join/mgps/activity/PapaMainV3Fragment;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->J1(I)V

    return-void
.end method

.method private r2(Ljava/util/List;I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;",
            ">;I)",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 3
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "22-14-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->setPosition(Ljava/lang/String;)V

    .line 4
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;

    invoke-virtual {v1, p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->set_from(I)V

    .line 5
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;

    invoke-virtual {v0, p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->set_from_type(I)V

    move v0, v3

    goto :goto_0

    :cond_1
    :goto_1
    return-object p1
.end method

.method static synthetic s0(Lcom/join/mgps/activity/PapaMainV3Fragment;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->D1:Z

    return p1
.end method

.method static synthetic t0(Lcom/join/mgps/activity/PapaMainV3Fragment;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->a2:Z

    return p1
.end method

.method static synthetic u0(Lcom/join/mgps/activity/PapaMainV3Fragment;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->b2:Z

    return p1
.end method

.method private update(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;)V
    .locals 20

    move-object/from16 v8, p0

    move-object/from16 v0, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    .line 1
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v14

    .line 2
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getGameBean()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v15

    const-wide/16 v16, 0x0

    if-eqz v14, :cond_0

    .line 3
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v1

    move-wide/from16 v18, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v18, v16

    :goto_0
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setVisibility(I)V

    const/4 v1, 0x4

    move-object/from16 v2, p11

    .line 5
    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    if-eqz v15, :cond_1

    .line 6
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

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "\u5f00\u59cb"

    .line 7
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v0, 0x8

    move-object/from16 v1, p2

    .line 8
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_5

    :cond_1
    const-string v7, "\u66f4\u65b0"

    const-string v6, "\u542f\u52a8"

    const-string v5, "\u83b7\u53d6"

    if-nez v14, :cond_6

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object v13, v5

    move-object/from16 v5, p9

    move-object v12, v6

    move v6, v10

    move-object v10, v7

    move v7, v11

    .line 9
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/activity/PapaMainV3Fragment;->j2(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 10
    invoke-virtual {v9, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-nez v15, :cond_2

    return-void

    .line 11
    :cond_2
    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 12
    iget-object v1, v8, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    iget-object v2, v8, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 13
    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_4

    .line 14
    iget-object v0, v8, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v1, v8, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v0

    .line 15
    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v0

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 16
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    .line 17
    :cond_3
    invoke-virtual {v9, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    .line 18
    :cond_4
    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 19
    invoke-static {v9, v0, v15}, Lcom/join/mgps/Util/UtilsMy;->f3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/CollectionBeanSub;)V

    goto/16 :goto_5

    .line 20
    :cond_5
    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 21
    invoke-static {v9, v0, v15}, Lcom/join/mgps/Util/UtilsMy;->f3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/CollectionBeanSub;)V

    goto/16 :goto_5

    :cond_6
    move-object v3, v5

    move-object v2, v6

    move-object v1, v7

    .line 22
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v4

    const/16 v5, 0x2b

    if-eqz v15, :cond_7

    .line 23
    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v6

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v6

    if-lez v6, :cond_7

    const/16 v4, 0x2b

    :cond_7
    if-eqz v4, :cond_f

    const/16 v6, 0x1b

    const-string v7, "\u6682\u505c"

    if-eq v4, v6, :cond_e

    const/16 v6, 0x30

    if-eq v4, v6, :cond_d

    const/4 v6, 0x2

    move-object/from16 p1, v7

    const-string v7, "/"

    if-eq v4, v6, :cond_b

    const/4 v6, 0x3

    if-eq v4, v6, :cond_9

    const/4 v6, 0x5

    if-eq v4, v6, :cond_8

    const/4 v6, 0x6

    if-eq v4, v6, :cond_9

    const/4 v6, 0x7

    if-eq v4, v6, :cond_f

    const/16 v6, 0x2a

    if-eq v4, v6, :cond_8

    if-eq v4, v5, :cond_f

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_5

    :pswitch_0
    const/4 v6, 0x0

    const/4 v0, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    move-object v15, v7

    move v7, v0

    .line 24
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/activity/PapaMainV3Fragment;->j2(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v0, "\u70b9\u51fb\u91cd\u65b0\u89e3\u538b"

    .line 26
    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {v12, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    const-string v0, "\u89e3\u538b"

    .line 28
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    :pswitch_1
    move-object v15, v7

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 29
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/activity/PapaMainV3Fragment;->j2(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v0, "\u89e3\u538b\u4e2d.."

    .line 31
    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {v12, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    const-string v0, "\u89e3\u538b\u4e2d"

    .line 33
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    :pswitch_2
    const-string v0, "\u5b89\u88c5"

    .line 34
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 35
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/activity/PapaMainV3Fragment;->j2(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    goto/16 :goto_5

    :pswitch_3
    move-object v15, v7

    const-string v0, "\u7b49\u5f85"

    .line 36
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 37
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/activity/PapaMainV3Fragment;->j2(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    :try_start_0
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {v13, v1}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    const-string v0, "\u7b49\u5f85\u4e2d"

    .line 41
    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    .line 42
    :pswitch_4
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 43
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/activity/PapaMainV3Fragment;->j2(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    goto/16 :goto_5

    .line 44
    :cond_8
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 45
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/activity/PapaMainV3Fragment;->j2(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    goto/16 :goto_5

    :cond_9
    const-string v0, "\u7ee7\u7eed"

    .line 46
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x0

    const/4 v0, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    move-object v15, v7

    move v7, v0

    .line 47
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/activity/PapaMainV3Fragment;->j2(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 48
    :try_start_1
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v0

    cmp-long v2, v0, v16

    if-nez v2, :cond_a

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 50
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    :goto_2
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {v13, v1}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_3
    const-string v0, "\u6682\u505c\u4e2d"

    .line 53
    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    :cond_b
    move-object v15, v7

    .line 54
    invoke-static {v14}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    move-object/from16 v0, p1

    .line 55
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 56
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/activity/PapaMainV3Fragment;->j2(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 57
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v0

    cmp-long v2, v0, v16

    if-nez v2, :cond_c

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 59
    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    :goto_4
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {v13, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 61
    invoke-virtual {v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v0

    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/S"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    :cond_d
    const-string v0, "\u5b89\u88c5\u4e2d"

    .line 63
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 64
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/activity/PapaMainV3Fragment;->j2(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    goto :goto_5

    :cond_e
    move-object v0, v7

    .line 65
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 66
    :cond_f
    invoke-virtual {v9, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v15}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 68
    invoke-static {v9, v0, v15}, Lcom/join/mgps/Util/UtilsMy;->f3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/CollectionBeanSub;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 69
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/activity/PapaMainV3Fragment;->j2(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    :goto_5
    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic v0(Lcom/join/mgps/activity/PapaMainV3Fragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->O:I

    return p0
.end method

.method static synthetic w0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->W:Z

    return p0
.end method

.method private w1(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 3

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onScrollStateChange: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "  "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->getLastCompletelyVisiblePosition()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->C:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->getData()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-nez p2, :cond_1

    .line 2
    invoke-static {}, Lcom/facebook/drawee/backends/pipeline/Fresco;->getImagePipeline()Lcom/facebook/imagepipeline/core/g;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/g;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-static {}, Lcom/facebook/drawee/backends/pipeline/Fresco;->getImagePipeline()Lcom/facebook/imagepipeline/core/g;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/g;->N()V

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->d1()V

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->K0()V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Q:Lcom/join/android/app/component/video/g;

    if-eqz p1, :cond_3

    .line 7
    invoke-virtual {p1}, Lcom/join/android/app/component/video/g;->e()V

    goto :goto_0

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->getLastCompletelyVisiblePosition()I

    move-result p1

    iget-object p2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->C:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    invoke-virtual {p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->getData()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-lt p1, p2, :cond_2

    iget-boolean p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->W:Z

    if-eqz p1, :cond_3

    .line 9
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->e1()V

    .line 10
    :cond_3
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iget-wide v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->C1:J

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x2710

    cmp-long v2, p1, v0

    if-lez v2, :cond_4

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->I0()V

    :cond_4
    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->E1:Z

    return p0
.end method

.method private x1(Lcom/join/mgps/dto/RecomDatabean;)Lcom/join/mgps/business/RecomDatabeanBusiness;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    new-instance v0, Lcom/join/mgps/business/RecomDatabeanBusiness;

    invoke-direct {v0, p1}, Lcom/join/mgps/business/RecomDatabeanBusiness;-><init>(Lcom/join/mgps/dto/RecomDatabean;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method static synthetic y0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->N:Ljava/lang/String;

    return-object p0
.end method

.method private y1(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecomDatabean;",
            ">;",
            "Ljava/util/List<",
            "Lcom/join/mgps/business/RecomDatabeanBusiness;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/join/mgps/business/RecomDatabeanBusiness;",
            ">;"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 1
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    .line 2
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->clear()V

    :goto_0
    if-eqz p1, :cond_1

    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/RecomDatabean;

    .line 4
    new-instance v1, Lcom/join/mgps/business/RecomDatabeanBusiness;

    invoke-direct {v1, v0}, Lcom/join/mgps/business/RecomDatabeanBusiness;-><init>(Lcom/join/mgps/dto/RecomDatabean;)V

    .line 5
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object p2
.end method

.method static synthetic z0(Lcom/join/mgps/activity/PapaMainV3Fragment;ILjava/util/List;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->L0(ILjava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method private z1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->U:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 2
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 4
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getMod_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    const/4 v2, 0x0

    .line 5
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->s1()V

    .line 7
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->e2(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method


# virtual methods
.method public C0()V
    .locals 0

    return-void
.end method

.method D1(Landroid/content/Intent;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.broadcast.bespeak.sussess"
        }
    .end annotation

    if-eqz p1, :cond_0

    const-string v0, "gameid"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->d2(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method E0(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method F0(Ljava/lang/String;)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 4
    :goto_0
    :try_start_0
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    .line 5
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 6
    iget v3, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 7
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 8
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "_"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 9
    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    const-string v1, ""

    .line 10
    :goto_1
    new-instance v3, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;

    invoke-direct {v3}, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;-><init>()V

    .line 11
    invoke-virtual {v3, v1}, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;->setApp_ver(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v3, p1}, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;->setGame_id(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v3, v2}, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;->setUid(I)V

    .line 14
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->z()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;->setMobile(Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/join/mgps/Util/RequestBeanUtil;->getDetialFollowAnd(Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v0

    .line 16
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->g:Lcom/join/mgps/rpc/e;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/e;->d0(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 17
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 18
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->d2(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method F1(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setRequesting(Z)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->C:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method G1()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->p:Landroid/widget/FrameLayout;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getMeasuredHeight()I

    move-result v0

    if-gtz v0, :cond_1

    return-void

    :cond_1
    int-to-double v1, v0

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 3
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v3

    int-to-float v0, v0

    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f071264

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    add-float/2addr v0, v3

    float-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v1, v3

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->T:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->Q1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->T:Ljava/lang/String;

    const-string v3, "#F7F8F9"

    .line 5
    invoke-static {v0, v3, v1, v2}, Lcom/join/mgps/Util/UtilsMy;->Z(Ljava/lang/String;Ljava/lang/String;D)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Y:Ljava/lang/String;

    .line 6
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 8
    sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    const/4 v2, 0x2

    new-array v2, v2, [I

    .line 9
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->T:Ljava/lang/String;

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    aput v3, v2, v1

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Y:Ljava/lang/String;

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    aput v4, v2, v3

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->p:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method H0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->T1()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->X1:I

    .line 3
    iput v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->v1:I

    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->E1:Z

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/MgpapaMainItemBean;

    .line 6
    invoke-virtual {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getPage()I

    move-result v5

    if-ne v5, v1, :cond_0

    add-int/lit8 v3, v3, 0x1

    .line 7
    invoke-virtual {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getShowtype()I

    move-result v5

    const/16 v6, 0x27

    if-ne v5, v6, :cond_1

    .line 8
    iget v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->X1:I

    add-int/2addr v4, v1

    iput v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->X1:I

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getShowtype()I

    move-result v5

    const/16 v6, 0x22

    if-ne v5, v6, :cond_0

    .line 10
    invoke-virtual {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getShowtype()I

    move-result v5

    const/16 v6, 0x23

    if-ne v5, v6, :cond_0

    .line 11
    invoke-virtual {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getShowtype()I

    move-result v4

    const/16 v5, 0x24

    if-ne v4, v5, :cond_0

    .line 12
    iget v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->v1:I

    add-int/2addr v4, v1

    iput v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->v1:I

    goto :goto_0

    .line 13
    :cond_2
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v2, :cond_3

    .line 14
    new-instance v4, Lcom/join/mgps/activity/PapaMainV3Fragment$a;

    iget-object v5, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-direct {v4, p0, v5}, Lcom/join/mgps/activity/PapaMainV3Fragment$a;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;Landroid/content/Context;)V

    .line 15
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;->setTargetPosition(I)V

    .line 16
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->startSmoothScroll(Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;)V

    .line 17
    :cond_3
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->s:Lcom/google/android/material/appbar/AppBarLayout;

    .line 18
    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;

    invoke-virtual {v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;->getBehavior()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v2

    .line 19
    instance-of v3, v2, Lcom/google/android/material/appbar/AppBarLayout$Behavior;

    if-eqz v3, :cond_4

    .line 20
    check-cast v2, Lcom/google/android/material/appbar/AppBarLayout$Behavior;

    .line 21
    invoke-virtual {v2}, Lcom/google/android/material/appbar/AppBarLayout$Behavior;->getTopAndBottomOffset()I

    move-result v3

    if-eqz v3, :cond_4

    .line 22
    invoke-virtual {v2, v0}, Lcom/google/android/material/appbar/AppBarLayout$Behavior;->setTopAndBottomOffset(I)Z

    .line 23
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->V:Landroid/os/Handler;

    if-nez v0, :cond_5

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->V:Landroid/os/Handler;

    .line 24
    :cond_5
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->B1:Z

    .line 25
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->V:Landroid/os/Handler;

    new-instance v1, Lcom/join/mgps/activity/o2;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/o2;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V

    const/16 v2, 0x3e8

    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    .line 26
    invoke-virtual {v3}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->getLastVisiblePosition()I

    move-result v3

    mul-int/lit8 v3, v3, 0xa

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-long v2, v2

    .line 27
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method H1(Lcom/join/mgps/dto/PAPAHomeBeanV7;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->z:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->homeAllDataV3()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-static {p1}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\u4fdd\u5b58\u6570\u636e\u5b8c\u6210   "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    return-void
.end method

.method I0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->C1:J

    .line 2
    new-instance v0, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 4
    new-instance v1, Lcom/join/mgps/dto/RequestOnlineCouponArgs;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestOnlineCouponArgs;-><init>()V

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 5
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v1

    invoke-virtual {v0}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v0

    invoke-interface {v1, v0}, Le2/i;->m1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object v0

    invoke-interface {v0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ResponseModel;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_0

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/PapaHomeCheckNewDataBean;

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/PapaHomeCheckNewDataBean;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 9
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "homeHasNewData"

    .line 10
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->I:Lcom/join/mgps/pref/f;

    invoke-interface {v1, v0}, Lcom/join/mgps/pref/f;->callHomePageNewData(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method I1()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/Util/IntentUtil;->goSearchHintActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method J0(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getGameBean()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v4}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 4
    new-instance p1, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {p1}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v2, 0x4

    .line 5
    invoke-virtual {p1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 6
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getDown_url_remote()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    if-nez v0, :cond_0

    .line 7
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->T2(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    .line 9
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void

    :cond_1
    if-nez v0, :cond_7

    .line 10
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 11
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    if-nez v0, :cond_3

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v0

    .line 14
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v0

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-ge v0, v2, :cond_2

    goto :goto_0

    .line 15
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/android/app/common/utils/APKUtils;->a0(Landroid/content/Context;Ljava/lang/String;)Z

    return-void

    .line 16
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 17
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v2

    if-nez v0, :cond_4

    if-eqz v2, :cond_5

    .line 18
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/android/app/common/utils/APKUtils;->V(Landroid/content/Context;Lcom/join/mgps/dto/ModInfoBean;)V

    return-void

    .line 19
    :cond_5
    :goto_0
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_6

    .line 20
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 21
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->Y0(Landroid/content/Context;Lcom/join/mgps/dto/CollectionBeanSub;)V

    .line 22
    :goto_1
    sget-object v0, Lcom/psk/eventmodule/Event;->check:Lcom/psk/eventmodule/Event;

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->P1(Lcom/psk/eventmodule/Event;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    return-void

    :cond_7
    const/4 v2, 0x0

    if-eqz v0, :cond_8

    .line 23
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    .line 24
    :cond_8
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->get_from()I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from(I)V

    .line 25
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->get_from_type()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    .line 26
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object p1

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result p1

    const/16 v3, 0x2b

    if-lez p1, :cond_9

    const/16 v2, 0x2b

    :cond_9
    const/4 p1, 0x5

    if-eqz v2, :cond_10

    const/16 v4, 0xd

    if-eq v2, v4, :cond_f

    const/4 v4, 0x2

    if-eq v2, v4, :cond_e

    const/4 v4, 0x3

    if-eq v2, v4, :cond_d

    if-eq v2, p1, :cond_c

    const/4 v4, 0x6

    if-eq v2, v4, :cond_d

    const/4 v4, 0x7

    if-eq v2, v4, :cond_10

    const/16 v4, 0x2a

    if-eq v2, v4, :cond_b

    if-eq v2, v3, :cond_10

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_2

    .line 27
    :pswitch_0
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_2

    .line 28
    :pswitch_1
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_a

    .line 29
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 30
    :cond_a
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->I2(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 31
    :cond_b
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->r4(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 32
    :cond_c
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->T3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 33
    :cond_d
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_2

    .line 34
    :cond_e
    :pswitch_2
    invoke-static {v0}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 35
    :cond_f
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 36
    :cond_10
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_11

    .line 37
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2

    .line 38
    :cond_11
    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->y1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/CollectionBeanSub;)V

    .line 39
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v2, v0}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_2

    .line 40
    :cond_12
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getDown_status()I

    move-result v2

    if-ne v2, p1, :cond_13

    .line 41
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 42
    :cond_13
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getTp_down_url()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getOther_down_switch()I

    move-result v3

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getCdn_down_switch()I

    move-result v1

    invoke-static {p1, v0, v2, v3, v1}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method M0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->q:Landroid/widget/ViewFlipper;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getCurrentView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->q:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getCurrentView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->q:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getCurrentView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 4
    :goto_0
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 5
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/SScrollingTxtBeanV2;

    invoke-virtual {v3}, Lcom/join/mgps/dto/SScrollingTxtBeanV2;->getWord()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-ltz v2, :cond_2

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    .line 7
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z:Ljava/util/ArrayList;

    invoke-virtual {v3, v1, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v1

    .line 8
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 9
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 10
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 11
    iput-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z:Ljava/util/ArrayList;

    .line 12
    :cond_2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z:Ljava/util/ArrayList;

    iget v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->p0:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/join/mgps/Util/IntentUtil;->goSearchHintActivity(Landroid/content/Context;Ljava/util/ArrayList;I)V

    goto :goto_2

    .line 13
    :cond_3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goSearchHintActivity(Landroid/content/Context;)V

    :goto_2
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z1:Ljava/lang/String;

    return-void
.end method

.method N0(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->F0(Ljava/lang/String;)V

    return-void
.end method

.method O0(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->N0(Ljava/lang/String;)V

    return-void
.end method

.method P0(Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getGameBean()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->J0(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-nez v0, :cond_1

    .line 5
    invoke-static {}, Lcom/wufan/user/service/protobuf/n0;->b5()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    .line 6
    :cond_1
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 8
    new-instance v2, Lcom/join/mgps/dto/RequestGameIdArgs;

    const/4 v3, 0x1

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    invoke-direct {v2, p1, v3, v0}, Lcom/join/mgps/dto/RequestGameIdArgs;-><init>(Ljava/lang/String;II)V

    .line 9
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 10
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object p1

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v0

    invoke-interface {p1, v0}, Le2/i;->v1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object p1

    invoke-interface {p1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object p1

    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    if-eqz p1, :cond_4

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_4

    .line 12
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/CollectionBeanSub;

    if-eqz p1, :cond_4

    .line 13
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->get_from()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 14
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->get_from_type()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 15
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getPosition_path()Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/DownloadPointBase;->setPosition_path(Lcom/psk/eventmodule/StatFactory$VolcanoOther;)V

    .line 16
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/DownloadPointBase;->setRecPosition(Ljava/lang/String;)V

    .line 17
    invoke-virtual {p2, p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setGameBean(Lcom/join/mgps/dto/CollectionBeanSub;)V

    .line 18
    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->J0(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    const-string p1, "\u83b7\u53d6\u4e0b\u8f7d\u4fe1\u606f\u5931\u8d25"

    .line 20
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->showMessage(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-string p1, "\u5f53\u524d\u7f51\u7edc\u4e0d\u53ef\u7528"

    .line 21
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->showMessage(Ljava/lang/String;)V

    .line 22
    :cond_4
    :goto_1
    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->F1(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    return-void
.end method

.method Q0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->U0()Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->g:Lcom/join/mgps/rpc/e;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/e;->K0(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/RecomDataAllBean;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDataAllBean;->getMessages()Lcom/join/mgps/dto/RecomDataMessageBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDataMessageBean;->getData()Lcom/join/mgps/dto/HomeFloatData;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->Y1(Lcom/join/mgps/dto/HomeFloatData;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 7
    :goto_0
    throw v0

    :cond_0
    :goto_1
    return-void
.end method

.method Q1()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/android/app/common/manager/a;->h()Lcom/join/android/app/common/manager/a;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->f:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/join/android/app/common/manager/a;->j(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method R0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v1}, Lcom/join/mgps/Util/RequestBeanUtil;->getRequestPnAndPc(II)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v0

    .line 2
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->g:Lcom/join/mgps/rpc/e;

    invoke-interface {v2, v0}, Lcom/join/mgps/rpc/e;->l1(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result v2

    if-ne v2, v1, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMessageBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/RecomDatabean;

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBeanMain;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->H1:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public S1(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z1:Ljava/lang/String;

    return-void
.end method

.method T1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 3
    new-instance v1, Lcom/join/mgps/dto/RequestOnlineCouponArgs;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestOnlineCouponArgs;-><init>()V

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 4
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v1

    invoke-virtual {v0}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v0

    invoke-interface {v1, v0}, Le2/i;->R0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object v0

    invoke-interface {v0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ResponseModel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public U0()Lcom/join/mgps/dto/CommonRequestBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getFloatadRequestBean()Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v0

    return-object v0
.end method

.method W0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v1

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/Util/RequestBeanUtil;->vipMessage(I)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->g:Lcom/join/mgps/rpc/e;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/e;->R0(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMessageBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 8
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->a2(Ljava/util/List;)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->m2()V

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->m2()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 12
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->m2()V

    goto :goto_0

    .line 13
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->m2()V

    :goto_0
    return-void
.end method

.method W1()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/s;->i(Landroid/content/Context;)V

    return-void
.end method

.method X0(Landroid/content/Intent;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.papa.maintab.clicked"
        }
    .end annotation

    return-void
.end method

.method X1()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getUserVisibleHint()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    const/4 v2, 0x1

    new-instance v3, Lcom/join/mgps/activity/PapaMainV3Fragment$f;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment$f;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/join/mgps/Util/a0;->O(Landroid/content/Context;ILw1/c;)Lcom/join/mgps/customview/o;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_0
    return-void
.end method

.method Y0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x7d0L
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->h:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method Y1(Lcom/join/mgps/dto/HomeFloatData;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/HomeFloatData;->getPendant()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/HomeFloatData;->getCoin_entrance()Ljava/util/List;

    move-result-object p1

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    const/16 v1, 0x8

    if-eqz v0, :cond_2

    .line 4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_2

    .line 5
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/RecomDatabean;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->N1:Lcom/join/mgps/dto/RecomDatabean;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModleBean;->getAd_switch()I

    move-result v0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->N1:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->P1:Ljava/lang/String;

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->N1:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->N1:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->P1:Ljava/lang/String;

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v1, 0x7f080f05

    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->N1:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 14
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_3
    :goto_0
    if-eqz p1, :cond_4

    .line 15
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 16
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/RecomDatabean;

    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->O1:Lcom/join/mgps/dto/RecomDatabean;

    .line 17
    new-instance p1, Landroid/content/Intent;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.coinflote"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "coinFloatData"

    .line 18
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->O1:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_1
    return-void
.end method

.method Z()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.account_status_uidchange"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->H:Z

    if-nez v0, :cond_0

    const-string v0, "m1"

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->N:Ljava/lang/String;

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->O:I

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->W:Z

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->reset()V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->N:Ljava/lang/String;

    iget v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->O:I

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l1(Ljava/lang/String;I)V

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->W0()V

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->S:Lcom/join/kotlin/presenter/HomeViewModle;

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/kotlin/presenter/HomeViewModle;->initStat(Landroid/content/Context;)V

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->S0()V

    :cond_1
    return-void
.end method

.method Z0(ILjava/lang/String;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v1

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    invoke-virtual {v1, v0, p1, p2}, Lcom/join/mgps/Util/RequestBeanUtil;->getIgnoreMessageRequest(IILjava/lang/String;)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object p1

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->g:Lcom/join/mgps/rpc/e;

    invoke-interface {p2, p1}, Lcom/join/mgps/rpc/e;->e0(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/ResultMainBean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method Z1()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->Q0()V

    return-void
.end method

.method a2(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/VipPopData;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method afterViews()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MGPapaMainFragmentNew afterview   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->g:Lcom/join/mgps/rpc/e;

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->G:J

    .line 6
    new-instance v0, Lcom/join/android/app/component/video/g;

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    const-string v2, "PapaMainV3Fragment"

    invoke-direct {v0, v1, v2}, Lcom/join/android/app/component/video/g;-><init>(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Q:Lcom/join/android/app/component/video/g;

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/MGMainActivity;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->R:Lcom/join/mgps/activity/MGMainActivity;

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->K:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_0

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/n;->v(Landroid/content/Context;)I

    move-result v1

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 11
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->K:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->a1()V

    .line 13
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->k1()V

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->W0()V

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->R0()V

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->Q0()V

    return-void
.end method

.method public b2()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Q:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->u()V

    :cond_0
    return-void
.end method

.method c2()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goSearchHintActivity(Landroid/content/Context;)V

    return-void
.end method

.method d1()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->V:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->V:Landroid/os/Handler;

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->V:Landroid/os/Handler;

    new-instance v1, Lcom/join/mgps/activity/p2;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/p2;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method d2(Ljava/lang/String;)V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/MgpapaMainItemBean;

    .line 2
    invoke-virtual {v1}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getShowtype()I

    move-result v2

    const/16 v3, 0xb

    if-ne v2, v3, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeanLeft()Lcom/join/mgps/business/RecomDatabeanBusiness;

    move-result-object v2

    .line 4
    invoke-virtual {v1}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getRecomDatabeanRight()Lcom/join/mgps/business/RecomDatabeanBusiness;

    move-result-object v1

    const-string v3, ""

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v6}, Lcom/join/mgps/dto/AppBeanMain;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 6
    invoke-virtual {v2}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v1

    .line 7
    invoke-virtual {v1, v4}, Lcom/join/mgps/dto/AppBean;->setIs_bespeak(I)V

    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getBespeak_count()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    add-int/2addr v5, v4

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/AppBean;->setBespeak_count(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->r1()V

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->X1()V

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_0

    .line 11
    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v2}, Lcom/join/mgps/dto/AppBeanMain;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 12
    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v1

    .line 13
    invoke-virtual {v1, v4}, Lcom/join/mgps/dto/AppBean;->setIs_bespeak(I)V

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getBespeak_count()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    add-int/2addr v5, v4

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/AppBean;->setBespeak_count(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->r1()V

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->X1()V

    goto/16 :goto_0

    :cond_2
    return-void
.end method

.method e1()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->a2:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->b2:Z

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0710fd

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    aput v3, v1, v2

    const-string v2, "translationX"

    invoke-static {v0, v2, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/join/mgps/activity/PapaMainV3Fragment$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment$d;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 4
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :cond_1
    :goto_0
    return-void
.end method

.method f1()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->N1:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->N1:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AppBeanMain;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBeanMain;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v0

    .line 4
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v1, v2, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method f2(Lcom/join/mgps/dto/PAPAHomeBeanV7;Ljava/lang/String;IZ)V
    .locals 16
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    move-object/from16 v1, p0

    move/from16 v2, p3

    .line 1
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/activity/MGMainActivity;

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    .line 2
    invoke-virtual {v3, v4}, Lcom/join/mgps/activity/MGMainActivity;->setHomeTabImage(Z)V

    .line 3
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getS_scrolling_txt_v2()Lcom/join/mgps/dto/SScrollingTxtDTOV2;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->b1(Lcom/join/mgps/dto/SScrollingTxtDTOV2;)V

    .line 4
    iget-boolean v3, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->B1:Z

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    .line 5
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 6
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 7
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getPage()I

    move-result v6

    if-eq v6, v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 8
    :cond_2
    iput-boolean v5, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->B1:Z

    .line 9
    :cond_3
    new-instance v3, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v3}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    const v3, 0x7f071236

    const v6, 0x7f071220

    const v7, 0x7f07114a

    const/16 v8, 0x1f

    const v9, 0x7f0712e8

    const/16 v11, 0x27

    const/16 v12, 0x21

    if-ne v2, v4, :cond_14

    move/from16 v13, p4

    .line 10
    iput-boolean v13, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->p1:Z

    .line 11
    iput v5, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->X1:I

    .line 12
    iput v5, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->v1:I

    .line 13
    iget-object v13, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->S:Lcom/join/kotlin/presenter/HomeViewModle;

    invoke-virtual {v13}, Lcom/join/kotlin/presenter/HomeViewModle;->getLists()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->clear()V

    .line 14
    iget-object v13, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->clear()V

    .line 15
    new-instance v13, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v13}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 16
    invoke-virtual {v13, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    const/high16 v14, 0x3f800000    # 1.0f

    .line 17
    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 18
    invoke-virtual {v13, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 19
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->Y:Ljava/lang/String;

    invoke-virtual {v13, v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setMoreType2(Ljava/lang/String;)V

    .line 20
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v14, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    new-instance v13, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v13}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    const/16 v14, 0x1a

    .line 22
    invoke-virtual {v13, v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 23
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getTop_channel()Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;

    move-result-object v14

    if-eqz v14, :cond_5

    .line 24
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->Y:Ljava/lang/String;

    if-eqz v14, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getTop_channel()Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;

    move-result-object v14

    iget-object v15, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->Y:Ljava/lang/String;

    invoke-virtual {v14, v15}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->setBg_color(Ljava/lang/String;)V

    .line 25
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getTop_channel()Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 26
    :cond_5
    invoke-virtual {v13, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 27
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v14, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getFast_entry()Ljava/util/List;

    move-result-object v13

    if-eqz v13, :cond_6

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getFast_entry()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    if-lez v13, :cond_6

    .line 29
    new-instance v13, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v13}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    const/16 v14, 0x1b

    .line 30
    invoke-virtual {v13, v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 31
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getFast_entry()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 32
    invoke-virtual {v13, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 33
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v14, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    :cond_6
    new-instance v13, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v13}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 35
    invoke-virtual {v13, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 36
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    const v15, 0x7f07148d

    invoke-virtual {v14, v15}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v14

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 37
    invoke-virtual {v13, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 38
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v14, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getEo_playing()Ljava/util/List;

    move-result-object v13

    if-eqz v13, :cond_8

    .line 40
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v14

    if-lez v14, :cond_8

    const-string v14, "22-4-"

    .line 41
    invoke-direct {v1, v13, v14}, Lcom/join/mgps/activity/PapaMainV3Fragment;->p2(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    .line 42
    new-instance v14, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 43
    invoke-virtual {v14, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 44
    invoke-virtual {v14, v8}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 45
    new-instance v15, Lcom/join/mgps/dto/PAPAItemTitle2;

    const-string v10, "\u5927\u5bb6\u90fd\u5728\u73a9"

    invoke-direct {v15, v10}, Lcom/join/mgps/dto/PAPAItemTitle2;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v15}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 46
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    new-instance v10, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 48
    invoke-virtual {v10, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 49
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    invoke-virtual {v14, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v14

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    invoke-virtual {v10, v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 50
    invoke-virtual {v10, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 51
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v14, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v10, 0x0

    .line 52
    :goto_1
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v14

    if-ge v10, v14, :cond_7

    .line 53
    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    const/16 v15, 0xc9

    invoke-direct {v1, v14, v15, v15}, Lcom/join/mgps/activity/PapaMainV3Fragment;->n2(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;II)Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-result-object v14

    .line 54
    new-instance v15, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v15}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    const/16 v4, 0x25

    .line 55
    invoke-virtual {v15, v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 56
    invoke-virtual {v15, v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 57
    invoke-virtual {v15, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 58
    rem-int/lit8 v4, v10, 0x2

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setMoreType2(Ljava/lang/String;)V

    .line 59
    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v4, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->U:Ljava/util/List;

    invoke-interface {v4, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    const/4 v4, 0x1

    goto :goto_1

    .line 61
    :cond_7
    new-instance v4, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 62
    invoke-virtual {v4, v11}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 63
    invoke-virtual {v4, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 64
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    new-instance v4, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 66
    invoke-virtual {v4, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 67
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v4, v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 68
    invoke-virtual {v4, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 69
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    :cond_8
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getF_video_ad()Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-result-object v4

    if-eqz v4, :cond_a

    .line 71
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getF_video_ad()Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-result-object v4

    const/16 v14, 0x4ee9

    invoke-direct {v1, v4, v14, v14}, Lcom/join/mgps/activity/PapaMainV3Fragment;->n2(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;II)Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-result-object v4

    const-string v14, "22-11-1"

    .line 72
    invoke-virtual {v4, v14}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setPosition(Ljava/lang/String;)V

    .line 73
    new-instance v14, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 74
    invoke-direct {v1, v4}, Lcom/join/mgps/activity/PapaMainV3Fragment;->c1(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)Z

    move-result v15

    if-eqz v15, :cond_9

    const/16 v15, 0x28

    goto :goto_2

    :cond_9
    const/16 v15, 0x1d

    :goto_2
    invoke-virtual {v14, v15}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 75
    invoke-virtual {v14, v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 76
    invoke-virtual {v14, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 77
    iget-object v15, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v15, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->U:Ljava/util/List;

    invoke-interface {v14, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    new-instance v4, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 80
    invoke-virtual {v4, v11}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 81
    invoke-virtual {v4, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 82
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v14, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    new-instance v4, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 84
    invoke-virtual {v4, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 85
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    invoke-virtual {v14, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v14

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    invoke-virtual {v4, v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 86
    invoke-virtual {v4, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 87
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v14, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    :cond_a
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getJys_like()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_c

    .line 89
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v14

    if-lez v14, :cond_c

    const-string v14, "22-13-"

    .line 90
    invoke-direct {v1, v4, v14}, Lcom/join/mgps/activity/PapaMainV3Fragment;->p2(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 91
    new-instance v14, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 92
    invoke-virtual {v14, v8}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 93
    new-instance v15, Lcom/join/mgps/dto/PAPAItemTitle2;

    const-string v10, "\u50cf\u4f60\u4e00\u6837\u7684\u73a9\u5bb6\u90fd\u559c\u6b22"

    invoke-direct {v15, v10}, Lcom/join/mgps/dto/PAPAItemTitle2;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v15}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 94
    invoke-virtual {v14, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 95
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    new-instance v10, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 97
    invoke-virtual {v10, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 98
    invoke-virtual {v10, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 99
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    invoke-virtual {v14, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v14

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    invoke-virtual {v10, v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 100
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v14, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v10, 0x0

    .line 101
    :goto_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v14

    if-ge v10, v14, :cond_b

    .line 102
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    const/16 v15, 0xcb

    invoke-direct {v1, v14, v15, v15}, Lcom/join/mgps/activity/PapaMainV3Fragment;->n2(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;II)Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-result-object v14

    .line 103
    new-instance v15, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v15}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    const/16 v13, 0x26

    .line 104
    invoke-virtual {v15, v13}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 105
    invoke-virtual {v15, v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 106
    invoke-virtual {v15, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 107
    rem-int/lit8 v13, v10, 0x2

    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v15, v13}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setMoreType2(Ljava/lang/String;)V

    .line 108
    iget-object v13, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v13, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    iget-object v13, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->U:Ljava/util/List;

    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 110
    :cond_b
    new-instance v4, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 111
    invoke-virtual {v4, v11}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 112
    invoke-virtual {v4, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 113
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    new-instance v4, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 115
    invoke-virtual {v4, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 116
    invoke-virtual {v4, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 117
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v4, v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 118
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    :cond_c
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getNg_selection()Ljava/util/List;

    move-result-object v4

    const/16 v10, 0xcc

    .line 120
    invoke-direct {v1, v4, v10}, Lcom/join/mgps/activity/PapaMainV3Fragment;->r2(Ljava/util/List;I)Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_d

    .line 121
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v10

    if-lez v10, :cond_d

    .line 122
    new-instance v10, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 123
    invoke-virtual {v10, v8}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 124
    new-instance v13, Lcom/join/mgps/dto/PAPAItemTitle2;

    const-string v14, "\u65b0\u6e38\u7cbe\u9009"

    invoke-direct {v13, v14}, Lcom/join/mgps/dto/PAPAItemTitle2;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v13}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 125
    invoke-virtual {v10, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 126
    iget-object v13, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v13, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    new-instance v10, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 128
    invoke-virtual {v10, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 129
    invoke-virtual {v10, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 130
    iget-object v13, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    invoke-virtual {v13, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v13

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-virtual {v10, v13}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 131
    iget-object v13, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v13, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 132
    new-instance v10, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    const/16 v13, 0x1e

    .line 133
    invoke-virtual {v10, v13}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 134
    invoke-virtual {v10, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 135
    invoke-virtual {v10, v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 136
    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 137
    new-instance v4, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 138
    invoke-virtual {v4, v11}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 139
    invoke-virtual {v4, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 140
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 141
    new-instance v4, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 142
    invoke-virtual {v4, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 143
    invoke-virtual {v4, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 144
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v4, v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 145
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    :cond_d
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getS_video_ad()Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-result-object v4

    if-eqz v4, :cond_f

    .line 147
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getS_video_ad()Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-result-object v4

    const/16 v10, 0x4eea

    invoke-direct {v1, v4, v10, v10}, Lcom/join/mgps/activity/PapaMainV3Fragment;->n2(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;II)Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-result-object v4

    const-string v10, "22-12-1"

    .line 148
    invoke-virtual {v4, v10}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setPosition(Ljava/lang/String;)V

    .line 149
    new-instance v10, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 150
    invoke-direct {v1, v4}, Lcom/join/mgps/activity/PapaMainV3Fragment;->c1(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)Z

    move-result v13

    if-eqz v13, :cond_e

    const/16 v13, 0x28

    goto :goto_4

    :cond_e
    const/16 v13, 0x1d

    :goto_4
    invoke-virtual {v10, v13}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 151
    invoke-virtual {v10, v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 152
    invoke-virtual {v10, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 153
    iget-object v13, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v13, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->U:Ljava/util/List;

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    new-instance v4, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 156
    invoke-virtual {v4, v11}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 157
    invoke-virtual {v4, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 158
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    new-instance v4, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 160
    invoke-virtual {v4, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 161
    invoke-virtual {v4, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 162
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v4, v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 163
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 164
    :cond_f
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getRanking_list()Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;

    move-result-object v4

    if-eqz v4, :cond_14

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getRanking_list()Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;->getTxt()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_14

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getRanking_list()Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;->getList()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_14

    .line 165
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getRanking_list()Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;->getList()Ljava/util/List;

    move-result-object v4

    const/4 v10, 0x0

    .line 166
    :goto_5
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v13

    if-ge v10, v13, :cond_13

    .line 167
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    if-nez v10, :cond_10

    const-string v14, "22-15-"

    .line 168
    invoke-direct {v1, v13, v14}, Lcom/join/mgps/activity/PapaMainV3Fragment;->p2(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    const/16 v14, 0x5015

    .line 169
    invoke-direct {v1, v13, v14, v14}, Lcom/join/mgps/activity/PapaMainV3Fragment;->o2(Ljava/util/List;II)Ljava/util/List;

    move-result-object v13

    invoke-interface {v4, v5, v13}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_10
    const/4 v14, 0x1

    if-ne v10, v14, :cond_11

    const-string v15, "22-16-"

    .line 170
    invoke-direct {v1, v13, v15}, Lcom/join/mgps/activity/PapaMainV3Fragment;->p2(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    const/16 v15, 0x5016

    .line 171
    invoke-direct {v1, v13, v15, v15}, Lcom/join/mgps/activity/PapaMainV3Fragment;->o2(Ljava/util/List;II)Ljava/util/List;

    move-result-object v13

    invoke-interface {v4, v14, v13}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_11
    const/4 v14, 0x2

    if-ne v10, v14, :cond_12

    const-string v15, "22-17-"

    .line 172
    invoke-direct {v1, v13, v15}, Lcom/join/mgps/activity/PapaMainV3Fragment;->p2(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    const/16 v15, 0x5017

    .line 173
    invoke-direct {v1, v13, v15, v15}, Lcom/join/mgps/activity/PapaMainV3Fragment;->o2(Ljava/util/List;II)Ljava/util/List;

    move-result-object v13

    invoke-interface {v4, v14, v13}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_12
    :goto_6
    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 174
    :cond_13
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getRanking_list()Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;

    move-result-object v10

    invoke-virtual {v10, v4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;->setList(Ljava/util/List;)V

    .line 175
    new-instance v4, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    const/16 v10, 0x20

    .line 176
    invoke-virtual {v4, v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 177
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getRanking_list()Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;

    move-result-object v10

    invoke-virtual {v4, v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 178
    invoke-virtual {v4, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 179
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 180
    new-instance v4, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 181
    invoke-virtual {v4, v11}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 182
    invoke-virtual {v4, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 183
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    new-instance v4, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v4}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 185
    invoke-virtual {v4, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 186
    invoke-virtual {v4, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 187
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v13, 0x7f071279

    invoke-virtual {v10, v13}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v4, v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 188
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 189
    :cond_14
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getRecommend_list()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_1b

    .line 190
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v10

    if-lez v10, :cond_1b

    .line 191
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_15
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/join/mgps/dto/PAPAHomeBeanV7$RecommendListDTO;

    .line 192
    invoke-virtual {v10}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RecommendListDTO;->getList()Ljava/util/List;

    move-result-object v13

    if-eqz v13, :cond_15

    invoke-virtual {v10}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RecommendListDTO;->getList()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    if-gtz v13, :cond_16

    goto :goto_7

    .line 193
    :cond_16
    new-instance v13, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v13}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 194
    invoke-virtual {v13, v8}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 195
    new-instance v14, Lcom/join/mgps/dto/PAPAItemTitle2;

    invoke-virtual {v10}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RecommendListDTO;->getTitle()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RecommendListDTO;->getSub_title()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v14, v15, v8}, Lcom/join/mgps/dto/PAPAItemTitle2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v13, v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 196
    invoke-virtual {v13, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 197
    iget-object v8, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v8, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 198
    invoke-virtual {v10}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RecommendListDTO;->getList()Ljava/util/List;

    move-result-object v8

    const/16 v13, 0xce

    invoke-direct {v1, v8, v13, v13}, Lcom/join/mgps/activity/PapaMainV3Fragment;->o2(Ljava/util/List;II)Ljava/util/List;

    move-result-object v8

    .line 199
    invoke-virtual {v10}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RecommendListDTO;->getTpl_type()Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    if-nez v13, :cond_18

    .line 200
    new-instance v10, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 201
    invoke-virtual {v10, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 202
    invoke-virtual {v10, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 203
    iget-object v13, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    invoke-virtual {v13, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v13

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-virtual {v10, v13}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 204
    iget-object v13, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v13, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 205
    invoke-direct {v1, v8}, Lcom/join/mgps/activity/PapaMainV3Fragment;->q2(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    const/4 v10, 0x0

    .line 206
    :goto_8
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v13

    if-ge v10, v13, :cond_17

    .line 207
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 208
    new-instance v14, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    const/16 v15, 0x22

    .line 209
    invoke-virtual {v14, v15}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 210
    invoke-virtual {v14, v13}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 211
    invoke-virtual {v14, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 212
    rem-int/lit8 v15, v10, 0x2

    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setMoreType2(Ljava/lang/String;)V

    .line 213
    iget-object v15, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v15, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->U:Ljava/util/List;

    invoke-interface {v14, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    .line 215
    :cond_17
    new-instance v8, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v8}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 216
    invoke-virtual {v8, v11}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 217
    invoke-virtual {v8, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 218
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 219
    new-instance v8, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v8}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 220
    invoke-virtual {v8, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 221
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v8, v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 222
    invoke-virtual {v8, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 223
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_9
    const/4 v13, 0x2

    goto/16 :goto_a

    .line 224
    :cond_18
    invoke-virtual {v10}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RecommendListDTO;->getTpl_type()Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    const/4 v14, 0x1

    if-ne v13, v14, :cond_19

    .line 225
    new-instance v10, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 226
    invoke-virtual {v10, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 227
    iget-object v13, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    invoke-virtual {v13, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v13

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-virtual {v10, v13}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 228
    invoke-virtual {v10, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 229
    iget-object v13, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v13, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 230
    invoke-direct {v1, v8}, Lcom/join/mgps/activity/PapaMainV3Fragment;->q2(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 231
    new-instance v10, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    const/16 v13, 0x23

    .line 232
    invoke-virtual {v10, v13}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 233
    invoke-virtual {v10, v8}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 234
    invoke-virtual {v10, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 235
    iget-object v13, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v13, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->U:Ljava/util/List;

    invoke-interface {v10, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 237
    new-instance v8, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v8}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 238
    invoke-virtual {v8, v11}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 239
    invoke-virtual {v8, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 240
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 241
    new-instance v8, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v8}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 242
    invoke-virtual {v8, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 243
    invoke-virtual {v8, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 244
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v8, v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 245
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 246
    :cond_19
    invoke-virtual {v10}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RecommendListDTO;->getTpl_type()Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    const/4 v13, 0x2

    if-ne v10, v13, :cond_1a

    .line 247
    new-instance v10, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 248
    invoke-virtual {v10, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 249
    invoke-virtual {v10, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 250
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    invoke-virtual {v14, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v14

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    invoke-virtual {v10, v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 251
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v14, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 252
    invoke-direct {v1, v8}, Lcom/join/mgps/activity/PapaMainV3Fragment;->q2(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 253
    new-instance v10, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    const/16 v14, 0x24

    .line 254
    invoke-virtual {v10, v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 255
    invoke-virtual {v10, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 256
    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v10, v14}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 257
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v14, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 258
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->U:Ljava/util/List;

    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 259
    new-instance v8, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v8}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 260
    invoke-virtual {v8, v11}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 261
    invoke-virtual {v8, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 262
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 263
    new-instance v8, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {v8}, Lcom/join/mgps/dto/MgpapaMainItemBean;-><init>()V

    .line 264
    invoke-virtual {v8, v12}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setShowtype(I)V

    .line 265
    invoke-virtual {v8, v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setPage(I)V

    .line 266
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v8, v10}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 267
    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1a
    :goto_a
    const/16 v8, 0x1f

    goto/16 :goto_7

    .line 268
    :cond_1b
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->C:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    invoke-virtual {v3, v4}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->R(Ljava/util/List;)V

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1c

    const/4 v2, 0x0

    .line 269
    invoke-direct {v1, v2, v5}, Lcom/join/mgps/activity/PapaMainV3Fragment;->w1(Landroidx/recyclerview/widget/RecyclerView;I)V

    goto :goto_b

    .line 270
    :cond_1c
    iget-object v2, v1, Lcom/join/mgps/Util/ImageHandler$AdFragment;->b:Lcom/join/mgps/Util/ImageHandler;

    if-eqz v2, :cond_1d

    .line 271
    new-instance v3, Lcom/join/mgps/activity/PapaMainV3Fragment$m;

    invoke-direct {v3, v1}, Lcom/join/mgps/activity/PapaMainV3Fragment$m;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V

    const-wide/16 v4, 0xc8

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_b

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 272
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1d
    :goto_b
    return-void
.end method

.method g1()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->q:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getCurrentView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/activity/SearchListActivity1_;->d1(Landroid/content/Context;)Lcom/join/mgps/activity/SearchListActivity1_$r;

    move-result-object v1

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/SearchListActivity1_$r;->e(Ljava/lang/String;)Lcom/join/mgps/activity/SearchListActivity1_$r;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/SearchListActivity1_$r;->d(Z)Lcom/join/mgps/activity/SearchListActivity1_$r;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/SearchListActivity1_$r;->a(I)Lcom/join/mgps/activity/SearchListActivity1_$r;

    move-result-object v1

    invoke-virtual {v1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->clickSearchButton:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lcom/papa/sim/statistic/ExtFrom;->home:Lcom/papa/sim/statistic/ExtFrom;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v0, v3}, Lcom/papa/sim/statistic/p;->l1(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goSearchHintActivity(Landroid/content/Context;)V

    :goto_0
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z1:Ljava/lang/String;

    return-void
.end method

.method h2(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/business/RecomDatabeanBusiness;",
            ">;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->y:Ljava/util/Map;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_c

    .line 2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_c

    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 4
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 5
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 8
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AppBeanMain;

    .line 9
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    .line 10
    :cond_3
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v3

    if-eqz v3, :cond_b

    .line 11
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v3

    .line 12
    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->y:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v5, 0x1

    const/4 v6, 0x5

    if-eqz v4, :cond_4

    .line 13
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v7

    if-ne v7, v6, :cond_4

    const/4 v7, 0x1

    goto :goto_1

    :cond_4
    const/4 v7, 0x0

    .line 14
    :goto_1
    iget-object v8, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->y:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v8, :cond_5

    .line 15
    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v9

    if-ne v9, v6, :cond_5

    const/4 v2, 0x1

    :cond_5
    if-eqz v2, :cond_6

    if-eqz v7, :cond_6

    .line 16
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 17
    invoke-virtual {v0, v4}, Lcom/join/mgps/business/RecomDatabeanBusiness;->d(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    :cond_6
    if-eqz v2, :cond_7

    .line 18
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRef_crc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 19
    invoke-virtual {v0, v8}, Lcom/join/mgps/business/RecomDatabeanBusiness;->d(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_0

    :cond_7
    if-eqz v7, :cond_8

    .line 20
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 21
    invoke-virtual {v0, v4}, Lcom/join/mgps/business/RecomDatabeanBusiness;->d(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_0

    .line 22
    :cond_8
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->y:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v2, :cond_9

    .line 23
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->y:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    :cond_9
    if-eqz v2, :cond_1

    .line 24
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRef_crc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 25
    :cond_a
    invoke-virtual {v0, v2}, Lcom/join/mgps/business/RecomDatabeanBusiness;->d(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_0

    .line 26
    :cond_b
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->y:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v2, :cond_1

    .line 27
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 28
    invoke-virtual {v0, v2}, Lcom/join/mgps/business/RecomDatabeanBusiness;->d(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_c
    return-void
.end method

.method i2()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->stopRefresh()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->stopLoadMore()V

    :cond_0
    return-void
.end method

.method k1()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->z:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->homeAllDataV3()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/PAPAHomeBeanV7;

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/PAPAHomeBeanV7;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    if-eqz v0, :cond_2

    const-string v2, "m1"

    const/4 v3, 0x0

    .line 4
    invoke-virtual {p0, v0, v2, v1, v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->f2(Lcom/join/mgps/dto/PAPAHomeBeanV7;Ljava/lang/String;IZ)V

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u663e\u793a\u4e3b\u754c\u9762   "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->showMain()V

    .line 7
    iput-boolean v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->w:Z

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getTop_channel()Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getTop_channel()Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->getBg_color()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->T:Ljava/lang/String;

    goto :goto_1

    :cond_1
    const-string v0, ""

    .line 10
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->T:Ljava/lang/String;

    .line 11
    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->G1()V

    goto :goto_2

    .line 12
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u6570\u636e\u5e93\u6ca1\u6709\u6570\u636e\u4e0d\u663e\u793a\u4e3b\u754c\u9762   "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 13
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->w:Z

    .line 14
    :goto_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->m1()V

    return-void
.end method

.method l1(Ljava/lang/String;I)V
    .locals 8
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u5f00\u59cb\u52a0\u8f7d\u6570\u636e   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->E1:Z

    const-string v2, "0"

    const/4 v3, 0x1

    if-nez v1, :cond_8

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->H:Z

    if-nez v1, :cond_8

    if-eqz v0, :cond_8

    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 4
    iput-boolean v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->H:Z

    .line 5
    iget v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->O:I

    if-ne v0, v3, :cond_0

    const-string v0, "refresh"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->showLoding()V

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 7
    :try_start_0
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    .line 8
    new-instance v4, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v4}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 9
    iget-object v5, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 10
    new-instance v5, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    invoke-direct {v5}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;-><init>()V

    .line 11
    iget-object v6, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->t:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setGameId(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v5, p2}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setPage(I)V

    .line 13
    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v5, v2}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setUid(I)V

    .line 14
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const-string v6, "HOME_FAST_ENTRY_FOR_PC"

    .line 15
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    invoke-virtual {v5, v2}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setPositionMark(Ljava/util/List;)V

    .line 17
    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 18
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v2

    invoke-virtual {v4}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v4

    invoke-interface {v2, v4}, Le2/i;->y1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object v2

    invoke-interface {v2}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v2

    invoke-virtual {v2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/ResponseModel;

    .line 19
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u5f00\u59cb\u52a0\u8f7d\u6570\u636e\u5b8c\u6210   "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    if-eqz v2, :cond_4

    .line 20
    invoke-virtual {v2}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v4

    const/16 v5, 0xc8

    if-ne v4, v5, :cond_4

    invoke-virtual {v2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 21
    invoke-virtual {v2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/PAPAHomeBeanV7;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    :try_start_1
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 23
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->W:Z

    .line 24
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->q1()V

    goto :goto_0

    .line 25
    :cond_1
    iput-boolean v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->W:Z

    add-int/lit8 v0, p2, 0x1

    .line 26
    iput v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->O:I

    :goto_0
    if-ne p2, v3, :cond_3

    .line 27
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->H1(Lcom/join/mgps/dto/PAPAHomeBeanV7;)V

    .line 28
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getTop_channel()Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 29
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7;->getTop_channel()Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->getBg_color()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->T:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const-string v0, ""

    .line 30
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->T:Ljava/lang/String;

    .line 31
    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->G1()V

    .line 32
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->N:Ljava/lang/String;

    iget v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->O:I

    invoke-virtual {p0, v0, v4}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l1(Ljava/lang/String;I)V

    .line 33
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->showMain()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v0, v2

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_3

    .line 34
    :cond_4
    :try_start_2
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->W:Z

    .line 35
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->q1()V

    .line 36
    iget-boolean v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->w:Z

    if-eqz v2, :cond_5

    if-ne p2, v3, :cond_5

    .line 37
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->showLodingFailed()V

    goto :goto_2

    .line 38
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->showMain()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    :goto_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->i2()V

    .line 40
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->H:Z

    if-eqz v0, :cond_a

    .line 41
    invoke-virtual {p0, v0, p1, p2, v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->f2(Lcom/join/mgps/dto/PAPAHomeBeanV7;Ljava/lang/String;IZ)V

    goto :goto_5

    :catchall_0
    move-exception v2

    move-object v7, v2

    move-object v2, v0

    move-object v0, v7

    goto :goto_4

    :catch_1
    move-exception v2

    move-object v7, v2

    move-object v2, v0

    move-object v0, v7

    .line 42
    :goto_3
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 43
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->W:Z

    .line 44
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->q1()V

    .line 45
    iget-boolean v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->w:Z

    if-eqz v0, :cond_6

    if-ne p2, v3, :cond_6

    .line 46
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->showLodingFailed()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 47
    :cond_6
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->i2()V

    .line 48
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->H:Z

    if-eqz v2, :cond_a

    .line 49
    invoke-virtual {p0, v2, p1, p2, v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->f2(Lcom/join/mgps/dto/PAPAHomeBeanV7;Ljava/lang/String;IZ)V

    goto :goto_5

    :catchall_1
    move-exception v0

    .line 50
    :goto_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->i2()V

    .line 51
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->H:Z

    if-eqz v2, :cond_7

    .line 52
    invoke-virtual {p0, v2, p1, p2, v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->f2(Lcom/join/mgps/dto/PAPAHomeBeanV7;Ljava/lang/String;IZ)V

    .line 53
    :cond_7
    throw v0

    .line 54
    :cond_8
    iget-boolean p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->w:Z

    if-eqz p1, :cond_9

    if-ne p2, v3, :cond_9

    iget-boolean p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->H:Z

    if-nez p1, :cond_9

    iget-boolean p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->E1:Z

    if-nez p1, :cond_9

    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_9

    .line 55
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->showLodingFailed()V

    .line 56
    :cond_9
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->i2()V

    :cond_a
    :goto_5
    return-void
.end method

.method l2(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    if-eqz p1, :cond_0

    packed-switch p2, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 1
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->A1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 2
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->C1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 3
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->z1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 4
    :pswitch_4
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->B1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

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

.method m1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "m1"

    const/4 v1, 0x1

    .line 1
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l1(Ljava/lang/String;I)V

    return-void
.end method

.method m2()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method public n1()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->E1()V

    return-void
.end method

.method o1()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->s:Lcom/google/android/material/appbar/AppBarLayout;

    .line 3
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;

    invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;->getBehavior()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v0

    .line 4
    instance-of v2, v0, Lcom/google/android/material/appbar/AppBarLayout$Behavior;

    if-eqz v2, :cond_0

    .line 5
    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout$Behavior;

    .line 6
    invoke-virtual {v0}, Lcom/google/android/material/appbar/AppBarLayout$Behavior;->getTopAndBottomOffset()I

    move-result v2

    if-eqz v2, :cond_0

    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/material/appbar/AppBarLayout$Behavior;->setTopAndBottomOffset(I)Z

    :cond_0
    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    instance-of p1, p1, Lcom/join/mgps/activity/MGMainActivity;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/MGMainActivity;

    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->I:Lcom/join/mgps/pref/f;

    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->e(Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->M:Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->R:Lcom/join/mgps/activity/MGMainActivity;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/activity/MGMainActivity;->getPositionNum()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Q:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->t()V

    .line 6
    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onEventMainThread(Lcom/join/mgps/event/n;)V
    .locals 6
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

    if-eq v1, v2, :cond_5

    const/4 v3, 0x3

    if-eq v1, v3, :cond_4

    const/4 v2, 0x5

    if-eq v1, v2, :cond_3

    const/4 v4, 0x6

    if-eq v1, v4, :cond_2

    const/4 v4, 0x7

    if-eq v1, v4, :cond_1

    const/16 v3, 0x8

    if-eq v1, v3, :cond_0

    const/16 v5, 0x30

    if-eq v1, v5, :cond_3

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/16 v1, 0x9

    .line 3
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l2(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 4
    :pswitch_1
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l2(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 5
    :pswitch_2
    invoke-virtual {p0, v0, v4}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l2(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->y:Ljava/util/Map;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 7
    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->k2()V

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l2(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {p0, v0, v4}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l2(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 10
    :cond_3
    :pswitch_3
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l2(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 11
    :cond_4
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l2(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    :cond_5
    const/4 v1, 0x1

    .line 12
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l2(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 13
    :cond_6
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "receiveStart: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onHiddenChanged(Z)V
    .locals 10

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onHiddenChanged(Z)V

    if-nez p1, :cond_2

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 3
    invoke-static {v0, v1}, Lcom/join/mgps/Util/y;->x(J)Ljava/lang/String;

    move-result-object p1

    const-string v2, "notify time"

    invoke-static {v2, p1}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-wide v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->G:J

    sub-long v4, v0, v2

    const-wide/32 v6, 0x36ee80

    const-wide/16 v8, 0x0

    cmp-long p1, v4, v6

    if-lez p1, :cond_0

    cmp-long p1, v2, v8

    if-eqz p1, :cond_0

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->G:J

    .line 6
    invoke-static {v0, v1}, Lcom/join/mgps/Util/y;->x(J)Ljava/lang/String;

    move-result-object p1

    const-string v0, "notify time lastUpdateTime"

    invoke-static {v0, p1}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->L:Z

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->N:Ljava/lang/String;

    iget v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->O:I

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l1(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    cmp-long p1, v2, v8

    if-nez p1, :cond_1

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->G:J

    .line 10
    invoke-static {v0, v1}, Lcom/join/mgps/Util/y;->x(J)Ljava/lang/String;

    move-result-object p1

    const-string v0, "notify time lastUpdateTime2"

    invoke-static {v0, p1}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->S0()V

    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->M1(Z)V

    .line 13
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->I0()V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Q:Lcom/join/android/app/component/video/g;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/join/android/app/component/video/g;->z()V

    goto :goto_1

    .line 15
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Q:Lcom/join/android/app/component/video/g;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/join/android/app/component/video/g;->u()V

    :cond_3
    :goto_1
    return-void
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->G1:Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->R:Lcom/join/mgps/activity/MGMainActivity;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/activity/MGMainActivity;->getPositionNum()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Q:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->u()V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->G1:Z

    .line 3
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    .line 4
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v1}, Lp1/f;->d()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->v:Ljava/util/List;

    if-eqz v1, :cond_0

    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->v:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 7
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->y:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 8
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->v:Ljava/util/List;

    .line 9
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->x:Ljava/util/List;

    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->h2(Ljava/util/List;)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->R:Lcom/join/mgps/activity/MGMainActivity;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/join/mgps/activity/MGMainActivity;->getPositionNum()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_2

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->Q:Lcom/join/android/app/component/video/g;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/join/android/app/component/video/g;->z()V

    .line 12
    :cond_2
    iget-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->S1:Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->D:Ljava/util/List;

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_3

    .line 13
    invoke-direct {p0, v3, v2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->w1(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 14
    :cond_3
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->M1(Z)V

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->I0()V

    .line 16
    invoke-direct {p0, v3, v2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->w1(Landroidx/recyclerview/widget/RecyclerView;I)V

    return-void
.end method

.method public onStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStart()V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070ec3

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->L1:I

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070ec2

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->M1:I

    return-void
.end method

.method public onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStop()V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    return-void
.end method

.method p1()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/android/app/common/manager/a;->h()Lcom/join/android/app/common/manager/a;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->e:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/join/android/app/common/manager/a;->j(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method q1()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->setNoMore()V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->d1()V

    return-void
.end method

.method r1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->C:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method relodingimag()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->showLoding()V

    const-string v0, "m1"

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->N:Ljava/lang/String;

    const/4 v1, 0x1

    .line 3
    iput v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->O:I

    .line 4
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->W:Z

    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l1(Ljava/lang/String;I)V

    return-void
.end method

.method s1()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "\u663e\u793a\u52a0\u8f7d\u4e2d"

    .line 1
    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->i:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "\u663e\u793a\u52a0\u8f7d\u5931\u8d25"

    .line 1
    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->j:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->p:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->i:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->p:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 10
    :cond_3
    iget-boolean v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->L:Z

    if-eqz v0, :cond_5

    .line 11
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->L:Z

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->h:Landroid/widget/TextView;

    if-eqz v0, :cond_4

    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->Y0()V

    :cond_5
    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method t1(Landroid/content/Intent;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "android.net.wifi.WIFI_STATE_CHANGED",
            "android.net.wifi.STATE_CHANGE",
            "android.net.conn.CONNECTIVITY_CHANGE",
            "android.net.wifi.SCAN_RESULTS"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->A1:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->W:Z

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->setNoMoreView(Z)V

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->u:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->A1:Z

    return-void
.end method

.method public u1()V
    .locals 0

    return-void
.end method

.method v1(Lcom/join/mgps/dto/CollectionBeanSub;)V
    .locals 2
    .param p1    # Lcom/join/mgps/dto/CollectionBeanSub;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
            value = "gameData"
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.paygamefinish",
            "com.join.android.app.mgsim.wufun.broadcast.refreshMyGame"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb2/e0;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/PurchasedListTable;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/db/tables/PurchasedListTable;

    invoke-direct {v0}, Lcom/join/mgps/db/tables/PurchasedListTable;-><init>()V

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/db/tables/PurchasedListTable;->setGame_id(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->C:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->isComputingLayout()Z

    move-result p1

    if-nez p1, :cond_2

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->C:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_2
    return-void
.end method
