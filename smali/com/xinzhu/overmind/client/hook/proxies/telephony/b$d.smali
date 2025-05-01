.class Lcom/xinzhu/overmind/client/hook/proxies/telephony/b$d;
.super Lcom/xinzhu/overmind/client/hook/e;
.source "HwTelephonyStub.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xinzhu/overmind/client/hook/proxies/telephony/b;->onBindMethod()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/xinzhu/overmind/client/hook/proxies/telephony/b;


# direct methods
.method constructor <init>(Lcom/xinzhu/overmind/client/hook/proxies/telephony/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xinzhu/overmind/client/hook/proxies/telephony/b$d;->a:Lcom/xinzhu/overmind/client/hook/proxies/telephony/b;

    invoke-direct {p0}, Lcom/xinzhu/overmind/client/hook/e;-><init>()V

    return-void
.end method


# virtual methods
.method protected c()Ljava/lang/String;
    .locals 1

    const-string v0, "getUniqueDeviceId"

    return-object v0
.end method

.method protected d(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/client/frameworks/c;->a()Lcom/xinzhu/overmind/client/frameworks/c;

    move-result-object v0

    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getUserId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/xinzhu/overmind/client/frameworks/c;->b(I)Lcom/xinzhu/overmind/server/os/MindDeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-boolean v1, v0, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;->b:Z

    if-eqz v1, :cond_0

    .line 3
    iget-object p1, v0, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;->d:Ljava/lang/String;

    return-object p1

    .line 4
    :cond_0
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
