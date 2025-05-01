.class Lcom/join/mgps/base/BaseQuickAdapter$g;
.super Ljava/lang/Object;
.source "BaseQuickAdapter.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/base/BaseQuickAdapter;->autoLoadMore(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/base/BaseQuickAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/base/BaseQuickAdapter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/base/BaseQuickAdapter$g;->b:Lcom/join/mgps/base/BaseQuickAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/base/BaseQuickAdapter$g;->b:Lcom/join/mgps/base/BaseQuickAdapter;

    invoke-static {v0}, Lcom/join/mgps/base/BaseQuickAdapter;->access$500(Lcom/join/mgps/base/BaseQuickAdapter;)Lcom/join/mgps/base/BaseQuickAdapter$l;

    move-result-object v0

    invoke-interface {v0}, Lcom/join/mgps/base/BaseQuickAdapter$l;->onLoadMoreRequested()V

    return-void
.end method
