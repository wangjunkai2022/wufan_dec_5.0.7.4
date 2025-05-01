.class final Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d;->a(Ljava/lang/Object;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$d;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$d;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "onReward"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "GDT_PAH_TAG"

    const-string p2, "onReward enter"

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    aget-object p2, p3, p1

    instance-of p2, p2, Ljava/util/Map;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$d;

    aget-object p1, p3, p1

    check-cast p1, Ljava/util/Map;

    invoke-interface {p2, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$d;->onReward(Ljava/util/Map;)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
