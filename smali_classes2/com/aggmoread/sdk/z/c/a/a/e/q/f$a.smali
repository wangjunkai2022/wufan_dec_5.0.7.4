.class final Lcom/aggmoread/sdk/z/c/a/a/e/q/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/e/q/f$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/e/q/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/aggmoread/sdk/z/c/a/a/e/q/f;
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/e/q/f;->b:Lcom/aggmoread/sdk/z/c/a/a/e/q/f;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    new-instance p1, Lcom/aggmoread/sdk/z/c/a/a/e/q/b;

    invoke-direct {p1}, Lcom/aggmoread/sdk/z/c/a/a/e/q/b;-><init>()V

    return-object p1

    :cond_1
    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/e/q/f;->b:Lcom/aggmoread/sdk/z/c/a/a/e/q/f;

    return-object p1
.end method
