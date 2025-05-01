.class final Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter$SimpleViewHolder;
.super Lcom/join/mgps/base/BaseViewHolder;
.source "XQuickRecyclerView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "SimpleViewHolder"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;


# direct methods
.method public constructor <init>(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter$SimpleViewHolder;->this$0:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;

    .line 2
    invoke-direct {p0, p2}, Lcom/join/mgps/base/BaseViewHolder;-><init>(Landroid/view/View;)V

    return-void
.end method
