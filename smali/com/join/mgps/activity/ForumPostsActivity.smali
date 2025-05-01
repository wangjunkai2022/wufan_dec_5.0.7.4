.class public Lcom/join/mgps/activity/ForumPostsActivity;
.super Lcom/BaseAppCompatActivity;
.source "ForumPostsActivity.java"

# interfaces
.implements Lcom/join/mgps/customview/ForumStickView$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/ForumPostsActivity$g0;,
        Lcom/join/mgps/activity/ForumPostsActivity$h0;,
        Lcom/join/mgps/activity/ForumPostsActivity$e0;,
        Lcom/join/mgps/activity/ForumPostsActivity$MediaCmd;,
        Lcom/join/mgps/activity/ForumPostsActivity$c0;,
        Lcom/join/mgps/activity/ForumPostsActivity$d0;,
        Lcom/join/mgps/activity/ForumPostsActivity$b0;,
        Lcom/join/mgps/activity/ForumPostsActivity$a0;,
        Lcom/join/mgps/activity/ForumPostsActivity$f0;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c05bc
.end annotation

.annotation build Lorg/androidannotations/annotations/WindowFeature;
    value = {
        0xa
    }
.end annotation


# static fields
.field public static final A3:Ljava/lang/String; = "key_mediacmd"

.field public static final B3:Ljava/lang/String; = "key_mediacmd_params"

.field private static final w3:Ljava/lang/String;

.field public static final x3:Ljava/lang/String;

.field public static final y3:I = 0x3

.field private static final z3:I = 0x9


# instance fields
.field A:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field A1:I

.field private final A2:Lcom/join/mgps/activity/posting/PostingActivity$m;

.field B:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field B1:Ljava/lang/String;

.field volatile B2:Z

.field C:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field C1:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/res/StringRes;
        resName = "net_excption"
    .end annotation
.end field

.field C2:Landroid/view/View$OnClickListener;

.field D:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field D1:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/res/StringRes;
        resName = "connect_server_excption"
    .end annotation
.end field

.field D2:Lcom/join/mgps/customview/WrapContentGridView;

.field E:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field E1:Lcom/join/mgps/rpc/i;

.field E2:Lcom/join/mgps/activity/ForumPostsActivity$b0;

.field F:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field F1:Lcom/join/mgps/dto/ExtBean;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field private F2:Lcom/join/mgps/dialog/v0;

.field G:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

.field private G2:I

.field H:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field H1:Lcom/join/mgps/dto/ForumBean$GameInfo;

.field H2:Z

.field I:Lcom/join/mgps/customview/ForumStickView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field I1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/adapter/ForumCommentAdapter$z;",
            ">;"
        }
    .end annotation
.end field

.field I2:Lcom/join/mgps/customview/b$d;

.field J:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field J1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/adapter/ForumPostsAdapter$e0;",
            ">;"
        }
    .end annotation
.end field

.field J2:Z

.field K:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private final K1:I

.field K2:Z

.field L:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private final L1:I

.field L2:Z

.field M:Lcom/join/mgps/adapter/ForumPostsAdapter;

.field private final M1:I

.field M2:Z

.field N:Lcom/join/mgps/adapter/ForumCommentAdapter;

.field private final N1:I

.field N2:I

.field O:Landroid/widget/LinearLayout;

.field private final O1:I

.field O2:I

.field P:Landroid/widget/LinearLayout;

.field private final P1:I

.field P2:Landroid/widget/FrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field Q:Landroid/widget/LinearLayout;

.field private final Q1:I

.field Q2:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field R:Landroid/view/View;

.field private final R1:I

.field R2:Lcom/join/android/app/component/video/MyVideoView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field S:Landroid/widget/LinearLayout;

.field private final S1:I

.field S2:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field T:Landroid/widget/LinearLayout;

.field private T1:I

.field T2:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field U:Landroid/widget/LinearLayout;

.field private U1:I

.field U2:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field V:Landroid/view/View;

.field private V1:I

.field V2:Lcom/join/android/app/component/video/MediaController;

.field W:Landroid/view/View;

.field private W1:Ljava/lang/String;

.field W2:I

.field X:Landroid/widget/ImageView;

.field private X1:I

.field X2:Ljava/lang/String;

.field Y:Landroid/widget/ImageView;

.field Y1:Lcom/join/android/app/component/video/c;

.field Y2:Ljava/lang/String;

.field Z:Landroid/widget/ImageView;

.field Z1:Lcom/join/mgps/adapter/ForumCommentAdapter$w;

.field Z2:Z

.field private a2:Lcom/join/mgps/dialog/v0;

.field a3:Z

.field b:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private b2:Lcom/join/mgps/dialog/w0;

.field b3:I

.field c:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private c2:I

.field c3:I

.field d:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private d2:I

.field d3:I

.field e:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private final e2:I

.field e3:Lcom/join/mgps/customview/o;

.field f:Lcom/join/mgps/customview/CustomLoadingView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private final f2:I

.field private f3:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field g:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private final g2:I

.field g3:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field h:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private final h2:I

.field h3:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field i:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private final i2:I

.field private i3:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field j:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private final j2:I

.field j3:I

.field k:Lcom/join/android/app/common/view/ClearEditText;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private final k2:I

.field k3:Z

.field l:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private l2:I

.field l3:Z

.field m:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m2:I

.field m3:Z

.field n:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private n2:Lnet/bither/util/b$e;

.field n3:Z

.field o:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private o2:Lcom/join/mgps/activity/ForumPostsActivity$a0;

.field o3:Z

.field p:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field p0:Landroid/widget/ImageView;

.field final p1:Ljava/lang/String;

.field p2:Lcom/join/mgps/rpc/b;

.field p3:Lcom/join/mgps/activity/ForumPostsActivity$e0;

.field q:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private q2:Lcom/join/mgps/customview/BaiduAdBannerRelativeLayout;

.field public q3:I

.field r:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private r2:Lcom/join/mgps/rpc/e;

.field public r3:I

.field s:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private s2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumBean$ForumGagType;",
            ">;"
        }
    .end annotation
.end field

.field public s3:I

.field t:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private t2:Z

.field public t3:Landroidx/recyclerview/widget/RecyclerView;

.field u:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field u2:Z

.field public u3:Lcom/join/mgps/recycler/a;

.field v:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field final v1:Ljava/lang/String;

.field v2:Z

.field v3:Lcom/join/mgps/activity/ForumPostsActivity$g0;

.field w:Lit/sephiroth/android/library/widget/HListView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field w2:Lcom/join/mgps/activity/ForumPostsActivity$f0;

.field x:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field x2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field y:Lcom/join/mgps/customview/VipView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field y2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecommendLabelTag;",
            ">;"
        }
    .end annotation
.end field

.field z:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private z2:Lcom/join/mgps/dialog/y1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lcom/join/mgps/activity/ForumPostsActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/join/mgps/activity/ForumPostsActivity;->w3:Ljava/lang/String;

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "key_forum_posts_bean"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/join/mgps/activity/ForumPostsActivity;->x3:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    const-string v0, "asc"

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->p1:Ljava/lang/String;

    const-string v1, "desc"

    .line 3
    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v1:Ljava/lang/String;

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->A1:I

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->B1:Ljava/lang/String;

    const/4 v0, 0x1

    .line 6
    iput v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->K1:I

    const/4 v2, 0x2

    .line 7
    iput v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->L1:I

    const/4 v2, 0x4

    .line 8
    iput v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->M1:I

    const/16 v2, 0x11

    .line 9
    iput v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->N1:I

    const/16 v3, 0x12

    .line 10
    iput v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->O1:I

    const/16 v4, 0x14

    .line 11
    iput v4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P1:I

    const/16 v5, 0x21

    .line 12
    iput v5, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Q1:I

    const/16 v5, 0x22

    .line 13
    iput v5, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R1:I

    const/16 v5, 0x24

    .line 14
    iput v5, p0, Lcom/join/mgps/activity/ForumPostsActivity;->S1:I

    .line 15
    iput v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->X1:I

    .line 16
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity$k;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Z1:Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    .line 17
    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->c2:I

    .line 18
    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    .line 19
    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->e2:I

    const/16 v0, 0x10

    .line 20
    iput v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f2:I

    const/16 v0, 0x20

    .line 21
    iput v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->g2:I

    .line 22
    iput v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h2:I

    .line 23
    iput v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->i2:I

    .line 24
    iput v4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->j2:I

    const/16 v0, 0x18

    .line 25
    iput v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->k2:I

    .line 26
    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l2:I

    .line 27
    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m2:I

    .line 28
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity$s;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->n2:Lnet/bither/util/b$e;

    .line 29
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->t2:Z

    .line 30
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->u2:Z

    .line 31
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v2:Z

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->y2:Ljava/util/List;

    .line 33
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity$e;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->A2:Lcom/join/mgps/activity/posting/PostingActivity$m;

    .line 34
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->B2:Z

    .line 35
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity$f;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->C2:Landroid/view/View$OnClickListener;

    .line 36
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->H2:Z

    .line 37
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity$l;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->I2:Lcom/join/mgps/customview/b$d;

    .line 38
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->J2:Z

    .line 39
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->K2:Z

    .line 40
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->L2:Z

    .line 41
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->M2:Z

    const/4 v0, -0x1

    .line 42
    iput v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->N2:I

    .line 43
    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->O2:I

    .line 44
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a3:Z

    .line 45
    iput v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b3:I

    .line 46
    iput v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->c3:I

    .line 47
    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->d3:I

    const/4 v0, 0x0

    .line 48
    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->e3:Lcom/join/mgps/customview/o;

    .line 49
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f3:Ljava/util/Map;

    .line 50
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->g3:Ljava/util/Map;

    .line 51
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h3:Ljava/util/Map;

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->i3:Ljava/util/List;

    .line 53
    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->j3:I

    .line 54
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->k3:Z

    .line 55
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l3:Z

    .line 56
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m3:Z

    .line 57
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->n3:Z

    .line 58
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o3:Z

    .line 59
    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->q3:I

    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->r3:I

    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->s3:I

    return-void
.end method

.method private E2(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->m1()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->D2:Lcom/join/mgps/customview/WrapContentGridView;

    if-eqz v0, :cond_0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setStretchMode(I)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->m2()V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->j2()V

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->o1()V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o2:Lcom/join/mgps/activity/ForumPostsActivity$a0;

    const v1, 0x7f1104ec

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o2:Lcom/join/mgps/activity/ForumPostsActivity$a0;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/view/View;->measure(II)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o2:Lcom/join/mgps/activity/ForumPostsActivity$a0;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;)V

    return-void
.end method

