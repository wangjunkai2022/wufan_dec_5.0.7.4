.class public Lcom/beizi/fusion/widget/dialog/dislike/a$a;
.super Ljava/lang/Object;
.source "DislikeDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/widget/dialog/dislike/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Landroidx/recyclerview/widget/RecyclerView;

.field private b:Landroid/view/View;

.field private c:Lcom/beizi/fusion/widget/dialog/dislike/a;

.field private d:Lcom/beizi/fusion/widget/dialog/dislike/a$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/beizi/fusion/widget/dialog/dislike/a;

    sget v1, Lcom/beizi/fusion/R$style;->beizi_custom_dialog:I

    invoke-direct {v0, p1, v1}, Lcom/beizi/fusion/widget/dialog/dislike/a;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->c:Lcom/beizi/fusion/widget/dialog/dislike/a;

    const-string v0, "layout_inflater"

    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 4
    sget v1, Lcom/beizi/fusion/R$layout;->beizi_dislike_dialog:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->b:Landroid/view/View;

    .line 5
    iget-object v1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->c:Lcom/beizi/fusion/widget/dialog/dislike/a;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0, v2}, Landroid/app/Dialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->b:Landroid/view/View;

    sget v1, Lcom/beizi/fusion/R$id;->beizi_dislike_reasons_list_recycleview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 8
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    .line 9
    iget-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 10
    invoke-static {}, Lcom/beizi/fusion/widget/dialog/dislike/a;->a()Lcom/beizi/fusion/widget/dialog/dislike/a$h;

    move-result-object p1

    new-instance v0, Lcom/beizi/fusion/widget/dialog/dislike/a$a$1;

    invoke-direct {v0, p0}, Lcom/beizi/fusion/widget/dialog/dislike/a$a$1;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a$a;)V

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/widget/dialog/dislike/a$h;->a(Lcom/beizi/fusion/widget/dialog/dislike/a$e;)V

    .line 11
    iget-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {}, Lcom/beizi/fusion/widget/dialog/dislike/a;->a()Lcom/beizi/fusion/widget/dialog/dislike/a$h;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 12
    iget-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->c:Lcom/beizi/fusion/widget/dialog/dislike/a;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    .line 13
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 14
    iget-object v1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->c:Lcom/beizi/fusion/widget/dialog/dislike/a;

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    .line 15
    invoke-virtual {v1, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 16
    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-double v0, v0

    const-wide v2, 0x3feb333333333333L    # 0.85

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    double-to-int v0, v0

    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    const/16 v0, 0x11

    .line 17
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 18
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->c:Lcom/beizi/fusion/widget/dialog/dislike/a;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/widget/dialog/dislike/a$a;)Lcom/beizi/fusion/widget/dialog/dislike/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->c:Lcom/beizi/fusion/widget/dialog/dislike/a;

    return-object p0
.end method

.method static synthetic b(Lcom/beizi/fusion/widget/dialog/dislike/a$a;)Lcom/beizi/fusion/widget/dialog/dislike/a$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->d:Lcom/beizi/fusion/widget/dialog/dislike/a$c;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/beizi/fusion/widget/dialog/dislike/a$c;)Lcom/beizi/fusion/widget/dialog/dislike/a$a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->d:Lcom/beizi/fusion/widget/dialog/dislike/a$c;

    return-object p0
.end method

.method public a()Lcom/beizi/fusion/widget/dialog/dislike/a;
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->c:Lcom/beizi/fusion/widget/dialog/dislike/a;

    iget-object v1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->c:Lcom/beizi/fusion/widget/dialog/dislike/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->c:Lcom/beizi/fusion/widget/dialog/dislike/a;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$a;->c:Lcom/beizi/fusion/widget/dialog/dislike/a;

    return-object v0
.end method
