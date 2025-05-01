.class Lcom/join/mgps/activity/GamedetialModleBtFragemnt$y;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "GamedetialModleBtFragemnt.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/GamedetialModleBtFragemnt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "y"
.end annotation


# instance fields
.field a:Landroid/widget/ImageView;

.field final synthetic b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$y;->b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f090810

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$y;->a:Landroid/widget/ImageView;

    return-void
.end method
