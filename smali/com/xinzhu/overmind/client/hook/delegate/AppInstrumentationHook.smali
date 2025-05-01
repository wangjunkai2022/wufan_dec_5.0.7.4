.class public final Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;
.super Ljava/lang/Object;
.source "AppInstrumentationHook.java"

# interfaces
.implements Lcom/xinzhu/overmind/client/hook/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;,
        Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;
    }
.end annotation


# static fields
.field private static c:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

.field private static final d:Ljava/lang/String;

.field private static e:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;


# instance fields
.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;-><init>(Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$a;)V

    sput-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->c:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    .line 2
    const-class v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->b:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic b(Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->f()V

    return-void
.end method

.method static synthetic c()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->b:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;
    .locals 1

    .line 1
    sget-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->c:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    return-object v0
.end method

.method private f()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/c;->c()Lcom/xinzhu/overmind/client/hook/c;

    move-result-object v0

    const-class v1, Lcom/xinzhu/overmind/client/hook/proxies/app/b;

    invoke-virtual {v0, v1}, Lcom/xinzhu/overmind/client/hook/c;->b(Ljava/lang/Class;)V

    .line 2
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/c;->c()Lcom/xinzhu/overmind/client/hook/c;

    move-result-object v0

    const-class v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    invoke-virtual {v0, v1}, Lcom/xinzhu/overmind/client/hook/c;->b(Ljava/lang/Class;)V

    return-void
.end method

.method private g(Landroid/app/Instrumentation;)Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;

    .line 2
    iget-object v2, v1, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->root:Landroid/app/Instrumentation;

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public static h()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;
    .locals 2

    .line 1
    sget-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;-><init>()V

    sput-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->i()Landroid/app/Instrumentation;

    move-result-object v0

    .line 2
    instance-of v0, v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public i()Landroid/app/Instrumentation;
    .locals 2

    .line 1
    new-instance v0, Lcom/xinzhu/haunted/android/app/g;

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->mainThread()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/xinzhu/haunted/android/app/g;-><init>(Ljava/lang/Object;)V

    .line 2
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/app/g;->X()Landroid/app/Instrumentation;

    move-result-object v0

    return-object v0
.end method

.method public injectHook()V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->i()Landroid/app/Instrumentation;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;

    if-eqz v1, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AppInstrumentation.injectHook() "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 4
    invoke-direct {p0, v0}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->g(Landroid/app/Instrumentation;)Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;

    move-result-object v1

    if-nez v1, :cond_1

    .line 5
    new-instance v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;

    invoke-direct {v1, p0}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;-><init>(Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;)V

    .line 6
    iput-object v0, v1, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->root:Landroid/app/Instrumentation;

    .line 7
    iget-object v0, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    :cond_1
    new-instance v0, Lcom/xinzhu/haunted/android/app/g;

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->mainThread()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/xinzhu/haunted/android/app/g;-><init>(Ljava/lang/Object;)V

    .line 9
    invoke-virtual {v0, v1}, Lcom/xinzhu/haunted/android/app/g;->o0(Landroid/app/Instrumentation;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
