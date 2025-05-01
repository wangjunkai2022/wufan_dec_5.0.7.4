.class Lcom/join/mgps/fragment/MyArchiveFragment_$o;
.super Lorg/androidannotations/api/a$c;
.source "MyArchiveFragment_.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/MyArchiveFragment_;->z0(Ljava/util/List;ZLcom/join/mgps/fragment/MyArchiveFragment$w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Z

.field final synthetic d:Lcom/join/mgps/fragment/MyArchiveFragment$w;

.field final synthetic e:Lcom/join/mgps/fragment/MyArchiveFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;ZLcom/join/mgps/fragment/MyArchiveFragment$w;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment_$o;->e:Lcom/join/mgps/fragment/MyArchiveFragment_;

    iput-object p6, p0, Lcom/join/mgps/fragment/MyArchiveFragment_$o;->b:Ljava/util/List;

    iput-boolean p7, p0, Lcom/join/mgps/fragment/MyArchiveFragment_$o;->c:Z

    iput-object p8, p0, Lcom/join/mgps/fragment/MyArchiveFragment_$o;->d:Lcom/join/mgps/fragment/MyArchiveFragment$w;

    invoke-direct {p0, p2, p3, p4, p5}, Lorg/androidannotations/api/a$c;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment_$o;->e:Lcom/join/mgps/fragment/MyArchiveFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/MyArchiveFragment_$o;->b:Ljava/util/List;

    iget-boolean v2, p0, Lcom/join/mgps/fragment/MyArchiveFragment_$o;->c:Z

    iget-object v3, p0, Lcom/join/mgps/fragment/MyArchiveFragment_$o;->d:Lcom/join/mgps/fragment/MyArchiveFragment$w;

    invoke-static {v0, v1, v2, v3}, Lcom/join/mgps/fragment/MyArchiveFragment_;->f1(Lcom/join/mgps/fragment/MyArchiveFragment_;Ljava/util/List;ZLcom/join/mgps/fragment/MyArchiveFragment$w;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
