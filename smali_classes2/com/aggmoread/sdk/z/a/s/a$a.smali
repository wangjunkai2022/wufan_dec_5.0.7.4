.class Lcom/aggmoread/sdk/z/a/s/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/s/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/s/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/s/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$a;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 4
    .param p1    # Landroid/os/Message;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget p1, p1, Landroid/os/Message;->what:I

    packed-switch p1, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$a;->a:Lcom/aggmoread/sdk/z/a/s/a;

    const/4 v0, 0x7

    goto :goto_0

    :pswitch_1
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$a;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/s/a;->l()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$a;->a:Lcom/aggmoread/sdk/z/a/s/a;

    const/4 v0, 0x5

    goto :goto_0

    :pswitch_2
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$a;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/s/a;->e()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$a;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/s/a;->f(Lcom/aggmoread/sdk/z/a/s/a;)V

    goto :goto_1

    :pswitch_3
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$a;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/s/a;->l()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$a;->a:Lcom/aggmoread/sdk/z/a/s/a;

    const/4 v0, 0x3

    :goto_0
    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/a/s/a;->a(Lcom/aggmoread/sdk/z/a/s/a;I)V

    goto :goto_1

    :pswitch_4
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$a;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/s/a;->a(Lcom/aggmoread/sdk/z/a/s/a;)I

    move-result p1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a$a;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/a;->b(Lcom/aggmoread/sdk/z/a/s/a;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a$a;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/a;->d(Lcom/aggmoread/sdk/z/a/s/a;)Lcom/aggmoread/sdk/z/a/s/a$g;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a$a;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/a;->d(Lcom/aggmoread/sdk/z/a/s/a;)Lcom/aggmoread/sdk/z/a/s/a$g;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/s/a$g;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x2

    iput v1, v0, Landroid/os/Message;->what:I

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a$a;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/s/a;->e(Lcom/aggmoread/sdk/z/a/s/a;)Landroid/os/Handler;

    move-result-object v1

    rem-int/lit16 p1, p1, 0x3e8

    rsub-int p1, p1, 0x3e8

    int-to-long v2, p1

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_1

    :pswitch_5
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$a;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/s/a;->e()V

    :cond_0
    :goto_1
    const/4 p1, 0x0

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
