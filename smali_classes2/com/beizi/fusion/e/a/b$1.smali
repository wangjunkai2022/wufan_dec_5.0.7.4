.class Lcom/beizi/fusion/e/a/b$1;
.super Ljava/lang/Object;
.source "DevicesIDsHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/e/a/b;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/beizi/fusion/e/a/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/e/a/b;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    iput-object p2, p0, Lcom/beizi/fusion/e/a/b$1;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/e/a/b$1;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v0, "ASUS"

    .line 2
    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    invoke-static {v1}, Lcom/beizi/fusion/e/a/b;->a(Lcom/beizi/fusion/e/a/b;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    new-instance v0, Lcom/beizi/fusion/e/a/a;

    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/beizi/fusion/e/a/a;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    invoke-static {v1}, Lcom/beizi/fusion/e/a/b;->b(Lcom/beizi/fusion/e/a/b;)Lcom/beizi/fusion/e/a/b$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/e/a/a;->a(Lcom/beizi/fusion/e/a/b$a;)V

    goto/16 :goto_2

    .line 4
    :cond_1
    invoke-static {}, Lcom/beizi/fusion/e/a/b;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5
    new-instance v0, Lcom/beizi/fusion/e/a/c;

    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/beizi/fusion/e/a/c;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    invoke-static {v1}, Lcom/beizi/fusion/e/a/b;->b(Lcom/beizi/fusion/e/a/b;)Lcom/beizi/fusion/e/a/b$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/e/a/c;->a(Lcom/beizi/fusion/e/a/b$a;)V

    goto/16 :goto_2

    .line 6
    :cond_2
    invoke-static {}, Lcom/beizi/fusion/e/a/b;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    new-instance v0, Lcom/beizi/fusion/e/a/h;

    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/beizi/fusion/e/a/h;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    invoke-static {v1}, Lcom/beizi/fusion/e/a/b;->b(Lcom/beizi/fusion/e/a/b;)Lcom/beizi/fusion/e/a/b$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/e/a/h;->a(Lcom/beizi/fusion/e/a/b$a;)Ljava/lang/String;

    goto/16 :goto_2

    :cond_3
    const-string v0, "ONEPLUS"

    .line 8
    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    invoke-static {v1}, Lcom/beizi/fusion/e/a/b;->a(Lcom/beizi/fusion/e/a/b;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 9
    new-instance v0, Lcom/beizi/fusion/e/a/g;

    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/beizi/fusion/e/a/g;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    invoke-static {v1}, Lcom/beizi/fusion/e/a/b;->b(Lcom/beizi/fusion/e/a/b;)Lcom/beizi/fusion/e/a/b$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/e/a/g;->a(Lcom/beizi/fusion/e/a/b$a;)Ljava/lang/String;

    goto/16 :goto_2

    :cond_4
    const-string v0, "ZTE"

    .line 10
    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    invoke-static {v1}, Lcom/beizi/fusion/e/a/b;->a(Lcom/beizi/fusion/e/a/b;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 11
    new-instance v0, Lcom/beizi/fusion/e/a/l;

    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/beizi/fusion/e/a/l;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    invoke-static {v1}, Lcom/beizi/fusion/e/a/b;->b(Lcom/beizi/fusion/e/a/b;)Lcom/beizi/fusion/e/a/b$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/e/a/l;->a(Lcom/beizi/fusion/e/a/b$a;)V

    goto/16 :goto_2

    :cond_5
    const-string v0, "FERRMEOS"

    .line 12
    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    invoke-static {v1}, Lcom/beizi/fusion/e/a/b;->a(Lcom/beizi/fusion/e/a/b;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    invoke-virtual {v0}, Lcom/beizi/fusion/e/a/b;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_1

    :cond_6
    const-string v0, "SSUI"

    .line 13
    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    invoke-static {v1}, Lcom/beizi/fusion/e/a/b;->a(Lcom/beizi/fusion/e/a/b;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    invoke-virtual {v0}, Lcom/beizi/fusion/e/a/b;->d()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    const-string v0, "SAMSUNG"

    .line 14
    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    invoke-static {v1}, Lcom/beizi/fusion/e/a/b;->a(Lcom/beizi/fusion/e/a/b;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 15
    new-instance v0, Lcom/beizi/fusion/e/a/i;

    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/beizi/fusion/e/a/i;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    invoke-static {v1}, Lcom/beizi/fusion/e/a/b;->b(Lcom/beizi/fusion/e/a/b;)Lcom/beizi/fusion/e/a/b$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/e/a/i;->a(Lcom/beizi/fusion/e/a/b$a;)V

    goto :goto_2

    .line 16
    :cond_8
    :goto_0
    new-instance v0, Lcom/beizi/fusion/e/a/l;

    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/beizi/fusion/e/a/l;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    invoke-static {v1}, Lcom/beizi/fusion/e/a/b;->b(Lcom/beizi/fusion/e/a/b;)Lcom/beizi/fusion/e/a/b$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/e/a/l;->a(Lcom/beizi/fusion/e/a/b$a;)V

    goto :goto_2

    .line 17
    :cond_9
    :goto_1
    new-instance v0, Lcom/beizi/fusion/e/a/l;

    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/beizi/fusion/e/a/l;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/beizi/fusion/e/a/b$1;->b:Lcom/beizi/fusion/e/a/b;

    invoke-static {v1}, Lcom/beizi/fusion/e/a/b;->b(Lcom/beizi/fusion/e/a/b;)Lcom/beizi/fusion/e/a/b$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/e/a/l;->a(Lcom/beizi/fusion/e/a/b$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    const-string v0, "BeiZis"

    const-string v1, "getIDFromNewThead exception"

    .line 18
    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_a
    :goto_2
    return-void
.end method