.method private I2()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G2:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    return-void

    .line 2
    :pswitch_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-static {p0, v0}, Lcom/join/mgps/Util/j0;->H1(Landroid/content/Context;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;)V

    return-void

    :pswitch_2
    const-string v0, "\u786e\u5b9a\u8981\u8bbe\u4e3a\u4e3e\u62a5\u5417\uff1f"

    goto :goto_0

    :pswitch_3
    const-string v0, "\u786e\u5b9a\u8981\u56de\u590d\u5417\uff1f"

    goto :goto_0

    .line 3
    :pswitch_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->R0()V

    return-void

    :pswitch_5
    const-string v0, "\u786e\u5b9a\u8981\u5220\u9664\u5417\uff1f"

    goto :goto_0

    .line 4
    :pswitch_6
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getBest()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-string v0, "\u786e\u5b9a\u8981\u53d6\u6d88\u7cbe\u534e\u5417\uff1f"

    goto :goto_0

    :cond_0
    const-string v0, "\u786e\u5b9a\u8981\u8bbe\u4e3a\u7cbe\u534e\u5417\uff1f"

    .line 5
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->F2:Lcom/join/mgps/dialog/v0;

    if-nez v1, :cond_1

    .line 6
    new-instance v1, Lcom/join/mgps/dialog/v0;

    invoke-direct {v1, p0}, Lcom/join/mgps/dialog/v0;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->F2:Lcom/join/mgps/dialog/v0;

    .line 7
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->F2:Lcom/join/mgps/dialog/v0;

    const-string v2, "\u786e\u5b9a"

    invoke-virtual {v1, v2}, Lcom/join/mgps/dialog/v0;->f(Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->F2:Lcom/join/mgps/dialog/v0;

    const-string v2, "\u53d6\u6d88"

    invoke-virtual {v1, v2}, Lcom/join/mgps/dialog/v0;->d(Ljava/lang/String;)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->F2:Lcom/join/mgps/dialog/v0;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lcom/join/mgps/dialog/v0;->b(I)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->F2:Lcom/join/mgps/dialog/v0;

    invoke-virtual {v1, v0}, Lcom/join/mgps/dialog/v0;->g(Ljava/lang/String;)Lcom/join/mgps/dialog/v0;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/ForumPostsActivity$i;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$i;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/v0;->c(Landroid/view/View$OnClickListener;)Lcom/join/mgps/dialog/v0;

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->F2:Lcom/join/mgps/dialog/v0;

    new-instance v1, Lcom/join/mgps/activity/ForumPostsActivity$j;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$j;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/v0;->e(Landroid/view/View$OnClickListener;)Lcom/join/mgps/dialog/v0;

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->F2:Lcom/join/mgps/dialog/v0;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->F2:Lcom/join/mgps/dialog/v0;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7f090528
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private L1()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->X2:Ljava/lang/String;

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Y2:Ljava/lang/String;

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->S2:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->S2:Lcom/facebook/drawee/view/SimpleDraweeView;

    sget-object v4, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->S2:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v2, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->U2:Landroid/widget/LinearLayout;

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V2:Lcom/join/android/app/component/video/MediaController;

    const/16 v4, 0x8

    if-nez v2, :cond_0

    .line 8
    new-instance v2, Lcom/join/android/app/component/video/MediaController;

    invoke-direct {v2, p0}, Lcom/join/android/app/component/video/MediaController;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V2:Lcom/join/android/app/component/video/MediaController;

    .line 9
    invoke-virtual {v2}, Lcom/join/android/app/component/video/MediaController;->q()V

    .line 10
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V2:Lcom/join/android/app/component/video/MediaController;

    invoke-virtual {v2}, Lcom/join/android/app/component/video/MediaController;->hide()V

    .line 11
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V2:Lcom/join/android/app/component/video/MediaController;

    invoke-virtual {v2, v4}, Landroid/widget/MediaController;->setVisibility(I)V

    .line 12
    :cond_0
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {v2}, Lcom/join/android/app/component/video/MyVideoView;->isPlaying()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 13
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    if-eqz v2, :cond_1

    .line 14
    invoke-virtual {v2}, Lcom/join/android/app/component/video/MyVideoView;->I()V

    .line 15
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 16
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V2:Lcom/join/android/app/component/video/MediaController;

    if-eqz v2, :cond_2

    .line 17
    invoke-virtual {v2, v4}, Landroid/widget/MediaController;->setVisibility(I)V

    .line 18
    :cond_2
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {v2, v3}, Landroid/view/SurfaceView;->setVisibility(I)V

    .line 19
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V2:Lcom/join/android/app/component/video/MediaController;

    iget-object v4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {v2, v4}, Lcom/join/android/app/component/video/MediaController;->setAnchorView(Landroid/view/View;)V

    .line 20
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V2:Lcom/join/android/app/component/video/MediaController;

    iget-object v4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {v2, v4}, Lcom/join/android/app/component/video/MediaController;->setMediaPlayer(Lcom/join/android/app/component/video/MediaController$e;)V

    .line 21
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    iget-object v4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V2:Lcom/join/android/app/component/video/MediaController;

    invoke-virtual {v2, v4}, Lcom/join/android/app/component/video/MyVideoView;->setMediaController(Lcom/join/android/app/component/video/MediaController;)V

    .line 22
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {v2}, Landroid/view/SurfaceView;->requestFocus()Z

    .line 23
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 24
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {v1}, Lcom/join/android/app/component/video/MyVideoView;->E()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {v1}, Lcom/join/android/app/component/video/MyVideoView;->isPlaying()Z

    move-result v1

    if-nez v1, :cond_3

    .line 25
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->resume()V

    const-string v0, "play a last video ..."

    .line 26
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    goto :goto_0

    .line 27
    :cond_3
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {v1, v0}, Lcom/join/android/app/component/video/MyVideoView;->setVideoPath(Ljava/lang/String;)V

    const-string v0, "play a new video ..."

    .line 28
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 29
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    new-instance v1, Lcom/join/mgps/activity/ForumPostsActivity$m;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$m;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/video/MyVideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 30
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    new-instance v1, Lcom/join/mgps/activity/ForumPostsActivity$n;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$n;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/video/MyVideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 31
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    new-instance v1, Lcom/join/mgps/activity/ForumPostsActivity$o;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$o;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/video/MyVideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 32
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    new-instance v1, Lcom/join/mgps/activity/ForumPostsActivity$p;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$p;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/video/MyVideoView;->setScreenChangedListener(Lcom/join/android/app/component/video/MyVideoView$h;)V

    .line 33
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->T2:Landroid/widget/ImageView;

    new-instance v1, Lcom/join/mgps/activity/ForumPostsActivity$q;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$q;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private M0(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_4

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 3
    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 6
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/join/mgps/Util/j0;->l0()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-static {v1}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 8
    :cond_3
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object p1

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p1, Lnet/bither/util/b;->c:Ljava/util/Hashtable;

    .line 9
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object p1

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p1, Lnet/bither/util/b;->b:Ljava/util/Hashtable;

    :cond_4
    :goto_1
    return-void
.end method

.method private N0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->e3:Lcom/join/mgps/customview/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->e3:Lcom/join/mgps/customview/o;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method private N2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method private S2(Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;)V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->e:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 2
    :try_start_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->y:Lcom/join/mgps/customview/VipView;

    iget v1, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->k:I

    iget v2, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->l:I

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/customview/VipView;->setVipData(II)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 4
    :goto_0
    iget-boolean v0, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->f:Z

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->F:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->F:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    :goto_1
    iget-boolean v0, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->i:Z

    if-eqz v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->D:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->D:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 10
    :goto_2
    iget-boolean v0, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->h:Z

    if-eqz v0, :cond_2

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->e:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f06002b

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->e:Landroid/widget/TextView;

    iget v3, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->k:I

    iget v4, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->l:I

    const v5, 0x7f060127

    invoke-static {p0, v0, v3, v4, v5}, Lcom/join/mgps/Util/UtilsMy;->A3(Landroid/content/Context;Landroid/widget/TextView;III)Z

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 15
    :goto_3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v3, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->c:Ljava/lang/String;

    invoke-static {v0, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->x(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x:Lcom/facebook/drawee/view/SimpleDraweeView;

    new-instance v3, Lcom/join/mgps/activity/ForumPostsActivity$c;

    invoke-direct {v3, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity$c;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;)V

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    iget-boolean v0, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->o:Z

    if-eqz v0, :cond_3

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->A:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_4

    .line 19
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->A:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 20
    :goto_4
    iget-object v0, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->p:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 21
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->B:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 22
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->B:Landroid/widget/TextView;

    iget-object v3, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->p:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 23
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->B:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_5
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/view/View;

    .line 24
    iget-object v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x:Lcom/facebook/drawee/view/SimpleDraweeView;

    aput-object v3, v0, v2

    iget-object v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->e:Landroid/widget/TextView;

    const/4 v4, 0x1

    aput-object v3, v0, v4

    invoke-static {v0}, Lcom/join/mgps/Util/j0;->S0([Landroid/view/View;)V

    new-array v0, v4, [Landroid/view/View;

    .line 25
    iget-object v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->y:Lcom/join/mgps/customview/VipView;

    aput-object v3, v0, v2

    invoke-static {v0}, Lcom/join/mgps/Util/j0;->U0([Landroid/view/View;)V

    .line 26
    iget-object v0, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->m:Ljava/lang/String;

    .line 27
    iget-object v3, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->n:Ljava/lang/String;

    .line 28
    iget-object v4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->z:Landroid/widget/TextView;

    if-eqz v4, :cond_7

    .line 29
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 30
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 31
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0804ac

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 33
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 34
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x7

    if-ne v1, v2, :cond_5

    const-string v1, "#"

    .line 35
    invoke-virtual {v3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_6

    :cond_5
    const-string v3, "#2fccdf"

    .line 36
    :goto_6
    new-instance v1, Landroid/graphics/LightingColorFilter;

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/graphics/LightingColorFilter;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 37
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_7

    .line 38
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 39
    :cond_7
    :goto_7
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget p1, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->b:I

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->w2(Landroid/view/View;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_8

    :catch_1
    move-exception p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_8
    return-void
.end method

.method private U0()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-static {p0, v0}, Lcom/join/mgps/Util/j0;->H1(Landroid/content/Context;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v0

    invoke-static {p0, v0}, Lcom/join/mgps/Util/j0;->G1(Landroid/content/Context;I)V
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

.method private Y0()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G2:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 2
    :sswitch_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->S0()V

    goto :goto_0

    .line 3
    :sswitch_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->R0()V

    goto :goto_0

    .line 4
    :sswitch_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->L0()V

    goto :goto_0

    .line 5
    :sswitch_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->Q0()V

    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f090528 -> :sswitch_3
        0x7f09052b -> :sswitch_2
        0x7f09052c -> :sswitch_1
        0x7f09052f -> :sswitch_0
    .end sparse-switch
.end method

.method private Z0()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentUtil;->getSplashActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentUtil;->setSplashActivity(Landroid/app/Activity;)V

    .line 4
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 5
    const-class v2, Lcom/join/mgps/activity/MGMainActivity_;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const/high16 v0, 0x4000000

    .line 6
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const/high16 v0, 0x20000000

    .line 7
    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 8
    invoke-virtual {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private Z1(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumBean$ForumGagType;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->s2:Ljava/util/List;

    if-nez v0, :cond_1

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->s2:Ljava/util/List;

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->s2:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->s2:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private accountBean(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    return-object p1
.end method

.method private c1(Landroid/content/Intent;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    const-string v0, "key_selected_images"

    .line 2
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method static synthetic f0(Lcom/join/mgps/activity/ForumPostsActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->p2()V

    return-void
.end method

.method private f2()V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->touristLogin()V

    goto :goto_0

    :cond_0
    const v0, 0x7f10013c

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->showMessage(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method static synthetic g0(Lcom/join/mgps/activity/ForumPostsActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->X1:I

    return p0
.end method

.method private g2()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->i3:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->i3:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    invoke-virtual {v2, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    const/4 v2, 0x4

    .line 4
    invoke-virtual {p0, v1, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->D1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/activity/ForumPostsActivity;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->X1:I

    return p1
.end method

.method static synthetic i0(Lcom/join/mgps/activity/ForumPostsActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->U0()V

    return-void
.end method

.method private i1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method private i2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getCommit()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getCommit()I

    move-result v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o:Landroid/widget/TextView;

    const-string v1, "0"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private isLogined(Landroid/content/Context;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->accountBean(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method static synthetic j0(Lcom/join/mgps/activity/ForumPostsActivity;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G2:I

    return p1
.end method

.method static synthetic k0(Lcom/join/mgps/activity/ForumPostsActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->I2()V

    return-void
.end method

.method private k1(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v1, 0x0

    .line 2
    aget v2, v0, v1

    const/4 v3, 0x1

    .line 3
    aget v0, v0, v3

    .line 4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    int-to-float v5, v2

    cmpg-float v4, v4, v5

    if-ltz v4, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v5

    add-int/2addr v2, v5

    int-to-float v2, v2

    cmpl-float v2, v4, v2

    if-gtz v2, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    int-to-float v4, v0

    cmpg-float v2, v2, v4

    if-ltz v2, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    add-int/2addr v0, p1

    int-to-float p1, v0

    cmpl-float p1, p2, p1

    if-gtz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method static synthetic l0(Lcom/join/mgps/activity/ForumPostsActivity;)Lcom/join/mgps/activity/ForumPostsActivity$a0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o2:Lcom/join/mgps/activity/ForumPostsActivity$a0;

    return-object p0
.end method

.method static synthetic m0(Lcom/join/mgps/activity/ForumPostsActivity;)Lcom/join/mgps/dialog/v0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->F2:Lcom/join/mgps/dialog/v0;

    return-object p0
.end method

.method private m1()V
    .locals 9

    .line 1
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0247

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/join/mgps/activity/ForumPostsActivity$a0;

    const/4 v7, -0x2

    const/4 v8, -0x2

    move-object v3, v1

    move-object v4, p0

    move-object v5, p0

    move-object v6, v0

    invoke-direct/range {v3 .. v8}, Lcom/join/mgps/activity/ForumPostsActivity$a0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;Landroid/content/Context;Landroid/view/View;II)V

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o2:Lcom/join/mgps/activity/ForumPostsActivity$a0;

    .line 3
    new-instance v2, Lcom/join/mgps/activity/ForumPostsActivity$h;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/ForumPostsActivity$h;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    const v1, 0x7f09070a

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/WrapContentGridView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->D2:Lcom/join/mgps/customview/WrapContentGridView;

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E2:Lcom/join/mgps/activity/ForumPostsActivity$b0;

    if-nez v0, :cond_0

    .line 6
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity$b0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity$b0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E2:Lcom/join/mgps/activity/ForumPostsActivity$b0;

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->D2:Lcom/join/mgps/customview/WrapContentGridView;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E2:Lcom/join/mgps/activity/ForumPostsActivity$b0;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 8
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->o1()V

    return-void
.end method

.method static synthetic n0(Lcom/join/mgps/activity/ForumPostsActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->Y0()V

    return-void
.end method

.method private n1()V
    .locals 9

    .line 1
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0246

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/join/mgps/activity/ForumPostsActivity$a0;

    const/4 v7, -0x1

    const/4 v8, -0x2

    move-object v3, v1

    move-object v4, p0

    move-object v5, p0

    move-object v6, v0

    invoke-direct/range {v3 .. v8}, Lcom/join/mgps/activity/ForumPostsActivity$a0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;Landroid/content/Context;Landroid/view/View;II)V

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o2:Lcom/join/mgps/activity/ForumPostsActivity$a0;

    .line 3
    new-instance v2, Lcom/join/mgps/activity/ForumPostsActivity$g;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/ForumPostsActivity$g;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    const v1, 0x7f090e56

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->O:Landroid/widget/LinearLayout;

    const v1, 0x7f090e5a

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P:Landroid/widget/LinearLayout;

    const v1, 0x7f090e5c

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Q:Landroid/widget/LinearLayout;

    const v1, 0x7f0911b0

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R:Landroid/view/View;

    const v1, 0x7f090e54

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->S:Landroid/widget/LinearLayout;

    const v1, 0x7f090e58

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->T:Landroid/widget/LinearLayout;

    const v1, 0x7f090e52

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->U:Landroid/widget/LinearLayout;

    const v1, 0x7f0901cb

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V:Landroid/view/View;

    const v1, 0x7f0901cc

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->W:Landroid/view/View;

    const v1, 0x7f090e57

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->X:Landroid/widget/ImageView;

    const v1, 0x7f090e5b

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Y:Landroid/widget/ImageView;

    const v1, 0x7f090e5d

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Z:Landroid/widget/ImageView;

    const v1, 0x7f090e53

    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->p0:Landroid/widget/ImageView;

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->O:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->C2:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->C2:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Q:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->C2:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->S:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->C2:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->T:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->C2:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->U:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->C2:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic o0(Lcom/join/mgps/activity/ForumPostsActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->Z0()V

    return-void
.end method

.method private o1()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E2:Lcom/join/mgps/activity/ForumPostsActivity$b0;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/activity/ForumPostsActivity$b0;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E2:Lcom/join/mgps/activity/ForumPostsActivity$b0;

    invoke-virtual {v0}, Lcom/join/mgps/activity/ForumPostsActivity$b0;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_1
    const/4 v0, 0x7

    new-array v1, v0, [I

    .line 4
    fill-array-data v1, :array_0

    const-string v2, "\u5206\u4eab"

    const-string v3, "\u4e3e\u62a5"

    const-string v4, "\u5220\u5e16"

    const-string v5, "\u52a0\u7cbe"

    const-string v6, "\u6536\u5f55\u81f3\u8bdd\u9898"

    const-string v7, "\u79fb\u9664\u8bdd\u9898"

    const-string v8, "\u7f6e\u9876"

    .line 5
    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_10

    .line 6
    aget v5, v1, v4

    .line 7
    aget-object v6, v2, v4

    .line 8
    new-instance v7, Lcom/join/mgps/activity/ForumPostsActivity$c0;

    invoke-direct {v7, p0}, Lcom/join/mgps/activity/ForumPostsActivity$c0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    const/4 v8, 0x1

    if-ne v5, v0, :cond_5

    .line 9
    iget-object v9, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v9}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_best_allow()Z

    move-result v9

    if-nez v9, :cond_2

    goto/16 :goto_4

    .line 10
    :cond_2
    iget-object v9, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v9}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getBest()I

    move-result v9

    if-ne v9, v8, :cond_3

    const-string v6, "\u53d6\u6d88\u7cbe\u534e"

    .line 11
    :cond_3
    iget-object v9, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v9}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getBest()I

    move-result v9

    if-ne v9, v8, :cond_4

    goto :goto_1

    :cond_4
    const/4 v8, 0x0

    :goto_1
    iput-boolean v8, v7, Lcom/join/mgps/activity/ForumPostsActivity$c0;->d:Z

    goto/16 :goto_3

    :cond_5
    const/4 v9, 0x6

    if-ne v5, v9, :cond_6

    .line 12
    iget-object v8, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_del_allow()Z

    move-result v8

    if-nez v8, :cond_f

    goto/16 :goto_4

    :cond_6
    const/16 v9, 0x8

    if-ne v5, v9, :cond_7

    .line 13
    iget-object v8, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_add_tag_allow()Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_4

    :cond_7
    const/16 v9, 0x9

    if-ne v5, v9, :cond_8

    .line 14
    iget-object v8, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_remove_tag_allow()Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_4

    :cond_8
    const/16 v9, 0xa

    if-ne v5, v9, :cond_c

    .line 15
    iget-object v9, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v9}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_first()Z

    move-result v9

    if-nez v9, :cond_9

    goto :goto_4

    .line 16
    :cond_9
    iget-object v9, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v9}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getFirst()I

    move-result v9

    if-ne v9, v8, :cond_a

    const-string v6, "\u53d6\u6d88\u7f6e\u9876"

    .line 17
    :cond_a
    iget-object v9, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v9}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getFirst()I

    move-result v9

    if-ne v9, v8, :cond_b

    goto :goto_2

    :cond_b
    const/4 v8, 0x0

    :goto_2
    iput-boolean v8, v7, Lcom/join/mgps/activity/ForumPostsActivity$c0;->e:Z

    goto :goto_3

    :cond_c
    if-ne v5, v8, :cond_d

    .line 18
    iget-object v8, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_favorite()Z

    move-result v8

    iput-boolean v8, v7, Lcom/join/mgps/activity/ForumPostsActivity$c0;->c:Z

    goto :goto_3

    :cond_d
    const/4 v8, 0x3

    if-ne v5, v8, :cond_e

    .line 19
    iget-object v8, p0, Lcom/join/mgps/activity/ForumPostsActivity;->B1:Ljava/lang/String;

    const-string v9, "asc"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_4

    :cond_e
    const/4 v8, 0x4

    if-ne v5, v8, :cond_f

    .line 20
    iget-object v8, p0, Lcom/join/mgps/activity/ForumPostsActivity;->B1:Ljava/lang/String;

    const-string v9, "desc"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_4

    .line 21
    :cond_f
    :goto_3
    iput v5, v7, Lcom/join/mgps/activity/ForumPostsActivity$c0;->a:I

    .line 22
    iput-object v6, v7, Lcom/join/mgps/activity/ForumPostsActivity$c0;->b:Ljava/lang/String;

    .line 23
    iget-object v5, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E2:Lcom/join/mgps/activity/ForumPostsActivity$b0;

    invoke-virtual {v5, v7}, Lcom/join/mgps/activity/ForumPostsActivity$b0;->a(Lcom/join/mgps/activity/ForumPostsActivity$c0;)Ljava/util/List;

    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 24
    :cond_10
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E2:Lcom/join/mgps/activity/ForumPostsActivity$b0;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    nop

    :array_0
    .array-data 4
        0x2
        0x5
        0x6
        0x7
        0x8
        0x9
        0xa
    .end array-data
.end method

.method static synthetic p0(Lcom/join/mgps/activity/ForumPostsActivity;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->U1:I

    return p1
.end method

.method private p1()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x2:Ljava/util/List;

    .line 2
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity$f0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity$f0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->w2:Lcom/join/mgps/activity/ForumPostsActivity$f0;

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x2:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/ForumPostsActivity$f0;->c(Ljava/util/List;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->w2:Lcom/join/mgps/activity/ForumPostsActivity$f0;

    new-instance v1, Lcom/join/mgps/activity/ForumPostsActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$b;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/ForumPostsActivity$f0;->f(Lcom/join/mgps/activity/ForumPostsActivity$f0$c;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->w:Lit/sephiroth/android/library/widget/HListView;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->w2:Lcom/join/mgps/activity/ForumPostsActivity$f0;

    invoke-virtual {v0, v1}, Lit/sephiroth/android/library/widget/HListView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method private p2()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_praise()Z

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPraise()I

    move-result v1

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    if-eqz v0, :cond_0

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    :goto_0
    invoke-virtual {v2, v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setPraise(I)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setIs_praise(Z)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_praise()Z

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPraise()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->y1(ZI)V

    return-void
.end method

.method static synthetic q0(Lcom/join/mgps/activity/ForumPostsActivity;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V1:I

    return p1
.end method

.method private q1()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->l2()V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v2, Lcom/join/mgps/activity/ForumPostsActivity;->x3:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 4
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v3

    const-class v4, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Class;

    invoke-virtual {v3, v4, v5}, Lcom/join/android/app/common/utils/JsonMapper;->createCollectionType(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    .line 6
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    if-nez v0, :cond_1

    .line 7
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->Z0()V

    return-void

    .line 8
    :cond_1
    new-instance v0, Lcom/join/android/app/component/video/c;

    const-string v2, "ForumPostsVideoHelper"

    invoke-direct {v0, p0, v2}, Lcom/join/android/app/component/video/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Y1:Lcom/join/android/app/component/video/c;

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    sget v2, Lcom/join/mgps/Util/j0;->e:I

    invoke-virtual {v0, v2}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->setPreLoadCount(I)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    new-instance v2, Lcom/join/mgps/activity/ForumPostsActivity$t;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/ForumPostsActivity$t;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    invoke-virtual {v0, v2}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->setLoadingListener(Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView$g;)V

    .line 12
    new-instance v0, Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-direct {v0, p0}, Lcom/join/mgps/adapter/ForumCommentAdapter;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->N:Lcom/join/mgps/adapter/ForumCommentAdapter;

    .line 13
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Z1:Lcom/join/mgps/adapter/ForumCommentAdapter$w;

    invoke-virtual {v0, v2}, Lcom/join/mgps/adapter/ForumCommentAdapter;->T(Lcom/join/mgps/adapter/ForumCommentAdapter$w;)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->N:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-virtual {v0, v2}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->J1:Ljava/util/List;

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->I1:Ljava/util/List;

    .line 17
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter;

    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Y1:Lcom/join/android/app/component/video/c;

    invoke-direct {v0, p0, v2}, Lcom/join/mgps/adapter/ForumPostsAdapter;-><init>(Landroid/content/Context;Lcom/join/android/app/component/video/c;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->M:Lcom/join/mgps/adapter/ForumPostsAdapter;

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->K:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->K:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->M:Lcom/join/mgps/adapter/ForumPostsAdapter;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->I:Lcom/join/mgps/customview/ForumStickView;

    invoke-virtual {v0, p0}, Lcom/join/mgps/customview/ForumStickView;->setForumStickViewListener(Lcom/join/mgps/customview/ForumStickView$e;)V

    .line 21
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->H:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;

    new-instance v2, Lcom/join/mgps/activity/ForumPostsActivity$u;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/ForumPostsActivity$u;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    invoke-virtual {v0, v2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->setOnVerticalScrollChangeListener(Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$f;)V

    .line 22
    new-instance v0, Lcom/join/mgps/dialog/w0;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/w0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b2:Lcom/join/mgps/dialog/w0;

    .line 23
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    .line 24
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/KeyboardListenLayout;

    new-instance v2, Lcom/join/mgps/activity/ForumPostsActivity$v;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/ForumPostsActivity$v;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/KeyboardListenLayout;->setOnSoftKeyboardListener(Lcom/join/mgps/customview/KeyboardListenLayout$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 26
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->k:Lcom/join/android/app/common/view/ClearEditText;

    new-instance v2, Lcom/join/mgps/activity/ForumPostsActivity$w;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/ForumPostsActivity$w;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 27
    new-instance v0, Landroid/text/SpannableString;

    const-string v2, "\u6bcf\u6b21\u6700\u591a\u53ef\u4ee5\u5206\u4eab9\u5f20\u56fe"

    invoke-direct {v0, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 28
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    const-string v3, "#808080"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v3, 0x9

    const/16 v4, 0x21

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 29
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->r:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->p1()V

    .line 31
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->m1()V

    return-void
.end method

.method static synthetic r0(Lcom/join/mgps/activity/ForumPostsActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->T1:I

    return p0
.end method

.method private receiveDelete(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->i3:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

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
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f3:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    :cond_1
    const/4 v0, 0x2

    .line 7
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->D1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
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

.method private receiveError(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f3:Ljava/util/Map;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 3
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const/4 v0, 0x3

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->D1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
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

.method private receiveStart(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->i3:Ljava/util/List;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->B4(Ljava/util/List;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f3:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->i3:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f3:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->D1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    return-void
.end method

.method private receiveSuccess(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f3:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->i3:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f3:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f3:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v0, :cond_2

    return-void

    .line 6
    :cond_2
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 7
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCfg_ver()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSource_ver()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSource_ver(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setGameZipPath(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->D1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    :cond_3
    :goto_0
    return-void
.end method

.method static synthetic s0(Lcom/join/mgps/activity/ForumPostsActivity;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->W1:Ljava/lang/String;

    return-object p0
.end method

.method private s2()V
    .locals 7

    .line 1
    invoke-direct {p0, p0}, Lcom/join/mgps/activity/ForumPostsActivity;->isLogined(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f10013d

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->showMessage(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->T2()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, -0x1

    .line 4
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->B2()V

    return-void

    .line 6
    :cond_1
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->U1:I

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->W1:Ljava/lang/String;

    iget v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V1:I

    invoke-static {p0, v0, v1, v2}, Lcom/join/mgps/Util/j0;->Y(Landroid/content/Context;ILjava/lang/String;I)Lcom/join/mgps/dto/ForumRequestBean$ForumCommentReplyRequestBean;

    move-result-object v0

    const-string v1, ""

    .line 7
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ForumRequestBean$ForumCommentReplyRequestBean;->setDevice_id(Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumRequestBean$ForumCommentReplyRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/join/mgps/rpc/i;->J(Ljava/util/Map;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_2

    .line 9
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V

    return-void

    .line 10
    :cond_2
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v3

    const/16 v4, 0x2c2

    if-ne v3, v4, :cond_3

    const v0, 0x7f100490

    .line 11
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 12
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->B2()V

    return-void

    .line 13
    :cond_3
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ForumData$ForumCommentReplyReplyData;

    .line 14
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyReplyData;->isResult()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v2, 0x2

    .line 15
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V

    .line 16
    new-instance v2, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;

    invoke-direct {v2}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;-><init>()V

    .line 17
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->T(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v3

    .line 18
    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->setUid(I)V

    .line 19
    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getNickname()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->setNickname(Ljava/lang/String;)V

    .line 20
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumRequestBean$ForumCommentReplyRequestBean;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->setMessage(Ljava/lang/String;)V

    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    div-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->setAdd_time(J)V

    .line 22
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V1:I

    invoke-virtual {v2, v0}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->setRrid(I)V

    .line 23
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V1:I

    if-eqz v0, :cond_7

    .line 24
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyReplyData;->getRid()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->setRid(I)V

    .line 25
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->W1(Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;)V

    .line 26
    sget-object v0, Lcom/join/mgps/customview/RewardType;->REPLY_POST:Lcom/join/mgps/customview/RewardType;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyReplyData;->getReward_money()I

    move-result v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyReplyData;->getReward_exp()I

    move-result v1

    invoke-virtual {p0, v0, v2, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->K2(Lcom/join/mgps/customview/RewardType;II)V

    goto :goto_0

    .line 27
    :cond_4
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyReplyData;->getError_type()I

    move-result v0

    if-ne v0, v2, :cond_5

    .line 28
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->P0()V

    .line 29
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyReplyData;->getError_type()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->H2(I)V

    return-void

    .line 30
    :cond_5
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyReplyData;->getMsg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 31
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->P0()V

    .line 32
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyReplyData;->getMsg()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 33
    :cond_6
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V

    :cond_7
    :goto_0
    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/activity/ForumPostsActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->c2:I

    return p0
.end method

.method private t2()V
    .locals 7

    .line 1
    invoke-direct {p0, p0}, Lcom/join/mgps/activity/ForumPostsActivity;->isLogined(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f10013d

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->showMessage(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->T2()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, -0x1

    .line 4
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->B2()V

    return-void

    .line 6
    :cond_1
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->U1:I

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->W1:Ljava/lang/String;

    iget v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V1:I

    invoke-static {p0, v0, v1, v2}, Lcom/join/mgps/Util/j0;->Y(Landroid/content/Context;ILjava/lang/String;I)Lcom/join/mgps/dto/ForumRequestBean$ForumCommentReplyRequestBean;

    move-result-object v0

    const-string v1, ""

    .line 7
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ForumRequestBean$ForumCommentReplyRequestBean;->setDevice_id(Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumRequestBean$ForumCommentReplyRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/join/mgps/rpc/i;->l0(Ljava/util/Map;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_2

    .line 9
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V

    return-void

    .line 10
    :cond_2
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v3

    const/16 v4, 0x2c2

    if-ne v3, v4, :cond_3

    const v0, 0x7f100490

    .line 11
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 12
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->B2()V

    return-void

    .line 13
    :cond_3
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ForumData$ForumCommentReplyData;

    .line 14
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyData;->isResult()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v2, 0x2

    .line 15
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V

    .line 16
    new-instance v2, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;

    invoke-direct {v2}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;-><init>()V

    .line 17
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->T(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v3

    .line 18
    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->setUid(I)V

    .line 19
    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getNickname()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->setNickname(Ljava/lang/String;)V

    .line 20
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumRequestBean$ForumCommentReplyRequestBean;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->setMessage(Ljava/lang/String;)V

    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    div-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->setAdd_time(J)V

    .line 22
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V1:I

    invoke-virtual {v2, v0}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->setRrid(I)V

    .line 23
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyData;->getRid()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->setRid(I)V

    .line 24
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->V1(Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;)V

    .line 25
    sget-object v0, Lcom/join/mgps/customview/RewardType;->REPLY_POST:Lcom/join/mgps/customview/RewardType;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyData;->getReward_money()I

    move-result v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyData;->getReward_exp()I

    move-result v1

    invoke-virtual {p0, v0, v2, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->K2(Lcom/join/mgps/customview/RewardType;II)V

    goto :goto_0

    .line 26
    :cond_4
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyData;->getError_type()I

    move-result v0

    if-ne v0, v2, :cond_5

    .line 27
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->P0()V

    .line 28
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyData;->getError_type()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->H2(I)V

    return-void

    .line 29
    :cond_5
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyData;->getMsg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 30
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->P0()V

    .line 31
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyData;->getMsg()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 32
    :cond_6
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V

    :goto_0
    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/activity/ForumPostsActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    return p0
.end method

.method private u1()V
    .locals 1

    const/16 v0, 0x12

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->E0(I)V

    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/activity/ForumPostsActivity;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->w1(Z)V

    return-void
.end method

.method static synthetic w0(Lcom/join/mgps/activity/ForumPostsActivity;)Lcom/join/mgps/dialog/v0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a2:Lcom/join/mgps/dialog/v0;

    return-object p0
.end method

.method private w1(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->E0(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->reset()V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->u1()V

    .line 4
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, p1, v0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->v1(ZZI)V

    goto :goto_0

    :cond_0
    const p1, 0x7f100299

    .line 6
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    const/16 p1, 0x11

    .line 7
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->E0(I)V

    :goto_0
    return-void
.end method

.method private w2(Landroid/view/View;I)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity$d;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/activity/ForumPostsActivity$d;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method A0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->Y0(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u7528\u6237\u672a\u767b\u5f55\uff0c\u8bf7\u767b\u5f55"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->L0(Landroid/content/Context;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->T2()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, -0x1

    .line 5
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->B2()V

    return-void

    :cond_1
    const v0, 0x7f010077

    .line 7
    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->startAnimation(Landroid/view/animation/Animation;)V

    .line 9
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->p2()V

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->Q1()V

    return-void
.end method

.method A1()V
    .locals 0

    return-void
.end method

.method A2(Lcom/join/mgps/dto/ForumBean$ForumPostsBean;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    const v0, 0x7f0901d2

    .line 1
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 2
    invoke-static {p0}, Lcom/join/mgps/customview/c;->z(Landroid/content/Context;)Lcom/join/mgps/customview/c;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->I2:Lcom/join/mgps/customview/b$d;

    invoke-virtual {v1, v2}, Lcom/join/mgps/customview/b;->m(Lcom/join/mgps/customview/b$d;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    .line 4
    invoke-virtual {v1, v0, v2}, Lcom/join/mgps/customview/b;->p(Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method B0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->k:Lcom/join/android/app/common/view/ClearEditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->W1:Ljava/lang/String;

    .line 2
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "\u56de\u590d\u5185\u5bb9\u4e0d\u80fd\u4e3a\u7a7a"

    .line 3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    return-void

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getNickname()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getAccount()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getNickname()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getAccount()Ljava/lang/String;

    move-result-object v0

    const-string v1, "pa"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->X1:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->q2()V

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->r2()V

    goto :goto_0

    :cond_3
    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 9
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->r2()V

    :cond_4
    :goto_0
    return-void

    .line 10
    :cond_5
    :goto_1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/IntentUtil;->goChangeNickname(Landroid/content/Context;)V

    return-void
.end method

.method B1(Ljava/lang/String;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method B2()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/a0;->m(Landroid/content/Context;)V

    return-void
.end method

.method C0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    const v0, 0x7f010077

    .line 1
    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->startAnimation(Landroid/view/animation/Animation;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->k2()V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->R0()V

    return-void
.end method

.method C1(Ljava/lang/String;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method C2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->t:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->u:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->hideSystemKeyBoard(Landroid/view/View;)V

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v2:Z

    return-void
.end method

.method public D0(Z)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method D1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    return-void
.end method

.method D2()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->t:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->u:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->hideSystemKeyBoard(Landroid/view/View;)V

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v2:Z

    return-void
.end method

.method E0(I)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l2:I

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    if-ne p1, v1, :cond_1

    .line 2
    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l2:I

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f:Lcom/join/mgps/customview/CustomLoadingView;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/CustomLoadingView;->l(I)V

    goto/16 :goto_1

    :cond_1
    if-nez p1, :cond_2

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l2:I

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f:Lcom/join/mgps/customview/CustomLoadingView;

    invoke-virtual {p1}, Lcom/join/mgps/customview/CustomLoadingView;->o()V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f:Lcom/join/mgps/customview/CustomLoadingView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/CustomLoadingView;->l(I)V

    goto/16 :goto_1

    :cond_2
    or-int/2addr p1, v0

    .line 7
    iput p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l2:I

    const/16 p1, 0x1f

    const/16 v0, 0x1a

    const/16 v1, 0x16

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f:Lcom/join/mgps/customview/CustomLoadingView;

    new-instance v3, Lcom/join/mgps/activity/ForumPostsActivity$x;

    invoke-direct {v3, p0, v2}, Lcom/join/mgps/activity/ForumPostsActivity$x;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;Lcom/join/mgps/customview/CustomLoadingView;)V

    invoke-virtual {v2, v3}, Lcom/join/mgps/customview/CustomLoadingView;->setListener(Lcom/join/mgps/customview/CustomLoadingView$e;)V

    const/16 v2, -0xb

    .line 9
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->G0(I)Z

    move-result v2

    const/16 v3, 0x9

    const/16 v4, 0x10

    if-eqz v2, :cond_3

    .line 10
    iput v4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l2:I

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f:Lcom/join/mgps/customview/CustomLoadingView;

    invoke-virtual {p1, v3}, Lcom/join/mgps/customview/CustomLoadingView;->l(I)V

    goto :goto_1

    .line 12
    :cond_3
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->G0(I)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 13
    iput v4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l2:I

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f:Lcom/join/mgps/customview/CustomLoadingView;

    const-string v0, "\u8be5\u8d34\u5df2\u7ecf\u5220\u9664~"

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/CustomLoadingView;->setFailedMsg(Ljava/lang/String;)V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f:Lcom/join/mgps/customview/CustomLoadingView;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/CustomLoadingView;->l(I)V

    goto :goto_1

    .line 16
    :cond_4
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->G0(I)Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->G0(I)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    const/16 p1, 0x11

    .line 17
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->G0(I)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 18
    iput v4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l2:I

    .line 19
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f:Lcom/join/mgps/customview/CustomLoadingView;

    invoke-virtual {p1, v3}, Lcom/join/mgps/customview/CustomLoadingView;->l(I)V

    goto :goto_1

    .line 20
    :cond_6
    :goto_0
    iput v4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l2:I

    .line 21
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f:Lcom/join/mgps/customview/CustomLoadingView;

    const-string v0, "\u52a0\u8f7d\u5931\u8d25\uff0c\u518d\u8bd5\u8bd5\u5427~"

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/CustomLoadingView;->setFailedMsg(Ljava/lang/String;)V

    .line 22
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f:Lcom/join/mgps/customview/CustomLoadingView;

    invoke-virtual {p1, v4}, Lcom/join/mgps/customview/CustomLoadingView;->l(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_7
    :goto_1
    return-void
.end method

.method E1(II)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P2:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getTop()I

    move-result p1

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P2:Landroid/widget/FrameLayout;

    neg-int p1, p1

    int-to-float p1, p1

    invoke-static {p2, p1}, Landroidx/core/view/ViewCompat;->setTranslationY(Landroid/view/View;F)V

    return-void

    .line 4
    :cond_1
    iput p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b3:I

    .line 5
    iput p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->c3:I

    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/String;

    const-string p2, "offsetContainer"

    aput-object p2, p1, v3

    .line 6
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "mTop="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b3:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    aput-object p2, p1, v1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "mOffsetY="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->c3:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    aput-object p2, p1, v2

    invoke-static {p1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P2:Landroid/widget/FrameLayout;

    iget p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->c3:I

    int-to-float p2, p2

    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->setTranslationY(Landroid/view/View;F)V

    return-void
.end method

.method F0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->u2:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v2:Z

    if-nez v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->t2:Z

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    :cond_1
    return-void
.end method

.method F1()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f090950
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o2:Lcom/join/mgps/activity/ForumPostsActivity$a0;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->m1()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o2:Lcom/join/mgps/activity/ForumPostsActivity$a0;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o2:Lcom/join/mgps/activity/ForumPostsActivity$a0;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    return-void

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->J:Landroid/widget/ImageView;

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->E2(Landroid/view/View;)V

    return-void
.end method

.method F2()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method G0(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l2:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method G1(Lcom/join/mgps/dto/CollectionBeanSub;)V
    .locals 0
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

    return-void
.end method

.method declared-synchronized G2(I)V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->s2:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->s2:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->p3:Lcom/join/mgps/activity/ForumPostsActivity$e0;

    if-nez v1, :cond_1

    .line 6
    new-instance v1, Lcom/join/mgps/activity/ForumPostsActivity$e0;

    invoke-direct {v1, p0, p0}, Lcom/join/mgps/activity/ForumPostsActivity$e0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;Landroid/content/Context;)V

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->p3:Lcom/join/mgps/activity/ForumPostsActivity$e0;

    .line 7
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->p3:Lcom/join/mgps/activity/ForumPostsActivity$e0;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/join/mgps/activity/ForumPostsActivity$e0;->a(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->p3:Lcom/join/mgps/activity/ForumPostsActivity$e0;

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/ForumPostsActivity$e0;->b(Ljava/util/List;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->p3:Lcom/join/mgps/activity/ForumPostsActivity$e0;

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_2

    monitor-exit p0

    return-void

    .line 10
    :cond_2
    :try_start_1
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->p3:Lcom/join/mgps/activity/ForumPostsActivity$e0;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    monitor-exit p0

    return-void

    .line 12
    :cond_3
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public H()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->M1()V

    return-void
.end method

.method H0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->s:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->W1:Ljava/lang/String;

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v2

    iput v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->T1:I

    const/4 v2, -0x1

    .line 4
    iput v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->U1:I

    .line 5
    iput v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V1:I

    const/4 v2, 0x1

    .line 6
    iput v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->X1:I

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l:Landroid/widget/Button;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m:Landroid/widget/Button;

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 9
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->n:Landroid/widget/Button;

    invoke-virtual {v2, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->k:Lcom/join/android/app/common/view/ClearEditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->k:Lcom/join/android/app/common/view/ClearEditText;

    const-string v1, "\u6dfb\u52a0\u8bc4\u8bba"

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->k:Lcom/join/android/app/common/view/ClearEditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->clearFocus()V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->k:Lcom/join/android/app/common/view/ClearEditText;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->hideSystemKeyBoard(Landroid/view/View;)V

    .line 14
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->i2()V

    return-void
.end method

.method H1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f091166
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->H:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->I:Lcom/join/mgps/customview/ForumStickView;

    invoke-virtual {v0, v1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->c0(Landroid/view/View;)V

    return-void
.end method

.method H2(I)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method I0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->I1:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Ljava/lang/System;->gc()V

    return-void
.end method

.method I1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0}, Lcom/join/android/app/component/video/MyVideoView;->isPlaying()Z

    move-result v0

    and-int/2addr v0, v2

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {v0}, Lcom/join/android/app/component/video/MyVideoView;->pause()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->T2:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method J0(I)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "\u8bc4\u8bba\u5220\u9664\u5931\u8d25"

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 2
    invoke-static {p0, p1}, Lcom/join/mgps/Util/j0;->W(Landroid/content/Context;I)Lcom/join/mgps/dto/ForumRequestBean$ForumCommentDeleteRequestBean;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const-string v2, ""

    .line 3
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/ForumRequestBean$ForumCommentDeleteRequestBean;->setDevice_id(Ljava/lang/String;)V

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumRequestBean$ForumCommentDeleteRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/join/mgps/rpc/i;->d0(Ljava/util/Map;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v2

    :cond_0
    if-nez v2, :cond_2

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->Y0(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 6
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->L0(Landroid/content/Context;)V

    .line 7
    :cond_1
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    return-void

    .line 9
    :cond_2
    :try_start_1
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ForumData$ForumCommentDeleteData;

    .line 10
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentDeleteData;->isResult()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "\u8bc4\u8bba\u5df2\u5220\u9664"

    .line 11
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 12
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->S1(I)V

    goto :goto_0

    .line 13
    :cond_3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_4
    const p1, 0x7f100299

    .line 14
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 16
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 17
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    .line 18
    :goto_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    .line 19
    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method J1(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->X2:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {v0}, Lcom/join/android/app/component/video/MyVideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->I1()V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {v0}, Lcom/join/android/app/component/video/MyVideoView;->E()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->X2:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/video/MyVideoView;->seekTo(I)V

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->resume()V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {v0}, Lcom/join/android/app/component/video/MyVideoView;->G()V

    .line 9
    :cond_2
    :goto_0
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->X2:Ljava/lang/String;

    .line 10
    iput-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Y2:Ljava/lang/String;

    .line 11
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 12
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->O2()V

    return-void

    .line 13
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->S2:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->T2:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 15
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->L1()V

    return-void
.end method

.method J2(II)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a2:Lcom/join/mgps/dialog/v0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "\u786e\u5b9a\u8981\u5220\u9664\u8be5\u8bc4\u8bba\u5417\uff1f"

    if-nez v0, :cond_0

    .line 2
    :try_start_1
    new-instance v0, Lcom/join/mgps/dialog/v0;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/v0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a2:Lcom/join/mgps/dialog/v0;

    const-string v2, "\u786e\u5b9a"

    .line 3
    invoke-virtual {v0, v2}, Lcom/join/mgps/dialog/v0;->f(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a2:Lcom/join/mgps/dialog/v0;

    const-string v2, "\u53d6\u6d88"

    invoke-virtual {v0, v2}, Lcom/join/mgps/dialog/v0;->d(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a2:Lcom/join/mgps/dialog/v0;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Lcom/join/mgps/dialog/v0;->b(I)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a2:Lcom/join/mgps/dialog/v0;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/v0;->g(Ljava/lang/String;)Lcom/join/mgps/dialog/v0;

    move-result-object v0

    new-instance v2, Lcom/join/mgps/activity/ForumPostsActivity$y;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/ForumPostsActivity$y;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    invoke-virtual {v0, v2}, Lcom/join/mgps/dialog/v0;->c(Landroid/view/View$OnClickListener;)Lcom/join/mgps/dialog/v0;

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a2:Lcom/join/mgps/dialog/v0;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a2:Lcom/join/mgps/dialog/v0;

    new-instance v2, Lcom/join/mgps/activity/ForumPostsActivity$z;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/ForumPostsActivity$z;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 9
    :cond_0
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->X1:I

    const/16 v2, 0x11

    if-ne v0, v2, :cond_1

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a2:Lcom/join/mgps/dialog/v0;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/v0;->g(Ljava/lang/String;)Lcom/join/mgps/dialog/v0;

    goto :goto_1

    :cond_1
    const/16 v1, 0x12

    if-eq v0, v1, :cond_5

    const/16 v1, 0x14

    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_2
    const/16 v1, 0x21

    if-ne v0, v1, :cond_3

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a2:Lcom/join/mgps/dialog/v0;

    const-string v1, "\u786e\u5b9a\u8981\u4e3e\u62a5\u8be5\u8bc4\u8bba\u5417\uff1f"

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/v0;->g(Ljava/lang/String;)Lcom/join/mgps/dialog/v0;

    goto :goto_1

    :cond_3
    const/16 v1, 0x22

    if-eq v0, v1, :cond_4

    const/16 v1, 0x24

    if-ne v0, v1, :cond_6

    .line 12
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a2:Lcom/join/mgps/dialog/v0;

    const-string v1, "\u786e\u5b9a\u8981\u4e3e\u62a5\u8be5\u56de\u590d\u5417\uff1f"

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/v0;->g(Ljava/lang/String;)Lcom/join/mgps/dialog/v0;

    goto :goto_1

    .line 13
    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a2:Lcom/join/mgps/dialog/v0;

    const-string v1, "\u786e\u5b9a\u8981\u5220\u9664\u8be5\u56de\u590d\u5417\uff1f"

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/v0;->g(Ljava/lang/String;)Lcom/join/mgps/dialog/v0;

    .line 14
    :cond_6
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a2:Lcom/join/mgps/dialog/v0;

    new-instance v1, Lcom/join/mgps/activity/ForumPostsActivity$a;

    invoke-direct {v1, p0, p1, p2}, Lcom/join/mgps/activity/ForumPostsActivity$a;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;II)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/v0;->e(Landroid/view/View$OnClickListener;)Lcom/join/mgps/dialog/v0;

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a2:Lcom/join/mgps/dialog/v0;

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-nez p1, :cond_7

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a2:Lcom/join/mgps/dialog/v0;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_7
    :goto_2
    return-void
.end method

.method K0(I)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "\u56de\u590d\u5220\u9664\u5931\u8d25"

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Lcom/join/mgps/Util/j0;->X(Landroid/content/Context;I)Lcom/join/mgps/dto/ForumRequestBean$ForumCommentReplyDeleteRequestBean;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const-string v2, ""

    .line 2
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/ForumRequestBean$ForumCommentReplyDeleteRequestBean;->setDevice_id(Ljava/lang/String;)V

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumRequestBean$ForumCommentReplyDeleteRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/join/mgps/rpc/i;->A(Ljava/util/Map;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v2

    :cond_1
    if-nez v2, :cond_3

    .line 4
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->Y0(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->L0(Landroid/content/Context;)V

    :cond_2
    return-void

    .line 6
    :cond_3
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ForumData$ForumCommentReplyDeleteData;

    .line 7
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumCommentReplyDeleteData;->isResult()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 8
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->Y1(I)V

    const-string p1, "\u56de\u590d\u5df2\u5220\u9664"

    .line 9
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 10
    :cond_4
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 12
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method K1(Z)V
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    sget-object v1, Lcom/join/mgps/activity/MGMainActivity$MediaCmd;->CMD_PLAY_BACKGROUND:Lcom/join/mgps/activity/MGMainActivity$MediaCmd;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_mediacmd"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "key_mediacmd_params"

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->callbackPlayVideo(Landroid/os/Bundle;)V

    return-void
.end method

.method K2(Lcom/join/mgps/customview/RewardType;II)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method L0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->L2:Z

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return-void

    .line 3
    :cond_0
    iput-boolean v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->L2:Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v0

    .line 5
    :try_start_0
    invoke-static {p0, v0}, Lcom/join/mgps/Util/j0;->c0(Landroid/content/Context;I)Lcom/join/mgps/dto/ForumRequestBean$ForumPostsDeleteRequestBean;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 6
    iget-object v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    invoke-static {p0, v0}, Lcom/join/mgps/Util/j0;->c0(Landroid/content/Context;I)Lcom/join/mgps/dto/ForumRequestBean$ForumPostsDeleteRequestBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsDeleteRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v0

    invoke-interface {v3, v0}, Lcom/join/mgps/rpc/i;->q0(Ljava/util/Map;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v3

    if-nez v3, :cond_1

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumData$ForumPostsDeleteData;

    if-eqz v0, :cond_1

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$ForumPostsDeleteData;->isResult()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    const-string v0, "\u5e16\u5b50\u5220\u9664\u6210\u529f"

    .line 10
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 11
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->Z0()V

    goto :goto_1

    :cond_2
    const-string v0, "\u5e16\u5b50\u5220\u9664\u5931\u8d25"

    .line 12
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    :cond_3
    :goto_1
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->L2:Z

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 14
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 15
    :goto_2
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->L2:Z

    .line 16
    throw v0

    :cond_4
    const v0, 0x7f100299

    .line 17
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 18
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->L2:Z

    :goto_3
    return-void
.end method

.method L2(I)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b2:Lcom/join/mgps/dialog/w0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/dialog/w0;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/w0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b2:Lcom/join/mgps/dialog/w0;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b2:Lcom/join/mgps/dialog/w0;

    invoke-virtual {v0, p1}, Lcom/join/mgps/dialog/w0;->c(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method M1()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l2:I

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->A1:I

    const/4 v1, 0x0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->A1:I

    goto :goto_0

    .line 4
    :cond_1
    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->A1:I

    .line 5
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->l2()V

    .line 6
    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l2:I

    .line 7
    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    .line 8
    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->c2:I

    .line 9
    invoke-direct {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->w1(Z)V

    return-void
.end method

.method M2(Ljava/lang/CharSequence;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method N1()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o2:Lcom/join/mgps/activity/ForumPostsActivity$a0;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->m1()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o2:Lcom/join/mgps/activity/ForumPostsActivity$a0;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o2:Lcom/join/mgps/activity/ForumPostsActivity$a0;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    return-void

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->E2(Landroid/view/View;)V

    return-void
.end method

.method O0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o2:Lcom/join/mgps/activity/ForumPostsActivity$a0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o2:Lcom/join/mgps/activity/ForumPostsActivity$a0;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method O1()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l2:I

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->B1:Ljava/lang/String;

    const-string v1, "asc"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "desc"

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->B1:Ljava/lang/String;

    goto :goto_0

    .line 4
    :cond_1
    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->B1:Ljava/lang/String;

    .line 5
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->m2()V

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l2:I

    .line 7
    iput v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    .line 8
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->w1(Z)V

    return-void
.end method

.method O2()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Lcom/join/android/app/component/video/MyVideoView;->seekTo(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {v0}, Lcom/join/android/app/component/video/MyVideoView;->I()V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->W2:I

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {v0}, Lcom/join/android/app/component/video/MyVideoView;->G()V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->U2:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V2:Lcom/join/android/app/component/video/MediaController;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v2}, Landroid/widget/MediaController;->setVisibility(I)V

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->T2:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 9
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P2:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 11
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a3:Z

    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->R2()V

    :cond_2
    :goto_0
    return-void
.end method

.method P0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b2:Lcom/join/mgps/dialog/w0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b2:Lcom/join/mgps/dialog/w0;

    invoke-virtual {v0}, Lcom/join/mgps/dialog/w0;->dismiss()V
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

.method P1(Ljava/lang/String;ILjava/lang/String;)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o3:Z

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return-void

    .line 3
    :cond_0
    iput-boolean v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o3:Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v3

    .line 7
    new-instance v4, Lcom/join/mgps/dto/ForumRequestBean$PostGagRequestBean;

    invoke-direct {v4}, Lcom/join/mgps/dto/ForumRequestBean$PostGagRequestBean;-><init>()V

    .line 8
    invoke-virtual {v4, v0}, Lcom/join/mgps/dto/ForumRequestBean$PostGagRequestBean;->setUid(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v4, v3}, Lcom/join/mgps/dto/ForumRequestBean$PostGagRequestBean;->setToken(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v4, p1}, Lcom/join/mgps/dto/ForumRequestBean$PostGagRequestBean;->setGag_uid(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v4, p2}, Lcom/join/mgps/dto/ForumRequestBean$PostGagRequestBean;->setGag_time(I)V

    .line 12
    invoke-virtual {v4, p3}, Lcom/join/mgps/dto/ForumRequestBean$PostGagRequestBean;->setRemarks(Ljava/lang/String;)V

    .line 13
    :try_start_0
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    invoke-virtual {v4}, Lcom/join/mgps/dto/ForumRequestBean$PostGagRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/join/mgps/rpc/i;->v0(Ljava/util/Map;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 14
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result p2

    if-nez p2, :cond_1

    .line 15
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/ForumData$ForumResult;

    if-eqz p2, :cond_1

    .line 16
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumData$ForumResult;->isResult()Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    const-string p1, "\u7981\u8a00\u6210\u529f"

    .line 17
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_2
    if-eqz p1, :cond_3

    .line 18
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ForumData$ForumResult;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumData$ForumResult;->getMsg()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_3
    const-string p1, ""

    .line 19
    :goto_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_4

    .line 20
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_4
    const-string p1, "\u7981\u8a00\u5931\u8d25"

    .line 21
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 22
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    :goto_2
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o3:Z

    goto :goto_4

    :goto_3
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o3:Z

    .line 24
    throw p1

    :cond_5
    const p1, 0x7f100299

    .line 25
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 26
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o3:Z

    :goto_4
    return-void
.end method

.method P2()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->stopRefresh()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->stopLoadMore()V

    .line 3
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->setNoMore()V

    :cond_0
    return-void
.end method

.method Q0()V
    .locals 9
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_e

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->M2:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->M2:Z

    .line 4
    new-instance v2, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-direct {v2}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;-><init>()V

    .line 5
    :try_start_0
    iget-object v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    if-eqz v3, :cond_1

    .line 6
    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v3

    goto :goto_0

    :catch_0
    move-exception v3

    .line 7
    invoke-virtual {v3}, Ljava/lang/CloneNotSupportedException;->printStackTrace()V

    :cond_1
    :goto_0
    const v3, 0x7f100130

    .line 8
    :try_start_1
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->Y0(Landroid/content/Context;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 9
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->L0(Landroid/content/Context;)V

    const v0, 0x7f10013d

    .line 10
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 11
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->M2:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->M2:Z

    return-void

    .line 13
    :cond_2
    :try_start_2
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->T(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v4

    .line 14
    new-instance v5, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsFavoritesRequestBean;

    invoke-virtual {v4}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v6

    invoke-virtual {v4}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v7

    const-string v8, ""

    invoke-direct {v5, v6, v4, v7, v8}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsFavoritesRequestBean;-><init>(ILjava/lang/String;ILjava/lang/String;)V

    .line 15
    iget-object v4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsFavoritesRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v5

    invoke-interface {v4, v5}, Lcom/join/mgps/rpc/i;->r0(Ljava/util/Map;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v4

    if-eqz v4, :cond_a

    .line 16
    invoke-virtual {v4}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v5

    if-eqz v5, :cond_4

    const/16 v0, 0x2bd

    if-eq v5, v0, :cond_3

    goto :goto_4

    :cond_3
    const v0, 0x7f10013c

    .line 17
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 18
    :cond_4
    invoke-virtual {v4}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/ForumData$ForumPostsBestData;

    if-eqz v4, :cond_9

    .line 19
    invoke-virtual {v4}, Lcom/join/mgps/dto/ForumData$ForumPostsBestData;->isResult()Z

    move-result v5

    if-eqz v5, :cond_8

    .line 20
    invoke-virtual {v4}, Lcom/join/mgps/dto/ForumData$ForumPostsBestData;->getBest()I

    move-result v4

    if-ne v4, v0, :cond_5

    const/4 v4, 0x1

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_6

    const v5, 0x7f100131

    .line 21
    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_6
    const v5, 0x7f100132

    .line 22
    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    :goto_2
    if-eqz v4, :cond_7

    goto :goto_3

    :cond_7
    const/4 v0, 0x0

    .line 23
    :goto_3
    invoke-virtual {v2, v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setBest(I)V

    goto :goto_4

    .line 24
    :cond_8
    invoke-virtual {v4}, Lcom/join/mgps/dto/ForumData$ForumPostsBestData;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 25
    invoke-virtual {v4}, Lcom/join/mgps/dto/ForumData$ForumPostsBestData;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 26
    :cond_9
    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 27
    :cond_a
    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 28
    :cond_b
    :goto_4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    if-eqz v0, :cond_d

    .line 29
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getBest()I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setBest(I)V

    .line 30
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->j2()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    .line 31
    :try_start_3
    iget-object v4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    if-eqz v4, :cond_c

    .line 32
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getBest()I

    move-result v2

    invoke-virtual {v4, v2}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setBest(I)V

    .line 33
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->j2()V

    .line 34
    :cond_c
    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 35
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 36
    :cond_d
    :goto_5
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->M2:Z

    goto :goto_7

    :goto_6
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->M2:Z

    .line 37
    throw v0

    :cond_e
    const v0, 0x7f100299

    .line 38
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 39
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->M2:Z

    :goto_7
    return-void
.end method

.method Q1()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->Y0(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->L0(Landroid/content/Context;)V

    const-string v0, "\u5c1a\u672a\u767b\u5f55\uff0c\u8bf7\u5148\u767b\u5f55\uff01"

    .line 3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    return-void

    .line 4
    :cond_0
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->T1:I

    invoke-static {p0, v0}, Lcom/join/mgps/Util/j0;->e0(Landroid/content/Context;I)Lcom/join/mgps/dto/ForumRequestBean$ForumPostsPraiseRequestBean;

    move-result-object v0

    const-string v1, ""

    .line 5
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsPraiseRequestBean;->setDevice_id(Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsPraiseRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/join/mgps/rpc/i;->o(Ljava/util/Map;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    .line 7
    :cond_1
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v2

    const/16 v3, 0x2c2

    if-ne v2, v3, :cond_2

    .line 8
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->p2()V

    .line 9
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->B2()V

    return-void

    .line 10
    :cond_2
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ForumData$ForumPostsPraiseData;

    .line 11
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_praise()Z

    move-result v2

    .line 12
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumPostsPraiseData;->isResult()Z

    move-result v3

    if-eqz v3, :cond_4

    if-eqz v2, :cond_3

    const-string v2, "\u70b9\u8d5e\u6210\u529f"

    .line 13
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_3
    const-string v2, "\u53d6\u6d88\u70b9\u8d5e\u6210\u529f"

    .line 14
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_4
    if-eqz v2, :cond_5

    const-string v2, "\u70b9\u8d5e\u5931\u8d25"

    .line 15
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_5
    const-string v2, "\u53d6\u6d88\u70b9\u8d5e\u5931\u8d25"

    .line 16
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 17
    :goto_0
    invoke-static {v0, v1}, Lcom/join/mgps/Util/j0;->m1(Lcom/join/mgps/dto/ForumRequestBean$ForumPostsPraiseRequestBean;Lcom/join/mgps/dto/ForumData$ForumPostsPraiseData;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method Q2(Lcom/join/mgps/dto/ForumRequestBean$ForumPostsCommentRequestBean;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-direct {p0, p0}, Lcom/join/mgps/activity/ForumPostsActivity;->isLogined(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const p1, 0x7f10013d

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->showMessage(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->T2()Z

    move-result v0

    const/4 v1, -0x1

    if-nez v0, :cond_1

    .line 4
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->B2()V

    return-void

    :cond_1
    if-eqz p1, :cond_4

    const-string v0, ""

    .line 6
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsCommentRequestBean;->setDevice_id(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsCommentRequestBean;->getParams1()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/join/mgps/rpc/i;->z0(Ljava/util/Map;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v2

    const/16 v3, 0x2c2

    if-ne v2, v3, :cond_2

    .line 9
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V

    const p1, 0x7f100490

    .line 10
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->B2()V

    return-void

    :cond_2
    const/16 v1, 0x2bd

    if-ne v2, v1, :cond_3

    .line 12
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->f2()V

    .line 13
    :cond_3
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->d2(Lcom/join/mgps/dto/ForumRequestBean$ForumPostsCommentRequestBean;Lcom/join/mgps/dto/ForumResponse;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p1, 0x1

    .line 15
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V

    :cond_4
    :goto_0
    return-void
.end method

.method R0()V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "\u5e16\u5b50\u6536\u85cf\u5931\u8d25"

    .line 1
    iget-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->H2:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 2
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->H2:Z

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_favorite()Z

    move-result v3

    xor-int/2addr v1, v3

    invoke-virtual {v2, v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setIs_favorite(Z)V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->k2()V

    .line 5
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    .line 6
    :try_start_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->a2()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    iput-boolean v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->H2:Z

    return-void

    .line 9
    :cond_1
    :try_start_1
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->T(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    .line 10
    new-instance v3, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsFavoritesRequestBean;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v4

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    iget-object v5, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v5

    const-string v6, ""

    invoke-direct {v3, v4, v1, v5, v6}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsFavoritesRequestBean;-><init>(ILjava/lang/String;ILjava/lang/String;)V

    .line 11
    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/android/app/common/utils/n;->y()I

    move-result v1

    .line 12
    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/android/app/common/utils/n;->z()Ljava/lang/String;

    move-result-object v4

    .line 13
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsFavoritesRequestBean;->setApp_ver(Ljava/lang/String;)V

    .line 14
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsFavoritesRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/join/mgps/rpc/i;->k0(Ljava/util/Map;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 15
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v3

    if-eqz v3, :cond_3

    const/16 v1, 0x2bd

    if-eq v3, v1, :cond_2

    goto :goto_1

    .line 16
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->a2()V

    const-string v1, "\u7528\u6237\u9a8c\u8bc1\u5931\u6548\uff0c\u8bf7\u91cd\u65b0\u767b\u5f55\uff01"

    .line 17
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 18
    :cond_3
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ForumData$ForumPostsFavoritesData;

    if-eqz v1, :cond_5

    .line 19
    iget-object v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumPostsFavoritesData;->isFavorites()Z

    move-result v4

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setIs_favorite(Z)V

    .line 20
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->k2()V

    .line 21
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumPostsFavoritesData;->isFavorites()Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v3, "\u5e16\u5b50\u5df2\u6536\u85cf"

    .line 22
    invoke-virtual {p0, v3}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_4
    const-string v3, "\u5e16\u5b50\u5df2\u53d6\u6d88\u6536\u85cf"

    .line 23
    invoke-virtual {p0, v3}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 24
    :goto_0
    iget-object v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v3

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumData$ForumPostsFavoritesData;->isFavorites()Z

    move-result v1

    invoke-static {v3, v1}, Lcom/join/mgps/Util/j0;->f1(IZ)V

    goto :goto_1

    .line 25
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->a2()V

    .line 26
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 27
    :cond_6
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->a2()V

    .line 28
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 29
    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->k2()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_0
    move-exception v1

    .line 30
    :try_start_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->a2()V

    .line 31
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 32
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    :goto_2
    iput-boolean v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->H2:Z

    goto :goto_4

    :goto_3
    iput-boolean v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->H2:Z

    .line 34
    throw v0

    :cond_7
    const v0, 0x7f100299

    .line 35
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    const/16 v0, 0x11

    .line 36
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->E0(I)V

    .line 37
    iput-boolean v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->H2:Z

    :goto_4
    return-void
.end method

.method R1(Landroid/widget/ListView;III)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const/4 p2, 0x1

    sub-int/2addr p4, p2

    if-eq p3, p4, :cond_7

    .line 1
    iget-boolean p4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->B2:Z

    if-eqz p4, :cond_0

    goto :goto_4

    :cond_0
    const/4 p4, 0x0

    .line 2
    :try_start_0
    iput-boolean p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->B2:Z

    .line 3
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    add-int/lit8 v0, p3, 0x1

    .line 4
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->I1:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 5
    invoke-virtual {p1, p3}, Landroid/widget/ListView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v1

    .line 6
    instance-of v2, v1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$k;

    if-eqz v2, :cond_1

    .line 7
    check-cast v1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$k;

    iget-object v1, v1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$k;->a:Ljava/lang/String;

    .line 8
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 9
    :cond_1
    instance-of v2, v1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$p;

    if-eqz v2, :cond_2

    .line 10
    check-cast v1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$p;

    iget-object v1, v1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$p;->a:Ljava/lang/String;

    .line 11
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 12
    :cond_2
    instance-of v2, v1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$l;

    if-eqz v2, :cond_3

    .line 13
    check-cast v1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$l;

    iget-object v1, v1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$l;->a:Ljava/util/List;

    .line 14
    invoke-interface {p2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 15
    :cond_3
    instance-of v2, v1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$b;

    if-eqz v2, :cond_4

    .line 16
    check-cast v1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$b;

    iget-object v1, v1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$b;->a:Ljava/lang/String;

    .line 17
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    .line 18
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge p1, p3, :cond_6

    .line 19
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-static {p3}, Lcom/join/android/app/common/utils/MyImageLoader;->k(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 20
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    :cond_6
    iput-boolean p4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->B2:Z

    return-void

    :goto_3
    iput-boolean p4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->B2:Z

    .line 22
    throw p1

    :cond_7
    :goto_4
    return-void
.end method

.method R2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    if-eqz v0, :cond_0

    .line 2
    iget-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Z2:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/video/MyVideoView;->setFullScreen(Z)V

    :cond_0
    return-void
.end method

.method S0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/rpc/h;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/group/posts/forum_report/index?pid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method S1(I)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getCommit()I

    move-result p1

    if-lez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getCommit()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setCommit(I)V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->i2()V

    :cond_0
    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->z1(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method T0(II)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/rpc/h;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/group/posts/forum_report/index?pid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "&cid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "&rid="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method T1(I)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setSolve_flg(I)V

    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 2
    :goto_0
    iget-object v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->N:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-virtual {v3}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 3
    iget-object v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->N:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-virtual {v3, v2}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/adapter/ForumCommentAdapter$z;

    .line 4
    invoke-virtual {v3}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->a()Ljava/lang/Object;

    move-result-object v4

    instance-of v4, v4, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;

    if-eqz v4, :cond_0

    .line 5
    invoke-virtual {v3}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;

    .line 6
    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getPid()I

    move-result v4

    if-ne v4, p1, :cond_0

    .line 7
    invoke-virtual {v3, v1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setAnswer_flg(I)V

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 8
    :cond_1
    :goto_1
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->z1(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-void
.end method

.method T2()Z
    .locals 1

    .line 1
    invoke-direct {p0, p0}, Lcom/join/mgps/activity/ForumPostsActivity;->accountBean(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method U1(Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumBean$ForumCommentBean;",
            ">;I)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-lez p2, :cond_0

    const/4 p2, 0x0

    const/4 v0, 0x0

    .line 2
    :goto_0
    :try_start_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 3
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;

    .line 4
    invoke-virtual {p0, v1, p2}, Lcom/join/mgps/activity/ForumPostsActivity;->X2(Lcom/join/mgps/dto/ForumBean$ForumCommentBean;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->N:Lcom/join/mgps/adapter/ForumCommentAdapter;

    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->I1:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    .line 7
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->i2()V

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->P2()V

    .line 9
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->x1()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method public U2(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method V0()V
    .locals 8

    .line 1
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getEmploy_tags()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v2

    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v5

    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPost_type()I

    move-result v7

    const/4 v4, 0x1

    move-object v3, p0

    invoke-virtual/range {v2 .. v7}, Lcom/join/mgps/Util/IntentUtil;->goForumPostsTagSelectActivity(Landroid/content/Context;IILjava/lang/String;I)V

    return-void
.end method

.method V1(Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    :try_start_0
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->N:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-virtual {v2}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 2
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->N:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-virtual {v2, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/adapter/ForumCommentAdapter$z;

    .line 3
    invoke-virtual {v2}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->a()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;

    if-eqz v3, :cond_1

    .line 4
    invoke-virtual {v2}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->getRrid()I

    move-result v3

    if-nez v3, :cond_1

    iget v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->U1:I

    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getPid()I

    move-result v4

    if-ne v3, v4, :cond_1

    .line 6
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getReply_list()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 9
    invoke-interface {v3, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 10
    invoke-interface {v3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setReply_list(Ljava/util/List;)V

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 12
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getCommit()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setCommit(I)V

    .line 13
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->i2()V

    .line 14
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v1, "\u8bc4\u8bba\u6210\u529f\uff0c\u5185\u5bb9\u5c06\u5728\u5ba1\u6838\u540e\u663e\u793a"

    invoke-virtual {p1, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->z1(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-void
.end method

.method V2(Landroidx/recyclerview/widget/RecyclerView;III)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->A1()V

    return-void
.end method

.method W0()V
    .locals 8

    .line 1
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getTag_list()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v2

    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v5

    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPost_type()I

    move-result v7

    const/4 v4, 0x2

    move-object v3, p0

    invoke-virtual/range {v2 .. v7}, Lcom/join/mgps/Util/IntentUtil;->goForumPostsTagSelectActivity(Landroid/content/Context;IILjava/lang/String;I)V

    return-void
.end method

.method W1(Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;)V
    .locals 8
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    :try_start_0
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->N:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-virtual {v2}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v2

    if-ge v1, v2, :cond_5

    .line 2
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->N:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-virtual {v2, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/adapter/ForumCommentAdapter$z;

    .line 3
    invoke-virtual {v2}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->a()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;

    if-eqz v3, :cond_4

    .line 4
    invoke-virtual {v2}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;

    .line 5
    iget v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->U1:I

    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getPid()I

    move-result v4

    if-eq v3, v4, :cond_0

    goto :goto_3

    .line 6
    :cond_0
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getReply_list()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 7
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_2

    .line 8
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 9
    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 v4, 0x0

    .line 10
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_4

    .line 11
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;

    .line 12
    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->getRid()I

    move-result v6

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->getRrid()I

    move-result v7

    if-ne v6, v7, :cond_2

    .line 13
    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->getUid()I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->setRuid(I)V

    .line 14
    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->getNickname()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->setRnickname(Ljava/lang/String;)V

    .line 15
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 17
    invoke-interface {v3, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 18
    :cond_3
    :goto_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getUid()I

    move-result v3

    invoke-virtual {p1, v3}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->setRuid(I)V

    .line 20
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getNickname()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;->setRnickname(Ljava/lang/String;)V

    .line 21
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    invoke-virtual {v2, v1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setReply_list(Ljava/util/List;)V

    goto :goto_4

    :cond_4
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 23
    :cond_5
    :goto_4
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v1, "\u8bc4\u8bba\u6210\u529f\uff0c\u5185\u5bb9\u5c06\u5728\u5ba1\u6838\u540e\u663e\u793a"

    invoke-virtual {p1, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 24
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->z1(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_5
    return-void
.end method

.method W2(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-nez p2, :cond_0

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Y1:Lcom/join/android/app/component/video/c;

    invoke-virtual {v0, p1, p2}, Lcom/join/android/app/component/video/c;->k(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->s1()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->K1(Z)V

    :cond_0
    return-void
.end method

.method X0(Ljava/lang/String;)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const-string v1, "\u83b7\u53d6\u6e38\u620f\u4fe1\u606f\u5931\u8d25"

    if-eqz v0, :cond_5

    .line 2
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->j3:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 3
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 4
    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 5
    :goto_0
    invoke-static {p0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, p1, v2, v4}, Lcom/join/mgps/Util/RequestBeanUtil;->getAppDetialBean(Ljava/lang/String;ILcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/dto/RecomRequestBean;

    move-result-object p1

    .line 6
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->r2:Lcom/join/mgps/rpc/e;

    invoke-interface {v2, p1}, Lcom/join/mgps/rpc/e;->R(Lcom/join/mgps/dto/RecomRequestBean;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result v2

    if-eqz v2, :cond_2

    .line 8
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResultMessageBean;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 9
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-eqz v2, :cond_4

    .line 10
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/DetailResultBean;

    .line 11
    iget-boolean v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->k3:Z

    if-eqz v2, :cond_4

    .line 12
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->startDown(Lcom/join/mgps/dto/DetailResultBean;)V

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_3

    .line 13
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result p1

    if-eqz p1, :cond_3

    .line 14
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 15
    :cond_3
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 16
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 17
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    :cond_4
    :goto_1
    iput v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->j3:I

    .line 19
    iput-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->k3:Z

    goto :goto_3

    .line 20
    :goto_2
    iput v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->j3:I

    .line 21
    iput-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->k3:Z

    .line 22
    throw p1

    .line 23
    :cond_5
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    :goto_3
    return-void
.end method

.method X1(Lcom/join/mgps/dto/ForumBean$ForumCommentBean;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/4 p1, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->z1(Z)V

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u8bc4\u8bba\u6210\u529f\uff0c\u5185\u5bb9\u5c06\u5728\u5ba1\u6838\u540e\u663e\u793a"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method X2(Lcom/join/mgps/dto/ForumBean$ForumCommentBean;Z)V
    .locals 31

    move-object/from16 v0, p0

    if-eqz p1, :cond_e

    .line 1
    iget-object v1, v0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    if-nez v1, :cond_0

    goto/16 :goto_d

    .line 2
    :cond_0
    invoke-static/range {p0 .. p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getForum_auth()I

    move-result v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_1

    const/4 v15, 0x1

    goto :goto_0

    :cond_1
    const/4 v15, 0x0

    .line 4
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->isOfficialAccount()Z

    move-result v16

    .line 5
    iget-object v2, v0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getHelp()I

    move-result v2

    if-ne v2, v4, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 6
    :goto_1
    iget-object v5, v0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSolve_flg()I

    move-result v5

    if-ne v5, v4, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    .line 7
    :goto_2
    iget-object v6, v0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getAuth()I

    move-result v14

    if-eqz v1, :cond_4

    .line 8
    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v6

    iget-object v7, v0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v7}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getUid()I

    move-result v7

    if-ne v6, v7, :cond_4

    const/16 v25, 0x1

    goto :goto_3

    :cond_4
    const/16 v25, 0x0

    :goto_3
    if-eqz v1, :cond_5

    .line 9
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getUid()I

    move-result v6

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    if-ne v6, v1, :cond_5

    const/4 v1, 0x1

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    .line 10
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getUid()I

    move-result v6

    iget-object v7, v0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v7}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getUid()I

    move-result v7

    if-ne v6, v7, :cond_6

    const/4 v13, 0x1

    goto :goto_5

    :cond_6
    const/4 v13, 0x0

    .line 11
    :goto_5
    new-instance v11, Lcom/join/mgps/adapter/ForumCommentAdapter$z;

    sget-object v12, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->COMMENT_HEADER:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    new-instance v10, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;

    .line 12
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getUid()I

    move-result v7

    .line 13
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getPid()I

    move-result v8

    .line 14
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getAvatar_src()Ljava/lang/String;

    move-result-object v9

    .line 15
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getNickname()Ljava/lang/String;

    move-result-object v17

    .line 16
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getAdd_time()J

    move-result-wide v18

    .line 17
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getFloor()I

    move-result v20

    .line 18
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getAnswer_flg()I

    move-result v26

    if-eqz v2, :cond_7

    if-nez v5, :cond_7

    if-eqz v25, :cond_7

    if-nez v1, :cond_7

    const/4 v2, 0x1

    goto :goto_6

    :cond_7
    const/4 v2, 0x0

    :goto_6
    xor-int/lit8 v27, v1, 0x1

    const/16 v6, 0x63

    const/4 v5, 0x3

    if-eq v14, v5, :cond_9

    if-eq v14, v6, :cond_9

    if-nez v1, :cond_9

    if-eqz v25, :cond_8

    goto :goto_7

    :cond_8
    const/16 v28, 0x0

    goto :goto_8

    :cond_9
    :goto_7
    const/16 v28, 0x1

    .line 19
    :goto_8
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getVip_level()I

    move-result v21

    .line 20
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getSvip_level()I

    move-result v22

    .line 21
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->is_moderator()Z

    move-result v23

    .line 22
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getMember_honor()Ljava/lang/String;

    move-result-object v24

    const/4 v3, 0x3

    move-object v5, v10

    const/16 v4, 0x63

    move/from16 v6, p2

    move-object v4, v10

    move-object/from16 v10, v17

    move/from16 v29, v1

    move-object v3, v11

    move-object v1, v12

    move-wide/from16 v11, v18

    move/from16 v30, v14

    move/from16 v14, v20

    move/from16 v17, v26

    move/from16 v18, v2

    move/from16 v19, v27

    move/from16 v20, v28

    invoke-direct/range {v5 .. v24}, Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;-><init>(ZIILjava/lang/String;Ljava/lang/String;JZIZZIZZZIIZLjava/lang/String;)V

    invoke-direct {v3, v1, v4}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;Ljava/lang/Object;)V

    .line 23
    iget-object v1, v0, Lcom/join/mgps/activity/ForumPostsActivity;->I1:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    new-instance v1, Lcom/join/mgps/adapter/ForumCommentAdapter$z;

    sget-object v2, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->COMMENT_MESSAGE:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    new-instance v10, Lcom/join/mgps/adapter/ForumCommentAdapter$z$c;

    .line 25
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getPid()I

    move-result v4

    .line 26
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getMessage()Ljava/lang/String;

    move-result-object v5

    .line 27
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getNickname()Ljava/lang/String;

    move-result-object v6

    .line 28
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getUid()I

    move-result v7

    xor-int/lit8 v8, v29, 0x1

    move/from16 v11, v30

    const/4 v3, 0x3

    if-eq v11, v3, :cond_b

    const/16 v3, 0x63

    if-eq v11, v3, :cond_b

    if-eqz v29, :cond_a

    goto :goto_9

    :cond_a
    const/4 v9, 0x0

    goto :goto_a

    :cond_b
    :goto_9
    const/4 v9, 0x1

    :goto_a
    move-object v3, v10

    invoke-direct/range {v3 .. v9}, Lcom/join/mgps/adapter/ForumCommentAdapter$z$c;-><init>(ILjava/lang/String;Ljava/lang/String;IZZ)V

    invoke-direct {v1, v2, v10}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;Ljava/lang/Object;)V

    .line 29
    iget-object v2, v0, Lcom/join/mgps/activity/ForumPostsActivity;->I1:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    .line 30
    :goto_b
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getPic_list()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getPic_list()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_c

    .line 31
    new-instance v2, Lcom/join/mgps/adapter/ForumCommentAdapter$z;

    sget-object v3, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->COMMENT_IMAGE:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    new-instance v4, Lcom/join/mgps/adapter/ForumCommentAdapter$z$b;

    .line 32
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getPic_list()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 33
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getRaw_pic_list()Ljava/util/List;

    move-result-object v6

    invoke-direct {v4, v5, v1, v6}, Lcom/join/mgps/adapter/ForumCommentAdapter$z$b;-><init>(Ljava/lang/String;ILjava/util/List;)V

    invoke-direct {v2, v3, v4}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;Ljava/lang/Object;)V

    .line 34
    iget-object v3, v0, Lcom/join/mgps/activity/ForumPostsActivity;->I1:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    .line 35
    :cond_c
    new-instance v7, Lcom/join/mgps/adapter/ForumCommentAdapter$z;

    sget-object v8, Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;->COMMENT_MESSAGE_REPLY:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    new-instance v9, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;

    .line 36
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getPid()I

    move-result v2

    .line 37
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getReply_list()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->getReply_list()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_d

    const/4 v5, 0x1

    goto :goto_c

    :cond_d
    const/4 v5, 0x0

    :goto_c
    move-object v1, v9

    move-object/from16 v3, p1

    move v4, v11

    move/from16 v6, v25

    invoke-direct/range {v1 .. v6}, Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;-><init>(ILcom/join/mgps/dto/ForumBean$ForumCommentBean;IZZ)V

    invoke-direct {v7, v8, v9}, Lcom/join/mgps/adapter/ForumCommentAdapter$z;-><init>(Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;Ljava/lang/Object;)V

    .line 38
    iget-object v1, v0, Lcom/join/mgps/activity/ForumPostsActivity;->I1:Ljava/util/List;

    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_e
    :goto_d
    return-void
.end method

.method Y1(I)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method public Z()V
    .locals 1

    const v0, 0x7f091682

    .line 1
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->showSortPop(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method a1()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 2
    iput-boolean v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Z2:Z

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->N2()V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->z2()V

    .line 5
    invoke-virtual {p0, v2, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->E1(II)V

    goto :goto_1

    .line 6
    :cond_1
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Z2:Z

    .line 7
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->i1()V

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->o2()Landroid/widget/RelativeLayout$LayoutParams;

    :goto_1
    return-void
.end method

.method a2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_favorite()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setIs_favorite(Z)V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->l2()V

    return-void
.end method

.method afterViews()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/g;->A0()Lcom/join/mgps/rpc/impl/g;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    .line 2
    invoke-static {}, Lcom/join/mgps/rpc/impl/a;->c0()Lcom/join/mgps/rpc/b;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->p2:Lcom/join/mgps/rpc/b;

    .line 3
    :try_start_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->l1()V

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->q1()V

    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->w1(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method b1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "http"

    .line 2
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p2

    .line 3
    :cond_1
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-object p2

    .line 4
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method b2(Lcom/join/mgps/dto/ForumBean$GameInfo;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->H1:Lcom/join/mgps/dto/ForumBean$GameInfo;

    if-eqz p1, :cond_2

    .line 2
    :try_start_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getGame_id()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->H1:Lcom/join/mgps/dto/ForumBean$GameInfo;

    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/ForumBean$GameInfo;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f3:Ljava/util/Map;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->i3:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f3:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_1
    return-void
.end method

.method back_image()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v2:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->z0()V

    return-void

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->t2:Z

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    return-void

    .line 5
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->y2()V

    .line 6
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->Z0()V

    return-void
.end method

.method c2(Lcom/join/mgps/dto/ForumBean$ForumPostsBean;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_praise()Z

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPraise()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->y1(ZI)V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->k2()V

    :cond_0
    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getRelation_game()Lcom/join/mgps/dto/ForumBean$GameInfo;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->b2(Lcom/join/mgps/dto/ForumBean$GameInfo;)V

    :cond_1
    return-void
.end method

.method callbackPlayVideo(Landroid/os/Bundle;)V
    .locals 9

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "key_mediacmd"

    .line 1
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "key_mediacmd_params"

    .line 2
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    const/4 v1, 0x3

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "callbackPlayVideo"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "cmd="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x1

    aput-object v3, v2, v5

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "params="

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x2

    aput-object v3, v2, v6

    invoke-static {v2}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 4
    sget-object v2, Lcom/join/mgps/activity/ForumPostsActivity$MediaCmd;->CMD_PLAY:Lcom/join/mgps/activity/ForumPostsActivity$MediaCmd;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v0, 0x0

    move-object v2, v0

    const/4 v3, 0x0

    .line 5
    :goto_0
    array-length v7, p1

    if-ge v3, v7, :cond_5

    .line 6
    aget-object v7, p1, v3

    check-cast v7, Ljava/lang/String;

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-eq v3, v6, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v7

    goto :goto_1

    :cond_2
    move-object v0, v7

    goto :goto_1

    .line 7
    :cond_3
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 8
    iget v8, p0, Lcom/join/mgps/activity/ForumPostsActivity;->W2:I

    if-ne v7, v8, :cond_4

    return-void

    .line 9
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->O2()V

    .line 10
    iput v7, p0, Lcom/join/mgps/activity/ForumPostsActivity;->W2:I

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    new-array p1, v1, [Ljava/lang/String;

    const-string v1, "CMD_PLAY"

    aput-object v1, p1, v4

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "videoUrl="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, p1, v5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "coverUrl="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, p1, v6

    invoke-static {p1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P2:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v4}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {p1, v4}, Landroid/view/SurfaceView;->setVisibility(I)V

    .line 14
    iput-boolean v5, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a3:Z

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->z2()V

    .line 16
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->J1(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 17
    :cond_6
    sget-object v2, Lcom/join/mgps/activity/ForumPostsActivity$MediaCmd;->CMD_PLAY_BACKGROUND:Lcom/join/mgps/activity/ForumPostsActivity$MediaCmd;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 18
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->W2:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_7

    return-void

    .line 19
    :cond_7
    aget-object p1, p1, v4

    check-cast p1, Ljava/lang/String;

    .line 20
    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 21
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P2:Landroid/widget/FrameLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 22
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {p1, v0}, Landroid/view/SurfaceView;->setVisibility(I)V

    .line 23
    iput-boolean v4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a3:Z

    .line 24
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->O2()V

    goto/16 :goto_4

    .line 25
    :cond_8
    iget p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->W2:I

    if-ne p1, v1, :cond_9

    return-void

    .line 26
    :cond_9
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P2:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v4}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 27
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {p1, v4}, Landroid/view/SurfaceView;->setVisibility(I)V

    .line 28
    iput-boolean v5, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a3:Z

    goto/16 :goto_4

    .line 29
    :cond_a
    sget-object v2, Lcom/join/mgps/activity/ForumPostsActivity$MediaCmd;->CMD_PAUSE:Lcom/join/mgps/activity/ForumPostsActivity$MediaCmd;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 30
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->I1()V

    goto/16 :goto_4

    .line 31
    :cond_b
    sget-object v2, Lcom/join/mgps/activity/ForumPostsActivity$MediaCmd;->CMD_STOP:Lcom/join/mgps/activity/ForumPostsActivity$MediaCmd;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 32
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->O2()V

    goto/16 :goto_4

    .line 33
    :cond_c
    sget-object v2, Lcom/join/mgps/activity/ForumPostsActivity$MediaCmd;->CMD_FULLSCREEN:Lcom/join/mgps/activity/ForumPostsActivity$MediaCmd;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    const-string v0, "false"

    const/4 v1, 0x0

    .line 34
    :goto_2
    array-length v2, p1

    if-ge v1, v2, :cond_f

    if-nez v1, :cond_d

    .line 35
    aget-object v0, p1, v4

    check-cast v0, Ljava/lang/String;

    :cond_d
    if-ne v1, v5, :cond_e

    .line 36
    aget-object v2, p1, v5

    check-cast v2, Ljava/lang/String;

    :cond_e
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 37
    :cond_f
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 38
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->a1()V

    goto :goto_4

    .line 39
    :cond_10
    sget-object v2, Lcom/join/mgps/activity/ForumPostsActivity$MediaCmd;->CMD_TRANSLATE_Y:Lcom/join/mgps/activity/ForumPostsActivity$MediaCmd;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    const-string v0, "0"

    move-object v2, v0

    const/4 v3, 0x0

    .line 40
    :goto_3
    array-length v7, p1

    if-ge v3, v7, :cond_13

    if-nez v3, :cond_11

    .line 41
    aget-object v0, p1, v4

    check-cast v0, Ljava/lang/String;

    :cond_11
    if-ne v3, v5, :cond_12

    .line 42
    aget-object v2, p1, v5

    check-cast v2, Ljava/lang/String;

    :cond_12
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 43
    :cond_13
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    .line 44
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "CMD_TRANSLATE_Y"

    aput-object v2, v1, v4

    .line 45
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "top="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v5

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "offset="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v6

    invoke-static {v1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 46
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->E1(II)V

    :cond_14
    :goto_4
    return-void
.end method

.method changeDownloadTaskNumber(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-eq p2, v1, :cond_9

    const/4 v1, 0x3

    if-eq p2, v1, :cond_8

    const/4 v1, 0x5

    if-eq p2, v1, :cond_6

    const/4 v1, 0x6

    if-eq p2, v1, :cond_5

    const/4 v1, 0x7

    if-eq p2, v1, :cond_3

    const/16 v1, 0xa

    if-eq p2, v1, :cond_1

    const/16 p1, 0xb

    if-eq p2, p1, :cond_7

    goto/16 :goto_0

    .line 2
    :cond_1
    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->g3:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->g3:Ljava/util/Map;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    :cond_2
    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h3:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    .line 5
    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h3:Ljava/util/Map;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 6
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->g3:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->g3:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h3:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h3:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 10
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h3:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h3:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 12
    :cond_6
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->g3:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->g3:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    :cond_7
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h3:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h3:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 16
    :cond_8
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h3:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 17
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h3:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 18
    :cond_9
    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->g3:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    .line 19
    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->g3:Ljava/util/Map;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    :cond_a
    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h3:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    .line 21
    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h3:Ljava/util/Map;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    :goto_0
    return-void
.end method

.method d1()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->y2:Ljava/util/List;

    const-string v1, ""

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->y2:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->y2:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/RecommendLabelTag;

    invoke-virtual {v1}, Lcom/join/mgps/dto/RecommendLabelTag;->getTag_id()I

    move-result v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->y2:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-eq v0, v2, :cond_1

    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method d2(Lcom/join/mgps/dto/ForumRequestBean$ForumPostsCommentRequestBean;Lcom/join/mgps/dto/ForumResponse;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/ForumRequestBean$ForumPostsCommentRequestBean;",
            "Lcom/join/mgps/dto/ForumResponse<",
            "Lcom/join/mgps/dto/ForumData$ForumPostsCommentData;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    if-nez p2, :cond_1

    .line 1
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x2:Ljava/util/List;

    if-eqz p2, :cond_0

    .line 4
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsCommentRequestBean;->getImages()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M0(Ljava/util/List;)V

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->g1()V

    return-void

    .line 7
    :cond_1
    :try_start_1
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/ForumData$ForumPostsCommentData;

    .line 8
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumData$ForumPostsCommentData;->isResult()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x2

    .line 9
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V

    .line 10
    new-instance v1, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;

    invoke-direct {v1}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;-><init>()V

    .line 11
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumData$ForumPostsCommentData;->getPid()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setPid(I)V

    .line 12
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->T(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    .line 13
    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setUid(I)V

    .line 14
    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getNickname()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setNickname(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setAvatar_src(Ljava/lang/String;)V

    .line 16
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsCommentRequestBean;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setMessage(Ljava/lang/String;)V

    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    div-long/2addr v3, v5

    invoke-virtual {v1, v3, v4}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setAdd_time(J)V

    .line 18
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumData$ForumPostsCommentData;->getPic_list()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setPic_list(Ljava/util/List;)V

    .line 19
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumData$ForumPostsCommentData;->getRaw_pic_list()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setRaw_pic_list(Ljava/util/List;)V

    .line 20
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumData$ForumPostsCommentData;->getFloor()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setFloor(I)V

    .line 21
    iget-object v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getAuth()I

    move-result v3

    const/4 v4, 0x3

    const/4 v5, 0x0

    if-ne v3, v4, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setForum_auth(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    :try_start_2
    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->G()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/b;->vl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    :catch_0
    :try_start_3
    invoke-virtual {v1, v5}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setVip_level(I)V

    .line 24
    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->j1()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setSvip_level(I)V

    .line 25
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumData$ForumPostsCommentData;->is_moderator()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setIs_moderator(Z)V

    .line 26
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumData$ForumPostsCommentData;->getMember_honor()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/ForumBean$ForumCommentBean;->setMember_honor(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->X1(Lcom/join/mgps/dto/ForumBean$ForumCommentBean;)V

    .line 28
    sget-object v1, Lcom/join/mgps/customview/RewardType;->COMMENT_POST:Lcom/join/mgps/customview/RewardType;

    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumData$ForumPostsCommentData;->getReward_money()I

    move-result v2

    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumData$ForumPostsCommentData;->getReward_exp()I

    move-result p2

    invoke-virtual {p0, v1, v2, p2}, Lcom/join/mgps/activity/ForumPostsActivity;->K2(Lcom/join/mgps/customview/RewardType;II)V

    .line 29
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->e2(I)V

    .line 30
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsCommentRequestBean;->getImages()Ljava/util/List;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/join/mgps/activity/ForumPostsActivity;->M0(Ljava/util/List;)V

    goto :goto_1

    .line 31
    :cond_3
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumData$ForumPostsCommentData;->getError_type()I

    move-result v1

    if-ne v1, v0, :cond_5

    .line 32
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->P0()V

    .line 33
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumData$ForumPostsCommentData;->getError_type()I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/ForumPostsActivity;->H2(I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 34
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    .line 35
    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x2:Ljava/util/List;

    if-eqz p2, :cond_4

    .line 36
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 37
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsCommentRequestBean;->getImages()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M0(Ljava/util/List;)V

    .line 38
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->g1()V

    return-void

    .line 39
    :cond_5
    :try_start_4
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumData$ForumPostsCommentData;->getMsg()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 40
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->P0()V

    .line 41
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumData$ForumPostsCommentData;->getMsg()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 42
    :cond_6
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 43
    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    .line 44
    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x2:Ljava/util/List;

    if-eqz p2, :cond_7

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :catch_1
    move-exception p2

    .line 45
    :try_start_5
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    .line 46
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 47
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    .line 48
    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x2:Ljava/util/List;

    if-eqz p2, :cond_7

    .line 49
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 50
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsCommentRequestBean;->getImages()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M0(Ljava/util/List;)V

    .line 51
    :cond_7
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->g1()V

    return-void

    .line 52
    :goto_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    .line 53
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x2:Ljava/util/List;

    if-eqz v0, :cond_8

    .line 54
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 55
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsCommentRequestBean;->getImages()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M0(Ljava/util/List;)V

    .line 56
    :cond_8
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->g1()V

    .line 57
    throw p2
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_2

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v0

    .line 3
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->r1(Landroid/view/MotionEvent;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->t1(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "input_method"

    .line 4
    invoke-virtual {p0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    if-eqz v1, :cond_0

    .line 5
    iget-boolean v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->t2:Z

    if-eqz v2, :cond_0

    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 7
    iput-boolean v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->t2:Z

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->F0()V

    .line 9
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 10
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/Window;->superDispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p1, 0x1

    return p1

    .line 11
    :cond_3
    invoke-virtual {p0, p1}, Landroid/app/Activity;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method e1(Landroid/content/Context;)I
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1
    :cond_0
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->d3:I

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const v1, 0x3fe66666    # 1.8f

    const v2, 0x7f070d86

    .line 4
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    sub-int/2addr v0, p1

    const/high16 p1, 0x3f800000    # 1.0f

    int-to-float v0, v0

    mul-float v0, v0, p1

    div-float/2addr v0, v1

    float-to-int p1, v0

    .line 5
    iput p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->d3:I

    .line 6
    :cond_1
    iget p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->d3:I

    return p1
.end method

.method e2(I)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getCommit()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setCommit(I)V

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->z1(Z)V

    return-void
.end method

.method error(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method f1(II)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "\u91c7\u7eb3\u5931\u8d25\uff0c\u8bf7\u91cd\u65b0\u64cd\u4f5c\uff01"

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 2
    :try_start_0
    invoke-static {p0, p1, p2}, Lcom/join/mgps/Util/j0;->d0(Landroid/content/Context;II)Lcom/join/mgps/dto/ForumRequestBean$ForumPostsHelpSolveRequestBean;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const-string v1, ""

    .line 3
    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsHelpSolveRequestBean;->setDevice_id(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsHelpSolveRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/join/mgps/rpc/i;->j(Ljava/util/Map;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v1

    :cond_0
    if-nez v1, :cond_2

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->Y0(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 6
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->L0(Landroid/content/Context;)V

    .line 7
    :cond_1
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    return-void

    .line 9
    :cond_2
    :try_start_1
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result p1

    if-eqz p1, :cond_4

    const/16 p2, 0x2bd

    if-eq p1, p2, :cond_3

    goto :goto_0

    .line 10
    :cond_3
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f10013c

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 11
    :cond_4
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ForumData$ForumPostsHelpSolveData;

    .line 12
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumData$ForumPostsHelpSolveData;->isResult()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 13
    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/ForumPostsActivity;->T1(I)V

    const-string p1, "\u91c7\u7eb3\u6210\u529f\uff01"

    .line 14
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 15
    :cond_5
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumData$ForumPostsHelpSolveData;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 16
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 17
    :cond_6
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumData$ForumPostsHelpSolveData;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 18
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 19
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 20
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    goto :goto_2

    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    .line 21
    throw p1

    :cond_7
    const p1, 0x7f100299

    .line 22
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    :goto_2
    return-void
.end method

.method g1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->t:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->u:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v2:Z
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

.method public goMyAlbumActivity4PickPic()V
    .locals 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/join/android/app/component/album/MyAlbumActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x2:Ljava/util/List;

    check-cast v2, Ljava/io/Serializable;

    const-string v3, "key_selected_images"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 4
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/16 v1, 0x100

    .line 5
    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method h1(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->g1()V

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->s:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->s:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 4
    :goto_0
    iput-boolean p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->u2:Z

    return-void
.end method

.method h2()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->a3:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P2:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P2:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public hideKeyBoardHandler()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->hideKeyBoardHandler()V

    return-void
.end method

.method public hideSystemKeyBoard(Landroid/view/View;)V
    .locals 2

    const-string v0, "input_method"

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 3
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->t2:Z

    return-void
.end method

.method j1()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->goMyAlbumActivity4PickPic()V

    return-void
.end method

.method j2()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->p0:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getBest()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->p0:Landroid/widget/ImageView;

    const v1, 0x7f080a38

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->p0:Landroid/widget/ImageView;

    const v1, 0x7f080a37

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    return-void
.end method

.method k2()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m:Landroid/widget/Button;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_favorite()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m:Landroid/widget/Button;

    const v1, 0x7f080676

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m:Landroid/widget/Button;

    const v1, 0x7f080677

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    :goto_0
    return-void
.end method

.method public l1()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->r2:Lcom/join/mgps/rpc/e;

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    return-void
.end method

.method l2()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->A1:I

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h:Landroid/widget/TextView;

    const v1, -0xaaaaab

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h:Landroid/widget/TextView;

    const v1, 0x7f080bea

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h:Landroid/widget/TextView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h:Landroid/widget/TextView;

    const v1, 0x7f080beb

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    :goto_0
    return-void
.end method

.method m2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->p0:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->B1:Ljava/lang/String;

    const-string v1, "asc"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Z:Landroid/widget/ImageView;

    const v1, 0x7f080a35

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Z:Landroid/widget/ImageView;

    const v1, 0x7f080a36

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    return-void
.end method

.method n2(Ljava/lang/String;)V
    .locals 9
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m3:Z

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return-void

    .line 3
    :cond_0
    iput-boolean v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m3:Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v4

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPost_type()I

    move-result v5

    .line 6
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v7

    .line 7
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v8

    .line 8
    :try_start_0
    invoke-static {p0, v4}, Lcom/join/mgps/Util/j0;->c0(Landroid/content/Context;I)Lcom/join/mgps/dto/ForumRequestBean$ForumPostsDeleteRequestBean;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 9
    iget-object v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    move-object v6, p1

    invoke-interface/range {v3 .. v8}, Lcom/join/mgps/rpc/i;->a0(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v3

    if-nez v3, :cond_1

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;

    if-eqz v3, :cond_1

    .line 12
    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->isResult()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    const-string v0, "\u79fb\u9664\u8bdd\u9898\u6210\u529f"

    .line 13
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 14
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->C1(Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    if-eqz v0, :cond_3

    .line 15
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getMsg()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_3
    const-string p1, ""

    .line 16
    :goto_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 17
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_4
    const-string p1, "\u79fb\u9664\u8bdd\u9898\u5931\u8d25"

    .line 18
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 19
    :goto_2
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->y2:Ljava/util/List;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/List;->clear()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :cond_5
    :goto_3
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m3:Z

    goto :goto_5

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    .line 21
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 22
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->y2:Ljava/util/List;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/List;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    .line 23
    :goto_4
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m3:Z

    .line 24
    throw p1

    :cond_6
    const p1, 0x7f100299

    .line 25
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 26
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m3:Z

    :goto_5
    return-void
.end method

.method o2()Landroid/widget/RelativeLayout$LayoutParams;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P2:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 2
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 3
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 4
    iget-object v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P2:Landroid/widget/FrameLayout;

    invoke-virtual {v3, v2, v2, v2, v2}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    .line 5
    :cond_0
    iget-object v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Q2:Landroid/widget/RelativeLayout;

    if-nez v3, :cond_1

    return-object v0

    .line 6
    :cond_1
    invoke-virtual {v3}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v3, :cond_2

    .line 7
    iput v1, v3, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 8
    :cond_2
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P2:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setTop(I)V

    return-object v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 7

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/BaseAppCompatActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x100

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    .line 2
    :try_start_0
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x2:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 3
    invoke-direct {p0, p3}, Lcom/join/mgps/activity/ForumPostsActivity;->c1(Landroid/content/Intent;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x2:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->w2:Lcom/join/mgps/activity/ForumPostsActivity$f0;

    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x2:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/ForumPostsActivity$f0;->c(Ljava/util/List;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->w2:Lcom/join/mgps/activity/ForumPostsActivity$f0;

    invoke-virtual {p1}, Lcom/join/mgps/activity/ForumPostsActivity$f0;->notifyDataSetChanged()V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->w2:Lcom/join/mgps/activity/ForumPostsActivity$f0;

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/ForumPostsActivity$f0;->d(Z)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x2:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_5

    .line 9
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->D2()V

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/16 v0, 0x2711

    if-ne p1, v0, :cond_5

    if-eqz p3, :cond_5

    const/4 p1, -0x1

    if-eq p2, p1, :cond_2

    goto :goto_2

    .line 10
    :cond_2
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const-string p2, ""

    if-eqz p1, :cond_3

    const-string p2, "action"

    .line 11
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p2

    const-string p3, "ids"

    .line 12
    invoke-virtual {p1, p3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    move v6, p2

    move-object p2, p1

    move p1, v6

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object p3

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    const-class v2, Ljava/util/ArrayList;

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    const-class v5, Lcom/join/mgps/dto/RecommendLabelTag;

    aput-object v5, v4, v1

    invoke-virtual {v0, v2, v4}, Lcom/join/android/app/common/utils/JsonMapper;->createCollectionType(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    invoke-virtual {p3, p2, v0}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iput-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->y2:Ljava/util/List;

    if-ne p1, v3, :cond_4

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->d1()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->x0(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    const/4 p2, 0x2

    if-ne p1, p2, :cond_5

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->d1()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->n2(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 16
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    nop

    :cond_5
    :goto_2
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v2:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->z0()V

    return-void

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->t2:Z

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    return-void

    .line 5
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->y2()V

    .line 6
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 7
    :cond_2
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onBackPressed()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    iget v0, p1, Landroid/content/res/Configuration;->keyboard:I

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v2:Z

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->z0()V

    goto :goto_0

    :cond_0
    if-ne v0, v1, :cond_1

    .line 4
    iget-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v2:Z

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->z0()V

    .line 6
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/Configuration;->toString()Ljava/lang/String;

    .line 7
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->U2(Landroid/content/res/Configuration;)V

    .line 8
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 9
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    const/4 p1, 0x1

    .line 10
    invoke-virtual {p0, p1}, Lcom/BaseAppCompatActivity;->setSystemUiHide(Z)V

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Lcom/BaseAppCompatActivity;->setSystemUiHide(Z)V

    .line 12
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->d()Z

    :goto_1
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b2:Lcom/join/mgps/dialog/w0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b2:Lcom/join/mgps/dialog/w0;

    invoke-virtual {v0}, Lcom/join/mgps/dialog/w0;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b2:Lcom/join/mgps/dialog/w0;

    .line 4
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->n2:Lnet/bither/util/b$e;

    invoke-virtual {v0, v1}, Lnet/bither/util/b;->z(Lnet/bither/util/b$e;)V

    .line 5
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object v0

    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    iput-object v1, v0, Lnet/bither/util/b;->c:Ljava/util/Hashtable;

    .line 6
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object v0

    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    iput-object v1, v0, Lnet/bither/util/b;->b:Ljava/util/Hashtable;

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->I0()V

    .line 8
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->e(Ljava/lang/Object;)V

    .line 9
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onDestroy()V

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

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->changeDownloadTaskNumber(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "zip DownloadStatus ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result p1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_5

    const/4 v2, 0x3

    if-eq p1, v2, :cond_4

    const/4 v1, 0x5

    if-eq p1, v1, :cond_3

    const/4 v3, 0x6

    if-eq p1, v3, :cond_2

    const/4 v3, 0x7

    if-eq p1, v3, :cond_1

    const/16 v2, 0x8

    if-eq p1, v2, :cond_0

    const/16 v4, 0x30

    if-eq p1, v4, :cond_3

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/16 p1, 0x9

    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 6
    :pswitch_1
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 7
    :pswitch_2
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/activity/ForumPostsActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    .line 8
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/activity/ForumPostsActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 11
    :cond_3
    :pswitch_3
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 12
    :cond_4
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    :cond_5
    const/4 p1, 0x1

    .line 13
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    :goto_0
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

.method public onFavoriteChanged(IZ)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lcom/BaseAppCompatActivity;->onFavoriteChanged(IZ)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    invoke-static {p1, p2, v0}, Lcom/join/mgps/Util/j0;->j(IZLjava/util/List;)V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v1

    if-nez v1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Z2:Z

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->R2()V

    return p1

    :cond_0
    if-ne p1, v0, :cond_1

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->Z0()V

    .line 6
    :cond_1
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method protected onPause()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->O2()V

    .line 2
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onPause()V

    .line 3
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->c()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/f;->c()Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    move-result-object v0

    iget v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->c:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->t3:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->u3:Lcom/join/mgps/recycler/a;

    .line 7
    :goto_0
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->H()V

    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onResume()V

    .line 2
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->n2:Lnet/bither/util/b$e;

    invoke-virtual {v0, v1}, Lnet/bither/util/b;->e(Lnet/bither/util/b$e;)V

    return-void
.end method

.method protected onStop()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onStop()V

    return-void
.end method

.method q2()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->Y0(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->L0(Landroid/content/Context;)V

    const-string v1, "\u5c1a\u672a\u767b\u5f55\uff0c\u8bf7\u5148\u767b\u5f55\uff01"

    .line 4
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    return-void

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->W1:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->W1:Ljava/lang/String;

    .line 6
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 7
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V

    const/4 v1, 0x1

    .line 8
    iput v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m2:I

    .line 9
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object v1

    invoke-virtual {v1}, Lnet/bither/util/b;->y()V

    goto :goto_0

    :cond_1
    const-string v1, "\u8f93\u5165\u5185\u5bb9\u4e3a\u7a7a\u8bf7\u91cd\u65b0\u8f93\u5165\uff01"

    .line 10
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    return-void

    .line 11
    :cond_2
    iput v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m2:I

    const v1, 0x7f100299

    .line 12
    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 13
    :try_start_1
    iput v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m2:I

    .line 14
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    return-void

    .line 15
    :goto_1
    throw v0
.end method

.method public r1(Landroid/view/MotionEvent;)Z
    .locals 5

    const/4 v0, 0x1

    new-array v1, v0, [I

    const v2, 0x7f090c31

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 1
    aget v4, v1, v2

    invoke-virtual {p0, v4}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-direct {p0, v4, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->k1(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v4

    if-eqz v4, :cond_0

    return v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v3
.end method

.method r2()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->Y0(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->L0(Landroid/content/Context;)V

    const-string v0, "\u5c1a\u672a\u767b\u5f55\uff0c\u8bf7\u5148\u767b\u5f55\uff01"

    .line 4
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    return-void

    .line 6
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->W1:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->W1:Ljava/lang/String;

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V

    .line 9
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V1:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    monitor-enter v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 10
    :try_start_2
    iget v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V1:I

    if-nez v1, :cond_1

    .line 11
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->t2()V

    goto :goto_0

    .line 12
    :cond_1
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->s2()V

    .line 13
    :goto_0
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v1

    :cond_2
    const-string v0, "\u8f93\u5165\u5185\u5bb9\u4e3a\u7a7a\u8bf7\u91cd\u65b0\u8f93\u5165\uff01"

    .line 14
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    return-void

    :cond_3
    const v0, 0x7f100299

    .line 16
    :try_start_4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 17
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 19
    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    return-void

    :goto_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    .line 20
    throw v0
.end method

.method resume()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lcom/join/android/app/component/video/MyVideoView;->E()Z

    move-result v0

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->U2:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->S2:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->T2:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    invoke-virtual {v0}, Lcom/join/android/app/component/video/MyVideoView;->start()V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->V2:Lcom/join/android/app/component/video/MediaController;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Landroid/widget/MediaController;->setVisibility(I)V

    goto :goto_1

    .line 7
    :cond_1
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->L1()V

    :cond_2
    :goto_1
    return-void
.end method

.method s1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public showKeyBoardHandler()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->showKeyBoardHandler()V

    .line 2
    iget v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->X1:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->h1(Z)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->h1(Z)V

    :goto_0
    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method public showSortPop(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v3:Lcom/join/mgps/activity/ForumPostsActivity$g0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v3:Lcom/join/mgps/activity/ForumPostsActivity$g0;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v3:Lcom/join/mgps/activity/ForumPostsActivity$g0;

    if-nez v0, :cond_1

    .line 3
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity$g0;

    const/4 v1, -0x2

    invoke-direct {v0, p0, p0, v1, v1}, Lcom/join/mgps/activity/ForumPostsActivity$g0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v3:Lcom/join/mgps/activity/ForumPostsActivity$g0;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v3:Lcom/join/mgps/activity/ForumPostsActivity$g0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v3:Lcom/join/mgps/activity/ForumPostsActivity$g0;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/view/View;->measure(II)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v3:Lcom/join/mgps/activity/ForumPostsActivity$g0;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v3:Lcom/join/mgps/activity/ForumPostsActivity$g0;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 8
    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f071263

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    neg-int v0, v0

    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070391

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    sub-int/2addr v1, v2

    .line 10
    iget-object v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v3:Lcom/join/mgps/activity/ForumPostsActivity$g0;

    invoke-virtual {v2, p1, v1, v0}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v3:Lcom/join/mgps/activity/ForumPostsActivity$g0;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public showSystemKeyBoard(Landroid/view/View;)V
    .locals 2

    const-string v0, "input_method"

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->t2:Z

    return-void
.end method

.method startDown(Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_5

    const/16 v1, 0x3393

    .line 2
    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from(I)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->H1:Lcom/join/mgps/dto/ForumBean$GameInfo;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    if-nez v1, :cond_1

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->H1:Lcom/join/mgps/dto/ForumBean$GameInfo;

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/ForumBean$GameInfo;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->z1(Z)V

    .line 7
    :cond_1
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPay_game_amount()I

    move-result v1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->x0(ILjava/lang/String;)I

    move-result v1

    if-lez v1, :cond_2

    .line 8
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_2
    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->z1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/DetailResultBean;)V

    .line 10
    invoke-static {p0, v0}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    .line 11
    :cond_3
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getDown_status()I

    move-result p1

    const/4 v1, 0x5

    if-ne p1, v1, :cond_4

    .line 12
    invoke-static {p0, v0}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 13
    :cond_4
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTp_down_url()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getOther_down_switch()I

    move-result v1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCdn_down_switch()I

    move-result v2

    invoke-static {p0, v0, p1, v1, v2}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    :cond_5
    :goto_0
    return-void
.end method

.method public t1(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 1
    instance-of v1, p1, Landroid/widget/EditText;

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 2
    fill-array-data v1, :array_0

    .line 3
    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 4
    aget v2, v1, v0

    const/4 v3, 0x1

    .line 5
    aget v1, v1, v3

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    add-int/2addr v4, v1

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    add-int/2addr p1, v2

    .line 8
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    int-to-float v2, v2

    cmpl-float v2, v5, v2

    if-lez v2, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    int-to-float p1, p1

    cmpg-float p1, v2, p1

    if-gez p1, :cond_0

    .line 9
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    int-to-float v1, v1

    cmpl-float p1, p1, v1

    if-lez p1, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    int-to-float p2, v4

    cmpg-float p1, p1, p2

    if-ltz p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    return v0

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method touristLogin()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, ""

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2
    invoke-direct {p0, p0}, Lcom/join/mgps/activity/ForumPostsActivity;->isLogined(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 3
    :cond_0
    :try_start_0
    new-instance v1, Lcom/join/mgps/dto/TouristLoginRequestBean;

    invoke-direct {v1}, Lcom/join/mgps/dto/TouristLoginRequestBean;-><init>()V

    const-string v2, "2"

    .line 4
    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/android/app/common/utils/n;->z()Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/TouristLoginRequestBean;->setVersion(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/TouristLoginRequestBean;->setDevice_id(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/TouristLoginRequestBean;->setMac(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/TouristLoginRequestBean;->setSource(Ljava/lang/String;)V

    .line 9
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v0, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->touriseTUID()Lorg/androidannotations/api/sharedpreferences/k;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/join/mgps/dto/TouristLoginRequestBean;->setTuid(J)V

    .line 10
    invoke-static {v1}, Lcom/join/mgps/Util/x1;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/TouristLoginRequestBean;->setSign(Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->p2:Lcom/join/mgps/rpc/b;

    invoke-virtual {v1}, Lcom/join/mgps/dto/TouristLoginRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/join/mgps/rpc/b;->s(Ljava/util/Map;)Lcom/join/mgps/dto/AccountResultMainBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getError()I

    move-result v1

    if-nez v1, :cond_2

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AccountTokenSuccess;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AccountTokenSuccess;->is_success()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 14
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AccountTokenSuccess;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountTokenSuccess;->getUser_info()Lcom/join/mgps/dto/AccountBean;

    move-result-object v0

    .line 15
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-static {v0}, Lb3/a;->a(Lcom/join/mgps/dto/AccountBean;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    invoke-virtual {v1, v0, p0}, Lcom/join/mgps/Util/b;->saveAccountData(Lcom/wufan/user/service/protobuf/n0;Landroid/content/Context;)V

    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AccountTokenSuccess;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountTokenSuccess;->getError_msg()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->error(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method public u2(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->M:Lcom/join/mgps/adapter/ForumPostsAdapter;

    invoke-virtual {v0, p1}, Lcom/join/mgps/adapter/ForumPostsAdapter;->e0(Ljava/lang/String;)V

    return-void
.end method

.method updateUI(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    if-eqz p1, :cond_0

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 1
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->receiveError(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 2
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->receiveSuccess(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 3
    :pswitch_2
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->g2()V

    goto :goto_0

    .line 4
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->receiveDelete(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 5
    :pswitch_4
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->receiveStart(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    if-eq p2, p1, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->g2()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method v1(ZZI)V
    .locals 26
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    move-object/from16 v1, p0

    move/from16 v0, p3

    .line 1
    invoke-static/range {p0 .. p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_18

    .line 2
    iget-object v2, v1, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    if-eqz v2, :cond_17

    iget v2, v1, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    if-ne v0, v2, :cond_0

    goto/16 :goto_c

    :cond_0
    const/4 v13, -0x1

    if-ne v2, v13, :cond_1

    .line 3
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/activity/ForumPostsActivity;->P2()V

    return-void

    .line 4
    :cond_1
    iput v0, v1, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    const/4 v15, 0x1

    const/4 v12, 0x0

    if-le v0, v15, :cond_2

    .line 5
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/activity/ForumPostsActivity;->F2()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/16 v2, 0x18

    const/4 v14, 0x0

    goto/16 :goto_9

    .line 6
    :cond_2
    :goto_0
    :try_start_1
    invoke-static/range {p0 .. p0}, Lcom/join/mgps/Util/j0;->T(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    .line 7
    iget-object v3, v1, Lcom/join/mgps/activity/ForumPostsActivity;->F1:Lcom/join/mgps/dto/ExtBean;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v4, ""

    if-eqz v3, :cond_3

    .line 8
    :try_start_2
    invoke-virtual {v3}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v3

    .line 9
    iget-object v4, v1, Lcom/join/mgps/activity/ForumPostsActivity;->F1:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/ExtBean;->getPosition()Ljava/lang/String;

    move-result-object v4

    move-object v11, v3

    move-object/from16 v25, v4

    goto :goto_1

    :cond_3
    move-object v11, v4

    move-object/from16 v25, v11

    :goto_1
    if-ne v0, v15, :cond_5

    .line 10
    invoke-static/range {p0 .. p0}, Lcom/join/mgps/Util/j0;->Y0(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 11
    iget-object v3, v1, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    iget-object v4, v1, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v17

    sget v18, Lcom/join/mgps/Util/j0;->d:I

    iget v4, v1, Lcom/join/mgps/activity/ForumPostsActivity;->A1:I

    iget-object v5, v1, Lcom/join/mgps/activity/ForumPostsActivity;->B1:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v21

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v22

    const-string v23, ""

    move-object/from16 v16, v3

    move/from16 v19, v4

    move-object/from16 v20, v5

    move-object/from16 v24, v11

    invoke-interface/range {v16 .. v25}, Lcom/join/mgps/rpc/i;->Y(IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v2

    goto :goto_2

    .line 12
    :cond_4
    iget-object v2, v1, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    iget-object v3, v1, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v17

    sget v18, Lcom/join/mgps/Util/j0;->d:I

    iget v3, v1, Lcom/join/mgps/activity/ForumPostsActivity;->A1:I

    iget-object v4, v1, Lcom/join/mgps/activity/ForumPostsActivity;->B1:Ljava/lang/String;

    const-string v21, ""

    move-object/from16 v16, v2

    move/from16 v19, v3

    move-object/from16 v20, v4

    move-object/from16 v22, v11

    move-object/from16 v23, v25

    invoke-interface/range {v16 .. v23}, Lcom/join/mgps/rpc/i;->v(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    const/4 v14, 0x0

    goto :goto_3

    .line 13
    :cond_5
    :try_start_3
    invoke-static/range {p0 .. p0}, Lcom/join/mgps/Util/j0;->Y0(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 14
    iget-object v3, v1, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    iget-object v4, v1, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v4

    sget v5, Lcom/join/mgps/Util/j0;->d:I

    iget v6, v1, Lcom/join/mgps/activity/ForumPostsActivity;->A1:I

    iget-object v7, v1, Lcom/join/mgps/activity/ForumPostsActivity;->B1:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v8

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v9

    const-string v10, ""
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v2, v3

    move v3, v4

    move/from16 v4, p3

    const/4 v14, 0x0

    move-object/from16 v12, v25

    :try_start_4
    invoke-interface/range {v2 .. v12}, Lcom/join/mgps/rpc/i;->f0(IIIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v2

    goto :goto_3

    :cond_6
    const/4 v14, 0x0

    .line 15
    iget-object v2, v1, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    iget-object v3, v1, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v3

    sget v5, Lcom/join/mgps/Util/j0;->d:I

    iget v6, v1, Lcom/join/mgps/activity/ForumPostsActivity;->A1:I

    iget-object v7, v1, Lcom/join/mgps/activity/ForumPostsActivity;->B1:Ljava/lang/String;

    const-string v8, ""

    move/from16 v4, p3

    move-object v9, v11

    move-object/from16 v10, v25

    invoke-interface/range {v2 .. v10}, Lcom/join/mgps/rpc/i;->s0(IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v2

    :goto_3
    if-eqz v2, :cond_13

    .line 16
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/ForumData$ForumPostsData;

    if-eqz v2, :cond_11

    .line 17
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumData$ForumPostsData;->getPosts()Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    move-result-object v3

    .line 18
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumData$ForumPostsData;->getComment_list()Ljava/util/List;

    move-result-object v4

    .line 19
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumData$ForumPostsData;->getForum_gag_type()Ljava/util/List;

    move-result-object v2

    if-ne v0, v15, :cond_9

    if-eqz v3, :cond_7

    .line 20
    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v5

    if-nez v5, :cond_9

    .line 21
    :cond_7
    iput v13, v1, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    const/16 v0, 0x14

    .line 22
    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->E0(I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 23
    iget v0, v1, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    if-eq v0, v13, :cond_8

    .line 24
    iput v14, v1, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    .line 25
    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/activity/ForumPostsActivity;->P2()V

    return-void

    :cond_9
    if-ne v0, v15, :cond_a

    if-eqz p1, :cond_a

    .line 26
    :try_start_5
    invoke-virtual {v1, v3, v15}, Lcom/join/mgps/activity/ForumPostsActivity;->x2(Lcom/join/mgps/dto/ForumBean$ForumPostsBean;Z)V

    .line 27
    invoke-virtual {v1, v3}, Lcom/join/mgps/activity/ForumPostsActivity;->c2(Lcom/join/mgps/dto/ForumBean$ForumPostsBean;)V

    .line 28
    invoke-direct {v1, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->Z1(Ljava/util/List;)V

    :cond_a
    if-eqz p2, :cond_b

    .line 29
    iget-object v2, v1, Lcom/join/mgps/activity/ForumPostsActivity;->I1:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    :cond_b
    if-eqz v4, :cond_c

    .line 30
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    if-eqz v2, :cond_c

    .line 31
    iput v0, v1, Lcom/join/mgps/activity/ForumPostsActivity;->c2:I

    .line 32
    invoke-virtual {v1, v4, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->U1(Ljava/util/List;I)V

    goto :goto_4

    .line 33
    :cond_c
    iput v13, v1, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    if-ne v0, v15, :cond_d

    .line 34
    iput v0, v1, Lcom/join/mgps/activity/ForumPostsActivity;->c2:I

    .line 35
    :cond_d
    :goto_4
    iget-object v0, v1, Lcom/join/mgps/activity/ForumPostsActivity;->I1:Ljava/util/List;

    if-eqz v0, :cond_f

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_e

    goto :goto_5

    :cond_e
    const/4 v12, 0x0

    goto :goto_6

    :cond_f
    :goto_5
    const/4 v12, 0x1

    :goto_6
    invoke-virtual {v1, v12}, Lcom/join/mgps/activity/ForumPostsActivity;->D0(Z)V

    const/16 v0, 0x20

    .line 36
    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->E0(I)V

    if-nez p1, :cond_10

    goto :goto_7

    :cond_10
    const/4 v15, 0x0

    .line 37
    :goto_7
    invoke-virtual {v1, v15}, Lcom/join/mgps/activity/ForumPostsActivity;->z1(Z)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 38
    iget v0, v1, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    if-eq v0, v13, :cond_15

    goto :goto_a

    :cond_11
    const/16 v2, 0x18

    .line 39
    :try_start_6
    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->E0(I)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 40
    iget v0, v1, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    if-eq v0, v13, :cond_12

    .line 41
    iput v14, v1, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    .line 42
    :cond_12
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/activity/ForumPostsActivity;->P2()V

    return-void

    .line 43
    :cond_13
    :try_start_7
    iput v14, v1, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    const/16 v2, 0x18

    .line 44
    :try_start_8
    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->E0(I)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 45
    iget v0, v1, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    if-eq v0, v13, :cond_14

    .line 46
    iput v14, v1, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    .line 47
    :cond_14
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/activity/ForumPostsActivity;->P2()V

    return-void

    :catch_1
    move-exception v0

    goto :goto_9

    :catch_2
    move-exception v0

    goto :goto_8

    :catchall_0
    move-exception v0

    const/4 v14, 0x0

    goto :goto_b

    :catch_3
    move-exception v0

    const/4 v14, 0x0

    :goto_8
    const/16 v2, 0x18

    .line 48
    :goto_9
    :try_start_9
    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->E0(I)V

    .line 49
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 50
    iget v0, v1, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    if-eq v0, v13, :cond_15

    .line 51
    :goto_a
    iput v14, v1, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    .line 52
    :cond_15
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/activity/ForumPostsActivity;->P2()V

    goto :goto_d

    :catchall_1
    move-exception v0

    .line 53
    :goto_b
    iget v2, v1, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    if-eq v2, v13, :cond_16

    .line 54
    iput v14, v1, Lcom/join/mgps/activity/ForumPostsActivity;->d2:I

    .line 55
    :cond_16
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/activity/ForumPostsActivity;->P2()V

    .line 56
    throw v0

    :cond_17
    :goto_c
    return-void

    :cond_18
    const v0, 0x7f100299

    .line 57
    invoke-virtual {v1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    const/16 v0, 0x11

    .line 58
    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->E0(I)V

    .line 59
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/activity/ForumPostsActivity;->P2()V

    :goto_d
    return-void
.end method

.method v2()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->n3:Z

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return-void

    .line 3
    :cond_0
    iput-boolean v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->n3:Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v0

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v4

    .line 7
    :try_start_0
    iget-object v5, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    invoke-interface {v5, v0, v3, v4}, Lcom/join/mgps/rpc/i;->h0(ILjava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v4

    if-nez v4, :cond_1

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/ForumData$ForumResult;

    if-eqz v3, :cond_1

    .line 10
    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumData$ForumResult;->isResult()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_4

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getFirst()I

    move-result v0

    if-eq v0, v2, :cond_2

    const-string v0, "\u5e16\u5b50\u7f6e\u9876\u6210\u529f"

    .line 12
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    const-string v0, "\u5e16\u5b50\u53d6\u6d88\u7f6e\u9876\u6210\u529f"

    .line 13
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 14
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumData$ForumResult;->isFirst()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    invoke-virtual {v0, v2}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setFirst(I)V

    goto :goto_4

    :cond_4
    if-eqz v0, :cond_5

    .line 15
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumData$ForumResult;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$ForumResult;->getMsg()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_5
    const-string v0, ""

    .line 16
    :goto_3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 17
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_4

    :cond_6
    const-string v0, "\u5e16\u5b50\u7f6e\u9876\u5931\u8d25"

    .line 18
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_5

    :catch_0
    move-exception v0

    .line 19
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    :goto_4
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->n3:Z

    goto :goto_6

    :goto_5
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->n3:Z

    .line 21
    throw v0

    :cond_7
    const v0, 0x7f100299

    .line 22
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 23
    iput-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->n3:Z

    :goto_6
    return-void
.end method

.method x0(Ljava/lang/String;)V
    .locals 10
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "\u6536\u5f55\u8bdd\u9898\u5931\u8d25"

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    .line 2
    iget-boolean v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l3:Z

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    return-void

    .line 3
    :cond_0
    iput-boolean v3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l3:Z

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v5

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPost_type()I

    move-result v6

    .line 6
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v8

    .line 7
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v9

    .line 8
    :try_start_0
    invoke-static {p0, v5}, Lcom/join/mgps/Util/j0;->c0(Landroid/content/Context;I)Lcom/join/mgps/dto/ForumRequestBean$ForumPostsDeleteRequestBean;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 9
    iget-object v4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E1:Lcom/join/mgps/rpc/i;

    move-object v7, p1

    invoke-interface/range {v4 .. v9}, Lcom/join/mgps/rpc/i;->g(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 10
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v4

    if-nez v4, :cond_1

    .line 11
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;

    if-eqz v4, :cond_1

    .line 12
    invoke-virtual {v4}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->isResult()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    const-string v1, "\u6536\u5f55\u8bdd\u9898\u6210\u529f"

    .line 13
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 14
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->B1(Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    if-eqz v1, :cond_3

    .line 15
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getMsg()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_3
    const-string p1, ""

    .line 16
    :goto_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 17
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 18
    :cond_4
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 19
    :goto_2
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->y2:Ljava/util/List;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/List;->clear()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :cond_5
    :goto_3
    iput-boolean v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l3:Z

    goto :goto_5

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    .line 21
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 22
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 23
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->y2:Ljava/util/List;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/List;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    .line 24
    :goto_4
    iput-boolean v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l3:Z

    .line 25
    throw p1

    :cond_6
    const p1, 0x7f100299

    .line 26
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    .line 27
    iput-boolean v2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l3:Z

    :goto_5
    return-void
.end method

.method x1()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x1f4L
    .end annotation

    return-void
.end method

.method x2(Lcom/join/mgps/dto/ForumBean$ForumPostsBean;Z)V
    .locals 39
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "newSpan"

    .line 1
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    const/4 v5, 0x1

    if-eqz v2, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 2
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getTag_list()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getTag_list()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-eqz v2, :cond_4

    .line 3
    :cond_1
    new-instance v2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;

    sget-object v6, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_SUBJECT:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    new-instance v15, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$o;

    .line 4
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getBest()I

    move-result v7

    if-lez v7, :cond_2

    const/4 v8, 0x1

    goto :goto_0

    :cond_2
    const/4 v8, 0x0

    .line 5
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v9

    .line 6
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getHelp()I

    move-result v7

    if-lez v7, :cond_3

    const/4 v10, 0x1

    goto :goto_1

    :cond_3
    const/4 v10, 0x0

    :goto_1
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getHelp_money()I

    move-result v11

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 8
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getTag_info()Ljava/util/List;

    move-result-object v12

    .line 9
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getTag_list()Ljava/util/List;

    move-result-object v13

    .line 10
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getFid()I

    move-result v14

    .line 11
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getFname()Ljava/lang/String;

    move-result-object v16

    move-object v7, v15

    move-object v4, v15

    move-object/from16 v15, v16

    invoke-direct/range {v7 .. v15}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$o;-><init>(ZLjava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V

    invoke-direct {v2, v6, v4}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;Ljava/lang/Object;)V

    .line 12
    iget-object v4, v1, Lcom/join/mgps/activity/ForumPostsActivity;->J1:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    :cond_4
    new-instance v2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;

    const/16 v18, 0x1

    .line 14
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getUid()I

    move-result v19

    .line 15
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getAvatar_src()Ljava/lang/String;

    move-result-object v20

    .line 16
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getNickname()Ljava/lang/String;

    move-result-object v21

    .line 17
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getAdd_time()J

    move-result-wide v22

    .line 18
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getFirst()I

    move-result v4

    if-lez v4, :cond_5

    const/16 v24, 0x1

    goto :goto_2

    :cond_5
    const/16 v24, 0x0

    .line 19
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v25

    .line 20
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getForum_auth()I

    move-result v4

    if-ne v4, v5, :cond_6

    const/16 v26, 0x1

    goto :goto_3

    :cond_6
    const/16 v26, 0x0

    .line 21
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->isOfficialAccount()Z

    move-result v27

    .line 22
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSolve_flg()I

    move-result v28

    .line 23
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getVip_level()I

    move-result v29

    .line 24
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSvip_level()I

    move-result v30

    .line 25
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getCopper_title()Lcom/join/mgps/dto/ForumBean$ForumCopperTitle;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getCopper_title()Lcom/join/mgps/dto/ForumBean$ForumCopperTitle;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/ForumBean$ForumCopperTitle;->getBattleTitle()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v31, v4

    goto :goto_4

    :cond_7
    move-object/from16 v31, v3

    .line 26
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getCopper_title()Lcom/join/mgps/dto/ForumBean$ForumCopperTitle;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getCopper_title()Lcom/join/mgps/dto/ForumBean$ForumCopperTitle;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/ForumBean$ForumCopperTitle;->getBattleColor()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v32, v4

    goto :goto_5

    :cond_8
    move-object/from16 v32, v3

    .line 27
    :goto_5
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_moderator()Z

    move-result v33

    .line 28
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getMember_honor()Ljava/lang/String;

    move-result-object v34

    .line 29
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getFname()Ljava/lang/String;

    move-result-object v35

    .line 30
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getFid()I

    move-result v36

    .line 31
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getHelp()I

    move-result v4

    if-lez v4, :cond_9

    const/16 v37, 0x1

    goto :goto_6

    :cond_9
    const/16 v37, 0x0

    :goto_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getHelp_money()I

    move-result v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v38

    move-object/from16 v17, v2

    invoke-direct/range {v17 .. v38}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;-><init>(ZILjava/lang/String;Ljava/lang/String;JZIZZIIILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZLjava/lang/String;)V

    .line 33
    invoke-direct {v1, v2}, Lcom/join/mgps/activity/ForumPostsActivity;->S2(Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;)V

    .line 34
    new-instance v4, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;

    sget-object v6, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_HEADER1:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-direct {v4, v6, v2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;Ljava/lang/Object;)V

    .line 35
    iget-object v2, v1, Lcom/join/mgps/activity/ForumPostsActivity;->J1:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 37
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    .line 38
    :cond_a
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 39
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getMessage()Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    :cond_b
    move-object v2, v3

    .line 40
    :goto_7
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_21

    .line 41
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 42
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_1d

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/HtmlDocUtil;->d(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1d

    .line 43
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getBest()I

    move-result v6

    if-lez v6, :cond_c

    const/4 v6, 0x1

    goto :goto_8

    :cond_c
    const/4 v6, 0x0

    .line 44
    :goto_8
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getHelp()I

    move-result v8

    if-lez v8, :cond_d

    const/4 v8, 0x1

    goto :goto_9

    :cond_d
    const/4 v8, 0x0

    .line 45
    :goto_9
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_f

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_e

    .line 46
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getTag_list()Ljava/util/List;

    move-result-object v9

    if-eqz v9, :cond_f

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getTag_list()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    if-nez v9, :cond_e

    goto :goto_a

    :cond_e
    const/4 v9, 0x0

    goto :goto_b

    :cond_f
    :goto_a
    const/4 v9, 0x1

    .line 47
    :goto_b
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getMessage()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/join/mgps/Util/HtmlDocUtil;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    .line 48
    new-instance v11, Landroid/text/SpannableStringBuilder;

    invoke-direct {v11}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 49
    invoke-virtual {v11}, Landroid/text/SpannableStringBuilder;->clear()V

    const/4 v12, 0x0

    .line 50
    :goto_c
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v13

    if-ge v12, v13, :cond_1c

    .line 51
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/join/mgps/Util/HtmlDocUtil$PostDetail;

    .line 52
    sget-object v14, Lcom/join/mgps/activity/ForumPostsActivity$r;->a:[I

    iget-object v15, v13, Lcom/join/mgps/Util/HtmlDocUtil$PostDetail;->a:Lcom/join/mgps/Util/HtmlDocUtil$PostDetail$Type;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aget v14, v14, v15
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v15, "\n"

    if-eq v14, v5, :cond_17

    const/4 v5, 0x2

    if-eq v14, v5, :cond_16

    const/4 v5, 0x3

    if-eq v14, v5, :cond_15

    const/4 v5, 0x4

    if-eq v14, v5, :cond_10

    move-object/from16 v17, v0

    :goto_d
    move-object v5, v7

    :goto_e
    const/4 v13, 0x1

    goto/16 :goto_15

    .line 53
    :cond_10
    :try_start_1
    invoke-virtual {v13}, Lcom/join/mgps/Util/HtmlDocUtil$PostDetail;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/Util/HtmlDocUtil$e;

    invoke-virtual {v5}, Lcom/join/mgps/Util/HtmlDocUtil$e;->d()Landroid/text/SpannableStringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 54
    invoke-static {v5}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_11

    .line 55
    invoke-virtual {v11, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 56
    invoke-virtual {v11, v15}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 57
    :cond_11
    invoke-virtual {v5}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v13, "span"

    invoke-virtual {v5, v13, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 58
    new-instance v13, Lcom/join/mgps/customview/text/a;

    invoke-direct {v13, v0, v1}, Lcom/join/mgps/customview/text/a;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    invoke-static {v5, v7, v13}, Landroid/text/Html;->fromHtml(Ljava/lang/String;Landroid/text/Html$ImageGetter;Landroid/text/Html$TagHandler;)Landroid/text/Spanned;

    move-result-object v19

    .line 59
    new-instance v5, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;

    sget-object v13, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_RICH_MESSAGE:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    new-instance v14, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$n;

    const/4 v15, 0x1

    if-ne v6, v15, :cond_12

    if-nez v12, :cond_12

    const/16 v18, 0x1

    goto :goto_f

    :cond_12
    const/16 v18, 0x0

    :goto_f
    if-ne v8, v15, :cond_13

    if-nez v12, :cond_13

    const/16 v20, 0x1

    goto :goto_10

    :cond_13
    const/16 v20, 0x0

    :goto_10
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getHelp_money()I

    move-result v7

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    const/4 v7, 0x1

    if-ne v9, v7, :cond_14

    if-nez v12, :cond_14

    .line 61
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getTag_info()Ljava/util/List;

    move-result-object v7

    move-object/from16 v22, v7

    goto :goto_11

    :cond_14
    const/16 v22, 0x0

    :goto_11
    move-object/from16 v17, v14

    invoke-direct/range {v17 .. v22}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$n;-><init>(ZLandroid/text/Spanned;ZLjava/lang/String;Ljava/util/List;)V

    invoke-direct {v5, v13, v14}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;Ljava/lang/Object;)V

    move-object/from16 v17, v0

    goto :goto_e

    .line 62
    :cond_15
    invoke-virtual {v13}, Lcom/join/mgps/Util/HtmlDocUtil$PostDetail;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/Util/HtmlDocUtil$d;

    .line 63
    new-instance v7, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;

    sget-object v13, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_VIDEO:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    new-instance v14, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$p;

    .line 64
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getCdn_url()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v17, v0

    invoke-virtual {v5}, Lcom/join/mgps/Util/HtmlDocUtil$d;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v15, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->b1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v5, v5, Lcom/join/mgps/Util/HtmlDocUtil$d;->d:Ljava/lang/String;

    invoke-direct {v14, v0, v5, v2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v7, v13, v14}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;Ljava/lang/Object;)V

    goto/16 :goto_d

    :cond_16
    move-object/from16 v17, v0

    .line 65
    invoke-virtual {v13}, Lcom/join/mgps/Util/HtmlDocUtil$PostDetail;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/Util/HtmlDocUtil$b;

    .line 66
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getCdn_url()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/join/mgps/Util/HtmlDocUtil$b;->e()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v5, v7}, Lcom/join/mgps/activity/ForumPostsActivity;->b1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    new-instance v5, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;

    sget-object v7, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_IMAGE:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    new-instance v13, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$k;

    .line 68
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getCdn_url()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Lcom/join/mgps/Util/HtmlDocUtil$b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v14, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->b1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 69
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v14

    const/4 v15, 0x1

    sub-int/2addr v14, v15

    invoke-direct {v13, v0, v14, v4}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$k;-><init>(Ljava/lang/String;ILjava/util/List;)V

    invoke-direct {v5, v7, v13}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;Ljava/lang/Object;)V

    goto/16 :goto_e

    :cond_17
    move-object/from16 v17, v0

    .line 70
    invoke-virtual {v13}, Lcom/join/mgps/Util/HtmlDocUtil$PostDetail;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/Util/HtmlDocUtil$c;

    invoke-virtual {v0}, Lcom/join/mgps/Util/HtmlDocUtil$c;->d()Landroid/text/SpannableStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 71
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_18

    .line 72
    invoke-virtual {v11, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 73
    invoke-virtual {v11, v15}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 74
    :cond_18
    new-instance v5, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;

    sget-object v0, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_MESSAGE:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    new-instance v7, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$m;

    const/4 v14, 0x1

    if-ne v6, v14, :cond_19

    if-nez v12, :cond_19

    const/16 v25, 0x1

    goto :goto_12

    :cond_19
    const/16 v25, 0x0

    .line 75
    :goto_12
    invoke-virtual {v13}, Lcom/join/mgps/Util/HtmlDocUtil$PostDetail;->a()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/join/mgps/Util/HtmlDocUtil$c;

    invoke-virtual {v13}, Lcom/join/mgps/Util/HtmlDocUtil$c;->d()Landroid/text/SpannableStringBuilder;

    move-result-object v26

    const/4 v13, 0x1

    if-ne v8, v13, :cond_1a

    if-nez v12, :cond_1a

    const/16 v27, 0x1

    goto :goto_13

    :cond_1a
    const/16 v27, 0x0

    :goto_13
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getHelp_money()I

    move-result v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    const/4 v13, 0x1

    if-ne v9, v13, :cond_1b

    if-nez v12, :cond_1b

    .line 77
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getTag_info()Ljava/util/List;

    move-result-object v14

    move-object/from16 v29, v14

    goto :goto_14

    :cond_1b
    const/16 v29, 0x0

    :goto_14
    move-object/from16 v24, v7

    invoke-direct/range {v24 .. v29}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$m;-><init>(ZLandroid/text/SpannableStringBuilder;ZLjava/lang/String;Ljava/util/List;)V

    invoke-direct {v5, v0, v7}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;Ljava/lang/Object;)V

    .line 78
    :goto_15
    iget-object v0, v1, Lcom/join/mgps/activity/ForumPostsActivity;->J1:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, v17

    const/4 v5, 0x1

    const/4 v7, 0x0

    goto/16 :goto_c

    .line 79
    :cond_1c
    invoke-virtual {v11}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 80
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_21

    .line 81
    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/ForumPostsActivity;->u2(Ljava/lang/String;)V

    goto :goto_19

    :cond_1d
    const/4 v13, 0x1

    .line 82
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;

    sget-object v2, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_MESSAGE:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    new-instance v4, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$m;

    .line 83
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1e

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getBest()I

    move-result v5

    if-lez v5, :cond_1e

    goto :goto_16

    :cond_1e
    const/4 v13, 0x0

    :goto_16
    new-instance v5, Landroid/text/SpannableStringBuilder;

    invoke-direct {v5}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 84
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v5

    .line 85
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_20

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1f

    goto :goto_17

    :cond_1f
    const/4 v7, 0x0

    goto :goto_18

    :cond_20
    :goto_17
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getTag_info()Ljava/util/List;

    move-result-object v7

    :goto_18
    invoke-direct {v4, v13, v5, v7}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$m;-><init>(ZLandroid/text/SpannableStringBuilder;Ljava/util/List;)V

    invoke-direct {v0, v2, v4}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;Ljava/lang/Object;)V

    .line 86
    iget-object v2, v1, Lcom/join/mgps/activity/ForumPostsActivity;->J1:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_19

    :catch_0
    move-exception v0

    .line 87
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 88
    :cond_21
    :goto_19
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getRelation_game()Lcom/join/mgps/dto/ForumBean$GameInfo;

    move-result-object v0

    if-eqz v0, :cond_23

    .line 89
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getRelation_game()Lcom/join/mgps/dto/ForumBean$GameInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getGame_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_23

    .line 90
    sget-object v0, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_GAME:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    .line 91
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getResource_url()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_22

    .line 92
    sget-object v0, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_GAME_RES_LINK:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    .line 93
    :cond_22
    new-instance v2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;

    new-instance v4, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$h;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 95
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getRelation_game()Lcom/join/mgps/dto/ForumBean$GameInfo;

    move-result-object v5

    .line 96
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getResource_url()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v3, v5, v6}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$h;-><init>(Ljava/lang/String;Lcom/join/mgps/dto/ForumBean$GameInfo;Ljava/lang/String;)V

    invoke-direct {v2, v0, v4}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;Ljava/lang/Object;)V

    .line 97
    iget-object v0, v1, Lcom/join/mgps/activity/ForumPostsActivity;->J1:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    :cond_23
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getEmploy_tags()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_24

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getEmploy_tags()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_24

    .line 99
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;

    sget-object v2, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->EMPLOYEE_TAGS:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    new-instance v3, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$f;

    .line 100
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getEmploy_tags()Ljava/util/List;

    move-result-object v4

    .line 101
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getFid()I

    move-result v5

    .line 102
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getFname()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v4, v5, v6}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$f;-><init>(Ljava/util/List;ILjava/lang/String;)V

    invoke-direct {v0, v2, v3}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;Ljava/lang/Object;)V

    .line 103
    iget-object v2, v1, Lcom/join/mgps/activity/ForumPostsActivity;->J1:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    :cond_24
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;

    sget-object v2, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_FOOTER1:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    new-instance v12, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$g;

    .line 105
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v4

    .line 106
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getFid()I

    move-result v5

    .line 107
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getFname()Ljava/lang/String;

    move-result-object v6

    .line 108
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getView()I

    move-result v7

    .line 109
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getCommit()I

    move-result v8

    .line 110
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPraise()I

    move-result v9

    .line 111
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_praise()Z

    move-result v10

    move-object v3, v12

    move/from16 v11, p2

    invoke-direct/range {v3 .. v11}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$g;-><init>(IILjava/lang/String;IIIZZ)V

    invoke-direct {v0, v2, v12}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;Ljava/lang/Object;)V

    .line 112
    iget-object v2, v1, Lcom/join/mgps/activity/ForumPostsActivity;->J1:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    iget-object v0, v1, Lcom/join/mgps/activity/ForumPostsActivity;->M:Lcom/join/mgps/adapter/ForumPostsAdapter;

    iget-object v2, v1, Lcom/join/mgps/activity/ForumPostsActivity;->J1:Ljava/util/List;

    invoke-virtual {v0, v2}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    return-void
.end method

.method public y0(Landroidx/recyclerview/widget/RecyclerView;III)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->q3:I

    if-ne p1, p2, :cond_0

    if-eqz p2, :cond_0

    return-void

    .line 2
    :cond_0
    iput p2, p0, Lcom/join/mgps/activity/ForumPostsActivity;->q3:I

    .line 3
    iput p3, p0, Lcom/join/mgps/activity/ForumPostsActivity;->r3:I

    .line 4
    iput p4, p0, Lcom/join/mgps/activity/ForumPostsActivity;->s3:I

    return-void
.end method

.method y1(ZI)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l:Landroid/widget/Button;

    const p2, 0x7f080670

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setBackgroundResource(I)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l:Landroid/widget/Button;

    const p2, 0x7f080678

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setBackgroundResource(I)V

    :goto_0
    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->z1(Z)V

    return-void
.end method

.method y2()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v1

    const-string v2, "pid"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getView()I

    move-result v1

    const-string v2, "view"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getCommit()I

    move-result v1

    const-string v2, "comment"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPraise()I

    move-result v1

    const-string v2, "praise"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_praise()Z

    move-result v1

    const-string v2, "isPraise"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G1:Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->is_favorite()Z

    move-result v1

    const-string v2, "isFavorite"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/4 v1, 0x3

    .line 9
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    :cond_1
    :goto_0
    return-void
.end method

.method z0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v2:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->g1()V

    goto :goto_2

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x2:Ljava/util/List;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    and-int v0, v3, v1

    if-eqz v0, :cond_3

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->D2()V

    goto :goto_2

    .line 5
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->goMyAlbumActivity4PickPic()V

    :goto_2
    return-void
.end method

.method z1(Z)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->N:Lcom/join/mgps/adapter/ForumCommentAdapter;

    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->I1:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->N:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :goto_0
    return-void
.end method

.method z2()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Q2:Landroid/widget/RelativeLayout;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p0, p0}, Lcom/join/mgps/activity/ForumPostsActivity;->e1(Landroid/content/Context;)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P2:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070d86

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 6
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f070d82

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 7
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f070d81

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    if-eqz v0, :cond_2

    .line 8
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P2:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2, v3, v2, v4}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Q2:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->postInvalidate()V

    return-void
.end method
