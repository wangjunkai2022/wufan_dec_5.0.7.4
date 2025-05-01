.class Lcom/kingja/loadsir/core/b$a;
.super Ljava/lang/Object;
.source "LoadService.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kingja/loadsir/core/b;->e(Lcom/kingja/loadsir/core/c$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/Class;

.field final synthetic c:Lcom/kingja/loadsir/core/b;


# direct methods
.method constructor <init>(Lcom/kingja/loadsir/core/b;Ljava/lang/Class;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kingja/loadsir/core/b$a;->c:Lcom/kingja/loadsir/core/b;

    iput-object p2, p0, Lcom/kingja/loadsir/core/b$a;->b:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kingja/loadsir/core/b$a;->b:Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kingja/loadsir/core/b$a;->c:Lcom/kingja/loadsir/core/b;

    invoke-static {v0}, Lcom/kingja/loadsir/core/b;->a(Lcom/kingja/loadsir/core/b;)Lcom/kingja/loadsir/core/LoadLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/kingja/loadsir/core/b$a;->b:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Lcom/kingja/loadsir/core/LoadLayout;->e(Ljava/lang/Class;)V

    :cond_0
    return-void
.end method
