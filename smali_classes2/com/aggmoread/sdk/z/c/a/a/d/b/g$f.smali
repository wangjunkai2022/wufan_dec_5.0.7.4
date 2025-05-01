.class Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/d/b/g$k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(Lcom/aggmoread/sdk/z/c/a/a/c/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;[BLcom/aggmoread/sdk/z/c/a/a/d/b/i;)V
    .locals 6

    if-eqz p3, :cond_0

    new-instance p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$a;

    invoke-direct {p2, p0, p3, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-static {p2}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    iget-object p2, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object p3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->m:Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p2, p3, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;I)I

    move-result p2

    if-lez p2, :cond_1

    iget-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object p3, p3, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->C:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-virtual {p3}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->d()I

    move-result p3

    if-gt p2, p3, :cond_1

    new-instance p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$b;

    invoke-direct {p2, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-static {p2}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    iget-object p2, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object p3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->l:Ljava/lang/Object;

    invoke-virtual {p2, p3, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;I)I

    move-result p2

    if-lez p2, :cond_2

    iget-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object p3, p3, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->B:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-virtual {p3}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->d()I

    move-result p3

    if-gt p2, p3, :cond_2

    new-instance p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$c;

    invoke-direct {p2, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$c;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-static {p2}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    return-void

    :cond_2
    iget-object p2, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object p3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->k:Ljava/lang/Object;

    invoke-virtual {p2, p3, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;I)I

    move-result p2

    if-lez p2, :cond_3

    iget-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object p3, p3, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->E:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-virtual {p3}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->d()I

    move-result p3

    if-gt p2, p3, :cond_3

    new-instance p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$d;

    invoke-direct {p2, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$d;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-static {p2}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    return-void

    :cond_3
    iget-object p2, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object p3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->j:Ljava/lang/Object;

    invoke-virtual {p2, p3, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;I)I

    move-result p2

    if-lez p2, :cond_4

    iget-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object p3, p3, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->D:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-virtual {p3}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->d()I

    move-result p3

    if-gt p2, p3, :cond_4

    new-instance p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$e;

    invoke-direct {p2, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$e;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-static {p2}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    return-void

    :cond_4
    iget-object p2, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object p3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->v:Ljava/lang/Object;

    invoke-virtual {p2, p3, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;I)I

    move-result p2

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->i:Ljava/lang/String;

    aput-object v1, p3, v0

    const-string v0, "REQ_%s_LAST"

    invoke-static {v0, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    if-lez p2, :cond_5

    mul-int/lit16 p2, p2, 0x3e8

    int-to-long v0, p2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->a()Lcom/aggmoread/sdk/z/c/a/a/e/h;

    move-result-object p2

    const-wide/16 v4, 0x0

    invoke-virtual {p2, p3, v4, v5}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->a(Ljava/lang/String;J)J

    move-result-wide v4

    sub-long/2addr v2, v4

    cmp-long p2, v0, v2

    if-ltz p2, :cond_5

    new-instance p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$f;

    invoke-direct {p2, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f$f;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-static {p2}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    return-void

    :cond_5
    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    invoke-virtual {p2, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->a()Lcom/aggmoread/sdk/z/c/a/a/e/h;

    move-result-object p2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p2, p3, v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->b(Ljava/lang/String;J)V

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a()Z

    move-result p2

    if-eqz p2, :cond_6

    const-string p2, "AMSdkThread"

    const-string p3, "cc bid "

    invoke-static {p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->a()Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;

    move-result-object p2

    iget-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    invoke-virtual {p2, p3, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Z

    move-result p2

    if-eqz p2, :cond_6

    return-void

    :cond_6
    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    invoke-static {p2, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    return-void
.end method
