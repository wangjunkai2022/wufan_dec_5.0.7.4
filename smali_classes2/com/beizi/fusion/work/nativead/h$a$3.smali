.class Lcom/beizi/fusion/work/nativead/h$a$3;
.super Ljava/lang/Object;
.source "GdtNativeCustomWorker.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/h$a;->onADLoaded(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/nativead/h$a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/h$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/h$a$3;->a:Lcom/beizi/fusion/work/nativead/h$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/h$a$3;->a:Lcom/beizi/fusion/work/nativead/h$a;

    iget-object p1, p1, Lcom/beizi/fusion/work/nativead/h$a;->a:Lcom/beizi/fusion/work/nativead/h;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/h;->s(Lcom/beizi/fusion/work/nativead/h;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/h$a$3;->a:Lcom/beizi/fusion/work/nativead/h$a;

    iget-object p1, p1, Lcom/beizi/fusion/work/nativead/h$a;->a:Lcom/beizi/fusion/work/nativead/h;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/h;->t(Lcom/beizi/fusion/work/nativead/h;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/h$a$3;->a:Lcom/beizi/fusion/work/nativead/h$a;

    iget-object p1, p1, Lcom/beizi/fusion/work/nativead/h$a;->a:Lcom/beizi/fusion/work/nativead/h;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/h;->v(Lcom/beizi/fusion/work/nativead/h;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/h$a$3;->a:Lcom/beizi/fusion/work/nativead/h$a;

    iget-object v0, v0, Lcom/beizi/fusion/work/nativead/h$a;->a:Lcom/beizi/fusion/work/nativead/h;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/nativead/h;->g()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/h$a$3;->a:Lcom/beizi/fusion/work/nativead/h$a;

    iget-object v1, v1, Lcom/beizi/fusion/work/nativead/h$a;->a:Lcom/beizi/fusion/work/nativead/h;

    invoke-static {v1}, Lcom/beizi/fusion/work/nativead/h;->u(Lcom/beizi/fusion/work/nativead/h;)Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;Landroid/view/View;)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/h$a$3;->a:Lcom/beizi/fusion/work/nativead/h$a;

    iget-object p1, p1, Lcom/beizi/fusion/work/nativead/h$a;->a:Lcom/beizi/fusion/work/nativead/h;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/h;->w(Lcom/beizi/fusion/work/nativead/h;)V

    return-void
.end method
