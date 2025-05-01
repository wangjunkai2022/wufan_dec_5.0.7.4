.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c;


# direct methods
.method private constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c;)V

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

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c;->s()V

    goto :goto_0

    :cond_0
    const-string p2, "onAdShow"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c;->t()V

    goto :goto_0

    :cond_1
    const-string p2, "onDislikeClicked"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c;->u()V

    goto :goto_0

    :cond_2
    const-string p2, "onDownloadTipsDialogShow"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c;->w()V

    goto :goto_0

    :cond_3
    const-string p2, "onDownloadTipsDialogDismiss"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/c;->v()V

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
