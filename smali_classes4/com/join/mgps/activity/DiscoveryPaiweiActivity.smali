.class public Lcom/join/mgps/activity/DiscoveryPaiweiActivity;
.super Lcom/BaseAppCompatActivity;
.source "DiscoveryPaiweiActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;,
        Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c003b
.end annotation


# instance fields
.field b:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroidx/viewpager2/widget/ViewPager2;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroidx/constraintlayout/widget/Group;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field private i:Landroid/content/Context;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;

.field private m:I

.field private final n:Ljava/lang/String;

.field private o:Lcom/join/mgps/Util/AccountUtil_;

.field private p:Z

.field private q:Z

.field private r:Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->j:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->k:Ljava/util/List;

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->m:I

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/rpc/h;->m:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/game/discover/index"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->n:Ljava/lang/String;

    .line 6
    iput-boolean v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->p:Z

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->q:Z

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->q:Z

    return p0
.end method

.method static synthetic g0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->q:Z

    return p1
.end method

.method static synthetic h0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->l:Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;

    return-object p0
.end method

.method static synthetic i0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->p:Z

    return p0
.end method

.method private initView()V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;

    iget-object v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->k:Ljava/util/List;

    invoke-direct {v0, p0, p0, v1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;-><init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;Landroidx/fragment/app/FragmentActivity;Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->r:Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->c:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->c:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->c:Landroidx/viewpager2/widget/ViewPager2;

    new-instance v1, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$c;-><init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 5
    new-instance v0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;-><init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->l:Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;

    .line 6
    new-instance v1, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$d;-><init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->d:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->l:Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->d:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$e;-><init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    return-void
.end method

.method static synthetic j0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->k:Ljava/util/List;

    return-object p0
.end method

.method static synthetic k0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->m:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->m:I

    return v0
.end method

.method private m0(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    if-eqz p1, :cond_0

    or-int/lit16 p1, v1, 0x2000

    goto :goto_0

    :cond_0
    and-int/lit16 p1, v1, -0x2001

    .line 3
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_1
    return-void
.end method


# virtual methods
.method afterviews()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iput-object p0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->i:Landroid/content/Context;

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->o:Lcom/join/mgps/Util/AccountUtil_;

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/high16 v1, 0x4000000

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 6
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x500

    invoke-virtual {v1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    const/high16 v1, -0x80000000

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_0

    :cond_0
    const/16 v2, 0x13

    if-lt v0, v2, :cond_1

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 10
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->i:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/n;->v(Landroid/content/Context;)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->b:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x1

    .line 13
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->m0(Z)V

    .line 14
    invoke-direct {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->initView()V

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->l0()V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->i:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->clickVSZoneList:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

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

.method l0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->q:Z

    .line 2
    iget v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->m:I

    if-ne v1, v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->showLoding()V

    .line 4
    :cond_0
    new-instance v0, Lcom/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/google/gson/JsonObject;-><init>()V

    .line 5
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v1}, Lp1/f;->B()Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Long;

    .line 6
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Long;

    const-string v2, ","

    .line 7
    invoke-static {v2, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "downloadGameList"

    invoke-virtual {v0, v2, v1}, Lcom/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->h:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v2, "gameId"

    .line 9
    invoke-virtual {v0, v2, v1}, Lcom/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    :cond_1
    iget v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->m:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "page"

    invoke-virtual {v0, v2, v1}, Lcom/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/Number;)V

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->o:Lcom/join/mgps/Util/AccountUtil_;

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v1

    const-string v2, "token"

    invoke-virtual {v0, v2, v1}, Lcom/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->o:Lcom/join/mgps/Util/AccountUtil_;

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    const-string v2, "uid "

    invoke-virtual {v0, v2, v1}, Lcom/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-static {v0}, Lcom/papa91/arc/util/SignUtils;->buildRequestSign(Lcom/google/gson/JsonObject;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sign"

    invoke-virtual {v0, v2, v1}, Lcom/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    invoke-static {}, Lcom/join/android/app/common/http/d;->G()Lcom/join/android/app/common/http/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/android/app/common/http/d;->H()Lcom/join/android/app/common/http/d$o;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->n:Ljava/lang/String;

    new-instance v3, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$a;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$a;-><init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)V

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/join/android/app/common/http/d$o;->v(Ljava/lang/String;Lcom/google/gson/JsonObject;Lcom/join/android/app/common/http/d$p;Ljava/lang/Object;)V

    return-void
.end method

.method n0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "\u663e\u793a\u4e3b\u754c\u9762main"

    .line 1
    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->f:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->e:Landroidx/constraintlayout/widget/Group;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method o0(Ljava/lang/String;)V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/4 v0, 0x0

    .line 1
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "code"

    .line 2
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    const/16 v2, 0xc8

    if-ne p1, v2, :cond_6

    const-string p1, "data"

    .line 3
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/DiscoveryPaiweiGameListBean;

    invoke-virtual {v1, p1, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/DiscoveryPaiweiGameListBean;

    const/4 v1, 0x1

    if-eqz p1, :cond_4

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryPaiweiGameListBean;->getGame_list()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryPaiweiGameListBean;->getGame_list()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_4

    .line 6
    iget v2, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->m:I

    if-ne v2, v1, :cond_0

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryPaiweiGameListBean;->getGame_list()Ljava/util/List;

    move-result-object p1

    .line 9
    new-instance v1, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$b;-><init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)V

    invoke-static {p1, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v1, 0x0

    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;

    .line 11
    invoke-virtual {v3}, Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;->getGame_id()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->h:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v1, v3

    :cond_2
    if-eqz v1, :cond_3

    .line 12
    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 13
    invoke-interface {p1, v0, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 14
    :cond_3
    iget-object v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->k:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->l:Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;

    iget-object v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->k:Ljava/util/List;

    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->r:Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;

    iget-object v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->k:Ljava/util/List;

    invoke-static {p1, v1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;->a(Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;Ljava/util/List;)V

    .line 17
    invoke-virtual {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->n0()V

    goto :goto_0

    .line 18
    :cond_4
    iget p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->m:I

    if-ne p1, v1, :cond_5

    .line 19
    invoke-virtual {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->showLodingFailed()V

    .line 20
    :cond_5
    iput-boolean v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->p:Z

    goto :goto_0

    :cond_6
    const-string p1, "message"

    .line 21
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 22
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 23
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->showMessage(Ljava/lang/String;)V

    .line 24
    :cond_7
    invoke-virtual {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->showLodingFailed()V

    .line 25
    iput-boolean v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->p:Z

    .line 26
    :goto_0
    iput-boolean v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->q:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 27
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 28
    invoke-virtual {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->showLodingFailed()V

    .line 29
    iput-boolean v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->p:Z

    .line 30
    iput-boolean v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->q:Z

    :goto_1
    return-void
.end method

.method protected onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onDestroy()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onResume()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->i:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->o:Lcom/join/mgps/Util/AccountUtil_;

    return-void
.end method

.method relodingimag()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->k:Ljava/util/List;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->k:Ljava/util/List;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->q:Z

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->p:Z

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->l0()V

    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->i:Landroid/content/Context;

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
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->f:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->e:Landroidx/constraintlayout/widget/Group;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->g:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->e:Landroidx/constraintlayout/widget/Group;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->i:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method
