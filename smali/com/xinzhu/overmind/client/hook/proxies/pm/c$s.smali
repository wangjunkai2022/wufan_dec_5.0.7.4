.class Lcom/xinzhu/overmind/client/hook/proxies/pm/c$s;
.super Lcom/xinzhu/overmind/client/hook/e;
.source "PackageManagerStub.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xinzhu/overmind/client/hook/proxies/pm/c;
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

    const-string v0, "queryContentProviders"

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
    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getUid()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, p3, p2

    const/4 p1, 0x2

    .line 2
    aget-object p1, p3, p1

    invoke-static {p1}, Lcom/xinzhu/overmind/utils/r;->a(Ljava/lang/Object;)I

    move-result p1

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object p2

    .line 4
    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getVProcessName()Ljava/lang/String;

    move-result-object p3

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v0

    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getUserId()I

    move-result v1

    invoke-virtual {p2, p3, v0, p1, v1}, Lcom/xinzhu/overmind/client/frameworks/g;->u(Ljava/lang/String;III)Ljava/util/List;

    move-result-object p1

    .line 5
    invoke-static {p1}, Lcom/xinzhu/overmind/utils/helpers/h;->a(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
