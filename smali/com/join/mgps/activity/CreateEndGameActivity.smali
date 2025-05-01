.class public Lcom/join/mgps/activity/CreateEndGameActivity;
.super Lcom/BaseAppCompatActivity;
.source "CreateEndGameActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/CreateEndGameActivity$f;,
        Lcom/join/mgps/activity/CreateEndGameActivity$g;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0031
.end annotation


# static fields
.field public static final F:I = 0x3ea

.field public static final G:Ljava/lang/String; = "CreateEndGameActivity"


# instance fields
.field A:Z

.field B:Lcom/join/mgps/dto/UserGameListBean;

.field C:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

.field D:Z

.field E:Lcom/join/mgps/dto/BossBean;

.field b:Ljava/lang/String;

.field c:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field d:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field o:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field p:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field q:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field r:Lcom/join/mgps/rpc/k;

.field s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BossBean;",
            ">;"
        }
    .end annotation
.end field

.field t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/UserGameListBean;",
            ">;"
        }
    .end annotation
.end field

.field u:Lcom/join/mgps/activity/CreateEndGameActivity$g;

.field v:Lcom/join/mgps/activity/CreateEndGameActivity$f;

.field w:Lcom/join/mgps/dto/ArchiveListBean;

.field x:J

.field y:Lcom/join/mgps/dialog/n2;

.field z:Lcom/join/mgps/customview/popwindow/view/PopWindowView;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->x:J

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->A:Z

    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->B:Lcom/join/mgps/dto/UserGameListBean;

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->D:Z

    .line 6
    iput-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->E:Lcom/join/mgps/dto/BossBean;

    return-void
.end method

