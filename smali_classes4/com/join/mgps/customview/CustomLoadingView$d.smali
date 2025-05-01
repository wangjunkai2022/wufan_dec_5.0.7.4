.class Lcom/join/mgps/customview/CustomLoadingView$d;
.super Ljava/lang/Object;
.source "CustomLoadingView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/CustomLoadingView;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/CustomLoadingView;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/CustomLoadingView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/CustomLoadingView$d;->b:Lcom/join/mgps/customview/CustomLoadingView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/CustomLoadingView$d;->b:Lcom/join/mgps/customview/CustomLoadingView;

    invoke-static {v0}, Lcom/join/mgps/customview/CustomLoadingView;->i(Lcom/join/mgps/customview/CustomLoadingView;)Lcom/join/mgps/customview/CustomLoadingView$e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/customview/CustomLoadingView$d;->b:Lcom/join/mgps/customview/CustomLoadingView;

    invoke-static {v0}, Lcom/join/mgps/customview/CustomLoadingView;->i(Lcom/join/mgps/customview/CustomLoadingView;)Lcom/join/mgps/customview/CustomLoadingView$e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/CustomLoadingView$e;->a(Landroid/view/View;)V

    :cond_0
    return-void
.end method
