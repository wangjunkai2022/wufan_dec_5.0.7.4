.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;


# direct methods
.method private constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;)V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "onAdClicked"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;->l()V

    goto :goto_0

    :cond_0
    const-string p2, "onAdShow"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;->m()V

    goto :goto_0

    :cond_1
    const-string p2, "onVideoPlayStart"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;->r()V

    goto :goto_0

    :cond_2
    const-string p2, "onVideoPlayPause"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;->p()V

    goto :goto_0

    :cond_3
    const-string p2, "onVideoPlayResume"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;->q()V

    goto :goto_0

    :cond_4
    const-string p2, "onVideoPlayEnd"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;->n()V

    goto :goto_0

    :cond_5
    const-string p2, "onVideoPlayError"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/e/b;->o()V

    :cond_6
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
