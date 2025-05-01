.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;


# direct methods
.method private constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;)V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "onAdClicked"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;->onAdClicked()V

    goto/16 :goto_0

    :cond_0
    const-string p2, "onPageDismiss"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;->x()V

    goto/16 :goto_0

    :cond_1
    const-string p2, "onVideoPlayError"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;

    aget-object p2, p3, v1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    aget-object p3, p3, v0

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;->c(II)V

    goto/16 :goto_0

    :cond_2
    const-string p2, "onVideoPlayEnd"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;->z()V

    goto :goto_0

    :cond_3
    const-string p2, "onVideoSkipToEnd"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;

    aget-object p2, p3, v1

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;->a(J)V

    goto :goto_0

    :cond_4
    const-string p2, "onVideoPlayStart"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;->A()V

    goto :goto_0

    :cond_5
    const-string p2, "onRewardVerify"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;->y()V

    goto :goto_0

    :cond_6
    const-string p2, "onRewardStepVerify"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;

    aget-object p2, p3, v1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    aget-object p3, p3, v0

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;->b(II)V

    goto :goto_0

    :cond_7
    const-string p2, "onExtraRewardVerify"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;

    aget-object p2, p3, v1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/i/a;->e(I)V

    :cond_8
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
