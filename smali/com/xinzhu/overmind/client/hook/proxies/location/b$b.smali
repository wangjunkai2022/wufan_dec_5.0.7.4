.class Lcom/xinzhu/overmind/client/hook/proxies/location/b$b;
.super Lcom/xinzhu/overmind/client/hook/e;
.source "LocationManagerStub.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xinzhu/overmind/client/hook/proxies/location/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
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

    const-string v0, "getFromLocationName"

    return-object v0
.end method

.method protected d(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/xinzhu/haunted/android/location/a;->c:Ljava/lang/Class;

    invoke-static {p3, v0}, Lcom/xinzhu/overmind/utils/helpers/c;->a([Ljava/lang/Object;Ljava/lang/Class;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 2
    new-instance v1, Lcom/xinzhu/haunted/android/location/a;

    aget-object v2, p3, v0

    invoke-direct {v1, v2}, Lcom/xinzhu/haunted/android/location/a;-><init>(Ljava/lang/Object;)V

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getHostPkg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/xinzhu/haunted/android/location/a;->k(Ljava/lang/String;)Z

    .line 4
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getHostUid()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/xinzhu/haunted/android/location/a;->l(I)Z

    .line 5
    iget-object v1, v1, Lcom/xinzhu/haunted/android/location/a;->a:Ljava/lang/Object;

    aput-object v1, p3, v0

    .line 6
    :cond_0
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
