.class Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$f2;
.super Lcom/join/mgps/viewholder/ViewHolderGameDetialMain;
.source "GameDetialModleThreeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "f2"
.end annotation


# instance fields
.field a:Lcom/facebook/drawee/view/SimpleDraweeView;

.field b:Lcom/join/android/app/component/video/StandardVideoView;

.field c:Landroid/widget/LinearLayout;

.field final synthetic d:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$f2;->d:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;

    .line 2
    invoke-direct {p0, p2}, Lcom/join/mgps/viewholder/ViewHolderGameDetialMain;-><init>(Landroid/view/View;)V

    const p1, 0x7f090915

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$f2;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    const p1, 0x7f091799

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/component/video/StandardVideoView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$f2;->b:Lcom/join/android/app/component/video/StandardVideoView;

    const p1, 0x7f091192

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$f2;->c:Landroid/widget/LinearLayout;

    return-void
.end method
