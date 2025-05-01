.class Lcom/join/mgps/fragment/CloudListFragmentV2$h;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "CloudListFragmentV2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/CloudListFragmentV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "h"
.end annotation


# instance fields
.field a:Lcom/join/mgps/customview/ClouldItemView3;

.field b:Landroid/widget/LinearLayout;

.field c:Landroid/widget/TextView;

.field d:Landroid/widget/TextView;

.field final synthetic e:Lcom/join/mgps/fragment/CloudListFragmentV2;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/CloudListFragmentV2;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/CloudListFragmentV2;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$h;->e:Lcom/join/mgps/fragment/CloudListFragmentV2;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f0903b4

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/customview/ClouldItemView3;

    iput-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$h;->a:Lcom/join/mgps/customview/ClouldItemView3;

    const p1, 0x7f090d2b

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$h;->b:Landroid/widget/LinearLayout;

    const p1, 0x7f0916a0

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$h;->c:Landroid/widget/TextView;

    const p1, 0x7f0916bf

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$h;->d:Landroid/widget/TextView;

    return-void
.end method
