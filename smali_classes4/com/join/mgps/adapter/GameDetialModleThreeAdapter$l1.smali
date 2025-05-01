.class Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$l1;
.super Lcom/join/mgps/viewholder/ViewHolderGameDetialMain;
.source "GameDetialModleThreeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "l1"
.end annotation


# instance fields
.field a:Landroid/widget/RelativeLayout;

.field b:Lcom/facebook/drawee/view/SimpleDraweeView;

.field c:Landroid/widget/ImageView;

.field d:Landroid/widget/TextView;

.field e:Landroid/widget/TextView;

.field f:Landroid/widget/TextView;

.field g:Landroid/widget/TextView;

.field h:Lcom/join/mgps/customview/VipView;

.field public i:Landroid/view/View;

.field final synthetic j:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$l1;->j:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;

    .line 2
    invoke-direct {p0, p2}, Lcom/join/mgps/viewholder/ViewHolderGameDetialMain;-><init>(Landroid/view/View;)V

    const p1, 0x7f090dbd

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$l1;->a:Landroid/widget/RelativeLayout;

    const p1, 0x7f09175e

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$l1;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    const p1, 0x7f090fcc

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$l1;->c:Landroid/widget/ImageView;

    const p1, 0x7f091761

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$l1;->d:Landroid/widget/TextView;

    const p1, 0x7f091446

    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$l1;->e:Landroid/widget/TextView;

    const p1, 0x7f09039c

    .line 8
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$l1;->f:Landroid/widget/TextView;

    const p1, 0x7f090fcd

    .line 9
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$l1;->g:Landroid/widget/TextView;

    const p1, 0x7f090c64

    .line 10
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/customview/VipView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$l1;->h:Lcom/join/mgps/customview/VipView;

    const p1, 0x7f090c6b

    .line 11
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$l1;->i:Landroid/view/View;

    return-void
.end method
