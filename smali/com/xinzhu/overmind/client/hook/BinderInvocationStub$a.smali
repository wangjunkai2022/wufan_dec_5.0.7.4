.class Lcom/xinzhu/overmind/client/hook/BinderInvocationStub$a;
.super Lcom/xinzhu/overmind/client/hook/e;
.source "BinderInvocationStub.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;->onBindMethod()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;


# direct methods
.method constructor <init>(Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub$a;->a:Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;

    invoke-direct {p0}, Lcom/xinzhu/overmind/client/hook/e;-><init>()V

    return-void
.end method


# virtual methods
.method protected c()Ljava/lang/String;
    .locals 1

    const-string v0, "asBinder"

    return-object v0
.end method

.method protected d(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub$a;->a:Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;

    invoke-static {p1}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;->access$000(Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;)Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method
