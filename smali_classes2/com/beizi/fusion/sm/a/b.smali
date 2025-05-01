.class public final Lcom/beizi/fusion/sm/a/b;
.super Ljava/lang/Object;
.source "DeviceIdentifier.java"


# static fields
.field private static volatile a:Z

.field private static volatile b:Ljava/lang/String;

.field private static volatile c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Application;)V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/beizi/fusion/sm/a/b;->a:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    const-class v0, Lcom/beizi/fusion/sm/a/b;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-boolean v1, Lcom/beizi/fusion/sm/a/b;->a:Z

    if-nez v1, :cond_1

    .line 4
    invoke-static {p0}, Lcom/beizi/fusion/sm/a/a;->a(Landroid/app/Application;)V

    const/4 p0, 0x1

    .line 5
    sput-boolean p0, Lcom/beizi/fusion/sm/a/b;->a:Z

    .line 6
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
