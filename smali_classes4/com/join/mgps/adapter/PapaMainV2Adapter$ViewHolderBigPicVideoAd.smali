.class public Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "PapaMainV2Adapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/PapaMainV2Adapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ViewHolderBigPicVideoAd"
.end annotation


# instance fields
.field public a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public b:Landroid/widget/TextView;

.field public c:Landroid/widget/FrameLayout;

.field public d:Landroid/widget/TextView;

.field public e:Lcom/join/android/app/component/video/MultiStandVideo;

.field final synthetic f:Lcom/join/mgps/adapter/PapaMainV2Adapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/adapter/PapaMainV2Adapter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->f:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f0911a2

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    const p1, 0x7f09151e

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->b:Landroid/widget/TextView;

    const p1, 0x7f09059f

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->c:Landroid/widget/FrameLayout;

    const p1, 0x7f0914f9

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->d:Landroid/widget/TextView;

    const p1, 0x7f09180f

    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/component/video/MultiStandVideo;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->e:Lcom/join/android/app/component/video/MultiStandVideo;

    return-void
.end method
