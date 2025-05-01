.class Lcom/xinzhu/overmind/client/hook/proxies/am/b$s;
.super Lcom/xinzhu/overmind/client/hook/e;
.source "ActivityManagerStub.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xinzhu/overmind/client/hook/proxies/am/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "s"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xinzhu/overmind/client/hook/e;-><init>()V

    return-void
.end method


# virtual methods
.method protected c()Ljava/lang/String;
    .locals 1

    const-string v0, "handleApplicationWtf"

    return-object v0
.end method

.method protected d(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getStackTraceElement()V

    .line 2
    new-instance v0, Lcom/xinzhu/haunted/android/app/i$a;

    const/4 v1, 0x3

    aget-object v1, p3, v1

    invoke-direct {v0, v1}, Lcom/xinzhu/haunted/android/app/i$a;-><init>(Ljava/lang/Object;)V

    .line 3
    new-instance v1, Landroid/util/LogPrinter;

    const/4 v2, 0x2

    const-string v3, "ActivityManagerStub"

    invoke-direct {v1, v2, v3}, Landroid/util/LogPrinter;-><init>(ILjava/lang/String;)V

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/xinzhu/haunted/android/app/i$a;->b(Landroid/util/Printer;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
