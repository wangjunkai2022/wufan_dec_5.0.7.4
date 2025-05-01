.class Lcom/join/mgps/base/BaseViewHolder$a;
.super Ljava/lang/Object;
.source "BaseViewHolder.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/base/BaseViewHolder;->addOnClickListener([I)Lcom/join/mgps/base/BaseViewHolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/base/BaseViewHolder;


# direct methods
.method constructor <init>(Lcom/join/mgps/base/BaseViewHolder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/base/BaseViewHolder$a;->b:Lcom/join/mgps/base/BaseViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/base/BaseViewHolder$a;->b:Lcom/join/mgps/base/BaseViewHolder;

    invoke-static {v0}, Lcom/join/mgps/base/BaseViewHolder;->access$000(Lcom/join/mgps/base/BaseViewHolder;)Lcom/join/mgps/base/BaseQuickAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getOnItemChildClickListener()Lcom/join/mgps/base/BaseQuickAdapter$h;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/base/BaseViewHolder$a;->b:Lcom/join/mgps/base/BaseViewHolder;

    invoke-static {v0}, Lcom/join/mgps/base/BaseViewHolder;->access$000(Lcom/join/mgps/base/BaseViewHolder;)Lcom/join/mgps/base/BaseQuickAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getOnItemChildClickListener()Lcom/join/mgps/base/BaseQuickAdapter$h;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/base/BaseViewHolder$a;->b:Lcom/join/mgps/base/BaseViewHolder;

    invoke-static {v1}, Lcom/join/mgps/base/BaseViewHolder;->access$000(Lcom/join/mgps/base/BaseViewHolder;)Lcom/join/mgps/base/BaseQuickAdapter;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/base/BaseViewHolder$a;->b:Lcom/join/mgps/base/BaseViewHolder;

    invoke-static {v2}, Lcom/join/mgps/base/BaseViewHolder;->access$100(Lcom/join/mgps/base/BaseViewHolder;)I

    move-result v2

    invoke-interface {v0, v1, p1, v2}, Lcom/join/mgps/base/BaseQuickAdapter$h;->onItemChildClick(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V

    :cond_0
    return-void
.end method
