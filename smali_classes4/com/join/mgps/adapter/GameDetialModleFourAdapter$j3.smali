.class Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;
.super Lcom/join/mgps/viewholder/ViewHolderGameDetialMain;
.source "GameDetialModleFourAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/GameDetialModleFourAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "j3"
.end annotation


# instance fields
.field a:Lit/sephiroth/android/library/widget/HListView;

.field private b:Lcom/facebook/drawee/view/SimpleDraweeView;

.field private c:Landroid/widget/TextView;

.field public d:Landroid/widget/ProgressBar;

.field public e:Landroid/widget/ProgressBar;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/RelativeLayout;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/LinearLayout;

.field private l:Landroid/widget/LinearLayout;

.field public m:Landroid/widget/TextView;

.field public n:Landroid/widget/TextView;

.field public o:Landroid/widget/TextView;

.field public p:Landroid/widget/TextView;

.field q:Landroid/widget/TextView;

.field r:Landroid/widget/LinearLayout;

.field final synthetic s:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->s:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    .line 2
    invoke-direct {p0, p2}, Lcom/join/mgps/viewholder/ViewHolderGameDetialMain;-><init>(Landroid/view/View;)V

    const p1, 0x7f0911f6

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lit/sephiroth/android/library/widget/HListView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->a:Lit/sephiroth/android/library/widget/HListView;

    const p1, 0x7f090e0c

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    const p1, 0x7f090e0a

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->c:Landroid/widget/TextView;

    const p1, 0x7f091051

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->d:Landroid/widget/ProgressBar;

    const p1, 0x7f09104a

    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->e:Landroid/widget/ProgressBar;

    const p1, 0x7f09145e

    .line 8
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->g:Landroid/widget/LinearLayout;

    const p1, 0x7f09103b

    .line 9
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->f:Landroid/widget/TextView;

    const p1, 0x7f09109f

    .line 10
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->h:Landroid/widget/RelativeLayout;

    const p1, 0x7f0910a0

    .line 11
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->i:Landroid/widget/RelativeLayout;

    const p1, 0x7f090e0d

    .line 12
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->j:Landroid/widget/TextView;

    const p1, 0x7f090c7d

    .line 13
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->k:Landroid/widget/LinearLayout;

    const p1, 0x7f0900f1

    .line 14
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->m:Landroid/widget/TextView;

    const p1, 0x7f0915b0

    .line 15
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->n:Landroid/widget/TextView;

    const p1, 0x7f090d81

    .line 16
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->p:Landroid/widget/TextView;

    const p1, 0x7f0915bd

    .line 17
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->q:Landroid/widget/TextView;

    const p1, 0x7f091174

    .line 18
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->l:Landroid/widget/LinearLayout;

    const p1, 0x7f090e0b

    .line 19
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->o:Landroid/widget/TextView;

    const p1, 0x7f09145f    # 1.8221E38f

    .line 20
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->r:Landroid/widget/LinearLayout;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->l:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->c:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic c(Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;)Lcom/facebook/drawee/view/SimpleDraweeView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    return-object p0
.end method

.method static synthetic d(Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->g:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method static synthetic e(Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->j:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic f(Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;)Landroid/widget/RelativeLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->h:Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method static synthetic g(Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$j3;->k:Landroid/widget/LinearLayout;

    return-object p0
.end method
