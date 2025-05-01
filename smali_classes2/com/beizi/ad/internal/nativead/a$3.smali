.class Lcom/beizi/ad/internal/nativead/a$3;
.super Ljava/lang/Object;
.source "BeiZiNativeAdResponse.java"

# interfaces
.implements Lcom/beizi/ad/internal/nativead/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/nativead/a;->regesterShow(Landroid/view/View;Lcom/beizi/ad/internal/nativead/NativeAdShownListener;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/beizi/ad/internal/nativead/a;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/nativead/a;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/nativead/a$3;->b:Lcom/beizi/ad/internal/nativead/a;

    iput-object p2, p0, Lcom/beizi/ad/internal/nativead/a$3;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$3;->b:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0}, Lcom/beizi/ad/internal/nativead/a;->g(Lcom/beizi/ad/internal/nativead/a;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$3;->b:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0}, Lcom/beizi/ad/internal/nativead/a;->g(Lcom/beizi/ad/internal/nativead/a;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$3;->b:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0}, Lcom/beizi/ad/internal/nativead/a;->g(Lcom/beizi/ad/internal/nativead/a;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 3
    new-instance v2, Lcom/beizi/ad/internal/o;

    iget-object v3, p0, Lcom/beizi/ad/internal/nativead/a$3;->b:Lcom/beizi/ad/internal/nativead/a;

    iget-object v4, p0, Lcom/beizi/ad/internal/nativead/a$3;->a:Landroid/view/View;

    invoke-virtual {v3, v1, v4}, Lcom/beizi/ad/internal/nativead/a;->a(Ljava/lang/String;Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/beizi/ad/internal/o;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$3;->b:Lcom/beizi/ad/internal/nativead/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/nativead/a;->c(Lcom/beizi/ad/internal/nativead/a;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    :cond_2
    :goto_1
    return-void
.end method
