.class Lcom/MApplication$g;
.super Ljava/lang/Object;
.source "MApplication.java"

# interfaces
.implements Lcom/join/android/app/common/http/MiitHelper$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/MApplication;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/MApplication;


# direct methods
.method constructor <init>(Lcom/MApplication;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/MApplication$g;->a:Lcom/MApplication;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, ""

    .line 2
    :cond_0
    sput-object p1, Lcom/MApplication;->I:Ljava/lang/String;

    .line 3
    sget-object p1, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-static {p1}, Lcom/papa/sim/statistic/s;->f(Landroid/content/Context;)Lcom/papa/sim/statistic/s;

    move-result-object p1

    sget-object v0, Lcom/MApplication;->I:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/papa/sim/statistic/s;->u(Ljava/lang/String;)V

    .line 4
    new-instance p1, Ljava/lang/Thread;

    new-instance v0, Lcom/MApplication$g$a;

    invoke-direct {v0, p0}, Lcom/MApplication$g$a;-><init>(Lcom/MApplication$g;)V

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 5
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void
.end method
