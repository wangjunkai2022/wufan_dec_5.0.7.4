.class Lcom/beizi/fusion/widget/dialog/dislike/a$g$a;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "DislikeDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/widget/dialog/dislike/a$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Landroid/widget/TextView;

.field final synthetic b:Lcom/beizi/fusion/widget/dialog/dislike/a$g;


# direct methods
.method public constructor <init>(Lcom/beizi/fusion/widget/dialog/dislike/a$g;Landroid/view/View;)V
    .locals 0
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$g$a;->b:Lcom/beizi/fusion/widget/dialog/dislike/a$g;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 3
    sget p1, Lcom/beizi/fusion/R$id;->beizi_dislike_item_multi_two_recycleview_item:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$g$a;->a:Landroid/widget/TextView;

    return-void
.end method
