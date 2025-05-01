.class Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$m1;
.super Lcom/join/mgps/viewholder/ViewHolderGameDetialMain;
.source "GameDetialModleThreeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "m1"
.end annotation


# instance fields
.field a:Landroid/widget/RelativeLayout;

.field b:Landroid/widget/TextView;

.field c:Landroid/widget/TextView;

.field final synthetic d:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$m1;->d:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;

    .line 2
    invoke-direct {p0, p2}, Lcom/join/mgps/viewholder/ViewHolderGameDetialMain;-><init>(Landroid/view/View;)V

    const p1, 0x7f090348

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$m1;->a:Landroid/widget/RelativeLayout;

    const p1, 0x7f091292

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$m1;->b:Landroid/widget/TextView;

    const p1, 0x7f0906f8

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$m1;->c:Landroid/widget/TextView;

    return-void
.end method
