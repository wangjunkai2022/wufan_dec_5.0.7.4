.class Lcom/join/mgps/adapter/MyGameAdapterV1$a;
.super Ljava/lang/Object;
.source "MyGameAdapterV1.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/MyGameAdapterV1;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/adapter/MyGameAdapterV1;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/MyGameAdapterV1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$a;->a:Lcom/join/mgps/adapter/MyGameAdapterV1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/GridLayoutManager;I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$a;->a:Lcom/join/mgps/adapter/MyGameAdapterV1;

    invoke-virtual {v0, p2}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    move-result p1

    return p1

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$a;->a:Lcom/join/mgps/adapter/MyGameAdapterV1;

    invoke-virtual {p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/adapter/MyGameAdapterV1$g;

    invoke-virtual {p1}, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->b()I

    move-result p1

    return p1
.end method
