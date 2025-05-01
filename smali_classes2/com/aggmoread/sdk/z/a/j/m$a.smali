.class Lcom/aggmoread/sdk/z/a/j/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/j/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/j/m;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/j/m;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 8

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget v3, p1, Landroid/os/Message;->arg1:I

    iget v0, p1, Landroid/os/Message;->arg2:I

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/j/m;->a(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/k;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/j/m;->a(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/k;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/aggmoread/sdk/z/a/j/k;->a(I)V

    :cond_0
    const-wide/16 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    :cond_1
    move-wide v6, v1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/m;->b(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/i;

    move-result-object v2

    int-to-long v4, v0

    invoke-virtual/range {v2 .. v7}, Lcom/aggmoread/sdk/z/a/j/i;->a(IJJ)V

    goto/16 :goto_1

    :cond_2
    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/m;->a(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/k;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/m;->a(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/k;

    move-result-object p1

    sget-object v0, Lcom/aggmoread/sdk/z/a/j/o;->b:Lcom/aggmoread/sdk/z/a/j/o;

    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/z/a/j/k;->a(Lcom/aggmoread/sdk/z/a/j/o;)V

    :cond_3
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/m;->b(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/j/i;->b()V

    goto/16 :goto_1

    :cond_4
    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/j/m;->a(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/k;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/j/m;->a(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/k;

    move-result-object v0

    sget-object v1, Lcom/aggmoread/sdk/z/a/j/o;->d:Lcom/aggmoread/sdk/z/a/j/o;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/a/j/k;->a(Lcom/aggmoread/sdk/z/a/j/o;)V

    :cond_5
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/j/m;->b(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/i;

    move-result-object v0

    check-cast p1, Ljava/io/File;

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/a/j/i;->a(Ljava/io/File;)V

    goto :goto_1

    :cond_6
    const/4 v1, 0x4

    if-ne v0, v1, :cond_9

    iget v0, p1, Landroid/os/Message;->arg1:I

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/j/m;->a(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/k;

    move-result-object v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/j/m;->a(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/k;

    move-result-object v1

    sget-object v2, Lcom/aggmoread/sdk/z/a/j/o;->e:Lcom/aggmoread/sdk/z/a/j/o;

    invoke-virtual {v1, v2}, Lcom/aggmoread/sdk/z/a/j/k;->a(Lcom/aggmoread/sdk/z/a/j/o;)V

    :cond_7
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/j/m;->b(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/i;

    move-result-object v1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_8
    const-string p1, "null msg"

    :goto_0
    invoke-virtual {v1, v0, p1}, Lcom/aggmoread/sdk/z/a/j/i;->a(ILjava/lang/String;)V

    goto :goto_1

    :cond_9
    const/4 v1, 0x7

    if-ne v0, v1, :cond_a

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/j/m;->a(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/k;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/j/m;->a(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/a/j/k;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_a
    const/4 p1, 0x5

    if-ne v0, p1, :cond_b

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/m;->b(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/j/i;->a()V

    goto :goto_1

    :cond_b
    const/4 p1, 0x6

    if-ne v0, p1, :cond_c

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/m$a;->a:Lcom/aggmoread/sdk/z/a/j/m;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/m;->b(Lcom/aggmoread/sdk/z/a/j/m;)Lcom/aggmoread/sdk/z/a/j/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/j/i;->c()V

    :cond_c
    :goto_1
    const/4 p1, 0x0

    return p1
.end method
