.class Lcom/join/mgps/adapter/PapaMainV2Adapter$o;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "PapaMainV2Adapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/PapaMainV2Adapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "o"
.end annotation


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/widget/TextView;

.field private d:Lcom/facebook/drawee/view/SimpleDraweeView;

.field private e:Landroid/widget/RelativeLayout;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Lcom/facebook/drawee/view/SimpleDraweeView;

.field private i:Landroid/widget/RelativeLayout;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/LinearLayout;

.field final synthetic m:Lcom/join/mgps/adapter/PapaMainV2Adapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/adapter/PapaMainV2Adapter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->m:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f090704

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->a:Landroid/view/View;

    const p1, 0x7f09114b

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->b:Landroid/widget/RelativeLayout;

    const p1, 0x7f09057d

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->c:Landroid/widget/TextView;

    const p1, 0x7f09057e

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    const p1, 0x7f09114d

    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->e:Landroid/widget/RelativeLayout;

    const p1, 0x7f091513

    .line 8
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->f:Landroid/widget/TextView;

    const p1, 0x7f091514

    .line 9
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->g:Landroid/widget/TextView;

    const p1, 0x7f0908df

    .line 10
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->h:Lcom/facebook/drawee/view/SimpleDraweeView;

    const p1, 0x7f09114c

    .line 11
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->i:Landroid/widget/RelativeLayout;

    const p1, 0x7f09150f

    .line 12
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->j:Landroid/widget/TextView;

    const p1, 0x7f091509

    .line 13
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->k:Landroid/widget/TextView;

    const p1, 0x7f090ca9

    .line 14
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->l:Landroid/widget/LinearLayout;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Lcom/facebook/drawee/view/SimpleDraweeView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->c:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic c(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->a:Landroid/view/View;

    return-object p0
.end method

.method static synthetic d(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/RelativeLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->b:Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method static synthetic e(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->k:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic f(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/RelativeLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->i:Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method static synthetic g(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->l:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method static synthetic h(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->f:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic i(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->g:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic j(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Lcom/facebook/drawee/view/SimpleDraweeView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->h:Lcom/facebook/drawee/view/SimpleDraweeView;

    return-object p0
.end method

.method static synthetic k(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/RelativeLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->e:Landroid/widget/RelativeLayout;

    return-object p0
.end method
