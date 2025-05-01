.class public Lcom/beizi/fusion/widget/dialog/dislike/a$h$a;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "DislikeDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/widget/dialog/dislike/a$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/widget/dialog/dislike/a$h;

.field private b:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lcom/beizi/fusion/widget/dialog/dislike/a$h;Landroid/view/View;)V
    .locals 0
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h$a;->a:Lcom/beizi/fusion/widget/dialog/dislike/a$h;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 3
    sget p1, Lcom/beizi/fusion/R$id;->beizi_dislike_item_multi_one_title:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h$a;->b:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/widget/dialog/dislike/a$h$a;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$h$a;->b:Landroid/widget/TextView;

    return-object p0
.end method
