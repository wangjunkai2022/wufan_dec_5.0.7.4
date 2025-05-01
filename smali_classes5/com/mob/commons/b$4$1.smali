.class Lcom/mob/commons/b$4$1;
.super Lcom/mob/tools/utils/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mob/commons/b$4;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/mob/tools/utils/e<",
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/mob/commons/b$4;


# direct methods
.method constructor <init>(Lcom/mob/commons/b$4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/mob/commons/b$4$1;->a:Lcom/mob/commons/b$4;

    invoke-direct {p0}, Lcom/mob/tools/utils/e;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Lcom/mob/commons/b$4$1;->a(Ljava/util/HashMap;)V

    return-void
.end method

.method public a(Ljava/util/HashMap;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/mob/commons/b$4$1;->a:Lcom/mob/commons/b$4;

    iget v1, v1, Lcom/mob/commons/b$4;->b:I

    invoke-static {p1, v1}, Lcom/mob/commons/b;->a(Ljava/util/HashMap;I)V

    if-nez p1, :cond_0

    .line 3
    invoke-static {}, Lcom/mob/commons/a/l;->a()Lcom/mob/commons/a/l;

    move-result-object p1

    const-wide/32 v1, 0x493e0

    iget-object v3, p0, Lcom/mob/commons/b$4$1;->a:Lcom/mob/commons/b$4;

    iget-object v4, v3, Lcom/mob/commons/b$4;->a:Ljava/lang/String;

    iget v3, v3, Lcom/mob/commons/b$4;->b:I

    invoke-static {v4, v3}, Lcom/mob/commons/b;->a(Ljava/lang/String;I)Lcom/mob/tools/utils/i;

    move-result-object v3

    invoke-virtual {p1, v1, v2, v3}, Lcom/mob/commons/a/l;->e(JLjava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :cond_0
    invoke-static {}, Lcom/mob/commons/b;->l()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Lcom/mob/commons/b;->l()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    throw p1
.end method
