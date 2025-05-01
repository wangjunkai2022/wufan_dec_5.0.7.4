.class Lcom/beizi/fusion/work/nativead/b$6;
.super Ljava/lang/Object;
.source "BaseBeiZiNativeWorker.java"

# interfaces
.implements Lcom/beizi/ad/internal/nativead/NativeAdShownListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/b;->aI()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/nativead/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/b$6;->a:Lcom/beizi/fusion/work/nativead/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdShown()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$6;->a:Lcom/beizi/fusion/work/nativead/b;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/nativead/b;->b(Lcom/beizi/fusion/work/nativead/b;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$6;->a:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->l(Lcom/beizi/fusion/work/nativead/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$6;->a:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->m(Lcom/beizi/fusion/work/nativead/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$6;->a:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->n(Lcom/beizi/fusion/work/nativead/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b$6;->a:Lcom/beizi/fusion/work/nativead/b;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/nativead/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$6;->a:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->o(Lcom/beizi/fusion/work/nativead/b;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$6;->a:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->p(Lcom/beizi/fusion/work/nativead/b;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$6;->a:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->q(Lcom/beizi/fusion/work/nativead/b;)V

    return-void
.end method
