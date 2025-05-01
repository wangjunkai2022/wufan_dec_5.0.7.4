.class public Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "PapaMainV2Adapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/PapaMainV2Adapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ViewHolderBigPicVideo"
.end annotation


# instance fields
.field public a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public b:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public c:Landroid/widget/TextView;

.field public d:Landroid/widget/LinearLayout;

.field public e:Landroid/widget/TextView;

.field public f:Landroid/widget/TextView;

.field public g:Landroid/widget/ProgressBar;

.field public h:Landroid/widget/ProgressBar;

.field public i:Landroid/widget/TextView;

.field public j:Landroid/widget/FrameLayout;

.field public k:Landroid/widget/TextView;

.field public l:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public m:Landroid/widget/FrameLayout;

.field public n:Landroid/widget/ProgressBar;

.field public o:Lcom/join/android/app/component/video/MultiStandVideo;

.field final synthetic p:Lcom/join/mgps/adapter/PapaMainV2Adapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/adapter/PapaMainV2Adapter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->p:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f0911a2

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    const p1, 0x7f0908e4

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    const p1, 0x7f09151e

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->c:Landroid/widget/TextView;

    const p1, 0x7f090cb4

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->d:Landroid/widget/LinearLayout;

    const p1, 0x7f0900f1

    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->e:Landroid/widget/TextView;

    const p1, 0x7f090d81

    .line 8
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->f:Landroid/widget/TextView;

    const p1, 0x7f091051

    .line 9
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->g:Landroid/widget/ProgressBar;

    const p1, 0x7f09104a

    .line 10
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->h:Landroid/widget/ProgressBar;

    const p1, 0x7f091521

    .line 11
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->i:Landroid/widget/TextView;

    const p1, 0x7f09059f

    .line 12
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->j:Landroid/widget/FrameLayout;

    const p1, 0x7f0914f9

    .line 13
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->k:Landroid/widget/TextView;

    const p1, 0x7f090154

    .line 14
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->l:Lcom/facebook/drawee/view/SimpleDraweeView;

    const p1, 0x7f091792

    .line 15
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->m:Landroid/widget/FrameLayout;

    const p1, 0x7f090d5b

    .line 16
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->n:Landroid/widget/ProgressBar;

    const p1, 0x7f09180f

    .line 17
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/component/video/MultiStandVideo;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->o:Lcom/join/android/app/component/video/MultiStandVideo;

    return-void
.end method
