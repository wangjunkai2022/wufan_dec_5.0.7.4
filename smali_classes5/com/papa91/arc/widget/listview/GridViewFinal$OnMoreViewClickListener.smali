.class Lcom/papa91/arc/widget/listview/GridViewFinal$OnMoreViewClickListener;
.super Ljava/lang/Object;
.source "GridViewFinal.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/papa91/arc/widget/listview/GridViewFinal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "OnMoreViewClickListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/papa91/arc/widget/listview/GridViewFinal;


# direct methods
.method constructor <init>(Lcom/papa91/arc/widget/listview/GridViewFinal;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewFinal$OnMoreViewClickListener;->this$0:Lcom/papa91/arc/widget/listview/GridViewFinal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/papa91/arc/widget/listview/GridViewFinal$OnMoreViewClickListener;->this$0:Lcom/papa91/arc/widget/listview/GridViewFinal;

    iget-boolean v0, p1, Lcom/papa91/arc/widget/listview/GridViewFinal;->mHasLoadMore:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/papa91/arc/widget/listview/GridViewFinal;->executeLoadMore()V

    :cond_0
    return-void
.end method
