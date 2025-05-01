.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private a:Lcom/aggmoread/sdk/z/c/a/a/d/a/c;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/a$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/c;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 p1, 0x1

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/a;->a()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "mn = %s"

    :try_start_1
    new-array v3, p1, [Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v1, "onDownloadConfirm"

    :try_start_2
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/a;->a()Ljava/lang/String;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const-string v2, " args[3] = %s"

    :try_start_3
    new-array v3, p1, [Ljava/lang/Object;

    const/4 v4, 0x3

    aget-object v5, p3, v4

    aput-object v5, v3, v0

    invoke-static {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const-class v1, Lcom/qq/e/comm/compliance/DownloadConfirmCallBack;

    aget-object v2, p3, v4

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    if-eqz v2, :cond_0

    const-string v2, "onConfirm"

    :try_start_4
    new-array v3, v0, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    const-string v3, "onCancel"

    :try_start_5
    new-array v4, v0, [Ljava/lang/Class;

    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/a$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/c;

    if-eqz v3, :cond_0

    new-instance v4, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/a$c$a;

    invoke-direct {v4, p0, v2, p3, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/a$c$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/a$c;Ljava/lang/reflect/Method;[Ljava/lang/Object;Ljava/lang/reflect/Method;)V

    aget-object v1, p3, v0

    check-cast v1, Landroid/app/Activity;

    aget-object v2, p3, p1

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v3, v1, v2, v4}, Lcom/aggmoread/sdk/z/c/a/a/d/a/c;->a(Landroid/app/Activity;ILcom/aggmoread/sdk/z/c/a/a/d/a/c$b;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/a;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "dce = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p2, p0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/a;->a()Ljava/lang/String;

    move-result-object p3

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v0

    aput-object p2, v1, p1

    const-string p1, "t %s, r %s"

    invoke-static {p3, p1, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p2
.end method