.method public static synthetic f0(Lcom/join/mgps/activity/CreateEndGameActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CreateEndGameActivity;->l0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g0(Lcom/join/mgps/activity/CreateEndGameActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CreateEndGameActivity;->m0(Landroid/view/View;)V

    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/activity/CreateEndGameActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/CreateEndGameActivity;->t0()V

    return-void
.end method

.method private synthetic l0(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->D:Z

    const v0, 0x7f080d7e

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->f:Landroid/widget/ImageView;

    const v0, 0x7f0805d0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->i:Landroid/widget/TextView;

    const-string v0, "#000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->j:Landroid/widget/TextView;

    const-string v0, "#777777"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method private synthetic m0(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->A:Z

    const v0, 0x7f080d7e

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->g:Landroid/widget/ImageView;

    const v0, 0x7f0805d0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method private t0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private u0(Landroid/view/View;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BossBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c06f0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f080d7f

    .line 2
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->f:Landroid/widget/ImageView;

    const v2, 0x7f0805d1

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    const v1, 0x7f0911d4

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 6
    new-instance v2, Lcom/join/mgps/activity/CreateEndGameActivity$c;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/CreateEndGameActivity$c;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->u:Lcom/join/mgps/activity/CreateEndGameActivity$g;

    if-nez v2, :cond_0

    .line 8
    new-instance v2, Lcom/join/mgps/activity/CreateEndGameActivity$g;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/CreateEndGameActivity$g;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity;)V

    iput-object v2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->u:Lcom/join/mgps/activity/CreateEndGameActivity$g;

    .line 9
    :cond_0
    iget-object v2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->E:Lcom/join/mgps/dto/BossBean;

    if-eqz v2, :cond_1

    .line 10
    iget-object v2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->i:Landroid/widget/TextView;

    const-string v3, "#6194FF"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 11
    iget-object v2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->j:Landroid/widget/TextView;

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 12
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->u:Lcom/join/mgps/activity/CreateEndGameActivity$g;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->u:Lcom/join/mgps/activity/CreateEndGameActivity$g;

    invoke-virtual {v1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    .line 14
    iget-object p2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->u:Lcom/join/mgps/activity/CreateEndGameActivity$g;

    new-instance v1, Lcom/join/mgps/activity/CreateEndGameActivity$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/CreateEndGameActivity$d;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity;)V

    invoke-virtual {p2, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 15
    new-instance p2, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    invoke-direct {p2, p0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;-><init>(Landroid/app/Activity;)V

    const/4 v1, 0x0

    .line 16
    invoke-virtual {p2, v1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->j(I)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    move-result-object p2

    .line 17
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07114a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p2, v1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->k(I)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    move-result-object p2

    .line 18
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07130a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p2, v1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->e(I)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    move-result-object p2

    .line 19
    invoke-virtual {p2, v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->f(Landroid/view/View;)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    move-result-object p2

    const/4 v0, 0x1

    .line 20
    invoke-virtual {p2, v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->c(Z)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    move-result-object p2

    .line 21
    invoke-virtual {p2, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->i(Landroid/view/View;)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    move-result-object p2

    .line 22
    invoke-virtual {p2, v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->b(Z)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    move-result-object p2

    new-instance v0, Lcom/join/mgps/activity/h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/h;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity;Landroid/view/View;)V

    .line 23
    invoke-virtual {p2, v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->h(Lcom/join/mgps/customview/popwindow/view/PopWindowView$c;)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->l()Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->C:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    return-void
.end method

.method private v0(Landroid/view/View;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/UserGameListBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c06ef

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f080d7f

    .line 2
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->g:Landroid/widget/ImageView;

    const v2, 0x7f0805d1

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    const v1, 0x7f0911d4

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 6
    new-instance v2, Lcom/join/mgps/activity/CreateEndGameActivity$a;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/CreateEndGameActivity$a;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->v:Lcom/join/mgps/activity/CreateEndGameActivity$f;

    if-nez v2, :cond_0

    .line 8
    new-instance v2, Lcom/join/mgps/activity/CreateEndGameActivity$f;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/CreateEndGameActivity$f;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity;)V

    iput-object v2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->v:Lcom/join/mgps/activity/CreateEndGameActivity$f;

    .line 9
    :cond_0
    iget-object v2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->v:Lcom/join/mgps/activity/CreateEndGameActivity$f;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->v:Lcom/join/mgps/activity/CreateEndGameActivity$f;

    invoke-virtual {v1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    .line 11
    iget-object p2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->v:Lcom/join/mgps/activity/CreateEndGameActivity$f;

    new-instance v1, Lcom/join/mgps/activity/CreateEndGameActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/CreateEndGameActivity$b;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity;)V

    invoke-virtual {p2, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 12
    new-instance p2, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    invoke-direct {p2, p0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;-><init>(Landroid/app/Activity;)V

    const/4 v1, 0x0

    .line 13
    invoke-virtual {p2, v1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->j(I)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    move-result-object p2

    .line 14
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07114a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p2, v1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->k(I)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    move-result-object p2

    .line 15
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f071388

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p2, v1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->e(I)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    move-result-object p2

    .line 16
    invoke-virtual {p2, v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->f(Landroid/view/View;)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    move-result-object p2

    const/4 v0, 0x1

    .line 17
    invoke-virtual {p2, v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->c(Z)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    move-result-object p2

    .line 18
    invoke-virtual {p2, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->i(Landroid/view/View;)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    move-result-object p2

    .line 19
    invoke-virtual {p2, v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->b(Z)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    move-result-object p2

    new-instance v0, Lcom/join/mgps/activity/i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/i;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity;Landroid/view/View;)V

    .line 20
    invoke-virtual {p2, v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->h(Lcom/join/mgps/customview/popwindow/view/PopWindowView$c;)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;

    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->l()Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->z:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    return-void
.end method


# virtual methods
.method afterViews()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->t(Ljava/lang/Object;)V

    .line 2
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->r:Lcom/join/mgps/rpc/k;

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameActivity;->o0(Z)V

    return-void
.end method

.method back()V
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

.method i0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f0903d4
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->s:Ljava/util/List;

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->C:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    if-eqz v0, :cond_2

    iget-boolean v2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->D:Z

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->D:Z

    if-eqz v0, :cond_5

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->p()V

    goto :goto_2

    .line 6
    :cond_2
    :goto_0
    iput-boolean v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->D:Z

    const v0, 0x7f0903d4

    .line 7
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->s:Ljava/util/List;

    invoke-direct {p0, v0, v1}, Lcom/join/mgps/activity/CreateEndGameActivity;->u0(Landroid/view/View;Ljava/util/List;)V

    goto :goto_2

    .line 8
    :cond_3
    :goto_1
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/CreateEndGameActivity;->n0(Z)V

    goto :goto_2

    :cond_4
    const-string v0, "\u8bf7\u9009\u62e9\u6e38\u620f"

    .line 9
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameActivity;->showToast(Ljava/lang/String;)V

    :cond_5
    :goto_2
    return-void
.end method

.method j0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f0903d5
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->t:Ljava/util/List;

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->z:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    if-eqz v0, :cond_2

    iget-boolean v2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->A:Z

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->A:Z

    if-eqz v0, :cond_4

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->p()V

    goto :goto_2

    .line 5
    :cond_2
    :goto_0
    iput-boolean v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->A:Z

    const v0, 0x7f0903d5

    .line 6
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->t:Ljava/util/List;

    invoke-direct {p0, v0, v1}, Lcom/join/mgps/activity/CreateEndGameActivity;->v0(Landroid/view/View;Ljava/util/List;)V

    goto :goto_2

    .line 7
    :cond_3
    :goto_1
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/CreateEndGameActivity;->o0(Z)V

    :cond_4
    :goto_2
    return-void
.end method

.method k0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f090cde
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/join/kotlin/ui/endgame/EndGameSlotListActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->b:Ljava/lang/String;

    const-string v2, "gameId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/16 v1, 0x3ea

    .line 4
    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    :cond_0
    const-string v0, "\u8bf7\u9009\u62e9\u6e38\u620f"

    .line 5
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameActivity;->showToast(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method n0(Z)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/RequestBossListArgs;

    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/join/mgps/dto/RequestBossListArgs;-><init>(Ljava/lang/String;)V

    .line 3
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1, p0}, Lcom/join/mgps/dto/RequestModel;-><init>(Landroid/content/Context;)V

    .line 4
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->r:Lcom/join/mgps/rpc/k;

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/join/mgps/rpc/k;->K(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v0, :cond_0

    .line 6
    :try_start_1
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->s:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 8
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameActivity;->w0(Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method o0(Z)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38\uff0c\u8bf7\u91cd\u8bd5"

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    return-void

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    :try_start_0
    new-instance v1, Lcom/join/mgps/dto/RequestGameIdArgs;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestGameIdArgs;-><init>()V

    .line 5
    new-instance v2, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v2, p0}, Lcom/join/mgps/dto/RequestModel;-><init>(Landroid/content/Context;)V

    .line 6
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v3

    .line 7
    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/RequestGameIdArgs;->setUid(I)V

    .line 8
    invoke-virtual {v2, v1}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->r:Lcom/join/mgps/rpc/k;

    invoke-virtual {v2}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/join/mgps/rpc/k;->f(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v1, :cond_1

    .line 10
    :try_start_1
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 11
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    iput-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->t:Ljava/util/List;

    .line 12
    invoke-virtual {p0, p1, v1}, Lcom/join/mgps/activity/CreateEndGameActivity;->x0(ZLjava/util/List;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 13
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 14
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameActivity;->showToast(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 16
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameActivity;->showToast(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/BaseAppCompatActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x3ea

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    if-eqz p3, :cond_0

    const-string p1, "mData"

    .line 2
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ArchiveListBean;

    iput-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->w:Lcom/join/mgps/dto/ArchiveListBean;

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->m:Landroid/widget/RelativeLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->n:Landroid/widget/LinearLayout;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->l:Landroid/widget/ImageView;

    iget-object p2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->w:Lcom/join/mgps/dto/ArchiveListBean;

    invoke-virtual {p2}, Lcom/join/mgps/dto/ArchiveListBean;->getArchiveCover()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method public onBusEvent(Lcom/join/mgps/event/p;)V
    .locals 1
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/event/p;->a()Ljava/lang/String;

    move-result-object p1

    const-string v0, "CreateEndGameActivity"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onResume()V

    return-void
.end method

.method p0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f0903d6
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/customview/wheel/picker/a;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/wheel/picker/a;-><init>(Landroid/app/Activity;)V

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/wheel/picker/c;->G0(Z)V

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/wheel/picker/c;->m0(Z)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/popup/b;->i0(Z)V

    const/high16 v1, 0x41700000    # 15.0f

    .line 5
    invoke-static {p0, v1}, La2/a;->H(Landroid/content/Context;F)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/wheel/picker/c;->D0(I)V

    .line 6
    new-instance v1, Lcom/join/mgps/activity/CreateEndGameActivity$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/CreateEndGameActivity$e;-><init>(Lcom/join/mgps/activity/CreateEndGameActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/wheel/picker/a;->V0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;)V

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/customview/popup/a;->B()V

    return-void
.end method

.method q0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f09025a
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->w:Lcom/join/mgps/dto/ArchiveListBean;

    if-nez v0, :cond_0

    const-string v0, "\u8bf7\u9009\u62e9\u5b58\u6863"

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameActivity;->showToast(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->E:Lcom/join/mgps/dto/BossBean;

    if-nez v0, :cond_1

    const-string v0, "\u8bf7\u9009\u62e9BOSS"

    .line 4
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameActivity;->showToast(Ljava/lang/String;)V

    return-void

    .line 5
    :cond_1
    iget-wide v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->x:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_2

    const-string v0, "\u8bf7\u8bbe\u7f6e\u6311\u6218\u65f6\u957f"

    .line 6
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameActivity;->showToast(Ljava/lang/String;)V

    return-void

    :cond_2
    const-wide/16 v2, 0x4e20

    cmp-long v4, v0, v2

    if-gez v4, :cond_3

    const-string v0, "\u6311\u6218\u65f6\u957f\u4e0d\u80fd\u4f4e\u4e8e20\u79d2"

    .line 7
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CreateEndGameActivity;->showToast(Ljava/lang/String;)V

    return-void

    .line 8
    :cond_3
    invoke-static {p0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_;->N0(Landroid/content/Context;)Lcom/join/mgps/activity/CreateEndGameCommitActivity_$q;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$q;->c(Ljava/lang/String;)Lcom/join/mgps/activity/CreateEndGameCommitActivity_$q;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->E:Lcom/join/mgps/dto/BossBean;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$q;->b(Lcom/join/mgps/dto/BossBean;)Lcom/join/mgps/activity/CreateEndGameCommitActivity_$q;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->w:Lcom/join/mgps/dto/ArchiveListBean;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$q;->a(Lcom/join/mgps/dto/ArchiveListBean;)Lcom/join/mgps/activity/CreateEndGameCommitActivity_$q;

    move-result-object v0

    iget-wide v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->x:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity_$q;->d(Ljava/lang/Long;)Lcom/join/mgps/activity/CreateEndGameCommitActivity_$q;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method r0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f090961
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->c:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->y:Lcom/join/mgps/dialog/n2;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/join/mgps/dialog/n2;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/n2;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->y:Lcom/join/mgps/dialog/n2;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->y:Lcom/join/mgps/dialog/n2;

    iget-object v1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->c:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;->getEndgame_archive_hint()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/n2;->a(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method s0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f090924
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->w:Lcom/join/mgps/dto/ArchiveListBean;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->m:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method w0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BossBean;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->C:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    if-eqz v0, :cond_0

    const v0, 0x7f0903d4

    .line 2
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/activity/CreateEndGameActivity;->u0(Landroid/view/View;Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method x0(ZLjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/UserGameListBean;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->t:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/UserGameListBean;

    if-eqz v0, :cond_2

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/UserGameListBean;->getGameId()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->b:Ljava/lang/String;

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->q:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/UserGameListBean;->getGameIcon()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 6
    :cond_0
    iget-object v2, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->p:Landroid/widget/TextView;

    if-eqz v2, :cond_1

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/UserGameListBean;->getGameName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    :cond_1
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/CreateEndGameActivity;->n0(Z)V

    :cond_2
    if-eqz p1, :cond_3

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity;->z:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    if-eqz p1, :cond_3

    const p1, 0x7f0903d5

    .line 10
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/CreateEndGameActivity;->v0(Landroid/view/View;Ljava/util/List;)V

    :cond_3
    return-void
.end method
