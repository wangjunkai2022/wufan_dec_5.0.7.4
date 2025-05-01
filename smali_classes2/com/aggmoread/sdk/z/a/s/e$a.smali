.class Lcom/aggmoread/sdk/z/a/s/e$a;
.super Landroid/view/OrientationEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/s/e;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/s/e;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/s/e;Landroid/content/Context;I)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-direct {p0, p2, p3}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public onOrientationChanged(I)V
    .locals 7

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/a/s/e;->a(Lcom/aggmoread/sdk/z/a/s/e;I)Lcom/aggmoread/sdk/z/a/s/e$b;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/e;->a(Lcom/aggmoread/sdk/z/a/s/e;)Lcom/aggmoread/sdk/z/a/s/e$b;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/e;->b(Lcom/aggmoread/sdk/z/a/s/e;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/a/s/e;->a(Lcom/aggmoread/sdk/z/a/s/e;Lcom/aggmoread/sdk/z/a/s/e$b;)Lcom/aggmoread/sdk/z/a/s/e$b;

    new-array v0, v2, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const-string p1, "\u65b9\u5411\u6539\u53d8, \u5f00\u59cb\u8ba1\u65f6, \u5f53\u524d\u662f\u65b9\u5411\u4e3a%s"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    goto/16 :goto_1

    :cond_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/e;->c(Lcom/aggmoread/sdk/z/a/s/e;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/e;->d(Lcom/aggmoread/sdk/z/a/s/e;)J

    move-result-wide v3

    const-wide/16 v5, 0x5dc

    cmp-long v0, v3, v5

    if-lez v0, :cond_5

    sget-object v0, Lcom/aggmoread/sdk/z/a/s/e$b;->d:Lcom/aggmoread/sdk/z/a/s/e$b;

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/e;->e(Lcom/aggmoread/sdk/z/a/s/e;)I

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/s/e;->b(Lcom/aggmoread/sdk/z/a/s/e;I)I

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/e;->f(Lcom/aggmoread/sdk/z/a/s/e;)Lcom/aggmoread/sdk/z/a/s/e$c;

    move-result-object v0

    if-eqz v0, :cond_5

    :goto_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/e;->f(Lcom/aggmoread/sdk/z/a/s/e;)Lcom/aggmoread/sdk/z/a/s/e$c;

    move-result-object v0

    invoke-interface {v0, v1, p1}, Lcom/aggmoread/sdk/z/a/s/e$c;->a(ILcom/aggmoread/sdk/z/a/s/e$b;)V

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/aggmoread/sdk/z/a/s/e$b;->b:Lcom/aggmoread/sdk/z/a/s/e$b;

    if-ne p1, v0, :cond_3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/e;->e(Lcom/aggmoread/sdk/z/a/s/e;)I

    move-result v0

    if-eq v0, v2, :cond_5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0, v2}, Lcom/aggmoread/sdk/z/a/s/e;->b(Lcom/aggmoread/sdk/z/a/s/e;I)I

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/e;->f(Lcom/aggmoread/sdk/z/a/s/e;)Lcom/aggmoread/sdk/z/a/s/e$c;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/e;->f(Lcom/aggmoread/sdk/z/a/s/e;)Lcom/aggmoread/sdk/z/a/s/e$c;

    move-result-object v0

    invoke-interface {v0, v2, p1}, Lcom/aggmoread/sdk/z/a/s/e$c;->a(ILcom/aggmoread/sdk/z/a/s/e$b;)V

    goto :goto_1

    :cond_3
    sget-object v0, Lcom/aggmoread/sdk/z/a/s/e$b;->c:Lcom/aggmoread/sdk/z/a/s/e$b;

    if-ne p1, v0, :cond_4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/e;->e(Lcom/aggmoread/sdk/z/a/s/e;)I

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/s/e;->b(Lcom/aggmoread/sdk/z/a/s/e;I)I

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/e;->f(Lcom/aggmoread/sdk/z/a/s/e;)Lcom/aggmoread/sdk/z/a/s/e$c;

    move-result-object v0

    if-eqz v0, :cond_5

    goto :goto_0

    :cond_4
    sget-object v0, Lcom/aggmoread/sdk/z/a/s/e$b;->e:Lcom/aggmoread/sdk/z/a/s/e$b;

    if-ne p1, v0, :cond_5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/e;->e(Lcom/aggmoread/sdk/z/a/s/e;)I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/s/e;->b(Lcom/aggmoread/sdk/z/a/s/e;I)I

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/e$a;->a:Lcom/aggmoread/sdk/z/a/s/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/s/e;->f(Lcom/aggmoread/sdk/z/a/s/e;)Lcom/aggmoread/sdk/z/a/s/e$c;

    move-result-object v0

    if-eqz v0, :cond_5

    goto :goto_0

    :cond_5
    :goto_1
    return-void
.end method
