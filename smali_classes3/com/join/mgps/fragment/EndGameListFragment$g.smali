.class Lcom/join/mgps/fragment/EndGameListFragment$g;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "EndGameListFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/EndGameListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "g"
.end annotation


# instance fields
.field private final a:Landroid/widget/TextView;

.field private final b:Landroid/widget/TextView;

.field private final c:Landroid/widget/ImageView;

.field private final d:Landroid/widget/TextView;

.field private final e:Landroid/widget/TextView;

.field private final f:Landroid/widget/TextView;

.field public g:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public h:Landroid/widget/FrameLayout;

.field public i:Lcom/join/mgps/customview/MStarBar;

.field public j:Landroid/widget/TextView;

.field public k:Landroid/view/View;

.field public l:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public m:Landroid/widget/TextView;

.field final synthetic n:Lcom/join/mgps/fragment/EndGameListFragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/EndGameListFragment;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/EndGameListFragment;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->n:Lcom/join/mgps/fragment/EndGameListFragment;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f091529

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->a:Landroid/widget/TextView;

    const p1, 0x7f091537

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->b:Landroid/widget/TextView;

    const p1, 0x7f091545

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->c:Landroid/widget/ImageView;

    const p1, 0x7f091541

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->d:Landroid/widget/TextView;

    const p1, 0x7f091544

    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->e:Landroid/widget/TextView;

    const p1, 0x7f090214

    .line 8
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->f:Landroid/widget/TextView;

    const p1, 0x7f090154

    .line 9
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->g:Lcom/facebook/drawee/view/SimpleDraweeView;

    const p1, 0x7f091792

    .line 10
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->h:Landroid/widget/FrameLayout;

    const p1, 0x7f090db7

    .line 11
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/customview/MStarBar;

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->i:Lcom/join/mgps/customview/MStarBar;

    const p1, 0x7f091527

    .line 12
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->j:Landroid/widget/TextView;

    const p1, 0x7f09044b

    .line 13
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->k:Landroid/view/View;

    const p1, 0x7f09063c

    .line 14
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->l:Lcom/facebook/drawee/view/SimpleDraweeView;

    const p1, 0x7f09151e

    .line 15
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->m:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/fragment/EndGameListFragment$g;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->f:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/fragment/EndGameListFragment$g;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->b:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic c(Lcom/join/mgps/fragment/EndGameListFragment$g;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->a:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic d(Lcom/join/mgps/fragment/EndGameListFragment$g;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->d:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic e(Lcom/join/mgps/fragment/EndGameListFragment$g;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/EndGameListFragment$g;->c:Landroid/widget/ImageView;

    return-object p0
.end method
