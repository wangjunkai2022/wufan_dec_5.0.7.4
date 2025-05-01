.class public Lcom/join/mgps/customview/ForumStickView;
.super Landroid/widget/FrameLayout;
.source "ForumStickView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/customview/ForumStickView$e;
    }
.end annotation


# instance fields
.field b:Landroid/widget/TextView;

.field c:Landroid/widget/ImageView;

.field d:Landroid/widget/TextView;

.field e:Landroid/widget/ImageView;

.field f:Lcom/join/mgps/customview/ForumStickView$e;

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/customview/ForumStickView;->g:Z

    .line 3
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/ForumStickView;->c(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 5
    iput-boolean p2, p0, Lcom/join/mgps/customview/ForumStickView;->g:Z

    .line 6
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/ForumStickView;->c(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x0

    .line 8
    iput-boolean p2, p0, Lcom/join/mgps/customview/ForumStickView;->g:Z

    .line 9
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/ForumStickView;->c(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/customview/ForumStickView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/customview/ForumStickView;->e()V

    return-void
.end method

.method static synthetic b(Lcom/join/mgps/customview/ForumStickView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/customview/ForumStickView;->d()V

    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c04f4

    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const p1, 0x7f0917bd

    .line 2
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/customview/ForumStickView;->b:Landroid/widget/TextView;

    const p1, 0x7f09097c

    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/join/mgps/customview/ForumStickView;->e:Landroid/widget/ImageView;

    const p1, 0x7f09096c

    .line 4
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/join/mgps/customview/ForumStickView;->c:Landroid/widget/ImageView;

    const p1, 0x7f091682

    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/customview/ForumStickView;->d:Landroid/widget/TextView;

    .line 6
    iget-object p1, p0, Lcom/join/mgps/customview/ForumStickView;->b:Landroid/widget/TextView;

    new-instance v0, Lcom/join/mgps/customview/ForumStickView$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/ForumStickView$a;-><init>(Lcom/join/mgps/customview/ForumStickView;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/customview/ForumStickView;->e:Landroid/widget/ImageView;

    new-instance v0, Lcom/join/mgps/customview/ForumStickView$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/ForumStickView$b;-><init>(Lcom/join/mgps/customview/ForumStickView;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/customview/ForumStickView;->c:Landroid/widget/ImageView;

    new-instance v0, Lcom/join/mgps/customview/ForumStickView$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/ForumStickView$c;-><init>(Lcom/join/mgps/customview/ForumStickView;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/customview/ForumStickView;->d:Landroid/widget/TextView;

    new-instance v0, Lcom/join/mgps/customview/ForumStickView$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/ForumStickView$d;-><init>(Lcom/join/mgps/customview/ForumStickView;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/ForumStickView;->f:Lcom/join/mgps/customview/ForumStickView$e;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/join/mgps/customview/ForumStickView$e;->Z()V

    :cond_0
    return-void
.end method

.method private e()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/customview/ForumStickView;->g:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/join/mgps/customview/ForumStickView;->g:Z

    .line 2
    iget-object v1, p0, Lcom/join/mgps/customview/ForumStickView;->e:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    const v0, 0x7f08066d

    goto :goto_0

    :cond_0
    const v0, 0x7f08066e

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/ForumStickView;->f:Lcom/join/mgps/customview/ForumStickView$e;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0}, Lcom/join/mgps/customview/ForumStickView$e;->H()V

    :cond_1
    return-void
.end method


# virtual methods
.method public setData(Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 0

    return-void
.end method

.method public setForumStickViewListener(Lcom/join/mgps/customview/ForumStickView$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/ForumStickView;->f:Lcom/join/mgps/customview/ForumStickView$e;

    return-void
.end method
